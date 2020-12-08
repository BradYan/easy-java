# 开始Java编程零基础入门学习
[toc]

## 一. IntelliJ IDEA下载安装

### 1.1下载

https://www.jetbrains.com/idea/download/

打开链接,下载WIndows安装包或者压缩包.如果是Mac或者Linux-Ubuntu系统,则选择如下图红色标注的按钮.

![01_download](https://upload-images.jianshu.io/upload_images/23305353-15f49e5108cd182a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 1.2 安装IntelliJ IDEA

和安装一般的软件一样,双击下载的安装包,设置安装路径,选择下图创建桌面快捷键.

一路Next结束安装.

![idea_02](https://upload-images.jianshu.io/upload_images/23305353-b4c9bd612a8ea95f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



### 1.3 设置主题

安装好后,第一次打开,需要设置主题.选择你喜欢的颜色主题.这里我为了方便截图的颜色,采用Light.

剩余内容选择使用默认设置.

![idea_03](https://upload-images.jianshu.io/upload_images/23305353-8f1eacf5a15babfa.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 二. 打开IntelliJ IDEA开发工具

安装好后，在系统里双击打开IDEA工具。

第一次打开IDEA开发工具，可以看到如下界面。或者当你关闭所有项目的时候，也会看到这个初始界面。如下图标注，有三种项目打开的方式。

项目就是为了完成某一些特定功能而编写代码的地方，同时对这些代码进行有效的管理。

### 2.1 创建新的项目  

对应下图标记1，意思是你新建一个项目从零开始的项目.

### 2.2 打开/导入一个项目

对应下图标记2，打开已经存在的项目,比如正在开发的项目,从网络上下载下来的项目.

### 2.3 从仓库获取一个项目

对应下图标记3，输入仓库地址,从仓库拉取代码到本地. 一般公司都有自己的代码仓库。我们这里就用网上提供的免费仓库`github.com`或者`gitee.com`。大家可以将这两个网站都注册一下，以后会用。

![idea_04](https://upload-images.jianshu.io/upload_images/23305353-0e282ab6f9252329.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

下面我们基于这三种方式进行演示。

## 三. 创建新的项目

**Create New Project**  , 我们这里是新建项目,选择第一个.新建好的项目,以后再次打开,就使用第二种方式.

如下图所示标记。

### 3.1 设置项目为Maven构建方式

如下图标记1所示,我们选择Maven的构建方式.

Maven的构建,是将代码组合在一起,编译打包成可以运行程序的工具.类似工具还有很多.

Maven是现在的主流构建Java项目的工具.

### 3.2 SDK版本选择

SDK意思是开发工具合集.  JDK是Java编程语言的SDK,缩写JDK.

如下图标记2所示,选择你采用的SDK.(第一次用,点击Download JDK)

图片里的"Project SDK"选项. 选中"Download **JDK**".

JDK有版本的区分, JDK新版本尽量兼容老版本的功能,同时增加新功能.也会去掉一些功能。

我们在开发的时候,尽量选择一个固定的版本,本项目,将会固定在最新的稳定版本openjdk-11版本以及以上版本.

![idea_06](https://upload-images.jianshu.io/upload_images/23305353-6423adb457717dab.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![idea_07](https://upload-images.jianshu.io/upload_images/23305353-151ba36f512daccd.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 3.3 设置项目名和文件路径

我们新建第一个项目,输入Name: hello-world,项目名一般用字母,数字,下划线,减号. 

Location默认和Name保持一致.也可以改.

![idea_08](https://upload-images.jianshu.io/upload_images/23305353-5fd1ee2ee4e4c726.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 3.4 等待Maven自动下载依赖

新建完成后,Maven会自动下载依赖的库,包,插件等. 点击proccesses running 可以查看正在下载的内容.

![idea_10](https://upload-images.jianshu.io/upload_images/23305353-cbdab74c963c4e00.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



## 四.从仓库获取一个项目

Get from Version Control ，从远程仓库拉取项目。

### 4.1 从GitHub网站拉取项目

我们的项目地址如下图标记所示的位置，复制该链接： `https://github.com/BradYan/easy-java.git`

**如果大家觉得这个项目有帮助，欢迎打开网站，点击项目右上角★Star关注,给作者鼓励。**

![004.PNG](https://upload-images.jianshu.io/upload_images/23305353-ed7cac490859c2d2.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)




github上有很多开源的项目。需要的时候就可以来搜索查找，并下载下来。

### 4.2 点击最上图的 Get from Version Control 

复制粘贴填入我们的项目地址URL，如下图标记所示。

此处的Git是版本控制工具，以后需要用的时候教。

### 4.3 点击按钮Clone

如下图标记所示，就会从网络上克隆下载下来。

大概等待几分钟，你就会把easy-java项目下载下来了。


![005.PNG](https://upload-images.jianshu.io/upload_images/23305353-eb1783939cb83336.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


## 五.打开/导入项目

`Open Or Import` 方式。

从别的地方手工拷贝，下载下来的项目，可以用这样的方式打开。

### 5.1 下载本项目

从网址`https://github.com/BradYan/easy-java` 直接下载项目，并解压。如下图所示下载。

![01.PNG](https://upload-images.jianshu.io/upload_images/23305353-a2fd6448307d7c38.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 5.2 打开项目

`Open Or Import` 方式和下图IDEA已经打开一个项目的时候操作是一样的效果。最终都是弹出如图的 Open File or Project 框。

#### 5.2.1 点击File --> open...

如下图标记1所示，点击File --> open...

#### 5.2.2 找到项目的路径

如下图标记2所示,该项目路径是你刚刚下载项目存放的文件路径，或者其它项目的文件路径，和我图中的不一样。

#### 5.3.3 选中pom.xml文件

Java使用Maven构建的项目，都是点击pom.xml文件打开。

#### 5.3.4 点击OK确定

紧接着点击选择pom.xml文件后，点击OK确认。

![10_open](https://upload-images.jianshu.io/upload_images/23305353-a64f84ccfd04f47b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 5.3 Open as Project

确认后，弹出新的对话框，选择如下图所示`Open as Project`.

![11_open_as_project](https://upload-images.jianshu.io/upload_images/23305353-5a96a62eebe5d3d7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 5.4 选择'New Window'

如果是第一次打开项目，可能会弹出如下图所示，我们选择‘New Window’。

![11_new_window](https://upload-images.jianshu.io/upload_images/23305353-67fd81baeb47f8de.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 5.5 等待下载项目的依赖,插件

等待几分钟,下载项目的依赖,插件等.如下图标记1，2所示。

![12_dependency](https://upload-images.jianshu.io/upload_images/23305353-5532bf62ccb6f35d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



## 六. 正式开始Java编程零基础入门学习

在项目中，依次打开如下目录，可以找到本篇文章。

同时按照标题和章节顺序依次往下学习入门基础。

![02.PNG](https://upload-images.jianshu.io/upload_images/23305353-fba77b6bdd79c177.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


### 6.1 快速打开项目中的md文档

如上图,假设想要使用markdown阅读器快速打开该文档, 右键对应的md文档 --> Show in Explorer , 即可弹出文件位置,双击打开阅读.

### 6.2 Typora阅读器的view设置

如下图标记1,需要选择Outline, 可以看到左边的标题导航栏,有助于把握文章位置.并快速定位.

标记2, 一定不要选择Focus Mode, 和 Typewriter Mode , 十分影响阅读.

另外两个选中的没看出效果上有啥大的区别.

![63.png](https://upload-images.jianshu.io/upload_images/23305353-aa24df64d2c0c991.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

