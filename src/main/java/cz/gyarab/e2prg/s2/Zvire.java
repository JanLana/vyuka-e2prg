package cz.gyarab.e2prg.s2;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.ToString;

@ToString
public class Zvire {
    private String jmeno;
    protected boolean jeZive;

    public String getJmeno() {
        return jmeno;
    }

    public Zvire(String jmeno) {
        this.jmeno = jmeno;
        jeZive = true;
    }


    public static void main(String[] args) throws JsonProcessingException {
        Kocka k = new Kocka("Mikes");
        Had h = new Had("nagini", 20);

        ObjectMapper mapper1 = new ObjectMapper();
        ObjectMapper mapper2 = new ObjectMapper(new XmlFactory());
        ObjectMapper mapper3 = new ObjectMapper(new YAMLFactory());

        mapper1.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper2.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper3.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        //mapper.enable(SerializationFeature.INDENT_OUTPUT);

        System.out.println(mapper1.writeValueAsString(k));
        System.out.println(mapper2.writeValueAsString(k));
        System.out.println("===");
        System.out.println(mapper3.writeValueAsString(k));



    }
}
