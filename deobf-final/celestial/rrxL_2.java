package celestial;

import java.util.Arrays;
import java.util.List;

public class rrxL_2 {
   private static boolean class_;
   private static final Hn_1[] break_ = new Hn_1[HU.long_()];

   private static void byte_(List<Hn_1> var0) {
      for (int var1 = 0; var1 < var0.size(); var1++) {
         Hn_1 var2 = (Hn_1)var0.get(var1);
         class_(var2, var1);
      }
   }

   public static void class_() {
      if (!class_) {
         class_ = true;
         Arrays.fill(break_, null);
      }
   }

   public static void class_(List<Hn_1> var0) {
      if (class_) {
         byte_(var0);
      } else {
         for (int var1 = 0; var1 < var0.size(); var1++) {
            Hn_1 var2 = (Hn_1)var0.get(var1);
            var2.class_();
         }
      }
   }

   private static void class_(Hn_1 var0, int var1) {
      Hn_1 var2 = break_[var1];
      if (var2 != null) {
         if (var0 == var2) {
            break_[var1] = null;
            return;
         }

         var2.break_();
         break_[var1] = null;
      }

      var0.class_();
   }

   public static void break_() {
      if (class_) {
         class_ = false;

         for (int var0 = 0; var0 < break_.length; var0++) {
            Hn_1 var1 = break_[var0];
            if (var1 != null) {
               var1.break_();
            }
         }

         Arrays.fill(break_, null);
      }
   }

   public static void break_(List<Hn_1> var0) {
      if (class_) {
         protected_(var0);
      } else {
         for (int var1 = 0; var1 < var0.size(); var1++) {
            Hn_1 var2 = (Hn_1)var0.get(var1);
            var2.break_();
         }
      }
   }

   private static void break_(Hn_1 var0, int var1) {
      Hn_1 var2 = break_[var1];
      if (var2 != null) {
         var2.break_();
      }

      break_[var1] = var0;
   }

   private static void protected_(List<Hn_1> var0) {
      for (int var1 = 0; var1 < var0.size(); var1++) {
         Hn_1 var2 = (Hn_1)var0.get(var1);
         break_(var2, var1);
      }
   }
}
