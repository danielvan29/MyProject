import com.van.mapper.AccountMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisTest {

    @Test
    public void transactionTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountMapper accountMapper = context.getBean("accountMapper", AccountMapper.class);
        accountMapper.debitAndCredit("2", "1", 300);
    }

}
