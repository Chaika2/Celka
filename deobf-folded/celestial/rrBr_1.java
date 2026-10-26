package celestial;

public enum rrBr_1 implements rrBl_1 {
   INSTANCE;

   @Override
   public int id_class(rKC var1, int var2, int var3, int var4, int var5, int var6) {
      if (!rrBx_1.id_break(var6) || rrBx_1.id_break(var5) && rrBx_1.id_break(var4) && rrBx_1.id_break(var2) && rrBx_1.id_break(var3)) {
         if (!rrBx_1.id_break(var6)
            && (rrBx_1.id_break(var5) || rrBx_1.id_break(var2) || rrBx_1.id_break(var4) || rrBx_1.id_break(var3))
            && var1.id_class(5) == 0) {
            if (rrBx_1.id_break(var5)) {
               return var6 == 4 ? 4 : var5;
            }

            if (rrBx_1.id_break(var2)) {
               return var6 == 4 ? 4 : var2;
            }

            if (rrBx_1.id_break(var4)) {
               return var6 == 4 ? 4 : var4;
            }

            if (rrBx_1.id_break(var3)) {
               return var6 == 4 ? 4 : var3;
            }
         }

         return var6;
      } else {
         int var7 = 1;
         int var8 = 1;
         if (!rrBx_1.id_break(var5) && var1.id_class(var7++) == 0) {
            var8 = var5;
         }

         if (!rrBx_1.id_break(var4) && var1.id_class(var7++) == 0) {
            var8 = var4;
         }

         if (!rrBx_1.id_break(var2) && var1.id_class(var7++) == 0) {
            var8 = var2;
         }

         if (!rrBx_1.id_break(var3) && var1.id_class(var7++) == 0) {
            var8 = var3;
         }

         if (var1.id_class(3) == 0) {
            return var8;
         } else {
            return var8 == 4 ? 4 : var6;
         }
      }
   }
}
