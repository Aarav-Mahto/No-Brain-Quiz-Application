# No Brain Quiz Application

## 📋 Overview
**No Brain Quiz Application** is a simple desktop-based quiz application developed using **Java Swing**, **JDBC**, and **MySQL**. It is designed to offer an engaging and interactive quiz experience with 10 multiple-choice questions (MCQs) on various topics. The user selects answers from four options, with only one correct answer per question. After completing the quiz, the application calculates and displays the score, showing the number of correct and incorrect answers. 

A **timer feature** is implemented to make the quiz time-limited, giving the user 10 minutes to complete all 10 questions.

## 🖥️ Technologies Used
- **Java**
- **Swing** (for creating the user interface)
- **JDBC** (for database connectivity)
- **MySQL** (used to store questions, options, and answers)

## 🚀 Features
- **User Interface**: The application uses Swing components such as `JFrame`, `JLabel`, `JButton`, and `JRadioButton` to create an interactive and easy-to-use interface.
- **Database Integration**: The quiz questions, options, and correct answers are stored in a MySQL database. JDBC is used to retrieve data dynamically.
- **Quiz Format**: 
  - 10 multiple-choice questions.
  - Four options per question, with only one correct answer.
  - User selects the answer, and the app tracks responses.
- **Timer Feature**: 
  - A countdown timer is set for **10 minutes** to complete the entire quiz of 10 questions.
  - The timer runs while the quiz is active, and automatically submits the quiz when time runs out.
- **Score Calculation**: After completing the quiz, the application displays:
  - Total number of questions answered correctly.
  - Number of incorrect answers.
  - Total score based on correct answers.

## 📝 How to Use
1. **Setup MySQL Database**:
   - Create a database in MySQL and add the necessary tables (`questions`, `options`, `answers`).
   - Populate the tables with quiz data (questions, multiple-choice options, and the correct answer).
   
2. **Run the Application**:
   - Open the `NoBrainQuizApplication.java` file in your IDE or command line.
   - Make sure you have the appropriate JDBC driver configured for MySQL.
   - Execute the application, and the quiz window will open.

3. **Take the Quiz**:
   - The timer will start as soon as the quiz begins, giving you **10 minutes** to answer all 10 questions.
   - Select an answer for each question.
   - Once all questions are answered or the time runs out, click the "Submit" button to see your score.

