package org.scoula.jdbc_ex.test;

import org.junit.jupiter.api.*;
import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.*;

//테스트 순서는 어노테이션으로 지정함을 설정
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CrudTest {
    //JDBCUtil을 이용하여 Connection 객체를 멤버 변수로 정의
    Connection conn = JDBCUtil.getConnection();

    //하나의 단위 테스트가 끝날때 마다 Connection을 닫는 tearDown() 메서드를 정의
    @AfterAll
    static void tearDown() {
        JDBCUtil.close();
    }

    //insertUser() 테스트 메서드
    @Test
    @DisplayName("새로운 user를 등록한다.")
    @Order(1) //테스트 순서 1번
    public void insertUser() throws SQLException {
        //PreparedStatement를 이용하여 users 테이블에 데이터를 추가
        String sql = "insert into users(id, password, name, role) values(?,?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "scoula");
            pstmt.setString(2, "scoula3");
            pstmt.setString(3, "스콜라");
            pstmt.setString(4, "USER");

            //insert 작업의 성공 여부를 단정문으로 확인
            int count = pstmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
    }

    //selectUser() 테스트 메서드
    @Test
    @DisplayName("user 목록을 추출한다.")
    @Order(2) //테스트 순서 2번
    public void selectUser() throws SQLException {
        //Statement를 이용하여 users 테이블의 모든 데이터를 추출
        String sql = "select * from users";
        try(Statement stmt = conn.createStatement();
            //ResultSet을 이용하여 추출한 모든 행의 name 컬럼 출력
            ResultSet rs = stmt.executeQuery(sql);
        ){
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        }
    }

    //selectUserById() 테스트 메서드
    @Test
    @DisplayName("특정 user를 검색한다.")
    @Order(3) //테스트 순서 3번
    public void selectUserById() throws SQLException {
        //PreparedStatement를 이용하여 users 테이블에서 id를 이용하여 한 개의 데이터를 추출
        String userid = "scoula";
        String sql = "select * from users where id = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userid);
            //ResultSet을 이용하여 추출한 행의 name 컬럼 출력
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println(rs.getString("name"));
                } else {
                    throw new SQLException("scoula not found");
                }
            }
        }
    }

    //updateUser() 테스트 메서드
    @Test
    @DisplayName("특정 user를 수정한다.")
    @Order(4) //테스트 순서 4번
    public void updateUser() throws SQLException {
        //PreparedStatement를 이용하여 users 테이블에서 지정한 id의 name을 수정
        String userid = "scoula";
        String sql = "update users set password = ? where id = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "스콜라 수정");
            pstmt.setString(2, userid);

            //단정문을 이용하여 update문 실행 성공 여부를 판정
            int count = pstmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
    }

    //deleteUser() 테스트 메서드
    @Test
    @DisplayName("지정한 사용자를 삭제한다.")
    @Order(5) //테스트 순서 5번
    public void deleteUser() throws SQLException {
        //PreparedStatement를 이용하여 users 테이블에서 지정한 id의 행 삭제
        String userid = "scoula";
        String sql = "delete from users where id = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userid);

            //단정문을 이용하여 delete문 실행 성공 여부를 판정
            int count = pstmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
    }

}
