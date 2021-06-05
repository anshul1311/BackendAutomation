package utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;

import java.util.HashMap;

public interface RequestManager<T> {
    T getResponse();
}
