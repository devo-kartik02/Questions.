public class place {
    public static void main(String[] args) {
        int a[] = {2,3,4,5,2,3,4,5,6};
        int i,j;
        for(i = 0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("Distinct number array");
        for(i=0;i<a.length;i++){
            for(j=0;j<i;j++){
                if(a[i]==a[j]){
                    break;
                }
            }
            if(i==j){
                System.out.println(a[i]+" ");
            }
        }
    }
}
