package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tablica = new int[10];

        for (int i = 0; i < 10; i++)
        {
            tablica[i] = 10 - i;
        }
        System.out.println("Tablica paczatkowa: " + Arrays.toString(tablica));

        for (int i = 0; i < tablica.length - 1; i++)
        {
            if (tablica[i] > tablica[i + 1])
            {
                int wieksze = tablica[i];
                tablica[i] = tablica[i + 1];
                tablica[i + 1] = wieksze;
            }
        }
        System.out.println("Tablica posortowana 1.A: " + Arrays.toString(tablica));
        System.out.println();


        for (int i = 0; i < 10; i++) // Początkowy stan tablicy
        {
            tablica[i] = 10 - i;
        }
        System.out.println("Tablica paczatkowa: " + Arrays.toString(tablica));

        int licznik = 0;
        for (int i = 0; i < tablica.length - 1; i++)
        {
            licznik++;
            for (int j = 0; j < tablica.length -1; j++)
            {
                licznik++;
                if (tablica[j] > tablica[j + 1])
                {
                    licznik++;
                    int wieksze = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = wieksze;
                }
            }
        }
        System.out.println("Tablica posortowana 1.B: " + Arrays.toString(tablica));
        System.out.println("Licznik operacji: " + licznik);
        System.out.println();



        for (int i = 0; i < 10; i++) // Początkowy stan tablicy
        {
            tablica[i] = 10 - i;
        }
        System.out.println("Tablica paczatkowa: " + Arrays.toString(tablica));

        licznik = 0;
        for (int i = 0; i < tablica.length - 1; i++)
        {
            licznik++;
            for (int j = 0; j < tablica.length - (1 + i); j++)
            {
                licznik++;
                if (tablica[j] > tablica[j + 1])
                {
                    licznik++;
                    int wieksze = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = wieksze;
                }
            }
        }
        System.out.println("Tablica posortowana 1.C: " + Arrays.toString(tablica));
        System.out.println("Licznik operacji: " + licznik);
        System.out.println();



        for (int i = 0; i < 10; i++) // Początkowy stan tablicy
        {
            tablica[i] = 1 + i;
        }
        System.out.println("Tablica paczatkowa: " + Arrays.toString(tablica));

        licznik = 0;
        boolean inIf;
        for (int i = 0; i < tablica.length - 1; i++)
        {
            licznik++;
            inIf = true;
            for (int j = 0; inIf && j < tablica.length - (1 + i); j++)
            {
                licznik++;
                if (tablica[j] > tablica[j + 1])
                {
                    licznik++;
                    int wieksze = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = wieksze;
                }
                else
                    inIf = false;
            }
        }
        System.out.println("Tablica posortowana 1.D/F: " + Arrays.toString(tablica));
        System.out.println("Licznik operacji: " + licznik);
    }
}
