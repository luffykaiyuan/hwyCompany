/*
SQLyog Professional v12.09 (64 bit)
MySQL - 5.7.20 : Database - hwy_company
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hwy_company` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hwy_company`;

/*Table structure for table `idea_info` */

DROP TABLE IF EXISTS `idea_info`;

CREATE TABLE `idea_info` (
  `id` varchar(32) NOT NULL,
  `person_name` varchar(16) DEFAULT NULL COMMENT '提意见的人名',
  `contact_info` varchar(50) DEFAULT NULL COMMENT '提意见人的联系方式',
  `content` varchar(500) DEFAULT NULL COMMENT '意见内容',
  `add_time` varchar(100) DEFAULT NULL COMMENT '添加时间',
  `delete_status` varchar(10) DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `news_info` */

DROP TABLE IF EXISTS `news_info`;

CREATE TABLE `news_info` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `news_title` varchar(32) DEFAULT NULL COMMENT '新闻标题',
  `news_content` varchar(4000) DEFAULT NULL COMMENT '新闻内容',
  `add_time` varchar(100) DEFAULT NULL COMMENT '添加时间',
  `delete_status` varchar(10) DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
