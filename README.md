# SA2
大三上，软件体系结构实验2——经典软件体系结构风格

## 学生信息

- 学号：202131060724
- 姓名：鲁昕曈
- 班级：软件工程21级4班
- 指导老师：陈汶滨

## 介绍

### 实验任务
1. 仔细阅读文献 [主程序-子程序、面向对象、事件系统和管道-过滤软件体系结构实现KWIC]([https://markdown.com.cn](https://blog.csdn.net/weixin_43853097/article/details/110943379?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-110943379-blog-82871259.t5_download_50w&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-110943379-blog-82871259.t5_download_50w&utm_relevant_index=1))
2. 实现文献中的所有程序并调试通过。
3. 参考和整合以上参考文献，开发“经典软件体系结构教学软件”，用于向用户展示**主程序-子程序、面向对象、事件系统和管道-过滤器**软件体系结构风格的基本原理。软件功能及界面可自由设计，但应包括如下内容：
  - 用户可选择四种方法之一对指定的输入文件进行处理，结果可显示在界面上；
  - 能够分别显示各种“体系结构风格”的**原理图或文字说明、源程序代码结构、关键函数的程序代码等**。

> 这个是任务 2 和任务 3 的代码集合，任务 3 是 src 目录下 MyKWIC 软件包，任务二是其他四个 src 目录下的软件包。其中任务三只是一个 UI 界面，调用的是任务二的代码实现的功能。

### 软件架构
该架构总体为一个完整的 JAVA 项目，通过 JDK1.8 开发，开发工具为 Intellij IDEA 2023.2.4，可以直接点击运行。

### 运行教程
在空文件夹下克隆项目，并用 Intellij IDEA 打开该文件夹，可以直接运行。

### 使用说明
找到项目的 src/MyKWIC 目录下的 input.txt 文件，在其中输入想要测试的字符串，例如 "This is Lu Xintong's code program"，ctrl+s 保存。
打开 src 目录下的某一个包（共五个），打开包中的测试类，右键运行，在 output.txt 文件里面查看结果。

### 备注
> src目录下除了MyKWIC包的另外四个包里的 input.txt 和 output.txt 是任务 2 的输入和输出结果。做任务三后我调整了四个包里main函数的 input.txt 和 output.txt 文件的路径，在MyKWIC程序里共用相同的input.txt 和 output.txt，以此达到统一。
