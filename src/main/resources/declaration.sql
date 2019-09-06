/*
 Navicat Premium Data Transfer

 Source Server         : css_mysql
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : declaration

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 06/09/2019 16:45:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for s_user
-- ----------------------------
DROP TABLE IF EXISTS `s_user`;
CREATE TABLE `s_user`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SJHM` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录账户',
  `ZJHM` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ZJLX_DM` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `XM` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PWD` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `YHLX` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0：填报人员；1：所在单位管理员 ；2产促中心管理员；3：系统管理员',
  `YXBZ` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `LRSJ` timestamp NULL DEFAULT NULL,
  `XGSJ` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of s_user
-- ----------------------------
INSERT INTO `s_user` VALUES ('1', '18827512636', '42122419950418191X', '201', '阮光宇', '123', '0', 'Y', '2019-09-10 15:54:06', '2019-09-06 15:54:15');

-- ----------------------------
-- Table structure for t_sbb
-- ----------------------------
DROP TABLE IF EXISTS `t_sbb`;
CREATE TABLE `t_sbb`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USERID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `SBZT` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0：已填写；1：审批中；2：审批完毕；3：审批拒绝;4：已取消；5：已入库',
  `LRSJ` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_sbzt
-- ----------------------------
DROP TABLE IF EXISTS `t_sbzt`;
CREATE TABLE `t_sbzt`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '',
  `ZT_DM` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ZT` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_sbzt
-- ----------------------------
INSERT INTO `t_sbzt` VALUES ('0', '00', '有效的审批单');
INSERT INTO `t_sbzt` VALUES ('1', '01', '审批中的审批单');
INSERT INTO `t_sbzt` VALUES ('2', '02', '审批拒绝的审批单');
INSERT INTO `t_sbzt` VALUES ('3', '03', '审批完毕的审批单');
INSERT INTO `t_sbzt` VALUES ('4', '04', '已取消的审批单');
INSERT INTO `t_sbzt` VALUES ('5', '05', '已入库的审批单');

SET FOREIGN_KEY_CHECKS = 1;
