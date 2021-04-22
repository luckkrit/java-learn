package ch1_9.lab6;

public class Lab6 {
    public static void main(String[] args) {
        // 1
        int i = 1;
        while(i<=10){
            System.out.println("i = "+i);
            i++;
        }
        // 2
        int sum = 0;
        i = 1;
        while(i<=10){
            sum = sum + i;
            i++;
        }
        System.out.println("sum = "+sum);
        // 3
        i = 1;
        while(i<=100){
            if(i%12==0){
                System.out.println("i = "+i+", i % 12 == 0");
            }
            i++;
        }
        // 4
        int[] array = new int[]{1,2,3,4,5};
        i=0;
        while(i<array.length){
            System.out.printf("array[%d] = %d\n", i, array[i]);
            i++;
        }
    }
}
