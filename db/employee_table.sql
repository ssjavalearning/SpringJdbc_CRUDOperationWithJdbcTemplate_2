CREATE TABLE `employee_table` (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `sal` double NOT NULL,
  `dept_no` int(11) NOT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;