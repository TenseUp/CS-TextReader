class Run{
    public static void main(String[] args) {
        String fileName = "textname";
        String fileName2 = "textname";
        String commonName = "textname";
        Counter counter = new Counter(fileName, commonName);
        String[] arr1 = counter.getRankString();
        int[] arr2 = counter.getRankInt();
        System.out.println("Text One:\n");
        for(int i = 0; i < arr1.length; i++){

            System.out.println(arr1[i] + " " + arr2[i]);
        }
        System.out.println("\nText Two:\n");
        Counter counter2 = new Counter(fileName2, commonName);
        String[] arr3 = counter2.getRankString();
        int[] arr4 = counter2.getRankInt();
        for(int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i] + " " + arr4[i]);
        }
    }
}