-- Q1. sqldb에서 usertbl 테이블에서 다음 내용들을 확인하세요.
-- 1-1. usertbl의 내용 확인
USE sqldb;

SELECT * FROM usertbl;

-- 1-2. usertbl의 인덱스 목록 확인
SHOW INDEX FROM usertbl;

-- 1-3. usertbl의 데이터 크기와 인덱스의 크기 확인
SHOW TABLE STATUS LIKE 'usertbl';

-- Q2. usertbl의 addr 컬럼에 대해 idx_usertbl_addr이름으로 인덱스를 만들고,
-- 인덱스 목록을 확인하세요.
CREATE INDEX idx_usertbl_addr ON usertbl(addr);

SHOW INDEX FROM usertbl;

-- Q3. usertbl의 상태를 출력하여 인덱스의 내용이 만들어졌는지 확인하고,
-- 내용이 없다면 실제 적용되도록 한 후, 인덱스의 크기를 확인하세요.
SHOW TABLE STATUS LIKE 'usertbl'; -- Index_length가 0

ANALYZE TABLE usertbl; -- 테이블 분석/처리
SHOW TABLE STATUS LIKE 'usertbl'; 

-- Q4. usertbl에 대해 다음을 처리하세요.
-- 4-1. birthYear 컬럼에 대해 idx_usertbl_birthYear 이름의 인덱스를 만드세요.
-- 에러가 난다면 그 이유를 설명하세요.
CREATE UNIQUE INDEX idx_usertbl_birthYear ON usertbl(birthYear);
-- 중복값이 있어 인덱스 생성 에러 발생

-- 4-2. name 컬럼에 대해 idx_usertbl_name 이름의 인덱스를 만드세요.
CREATE UNIQUE INDEX idx_usertbl_name ON usertbl(name);

-- 4-3. 생성된 인덱스의 목록을 확인하세요.
SHOW INDEX FROM usertbl;

-- Q5. usertbl에 대해 다음을 처리하세요.
-- 5-1. name 컬럼에 대한 보조 인덱스를 삭제하세요.
DROP INDEX idx_usertbl_name ON usertbl;

-- 5-2. name과 birthYear 컬럼 조합으로 idx_usertbl_name_birthYear 이름의 인덱스를 생성하세요.
CREATE UNIQUE INDEX idx_usertbl_name_birthYear ON usertbl(name, birthYear);

-- 5-3. 인덱스의 목록을 확인하세요.
SHOW INDEX FROM usertbl;

-- Q6. usertbl에서 앞에서 만든 인덱스를 삭제하세요.
DROP INDEX idx_usertbl_addr ON usertbl;
DROP INDEX idx_usertbl_name_birthYear ON usertbl;

-- Q7. 다음과 같이 실습 데이터베이스 및 사용자를 생성하고,
-- 해당 데이터베이스에 대해 모든 권한을 부여하세요.
CREATE DATABASE scoula_db; -- DB 생성

DROP USER 'scoula'@'%'; -- 이미 존재하므로 삭제
CREATE USER 'scoula'@'%'IDENTIFIED BY '1234'; -- 사용자 생성

GRANT ALL PRIVILEGES ON scoula_db.* TO 'scoula'@'%'; -- 권한 부여

FLUSH PRIVILEGES; -- 권한 변경사항 적용


