public class multiplicationTable {
    static void multiplivationTable(int n){
        //for-loop
        for(int i=1;i<=10; i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        //using while loop
        int i=1;
        int n=7;
        int p=0;
        while(i<=10){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
//            p+=n*i;
//            System.out.println(p);
            i++;
        }
        System.out.println();

        //using method
        multiplivationTable(n);
    }
}
