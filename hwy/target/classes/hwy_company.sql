/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : hwy_company

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-11-18 10:57:21
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `idea_info`
-- ----------------------------
DROP TABLE IF EXISTS `idea_info`;
CREATE TABLE `idea_info` (
  `id` varchar(32) NOT NULL,
  `person_name` varchar(16) DEFAULT NULL COMMENT '提意见的人名',
  `contact_info` varchar(50) DEFAULT NULL COMMENT '提意见人的联系方式',
  `content` varchar(500) DEFAULT NULL COMMENT '意见内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of idea_info
-- ----------------------------
INSERT INTO idea_info VALUES ('bc2bd5e8ae0840438e4b22c1c38601ba', '测试', '测试', '测试');
INSERT INTO idea_info VALUES ('cc20d2c09e1d46ffab4e88083c87b3c7', '邮件发送测试姓名', '邮件发送测试电话', '邮件发送测试内容');

-- ----------------------------
-- Table structure for `news_info`
-- ----------------------------
DROP TABLE IF EXISTS `news_info`;
CREATE TABLE `news_info` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `news_title` varchar(32) DEFAULT NULL COMMENT '新闻标题',
  `news_content` varchar(4000) DEFAULT NULL COMMENT '新闻内容',
  `add_time` varchar(100) DEFAULT NULL COMMENT '添加时间',
  `delete_status` varchar(10) DEFAULT NULL COMMENT '删除状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_info
-- ----------------------------
INSERT INTO news_info VALUES ('171b779dac5b4cb38c58856a7ef43ddc', '延时测试', '<p>延时测试</p>', '2019-11-18', '0');
INSERT INTO news_info VALUES ('26f34c36c2704bd2bc9e6bee53a74892', '字段测试', '<p>字段测试</p>', '2019-11-18', '0');
INSERT INTO news_info VALUES ('acbba6a1475c41beae6281f23ddc3fce', '保存测试2', '<p>保存测试<img src=\"http://localhost:8080/hwyCompany/upload/img/white.jpg\" style=\"max-width: 100%;\"></p><p><br></p>', '2019-11-18', '0');
INSERT INTO news_info VALUES ('b31b1f708f7d4939850944888631a773', '测试保存', '<p>测试保存</p><p><br></p>', '2019-11-18', '0');
INSERT INTO news_info VALUES ('dc79d77cf89245a39b4b68085c46008f', '跳转测试', '<p>跳转测试</p><p><br></p>', '2019-11-18', '0');
INSERT INTO news_info VALUES ('eb8f270ca5a44755b5f19c9e7c2d7923', '跳转测试2', '<p>跳转测试2</p><p><br></p>', '2019-11-18', '0');
