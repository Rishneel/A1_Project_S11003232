package com.mycompany.snake_game;

import org.junit.jupiter.api.*;

import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

class ThreadsControllerTest {

    private ThreadsController threadsController;
    @BeforeAll
    public static void setupAll(){
        System.out.println("I should be printed before all the tests commence!");
    }

    @BeforeEach
    public void setup(){
        System.out.println("I am Instantiating the User Test Scripts!");
        //Helps initialise the UserObject
     //   threadsController = new ThreadsController();

    }
    //Actual Test Cases
    @Test
    @DisplayName("Test if thread is valid")
    public void ValidThread(){


    }

    //Clean Up bits
    @AfterEach
    public void afterEachTest(){
        System.out.println("Just completed a test!");
    }

    @AfterAll
    public static void weAreDoneNow(){
        System.out.println("This is the last thing to be printed!");
    }


}