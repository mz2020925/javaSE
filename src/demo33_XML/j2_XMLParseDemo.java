package demo33_XML;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class j2_XMLParseDemo {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        // 创建解析器
        SAXReader saxReader = new SAXReader();

        // 获取Document对象
        Document document = saxReader.read(new FileInputStream("src/demo33_XML/students.xml"));

        // 获取根节点对象
        Element rootElement = document.getRootElement();

        // 从根节点来查找其他的节点元素（标签），保存到集合中
        List<Element> elements = rootElement.elements("student");
        // 定义存储Student类的实例对象的集合
        List<Student> students = new ArrayList<>();

        // 遍历elements集合得到每一个student元素（标签），提取内容传入new Student()对象，在把该对象存入students集合中
        for (Element stuElement : elements) {
            // 获取student（标签）元素的id属性
            Attribute id = stuElement.attribute("id");
            // 获取id属性的值
            String idValue = id.getValue();

            // 获取name子元素（标签）
            Element name = stuElement.element("name");
            String nameText = name.getText();  // 获取子标签文本内容

            // 获取age子元素（标签）
            Element age = stuElement.element("age");
            String ageText = age.getText();  // 获取子标签文本内容

            // 获取address子元素（标签）
            Element address = stuElement.element("address");
            String addressText = address.getText();  // 获取子标签文本内容

            // 将上述从xml文件中获得数据传入到Student类的实例对象中
            Student stu = new Student();
            stu.setId(idValue);
            stu.setName(nameText);
            stu.setAge(ageText);
            stu.setAddress(addressText);

            // 把学生对象存储到前面定义的List<Student>集合中
            students.add(stu);
        }

        // 遍历打印List<Student>集合
        students.forEach(System.out::println);
    }
}
