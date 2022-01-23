package study.aop.order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    void getProductById(String id);
    void getPriceById(String id);

}
