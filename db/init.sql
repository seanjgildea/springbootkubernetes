CREATE DATABASE IF NOT EXISTS treadstone;

USE treadstone;

CREATE TABLE IF NOT EXISTS `movie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `release_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT IGNORE INTO movie (id, name, description, release_date) VALUES (1, 'Terminator', 'Sarah Connor is pursued by a Terminator from the future', '1984-04-12');
INSERT IGNORE INTO movie (id, name, description, release_date) VALUES (2, 'Predator', 'An alien stalks an elite military outfit one by one', '1989-12-09');