FROM golang:1.18 as build
WORKDIR /app/server
COPY ./go.mod .
COPY ./go.sum .
RUN go mod download
COPY . .
# cgo is enables cross-compilation
RUN CGO_ENABLED=0 go build main.go

FROM alpine:latest as server
WORKDIR /app/server
COPY --from=build /app/server/main ./
RUN chmod +x ./main
ENV DS_HOST=localhost:8080
ENV HOST=0.0.0.0
ENV PORT=5000
EXPOSE ${PORT}
CMD [ "./main" ]