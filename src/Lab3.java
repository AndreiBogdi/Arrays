public class Lab3 {
    public static void main(String[] args){
        String text = "FastTrackk";
        String text2 = "Learning text comparision";
        String text3 = "Got to try some more";
        String text4 = "FastTrack";
        int number = 8;
        int x = 5;
        int y = 8;
        LogicalOperation op = new LogicalOperation();
        Calculator calc = new Calculator();
        double adunare = calc.sum(x,y);
        double scadere = calc.minus(x,y);
        int inmultire = calc.multiplication(x,y);
        float impartire = calc.division(x,y);
        int commparatie = op.comparasion(x,y);
        System.out.println(op.verifyProvidedText(text,text2,text3));
        System.out.println(op.getNumber(number));
        System.out.println("Rezultatul adunarii 5+8 este "+ (adunare));
        System.out.println("Rezultatul scaderii 5-8 este "+ (scadere));
        System.out.println("Rezultatul inmultirii 5*8 este "+ (inmultire));
        System.out.println("Rezultatul adunarii 5:8 este "+ (impartire));
        System.out.println("Dintre 5 si 8 mai mare este "+ (commparatie));
        System.out.println("Exercitiul 5: " + (op.verifyText(text4,number)));
        System.out.println("Exercitiul 6: " +op.numarcomparatie(number));
        System.out.println("Exercitiul 7 " +op.numere3si4(number));
    }
}
