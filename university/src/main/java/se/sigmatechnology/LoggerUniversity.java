package se.sigmatechnology;

import org.slf4j.LoggerFactory;
import se.sigmatechnology.controller.ControllerUniversity;

/**
 * Created by pke on 2017-09-22.
 */
public class LoggerUniversity {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(ControllerUniversity.class);

    public void sendTestInfo(){
        logger.info("This is a test.");
    }
}
