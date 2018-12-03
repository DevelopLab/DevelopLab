CREATE TABLE `user` (
  `id` varchar(20) NOT NULL COMMENT 'ID',
  `name` varchar(50) DEFAULT NULL COMMENT '名前',
  `authority` varchar(20) DEFAULT 'user' COMMENT '権限',
  `ios_udid` varchar(255) DEFAULT NULL COMMENT 'IOS端末のUDID',
  `image_icon` varchar(255) DEFAULT NULL COMMENT '画像アイコン',
  `password` varchar(255) NOT NULL COMMENT 'PASSWORD',
  `error_count` int(6) DEFAULT '0' COMMENT 'エラーの回数',
  `create_date` date NOT NULL COMMENT '作成日時',
  `update_date` date NOT NULL COMMENT '更新日時',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;