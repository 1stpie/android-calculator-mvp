package edu.nextstep.camp.calculator.domain

class CalculatorMemory(
    calculatorRecords: List<String> = listOf()
) {
    private val expressionRecords: MutableList<String> = calculatorRecords.toMutableList()

    fun saveExpressionRecord(expression: Expression, result: Int) {
        expressionRecords.add(SAVE_FORMAT.format(expression, result))
    }

    fun loadExpressionRecords(): List<String> {
        return expressionRecords.toList()
    }

    override fun toString(): String {
        return expressionRecords.joinToString("\n")
    }

    companion object {
        const val SAVE_FORMAT = "%s\n= %s\n"
    }
}