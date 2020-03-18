package co.bibleit.microservice.bibleparserendpoints.proxy;

import org.json.simple.JSONObject;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="bible-data-parser", url="localhost:8000")
@FeignClient(name="bible-data-parser")
@RibbonClient(name="bible-data-parser")
public interface BibleJSONParserProxy {

    @GetMapping("/api/bible-data-parser/bible")
    public JSONObject retrieveBibleJson();
}
