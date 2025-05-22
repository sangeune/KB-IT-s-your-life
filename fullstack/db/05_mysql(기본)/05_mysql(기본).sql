-- Q1. tabledb 데이터베이스를 생성하세요.
-- 만일, 이미 존재한다면 삭제하세요.
DROP DATABASE tabledb;
CREATE DATABASE tabledb;

-- Q2. 다음 컬럼을 가지는 usertbl 테이블을 만드세요.
USE tabledb;

CREATE TABLE usertbl(
userID CHAR(8) NOT NULL PRIMARY KEY,
name VARCHAR(10) NOT NULL,
birthyear INT NOT NULL,
addr CHAR(2) NOT NULL,
mobile1 CHAR(3) NULL,
mobile2 CHAR(8) NULL,
height SMALLINT NULL,
mDate DATE NULL
);

-- Q3. 다음 컬럼을 가지는 buytbl 테이블을 만드세요.
CREATE TABLE buytbl(
num INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
userID CHAR(8) NOT NULL,
prodName CHAR(6) NOT NULL,
groupName CHAR(4) NULL,
price INT NOT NULL,
amount SMALLINT NOT NULL,
FOREIGN KEY(userID) REFERENCES usertbl(userID)
);

-- Q4. 회원 테이블에 다음 데이터를 입력하세요.
-- 순서: userID, name, birthyear, addr, mobile1, mobile2, height, mDate
INSERT INTO usertbl VALUES('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8');
INSERT INTO usertbl VALUES('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4');
INSERT INTO usertbl VALUES('KKH', '김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7');

-- Q5. 구매 테이블에 다음 데이터를 입력하세요.
-- 에러가 난다면, 왜 발생하는지 설명하세요.
-- 순서: userid, prodName, groupName, price, amount
INSERT INTO buytbl VALUES(NULL, 'KBS', '운동화', NULL, 30, 2);
INSERT INTO buytbl VALUES(NULL, 'KBS', '노트북', '전자', 1000, 1);
INSERT INTO buytbl VALUES(NULL, 'JYP', '모니터', '전자', 200, 1); -- 에러
-- userID는 왜래키인데, usertbl에 'JYP'가 없어서 에러남

-- Q6. 다음 컬럼을 가지는 usertbl을 정의하세요.
-- 기존 usertbl이 존재하는 경우 삭제함
-- 기본키는 테이블 레벨에서 정의하고 제약조건명을 함께 지정함
ALTER TABLE buytbl DROP FOREIGN KEY buytbl_ibfk_1; -- 외래키 삭제

DROP TABLE IF EXISTS usertbl;

CREATE TABLE usertbl (
userID CHAR(8) NOT NULL,
name VARCHAR(10) NOT NULL,
birthyear INT NOT NULL,
CONSTRAINT PK_userTBL_userID PRIMARY KEY (userID)
);

-- Q7. 다음 컬럼을 가지는 prodTbl 을 정의하세요.
-- 기존 prodTbl이 존재하는 경우 삭제함
DROP TABLE IF EXISTS prodTbl;

CREATE TABLE prodTbl(
prodCode CHAR(3) NOT NULL,
prodID CHAR(4) NOT NULL,
prodDate DATETIME NOT NULL,
proCur CHAR(10) NULL,
CONSTRAINT PK_prodTbl_prodCode_prodID PRIMARY KEY (prodCode, prodID)
);

-- Q8. usertbl과 buytbl을 바탕으로 다음 결과가 나오는 뷰를 정의하세요.
CREATE VIEW v_userbuytbl AS 
SELECT u.userID, name, prodName, addr, CONCAT(mobile1, mobile2) AS '연락처'
FROM usertbl u
INNER JOIN buytbl b
ON u.userID = b.userID;
-- 바꾼 테이블 형식이 맞지 않기 때문에 삭제하고 이전 테이블 다시 생성 후 실행

-- Q9. 위에서 정의한 뷰에서 userid가 '김범수'인 데이터만 출력하세요.
SELECT * FROM v_userbuytbl WHERE name = '김범수';





