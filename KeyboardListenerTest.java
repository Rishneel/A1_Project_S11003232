package com.mycompany.snake_game;

import org.junit.jupiter.api.*;

import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardListenerTest {

    private KeyboardListener keyboardListener;
    private Window Wind;

    @BeforeAll
    public static void setupAll(){
        System.out.println("I should be printed before all the tests commence!");
    }

    @BeforeEach
    public void setup(){
        System.out.println("I am Instantiating the User Test Scripts!");
        //Helps initialise the UserObject
        keyboardListener = new KeyboardListener();
        Wind = new Window();

    }
    //Actual Test Cases
    @Test
    @DisplayName("Test if key is valid")
    public void DownValidKey(){
       KeyEvent Keypressedtest = new KeyEvent(Wind, KeyEvent.KEY_PRESSED,System.currentTimeMillis(), 0 , KeyEvent.VK_DOWN, 'U');
       keyboardListener.keyPressed(Keypressedtest);
    }
    @Test
    @DisplayName("Test if key is valid")
    public void UpValidKey(){
        KeyEvent Keypressedtest = new KeyEvent(Wind, KeyEvent.KEY_PRESSED,System.currentTimeMillis(), 0 , KeyEvent.VK_UP, 'U');
        keyboardListener.keyPressed(Keypressedtest);
    }
    @Test
    @DisplayName("Test if key is valid")
    public void LeftValidKey(){
        KeyEvent Keypressedtest = new KeyEvent(Wind, KeyEvent.KEY_PRESSED,System.currentTimeMillis(), 0 , KeyEvent.VK_LEFT, 'U');
        keyboardListener.keyPressed(Keypressedtest);
    }
    @Test
    @DisplayName("Test if key is valid")
    public void RightValidKey(){
        KeyEvent Keypressedtest = new KeyEvent(Wind, KeyEvent.KEY_PRESSED,System.currentTimeMillis(), 0 , KeyEvent.VK_RIGHT, 'U');
        keyboardListener.keyPressed(Keypressedtest);
    }

    @Test
    @DisplayName("Test if key is invalid")
    public void F6ValidKey(){
        KeyEvent Keypressedtest = new KeyEvent(Wind, KeyEvent.KEY_PRESSED,System.currentTimeMillis(), 0 , KeyEvent.VK_F6, 'U');
        keyboardListener.keyPressed(Keypressedtest);
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