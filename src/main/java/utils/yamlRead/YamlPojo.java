package utils.yamlRead;

import java.util.HashMap;

public class YamlPojo {

    private HashMap<String,String> bodyParameter;
    private HashMap<String,String> header;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public YamlPojo() {
    }


    public HashMap<String, String> getBodyParameter() {
        return bodyParameter;
    }

    public void setBodyParameter(HashMap<String, String> bodyParameter) {
        this.bodyParameter = bodyParameter;
    }

    public HashMap<String, String> getHeader() {
        return header;
    }

    public void setHeader(HashMap<String, String> header) {
        this.header = header;
    }

    public HashMap<String, String> getResult() {
        return result;
    }

    public void setResult(HashMap<String, String> result) {
        this.result = result;
    }

    private HashMap<String,String> result;
    /*public YamlRead(String testCaseName,String fileName){
        this.testCaseName=testCaseName;
        this.fileName=fileName;
    }

    public Map<String,String> getParameters(String parameterType){
        Yaml yaml=new Yaml();
        try{
            String fileName="src/test/resources/"+this.fileName+".yaml";
            InputStream in = new FileInputStream(fileName);

            int data=in.read();
            while(data!=-1){

            }


            Map<String,Map<String,String>> obj=yaml.load(in);
            List<Map<String, LinkedHashMap<String,String>>> parameter= (List<Map<String, LinkedHashMap<String, String>>>) obj.get(this.fileName);
            for(Map hm1: parameter){
                if(hm1.get("testCaseName").equals(this.testCaseName)){
                    return (Map<String, String>) hm1.get(parameterType);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/
}