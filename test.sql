/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.6.24 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test`;

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '主键',
  `usercode` varchar(400) COLLATE utf8_bin NOT NULL COMMENT '用户名',
  `username` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '用户姓名',
  `password` varchar(400) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `gender` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '性别',
  `birth` date DEFAULT NULL COMMENT '出生年月日',
  `cradnum` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '身份证号',
  `tel` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '联系电话',
  `mail` varchar(400) COLLATE utf8_bin DEFAULT NULL COMMENT '邮箱',
  `remark` varchar(4000) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `type` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '类型 0:管理员 1:普通用户',
  `deleteflag` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '删除状态',
  `recordstatus` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '记录状态',
  `inputuser` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '录入人',
  `inputdatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '录入时间',
  `modifyuser` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `modifytime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户表';

/*Data for the table `sys_user` */

insert  into `sys_user`(`id`,`usercode`,`username`,`password`,`gender`,`birth`,`cradnum`,`tel`,`mail`,`remark`,`type`,`deleteflag`,`recordstatus`,`inputuser`,`inputdatetime`,`modifyuser`,`modifytime`) values ('2','admin','管理员','1',NULL,NULL,NULL,'1',NULL,NULL,'0',NULL,NULL,NULL,'2016-04-06 00:46:40',NULL,'2016-04-06 00:46:40'),('3','test','测试',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,'2016-04-05 22:02:11',NULL,'2016-04-05 22:02:11'),('651bf02bfa0c4337a32afdfa1e35963a','sunwufan','孙悟饭','1',NULL,NULL,NULL,NULL,NULL,NULL,'1',NULL,NULL,NULL,NULL,NULL,NULL),('cb289e085d224d8f840a45a2ff7fb0ad','sunwukong','孙悟空','1',NULL,NULL,NULL,NULL,NULL,NULL,'1',NULL,NULL,NULL,'2016-04-05 23:47:07',NULL,'2016-04-05 23:47:07');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
