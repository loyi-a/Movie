/*
Navicat MySQL Data Transfer

Source Server         : local_mysql
Source Server Version : 50744
Source Host           : localhost:3306
Source Database       : movie

Target Server Type    : MYSQL
Target Server Version : 50744
File Encoding         : 65001

Date: 2025-01-14 12:06:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin_info
-- ----------------------------
DROP TABLE IF EXISTS `admin_info`;
CREATE TABLE `admin_info` (
  `ADMIN_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ADMIN_NAME` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ADMIN_PASS` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ADMIN_QX` int(10) DEFAULT NULL,
  `ADMIN_S` int(10) DEFAULT NULL,
  PRIMARY KEY (`ADMIN_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of admin_info
-- ----------------------------
INSERT INTO `admin_info` VALUES ('1', 'Admin1!', '123123', '1', '1');
INSERT INTO `admin_info` VALUES ('2', 'Admin2!', '123123', '2', '1');
INSERT INTO `admin_info` VALUES ('3', 'Admin3!', '123123', '3', '1');
INSERT INTO `admin_info` VALUES ('4', 'Admin4!', '123123', '4', '1');

-- ----------------------------
-- Table structure for dy_info
-- ----------------------------
DROP TABLE IF EXISTS `dy_info`;
CREATE TABLE `dy_info` (
  `DY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DY_NAME` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DY_SY` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `DY_MONEY` decimal(10,2) DEFAULT NULL,
  `DY_DATE` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DY_S` int(10) DEFAULT NULL,
  `DY_WZ` int(10) DEFAULT NULL,
  PRIMARY KEY (`DY_ID`),
  UNIQUE KEY `DY_NAME` (`DY_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of dy_info
-- ----------------------------
INSERT INTO `dy_info` VALUES ('1', '银河护卫队', '2025-01-14', '52.00', '13:00-14:50', '1', '20');
INSERT INTO `dy_info` VALUES ('2', '复仇者联盟', '2025-01-14', '53.00', '13:00-14:50', '1', '20');
INSERT INTO `dy_info` VALUES ('3', '钢铁侠', '2025-01-14', '54.00', '13:00-14:50', '1', '20');
INSERT INTO `dy_info` VALUES ('4', '阿凡达', '2025-01-14', '55.00', '13:00-14:50', '1', '20');
INSERT INTO `dy_info` VALUES ('5', '美国队长1', '2025-01-14', '56.00', '13:00-14:50', '1', '20');
INSERT INTO `dy_info` VALUES ('8', '美国队长2', '2025-01-14', '55.00', '13:00-14:50', '1', '20');
INSERT INTO `dy_info` VALUES ('9', '蜘蛛侠1', '2025-01-14', '55.00', '13:00-14:50', '1', '20');
INSERT INTO `dy_info` VALUES ('10', '蜘蛛侠2', '2025-01-14', '55.00', null, null, null);

-- ----------------------------
-- Table structure for log_info
-- ----------------------------
DROP TABLE IF EXISTS `log_info`;
CREATE TABLE `log_info` (
  `LOG_ID` int(11) NOT NULL AUTO_INCREMENT,
  `LOG_INFO` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LOG_DATE` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LOG_NAME` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`LOG_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of log_info
-- ----------------------------
INSERT INTO `log_info` VALUES ('1', '添加用户：', '2024-09-24 11:59:43', 'Admin1');
INSERT INTO `log_info` VALUES ('2', '查询用户', '2024-09-24 11:59:58', 'Admin1');
INSERT INTO `log_info` VALUES ('3', '查询用户', '2024-09-24 21:22:05', 'Admin1');
INSERT INTO `log_info` VALUES ('4', '查询用户', '2024-09-24 21:32:08', 'Admin1');
INSERT INTO `log_info` VALUES ('5', '查询用户', '2024-09-24 21:39:36', 'Admin1');
INSERT INTO `log_info` VALUES ('6', '删除用户：2', '2024-09-24 21:39:56', 'Admin1');
INSERT INTO `log_info` VALUES ('7', '查询电影', '2024-09-24 23:42:06', 'Admin2');
INSERT INTO `log_info` VALUES ('8', '添加电影：', '2024-09-24 23:43:45', 'Admin2');
INSERT INTO `log_info` VALUES ('9', '查询电影', '2024-09-24 23:43:48', 'Admin2');
INSERT INTO `log_info` VALUES ('10', '删除电影：6', '2024-09-24 23:44:20', 'Admin2');
INSERT INTO `log_info` VALUES ('11', '查询电影', '2024-09-24 23:44:23', 'Admin2');
INSERT INTO `log_info` VALUES ('12', '查询电影', '2024-09-24 23:45:37', 'Admin2');
INSERT INTO `log_info` VALUES ('13', '查询电影', '2024-09-24 23:56:45', 'Admin2');
INSERT INTO `log_info` VALUES ('14', '添加电影：11111', '2024-09-24 23:57:05', 'Admin2');
INSERT INTO `log_info` VALUES ('15', '查询电影', '2024-09-24 23:57:08', 'Admin2');
INSERT INTO `log_info` VALUES ('16', '修改电影：7 为 11111', '2024-09-24 23:58:10', 'Admin2');
INSERT INTO `log_info` VALUES ('17', '查询电影', '2024-09-24 23:58:18', 'Admin2');
INSERT INTO `log_info` VALUES ('18', '删除电影：7', '2024-09-25 00:00:04', 'Admin2');
INSERT INTO `log_info` VALUES ('19', '查询电影', '2024-09-25 00:00:07', 'Admin2');
INSERT INTO `log_info` VALUES ('20', '查询电影', '2024-09-25 00:23:36', 'Admin2');
INSERT INTO `log_info` VALUES ('21', '添加电影：1111', '2024-09-25 00:23:51', 'Admin2');
INSERT INTO `log_info` VALUES ('22', '查询电影', '2024-09-25 00:23:53', 'Admin2');
INSERT INTO `log_info` VALUES ('23', '下架电影：11', '2024-09-25 00:24:28', 'Admin2');
INSERT INTO `log_info` VALUES ('24', '修改电影：8 为 11', '2024-09-25 00:24:28', 'Admin2');
INSERT INTO `log_info` VALUES ('25', '查询电影', '2024-09-25 00:24:31', 'Admin2');
INSERT INTO `log_info` VALUES ('26', '添加用户：', '2024-09-25 14:06:33', 'Admin1');
INSERT INTO `log_info` VALUES ('27', '查询用户', '2024-09-25 14:06:41', 'Admin1');

-- ----------------------------
-- Table structure for my_order
-- ----------------------------
DROP TABLE IF EXISTS `my_order`;
CREATE TABLE `my_order` (
  `ORDER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ORDER_DY_ID` int(11) DEFAULT NULL,
  `ORDER_USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of my_order
-- ----------------------------
INSERT INTO `my_order` VALUES ('1', '1', '1');
INSERT INTO `my_order` VALUES ('11', '1', '1');
INSERT INTO `my_order` VALUES ('12', '1', '1');
INSERT INTO `my_order` VALUES ('13', '1', '1');
INSERT INTO `my_order` VALUES ('14', '1', '1');
INSERT INTO `my_order` VALUES ('15', '1', '1');
INSERT INTO `my_order` VALUES ('16', '1', '1');
INSERT INTO `my_order` VALUES ('17', '1', '2');

-- ----------------------------
-- Table structure for my_order_info
-- ----------------------------
DROP TABLE IF EXISTS `my_order_info`;
CREATE TABLE `my_order_info` (
  `ORDERINFO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ORDER_ID` int(11) DEFAULT NULL,
  `ORDER_ZW` int(20) DEFAULT NULL,
  `ORDER_S` int(11) DEFAULT NULL,
  `ORDER_DATE` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ORDERINFO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of my_order_info
-- ----------------------------
INSERT INTO `my_order_info` VALUES ('1', '1', '2', '3', '2024-09-24 11:27:07');
INSERT INTO `my_order_info` VALUES ('2', '1', '3', '3', '2024-09-24 11:27:07');
INSERT INTO `my_order_info` VALUES ('3', '1', '2', '3', '2024-09-24 18:00:19');
INSERT INTO `my_order_info` VALUES ('4', '1', '3', '3', '2024-09-24 18:00:19');
INSERT INTO `my_order_info` VALUES ('5', '1', '4', '3', '2024-09-24 19:09:43');
INSERT INTO `my_order_info` VALUES ('6', '1', '5', '3', '2024-09-24 19:09:43');
INSERT INTO `my_order_info` VALUES ('7', '1', '2', '3', '2024-09-24 19:28:24');
INSERT INTO `my_order_info` VALUES ('8', '1', '3', '3', '2024-09-24 19:28:24');
INSERT INTO `my_order_info` VALUES ('9', '1', '4', '3', '2024-09-24 19:28:42');
INSERT INTO `my_order_info` VALUES ('10', '1', '5', '3', '2024-09-24 19:28:42');
INSERT INTO `my_order_info` VALUES ('11', '1', '2', '3', '2024-09-24 20:35:05');
INSERT INTO `my_order_info` VALUES ('12', '1', '3', '3', '2024-09-24 20:35:05');
INSERT INTO `my_order_info` VALUES ('13', '1', '2', '1', '2024-09-25 00:38:52');
INSERT INTO `my_order_info` VALUES ('14', '1', '3', '1', '2024-09-25 00:38:52');
INSERT INTO `my_order_info` VALUES ('15', '1', '4', '1', '2024-09-25 14:03:59');
INSERT INTO `my_order_info` VALUES ('16', '1', '5', '1', '2024-09-25 14:03:59');

-- ----------------------------
-- Table structure for my_user
-- ----------------------------
DROP TABLE IF EXISTS `my_user`;
CREATE TABLE `my_user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `USER_PASS` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`USER_ID`),
  UNIQUE KEY `USER_NAME` (`USER_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of my_user
-- ----------------------------
INSERT INTO `my_user` VALUES ('1', 'A123!', '123123');
INSERT INTO `my_user` VALUES ('2', 'B123!', '123123');
INSERT INTO `my_user` VALUES ('6', 'C123!', '123123');
INSERT INTO `my_user` VALUES ('7', 'D123！', '123123');
INSERT INTO `my_user` VALUES ('8', 'E123!', '123123');
INSERT INTO `my_user` VALUES ('9', 'F123!', '123123');

-- ----------------------------
-- Table structure for my_user_info
-- ----------------------------
DROP TABLE IF EXISTS `my_user_info`;
CREATE TABLE `my_user_info` (
  `USERINFO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) DEFAULT NULL,
  `USER_MONEY` decimal(10,2) DEFAULT NULL,
  `USER_JF` int(11) DEFAULT NULL,
  `USER_VIP` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `USER_PHONE` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `USER_S` int(2) DEFAULT NULL,
  PRIMARY KEY (`USERINFO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of my_user_info
-- ----------------------------
INSERT INTO `my_user_info` VALUES ('1', '1', '619.20', '99', '无', '11111111111', '1');
INSERT INTO `my_user_info` VALUES ('2', '2', '901.20', '99', '无', '11111111111', '1');
INSERT INTO `my_user_info` VALUES ('3', '8', '0.00', '0', '无', '11111111111', '1');
INSERT INTO `my_user_info` VALUES ('4', '9', '0.00', '0', '无', '11111111111', '1');

-- ----------------------------
-- Table structure for vip_info
-- ----------------------------
DROP TABLE IF EXISTS `vip_info`;
CREATE TABLE `vip_info` (
  `VIP_ID` int(11) NOT NULL AUTO_INCREMENT,
  `VIP_JF` int(20) DEFAULT NULL,
  `VIP_NAME` int(20) DEFAULT NULL,
  `VIP_ZK` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`VIP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of vip_info
-- ----------------------------
