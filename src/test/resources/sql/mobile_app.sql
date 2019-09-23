CREATE TABLE `mobile_app` (
  `app_id` int(11) NOT NULL COMMENT 'アプリID',
  `app_name` varchar(255) NOT NULL COMMENT 'アプリ名',
  `app_icon` varchar(255) NOT NULL COMMENT '画像アイコン',
  `ios_app_url` varchar(255) DEFAULT NULL COMMENT 'iosアプリURL',
  `android_app_url` varchar(255) DEFAULT NULL COMMENT 'androidアプリURL',
  `comment` varchar(255) NOT NULL COMMENT 'コメント',
  `create_date` date NOT NULL COMMENT '作成日時',
  `update_date` date NOT NULL COMMENT '更新日時',
  PRIMARY KEY (`app_id`,`app_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;