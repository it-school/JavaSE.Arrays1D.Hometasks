package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task1() {
        System.out.printf("\nTask 1:\n");
        int[] a = new int[35];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50) * 100;
            sum += a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Общее число книг " + sum);
        System.out.println("Общее число книг есть 6 значное число = " + ((sum > 99999 && sum < 1000000) ? "Правда" : "Ложь"));
    }

    private static void task2() {
        System.out.printf("\nTask 2:\n");
        int[] a = new int[10];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(45);
            sum += a[i];
        }
        System.out.println(sum + ((sum > 200) ? " Спортсмен вышел в этап" : " Спортсмен не вышел в этап"));
    }

    private static void task3() {
        System.out.printf("\nTask 3:\n");
        int[] a = new int[18];
        int obz = 0, kor = 0, pro = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50);
        }
        for (int j = 0; j < a.length; j++) {
            if (j >= 0 && j < 7) obz += a[j];
            if (j > 6 && j < 13) kor += a[j];
            if (j > 12 && j < a.length) pro += a[j];
        }
        System.out.println("Обязательная " + obz);
        System.out.println("Короткая программа " + kor);
        System.out.println("Произвольная " + pro);
        if (obz > kor && obz > pro) System.out.println("Лучше выступил в обязательной программе");
        if (kor > obz && kor > pro) System.out.println("Лучше выступил в короткой программе");
        if (pro > obz && pro > kor) System.out.println("Лучше выступил в произвольной программе");
    }

    private static void task4() {
        System.out.printf("\nTask 4:\n");
        Random random = new Random();
        int[] a = new int[50];
        int cur = 0, max = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = -50 + random.nextInt(100);
            if (a[i] > 0) cur++;
            else {
                if (cur > max) max = cur;
                cur = 0;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("\nМаксимальная последовательность положительных чисел состоит из: " + max);
    }

    private static void task5() {
        System.out.printf("\nTask 5:\n");
        int[] a = new int[50];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(200);
            for (int j = 3; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    //System.out.println(a[i] +" "+ j);
                    a[i] = 0;
                    break;
                }
            }
            if (a[i] != 0) System.out.println(i);
        }
    }

    private static void task6() {
        System.out.printf("\nTask 6:\n");
        int[] a = new int[50];
        int b = 0, c = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(45);
        }
        int x = a[1], y = a[1];
        for (int j = 0; j < a.length; j++) {
            if (a[j] > x) {
                x = a[j];
                b = j;
            }
            if (a[j] < y) {
                y = a[j];
                c = j;
            }
        }
        System.out.println(Arrays.toString(a));
        a[b] = 0;
        a[c] = 0;
        System.out.println(Arrays.toString(a));
    }


    private static void task7() {
        System.out.printf("\nTask 7:\n");
        int[] a = new int[10];
        int n = a.length - 1;
        Random random = new Random();
        for (int i = 0; i < a.length; i++)
            a[i] = random.nextInt(6);

        System.out.println("Before (" + n + "): " + Arrays.toString(a));

        for (int i = 0; i <= n - 1; i++) {
            if (i < n - 1) {
                for (int k = i + 1; k < n; k++) {
                    //System.out.println(k + " " + i);
                    if (a[i] == a[k]) {
                        for (int j = k; j <= n - 1; j++) {
                            a[j] = a[j + 1];
                        }
                        a[n] = 0;
                        n--;
                        k--;
                    }
                }
            }
        }
        System.out.println("After   (" + n + "):" + Arrays.toString(a));
    }

    private static void task8() {
        System.out.printf("\nTask 8:\n");
        Random random = new Random();
        int[] a = new int[50];
        int b = 30, c = 10, d = 20;
        for (int i = 0; i < a.length; i++) {
            a[i] = -50 + random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) a[i] = 0;
            if (a[i] > b) a[i] = 0;
            if (a[i] > c && a[i] < d) a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }

    private static void task9() {
        System.out.printf("\nTask 9:\n");
        Random random = new Random();
        int[] a = new int[50];
        int b = 30, c = 10, d = 20;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && i % 2 != 0) a[i] = 0;
            if (a[i] % 3 == 0 || a[i] % 5 == 0) a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }

}

