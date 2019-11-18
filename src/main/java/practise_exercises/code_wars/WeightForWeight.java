package practise_exercises.code_wars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.MIN_VALUE;

public class WeightForWeight {

    public static String orderWeight(String strng) {
        List<Integer> arrIntegerInput = new ArrayList<>();
        stringToList(strng, arrIntegerInput);

        List<Integer> arrStringVals = recalculateWeight(strng.split("[\\s]"));
        List<Integer> sorted = sortInput(arrIntegerInput, arrStringVals);

        System.out.println(strng);
        return String.valueOf(sorted)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
    }

    public static void main(String[] args) {
        System.out.println(orderWeight("900 24 8 51 68 20202 333 1 222 42"));
        System.out.println();
        System.out.println(orderWeight("81 20361 123430 460103 204064 231523 140931 5817 416830 27437 421961 474243 73590 408456 65493 377580 85296 307787 73989 478956 478886"));
        System.out.println();
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
        System.out.println();
    }

    private static void stringToList(String strng, List<Integer> arrIntegerInput) {
        for (String s : (strng.split("[\\s]"))) {
            arrIntegerInput.add(Integer.valueOf(s));
        }
    }

    private static int transformValue(String onArrIndex) {
        int scaledNumber = 0;
        char[] onArrChar = onArrIndex.toCharArray();

        for (char count : onArrChar) {
            scaledNumber += Character.getNumericValue(count);
        }
        return scaledNumber;
    }

    private static List<Integer> recalculateWeight(String[] strNumbers) {
        List<Integer> changedNums = new ArrayList<>();

        for (int i = 0; i < strNumbers.length; i++) {
            changedNums.add(transformValue(strNumbers[i]));
        }
        return changedNums;
    }

    private static List<Integer> sortInput(List<Integer> inputArray, List<Integer> recalculatedArray) {
        List<Integer> resultsList = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();

        int biggest = getBiggestValue(recalculatedArray);

        for (int w = 0; w <= biggest; w++) {
            for (int j = 0; j < recalculatedArray.size(); j++) {

                if (recalculatedArray.get(j) == w) {
                    indexes.add(j);
                }
            }

            if (!indexes.isEmpty()) {
                if (indexes.size() == 1) {
                    addValue(inputArray, resultsList, indexes);
                    indexes.clear();

                } else {
                    addMultipleValues(inputArray, resultsList, indexes);
                    indexes.clear();
                }
            }
        }
        return resultsList;
    }

    private static int getBiggestValue(List<Integer> recalculatedArray) {
        return recalculatedArray
                .stream()
                .collect(Collectors.summarizingInt(Integer::intValue))
                .getMax();
    }

    private static void addValue(List<Integer> inputArray, List<Integer> resultsList, List<Integer> indexes) {
        int ind = indexes.get(0);
        int listElement = inputArray.get(ind);
        resultsList.add(listElement);
    }

    private static void addMultipleValues(List<Integer> inputArray, List<Integer> resultsList, List<Integer> indexes) {
        List<Integer> sublist = new ArrayList<>();
        List<Integer> lowestLevelSublist = new ArrayList<>();

        for (int element : indexes) {
            int listElement = inputArray.get(element);
            sublist.add(listElement);
        }

        int maxInSublist = maxCharVal(sublist);

        for (int cc = 0; cc <= maxInSublist; cc++) {
            for (int dd = 0; dd < sublist.size(); dd++) {

                String temp = String.valueOf(sublist.get(dd));
                char[] chars = temp.toCharArray();
                int zeroIntegerCompare = Character.getNumericValue(chars[0]);

                if (zeroIntegerCompare == cc) {
                    int ind = sublist.get(dd);
                    lowestLevelSublist.add(ind);
                }
            }

            if (!lowestLevelSublist.isEmpty()) {
                if (lowestLevelSublist.size() == 1) {
                    resultsList.addAll(lowestLevelSublist);
                    lowestLevelSublist.clear();

                } else {
                    Collections.sort(lowestLevelSublist);
                    resultsList.addAll(lowestLevelSublist);
                    lowestLevelSublist.clear();
                }
            }
        }
    }

    private static int maxCharVal(List<Integer> findMax) {
        int max = MIN_VALUE;

        for (int el : findMax) {
            String temp = String.valueOf(el);
            char[] chars = temp.toCharArray();
            int zeroIntegerCompare = Character.getNumericValue(chars[0]);

            if (zeroIntegerCompare > max) {
                max = Character.getNumericValue(chars[0]);
            }
        }
        return max;
    }
}
