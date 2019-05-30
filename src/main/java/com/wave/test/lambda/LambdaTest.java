package com.wave.test.lambda;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * Created by Wave on 2019/5/20.
 */
public class LambdaTest {

    @Test
    public void collectTest() {
        List<Student> students = new ArrayList<>();

        students.add(Student.builder()
                .studentId("a")
                .name("张三")
                .sex("男")
                .dob(new DateTime("2000-01-01").toDate())
                .build());
        students.add(Student.builder()
                .studentId("b")
                .name("李四")
                .sex("男")
                .dob(new DateTime("2000-01-02").toDate())
                .build());
        students.add(Student.builder()
                .studentId("c")
                .name("王五")
                .sex("女")
                .dob(new DateTime("2000-01-01").toDate())
                .build());
        students.add(Student.builder()
                .studentId("d")
                .name("张三")
                .sex("女")
                .dob(new DateTime("1998-03-01").toDate())
                .build());

        List<String> names = students.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(names));

        students.sort(comparing(Student::getDob));
        System.out.println(JSONObject.toJSONString(students));
    }
}

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Student {

    private String studentId;
    private String name;
    private String sex;
    private Date dob;
}