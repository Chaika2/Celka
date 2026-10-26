package celestial;

import java.util.ArrayList;
import java.util.List;

public class rrWU {
   private static long class_ = System.currentTimeMillis();
   private static long break_ = private_();
   private static long byte_ = class_;
   private static long protected_ = break_;
   private static boolean throws_ = false;
   private static long case_ = 0L;
   private static long catch_ = 0L;
   private static List<Long> private_ = new ArrayList<>();
   private static long implements_ = 0L;
   private static long finally_ = 1048576L;

   public static long byte_() {
      return break_ / finally_;
   }

   public static void class_() {
      long var0 = System.currentTimeMillis();
      long var2 = private_();
      throws_ = var2 < protected_;
      if (throws_) {
         implements_ = case_;
         class_ = var0;
         break_ = var2;
      }

      long var4 = var0 - class_;
      long var6 = var2 - break_;
      double var8 = (double)var4 / 1000.0;
      if (var6 >= 0L && var8 > 0.0) {
         case_ = (long)((double)var6 / var8);
         private_.add(case_);
         if (var0 / 1000L != byte_ / 1000L) {
            long var10 = 0L;

            for (Long var13 : private_) {
               var10 += var13;
            }

            catch_ = var10 / (long)private_.size();
            private_.clear();
         }
      }

      byte_ = var0;
      protected_ = var2;
   }

   public static long break_() {
      return class_;
   }

   public static long throws_() {
      return case_ / finally_;
   }

   public static long catch_() {
      return implements_ / finally_;
   }

   public static long case_() {
      return catch_ / finally_;
   }

   public static boolean protected_() {
      return throws_;
   }

   private static long private_() {
      Runtime var0 = Runtime.getRuntime();
      return var0.totalMemory() - var0.freeMemory();
   }
}
