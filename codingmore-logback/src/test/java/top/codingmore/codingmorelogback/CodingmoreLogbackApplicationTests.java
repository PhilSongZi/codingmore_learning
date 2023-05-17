package top.codingmore.codingmorelogback;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class CodingmoreLogbackApplicationTests {

    static Logger logger = LoggerFactory.getLogger(CodingmoreLogbackApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("logback testing...");
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);
    }

    @Test
    void testSlf4j() {
        log.info("小子松是个大笨蛋。。。");
    }

}
