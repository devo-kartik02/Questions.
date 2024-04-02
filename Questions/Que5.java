 class main {
    public static void main(String[] args) {
        int a[]= {1,23,4,5,6,7};
        System.out.println("original array:");
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("Reversed array");
        for(int i = a.length-1;i>=0;i-- ){
            System.out.println(a[i]+" ");
        }
    }
}
