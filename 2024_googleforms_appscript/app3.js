function populateFormWithSections() {
    try {
      // JSON Data - structured with sections and questions
      var jsonData = [
        {
          "sectionTitle": "SQL Basics",
          "questions": [
            {
              "question": "What does SQL stand for?",
              "options": ["Structured Query Language", "Simple Query Language", "Structured Question Language", "Standard Query Language"],
              "correctAnswer": "Structured Query Language"
            },
            {
              "question": "Which SQL statement is used to retrieve data from a database?",
              "options": ["GET", "OPEN", "SELECT", "RETRIEVE"],
              "correctAnswer": "SELECT"
            },
            {
              "question": "Which SQL statement is used to update data in a database?",
              "options": ["MODIFY", "UPDATE", "SAVE", "INSERT"],
              "correctAnswer": "UPDATE"
            },
            {
              "question": "Which SQL keyword is used to sort the result-set?",
              "options": ["ORDER", "SORT", "ARRANGE", "ORDER BY"],
              "correctAnswer": "ORDER BY"
            },
            {
              "question": "What is the correct SQL syntax to return all the columns from a table named 'Customers'?",
              "options": ["SELECT * FROM Customers", "SELECT Customers", "SHOW Customers", "LIST Customers"],
              "correctAnswer": "SELECT * FROM Customers"
            }
          ]
        },
        {
          "sectionTitle": "SQL Joins",
          "questions": [
            {
              "question": "Which SQL JOIN returns all records when there is a match in either left or right table?",
              "options": ["INNER JOIN", "LEFT JOIN", "RIGHT JOIN", "FULL JOIN"],
              "correctAnswer": "FULL JOIN"
            },
            {
              "question": "What does the INNER JOIN keyword do?",
              "options": ["Returns all rows when there is at least one match in both tables", "Returns all rows from the left table", "Returns all rows from the right table", "Returns all rows regardless of a match"],
              "correctAnswer": "Returns all rows when there is at least one match in both tables"
            },
            {
              "question": "Which JOIN clause is used to combine rows from two or more tables, based on a related column between them?",
              "options": ["JOIN", "UNITE", "MERGE", "CONNECT"],
              "correctAnswer": "JOIN"
            },
            {
              "question": "What type of join is used when you need to return all rows from the right table, and the matched rows from the left table?",
              "options": ["RIGHT JOIN", "INNER JOIN", "OUTER JOIN", "FULL JOIN"],
              "correctAnswer": "RIGHT JOIN"
            },
            {
              "question": "Which SQL clause is used to group rows that have the same values in specified columns?",
              "options": ["GROUP BY", "ORDER BY", "PARTITION BY", "FILTER BY"],
              "correctAnswer": "GROUP BY"
            }
          ]
        },
        {
          "sectionTitle": "SQL Functions",
          "questions": [
            {
              "question": "Which function returns the smallest integer greater than or equal to a specified number?",
              "options": ["FLOOR()", "ROUND()", "CEILING()", "ABS()"],
              "correctAnswer": "CEILING()"
            },
            {
              "question": "Which SQL function is used to count the number of rows in a table?",
              "options": ["SUM()", "COUNT()", "TOTAL()", "AGGREGATE()"],
              "correctAnswer": "COUNT()"
            },
            {
              "question": "What does the SQL MIN() function do?",
              "options": ["Returns the minimum value in a set", "Returns the maximum value in a set", "Returns the average value in a set", "Returns the sum of all values in a set"],
              "correctAnswer": "Returns the minimum value in a set"
            },
            {
              "question": "Which function is used to extract a part of a string in SQL?",
              "options": ["PART()", "SUBSTRING()", "EXTRACT()", "SLICE()"],
              "correctAnswer": "SUBSTRING()"
            },
            {
              "question": "How do you return the current date in SQL?",
              "options": ["GETDATE()", "CURRENT_DATE()", "NOW()", "TODAY()"],
              "correctAnswer": "CURRENT_DATE()"
            }
          ]
        },
        {
          "sectionTitle": "SQL Data Types",
          "questions": [
            {
              "question": "Which SQL data type is used to store integer values?",
              "options": ["INT", "STRING", "FLOAT", "BOOLEAN"],
              "correctAnswer": "INT"
            },
            {
              "question": "What is the maximum length of a VARCHAR data type in SQL?",
              "options": ["255", "1024", "32767", "65535"],
              "correctAnswer": "65535"
            },
            {
              "question": "Which data type is used to store decimal numbers in SQL?",
              "options": ["DECIMAL", "INTEGER", "CHAR", "TEXT"],
              "correctAnswer": "DECIMAL"
            },
            {
              "question": "Which SQL data type is used to store a sequence of characters?",
              "options": ["CHAR", "TEXT", "VARCHAR", "STRING"],
              "correctAnswer": "VARCHAR"
            },
            {
              "question": "What data type should be used to store a date and time value in SQL?",
              "options": ["DATETIME", "DATE", "TIMESTAMP", "TIME"],
              "correctAnswer": "DATETIME"
            }
          ]
        },
        {
          "sectionTitle": "Advanced SQL",
          "questions": [
            {
              "question": "What is a stored procedure in SQL?",
              "options": ["A prepared SQL code that you can save and reuse", "A method to store data", "A type of SQL query", "A way to format data"],
              "correctAnswer": "A prepared SQL code that you can save and reuse"
            },
            {
              "question": "Which SQL clause is used to restrict the number of rows returned by a query?",
              "options": ["LIMIT", "ROWNUM", "OFFSET", "TOP"],
              "correctAnswer": "LIMIT"
            },
            {
              "question": "What does the SQL 'HAVING' clause do?",
              "options": ["Filters groups based on a condition", "Limits the result set", "Orders the result set", "Combines result sets"],
              "correctAnswer": "Filters groups based on a condition"
            },
            {
              "question": "What is the purpose of the SQL 'UNION' operator?",
              "options": ["Combines the result sets of two or more queries", "Returns only distinct values", "Filters data", "Sorts data"],
              "correctAnswer": "Combines the result sets of two or more queries"
            },
            {
              "question": "What does the 'INDEX' do in SQL?",
              "options": ["Speeds up data retrieval operations on a database table", "Sorts the table in ascending order", "Deletes duplicate rows", "Creates a backup of the table"],
              "correctAnswer": "Speeds up data retrieval operations on a database table"
            }
          ]
        }
      ];
  
      // Get the active form
      var form = FormApp.getActiveForm();
      if (!form) {
        throw new Error("No active form found. Please make sure the script is attached to a Google Form.");
      }
  
      // Delete all existing items (questions and sections)
      var items = form.getItems();
      items.forEach(function(item) {
        form.deleteItem(item);
      });
  
      Logger.log("Existing questions and sections deleted.");
  
      // Loop through the JSON data and create sections and questions
      jsonData.forEach(function(section, sectionIndex) {
        try {
          // Add a new section header
          var sectionItem = form.addSectionHeaderItem();
          sectionItem.setTitle(section.sectionTitle);
  
          // Add a break to ensure sections are visible separately
          form.addPageBreakItem(); 
  
          // Add questions to the section
          section.questions.forEach(function(item, questionIndex) {
            try {
              var question = form.addMultipleChoiceItem();
              question.setTitle(item.question)
                      .setChoiceValues(item.options)
                      .showOtherOption(false);
  
            } catch (questionError) {
              Logger.log(`Error adding question at index ${questionIndex} in section ${sectionIndex}: ${questionError.message}`);
            }
          });
  
        } catch (sectionError) {
          Logger.log(`Error adding section at index ${sectionIndex}: ${sectionError.message}`);
        }
      });
  
      Logger.log("Form populated with sections and SQL quizzes successfully.");
    } catch (error) {
      Logger.log(`Error in populateFormWithSections: ${error.message}`);
    }
  }
  