package celestial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrWV implements Iterable<String> {
   ArrayList<String> class_ = new ArrayList<>();

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < this.class_.size(); var2++) {
         String var3 = this.class_.get(var2);
         var1.append(var3);
         var1.append("\n");
      }

      return var1.toString();
   }

   @Override
   public Iterator<String> iterator() {
      return new rrWg_1(this);
   }

   public int class_() {
      return this.class_.size();
   }

   public void class_(int var1, String[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         String var4 = var2[var3];
         this.break_(var4);
      }

      this.class_.addAll(var1, Arrays.asList(var2));
   }

   public int class_(Pattern var1) {
      for (int var2 = 0; var2 < this.class_.size(); var2++) {
         String var3 = this.class_.get(var2);
         Matcher var4 = var1.matcher(var3);
         if (var4.matches()) {
            return var2;
         }
      }

      return -1;
   }

   public static rrWV class_(Reader var0) throws IOException {
      rrWV var1 = new rrWV();
      BufferedReader var2 = new BufferedReader(var0);

      while (true) {
         String var3 = var2.readLine();
         if (var3 == null) {
            var2.close();
            return var1;
         }

         var1.class_(var3);
      }
   }

   public String class_(int var1) {
      return this.class_.get(var1);
   }

   public void class_(String var1) {
      this.break_(var1);
      this.class_.add(var1);
   }

   public void class_(String[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         this.class_(var3);
      }
   }

   public void class_(int var1, String var2) {
      this.break_(var2);
      this.class_.add(var1, var2);
   }

   private void break_(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Line is null");
      } else if (var1.indexOf(10) >= 0) {
         throw new IllegalArgumentException("Line contains LF");
      } else if (var1.indexOf(13) >= 0) {
         throw new IllegalArgumentException("Line contains CR");
      }
   }

   public String[] break_() {
      return this.class_.toArray(new String[this.class_.size()]);
   }
}
