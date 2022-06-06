package com.example.demo;

import static  org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoUtilsTest {

    DemoUtils demoUtils;
    @Test
    @DisplayName("Eşit ya da değil kontrolü")
    @Order(3)
    void testEqualsAndNotEquals(){
        //set up
        int expected = 6;
        int unexpected = 8;

        //execute
        int actual = demoUtils.add(2,4);

        //assert
        assertEquals(expected, actual,"2+4 must be 6"); //sondaki hata mesajı
        assertNotEquals(unexpected, actual, "2+4 must not be 8");
    }

    @Test
    @Order(-3)
    void testNullOrNotNull(){
        // System.out.println("Running test: testNullOrNotNull");

        //set up

        String nullString = null;
        String notNullString = "Hello";

        //exec and assert
        assertNull(demoUtils.checkNull(nullString),"result must be null");
        assertNotNull(demoUtils.checkNull(notNullString), "result must not be null");

    }

    @BeforeEach
    void setup(){
        demoUtils= new DemoUtils();
     //  System.out.println("@BeforeEach içindeyiz");
    }

    @AfterEach
    void cleanup(){
     //   System.out.println("@AfterEach içindeyiz");
    }

    @BeforeAll
    static void setupBeforeAll(){
      //  System.out.println("@BeforeAll içindeyiz");
    }

    @AfterAll
    static void  cleanupAfterAll(){
     //   System.out.println("@AfterAll içindeyiz.");
    }
    @Order(-2)
   @Test
    void testTrueOrFalse(){
        int small = 10;
        int big = 20;

        assertTrue(demoUtils.isGreater(big, small), "result should be true");
        assertFalse(demoUtils.isGreater(small, big), "result should be false");

    }

    @Test
    void testSameOrNotSame(){

        //setup
        String deger = "deneme";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Nesneler aynı objeyi refere etmeli");
        assertNotSame(deger, demoUtils.getAcademy(), "Nesneler aynı nesneyi refere etmemeli.");
    }

    @Test
    void testArrayMatch(){

        String[] deger = {"A","B","C"};

        assertArrayEquals(deger, demoUtils.getAlfabeninIlkHarfleri(), "2 dizi eslesmeli");
    }

    @Test
    void testIterableEquals(){
        List<String> theList = List.of("ha","ti","ce");

        assertIterableEquals(theList, demoUtils.getAcademyList(), "listeler eşleşmeli");
    }

    @Test
    void  testThrowsAndNotThrows(){

        assertThrows(Exception.class, () -> {demoUtils.throwException(-1); }, "hata fırlatması bekleniyor");

        assertDoesNotThrow(()-> {demoUtils.throwException(6);},"hata fırlatmaması bekleniyor ");

    }


}
