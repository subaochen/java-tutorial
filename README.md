#Java系列教程

本系列教程分为两个部分：基础篇和提高篇。

## 基础篇

位于guide目录，文件和目录列表如下：
* code：示例代码
* imgs：本书用到的图片，大多数图片包含dia源文件
* *.lyx：本教材各章节lyx源代码，其中的java-guide-on-c.lyx为主控文件。
* frontmatter.tex：前言的latex源代码
* cover.svg：封面，使用inkscape编辑而成

## 提高篇

位于advanced目录，文件和目录列表如下：
* code：示例代码
* imgs：本书用到的图片，大多数图片包含dia源文件
* *.lyx：本教材各章节lyx源代码，其中的java-advanced.lyx为主控文件。
* frontmatter.tex：前言的latex源代码
* cover.svg：封面，使用inkscape编辑而成


# 如何参与

如果您仅仅是为了阅读，请下载本项目，到相应目录下执行./makebook.sh即可生成
相应的pdf文件。在阅读本书过程中，您遇到任何问题或者有任何建议、意见，欢迎
提交issue或者邮件联系作者。

如果您希望共同完善本教程，请继续往下读。

本教程使用lyx 2+编写，搭建书写环境的步骤是：
 * 建议安装Linux环境，作者是在Linux环境下编写本书的。
 * 安装textlive最新版和lyx 2+。
 * fork本项目，clone项目到本地。
 * 执行common中的deploy.sh脚本安装lyx的几个模块，然后启动lyx，点击“工具”->"重配置"，重启lyx
 * lyx java-guide-on-c.lyx（基础篇），或者lyx java-advanced.lyx（提高篇），
 即可开始愉快的写作:-)
 * 执行./makebook.sh可以生成本书的pdf文件（包含封面），请到上一级目录查看生成的pdf文件。
 如果只是日常编辑的话，这一步可以忽略。
 * 提交PR或者issue。

  happy writting now:-)
