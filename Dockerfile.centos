#第一行必须指令基于的基础镜像
From ubutu

#维护者信息
MAINTAINER docker_user  docker_user@mail.com

#镜像的操作指令
apt/sourcelist.list

RUN apt-get update && apt-get install -y ngnix 
RUN echo "\ndaemon off;">>/etc/ngnix/nignix.conf

#容器启动时执行指令
CMD /usr/sbin/ngnix
