package org.example;

public class FindClosestToAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 7, 8, 10};
        System.out.println(findClosestToAverage(numbers));

    }

    public static int findClosestToAverage(int[] numbers) {
        //soma dos números
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        //converte inteiro para decimal e calcula a média
        double average = (double) sum / numbers.length;

        //inicializar o número mais próximo de uma média em um array
        int closest = numbers[0];
        double minDifference = Math.abs(numbers[0] - average);




        return sum;
    }
    
    
}
