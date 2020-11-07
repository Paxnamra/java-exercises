package practise_exercises.code_wars;

public class Int32ToIPv4 {
    public static String longToIP(long ip) {
        return toBinary(ip);
    }

    private static String toBinary(long n) {
        String[] binaryArr = new String[4];
        String binaryNum = "";
        int counter = 0;
        int index = 0;

        while (n > 0) {
            binaryNum = ((n % 2) == 0 ? "0" : "1") + binaryNum;
            counter++;

            if (counter == 8) {
                binaryArr[index] = binaryNum;
                index++;

                binaryNum = "";
                counter = 0;
            }
            n /= 2;
        }

        if (counter != 0) {
            String lastByte = zerosDifference(counter);
            binaryArr[index++] = lastByte + binaryNum;
        }

        fieldsToInts(binaryArr);
        String[] orderedArr = new String[4];

        for (int i = 0; i < orderedArr.length; i++) {
            orderedArr[i] = binaryArr[orderedArr.length - i - 1];
        }

        return String.join(".", orderedArr);
    }

    public static String toLong(String input) {
        return String.valueOf(Long.parseLong(input, 2));
    }

    private static String zerosDifference(int counter) {
        int addZeros = 8 - counter;
        String lastByte = "";

        while (addZeros != 0) {
            lastByte += "0";
            --addZeros;
        }
        return lastByte;
    }

    private static void fieldsToInts(String[] binaryArr) {
        for (int i = 0; i < binaryArr.length; i++) {
            if (binaryArr[i] == null) {
                binaryArr[i] = toLong("00000000");
            }

            String a = toLong(binaryArr[i]);
            binaryArr[i] = a;
        }
    }
}

