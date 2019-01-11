/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.0.37-community-nt : Database - work
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`work` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `work`;

/*Table structure for table `academic` */

DROP TABLE IF EXISTS `academic`;

CREATE TABLE `academic` (
  `num` int(11) NOT NULL auto_increment COMMENT '自增主键',
  `typenum` int(11) NOT NULL COMMENT '类别',
  `actitytime` varchar(50) NOT NULL COMMENT '活动时间',
  `theme` varchar(50) NOT NULL COMMENT '主题',
  `address` varchar(50) NOT NULL COMMENT '地点',
  `undertake` varchar(50) NOT NULL COMMENT '组织单位',
  `amount` int(11) NOT NULL COMMENT '参加人数',
  `teachernum` int(11) NOT NULL COMMENT '负责教师工号',
  `member` varchar(50) NOT NULL COMMENT '人员 本人 小组成员',
  `stunum` varchar(50) NOT NULL COMMENT '学生学号',
  `credit` float NOT NULL COMMENT '学分',
  `facultynum` int(11) NOT NULL COMMENT '学院号',
  `majornum` int(11) NOT NULL COMMENT '专业号',
  `gradenum` int(11) NOT NULL COMMENT '班级号',
  PRIMARY KEY  (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `contest` */

DROP TABLE IF EXISTS `contest`;

CREATE TABLE `contest` (
  `num` int(11) NOT NULL auto_increment COMMENT '自增主键',
  `typenum` int(11) NOT NULL COMMENT '类别',
  `actitytime` varchar(50) NOT NULL COMMENT '竞赛时间',
  `theme` varchar(50) NOT NULL COMMENT '竞赛名称',
  `level` varchar(50) NOT NULL COMMENT '竞赛级别',
  `rank` varchar(50) NOT NULL COMMENT '获奖等级',
  `cachet` varchar(50) NOT NULL COMMENT '证书单位公章',
  `booktime` varchar(50) NOT NULL COMMENT '证书落款时间',
  `member` varchar(50) NOT NULL COMMENT '团队成员',
  `teachernum` int(11) NOT NULL COMMENT '指导教师工号',
  `stunum` varchar(50) NOT NULL COMMENT '学生学号',
  `credit` float NOT NULL COMMENT '学分',
  `facultynum` int(11) NOT NULL COMMENT '学院号',
  `majornum` int(11) NOT NULL COMMENT '专业号',
  `gradenum` int(11) NOT NULL COMMENT '班级号',
  PRIMARY KEY  (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `faculty` */

DROP TABLE IF EXISTS `faculty`;

CREATE TABLE `faculty` (
  `num` int(11) NOT NULL auto_increment COMMENT '学院号',
  `name` varchar(50) NOT NULL COMMENT '学院名',
  PRIMARY KEY  (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `grade` */

DROP TABLE IF EXISTS `grade`;

CREATE TABLE `grade` (
  `num` int(11) NOT NULL auto_increment COMMENT '班级号',
  `name` varchar(50) NOT NULL COMMENT '班级名',
  PRIMARY KEY  (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `major` */

DROP TABLE IF EXISTS `major`;

CREATE TABLE `major` (
  `num` int(11) NOT NULL auto_increment COMMENT '专业号',
  `name` varchar(50) NOT NULL COMMENT '专业名称',
  PRIMARY KEY  (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `project` */

DROP TABLE IF EXISTS `project`;

CREATE TABLE `project` (
  `num` int(11) NOT NULL auto_increment COMMENT '自增主键',
  `typenum` int(11) NOT NULL COMMENT '类别',
  `actitytime` varchar(50) NOT NULL COMMENT '项目时间',
  `type` varbinary(50) NOT NULL COMMENT '项目类别',
  `id` varchar(50) NOT NULL COMMENT '项目编号',
  `name` varchar(50) NOT NULL COMMENT '项目名称',
  `level` varchar(50) NOT NULL COMMENT '项目级别',
  `score` varchar(50) NOT NULL COMMENT '结题成绩 结题合格 结题优秀',
  `member` varchar(50) NOT NULL COMMENT '成员',
  `teachernum` int(11) NOT NULL COMMENT '指导教师工号',
  `stunum` varchar(50) NOT NULL COMMENT '学生学号',
  `credit` float NOT NULL COMMENT '学分',
  `facultynum` int(11) NOT NULL COMMENT '学院号',
  `majornum` int(11) NOT NULL COMMENT '专业号',
  `gradenum` int(11) NOT NULL COMMENT '班级号',
  PRIMARY KEY  (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `safety` */

DROP TABLE IF EXISTS `safety`;

CREATE TABLE `safety` (
  `num` int(11) NOT NULL auto_increment COMMENT '自增主键',
  `typenum` int(11) NOT NULL COMMENT '类别',
  `gettime` varchar(50) NOT NULL COMMENT '获得称号时间',
  `level` varchar(50) NOT NULL COMMENT '称号级别',
  `teaceher` int(11) NOT NULL COMMENT '指导教师工号',
  `member` varchar(50) NOT NULL COMMENT '人员 本人',
  `stunum` varchar(50) NOT NULL COMMENT '学生学号',
  `credit` float NOT NULL COMMENT '学分',
  `facultynum` int(11) NOT NULL COMMENT '学院号',
  `majornum` int(11) NOT NULL COMMENT '专业号',
  `gradenum` int(11) NOT NULL COMMENT '班级号',
  PRIMARY KEY  (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `num` varchar(50) NOT NULL COMMENT '学号',
  `name` varchar(50) NOT NULL COMMENT '姓名',
  `id` varchar(50) NOT NULL COMMENT '身份证',
  `facultynum` varchar(50) NOT NULL default '' COMMENT '学院号',
  `majorum` varchar(50) NOT NULL default '' COMMENT '专业号',
  `gradenum` varchar(50) NOT NULL default '' COMMENT '班级号',
  `telphone` varchar(50) NOT NULL COMMENT '手机号',
  `pwd` varchar(50) NOT NULL COMMENT '密码',
  `status` int(11) NOT NULL default '0' COMMENT '状态 0-未激活 1-激活',
  `role` int(11) NOT NULL default '0' COMMENT '用户角色 0-学生',
  `bankcard` varchar(50) NOT NULL COMMENT '银行卡号',
  PRIMARY KEY  (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `studio` */

DROP TABLE IF EXISTS `studio`;

CREATE TABLE `studio` (
  `num` int(11) NOT NULL auto_increment COMMENT '自增主键',
  `actitytime` varchar(50) NOT NULL COMMENT '参与时间',
  `facultynum` int(11) NOT NULL COMMENT '所属部门号(学院号)',
  `name` varchar(50) NOT NULL COMMENT '工作室名称',
  `level` varchar(50) NOT NULL COMMENT '工作室等级 优秀 注册',
  `teachernum` int(11) NOT NULL COMMENT '指导教师工号',
  `position` varchar(50) NOT NULL COMMENT '团队职责 负责人 参与人',
  `member` varchar(50) NOT NULL COMMENT '人员',
  `stunum` varchar(50) NOT NULL COMMENT '学生学号',
  `credit` int(11) NOT NULL COMMENT '学分',
  `majornum` int(11) NOT NULL COMMENT '专业号',
  `gradenum` int(11) NOT NULL COMMENT '班级号',
  PRIMARY KEY  (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `type` */

DROP TABLE IF EXISTS `type`;

CREATE TABLE `type` (
  `num` int(11) NOT NULL auto_increment COMMENT '自增主键',
  `name` varchar(50) NOT NULL COMMENT '竞赛类别',
  PRIMARY KEY  (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `years` */

DROP TABLE IF EXISTS `years`;

CREATE TABLE `years` (
  `num` int(11) NOT NULL auto_increment COMMENT '自增id',
  `schoolyear` varchar(50) NOT NULL COMMENT '学年 例:2017-2018(2)',
  PRIMARY KEY  (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
