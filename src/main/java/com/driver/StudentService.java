package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void addTeacher(Teacher teacher) {
        studentRepository.addTeacher(teacher);
    }

    public ResponseEntity<String> addStudentTeacherPair(String studentName, String teacherName) {
        // Implement logic to pair an existing student with a teacher and return an appropriate ResponseEntity
        return ResponseEntity.ok("New Student-teacher pair added successfully");
    }

    public ResponseEntity<Student> getStudentByName(String name) {
        Student student = studentRepository.getStudentByName(name);
        if (student != null) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Teacher> getTeacherByName(String name) {
        Teacher teacher = studentRepository.getTeacherByName(name);
        if (teacher != null) {
            return ResponseEntity.ok(teacher);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<List<String>> getStudentsByTeacherName(String teacherName) {
        List<String> students = studentRepository.getStudentsByTeacherName(teacherName);
        if (students != null) {
            return ResponseEntity.ok(students);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<List<String>> getAllStudents() {
        List<String> allStudents = studentRepository.getAllStudents();
        if (!allStudents.isEmpty()) {
            return ResponseEntity.ok(allStudents);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    public ResponseEntity<String> deleteTeacherByName(String teacherName) {
        // Implement logic to delete a teacher and their students
        // Return appropriate ResponseEntity
        return ResponseEntity.ok(teacherName + " removed successfully");
    }

    public ResponseEntity<String> deleteAllTeachers() {
        studentRepository.deleteAllTeachers();
        return ResponseEntity.ok("All teachers deleted successfully");
    }
}

