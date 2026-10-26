package celestial;

public enum rrBE implements rrBp_1 {
   INSTANCE;

   private boolean id_class(int[] var1, int var2) {
      if (!rrBx_1.id_class(var2, 3)) {
         return false;
      } else {
         var1[0] = var2;
         return true;
      }
   }

   private boolean id_class(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var6 != var7) {
         return false;
      } else {
         if (rrBx_1.id_class(var2, var7) && rrBx_1.id_class(var3, var7) && rrBx_1.id_class(var5, var7) && rrBx_1.id_class(var4, var7)) {
            var1[0] = var6;
         } else {
            var1[0] = var8;
         }

         return true;
      }
   }

   @Override
   public int id_class(rKC var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = new int[1];
      if (!this.id_class(var7, var6)
         && !this.id_class(var7, var2, var3, var4, var5, var6, 38, 37)
         && !this.id_class(var7, var2, var3, var4, var5, var6, 39, 37)
         && !this.id_class(var7, var2, var3, var4, var5, var6, 32, 5)) {
         if (var6 != 2 || var2 != 12 && var3 != 12 && var5 != 12 && var4 != 12) {
            if (var6 == 6) {
               if (var2 == 2
                  || var3 == 2
                  || var5 == 2
                  || var4 == 2
                  || var2 == 30
                  || var3 == 30
                  || var5 == 30
                  || var4 == 30
                  || var2 == 12
                  || var3 == 12
                  || var5 == 12
                  || var4 == 12) {
                  return 1;
               }

               if (var2 == 21 || var4 == 21 || var3 == 21 || var5 == 21 || var2 == 168 || var4 == 168 || var3 == 168 || var5 == 168) {
                  return 23;
               }
            }

            return var6;
         } else {
            return 34;
         }
      } else {
         return var7[0];
      }
   }
}
