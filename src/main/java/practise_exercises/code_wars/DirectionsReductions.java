package practise_exercises.code_wars;

import java.util.*;

public class DirectionsReductions {

    public static String[] dirReduc(String[] arr) {
        if (arr == null) {
            return new String[]{};
        }

        Map<String, Integer> collectedPairs = new HashMap<>();

        Map<String, String> dirsOppositePairs = new HashMap<>();
        dirsOppositePairs.put("NORTH", "SOUTH");
        dirsOppositePairs.put("SOUTH", "NORTH");
        dirsOppositePairs.put("WEST", "EAST");
        dirsOppositePairs.put("EAST", "WEST");

        List<String> arrayStrings = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < arrayStrings.size(); i++) {
            String key = arrayStrings.get(i);
            if (collectedPairs.containsKey(key)) {
                int intValue = collectedPairs.get(key);
                collectedPairs.put(key, intValue + 1);
            } else {
                collectedPairs.put(key, 1);
            }
        }

        List<String> keyList = new ArrayList<>(collectedPairs.keySet());
        List<Integer> valueList = new ArrayList<>(collectedPairs.values());

        List<String> res = new ArrayList<>();

        for (int i = 0; i < keyList.size(); i++) {
            String dir = keyList.get(i);
            int dirValIndex = keyList.indexOf(dir);
            int dirVal = valueList.get(dirValIndex);
            String dirOpp = dirsOppositePairs.get(dir);
            int dirOppValIndex = keyList.indexOf(dirOpp);
            int dirOppVal = valueList.get(dirOppValIndex);

            if (keyList.contains(dirOpp)) {
                if (dirVal < dirOppVal) {
                    int result = dirOppVal - dirVal;
                    while (result != 0) {
                        res.add(dirOpp);
                        result--;
                    }
                }
            } else {
                if (dirVal > dirOppVal) {
                    int result = dirVal - dirOppVal;
                    while (result != 0) {
                        res.add(dir);
                        result--;
                    }
                }
            }
        }

        String[] convArr = new String[res.size()];
        for (int j = 0; j < convArr.length; j++) {
            convArr[j] = res.get(j);
        }

        return convArr;
    }

    public static void main(String[] args) {

        String[] arrayDirections = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String[] arrayDirections2 = {"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"};

        System.out.println(Arrays.toString(dirReduc(arrayDirections)));
        System.out.println(Arrays.toString(dirReduc(arrayDirections2)));
    }
}
