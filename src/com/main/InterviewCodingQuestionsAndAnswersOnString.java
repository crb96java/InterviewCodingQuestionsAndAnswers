package com.main;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewCodingQuestionsAndAnswersOnString {

    public static void main(String []args){
        String myName = "ramesh babu";

        //How to print the String value in reverse order.
        String reversedMyName = new StringBuilder(myName).reverse().toString();
        System.out.println("Print the String name in reverse order ");
        System.out.println(reversedMyName);
        System.out.println();

        //How to find the duplicate values from the String value
        List<Character> listOfCharValues = myName.chars().mapToObj(c->(char)c).toList();
        Set<Character> charValue = new HashSet<>();
        List<Character> displayDuplicateCharValues = listOfCharValues.stream().filter(c->!charValue.add(c)).toList();
        System.out.println("Print the repeated Char values from the String value ");
        System.out.println(displayDuplicateCharValues);
        System.out.println();

        //How to find the duplicate values from the String value with count also.
        Map<Character, Long> displayDuplicateCharValuesWithCount = myName.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(value->value.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Display duplicate Char values with count");
        System.out.println(displayDuplicateCharValuesWithCount);
        System.out.println();

        //How to print the duplicate in words from the String
        String stringOfNames = "alex brian charles alex charles david eric david";
        List<String> listOfString = Arrays.stream(stringOfNames.split(" ")).toList();
        Set<String> stringValue = new HashSet<>();
        List<String> listOfStringValues = listOfString.stream().filter(v->!stringValue.add(v)).toList();
        System.out.println("Print the duplicate in words from the String");
        System.out.println(listOfStringValues);
        System.out.println();

        //Remove the duplicate values from the String
        List<String> listNames = Arrays.stream(stringOfNames.split(" ")).toList();
        Set<String> setValues = new LinkedHashSet<>(listNames);
        String  name  = String.join(" ", setValues);
        System.out.println("Remove the duplicate values from the String");
        System.out.println(name);
        System.out.println();

    }

}
