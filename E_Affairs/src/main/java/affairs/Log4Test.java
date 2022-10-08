package affairs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kinoz
 * @Date 2022/7/29 - 9:41
 * @apiNote 手动输出log4j信息
 */
public class Log4Test {
    private static final Logger log = LoggerFactory.getLogger(Log4Test.class);

    public static void main(String[] args) {
        log.info("hello log4j");
        log.debug("hello log4j");
        log.error("hello log4j");
    }
}
