package utils.yamlRead;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class YamlRead {
    public YamlPojo getYamlPojo() {
        return yamlPojo;
    }

    public void setYamlPojo(YamlPojo yamlPojo) {
        this.yamlPojo = yamlPojo;
    }

    YamlPojo yamlPojo;
    public YamlRead(String filename) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper(new YAMLFactory());
        yamlPojo=objectMapper.readValue(new File("src/test/resources/"+filename+".yaml"),YamlPojo.class);
    }


}
