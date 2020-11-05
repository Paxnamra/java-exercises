package practise_exercises.code_wars;

public class Int32ToIPv4 {
    public static String longToIP(long ip) {
        String firstOctet, secondOctet, thirdOctet, fourthOctet;

        String binary = toBinary(ip);
        int size = binary.length();

        fourthOctet = toInteger(binary.substring(24, size));
        thirdOctet = toInteger(binary.substring(16, 24));
        secondOctet = toInteger(binary.substring(8, 16));
        firstOctet = toInteger(binary.substring(0, 8));

        StringBuilder sb = new StringBuilder();

        return sb.append(firstOctet)
                .append(".")
                .append(secondOctet)
                .append(".")
                .append(thirdOctet)
                .append(".")
                .append(fourthOctet)
                .toString();
    }

    public static String toInteger(String input) {
        return String.valueOf(Integer.parseInt(input, 2));
    }

    private static String toBinary(long n) {
        String binaryNum = "";
        int counter = 0;

        while (n > 0) {
            binaryNum = ((n % 2) == 0 ? "0" : "1") + binaryNum;
            counter++;
            n /= 2;
        }
        System.out.println("Operations counted: " + counter);

        return binaryNum;
    }

    public static void main(String[] args) {
        //System.out.println(longToIP(15L));
        System.out.println(longToIP(2149583361L)); //351917844 <-- 00010100111110011101011100010100
        System.out.println(toBinary(215)); //43989748 <-- 10100111110011101011110100
        //toBinary(65);
        //System.out.println(toInteger("011111000100010100000111100111000"));
        //87.7.4].0 --> [174.14.8].0 --->
        //System.out.println(longToIP(16L));
        //System.out.println(longToIP(0L));
    }
}

