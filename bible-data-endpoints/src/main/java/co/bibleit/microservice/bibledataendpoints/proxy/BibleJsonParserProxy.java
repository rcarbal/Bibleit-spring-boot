package co.bibleit.microservice.bibledataendpoints.proxy;

import org.json.simple.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="bible-json-parser", url="${BIBLE_JSON_PARSER:http://localhost:8000}")
public interface BibleJsonParserProxy {

    @GetMapping("/bible-json-parser/bible")
    public JSONObject retrieveBibleJson();
}
