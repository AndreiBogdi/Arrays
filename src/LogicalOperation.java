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

    //2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
    // Sa se afiseze progresul in consola pe tot parcursul. Apelati metoda in main() pentru a verifica daca functioneaza.
    public int[] populateArray(int  max){
        int[] myArr = new int[max];
        for(int i=0;i< max;i++){
            myArr[i] = i+1;
        }
        return myArr;
    }

    // 3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu
    // toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza. Atentie,
    // metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.
    public void printArray(int[] array){
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public int[] populateEvenArray(int max){
        int[] myArr = new int[max];
        for(int i=0;i<max;i++){
            if(myArr[i] % 2==0){
                myArr[i]=i+1;
            }
        }
        return myArr;
    }
    public void printEvenArray(int[] array){
        for(int i=0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }

    //4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori. Metoda
    // sa calculeze si sa returneze media numerelor din array. Apelati metoda in main() pentru a verifica daca functioneaza.

    public int ArrayAverage(int[] arr){
        int sum=0;
        int ArrayElements=4;
        for(int value: arr){
            sum+= value;
        }
        return sum/ArrayElements;
    }

    //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru
    // de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit,
    // iar daca da sa returneze true iar daca nu, sa returneze false.  Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean Array(String[] arr){
        String ceva="cpu";
        if(ceva.equals(arr)){
            return true;
        }else{
            return false;
        }
    }
    public int getSecondSmallestNumber(int[] arr, int number){
        int min;
        for(int i=0;i < number; i++){
            for(int j=i+1;j < number;j++){
                if(arr[i]> arr[j]){
                    min = arr[i];
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }
        return arr[1];
    }
    


}
