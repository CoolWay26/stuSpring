import java.util.concurrent.ConcurrentHashMap;

public class SomeTest {

    public void tryTest() throws Exception{

        try {
            throw new Exception("111");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("222");
        }

        ConcurrentHashMap chm = new ConcurrentHashMap();
    }



    public void tryTest2() throws Exception {
        tryTest();
    }
}
