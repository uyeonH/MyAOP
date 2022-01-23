package study.aop.order;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import study.aop.order.aop.TraceAspect;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
@Import(TraceAspect.class)
@SpringBootTest
class OrderServiceTest {
    @Autowired
    OrderServiceImpl orderServiceImpl;

    @Test
    void test() {
        for (int i = 0; i < 3; i++) {
            log.info("orderService getProductById i={}",i);
            orderServiceImpl.getProductById(""+i);
        }

    }

}