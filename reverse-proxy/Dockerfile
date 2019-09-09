FROM envoyproxy/envoy-alpine

EXPOSE 8080
EXPOSE 9901

ADD reverse-proxy.yaml /etc/reverse-proxy.yaml

ENTRYPOINT [ "/usr/local/bin/envoy", "-c", "/etc/reverse-proxy.yaml", "--service-cluster reverse-proxy" ]
