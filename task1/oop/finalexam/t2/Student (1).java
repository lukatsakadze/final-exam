package oop.finalexam.t2;

import java.util.ArrayList;
import java.util.List;

public class Student {
   private String name;
   private String idNumber;
   private String email;
   private String universityName;
   private List<LearningCourse> learningCourses;

   public Student(String name, String idNumber, String email, String universityName) {
      this.name = name;
      this.idNumber = idNumber;
      this.email = email;
      this.universityName = universityName;
      this.learningCourses = new ArrayList();
   }

   public String getName() {
      return this.name;
   }

   public String getIdNumber() {
      return this.idNumber;
   }

   public String getEmail() {
      return this.email;
   }

   public String getUniversityName() {
      return this.universityName;
   }

   public List<LearningCourse> getLearningCourses() {
      return this.learningCourses;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setIdNumber(String idNumber) {
      this.idNumber = idNumber;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setUniversityName(String universityName) {
      this.universityName = universityName;
   }

   public void setLearningCourses(List<LearningCourse> learningCourses) {
      this.learningCourses = learningCourses;
   }

   public void addLearningCourse(LearningCourse course) {
      this.learningCourses.add(course);
   }

   public void removeLearningCourse(LearningCourse course) {
      this.learningCourses.remove(course);
   }
}
