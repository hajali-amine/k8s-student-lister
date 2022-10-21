package types

type Student struct {
	Name   string `json:"name"`
	Class  string `json:"class"`
	Option Option `json:"option"`
	Group  int8   `json:"group"`
}
