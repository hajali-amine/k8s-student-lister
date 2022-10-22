build:
	@docker build -t aminehajali/ms$(ms) ./ms$(ms)

push: build
	@docker push aminehajali/ms$(ms)
