-- Q1. sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl1을 생성하고,
-- 자동 생성된 인덱스 목록을 확인하세요.
USE sqldb;

CREATE TABLE tbl1 (
	a INT PRIMARY KEY,
	b INT,
    c INT
);

SHOW INDEX FROM tbl1;

-- Q2. sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl2를 생성하고,
-- 자동 생성된 인덱스 목록을 확인하세요.
CREATE TABLE tbl2 (
	a INT PRIMARY KEY,
	b INT UNIQUE,
	c INT UNIQUE,
	d INT
);

SHOW INDEX FROM tbl2;

-- Q3. sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl3를 생성하고,
-- 자동 생성된 인덱스 목록을 확인하세요.
CREATE TABLE tbl3 (
	a INT UNIQUE,
    b INT UNIQUE,
    c INT UNIQUE,
    d INT
);

SHOW INDEX FROM tbl3;

-- Q4. sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl4를 생성하고,
-- 자동 생성된 인덱스 목록을 확인하세요.
CREATE TABLE tbl4 (
	a INT UNIQUE NOT NULL,
    b INT UNIQUE, 
    c INT UNIQUE,
    d INT
);

SHOW INDEX FROM tbl4;

-- Q5. sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl5를 생성하고,
-- 자동 생성된 인덱스 목록을 확인하세요.
CREATE TABLE tbl5 (
	a INT UNIQUE NOT NULL,
    b INT UNIQUE,
    c INT UNIQUE,
    d INT PRIMARY KEY
);

SHOW INDEX FROM tbl5;

-- Q6
-- 6-1. testdb에 다음 컬럼 목록을 가지는 usertbl을 만드세요.
CREATE DATABASE IF NOT EXISTS testdb;

USE testdb;

CREATE TABLE usertbl (
	userID CHAR(8) NOT NULL PRIMARY KEY,
    name VARCHAR(10) NOT NULL,
    birthYear INT NOT NULL,
    addr NCHAR(2) NOT NULL
);

-- 6-2. 아래 데이터를 추가하고, 클러스터형 인덱스의 테이블 내용을 확인하세요.
INSERT INTO usertbl VALUES('LSG', '이승기', 1987, '서울');
INSERT INTO usertbl VALUES('KBS', '김범수', 1979, '경남');
INSERT INTO usertbl VALUES('KKH', '김경호', 1971, '전남');
INSERT INTO usertbl VALUES('JYP', '조용필', 1950, '경기');
INSERT INTO usertbl VALUES('SSK', '성시경', 1979, '서울');

SELECT * FROM usertbl;

-- Q7. ALTER를 사용하여 usertbl에서 PRIMARY KEY 제약조건을 제거하고,
-- name 컬럼에 pk_name이라는 제약조건명으로 기본키를 설정하세요.
ALTER TABLE usertbl DROP PRIMARY KEY;
ALTER TABLE usertbl
	ADD CONSTRAINT pk_name PRIMARY KEY(name);
    
-- Q8. usertbl의 내용을 출력하여, 새로운 클러스터형 인덱스를 확인하세요.
SELECT * FROM usertbl; -- name 순서로 정렬됨
	

