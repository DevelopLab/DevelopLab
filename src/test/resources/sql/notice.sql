CREATE TABLE `notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `title` varchar(255) NOT NULL COMMENT 'タイトル',
  `notice_info` varchar(255) NOT NULL COMMENT 'お知らせ情報',
  `notice_day` char(8) DEFAULT NULL COMMENT 'お知らせ日付',
  `create_date` date NOT NULL COMMENT '作成日時',
  `update_date` date NOT NULL COMMENT '更新日時',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;