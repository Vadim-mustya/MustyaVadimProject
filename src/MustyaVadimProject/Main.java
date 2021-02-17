package MustyaVadimProject;

public class Main {

    public static void main(String[] args) {
//Homework_1

        int[] a = new int[7];
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
            System.out.print(a[i]);
        }
        System.out.println();
        for (int j = 0; j < a.length; j++) {
            if (a[j] == 1) {
                a[j] = 0;
            } else {
                a[j] = 1;
            }
            System.out.print(a[j]);
        }

        //HomeWork_2

        System.out.println();
        int[] b = new int[8];
        int x = 0;
        for (int i = 0; i < b.length; i++) {
            b[i] = x;
            x += 3;
            System.out.print(b[i] + " ");
        }
        System.out.println();

        //HomeWork_3

        int[] c = new int[]{1,5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < c.length; i++) {
            if (c[i] < 6) {
                c[i] *= 2;

            }
            System.out.print(c[i] + " ");
        }

        //HomeWork_4

        System.out.println();
        int[][] d = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == i || j + i == 4) {
                    d[i][j] = 1;

                }
                System.out.print(d[i][j] + " ");

            }
            System.out.println();
        }

        //HomeWork_5


        int[] g = new int[12];

        for (int i = 0; i < g.length; i++) {
            g[i] = (int) (Math.random() * 1000);
            System.out.print(g[i] + " ");
        }

        System.out.println();


        boolean min = true;
        boolean max = true;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (g[i] > g[j]) {
                    min = false;
                }
                if (g[i] < g[j]) {
                    max = false;
                }
            }
            if (min) {
                System.out.println(g[i] + " Минимальное число");
            }
            if (max) {
                System.out.println(g[i] + " Максимальное число");
            }
            min = true;
            max = true;
        }

        System.out.println();
        //HomeWork_6


        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        System.out.print(" - " + checkBalance(array));
        System.out.println();

        //HomeWork_7


        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int number = 2;

        Transition(arr, number);


    }


    static boolean checkBalance(int[] mas) {
        int firstSum;
        int secondSum;

        for (int i = 0; i < mas.length; i++) {

            firstSum = 0;
            secondSum = 0;

            for (int j = 0; j < i; j++) {

                firstSum += mas[j];
            }

            for (int j = i; j < mas.length; j++) {
                secondSum += mas[j];
            }
            if (firstSum == secondSum) return true;

        }

        return false;

    }




    static void Transition(int[] rightArr, int n) {

        for (int x = 0; x < rightArr.length;x++){
            System.out.print(rightArr[x]+" ");
        }

        System.out.print("-----> ");

        if(n >= 0) {
            for (int j = 0; j < n;j++) {


                int check = rightArr[0];
                rightArr[0] = rightArr[rightArr.length - 1];
                for (int i = 1; i < rightArr.length; i++) {
                    rightArr[rightArr.length - i] = rightArr[rightArr.length - i - 1];
                }
                rightArr[1] = check;
            }
        } else {
            n = n *(-1);
            for (int j = 0;j < n;j++) {
                int check = rightArr[rightArr.length - 1];
                rightArr[rightArr.length - 1] = rightArr[0];
                for (int i = 0; i < rightArr.length - 2; i++) {
                    rightArr[i] = rightArr[i + 1];
                }
                rightArr[rightArr.length - 2] = check;
            }
        }
        for(int j = 0;j < rightArr.length;j++) {
            System.out.print(rightArr[j]+" ");
        }



    }
    //	static void Transition(int number) {
//		System.out.println();
//
//
//			int[] TestArr = new int[7];
//			for (int i = 0; i < TestArr.length; i++) {
//				TestArr[i] = i + 1;
//			}
//			int[] arr = new int[7];
//			for (int i = 0; i < TestArr.length; i++) {
//				arr[i] = i + 1;
//			}
//
//
//			for (int j = 0; j < arr.length; j++) {
//
//
//				if (arr[j] == TestArr[j]) {
//					if (j+number >= arr.length){
//						arr[j- arr.length + number] = arr[j];
//					} else {
//						arr[j + number] = arr[j];
//					}
//				} else {
//					if (j+number >= arr.length) {
//						arr[j - arr.length + number] = TestArr[j];
//					} else {
//						arr[j + number] = TestArr[j];
//					}
//				}
//
////
//
//
//			}
//			for (int i = 0;i <arr.length;i++) {
//				System.out.print(arr[i]);
//			}
//
//
//
//
//	}
    }

