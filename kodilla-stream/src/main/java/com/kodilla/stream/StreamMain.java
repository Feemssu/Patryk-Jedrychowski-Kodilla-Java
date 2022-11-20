package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {

    public static void main(String []args){
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lamdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        System.out.println("\nExercise: ");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("First text",text -> text.toUpperCase() );
        poemBeautifier.beautify("Second text",text -> "ABC ".concat(text) );
        poemBeautifier.beautify("Third text",text -> text.concat(" ABC"));
        poemBeautifier.beautify("Fourth text",text -> text.toLowerCase() );
        poemBeautifier.beautify("Fifth text",text -> text.replace('e','3'));
    }
}
