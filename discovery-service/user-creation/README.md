#### RBAC in k8s cluster

STEP 1: Generating private key for John (john.key)

```
openssl genrsa -out john.key 2048
```

STEP 2: Generating certificate signing request (john.csr)

```
openssl req -new -key john.key -out john.csr -subj "/CN=john/O=finance"
```

STEP 3: Copy kubernetes ca certificate and key from the master node kmaster

```
cp /Users/aamirqureshi/.minikube/ca.{crt,key} .
```

STEP 4: Sign the certificate using certificate authority

```
openssl x509 -req -in john.csr -CA ca.crt -CAkey ca.key -CAcreateserial -out john.crt -days 365
```


Steps to create custom kubeconfig file for user

Set Cluster

```
kubectl --kubeconfig john.kubeconfig config set-cluster kubernetes --server https://127.0.0.1:50350 --certificate-authority=ca.crt
```

Set Credentials

```
kubectl --kubeconfig john.kubeconfig config set-credentials john --client-certificate ./john.crt --client-key ./john.key  --certificate-authority=ca.crt
```

Set Context

```
kubectl --kubeconfig john.kubeconfig config set-context john-kubernetes --cluster kubernetes --namespace finance --user john
```


Create namespace 

```
kubectl create namespace finance
```


Command to get pods in finance namespace

```
kubectl --kubeconfig john.kubeconfig -n finance get po 
```


Help Commands

```
kubectl create role --help | grep kubectl 
```


Create Role for John

```
kubectl create role john-finance --verb=get,list --resource=pods --namespace finance
```


Print Role on console

```
kubectl -n finance get role john-finance -o yaml
```


Create RoleBinding for John

```
kubectl create rolebinding john-finance-rolebinding --role=john-finance --user=john --namespace finance
```

Pring RoleBinding on console

```
kubectl -n finance get rolebinding john-finance-rolebinding -o yaml
```






