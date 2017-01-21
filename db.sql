/*
 Navicat Premium Data Transfer

 Source Server         : local_mysql
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost
 Source Database       : blog

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : utf-8

 Date: 11/29/2016 21:52:36 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Create and use database, which
-- name is 'blog'
-- ----------------------------
DROP DATABASE IF EXISTS `blog`;
CREATE DATABASE `blog`;
USE `blog`;

-- ----------------------------
--  Table structure for `article`
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` char(36) NOT NULL,
  `title` varchar(100) NOT NULL,
  `abstract` varchar(200) DEFAULT NULL,
  `content` varchar(8000) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `type` char(2) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `delete_flag` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `article`
-- ----------------------------
BEGIN;
INSERT INTO `article` VALUES ('1', '哥国警方证实76人在飞机坠毁事故中遇难 5人幸存', '【#载巴西球员飞机坠毁# 76人遇难】当地时间29日，一架客机在哥伦比亚麦德林附近坠毁，机上载有巴西球队沙佩科恩斯队员。哥伦比亚媒体援引警方消息称，事故造成76人遇难，5人生还，生还者包括2名球员，2名机组成员和1名记者。', '根据最新消息，哥伦比亚警方证实，飞机坠毁事故的一名幸存者在医院宣告不治，遇难总人数升至76人。据此前报道，这起空难恐造成75人死亡。加上媒体统计的6名幸存者，机上所搭载的人数与通报的81人相符。\n根据媒体此前消息，巴西沙佩科恩斯足球俱乐部球员Alan Rusche在坠机事件中幸存。未经证实的消息称，31岁的球队守门员Danilo疑幸存。此外，另一名球队守门员Jackson Follmann据称也被送往医院。\n此外，据称幸存人员还包括一名女性机组人员、一名心理治疗师以及一名记者。', '中国新闻网(北京)', '01', '2016-11-29 21:48:41', '0'), ('2', '丈夫拍妻子出轨裸照敲诈5名男子 索要6万元获刑', '中安在线消息，据市场星报报道，发现妻子宋某某和微信好友在家中发生不正当关系后，安徽庐江男子王某以拍摄裸照等手段威胁，向5名被害人索要共计6万余元。11月27日，记者获悉，日前，被告人王某因敲诈勒索罪获刑一年半。', '现年40岁的男子王某，安徽庐江人。据检方指控，2015年6月以来，王某发现其妻宋某某和微信好友在家中发生不正当两性关系后，遂多次晚间在自家门外守候，趁宋某某和他人发生性关系时进入室内，以拍摄裸照等相威胁索要钱财。2015年七八月的一天晚上，被告人王某对进入家中的占某拳打脚踢，并以拍摄照片、将其带至派出所相威胁，占某迫于无奈，提出愿意出钱解决此事，被告人王某向其索要10000元，后占某分两次将10000元交给被告人王某。统计显示，截至同年10月12日，被告人王某采用相同的手段，向包括占某在内的5名被害人索要共计6.35万元。案发后，被告人王某主动投案，如实供述了自己的罪行；并分别赔偿了被害人占某、夏某6500元、3500元。\n日前，庐江法院审理了此案。法院认为，被告人王某以非法占有为目的，多次使用暴力、威胁的方法，强行索取他人钱财共计63500元，数额巨大，其行为已构成敲诈勒索罪。遂判处被告人王某犯敲诈勒索罪，获刑有期徒刑一年六个月，并处罚金人民币10000元。', '澎湃新闻网(上海)', '00', '2016-11-29 21:51:32', '0');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
