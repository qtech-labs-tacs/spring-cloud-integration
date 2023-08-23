### Kubernetes



#### Service Account

A ServiceAccount is used by containers running in a Pod, to communicate with the API server of the Kubernetes cluster.


```
kubectl get sa --all-namespaces | grep default
```


```
kubectl get sa default -o yaml
```