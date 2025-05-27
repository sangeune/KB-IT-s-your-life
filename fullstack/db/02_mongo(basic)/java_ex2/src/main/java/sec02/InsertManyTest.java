package sec02;
import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertManyResult;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
public class InsertManyTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("todo");

        List<Document> insertList = new ArrayList<>();

        Document document1 = new Document();
        Document document2 = new Document();

        document1.append("title", "MongoDB1");
        document1.append("desc", "MongoDB 공부하기1");
        document1.append("done", false);

        document2.append("title", "MongoDB2");
        document2.append("desc", "MongoDB 공부하기2");
        document2.append("done", true);

        insertList.add(document1);
        insertList.add(document2);

        InsertManyResult result = collection.insertMany(insertList);
        System.out.println("==> InsertManyResult : " + result.getInsertedIds());

        Database.close();
    }
}