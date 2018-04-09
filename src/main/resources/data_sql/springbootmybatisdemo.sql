/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : springbootmybatisdemo

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 09/04/2018 17:08:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_account
-- ----------------------------
DROP TABLE IF EXISTS `tb_account`;
CREATE TABLE `tb_account`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `account` double(255, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_account
-- ----------------------------
INSERT INTO `tb_account` VALUES (1, 'admin', 1000);
INSERT INTO `tb_account` VALUES (2, 'lastly', 1000);

-- ----------------------------
-- Table structure for tb_area
-- ----------------------------
DROP TABLE IF EXISTS `tb_area`;
CREATE TABLE `tb_area`  (
  `area_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '区域id',
  `area_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '区域名',
  `priority` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '权重（优先级优先显示）默认为0',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建日期',
  `last_edit_time` datetime(0) NULL DEFAULT NULL COMMENT '最新修改日期',
  PRIMARY KEY (`area_id`) USING BTREE,
  UNIQUE INDEX `UNIQUE_AREA`(`area_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_area
-- ----------------------------
INSERT INTO `tb_area` VALUES (1, '东苑', '2', NULL, NULL);
INSERT INTO `tb_area` VALUES (2, '北苑', '1', NULL, NULL);
INSERT INTO `tb_area` VALUES (3, '极乐净土', '12', NULL, NULL);
INSERT INTO `tb_area` VALUES (4, '东方', '13', '2018-04-09 08:38:27', '2018-04-09 08:38:27');

SET FOREIGN_KEY_CHECKS = 1;
