import manager.GetApiManagerWithLatest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClass {

    @BeforeClass
    public void setup() {
        //Assert.assertEquals();
    }

    @Test
    public void hitApiWithLatest() throws IOException {
        GetApiManagerWithLatest meeshoPostApiManager = new GetApiManagerWithLatest("TestCase");
        System.out.println(meeshoPostApiManager.getResponseWithLatest().asString());

    }
    @Test
    public void hitApiWithUpcoming() throws IOException {
        GetApiManagerWithLatest meeshoPostApiManager = new GetApiManagerWithLatest("TestCase");
        System.out.println(meeshoPostApiManager.getResponseWithUpcoming().asString());

    }

    @Test
    public void hitApiWithPast() throws IOException {
        GetApiManagerWithLatest meeshoPostApiManager = new GetApiManagerWithLatest("TestCase");
        System.out.println(meeshoPostApiManager.getResponseWithPast().asString());

    }
}
