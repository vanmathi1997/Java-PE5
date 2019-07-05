import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    MainTest obj;
        @Before
        public void setup() {
            obj = new MainTest();
        }

        @After
        public void teardown() {
            obj = null;
        }

        @Test
        public void sorting_GivenObjectsShouldReturnSortedValues() {//test case for sorting objects
            Student s1 = new Student();
            s1.setId(2);s1.setAge(21);s1.setName("vanu");
            Student s2 = new Student();
            s2.setId(1);s2.setAge(20);s2.setName("Mathi");
            Student s3 = new Student();
            s3.setId(5);s3.setAge(22);s3.setName("Anu");
            Student s4 = new Student();
            s4.setId(9);s4.setAge(22);s4.setName("Geetha");
            Student s5 = new Student();
            s5.setId(3);s5.setAge(22);s5.setName("Sveni");
            List<Student> stu = new ArrayList();
            stu.add(s1);
            stu.add(s2);
            stu.add(s3);
            stu.add(s4);
            stu.add(s5);
            List<Student> expectOutput = new ArrayList();
            expectOutput.add(s5);
            expectOutput.add(s4);
            expectOutput.add(s3);
            expectOutput.add(s1);
            expectOutput.add(s2);
            Assert.assertEquals(expectOutput, obj.sorting(stu));
        }

        @Test
        public void givenObjectsShouldReturnNotEqual() {//test case for assert not equal
            Student s1 = new Student();
            s1.setId(2);s1.setAge(21);s1.setName("Kajol");
            Student s2 = new Student();
            s2.setId(1);s2.setAge(20);s2.setName("Deepa");
            Student s3 = new Student();
            s3.setId(5);s3.setAge(22);s3.setName("Anu");
            Student s4 = new Student();
            s4.setId(9);s4.setAge(22);s4.setName("Vanu");
            Student s5 = new Student();
            s5.setId(3);s5.setAge(22);s5.setName("Geetha");
            List<Student> stu = new ArrayList();
            stu.add(s1);
            stu.add(s2);
            stu.add(s3);
            stu.add(s4);
            stu.add(s5);
            List<Student> expectOutput = new ArrayList();
            expectOutput.add(s4);
            expectOutput.add(s3);
            expectOutput.add(s5);
            expectOutput.add(s1);
            expectOutput.add(s2);
            Assert.assertNotEquals(expectOutput, obj.sorting(stu));
        }
    }

