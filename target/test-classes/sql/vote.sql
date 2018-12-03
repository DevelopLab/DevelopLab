CREATE TABLE `vote` (
  `vote_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '投票ID',
  `title` varchar(255) DEFAULT NULL COMMENT 'タイトル',
  `comment` varchar(255) NOT NULL COMMENT '投票者',
  `image_icon` varchar(255) DEFAULT NULL COMMENT '画像アイコン',
  `deadline_date` datetime NOT NULL COMMENT '締め切り日時',
  `vote_start_date` datetime NOT NULL COMMENT '開始日時',
  `vote_end_date` datetime NOT NULL COMMENT '終了日時',
  `create_date` date NOT NULL COMMENT '作成日時',
  `update_date` date NOT NULL COMMENT '更新日時',
  PRIMARY KEY (`vote_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;