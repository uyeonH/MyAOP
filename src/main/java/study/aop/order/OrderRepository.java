package study.aop.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import study.aop.order.annotation.Trace;
@Slf4j
@Repository
public class OrderRepository {

    @Trace
    public String getProductById(String id){
        //log.info("getProductById");
        return "ok";
    }

    @Trace
    public String getPriceById(String id){
        //log.info("getProductById");
        return "ok";
    }
}