/*
private static void task1()
        {
        int[]a=new int[35];
        int sum=0;
        Random random=new Random();
        for(int i=0;i<a.length;i++)
        {
        a[i]=random.nextInt(50)*100;
        sum+=a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Общее число книг "+sum);
        System.out.println("Общее число книг есть 6 значное число = "+((sum>99999&&sum< 1000000)?"Правда":"Ложь"));
        }

private static void task2()
        {
        int[]a=new int[10];
        int sum=0;
        Random random=new Random();
        for(int i=0;i<a.length;i++)
        {
        a[i]=random.nextInt(45);
        sum+=a[i];
        }
        System.out.println(sum+((sum>200)?" Спортсмен вышел в этап":" Спортсмен не вышел в этап"));
        }

private static void task3()
        {
        int[]a=new int[18];
        int obz=0,kor=0,pro=0;
        Random random=new Random();
        for(int i=0;i<a.length;i++)
        {
        a[i]=random.nextInt(50);
        }
        for(int j=0;j<a.length;j++)
        {
        if(j>=0&&j< 7)
        {
        obz+=a[j];
        }
        if(j>6&&j< 13)
        {
        kor+=a[j];
        }
        if(j>12&&j<a.length)
        {
        pro+=a[j];
        }
        }
        System.out.println("Обязательная "+obz);
        System.out.println("Короткая программа "+kor);
        System.out.println("Произвольная "+pro);
        if(obz>kor&&obz>pro)
        {
        System.out.println("Лучше выступил в обязательной программе");
        }
        if(kor>obz&&kor>pro)
        {
        System.out.println("Лучше выступил в короткой программе");
        }
        if(pro>obz&&pro>kor)
        {
        System.out.println("Лучше выступил в произвольной программе");
        }
        }

private static void task4()
        {
        Random random=new Random();
        int[]a=new int[50];
        int cur=0,max=0;
        for(int i=0;i<a.length;i++)
        {
        a[i]=-50+random.nextInt(100);
        if(a[i]>0)
        {
        cur++;
        }
        else
        {
        if(cur>max)
        {
        max=cur;
        }
        cur=0;
        }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("\nМаксимальная последовательность положительных чисел состоит из: "+max);
        }

private static void task5()
        {
        int[]a=new int[50];
        Random random=new Random();
        for(int i=0;i<a.length;i++)
        {
        a[i]=random.nextInt(200);
        for(int j=3;j<a[i];j++)
        {
        if(a[i]%j==0)
        {
        //System.out.println(a[i] +" "+ j);
        a[i]=0;
        break;
        }
        }
        if(a[i]!=0)
        {
        System.out.println(i);
        }
        }
        }

private static void task6()
        {
        int[]a=new int[50];
        int b=0,c=0;
        Random random=new Random();
        for(int i=0;i<a.length;i++)
        {
        a[i]=random.nextInt(45);
        }
        int x=a[1],y=a[1];
        for(int j=0;j<a.length;j++)
        {
        if(a[j]>x)
        {
        x=a[j];
        b=j;
        }
        if(a[j]<y)
        {
        y=a[j];
        c=j;
        }
        }
        System.out.println(Arrays.toString(a));
        a[b]=0;
        a[c]=0;
        System.out.println(Arrays.toString(a));
        }

private static void task8()
        {
        Random random=new Random();
        int[]a=new int[50];
        int b=30,c=10,d=20;
        for(int i=0;i<a.length;i++)
        {
        a[i]=-50+random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
        if(a[i]< 0)
        {
        a[i]=0;
        }
        if(a[i]>b)
        {
        a[i]=0;
        }
        if(a[i]>c&&a[i]<d)
        {
        a[i]=0;
        }
        }
        System.out.println(Arrays.toString(a));
        }

private static void task9()
        {
        Random random=new Random();
        int[]a=new int[50];
        int b=30,c=10,d=20;
        for(int i=0;i<a.length;i++)
        {
        a[i]=random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
        if(a[i]%2==0&&i%2!=0)
        {
        a[i]=0;
        }
        if(a[i]%3==0||a[i]%5==0)
        {
        a[i]=0;
        }
        }
        System.out.println(Arrays.toString(a));
        }

private static void task7()
        {
        int[]a=new int[10];
        int n=a.length-1;
        Random random=new Random();
        for(int i=0;i<a.length;i++)
        {
        a[i]=random.nextInt(6);
        }
        for(int i=0;i<=n-1;i++)
        {
        System.out.println("Before ("+n+"): "+Arrays.toString(a));
        System.out.println(a[i]+" "+a[i+1]);
        if(i<n-1)
        {
        for(int k=i+1;k<n; k++)
        {
        //System.out.println(k + " " + i);
        if(a[i]==a[k])
        {
        for(int j=k;j<=n-1;j++)
        {
        a[j]=a[j+1];
        }
        a[n]=0;
        n--;
        k--;
        }
        System.out.println("After   ("+n+"):"+Arrays.toString(a));
        }
        }
        }
        for(int i=0;i<=n;i++)
        {
        System.out.print(a[i]+", ");
        }
        }
        }
*/
