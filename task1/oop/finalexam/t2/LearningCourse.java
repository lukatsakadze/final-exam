package oop.finalexam.t2;

public class LearningCourse {
   private String title;
   private String acceptancePrerequisites;
   private String majorTopics;

   public LearningCourse(String title, String acceptancePrerequisites, String majorTopics) {
      this.title = title;
      this.acceptancePrerequisites = acceptancePrerequisites;
      this.majorTopics = majorTopics;
   }

   public String getTitle() {
      return this.title;
   }

   public String getAcceptancePrerequisites() {
      return this.acceptancePrerequisites;
   }

   public String getMajorTopics() {
      return this.majorTopics;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public void setAcceptancePrerequisites(String acceptancePrerequisites) {
      this.acceptancePrerequisites = acceptancePrerequisites;
   }

   public void setMajorTopics(String majorTopics) {
      this.majorTopics = majorTopics;
   }

   public String toString() {
      return "Course: " + this.title + "\n    Prerequisites: " + this.acceptancePrerequisites + "\n    Major Topics: " + this.majorTopics;
   }
}
