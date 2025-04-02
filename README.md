# Meal Suggestion App
#youtube link to demo video - https://youtu.be/a06As2gijQM
#Github Repository - https://github.com/2dax3reme/Meal_Suggestion_App_st10477052 

This simple Android app suggests a meal based on the time of day you input.

## Features

-   Suggests a random meal from a predefined list based on the user's input (Morning, Mid Morning, Afternoon, Mid Afternoon, Dinner).
-   Handles invalid input:
    -   Displays an error message if the user enters an integer.
    -   Displays an error message if the user enters characters other than letters or spaces.
    -   Displays an error message if the user enters a time in analog format (HHmm).
    -   Displays a generic error message for other invalid inputs.
-   Provides a "Clear" button to clear the input field and the output display.
-   Case-insensitive input for meal times (e.g., "morning", "Morning", "MoRnInG" are all accepted).

## List of Valid inputs
-Morning , Breakfast
-Mid-morning ,light snack ,mid morning snack
-afternoon ,lunch
-Afternoon snack, mid Afternoon snack, Quick Bites
-Dinner , Main course 
- After Dinner , Desert 

## Code Structure

The app's core logic is in the `MainActivity.kt` file.

**Key Components:**

-   `edtTime`:  An `EditText` field where the user inputs the time of day.
-   `refreshButton`: A `Button` that triggers the meal suggestion logic.
-   `answerBox`: A `TextView` that displays the suggested meal or an error message.
-   `real_refresh_button`: A `Button` labeled "Clear" to clear the input and output.
-   `topicListMorning`, `topicListMidMorning`, etc.:  Lists of strings, each representing meal options for a specific time of day.
-   `refreshButton.setOnClickListener`:  This block handles the logic when the "Suggest Meal" button is clicked. It performs input validation and selects a random meal accordingly.
-   `realRefreshButton.setOnClickListener`: This block handles the logic when the "Clear" button is clicked. It clears the text in both `edtTime` and `answerBox`.

**Input Validation:**

The app uses a combination of techniques to validate user input:

-   **Integer Check:** `time.toIntOrNull()` is used to check if the input can be parsed as an integer.
-   **Illegal Character Check:**  A regular expression `"[a-zA-Z\\s]+"` is used to ensure the input contains only letters and spaces.
- ** Analog time check, If user enters analog time eg.(HH:MM)

**Meal Suggestion:**

A `when` statement (with `lowercase()` for case-insensitive comparison) maps the valid meal times ("morning", "mid morning", etc.) to their corresponding meal option lists.  A random meal is then selected from the appropriate list using `random()`.

## How to Run

1.  **Prerequisites:** You'll need Android Studio and an Android emulator or a physical Android device to run the app.
2.  **Clone the Repository:**  If the code is in a repository (e.g., on GitHub), clone it to your local machine.
3.  **Open in Android Studio:** Open the project in Android Studio.
4.  **Build and Run:**  Build the project and run it on your emulator or device.

## Potential Improvements

-   **More Meal Options:** Expand the lists of meal options for each time of day.
-   **User Interface:** Improve the visual design and layout of the app.
-   **More Meal Times:** Add more specific meal times (e.g., "Breakfast", "Lunch", "Snack").
-   **Database:** Store meal options in a local database for easier management and updates.
-   **User Preferences:** Allow users to customize meal options or add their own.
-   **Nutritional Information:** Include nutritional information for each suggested meal.
-   **Recipes:** Provide recipes or links to recipes for the suggested meals.

## Author

Sohan Ashmith Maharaj

## License

[Specify a license, e.g., MIT License, or state "No license"]  If you are unsure, you can learn about open-source licenses on sites like [https://choosealicense.com/](https://choosealicense.com/).
