import com.van.dao.AccountMapper;
import com.van.dao.TeacherMapper;
import com.van.pojo.Account;
import com.van.pojo.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void mybatisTest() throws IOException {
        String name = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(name);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accounts = mapper.getAccounts();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void integrateTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountMapper accountMapper = context.getBean("accountMapper", AccountMapper.class);
        List<Account> accounts = accountMapper.getAccounts();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void sqlSessionDaoSupportTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TeacherMapper teacherMapper = context.getBean("teacherMapper", TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.getTeacher(1);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
