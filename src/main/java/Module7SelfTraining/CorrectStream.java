package Module7SelfTraining;

import java.util.Arrays;

public class CorrectStream {
    static int counter1 = 0;
    static int counter2 = 0;
    static int counter3 = 0;
    static int[] arr = new int[3];


    public void correctStream(String[] arr1, String[] arr2, int[] result) {


        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].equals(arr2[i])) {

                    result[i] = 1;
                } else {
                    result[i] = -1;
                }
            }
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("The length is incorrect");
        }
    }

    public String nameShuffle(String name) {

        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" "));
        String newName = lastName + " " + firstName;
        return newName;
    }

    public boolean doubleLetters(String word) {

        boolean letters = false;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                letters = true;
                break;
            }
        }
        return letters;
    }

        public static int[] calculateScores(String firstInitial){

        for(int i = 0;i<firstInitial.length();i++){
            if(firstInitial.charAt(i)=='A'){
                counter1+=1;
                arr[0] = counter1;
            } else if (firstInitial.charAt(i)=='B') {
                counter2+=1;
                arr[1] = counter2;
            } else if (firstInitial.charAt(i)=='C') {
                counter3+=1;
                arr[2] = counter3;
            }

        }
        return arr;

    }
//    public void calculateScores(String firstInitial) {
//        for (int i = 0; i < firstInitial.length(); i++) {
//            switch (firstInitial.charAt(i)) {
//                case 'A':
//                    counter1 += 1;
//                    arr[0] = counter1;
//                    break;
//
//                case 'B':
//                    counter2 += 1;
//                    arr[1] = counter2;
//                    break;
//                case 'C':
//                    counter3 += 1;
//                    arr[2] = counter3;
//                    break;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
//    }
}
