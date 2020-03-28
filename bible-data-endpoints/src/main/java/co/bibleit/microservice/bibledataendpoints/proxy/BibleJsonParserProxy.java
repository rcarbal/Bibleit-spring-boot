package co.bibleit.microservice.bibledataendpoints.proxy;

import org.json.simple.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="bible-json-parser", url="${JSON_PARSER_URI:http://localhost:8000}")
public interface BibleJsonParserProxy {

    @GetMapping("/bible-json-parser/bible")
    public JSONObject retrieveBibleJson();
}
