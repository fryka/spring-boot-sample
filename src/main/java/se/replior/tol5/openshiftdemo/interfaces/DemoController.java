package se.replior.tol5.openshiftdemo.interfaces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;
import java.util.Enumeration;

@RestController
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @GetMapping(value = "/")
    public ResponseEntity<?> getDetails(HttpServletRequest httpServletRequest) {

        LOGGER.info("GetDetails called with headers - " );
        Enumeration names = httpServletRequest.getHeaderNames();
        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();
            Enumeration values = httpServletRequest.getHeaders(name); // support multiple values
            if (values != null) {
                while (values.hasMoreElements()) {
                    String value = (String) values.nextElement();
                    LOGGER.info(name + ": " + value);
                }
            }
        }
        return ResponseEntity.ok(new ResponseDto());
    }
}
