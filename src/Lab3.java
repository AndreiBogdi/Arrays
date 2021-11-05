public class Lab3 {
    public static void main(String[] args){
        String text = "FastTrackk";
        String text2 = "Learning text comparision";
        String text3 = "Got to try some more";
        String text4 = "FastTrack";
        int number = 8;
        int x = 5;
        int y = 8;
        int age = 18;
        int v = 18;
        int a = 10;
        int b = 25;
        int c = 42;
        int numarpar = 3;
        LogicalOperation op = new LogicalOperation();
        int commparatie = op.comparasion(x,y);
        Calculator calc = new Calculator();
        double adunare = calc.sum(x,y);
        double scadere = calc.minus(x,y);
        int inmultire = calc.multiplication(x,y);
        float impartire = calc.division(x,y);
        String numar = op.isNumberEven(numarpar);
        int BiggestNumber = op.BiggestNumber(a, b, c);


        System.out.println("Exercitiul 1: \n Rezultatul adunarii 5+8 este "+ (adunare));
        System.out.println("Rezultatul scaderii 5-8 este "+ (scadere));
        System.out.println("Rezultatul inmultirii 5*8 este "+ (inmultire));
        System.out.println("Rezultatul adunarii 5:8 este "+ (impartire));
        System.out.println("Exercitiul 3: Dintre 5 si 8 mai mare este "+ (commparatie));
        System.out.println("Exercitiul 4: "+(op.verifyProvidedText(text,text2,text3)));
        System.out.println("Exercitiul 5: " + (op.verifyText(text4,number)));
        System.out.println("Exercitiul 6: " +op.numarcomparatie(number));
        System.out.println("Exercitiul 7 " +op.numere3si4(number));
        System.out.println("Exercitiul 8:The number is: " +(op.getNumber(number))+"!");
        System.out.println("Exercitiul 9:Andrei " + (op.isEligibleToVote(17)) +" drept de vot!");
        System.out.println("Exercitiul 10: " +(numarpar) +" este numar " +(numar));
        System.out.println("Exercitiul 11: Cel mai mare numar este " +(BiggestNumber));
    }
}
