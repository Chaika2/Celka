package celestial;

public class rrMl_1 {
   public static boolean class_(int var0, int[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            if (var1[var2] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean class_(fj_3 var0, fj_3[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            if (var1[var2] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean class_(rYG var0, rrMk_1[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            rrMk_1 var3 = var1[var2];
            if (var3 != null && var3.class_() == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean class_(int var0, rrMn_1[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            rrMn_1 var3 = var1[var2];
            if (var3.class_() == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean class_(int var0, int var1, rrMn_1[] var2) {
      if (var2 == null) {
         return true;
      } else {
         for (int var3 = 0; var3 < var2.length; var3++) {
            rrMn_1 var4 = var2[var3];
            if (var4.class_(var0, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean class_(xc_3 var0, rrMn_1[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            rrMn_1 var3 = var1[var2];
            if (var3.class_(var0)) {
               return true;
            }
         }

         return false;
      }
   }
}
