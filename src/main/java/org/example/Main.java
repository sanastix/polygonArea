package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        int[][] vertices = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] line = scanner.nextLine().split(" ");
            vertices[i][0] = Integer.parseInt(line[0]);
            vertices[i][1] = Integer.parseInt(line[1]);
        }

        double area = 0;

        for (int i = 0; i < N; i++) {
            int x = vertices[i][0];
            int y = vertices[i][1];

            int nextIndex = (i + 1) % N;
            int xNext = vertices[nextIndex][0];
            int yNext = vertices[nextIndex][1];

            area += (x * yNext - xNext * y);
        }
        scanner.close();

        area = Math.abs(area) / 2.0;

        System.out.printf("%.1f%n", area);

    }
}