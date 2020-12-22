import com.coolway.bean.User;
import com.coolway.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private User user;

//    @Autowired
//    @Qualifier("StudentServiceImpl")
    @Resource
    private StudentServiceImpl studentService111;

    @Test
    public void sout() {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User) ac.getBean("User");
//        System.out.println(user.getName() + "sss");
        studentService111.getStudent();
    }
}
