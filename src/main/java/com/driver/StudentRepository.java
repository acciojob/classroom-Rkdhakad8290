
package com.driver;

        import org.springframework.stereotype.Repository;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

@Repository
public class StudentRepository {

    private Map<String, Student> students = new HashMap<>();
    private Map<String, Teacher> teachers = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getName(), student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.put(teacher.getName(), teacher);
    }

    public void addStudentTeacherPair(String studentName, String teacherName) {
        // Implement logic to pair a student with a teacher
    }

    public Student getStudentByName(String name) {
        return students.get(name);
    }

    public Teacher getTeacherByName(String name) {
        return teachers.get(name);
    }

    public List<String> getStudentsByTeacherName(String teacherName) {
        // Implement logic to get a list of students by teacher name
        return null;
    }

    public List<String> getAllStudents() {
        return new ArrayList<>(students.keySet());
    }

    public void deleteTeacherByName(String teacherName) {
        // Implement logic to delete a teacher and their students
    }

    public void deleteAllTeachers() {
        teachers.clear();
        students.clear();
    }
}

