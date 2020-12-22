import com.coolway.service.StudentService;
import com.coolway.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)//通知Junit4帮我们创建容器
@ContextConfiguration("classpath:applicationContext.xml")//指定容器的配置文件
public class StudentTest {
    @Resource(name = "StudentServiceImpl")
    private StudentServiceImpl studentService;

    @Test
    public void saveStudentTest1() {
        studentService.saveStudent();
    }
}
