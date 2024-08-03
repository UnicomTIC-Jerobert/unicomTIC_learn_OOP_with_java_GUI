function populateForm() {
    try {
        // JSON Data - replace with your own JSON or fetch from an external source
        var jsonData = [
            {
                "question": "What is the capital of France?",
                "options": ["Berlin", "Paris", "Madrid", "Rome"],
                "correctAnswer": "Paris"
            },
            {
                "question": "What is 2 + 2?",
                "options": ["3", "4", "5", "6"],
                "correctAnswer": "4"
            }
            // Add more questions here
        ];

        // Get the active form
        var form = FormApp.getActiveForm();
        if (!form) {
            throw new Error("No active form found. Please make sure the script is attached to a Google Form.");
        }

        // Delete all existing questions
        var items = form.getItems();
        items.forEach(function (item) {
            form.deleteItem(item);
        });

        Logger.log("Existing questions deleted.");

        // Loop through the JSON data and create new questions
        jsonData.forEach(function (item, index) {
            try {
                var itemTitle = item.question;
                var itemOptions = item.options;

                if (!itemTitle || !itemOptions || itemOptions.length === 0) {
                    throw new Error(`Invalid data at index ${index}. Ensure that each question has a title and options.`);
                }

                // Create a multiple-choice question
                var question = form.addMultipleChoiceItem();
                question.setTitle(itemTitle)
                    .setChoiceValues(itemOptions)
                    .showOtherOption(false);

                // Correct answers will need to be set manually in the form after script runs

            } catch (questionError) {
                Logger.log(`Error adding question at index ${index}: ${questionError.message}`);
            }
        });

        Logger.log("Form populated with new questions successfully.");
    } catch (error) {
        Logger.log(`Error in populateForm: ${error.message}`);
    }
}
