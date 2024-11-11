<div align=center>
    <img src="./ptcl.png">
    <br /><br />
</div>

# 💎 PTCL 启动器 💎

[English](README.md) | 中文

## 简介
PTCL 是一个免费的 Minecraft 启动器。
现在，我们已经制作了几个 alpha 测试版
你可以去下载它。如果你试一试，你会想：什么？这是我的世界启动器？
是的，现在我们只添加一个屏幕和一些选项卡
但是，我们知道，PTCL 总有一天会发展成像 HMCL 一样好的！
那么，你可以等待我们完成启动器吗？
如果可以，就静静地等待
如果你不能，那你现在就可以走了

## 给我们更多
您可以在我们的 issues 中发送一些你看到的 bug 或在issue 中给我们一些帮助

## 如何构建？
### 你需要安装 Git

### 1. 使用脚本构建

#### 1.Linux, Mac
1. 在终端输入: 

```bash
git clone https://github.com/lucheshidi/Plateau-Craft-Launcher.git
```
2. 完成后，输入:

```bash
cd ./Plateau-Craft-Launcher
./build
```
终端便会开始自动构建

构建完成后，根据输出即可找到jar文件

#### 2.Windows, DOS
1. 在终端输入: 
    
```bash
git clone https://github.com/lucheshidi/Plateau-Craft-Launcher.git
```
2. 完成后，输入:

```bash
cd Plateau-Craft-Launcher
build.bat
```
终端便会自动构建
 
构建完成后，根据输出即可找到jar文件

### 2.手动构建
#### 你需要安装 maven
1. 检查你的Git 和 maven

2. 选择构建启动器的位置

3. 按右键，然后按“Open Git Bash here”

4. 输入: 

```bash
git clone https://github.com/lucheshidi/Plateau-Craft-Launcher-Command.git
```
5. 完成后，该文件夹将生成一个名为：Plateau-Craft-Launcher-common 的文件夹

6. 现在你可以打开 git bash 到 Plateau-Craft-Launcher-common 文件夹，输入“./mvnw clean package”

7. 转到新文件夹的 “target” 文件夹，会有一个 Jar 文件，打开他然后就可以使用命令行玩游戏了~ :)


## 谢谢~
