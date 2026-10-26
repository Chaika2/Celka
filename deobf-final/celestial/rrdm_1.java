package celestial;

public class rrdm_1 {
   public static boolean class_(rrkb_1 var0, rrdD[] var1, boolean var2) {
      if (var0 == null) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         String[] var3 = var0.break_();

         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            rrdD var6 = class_(var5, var1);
            if (var6 != null) {
               String var7 = var2 ? var6.throws_() : var6.protected_();
               String var8 = var0.class_(var5);
               if (!rrbb_3.class_((Object)var7, (Object)var8)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public static rrkb_1 class_(rrkb_1[] var0, rrdD[] var1, boolean var2) {
      if (var0 == null) {
         return null;
      } else {
         for (int var3 = 0; var3 < var0.length; var3++) {
            rrkb_1 var4 = var0[var3];
            if (class_(var4, var1, var2)) {
               return var4;
            }
         }

         return null;
      }
   }

   public static rrdD class_(String var0, rrdD[] var1) {
      if (var1 == null) {
         return null;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            rrdD var3 = var1[var2];
            if (var3.class_().equals(var0)) {
               return var3;
            }
         }

         return null;
      }
   }
}
