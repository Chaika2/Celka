package celestial;

public class rrdm_1 {
   public static boolean id_class(rrkb_1 var0, rrdD[] var1, boolean var2) {
      if (var0 == null) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         String[] var3 = var0.id_break();

         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            rrdD var6 = id_class(var5, var1);
            if (var6 != null) {
               String var7 = var2 ? var6.id_throws() : var6.id_protected();
               String var8 = var0.id_class(var5);
               if (!rrbb_3.id_class((Object)var7, (Object)var8)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public static rrkb_1 id_class(rrkb_1[] var0, rrdD[] var1, boolean var2) {
      if (var0 == null) {
         return null;
      } else {
         for (int var3 = 0; var3 < var0.length; var3++) {
            rrkb_1 var4 = var0[var3];
            if (id_class(var4, var1, var2)) {
               return var4;
            }
         }

         return null;
      }
   }

   public static rrdD id_class(String var0, rrdD[] var1) {
      if (var1 == null) {
         return null;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            rrdD var3 = var1[var2];
            if (var3.id_class().equals(var0)) {
               return var3;
            }
         }

         return null;
      }
   }
}
