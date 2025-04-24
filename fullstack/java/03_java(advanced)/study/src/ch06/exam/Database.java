package ch06.exam;

public class Database {
    private String connection = "MySQL";

    private static Database database = new Database();

    private Database() {}

    public static Database getInstance() {
        return database;
    }

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }

    //메서드 추가
    public String getConnection() {
        return connection;
    }
}
