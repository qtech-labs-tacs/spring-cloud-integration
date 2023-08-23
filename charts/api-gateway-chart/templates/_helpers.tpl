{{- define "dev.labels" -}}
app: microservice-1
env: {{ .Values.app.env }}
{{- end -}}
