package celestial;

import java.util.BitSet;

public class rrMh_1 {
   private static boolean class_;
   private static BitSet break_ = new BitSet();
   private static BitSet byte_ = new BitSet();

   public static void byte_() {
      byte_.clear();
   }

   public static boolean class_() {
      return class_ && !rrdZ.new_;
   }

   public static void class_(int var0) {
      if (var0 >= 0) {
         byte_.set(var0);
      }
   }

   public static void class_(fJ_2 var0) {
      if (var0.finally_()) {
         break_.clear();
      }
   }

   public static void class_(BitSet var0) {
      if (var0 != null) {
         break_.or(var0);
      }
   }

   public static void class_(fj_3 var0) {
      if (var0.try_()) {
         int var1 = var0.continue_();
         if (var1 >= 0) {
            break_.set(var1);
         }
      }
   }

   public static boolean break_(fj_3 var0) {
      if (!var0.try_()) {
         return true;
      } else {
         int var1 = var0.continue_();
         return var1 < 0 ? false : break_.get(var1);
      }
   }

   public static boolean break_(int var0) {
      return var0 < 0 ? false : byte_.get(var0);
   }

   public static void break_() {
      class_ = rrbb_3.rE().rW;
   }
}
