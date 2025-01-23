package sample.cafekiosk.unit.beverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class AmericanoTest {
    @Test
    void getName() {
        Americano americano=new Americano();

        //assertEquals(americano.getName(), "아메리카노");
        assertThat(americano.getName()).isEqualTo("아메리카노");
        //assertThat을 쓰면 . 을 통해 또다른 메소드 이용가능

    }
    @Test
    void getPrice(){
        Americano americano=new Americano();

        assertThat(americano.getPrice()).isEqualTo(4000);
    }

}