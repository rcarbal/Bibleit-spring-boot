package co.bibleit.microservice.bibledataendpoints.proxy;

import org.json.simple.JSONObject;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//The following one will not be valid if the json-parser is not loaded
//@FeignClient(value="bible-json-parser", url="${BIBLE_JSON_PARSER_SERVICE_HOST:http://localhost}:8000")
//@FeignClient(value="bible-json-parser", url="${JSON_PARSER_URI:http://localhost}:8000")
@FeignClient(name="bible-json-parser")
@RibbonClient(name="bible-json-parser")
public interface BibleJsonParserProxy {

    @GetMapping("/bible-json-parser/bible")
    public JSONObject retrieveBibleJson();
}
