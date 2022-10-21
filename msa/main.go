package main

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
	types "microservice-a/server/types"
	utils "microservice-a/server/utils"
	"net/http"
	"os"

	"github.com/gin-gonic/gin"
)

func main() {
	r := gin.Default()
	var dataServerHost string = utils.GetEnv("DS_HOST", "localhost:8080")

	r.GET("/", func(c *gin.Context) {
		name := c.DefaultQuery("name", "")
		class := c.DefaultQuery("class", "")
		option := c.DefaultQuery("option", "")
		group := c.DefaultQuery("1", "0")

		requestURL := fmt.Sprintf(
			"http://%s/students?name=%s&class=%s&option=%s&group=%s",
			dataServerHost,
			name,
			class,
			option,
			group,
		)

		res, err := http.Get(requestURL)
		if err != nil {
			fmt.Printf("error making http request: %s\n", err)
			os.Exit(1)
		}

		resBody, err := ioutil.ReadAll(res.Body)
		if err != nil {
			fmt.Printf("could not read response body: %s\n", err)
			os.Exit(1)
		}

		students := []types.Student{}
		err = json.Unmarshal(resBody, &students)
		if err != nil {
			fmt.Printf("could not read unmarshal body: %s\n", err)
			os.Exit(1)
		}

		c.JSON(http.StatusOK, students)
	})

	var serverHost string = utils.GetEnv("HOST", "localhost")
	var serverPort string = utils.GetEnv("PORT", "5000")
	r.Run(fmt.Sprintf("%s:%s", serverHost, serverPort))
}
