import com.coolway.bean.Student;
import com.coolway.dao.StudentMapper;
import com.coolway.dao.StudentSpringDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//通知Junit4帮我们创建容器
@ContextConfiguration("classpath:applicationContext.xml")//指定容器的配置文件
public class StudentSpringDaoTest {
    @Resource(name = "studentSpringDao")
    private StudentSpringDao studentSpringDao;

    @Resource(name = "studentMapper")
    private StudentMapper studentMapper;


    @Test
    public void queryByIdsTest() {
        List<String> list = new ArrayList<String>();
        list.add("20200001");
        list.add("20200002");
//        List<Student> studentList = studentSpringDao.queryStudentByIds(list);
        List<Student> studentList = studentMapper.queryStudentByIds(list);
        for (Student student : studentList) {
            System.out.println(student.getName());
        }
    }


}
