# Spring K8s Demo With Postgres as a Database
Le but de ce projet est de montrer commencer mettre en place une application api spring et le deployer avec kubernates

## Test Application in local
l'application contient un fichier docker compose qui permet de le lancer et de le tester
## Kubernetes 

### In local use minikube or docker desktop

### Run Command

```shell
kubectl apply -f ./k8s/secret.yaml
```
```shell
kubectl apply -f ./k8s/config.yaml
```