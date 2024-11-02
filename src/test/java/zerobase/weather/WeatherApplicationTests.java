package zerobase.weather;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void equalTest() {
        assertEquals(1, 1);
    }

    @Test
    void nullTest() {
        assertNull(null);
    }

    @Test
    void trueTest(){
        assertTrue(1 == 1);
    }

}
