package cz.gyarab.e2prg.s1;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.Getter;
import lombok.ToString;

@ToString
public class Zvire {
    protected boolean jeZiva;

    @Getter
    private String jmeno;

    public Zvire(String jmeno) {
        this.jmeno = jmeno;
        this.jeZiva = true;
    }

    public static void main(String[] args) throws JsonProcessingException {
        Kocka k = new Kocka("Morek");

        XmlMapper mapper = new XmlMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String out = mapper.writeValueAsString(k);
        System.out.println(out);
    }
}
