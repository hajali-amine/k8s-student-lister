build:
	@docker build -t aminehajali/ms$(ms) ./ms$(ms)

push: build
	@docker push aminehajali/ms$(ms)

create-local-cluster:
	@kind create cluster
	@kubectl cluster-info --context kind-kind

delete-local-cluster:
	@kind delete cluster

local-run:
	docker compose up
