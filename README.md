#Java系列教程

本系列教程分为两个部分：基础篇和提高篇。

## 基础篇

位于guide目录，文件和目录列表如下：
* code：示例代码
* imgs：本书用到的图片，大多数图片包含dia源文件
* *.lyx：本教材各章节lyx源代码，其中的java-guide-on-c.lyx为主控文件。
* preamble.tex：Lyx的导言设置，在这里设置纸张大小、代码列表的样式等。这些也
可以在Lyx的图形用户界面设置，但是通过导言设置便于大型文档的组织。
* frontmatter.tex：前言的latex源代码
* cover.svg：封面，使用inkscape编辑而成

## 提高篇

位于advanced目录，文件和目录列表如下：
* code：示例代码
* imgs：本书用到的图片，大多数图片包含dia源文件
* *.lyx：本教材各章节lyx源代码，其中的java-advanced.lyx为主控文件。
* preamble.tex：Lyx的导言设置，在这里设置纸张大小、代码列表的样式等。这些也
可以在Lyx的图形用户界面设置，但是通过导言设置便于大型文档的组织。
* frontmatter.tex：前言的latex源代码
* cover.svg：封面，使用inkscape编辑而成

# 为什么选用Lyx编写本书？

本系列教材是写给程序员或者未来的程序员读的，程序员要求有很高的抽象思维和
逻辑思维能力，word之流只能培养乱写乱画的能力，所以，Lyx是编写计算机类图书
的首选工具:-)。

其实上手Lyx很容易，相信用过的都会爱不释手。Lyx自带的用户指南简洁实用，
关于使用Lyx的一些经验教训，您也可以参考博客：http://dz.sdut.edu.cn/blog/subaochen/category/lyxlatex/

# 如何参与

## 如何提交PR

提交PR的常规步骤是：

1. 在本项目提交一个issue，说明你要做什么样的修改。
1. fork本项目，然后git clone你fork出来的项目到你的本地。
1. 最好在你的本地执行
`
git remote add upstream https://github.com/subaochen/java-tutorial
`
以方便更新本项目的最新内容到你的本地。
1. 在本地做修改，修改完成提交到你fork出来的项目中。
1. 到你的github找到fork出来的项目，可以看到create PR的按钮，创建一个PR即可。
注意创建PR的时候，最好使用这样的标题：
`
ISSUE#123：修正xxxx问题
`
方便作者了解PR的用途。
1. 等待作者审核PR。作者也许会直接merge，也许会针对PR中的内容给出反馈意见，
您可以就反馈意见进一步修改后直接提交到你fork出来的项目即可，作者会在PR页面
同步看到你的修改。只要这个PR没有关闭，你可以一直提交修改，直到这个PR被关闭
或者merge进来为止。
1. PR关闭或者merge后，作者会关闭相应的issue，这个PR流程就算结束了。

在提交之前，请注意以下几个问题：

* 最好执行一下本项目提供的clean.sh脚本，清理一下一些不必要的文件后再commit。
* 尽量在commit之前使用git status检查一下，尽量不要使用git commit -a这个命令。
* 不要提交code目录下的任何out子目录，这是idea保存二进制代码的目录，没有必要
提交上来。


## 如何搭建书写环境

如果您仅仅是为了阅读，请下载本项目，到相应目录下执行./makebook.sh即可生成
相应的pdf文件。在阅读本书过程中，您遇到任何问题或者有任何建议、意见，欢迎
提交issue或者邮件联系作者。

如果您希望共同完善本教程，请继续往下读。

本教程使用lyx 2.2+编写，搭建书写环境的步骤是：
 * 建议安装Linux环境，作者是在Linux环境下编写本书的。
 * 安装textlive最新版和lyx 2.2+（目前ubuntu 16.10自带的Lyx版本是2.1，
到Lyx官网：http://www.lyx.org 下载最新的2.2+版本安装即可）。
 * fork本项目，clone项目到本地。
 * fork writing-common项目，clone项目到本地。
 * 修改Lyx的TEXINPUTS设置，方法是从“工具”菜单找到“首选项“，然后在“路径”的TEXINPUTS中设置为“.:$HOME/git/writing-common”（假设writing-common项目clone到了$HOME/git/writing-common目录）
 * 执行common中的deploy.sh脚本安装lyx的几个模块，然后启动lyx，点击“工具”->"重配置"，重启lyx
 * lyx java-guide-on-c.lyx（基础篇），或者lyx java-advanced.lyx（提高篇），
 即可开始愉快的写作:-)
 * 执行./makebook.sh可以生成本书的pdf文件（包含封面），请到上一级目录查看生成的pdf文件。
 如果只是日常编辑的话，这一步可以忽略。
 * 提交PR或者issue。
 * 写作中遇到Lyx的使用问题，欢迎联系 subaochen@126.com，或者访问 
 http://dz.sdut.edu.cn/blog/subaochen ，本人非常乐意分享Lyx的使用心得。

建议打开Lyx的“视图->outline pane”，这样在总控文件中点击章节即可自动
打开相应章节的lyx文件进行编辑了，非常方便。

## 管理参考文献

本系列教程的参考文献使用BibTex( www.bibtex.org )，在common目录下的java.bib和
other.bib分别是Java相关的参考文献以及其他参考文献。可以手工编写BibTex文件，
也可以使用jabref( http://www.jabref.org )管理参考文献，很方便。

在插入参考文献时，采用类似如下的格式[4,p101,人工智能的未来]，其中：

* 4 表示参考文献列表的第4项，这个由Latex自动产生。
* p101 表示引用文献的第101页，这需要在添加文献引用的时候明确说明，
在Lyx中，需要在“文字后”的文本框填写。
* “人工智能的未来”，是所引用文献的标题，如果存在的话。如果不需要引用标题则
这个区域可以忽略。

happy writting now:-)
