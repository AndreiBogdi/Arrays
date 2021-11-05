public class LogicalOperation {
    public String verifyProvidedText(String text, String text2, String text3) {
        if (text.equals("FastTrack")) {
            return text2;
        } else {

            return text3;
        }
    }

    public int getNumber(int number) {
        if (number >= 2 && number < 8) {
            return number;
        }
        return number;
    }

    public int comparasion(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }

    }

    public String verifyText(String text4, int number) {
        if (text4.equals("FastTrack") && number <= 3) {
            return text4 + number;
        } else if (!text4.equals("FastTrack") && number >= 4) {
            return number + text4;
        }
        return "Not found";
    }

    public String numarcomparatie(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm):" + number;
        } else {
            return "The forecast snow is: " + number;
        }
    }

    public String numere3si4(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4.";
        } else if (number == 4) {
            return "The number is equal to 4.";
        } else if (number < 3) {
            return "the number is lower than 3.";
        }
        return numere3si4(number);
    }

    public String isEligibleToVote(int age) {
        if (age >= 18) {
            return "are";

        } else {
            return "nu are";
        }
    }

    public String isNumberEven(int numar) {
        if (numar % 2 == 0) {
            return " par.";
        } else {
            return "impar.";
        }
    }

    public int BiggestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) return b;
        if (a > c && a > b) {
            return a;
        } else if (c > a && c > b) {
            return c;
        }
    return BiggestNumber(a, b, c); }

}
