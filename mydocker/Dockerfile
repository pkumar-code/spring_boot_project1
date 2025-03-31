From tomcat:8.5.12
MAINTAINER "Srinivas Dande"

ENV JLC_MYSQL_HOST jlc-mysql
ENV JLC_MYSQL_PORT 3306
ENV JLC_MYSQL_DATABASE myjlcbs
ENV JLC_MYSQL_USER root
ENV JLC_MYSQL_PASSWORD kumar123

RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/myjlcbs.war /usr/local/tomcat/webapps

EXPOSE 8080
CMD ["catalina.sh","run"]
