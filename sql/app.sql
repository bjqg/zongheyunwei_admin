/*
 Navicat Premium Data Transfer

 Source Server         : PHPstudy
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : 127.0.0.1:3306
 Source Schema         : zongheyunwei

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 10/10/2022 16:07:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for app
-- ----------------------------
DROP TABLE IF EXISTS `app`;
CREATE TABLE `app`  (
  `id` int(11) NOT NULL COMMENT '应用id',
  `key_` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '授权key_',
  `acronym` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '应用缩写词',
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '应用名称',
  `status` tinyint(1) UNSIGNED NULL DEFAULT 0 COMMENT '应用状态，0：正常 1：禁用（下线）',
  `desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '应用描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '接入的应用' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of app
-- ----------------------------
INSERT INTO `app` VALUES (1, '111', 'aiops', '资产管控', 0, '融至兴资产管控平台');
INSERT INTO `app` VALUES (2, '222', 'oatd', '违规外联', 0, '融至兴违规外联平台');
INSERT INTO `app` VALUES (3, '333', 'wdzyzx', '文档资源中心', 0, '融至兴文档资源中心');
INSERT INTO `app` VALUES (4, '444', 'wulw', '物联网', 0, '融至兴物联网平台');
INSERT INTO `app` VALUES (5, '555', 'miguan', '蜜罐', 0, '融至兴蜜罐平台');
INSERT INTO `app` VALUES (6, '666', 'yunpan', '云盘', 0, '融至兴云网盘');
INSERT INTO `app` VALUES (7, '777', 'anheng', '安恒态势感知', 0, '安恒态势感知');

-- ----------------------------
-- Table structure for app_auth_token
-- ----------------------------
DROP TABLE IF EXISTS `app_auth_token`;
CREATE TABLE `app_auth_token`  (
  `id` int(11) NOT NULL,
  `app_id` smallint(2) UNSIGNED NULL DEFAULT 0 COMMENT '应用id',
  `token` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '授权token',
  `c_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `d_time` datetime(0) NULL DEFAULT NULL COMMENT 'dead time 失效时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '应用授权信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for app_data
-- ----------------------------
DROP TABLE IF EXISTS `app_data`;
CREATE TABLE `app_data`  (
  `id` int(11) NOT NULL,
  `app_id` smallint(2) UNSIGNED NULL DEFAULT 0 COMMENT '应用id',
  `action` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '执行操作名称',
  `param` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '执行参数',
  `status` tinyint(1) UNSIGNED NULL DEFAULT 0 COMMENT '数据状态 0：正常 1：下线',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '数据名称',
  `desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '数据描述',
  `demo` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '数据样例',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '综合运维数据定义' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for app_notice
-- ----------------------------
DROP TABLE IF EXISTS `app_notice`;
CREATE TABLE `app_notice`  (
  `notice_id` int(4) NOT NULL AUTO_INCREMENT COMMENT '公告ID',
  `app_id` int(10) UNSIGNED NULL DEFAULT 0 COMMENT '应用id',
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '公告标题',
  `type` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '公告类型（1通知 2公告）',
  `content` longblob NULL COMMENT '公告内容',
  `status` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '公告状态（0正常 1关闭）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`notice_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '通知公告表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of app_notice
-- ----------------------------
INSERT INTO `app_notice` VALUES (1, 1, '温馨提醒：2018-07-01 Rzx新版本发布啦', '2', 0xE696B0E78988E69CACE58685E5AEB9, '0', 'admin', '2022-09-19 10:12:04', '', NULL, '管理员');
INSERT INTO `app_notice` VALUES (2, 1, '维护通知：2018-07-01 Rzx系统凌晨维护', '1', 0xE7BBB4E68AA4E58685E5AEB9, '0', 'admin', '2022-09-19 10:12:04', '', NULL, '管理员');

-- ----------------------------
-- Table structure for app_problem
-- ----------------------------
DROP TABLE IF EXISTS `app_problem`;
CREATE TABLE `app_problem`  (
  `id` int(11) NOT NULL,
  `app_id` smallint(4) UNSIGNED NULL DEFAULT 0 COMMENT '应用id',
  `source_id` int(11) NULL DEFAULT NULL COMMENT '系统内部id',
  `level` smallint(2) UNSIGNED NULL DEFAULT 0 COMMENT '告警等级',
  `desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '告警描述',
  `host_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主机信息',
  `host_ip` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主机ip',
  `host_mac` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主机mac 地址',
  `host_location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '设备位置',
  `c_time` datetime(0) NULL DEFAULT NULL COMMENT '发生时间',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '告警状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '告警信息（默认保存15天信息）' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
