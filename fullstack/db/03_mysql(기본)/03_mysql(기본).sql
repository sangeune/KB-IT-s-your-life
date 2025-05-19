-- 문제1. 다음을 처리하는 쿼리문을 작성하세요.
-- 1-1. 현재 서버에 존재하는 데이터베이스 확인
show databases;

-- 1-2. 현재 데이터베이스를 employees로 설정하기
USE employees;

-- 1-3. employees 데이터베이스의 테이블 목록 보기
SHOW TABLE STATUS;

-- 1-4. employees 테이블의 열 목록 출력하기
DESCRIBE employees;

-- 문제2. employees 테이블에서 다음 쿼리를 작성하세요.
-- 2-1. titles 테이블의 데이터 출력하기
SELECT * FROM titles;

-- 2-2. employees 테이블에서 first_name 컬럼만 출력하기
SELECT first_name FROM employees;

-- 2-3. employees 테이블에서 first_name 컬럼, last_name 컬럼, gender 컬럼 출력하기
SELECT first_name, last_name, gender FROM employees;

-- 문제3. employees 테이블에서 first_name 컬럼, gender 컬럼, hire_date 컬럼 출력하기
SELECT first_name, gender, hire_date FROM employees;

-- 문제4. 배포된 sqldb.sql 파일을 이용하여 sqldb 데이터베이스를 구축하세요.
USE sqldb;

-- 문제5. usertbl 테이블에서 이름이 '김경호'인 행을 출력하세요.
SELECT * FROM usertbl WHERE name = '김경호';

-- 문제6. usertbl 테이블에서 생년이 1970 이상이고 키가 182이상인 데이터를 출력하세요.
SELECT * FROM usertbl WHERE birthYear >= 1970 AND height >= 182;

-- 문제7. 테이블에서 키가 180~183 범위인 데이터를 출력하세요.
SELECT * FROM usertbl WHERE height >= 180 AND height <= 183;

-- 문제8. usertbl 테이블에서 주소가 '경남' 또는 '전남' 또는 '경북'인 데이터를 출력하세요.
SELECT * FROM usertbl WHERE addr in ('경남', '전남', '경북');

-- 문제9. usertbl 테이블에서 이름이 '김'으로 시작하는 데이터를 출력하세요.
SELECT * FROM usertbl WHERE name LIKE '김%';

-- 문제10. usertbl에서 김경호 보다 큰 사람들의 이름과 키를 출력하세요.
SELECT name, height FROM usertbl
	WHERE height > (SELECT height FROM usertbl WHERE name = '김경호');
    
-- 문제11. usertbl을 mdata의 오름 차순으로 정렬하여 출력하세요.
SELECT * FROM usertbl ORDER BY mdate ASC;

-- 문제12. usertbl을 mdata의 내림 차순으로 정렬하여 출력하세요.
SELECT * FROM usertbl ORDER BY mdate DESC;

-- 문제13. usertbl을 height의 내림차순으로 정렬하고, 동률인 경우 name의 내림차순으로 정렬하여 출력하세요.
SELECT * FROM usertbl ORDER BY height DESC, name DESC;

-- 문제14. usertbl의 주소지를 중복없이 오름 차순으로 출력하세요.
SELECT DISTINCT addr FROM usertbl ORDER BY addr ASC;

-- 문제15. World 데이터베이스에서 다음 질문을 처리하세요.
USE world;

-- 15-1. 국가 코드가 'KOR'인 도시를 찾아 인구수를 역순으로 표시하세요.
SELECT * FROM city WHERE CountryCode = 'KOR' ORDER BY Population DESC;

-- 15-2. city 테이블에서 국가코드와 인구수를 출력하라. 
-- 정렬은 국가코드별로 오름차순으로, 동일한 코드(국가) 안에서는 인구 수의 역순으로 표시하세요.
SELECT CountryCode, Population FROM city ORDER BY CountryCode ASC, Population DESC;

-- 15-3. city 테이블에서 국가코드가 'KOR'인 도시의 수를 표시하세요.
SELECT COUNT(*) FROM city WHERE CountryCode = 'KOR';

-- 15-4. city 테이블에서 국가코드가 'KOR', 'CHN', 'JPN'인 도시를 찾으세요.
SELECT Name FROM city WHERE CountryCode in ('KOR', 'CHN', 'JPN');

-- 15-5. 국가코드가 'KOR'이면서 인구가 100만 이상인 도시를 찾으세요.
SELECT Name FROM city WHERE CountryCode = 'KOR' AND Population >= 1000000;

-- 15-6. 국가 코드가 'KOR'인 도시 중 인구수가 많은 순서로 상위 10개만 표시하세요.
SELECT Name FROM city WHERE CountryCode = 'KOR' ORDER BY Population DESC LIMIT 10;

-- 15-7. city 테이블에서 국가코드가 'KOR'이고, 인구가 100만 이상 500만 이하인 도시를 찾으세요.
SELECT Name FROM city WHERE CountryCode = 'KOR' AND Population BETWEEN 1000000 AND 5000000; 