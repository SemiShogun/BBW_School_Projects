CREATE DATABASE IF NOT EXISTS `employeehibernatedemo` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `employeehibernatedemo`;

CREATE TABLE `employee` (
	`id` INT(11) NOT NULL,
    `firstname` VARCHAR(50) NOT NULL,
    `lastname` VARCHAR(50) NOT NULL,
    `dept_id` INT(11) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET=utf8; 

INSERT INTO `employee` (`id`, `firstname`, `lastname`, `dept_id`) VALUES
(10, 'Hans', 'Kuster', 11);

ALTER TABLE `employee`
ADD PRIMARY KEY (`id`);

ALTER TABLE `employee`
MODIFY `id` INT(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT; 