CREATE TABLE `vote_info_user` (
  `vote_id` int(11) NOT NULL COMMENT '投票ID',
  `vote_detail_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '投票採番ID',
  `vote_number` int(11) NOT NULL COMMENT '投票番号',
  `user_name` varchar(255) NOT NULL COMMENT '投票者',
  `user_agent` varchar(255) DEFAULT NULL COMMENT 'ユーザエージェント',
  `create_date` date NOT NULL COMMENT '作成日時',
  `update_date` date NOT NULL COMMENT '更新日時',
  PRIMARY KEY (`vote_detail_id`,`vote_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8