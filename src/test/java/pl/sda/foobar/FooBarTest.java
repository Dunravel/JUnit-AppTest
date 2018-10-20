package pl.sda.foobar;

import org.junit.Assert;
import org.junit.Test;

public class FooBarTest {
    @Test
    public void shouldReturnStringIntRepresentationWhenPutInt(){
        //given
            int x = 1;
        //when
            String z = new FooBar().y(x);

        //then
        Assert.assertEquals("1",z); // weryfikujemy czy jest równe

    }


}
