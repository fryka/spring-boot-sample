package se.replior.tol5.openshiftdemo.interfaces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;

@RestController
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @GetMapping(value = "/")
    public ResponseEntity<?> getDetails(HttpServletRequest httpServletRequest) {

        LOGGER.info("GetDetails called - ",httpServletRequest );
        return ResponseEntity.ok(new ResponseDto());
    }
}
