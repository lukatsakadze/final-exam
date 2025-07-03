package oop.finalexam.t2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UMS {
   private List<Student> students = new ArrayList();

   public UMS() {
      this.initializeStudents();
   }

   private void initializeStudents() {
      Student luka = new Student("Luka Tsakadze", "65001001206", "tsakadzeluka53@gmail.com", "Ilia State University");
      luka.addLearningCourse(new LearningCourse("Object Oriented Programming", "CS 50 course", "Java syntax and data structures, classes, packages"));
      luka.addLearningCourse(new LearningCourse("Mathematical Foundations", "Calculus 1 and CS50", "Mathematical logic"));
      luka.addLearningCourse(new LearningCourse("English", "English C1", "English language skills"));
      luka.addLearningCourse(new LearningCourse("Computer Organisation", "CS50", "C and machine level programming"));
      luka.addLearningCourse(new LearningCourse("Calculus 2", "Calc 1", "Integrals"));
      this.students.add(luka);
      Student anna = new Student("Anna Beridze", "65001001207", "anna.beridze@student.iliauni.edu.ge", "Ilia State University");
      anna.addLearningCourse(new LearningCourse("Object Oriented Programming", "CS 50 course", "Java syntax and data structures, classes, packages"));
      anna.addLearningCourse(new LearningCourse("Calculus 2", "Calc 1", "Integrals"));
      anna.addLearningCourse(new LearningCourse("Computer Organisation", "CS50", "C and machine level programming"));
      this.students.add(anna);
      Student giorgi = new Student("Giorgi Maisuradze", "65001001208", "giorgi.maisuradze@student.iliauni.edu.ge", "Ilia State University");
      giorgi.addLearningCourse(new LearningCourse("Mathematical Foundations", "Calculus 1 and CS50", "Mathematical logic"));
      giorgi.addLearningCourse(new LearningCourse("English", "English C1", "English language skills"));
      giorgi.addLearningCourse(new LearningCourse("Object Oriented Programming", "CS 50 course", "Java syntax and data structures, classes, packages"));
      giorgi.addLearningCourse(new LearningCourse("Calculus 2", "Calc 1", "Integrals"));
      this.students.add(giorgi);
   }

   public void printStudentData(Student student) {
      System.out.println("========================================");
      System.out.println("STUDENT INFORMATION");
      System.out.println("========================================");
      System.out.println("Name: " + student.getName());
      System.out.println("ID Number: " + student.getIdNumber());
      System.out.println("Email: " + student.getEmail());
      System.out.println("University: " + student.getUniversityName());
      System.out.println();
      System.out.println("LEARNING COURSES FOR " + student.getName().toUpperCase());
      System.out.println("========================================");
      if (student.getLearningCourses().isEmpty()) {
         System.out.println("No courses enrolled.");
      } else {
         for(int i = 0; i < student.getLearningCourses().size(); ++i) {
            System.out.println(i + 1 + ". " + String.valueOf(student.getLearningCourses().get(i)));
            System.out.println();
         }
      }

      System.out.println("========================================");
   }

   public List<Student> getStudents() {
      return this.students;
   }

   public void addStudent(Student student) {
      this.students.add(student);
   }

   public Student findStudentById(String idNumber) {
      Iterator var2 = this.students.iterator();

      Student student;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         student = (Student)var2.next();
      } while(!student.getIdNumber().equals(idNumber));

      return student;
   }

   public Student findStudentByName(String name) {
      Iterator var2 = this.students.iterator();

      Student student;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         student = (Student)var2.next();
      } while(!student.getName().equalsIgnoreCase(name));

      return student;
   }

   public static void main(String[] args) {
      UMS ums = new UMS();
      System.out.println("UNIVERSITY MANAGEMENT SYSTEM");
      System.out.println("Total Students: " + ums.getStudents().size());
      System.out.println();
      Iterator var2 = ums.getStudents().iterator();

      while(var2.hasNext()) {
         Student student = (Student)var2.next();
         ums.printStudentData(student);
         System.out.println();
      }

      System.out.println("FINDING SPECIFIC STUDENT:");
      Student luka = ums.findStudentById("65001001206");
      if (luka != null) {
         System.out.println("Found student: " + luka.getName());
         ums.printStudentData(luka);
      }

   }
}
