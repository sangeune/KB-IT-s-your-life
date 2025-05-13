-- 설명(comment, 주석), 한 칸 반드시 띄우기

-- 현재 스키마(db)는 shopdb로 설정되어있음

show tables; -- 테이블 목록 보여주세요.

desc membertbl; -- 테이블 설정 자세하게 보여줘

select * from membertbl; -- membertbl 테이블로부터 모든 필드(항목, item, 속성, 컬럼)을 선택해서 보여줘(검색)

-- dml

select memberID from membertbl;

select memberID, memberName from membertbl;

Insert INTO membertbl values ('summer','박길동',''); -- sql문은 char 쓸 때 ", ' 아무거나 써도 됨

select * from membertbl;

select * from membertbl where memberID = 'apple';
-- not null이면서 중복X 컬럼을 가지고 조건을 주어야지만 해당 사람에 대한 정보를 검색 가능
-- 컬럼 중에서 중요한 역할을 하는 컬럼을 중요키(primary key, pk, 기본키/우선키)
