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


        int [] arr1 = {25, 45, 54, 87};

        //Задание 2
        System.out.println(weight[0] + ", " + weight[1] + ", " + weight[2]);
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println(arr1[0] + ", " + arr1[1] + ", " + arr1[2]);

        //Задание3
        System.out.println(weight[2] + ", " + weight[1] + ", " + weight[0]);
        System.out.println(arr[2] + ", " + arr[1] + ", " + arr[0]);
        System.out.println(arr1[2] + ", " + arr1[1] + ", " + arr1[0]);

        //Задание4

        for (int i = 0; i<weight.length; i++ ){
            if (weight[i]%2 != 0){
                System.out.println(weight[i] + 1);
                weight[i]++;
            }

        }


    }
}