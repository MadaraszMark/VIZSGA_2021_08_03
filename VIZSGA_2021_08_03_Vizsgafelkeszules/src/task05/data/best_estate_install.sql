
CREATE SCHEMA `best_estate` DEFAULT CHARACTER SET utf8 COLLATE utf8_hungarian_ci ;

use `best_estate`;

CREATE TABLE `best_estate`.`estate_category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `best_estate`.`estate` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `size` INT NULL,
  `room_count` INT NULL,
  `address_city` VARCHAR(100) NOT NULL,
  `address_postal_number` VARCHAR(45) NULL,
  `address` VARCHAR(150) NULL,
  `price` FLOAT NULL, 
  `category_id` INT NULL,
  `sale` TINYINT(1) NULL DEFAULT 0,
  `status` TINYINT(1) NULL DEFAULT 1,
  PRIMARY KEY (`id`),
  INDEX `category_FK_idx` (`category_id` ASC),
  CONSTRAINT `category_FK`
    FOREIGN KEY (`category_id`)
    REFERENCES `best_estate`.`estate_category` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
INSERT INTO `best_estate`.`estate_category` (`name`) VALUES ('családi ház');
INSERT INTO `best_estate`.`estate_category` (`name`) VALUES ('ikerház');
INSERT INTO `best_estate`.`estate_category` (`name`) VALUES ('sorház');
INSERT INTO `best_estate`.`estate_category` (`name`) VALUES ('társasház');
INSERT INTO `best_estate`.`estate_category` (`name`) VALUES ('nyaraló');
  
  INSERT INTO `best_estate`.`estate` (`name`, `size`, `room_count`, `address_city`, `address_postal_number`, `address`,`price`, `category_id`, `sale`) VALUES ('Panorámás családi ház', '150', '5', 'Budapest', '1111', 'Kossuth u. 1.','130', '1', '0');
INSERT INTO `best_estate`.`estate` (`name`, `size`, `room_count`, `address_city`, `address_postal_number`, `address`,`price`, `category_id`) VALUES ('Ikerház 2 generációnak', '140', '4', 'Budapest', '1121', 'Lajos u. 23.','142', '2');
INSERT INTO `best_estate`.`estate` (`name`, `size`, `room_count`, `address_city`, `address_postal_number`, `address`,`price`, `category_id`, `status`) VALUES ('Csodaszép nyaraló', '60', '2', 'Zebegény', '2627', 'Petőfi u. 13.','45', '5', '1');
INSERT INTO `best_estate`.`estate` (`name`, `size`, `room_count`, `address_city`, `address_postal_number`, `address`,`price`, `category_id`, `sale`, `status`) VALUES ('Modern társasház', '76', '3', 'Budapest', '1051','Géza . 14.','70', '4', '1', '0');

  
  