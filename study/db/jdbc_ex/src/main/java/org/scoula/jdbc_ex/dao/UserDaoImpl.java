package org.scoula.jdbc_ex.dao;

import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    Connection conn = JDBCUtil.getConnection();

    // USERS 테이블 관련 SQL 명령어
    private String USER_LIST = "select * from users";
    private String USER_GET = "select * from users where id = ?";
    private String USER_INSERT = "insert into users values(?, ?, ?, ?)";
    private String USER_UPDATE = "update users set name = ?, role = ? where id = ?";
    private String USER_DELETE = "delete from users where id = ?";

    @Override
    public int create(UserVO user) throws SQLException {
        //1, 2, 3, 4 단계 코드
        //1,2 단계는 해놨기 때문에 함수호출만 하면 연결됨.
        //3,4 단계만 코드하면 됨.!
        PreparedStatement pstmt = conn.prepareStatement(USER_INSERT);
        System.out.println("3단계 : sql문 객체로 만들기 성공함.");
        pstmt.setString(1, user.getId()); //id를 넣음.
        pstmt.setString(2, user.getPassword()); //pw를 넣음.
        pstmt.setString(3, user.getName()); //name를 넣음.
        pstmt.setString(4, user.getRole()); //role를 넣음.

        //4단계 - sql문 db서버로 전송하고 뒷처리
        int count = pstmt.executeUpdate(); //insert문 결과는 실행된 row수
        System.out.println("실행될 row수 " + count);
        pstmt.close();
        return count;
    }

    @Override
    public List<UserVO> getList() throws SQLException {
        //3. SQL문 객체 생성
        PreparedStatement pstmt = conn.prepareStatement(USER_LIST);

        //4. select문을 mysql에 전송해보자.
        ResultSet rs = pstmt.executeQuery(); //select!
        //검색 행이 많은 경우에는
        //행하나당 vo가 하나가 필요
        //행이 여러개이면 이 vo를 넣어줄 list가 필요!
        List<UserVO> list = new ArrayList<UserVO>();

        while(rs.next()){ //반복할 때마다 다음 행을 가리키면서(cursor,커서) 있는지 체크해줌.
            //있으면, 각 컬럼값을 꺼내와서 vo(bag)에 넣어주자.
            UserVO user = new UserVO(); //가방만들어주기!
            user.setId(rs.getString("id")); //id는 컬럼명
            user.setName(rs.getString("name"));
            //컬럼명대신 resultset(table)에 있는 인덱스를 쓸 수 있다.
            //컬럼명을 더 권장!
            user.setPassword(rs.getString("password"));
            user.setRole(rs.getString("role"));
            list.add(user); //가방을 list에 넣어주자.!
        }

        pstmt.close();
        rs.close();
        return list; //자바는 리턴할 때 무조건 하나로 묶어주어야함.
    }

    @Override
    public UserVO get(String id) throws SQLException {
        //3. SQL문 객체 생성
        PreparedStatement pstmt = conn.prepareStatement(USER_GET);
        pstmt.setString(1, id);

        //4. select문을 mysql에 전송해보자.
        ResultSet rs = pstmt.executeQuery(); //select!
        UserVO user = new UserVO(); //가방만들어주기!
        if(rs.next()){
            //있으면, 각 컬럼값을 꺼내와서 vo(bag)에 넣어주자.
            user.setId(rs.getString("id")); //id는 컬럼명
            user.setName(rs.getString("name"));
            //컬럼명대신 resultset(table)에 있는 인덱스를 쓸 수 있다.
            //컬럼명을 더 권장!
            user.setPassword(rs.getString("password"));
            user.setRole(rs.getString("role"));
        }
        pstmt.close();
        rs.close();
        return user; //자바는 리턴할 때 무조건 하나로 묶어주어야함.
        //dao에서는 컬럼의 추출값을 묶어줄 때 vo를 사용함.!
    }

    @Override
    public int update(UserVO user) throws SQLException {
        return 0;
    }

    @Override
    public int delete(String id) throws SQLException {
        return 0;
    }
}