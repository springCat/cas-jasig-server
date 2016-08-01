CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `login_name` varchar(128) NOT NULL,
  `password` varchar(64) NOT NULL,
  `salt` varchar(16) NOT NULL,
  `archived` tinyint(1) DEFAULT '0',
  `version` int(11) DEFAULT '0',
  `create_time` bigint(20) DEFAULT '0',
  `last_login_time` bigint(20) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`login_name`),
  KEY `username_index` (`login_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `users_id` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;