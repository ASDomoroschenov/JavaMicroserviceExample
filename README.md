# JavaMicroserviceExample
Пример небольшого микросервисного приложения с использованием SpringCloudConfig + Actuator + Eureka
# config-server
host: localhost \
port: 8071 \
cloud.config.server.git.uri: https://github.com/ASDomoroschenov/ServerCloudConfig.git \
configs:
- eureka-server.yml
- licensing-service.properties
- licensing-service-dev.properties
- organization-service.properties
- organization-service-dev.properties
# eureka-server
host: localhost \
port: 8070 \
defaultZone: http://localhost:8070/eureka \
checkApps: http://localhost:8070/eureka/apps
# licensing-service
host: localhost \
port: 8080 \
enableDiscovery: true
# organization-service
host: localhost \
port: 8081
# Пример вызова одной службы из другой
Для того чтобы увидеть, как служба licensing-service вызывает службу organization-service необходимо сделать GET запрос по адресу https://localhost:8080/v1/organization/{organizationId}/license//{licenseId}/{clientType} \
В зависимости от clientType для обращения к службе будет использоваться либо Discovery Cleint, либо REST API \
licensing-service обращаясь к Eureka, либо своему кешу обнаружит instance службы organization-service и узнает ее местоположение, по которому к ней можно обратиться
