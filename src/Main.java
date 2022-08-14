public class Main {
    public static void main(String[] args) {

        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        int first = a[0];
        int two = a[1];
        int three = a[2];

        double[] B = {1.57, 7.654, 9.986};


        boolean[] myNew = {true, false};



        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]);
            if (i != B.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = B.length-1; i >=0 ; i--) {
            System.out.print(B[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i <a.length; i++) {
             if (a[i] % 2 == 1) {
                a[i]++;
            }
            System.out.print(a[i]);
            if (i != a.length-1) {
                System.out.print(", ");
            }
        }
    }

            }
