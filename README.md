Tax Calculation Project

Project Description
This project aims to develop a tax calculation system for businesses, focusing on two types of taxes: PIS and IPI. The system allows users to input relevant data for each tax calculation and provides clear and accurate outputs regarding the amounts to be paid. It is implemented in Java, utilizing object-oriented programming concepts to structure the different classes representing taxes and payments.

Features
Tax Registration:

Users can register taxes of type PIS or IPI.
For PIS, the system prompts for the debit and credit amounts and calculates the tax using the formula: 
(
debit
−
credit
)
×
0.0165
(debit−credit)×0.0165.
For IPI, the system prompts for the product value, freight, insurance, other expenses, and the tax rate, calculating the tax with the formula: 
(
product value
+
freight
+
insurance
+
other expenses
)
×
tax rate
100
(product value+freight+insurance+other expenses)× 
100
tax rate
​
 .
User Interaction:

The system uses an interactive console menu that allows users to enter data intuitively.
Users can terminate the registration process at any time by typing "stop."
Error Handling:

The system is designed to handle invalid inputs, such as letters instead of numbers, ensuring that users receive clear messages on how to correct their entries.
Results Visualization:

After entering the data, the system displays a detailed list of registered taxes, including their description and the calculated amount.
Technologies Used
Java: The primary programming language used for the system's implementation.
Object-Oriented Programming: The use of classes and interfaces to structure the system logic in a modular and reusable way.
Conclusion
This project provides a practical tool for businesses to calculate their taxes, facilitating tax management. The system can be expanded in the future to include other types of taxes and additional functionalities, such as detailed reports and integration with accounting systems. With a simple and effective interface, the system meets the needs of small and medium-sized entrepreneurs seeking to simplify the tax calculation process.

