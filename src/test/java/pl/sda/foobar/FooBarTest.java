package pl.sda.foobar;

import org.junit.Assert;
import org.junit.Test;

public class FooBarTest {

    public static final int NUMBER = 1;
    public static final String EXPECTED_REPRESENTATION = "1";

    @Test
    public void shouldReturnStringIntRepresentationWhenPutInt(){
        //given

        //when
            String result = new FooBar().convertToString(NUMBER);

        //then
        Assert.assertEquals(EXPECTED_REPRESENTATION,result); // weryfikujemy czy jest równe
    }


}
