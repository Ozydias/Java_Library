# Java程序设计作业
## 题目   
数据库编程----简易图书管理系统

## 目的
* 熟练掌握SQL命令
* 掌握Swing图形用户界面编程。
* 掌握java与数据库的连接技术。
* 掌握java.sql包中提供各种类，编写程序实现数据库信息的存取和查询。
* 培养独立查找资料，并解决问题的能力。

## 内容
1、建立一个数据库Library，其中含有如下表格（字段）：
Books（ISBN，Title，Authors，Publisher，EditionNumber，PublicationDate，Type）
Reader（ReaderID，FirstName,LastName，Address，PhoneNumber，Limits）
Record（RecordID，ISBN，ReaderID，BorrowingDate，ReturnDate）
使用的数据库系统可以自由选择。
提前设置好Books，Reader的数据。

2、使用java编程实现如下功能：
（1）用户可通过相应界面，依据图书的ISBN，Title，Authors，Publisher，PublicationDate，Type的组合条件，查询数据库中的符合条件的书籍，程序需将查询结果以表格的方式展示给用户，用户可选择结果排序的依据。
（2）提供用户相应的方式借书。当用户选择借阅某本书籍时，应查询该书是否已经被借出：如果被借出，则显示信息（“该书已被借出，归还时间XXXXX”）；如该书未被借出，则查阅读者权限（是否超出该读者所能借阅的最大数目书籍），如未超出显示借书成功，并向数据库中增加一条借阅记录，如果超出，则显示信息（“已超过您的最大借阅数目）。
（3）提供用户相应的方式还书。还书成功时，将该次的借阅记录删除。

选作部分：
（1）修改数据库设计，通过相应界面，提供Reader、Books的增加、删除、修改功能。
（2）修改数据库设计，可查询某用户的所有借阅记录。
