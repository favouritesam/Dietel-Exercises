package codeWithNed;

public class Loops {
    public static void main(String[] args) {
//        int [] numbers = {2,3, 5};
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//
//        }
//        System.out.println(sum);

//        Animal dog = new Animal("favour", 16);
//        Animal goat = new Animal("dominic", 36);
//        Animal cat = new Animal("inem", 16);
//
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(dog);
//        animals.add(cat);
//        animals.add(goat);
////        for (Animal animal : animals){
////            System.out.println(animal);
////        }
        int count = 0;
        int[][] numbers = new int[3][2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = 2 * count;
                count++;
            }
        }


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);

            }
        }
    }
//        for (int[] number : numbers) {
//            for (int inner : number) {
//                inner = count;
//                count++;
//            }
//            System.out.println(Arrays.deepToString(numbers));
//        }

//        for (String  : animals){
//            System.out.println(name);
//        }
//        for (int index = 0; index < animals.size() ; index++) {
//            System.out.println(animals.get(index));
//        }
//    }
}
