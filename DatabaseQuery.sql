CREATE TABLE employee(emp_ID int primarykey,emp_name varchar(255),salary int,dept_id int);

CREATE TABLE depatment(dept_ID int primarykey,department_name varchar(255),salary 
int,location int;

SELECT * FROM DEPARTMENT

SELECT * FROM employee
 
Alter table employee add Department_name varchar(50)//(for adding new column)

ALTER TABLE department Change id dept_id int ;//rename column

ALTER TABLE employee DROP department_name;//to remove particular column

SELECT * FROM employee WHERE dept_id = 10 OR dept_id = 12;//display particular set of employee by any unique id

update employee SET salary = 5000 WHERE emp_id = 30