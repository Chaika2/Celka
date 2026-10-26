package celestial;

import java.util.Arrays;
import java.util.List;

public class rrxL_2 {
   private static boolean id_class;
   private static final Hn_1[] id_break = new Hn_1[HU.id_long()];

   private static void id_byte(List<Hn_1> var0) {
      for (int var1 = 0; var1 < var0.size(); var1++) {
         Hn_1 var2 = (Hn_1)var0.get(var1);
         id_class(var2, var1);
      }
   }

   public static void id_class() {
      if (!id_class) {
         id_class = true;
         Arrays.fill(id_break, null);
      }
   }

   public static void id_class(List<Hn_1> var0) {
      if (id_class) {
         id_byte(var0);
      } else {
         for (int var1 = 0; var1 < var0.size(); var1++) {
            Hn_1 var2 = (Hn_1)var0.get(var1);
            var2.id_class();
         }
      }
   }

   private static void id_class(Hn_1 var0, int var1) {
      Hn_1 var2 = id_break[var1];
      if (var2 != null) {
         if (var0 == var2) {
            id_break[var1] = null;
            return;
         }

         var2.id_break();
         id_break[var1] = null;
      }

      var0.id_class();
   }

   public static void id_break() {
      if (id_class) {
         id_class = false;

         for (int var0 = 0; var0 < id_break.length; var0++) {
            Hn_1 var1 = id_break[var0];
            if (var1 != null) {
               var1.id_break();
            }
         }

         Arrays.fill(id_break, null);
      }
   }

   public static void id_break(List<Hn_1> var0) {
      if (id_class) {
         id_protected(var0);
      } else {
         for (int var1 = 0; var1 < var0.size(); var1++) {
            Hn_1 var2 = (Hn_1)var0.get(var1);
            var2.id_break();
         }
      }
   }

   private static void id_break(Hn_1 var0, int var1) {
      Hn_1 var2 = id_break[var1];
      if (var2 != null) {
         var2.id_break();
      }

      id_break[var1] = var0;
   }

   private static void id_protected(List<Hn_1> var0) {
      for (int var1 = 0; var1 < var0.size(); var1++) {
         Hn_1 var2 = (Hn_1)var0.get(var1);
         id_break(var2, var1);
      }
   }
}
