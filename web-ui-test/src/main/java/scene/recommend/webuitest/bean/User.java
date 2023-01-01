package scene.recommend.webuitest.bean;

import lombok.Data;

import java.util.Map;

@Data
public class User {
    private String email;
    private String pwd;
    private Map<String, String> exp;
}
