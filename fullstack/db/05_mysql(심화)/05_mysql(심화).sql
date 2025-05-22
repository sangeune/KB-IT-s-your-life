-- Q1. 다음 컬럼을 가지는 userTBL과 buyTBL을 정의하세요.
-- 기존에 테이블이 존재하면 삭제함
USE tabledb;
DROP TABLE IF EXISTS userTBL, buyTBL;

-- 1-1. userTBL
CREATE TABLE userTBL (
userID CHAR(8) NOT NULL PRIMARY KEY,
name VARCHAR(10) NOT NULL,
birthyear INT NOT NULL
);

-- 1-2. buytbl
CREATE TABLE buytbl (
num INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
userID CHAR(8) NOT NULL,
prodName CHAR(6) NOT NULL
);

-- 1-3. ALTER를 이용해 userID를 외래키로 수정하세요.
ALTER TABLE buytbl
ADD CONSTRAINT FK_userTBL_buyTBL
FOREIGN KEY(userID)
REFERENCES userTBL(userID);

-- Q2. 다음 조건을 만족하는 userTBL 테이블을 정의하세요.
-- 기존 buyTBL, userTBL을 삭제하세요.
DROP TABLE IF EXISTS buyTBL, userTBL;

CREATE TABLE userTBL (
userID CHAR(8) NOT NULL PRIMARY KEY,
name VARCHAR(10) NOT NULL,
birthYear INT NOT NULL,
email CHAR(30) NULL UNIQUE
);

-- Q3. 다음 조건을 만족하는 userTBL 테이블을 정의하세요.
-- 기존 userTBL을 삭제하세요.
DROP TABLE IF EXISTS userTBL;

CREATE TABLE userTBL (
userID CHAR(8) NOT NULL PRIMARY KEY,
name VARCHAR(10),
birthYear INT CHECK (birthYear >= 1900 AND birthYear <= 2023),
mobile CHAR(3) NOT NULL
);

-- Q4. 다음 조건을 만족하는 userTBL 테이블을 정의하세요.
-- 기존 userTBL을 삭제하세요.
DROP TABLE IF EXISTS userTBL;

CREATE TABLE userTBL (
userID CHAR(8) NOT NULL PRIMARY KEY,
name VARCHAR(10) NOT NULL,
birthYear INT NOT NULL DEFAULT -1,
addr CHAR(2) NOT NULL DEFAULT '서울',
mobile1 CHAR(3) NULL,
mobile2 CHAR(8) NULL,
height SMALLINT NULL DEFAULT 170,
mDate DATE NULL
);

-- 기본값 추가를 확인할 수 있는 데이터를 추가하세요.
INSERT INTO usertbl VALUES ('YSE', '유상은', default, default, '012', '1234567', default, '2025.01.01');

-- Q5. 앞에서 만든 userTBL에 대해서 다음 조건을 처리하도록 수정하세요.
-- 5-1. mobile1 컬럼을 삭제함
ALTER TABLE usertbl
DROP COLUMN mobile1;

-- 5-2. name 컬럼명을 uName으로 변경함
ALTER TABLE usertbl
CHANGE COLUMN NAME uName VARCHAR(10) NOT NULL;

-- 5-3. 기본키를 제거함
ALTER TABLE usertbl
DROP PRIMARY KEY;

-- 모든 문제는 employees 데이터베이스에서 수행한다.
USE employees;

-- Q6. 다음 정보를 가지는 직원 정보를 출력하는 EMPLOYEES_INFO 뷰를 작성하세요.
CREATE VIEW EMPLOYEES_INFO AS
SELECT e.*,
t.title, t.from_date t_from, t.to_date t_to,
s.salary, s.from_date s_from, s.to_date s_to
FROM employees e
INNER JOIN titles t
ON e.emp_no = t.emp_no
INNER JOIN salaries s
ON e.emp_no = s.emp_no;

-- Q7. EMPLOYEES_INFO 뷰에서 재직자의 현재 정보만 출력하세요.
SELECT * FROM EMPLOYEES_INFO
WHERE s_to = '9999-01-01';

-- Q8. 다음 정보를 가지는 부서 정보를 출력하는 EMP_DEPT_INFO 뷰를 작성하세요.
CREATE VIEW EMP_DEPT_INFO AS
SELECT  e.emp_no, d.dept_no, d.dept_name, de.from_date, de.to_date
FROM departments d
INNER JOIN dept_emp de
ON d.dept_no = de.dept_no
INNER JOIN employees e
ON de.emp_no = e.emp_no;

-- Q9. EMP_DEPT_INFO로 현재 재직자의 부서 정보를 출력하세요.
SELECT * FROM EMP_DEPT_INFO
WHERE to_date = '9999-01-01';

