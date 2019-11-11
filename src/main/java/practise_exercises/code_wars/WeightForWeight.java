package practise_exercises.code_wars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.MIN_VALUE;

public class WeightForWeight {

    public static String orderWeight(String strng) {
        List<Integer> arrIntegerInput = new ArrayList<>();

        for (String s : (strng.split("[\\s]"))) {
            arrIntegerInput.add(Integer.valueOf(s));
        }

        List<Integer> arrStringVals = recalculateWeight(strng.split("[\\s]"));
        List<Integer> sorted = sortInput(arrIntegerInput, arrStringVals);

        System.out.println(strng);
        System.out.println(arrStringVals);
        return String.valueOf(sorted)
                .replace(",", "")
                .replace("[","")
                .replace("]","")
                .trim();
    }

    private static List<Integer> recalculateWeight(String[] strNumbers) {
        List<Integer> changedNums = new ArrayList<>();

        for (int i = 0; i < strNumbers.length; i++) {
            changedNums.add(transformValue(strNumbers[i]));
        }
        return changedNums;
    }

    private static int transformValue(String onArrIndex) {
        int scaledNumber = 0;
        char[] onArrChar = onArrIndex.toCharArray();

        for (char count : onArrChar) {
            scaledNumber += Character.getNumericValue(count);
        }
        return scaledNumber;
    }

    private static List<Integer> sortInput(List<Integer> inputArray, List<Integer> recalculatedArray) {
        List<Integer> theLast = new ArrayList<>();

        int biggest = recalculatedArray
                .stream()
                .collect(Collectors.summarizingInt(Integer::intValue))
                .getMax();

        List<Integer> indexes = new ArrayList<>();

        for (int w = 0; w <= biggest; w++) {
            for (int j = 0; j < recalculatedArray.size(); j++) {
                if (recalculatedArray.get(j) == w) {
                    indexes.add(j);
                    int listElement = inputArray.get(j);
                    theLast.add(listElement);
                    indexes.clear();
                }
            }
        }
        return theLast;
    }

    private static List<Integer> swapInSublist(List<Integer> indexes, List<Integer> inputList) {
        List<Integer> another = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();

        //sublist of repetitions on 2 in inputlist values
        for (int e : indexes) {
            int tmp = inputList.get(e);
            another.add(tmp);
        }

        return another; //unsorted placeholder
    }

    private static int setMaxCharVal(List<Integer> ind, List<Integer> inp) {
        int max = MIN_VALUE;

        for (int el : ind) {
            int temp = inp.get(el);
            char[] chars = ("" + temp).toCharArray();

            if (Character.getNumericValue(chars[0]) > max) {
                max = Character.getNumericValue(chars[0]);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(orderWeight("333 51 8 222 68 900"));
        System.out.println();
        System.out.println(orderWeight("81 20361 123430 460103 204064 231523 140931 5817 416830 27437 421961 474243 73590 408456 65493 377580 85296 307787 73989 478956 478886"));
        System.out.println();
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}
