package app;
import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

//db관련된 작업할 때 공통적인 절차는 모듈화를 통해
//분리시켜놓는 것이 편하다. 수정/삭제가 용이하다.
public class Database {
    static MongoClient client;
    static MongoDatabase database;
    static {
        ConnectionString connectionString = new ConnectionString("mongodb://127.0.0.1:27017");
        client = MongoClients.create(connectionString);
        database = client.getDatabase("todo_db");
    }
    public static void close() {
        client.close();
    }
    public static MongoDatabase getDatabase() {
        return database;
    }
    public static MongoCollection<Document> getCollection(String colName) {
        MongoCollection<Document> collection = database.getCollection(colName);
        return collection;
    }
}
