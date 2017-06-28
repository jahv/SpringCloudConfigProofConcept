package jahv.test.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ClientController {

    @Value("${application.description}")
    String name;

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public Map<String, String> data() {
        Map<String, String> data = new HashMap<>();
        data.put("appName", name);
        return data;
    }
}
