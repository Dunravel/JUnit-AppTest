package pl.sda.foobar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FooBarTest {

    private static final int NUMBER = 1;
    private static final String EXPECTED_REPRESENTATION = "1";
    private static final int DIVIDABLE_BY_THREE = 3;
    private FooBar fooBar;
    private static final int DIVIDABLE_BY_FIVE = 5;

    @Before
    public void init(){

        fooBar = new FooBar();
    }

    @Test
    public void shouldReturnStringIntRepresentationWhenPutInt() {
        //given

        //when
        String result = fooBar.convertToString(NUMBER);

        //then
        Assert.assertEquals(EXPECTED_REPRESENTATION, result); // weryfikujemy czy jest równe
    }

    @Test
    public void shouldReturnStringFooWhenIntIsDividedByThree() {
        //given

        //when
        String result = fooBar.convertToString(DIVIDABLE_BY_THREE);

        //then
        Assert.assertEquals("Foo", result);

    }

    @Test
    public void shouldReturnStringBarWhenIntIsDividableByFive(){
        //given

        //when
        String result = fooBar.convertToString(DIVIDABLE_BY_FIVE);

        //then
        Assert.assertEquals("Bar", result);

    }
}
