import java.io.*;
import java.math.*;
import java.util.*;



class Brbb {
    int N;
    int cnt = 3;
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    ArrayList<Integer> finalarr = new ArrayList<Integer>(N);

    void run() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        printCombinations(N, 0, 0, cnt);
    }

    void printCombinations(int target, int from, int index, int cnt) {
        if (target == 0)
        {
            if(index == 3)
            {
                for (int i = 0; i < index; i++) {
                    System.out.print(finalarr.get(i) + " ");
                }

                System.out.println();
            }
        }

        else if (target < 0 || from >= arr.length || cnt == 0) {

            return;
        }

        else {

            finalarr.add(index, arr[from]);
            printCombinations(target - arr[from], from, index + 1, cnt - 1);
            printCombinations(target, from + 1, index, cnt);


        }
    }
    public static void main(String[] args)
    {
        new Brbb().run();
    }
}
























    /*

    int N = 10;
    int[] arr = { 2, 2, 6 };
    int[] finalarr = new int[N];

    void run() {
        printAll(N, 0, 0);
    }

    void printAll(int inputNum, int from, int index) {

        if (inputNum == 0) // inputNum = 0일 때 최종 어레이의 값을 출력.
        {

            for (int i = 0; i < index; i++) {
                System.out.print(finalarr[i] + " ");
            }

            System.out.println();
        }

        else if (inputNum < 0 || from >= arr.length) {// else if 문에서 입력값이 0보다 작아지거나 from이 arr의 길이를 넘어가면 종료.


            return;
        }


        else {

            finalarr[index] = arr[from]; //  arr의 from번 째 숫자를 finalarr의 index에 넣기!

            printAll(inputNum - arr[from], from, index + 1);  //  타겟에서 arr의 from번째 인텍스 값을 빼고 index를 증가 시켜 printall 함수 실행
            // 즉 10에서 시작했으면 arr[0]은 2 이므로 입력값은 8이 되고 from은 여전히 0이므로 arr[0]의 값과 target은 8을 전달.
            printAll(inputNum, from + 1, index);  // else if 문에서 입력값이 0보다 작아지거나 from이 arr의 길이를 넘어가면 종료.
            // 종료가 되면 from을 +1시켜 arr의 다음 인덱스 값을 입력값을 빼면서 다시 printall 함수 실행.


        }
    }
    public static void main(String[] args)
    {
        new Brbb().run();
    }





}







    int N = 4;
    int[] arr = {2, 3, 6};
    int[] finalarr = new int[N];

    void run() {
        printCombinations(N, 0, 0);
    }

    void printCombinations(int target, int from, int index) {
        if (target == 0) {
            System.out.println("if문을 쓸게요");
            for (int i = 0; i < index; i++) {
                System.out.print(finalarr[i] + " a");
            }
            System.out.println("띄어쓰기를 하자");
        }

        else if (target < 0 || from >= arr.length){

            System.out.println("else if문");

            return;
        }

        else {

            finalarr[index] = arr[from];
            System.out.println("else 문 시작");

            printCombinations(target-arr[from], from, index + 1);
            printCombinations(target, from + 1, index);
            System.out.println("else 문");


        }
    }
    public static void main(String[] args)
    {
        new Brbb().run();
    }

    static void printCombinations(int arr[], int n, int i)
    {
        int MAX_POINT = 3;
        if (n == 0) {
            printArray(arr, i);
        }
        else if(n > 0) {
            for (int k = 1; k <= MAX_POINT; k++)
            {
                arr[i]= k;
                printCombinations(arr, n-k, i+1);
            }
        }
    }

    static void printArray(int arr[], int m) {
        for (int i = 0; i < m; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main (String[] args) {
        int n = 4;
        int size = 21;
        int[] arr = new int[size];
        System.out.println("1, 2, 5의 조합 "+ n +"에 대한!");
        printCompositions(arr, n, 0);
    }
}






        /*ArrayList<String> menu = new ArrayList<String>();

        menu.add("Noodle=0");
        menu.add("Rice=1");
        menu.add("Juice=2");
        menu.add("Sushi=3");
        menu.add("Soup=4");


        System.out.println("Before MenuList:"+menu);

        menu.add(0, "IceCream=0");
        menu.add(1, "Tea=1");

        menu.remove("Soup");
        menu.remove("Rice");


        System.out.println("After Menulist:"+menu);

        //인덱스로 지워보기 - 필요???
        menu.remove(1);

        System.out.println("Final MenuList:"+menu);


        Iterator<String> fruitIterator = menu.iterator();
        while(fruitIterator.hasNext()) {
            String menus = fruitIterator.next();
            System.out.println(menus);
            if ("Juice=2".equals(menus)) {
                fruitIterator.remove();
            }
        }

        ArrayList<Integer> numberlist = new ArrayList();


        for (int i = 0; i < 22; i++) {
            numberlist.add(i);
            System.out.println("index " + i + " : value " + numberlist.get(i));

        }

        System.out.println("Number List is :" + numberlist);

        Collections.shuffle(numberlist);

        int[] j = new int[3];
        j[0] = numberlist.get(0);
        j[1] = numberlist.get(1);
        j[2] = numberlist.get(2);

        int o = 0;
        int sum = 0;
        int hit =0;

        while (o < j.length) {
            System.out.println(j[o]);
            o = o + 1;
            //sum = sum + j[o];
        }

        sum = j[0] + j[1] + j[2];
        System.out.println("Total :" + sum);



            System.out.print("술래가 뽑은 숫자는: ");

            Scanner theNum = new Scanner(System.in);
            int dbtheNum = theNum.nextInt();
            //double dbtheNum = theNum.nextDouble();

            System.out.print("술래가 뽑은 숫자는: " + dbtheNum + "입니다\n");


            while(true){
            if(sum==dbtheNum) {
                hit++;
                System.out.println("총 " + hit + "번 걸렸습니다.");

                break;
            }
            else if(sum!=dbtheNum){
                hit++;
                System.out.println("총 " + hit + "번 걸렸습니다.");

                continue;
            }
        }

    }
}*/
