package study.aop.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import study.aop.order.annotation.Trace;

@Slf4j
@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Trace
    @Override
    public void getProductById(String id) {
        orderRepository.getProductById(id);
    }

    @Trace
    @Override
    public void getPriceById(String id) {
        orderRepository.getPriceById(id);
    }
}
