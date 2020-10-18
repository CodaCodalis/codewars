class YesOrNo {
    public static void main(String[] args) {
        System.out.println(boolToWord(false));
    }

    public static String boolToWord(boolean b) {
        //TODO
        String wahr = "Yes", falsch = "No";
        if (b == true) {
            return wahr;
        } else return falsch;
    }

}