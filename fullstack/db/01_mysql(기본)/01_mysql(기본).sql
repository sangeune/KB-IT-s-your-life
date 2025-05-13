> mysql –u root -p
-- 패스워드 입력
mysql> source employees.sql
mysql> show databases; 
+---------------------+
| Tables_in_employees | 
+---------------------+
| departments |
| dept_emp |
| dept_manager |
| employees |
| salaries |
| titles | 
+---------------------+
mysql> use employees;
mysql> show tables; 
+---------------------+
| Tables_in_employees | 
+---------------------+
| departments |
| dept_emp |
| dept_manager |
| employees |
| salaries |
| titles | 
+---------------------+