 class main{
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog";
        System.out.println(ispangram(s.toLowerCase()));
    }
    private static boolean ispangram(String s) {
        if (s.length() < 26) {
            return false;
        } else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (s.indexOf(ch) < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
