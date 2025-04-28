public class prcaticeArrays {
    public static void main(String[] args) {
        int sum=0;
        int [] a={2,5,3,9,6};
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        System.out.println(sum);
        System.out.println(sum/a.length);

        //Merge to arrays
        String [] a2 = {"chai","coffee"};
        String [] a3= {"milk","water","coke"};
        String [] a4= new String[(a2.length+a3.length)];
        for(int i=0; i<a2.length;i++){
            a4[i] = a2[i];
        }
        for(int i=a2.length; i<a4.length;i++){
            a4[i] = a3[i-a2.length];
        }
        for(int i=0; i<a4.length;i++){
            System.out.print(a4[i]+" ");
        }
        System.out.println();

        //Find max number and its index
        int[] a5 = {2,5,1,9,6};
        int max=0;
        int idx=0;
        for(int i=0; i<a5.length; i++){
            if(a5[i]>max){
                max=a5[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx);

        //Find min length word and print its index
        String a6 [] = {"coffee","water","chai","diet coke"};
        int len =Integer.MAX_VALUE;
        int index=0;
        for(int i=0; i<a6.length; i++){
            if(a6[i].length()<len) {
                len = a6[i].length();
                index=i;
            }
        }
        System.out.println(a6[index]);
        System.out.println(index);

        // Reverse array
        for(int i=a.length-1;i>=0; i--){
            System.out.print(a[i]+" ");
        }
    }
}
