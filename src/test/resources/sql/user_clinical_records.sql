CREATE TABLE `user_clinical_records` (
  `id` varchar(20) NOT NULL COMMENT 'ID',
  `gender` char(10) DEFAULT NULL COMMENT '性別',
  `age` int(2) DEFAULT NULL COMMENT '年齢',
  `birthday` char(8) DEFAULT NULL COMMENT '誕生日',
  `sex` char(1) DEFAULT NULL COMMENT '性',
  `personality` char(50) DEFAULT NULL COMMENT '人格',
  `intimacy` tinyint DEFAULT NULL COMMENT '親密度',
  `psychopath` tinyint DEFAULT NULL COMMENT 'サイコパス',
  `create_date` date NOT NULL COMMENT '作成日時',
  `update_date` date NOT NULL COMMENT '更新日時',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;