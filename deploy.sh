#!/bin/bash
# 指定SENS的根目录，请按实际修改
INTLOCK_DIR="/ichibansho"
JAR_DIR="/data/jdk/jdk1.8.0_231"
time=$(date "+%Y%m%d-%H%M%S")
# 进入SENS根目录
cd $INTLOCK_DIR
# 拉取最新的源码
git pull
#echo "代码拉取完毕！"
#复制jar包
cp $INTLOCK_DIR/jinxiu-admin/target/jinxiu-admin.jar $JAR_DIR/jar/$time.jar
# 停止SENS
sh $INTLOCK_DIR/jx.sh stop
# 设置环境变量，执行打包
mvn clean package -Dmaven.test.skip=true
echo "代码打包完毕！"
# 进入打包好的SENS目录
cd $INTLOCK_DIR
# 运行SENS
sh $INTLOCK_DIR/jx.sh start
echo "部署完毕，Enjoy！"
