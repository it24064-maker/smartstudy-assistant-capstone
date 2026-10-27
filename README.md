# smartstudy-assistant-capstoneSmartStudy Assistant (SSA)
An object-oriented Java application built to streamline student workload management, study resource tracking, and academic scheduling.

 Overview
SmartStudy Assistant (SSA) serves as the core domain model for an adaptive learning dashboard. It manages users, tracks pending assignments with strict due dates, organizes study resources across file formats, and establishes a modular foundation for adaptive quizzes and self-assessment routines.                  
**User:** Encapsulates student profile data (userId, name).

**Task:** Represents actionable assignments or milestones, complete with due dates and completion flags.

**StudyMaterial**: Organizes study files, slides, and reference materials by file type.

**Quiz:** Models self-assessment tests tied to specific subjects and question counts.

StudyDashboard: The central controller aggregating user data, task tracking, and resource management.

** Tech Stack & Requirements**
Language: Java 8 or higher

JDK: Standard Development Kit (java.util.ArrayList, java.util.List)

Environment: Any standard Java IDE (Eclipse, IntelliJ IDEA, VS Code) or CLI


** Getting Started**
1. Clone or Download the Code
Save the Java code into a file named SmartStudyAssistant.java.

2. Compile the Application
Open your terminal or command prompt in the project directory and run:

Bash
javac SmartStudyAssistant.java
3. Run the Application
Execute the compiled class:

Bash
java SmartStudyAssistant
 **Sample Output**
Running the program produces the following console output:

Plaintext
Task Added: Complete ICT 3107 Capstone Proposal
Material Added: Java OOP Lecture Notes

**--- Welcome Samiul to SmartStudy Dashboard ---**
Total Pending Tasks: 1
Total Study Materials: 1
