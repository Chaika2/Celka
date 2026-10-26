package celestial;

public enum rrBv_1 implements rrBn_1 {
   NORMAL,
   FUZZY;

   protected int class_(rKA<?> var1, int var2, int var3, int var4, int var5) {
      if (var3 == var4 && var4 == var5) {
         return var3;
      } else if (var2 == var3 && var2 == var4) {
         return var2;
      } else if (var2 == var3 && var2 == var5) {
         return var2;
      } else if (var2 == var4 && var2 == var5) {
         return var2;
      } else if (var2 == var3 && var4 != var5) {
         return var2;
      } else if (var2 == var4 && var3 != var5) {
         return var2;
      } else if (var2 == var5 && var3 != var4) {
         return var2;
      } else if (var3 == var4 && var2 != var5) {
         return var3;
      } else if (var3 == var5 && var2 != var4) {
         return var3;
      } else {
         return var4 == var5 && var2 != var3 ? var4 : var1.class_(var2, var3, var4, var5);
      }
   }

   @Override
   public int class_(rKA<?> var1, rKj_1 var2, int var3, int var4) {
      int var5 = var2.class_(this.class_(var3), this.break_(var4));
      var1.class_((long)(var3 >> 1 << 1), (long)(var4 >> 1 << 1));
      int var6 = var3 & 1;
      int var7 = var4 & 1;
      if (var6 == 0 && var7 == 0) {
         return var5;
      } else {
         int var8 = var2.class_(this.class_(var3), this.break_(var4 + 1));
         int var9 = var1.class_(var5, var8);
         if (var6 == 0 && var7 == 1) {
            return var9;
         } else {
            int var10 = var2.class_(this.class_(var3 + 1), this.break_(var4));
            int var11 = var1.class_(var5, var10);
            if (var6 == 1 && var7 == 0) {
               return var11;
            } else {
               int var12 = var2.class_(this.class_(var3 + 1), this.break_(var4 + 1));
               return this.class_(var1, var5, var10, var8, var12);
            }
         }
      }
   }

   @Override
   public int class_(int var1) {
      return var1 >> 1;
   }

   @Override
   public int break_(int var1) {
      return var1 >> 1;
   }
}
