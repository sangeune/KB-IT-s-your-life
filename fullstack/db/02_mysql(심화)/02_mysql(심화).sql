-- tbl_board의 데이터를 모두 출력
SELECT * FROM shopdb.tbl_board;

-- tbl_board의 데이터를 출력 (단, no, title, writer만 출력)
SELECT no, title, writer FROM tbl_board;

-- tbl_board의 데이터 중 특정 작성자 한 명의 글만 출력
SELECT * FROM tbl_board WHERE writer = '사람5';