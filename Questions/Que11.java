 class Main {
    public static void main(String[] args) {
        String input = "Hello123World!456";
        
        // Use regular expression to keep only alphabets
        String result = input.replaceAll("[^a-zA-Z]", "");
        
        System.out.println("Original string: " + input);
        System.out.println("String with only alphabets: " + result);
    }
}
