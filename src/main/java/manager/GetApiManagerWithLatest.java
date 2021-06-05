package manager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.Assert;
import responsepojo.ResponseDtoLatest;
import utils.CommonApi;
import utils.RequestManager;
import utils.yamlRead.YamlRead;

import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;

public class GetApiManagerWithLatest extends CommonApi implements RequestManager<GetApiManagerWithLatest>  {


    YamlRead yamlRead;
    private HashMap<String,String> bodyParameters;;
    private HashMap<String,String> headers;

    private String uri="";
    GetApiManagerWithLatest getApiManagerWithLatest;

    public GetApiManagerWithLatest(String fileName) throws IOException {
        yamlRead=new YamlRead("TestCase");
        bodyParameters=yamlRead.getYamlPojo().getBodyParameter();
        headers=yamlRead.getYamlPojo().getHeader();
    }

    public Response getResponseWithUpcoming() throws JsonProcessingException {
        uri=yamlRead.getYamlPojo().getBodyParameter().get("upcoming");
    Response response=getApiResponse(uri,null,"",headers,200);
        verifyUpcomingResponse(response);
        return response;
    }

    public Response getResponseWithLatest() throws JsonProcessingException {
        uri=yamlRead.getYamlPojo().getBodyParameter().get("latest");
        Response response=getApiResponse(uri,null,"",headers,200);
        verifyLatestResponse(response);
        return response;
    }


    public Response getResponseWithPast() throws JsonProcessingException {
        uri=yamlRead.getYamlPojo().getBodyParameter().get("past");
        Response response=getApiResponse(uri,null,"",headers,200);
        verifyPastResponse(response);
        return response;
    }


    public GetApiManagerWithLatest getResponse() {
    return getApiManagerWithLatest;
    }

    public void verifyLatestResponse(Response response) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        ResponseDtoLatest responseDto=mapper.readValue(response.asString(), ResponseDtoLatest.class);
        Assert.assertEquals(responseDto.isUpcoming(),false);

    }

    public void verifyUpcomingResponse(Response response) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        ResponseDtoLatest[] responseDto=mapper.readValue(response.asString(), ResponseDtoLatest[].class);
        for(int i=0;i<responseDto.length;i++) {
            Assert.assertEquals(responseDto[i].isUpcoming(), true);
            Assert.assertTrue(responseDto[i].isAuto_update());
            //System.out.println(Long.valueOf(responseDto[i].getDate_unix())+ " "+Instant.now().to());
            Assert.assertTrue(Long.valueOf(responseDto[i].getDate_unix())> Instant.now().getEpochSecond());
        }

    }

    public void verifyPastResponse(Response response) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        ResponseDtoLatest[] responseDto=mapper.readValue(response.asString(), ResponseDtoLatest[].class);
        for(int i=0;i<responseDto.length;i++) {
            Assert.assertEquals(responseDto[i].isUpcoming(), false);
            Assert.assertTrue(Long.valueOf(responseDto[i].getDate_unix())< Instant.now().getEpochSecond());

        }
    }







}
