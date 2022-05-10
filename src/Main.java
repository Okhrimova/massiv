public class Main {
    public static void main(String[] args) {
        int [] weight = new int[3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;
        int weight1 = weight[0];
        int weights2 = weight [1];
        int weights3 = weight [2];


        float[] arr = {1.57f, 7.654f, 9.986f};


        int [] arr1 = {25, 45, 54};

        //Задание 2
        for (int i = 0; i < weight.length; i++) {
            if (i < weight.length - 1)
                System.out.println(weight[i] + ",");
            else System.out.println(weight[i]);
        }
        System.out.println();


        for (int i = 0; i <arr.length; i++) {
            if (i < arr.length - 1)
                System.out.println(arr[i] + ",");
            else System.out.println(arr[i]);
        }
        System.out.println();

        for (int i = 0; i <arr1.length; i++) {
            if (i < arr1.length - 1)
                System.out.println(arr1[i] + ",");
            else System.out.println(arr1[i]);
        }
        System.out.println();

        //Задание4

        for (int i = 0; i<weight.length; i++ ){
            if (weight[i]%2 != 0){
                weight[i]++;
                System.out.println(weight[i]);
            }

            if (i!=weight.length)
                System.out.println(weight[i] + " ,");
            else System.out.println(weight[i]);
        }


    }
}