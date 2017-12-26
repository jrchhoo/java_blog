### 2、Java开发环境搭建

[上篇：1、Java语言概述](https://github.com/wmhou/java_blog/blob/master/JavaSE/Chapter1%20%E6%A6%82%E8%BF%B0/1%E3%80%81Java%E8%AF%AD%E8%A8%80%E6%A6%82%E8%BF%B0.md)

#### 下载安装JDK

1. [Oracle官网下载JDK链接][http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html]

![下载](image/Oracle.png)

2. 下载完成后运行安装JDK，个人喜欢安装在D盘下；

3. JDK安装目录结构：

   ![目录结构](image/project.png)

   - bin：存放工具命令，如javac，java等命令；
   - db：安装JavaDB路径；
   - include：平台特定的头文件；
   - jre：运行Java程序所必须的JRE环境；
   - lib：相关的Jar依赖包；

4. 配置环境变量（Win10为例）：

   1. 依次打开：控制面板——系统和安全——系统——高级系统设置——环境变量——系统变量；

   2. 新建，变量名：JAVA_HOME，变量值：D:\Program Files\Java\jdk1.8.0_131

   3. 找到Path，添加：%JAVA_HOME%\bin（注意分号）

         		![环境变量](image/path.png)]

5. 验证安装：

   快捷键Win+R打开运行——CMD，输入Java运行命令，javac编译命令或Java -version，如下图显示就是安装成功，So easy！！！

   ​	![安装测试](image/testJava.png)

   ​

