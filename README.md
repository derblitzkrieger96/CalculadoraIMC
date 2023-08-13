# IMC Calculator App
This Android app calculates the Body Mass Index (BMI) based on user input for weight and height. It's a simple yet effective tool for assessing health based on BMI.

## Screenshots
<img src="/results/image2.png" width="300"><img src="/results/image3.png" width="300">
Screenshot 2

## Features
Input fields for weight and height.
Calculates BMI and displays the result.
Provides BMI classification (underweight, normal, overweight, obesity) based on the calculated BMI.
Intuitive user interface with responsive design.
Prerequisites
Android Studio with Kotlin support.
Installation
Clone the repository:


```
git clone https://github.com/yourusername/imc-calculator-app.git
```
Open the project in Android Studio.

Build and run the app on an emulator or physical device.

## Usage
Enter your weight in kilograms and your height in meters.
Click the "Calculate" button.
View your calculated BMI and its classification.
How It Works
The app uses two main screens: the input screen for weight and height, and the result screen that displays the calculated BMI and its classification.

* MainActivity.kt
This Kotlin file handles the main functionality of the app, including gathering user input, calculating BMI, and navigating to the result screen.


* activity_main.xml
This XML layout file defines the layout of the input screen, including EditTexts for weight and height and a button for calculation.


* ResultActivity.kt
This Kotlin file manages the result screen. It calculates the BMI, displays it, and provides the BMI classification.


* activity_result.xml
This XML layout file defines the layout of the result screen, including TextViews for displaying the result and classification.

Contributing
Contributions are welcome! If you'd like to contribute to this project, feel free to submit a pull request.

## License
This project is licensed under the MIT License.


Created by Dairon Danilo Dorado.


