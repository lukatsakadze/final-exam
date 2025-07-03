# University Management System (UMS)

## Overview

The University Management System (UMS) is a Java-based application designed to manage student information and their enrolled learning courses. The system provides a comprehensive solution for tracking students and their academic progress through various courses offered by the university.

## Program Description

The UMS consists of three main components:

1. **LearningCourse Class**: Represents individual academic courses with their properties
2. **Student Class**: Represents students with their personal information and enrolled courses
3. **UMS Class**: Main management system that handles collections of students and provides data processing methods

## Features

- **Student Management**: Store and manage student information including name, ID, email, and university
- **Course Management**: Track learning courses with prerequisites and major topics
- **Data Display**: Print comprehensive student information with all enrolled courses
- **Student Search**: Find students by ID or name
- **Course Enrollment**: Add and remove courses for students

## System Architecture

### Class Structure

The system follows object-oriented programming principles with clear separation of concerns:

- **Data Models**: LearningCourse and Student classes serve as data containers
- **Business Logic**: UMS class handles all management operations
- **Encapsulation**: All classes use private fields with public getters and setters

## UML Class Diagram

```
┌─────────────────────────────────────┐
│            LearningCourse           │
├─────────────────────────────────────┤
│ - title: String                     │
│ - acceptancePrerequisites: String   │
│ - majorTopics: String               │
├─────────────────────────────────────┤
│ + LearningCourse(title, prereq,     │
│   topics)                           │
│ + getTitle(): String                │
│ + setTitle(title: String): void     │
│ + getAcceptancePrerequisites():     │
│   String                            │
│ + setAcceptancePrerequisites(       │
│   prereq: String): void             │
│ + getMajorTopics(): String          │
│ + setMajorTopics(topics: String):   │
│   void                              │
│ + toString(): String                │
└─────────────────────────────────────┘
                    │
                    │ 1..*
                    │
                    ▼
┌─────────────────────────────────────┐
│              Student                │
├─────────────────────────────────────┤
│ - name: String                      │
│ - idNumber: String                  │
│ - email: String                     │
│ - universityName: String            │
│ - learningCourses: List<Learning    │
│   Course>                           │
├─────────────────────────────────────┤
│ + Student(name, id, email, univ)    │
│ + getName(): String                 │
│ + setName(name: String): void       │
│ + getIdNumber(): String             │
│ + setIdNumber(id: String): void     │
│ + getEmail(): String                │
│ + setEmail(email: String): void     │
│ + getUniversityName(): String       │
│ + setUniversityName(univ: String):  │
│   void                              │
│ + getLearningCourses(): List<       │
│   LearningCourse>                   │
│ + setLearningCourses(courses: List  │
│   <LearningCourse>): void           │
│ + addLearningCourse(course:         │
│   LearningCourse): void             │
│ + removeLearningCourse(course:      │
│   LearningCourse): void             │
└─────────────────────────────────────┘
                    │
                    │ 1..*
                    │
                    ▼
┌─────────────────────────────────────┐
│               UMS                   │
├─────────────────────────────────────┤
│ - students: List<Student>           │
├─────────────────────────────────────┤
│ + UMS()                             │
│ - initializeStudents(): void        │
│ + printStudentData(student:         │
│   Student): void                    │
│ + getStudents(): List<Student>      │
│ + addStudent(student: Student):     │
│   void                              │
│ + findStudentById(id: String):      │
│   Student                           │
│ + findStudentByName(name: String):  │
│   Student                           │
│ + main(args: String[]): void        │
└─────────────────────────────────────┘
```

## Detailed Class Descriptions

### LearningCourse Class

**Purpose**: Represents an academic course with its essential properties.

**Fields**:
- `title`: Course name (e.g., "Object Oriented Programming")
- `acceptancePrerequisites`: Required prerequisite courses (e.g., "CS 50 course")
- `majorTopics`: Main topics covered in the course (e.g., "Java syntax and data structures")

**Key Methods**:
- Constructor for initialization
- Getters and setters for all fields (mandatory requirement)
- `toString()` method for formatted display

### Student Class

**Purpose**: Represents a university student with personal information and enrolled courses.

**Fields**:
- `name`: Student's full name
- `idNumber`: Unique student identification number
- `email`: Student's email address
- `universityName`: Name of the university
- `learningCourses`: List of enrolled courses

**Key Methods**:
- Constructor for initialization
- Getters and setters for all fields
- `addLearningCourse()`: Enroll in a new course
- `removeLearningCourse()`: Drop a course

### UMS Class

**Purpose**: Main management system that handles student collections and operations.

**Fields**:
- `students`: List of all students in the system

**Key Methods**:
- `printStudentData()`: **Core requirement** - displays student information and all enrolled courses
- `findStudentById()`: Search functionality by ID
- `findStudentByName()`: Search functionality by name
- `initializeStudents()`: Initialize system with sample data

## Sample Data

The system includes real student data as specified:

### Luka Tsakadze (Primary Student)
- **ID**: 65001001206
- **Email**: tsakadzeluka53@gmail.com
- **University**: Ilia State University
- **Courses**:
  1. Object Oriented Programming (Prerequisites: CS 50 course, Topics: Java syntax and data structures, classes, packages)
  2. Mathematical Foundations (Prerequisites: Calculus 1 and CS50, Topics: Mathematical logic)
  3. English (Prerequisites: English C1, Topics: English language skills)
  4. Computer Organisation (Prerequisites: CS50, Topics: C and machine level programming)
  5. Calculus 2 (Prerequisites: Calc 1, Topics: Integrals)

### Additional Students
- **Anna Beridze**: Enrolled in OOP, Calculus 2, and Computer Organisation
- **Giorgi Maisuradze**: Enrolled in Mathematical Foundations, English, OOP, and Calculus 2

## Implementation Details

### Data Storage
- Uses `ArrayList` for dynamic collection management
- No database dependency - all data stored in memory
- Proper encapsulation with private fields and public accessors

### Output Format
The `printStudentData()` method provides:
- Clear section headers
- Complete student information
- Formatted course listing with all properties
- Visual separation between different students

### Error Handling
- Null checks for student searches
- Safe list operations
- Proper initialization of collections

## Usage Instructions

1. **Compile the Java files**:
   ```bash
   javac *.java
   ```

2. **Run the main program**:
   ```bash
   java UMS
   ```

3. **Expected Output**:
   - System displays total number of students
   - Complete information for each student
   - All enrolled courses with full details
   - Demonstration of search functionality

## Key Requirements Fulfilled

✅ **UMS Class**: Contains list of students with learning courses  
✅ **Learning Course Properties**: Title, prerequisites, major topics (all String type)  
✅ **Getters and Setters**: Mandatory accessors implemented  
✅ **printStudentData Method**: Displays student info and courses clearly  
✅ **Real Student Data**: Exact Argus data for Luka Tsakadze included  
✅ **Additional Students**: Two extra students with course assignments  
✅ **Three File Structure**: Separated into LearningCourse, Student, and UMS classes  

## Future Enhancements

- Database integration for persistent storage
- Course scheduling and conflict detection
- Grade management system
- Advanced search and filtering capabilities
- Web-based user interface
- Export functionality for reports