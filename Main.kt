fun main() {
    println("--- Simple Kotlin Calculator ---")

    while (true) {
        println("\nEnter first number (or type 'exit' to quit):")
        val input1 = readLine()
        if (input1 == "exit") break

        println("Enter an operator (+, -, *, /):")
        val operator = readLine()

        println("Enter second number:")
        val input2 = readLine()

        val num1 = input1?.toDoubleOrNull()
        val num2 = input2?.toDoubleOrNull()

        if (num1 == null || num2 == null || operator == null) {
            println("Invalid input. Try again.")
            continue
        }

        val result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero"
            else -> "Invalid operator"
        }

        println("Result: $result")
    }

    println("Calculator exited.")
}
