package celestial;

import java.util.BitSet;

public class rrMh_1 {
   private static boolean id_class;
   private static BitSet id_break = new BitSet();
   private static BitSet id_byte = new BitSet();

   public static void id_byte() {
      id_byte.clear();
   }

   public static boolean id_class() {
      return id_class && !rrdZ.id_new;
   }

   public static void id_class(int var0) {
      if (var0 >= 0) {
         id_byte.set(var0);
      }
   }

   public static void id_class(fJ_2 var0) {
      if (var0.id_finally()) {
         id_break.clear();
      }
   }

   public static void id_class(BitSet var0) {
      if (var0 != null) {
         id_break.or(var0);
      }
   }

   public static void id_class(fj_3 var0) {
      if (var0.id_try()) {
         int var1 = var0.id_continue();
         if (var1 >= 0) {
            id_break.set(var1);
         }
      }
   }

   public static boolean id_break(fj_3 var0) {
      if (!var0.id_try()) {
         return true;
      } else {
         int var1 = var0.id_continue();
         return var1 < 0 ? false : id_break.get(var1);
      }
   }

   public static boolean id_break(int var0) {
      return var0 < 0 ? false : id_byte.get(var0);
   }

   public static void id_break() {
      id_class = rrbb_3.rE().rW;
   }
}
