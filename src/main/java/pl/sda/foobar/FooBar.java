package pl.sda.foobar;

class FooBar {

    private static final String REPRESENTATION_DIVIDABLE_BY_THREE = "Foo";
    private static final String REPRESENTATION_DIVIDABLE_BY_FIVE = "Bar";
    private static final String REPRESENTATION_DIVIDABLE_BY_FIFTEEN = REPRESENTATION_DIVIDABLE_BY_THREE + REPRESENTATION_DIVIDABLE_BY_FIVE;

    String convertToString(int number) {


        if(number % 15 == 0){
            return REPRESENTATION_DIVIDABLE_BY_FIFTEEN;
        }
        if(number % 3 == 0){
            return REPRESENTATION_DIVIDABLE_BY_THREE;
        }
        if(number % 5 == 0){
            return REPRESENTATION_DIVIDABLE_BY_FIVE;
        }

        return String.valueOf(number);


//        String result = "";
//        if(number % 3 == 0){
//            result += REPRESENTATION_DIVIDABLE_BY_THREE;
//        }
//        if(number % 5 == 0){
//            result += REPRESENTATION_DIVIDABLE_BY_FIVE;
//        }
//
//        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
