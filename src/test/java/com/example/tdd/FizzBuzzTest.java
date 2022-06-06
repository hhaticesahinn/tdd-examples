package com.example.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {

    //3'e bölünüyorsa Fizz
    //5e bölünüyorsa Buzz
    //3 ve 5 e bölünüuyorsa FizzBuzz
    //3 ya da 5' bölünmüyorsa kendisini yaz.

    @Test
    @DisplayName("3'e bolunme testi")
    @Order(1)
    void testUceBolunurMu(){

        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.hesapla(3), "Fizz olmalı");
    }

    @Test
    @DisplayName("5'e bolunme testi")
    @Order(2)
    void testBeseBolunurMu(){

        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.hesapla(5), "Buzz olmalı");
    }

    @Test
    @DisplayName("3 ve 5'e bolunme testi")
    @Order(3)
    void testUceveBeseBolunurMu(){

        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.hesapla(15), "FizzBuzz olmalı");
    }

    @Test
    @DisplayName("3 veya 5'e bolunmüyorsa testi")
    @Order(4)
    void testUceveBeseBolunmuyorMu(){

        String expected = "1";

        assertEquals(expected, FizzBuzz.hesapla(1), "FizzBuzz olmalı");
    }
}
