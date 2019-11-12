package practise_exercises.code_wars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WeightForWeight implements Comparator {

    public static String orderWeight(String strng) {
        List<Integer> arrIntegerInput = new ArrayList<>();
        stringToList(strng, arrIntegerInput);

        List<Integer> arrStringVals = recalculateWeight(strng.split("[\\s]"));
        List<Integer> sorted = sortInput(arrIntegerInput, arrStringVals);

        System.out.println(strng);
        System.out.println(arrStringVals);
        return String.valueOf(sorted)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
    }

    public static void main(String[] args) {
        System.out.println(orderWeight("900 24 8 51 68 20202 333 1 222"));
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
        List<Integer> sublist = new ArrayList<>(resultsList);

        for (int element : indexes) {
            int listElement = inputArray.get(element);
            sublist.add(listElement);
        }

        //sublist.sort(Integer::compare);

        resultsList.addAll(sublist);
        sublist.clear();
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
