package com.company.Lab4;

import java.util.Stack;

public class Expression {

    String expression;
    Stack<Character> stack = new Stack<Character>();

    Expression(String expression)
    {
        this.expression = expression;

    }

    public boolean checkExpression()
    {
        for (char c: expression.toCharArray()) {
            if (c == '(')
               stack.push(c);
            if (c == ')'){
                if (stack.empty())
                    return false;
                else
                    stack.pop();
            }
        }
        if (!stack.empty()) {
            return  false;
        }
        return true;
    }


}
