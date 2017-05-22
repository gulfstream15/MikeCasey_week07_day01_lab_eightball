package com.codeclan.example.eightball;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */
public class AnswerProviderTest {

   @Test
    public void answersAreNotNull() {
        AnswerProvider provider = new AnswerProvider();
        assertNotNull(provider.getAnswers());
   }

   @Test
    public void hasTwoAnswersByDefault() {
        AnswerProvider provider = new AnswerProvider();
        assertEquals(2, provider.getNumberOfAnswers());
   }

   @Test
    public void canAddAnswer () {
        AnswerProvider provider = new AnswerProvider();
        provider.add("AYE RIGHT MATE");
        assertEquals(3, provider.getNumberOfAnswers());
   }

   @Test
    public void canGetAnswerAtIndex() {
        AnswerProvider provider = new AnswerProvider();
        String answer = provider.getAnswerAtIndex(1);
        assertEquals("Like, no.", answer);
   }

   @Test
    public void canGetRandomAnswer() {
       AnswerProvider provider = new AnswerProvider();
       String answer = provider.getAnswer();
       assertNotNull(answer);
   }
}