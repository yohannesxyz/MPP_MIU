package lesson8.lecture.lambdaexamples.runnable;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class RunnableExample {
   public static void main(String[] args) {
      repeatMessage("Hello", 10);
   }

   public static void repeatMessage(String text, int count) {
      Runnable r = () -> {
         for (int i = 0; i < count; i++) {
        //	 count--;
        	 // text =text + " Hi";
            System.out.println(text);
         }
      };
      new Thread(r).start();                  
   }

   public static void repeatMessage2(String text, int count) // Infinite loop
   {
      Runnable r = () -> {
         while (count > 0) {
            // count--; // Error: Can't mutate captured variable
            System.out.println(text);
            Thread.yield();
         }
      };
      new Thread(r).start();                  
   }

   public static void countMatches(Path dir, String word) throws IOException {
      Path[] files = getDescendants(dir);
      int matches = 0;
      for (Path p : files) 
         new Thread(() -> { if (contains(p, word)) {
                  // matches++; 
                  // ERROR: Illegal to mutate matches
               }}).start();
   }
   

   private static int matches;

   public static void countMatches2(Path dir, String word) {
      Path[] files = getDescendants(dir);
      for (Path p : files) 
         new Thread(() -> { if (contains(p, word)) {
                  matches++; 
                  // CAUTION: Legal to mutate matches, but not threadsafe      
               }}).start();
   }

   // Warning: Bad code ahead
   public static List<Path> collectMatches(Path dir, String word) {
      Path[] files = getDescendants(dir);
      List<Path> matches = new ArrayList<>();
      for (Path p : files) 
         new Thread(() -> { if (contains(p, word)) {
                  matches.add(p);
                  // CAUTION: Legal to mutate matches, but not threadsafe
               }}).start();
      return matches;
   }

   public static Path[] getDescendants(Path dir) {
      try {
         try (Stream<Path> entries = Files.walk(dir)) {
            return entries.toArray(Path[]::new);
         }
      } catch (IOException ex) {
         return new Path[0];
      }
   }

   public static boolean contains(Path p, String word) {
      try {
         return new String(Files.readAllBytes(p), 
            StandardCharsets.UTF_8).contains(word);
      } catch (IOException ex) {
         return false;
      }
   }
}
