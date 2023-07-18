#!/bin/sh

exec java ${JVM_OPTS} -Djava.security.egd=file:/dev/./urandom -javaagent:opentelemetry-javaagent-all.jar -Dotel.exporter=jaeger -Dotel.exporter.jaeger.endpoint=jaeger-collector.istio-system.svc.cluster.local:14250 -jar ${APP_NAME}.jar --spring.config.name=application
