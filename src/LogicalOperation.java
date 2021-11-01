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
    public int comparasion(int first, int second){
        if (first > second){
            return first;
        } else{
            return second;
        }

    }
    public String verifyText(String text4, int number){
        if(text4.equals("FastTrack") && number <=3){
            return text4 + number;
        } else if (!text4.equals("FastTrack") && number >=4){
            return number + text4;
        }
        return "Not Found!";
    }
    public String numarcomparatie(int number){
        if(number >8 || number==6){
            return "The amount of snow this winter was(cm):" + number;
        }else {
            return "The forecast snow is: "+ number;
        }
    }
    public String numere3si4(int number){
        if(number >3 && number!=4){
            return "The number is greater than 3 and not equal to 4.";
        }else if (number==4){
            return "The number is equal to 4.";
        }
        else if(number <3 ){
return "the number is lower than 3.";
}
return "not found";
}

}
