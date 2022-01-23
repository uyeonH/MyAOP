package study.aop.order.aop;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import java.time.LocalDateTime;

@Slf4j
@Aspect
public class TraceAspect {
    @Before("@annotation(study.aop.order.annotation.Trace)")
    public void start(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("[start] {} args={} time={}", joinPoint.getSignature(), args, LocalDateTime.now());
    }

    @After("@annotation(study.aop.order.annotation.Trace)")
    public void end(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("[end] {} args={} time={}", joinPoint.getSignature(), args, LocalDateTime.now());
    }


}
