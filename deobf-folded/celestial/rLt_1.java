package celestial;

public class rLt_1 extends rLn_1 {
   private final boolean id_finally;

   private rLp_1 id_byte(int var1, int var2, int var3) {
      rfw_3 var4 = new rfw_3();

      for (int var5 = var1; var5 < var1 + this.id_protected; var5++) {
         for (int var6 = var2; var6 < var2 + this.id_throws; var6++) {
            for (int var7 = var3; var7 < var3 + this.id_case; var7++) {
               rXE var8 = this.id_class.id_break(var4.id_class(var5, var6, var7));
               xc_3 var9 = this.id_class.id_byte(var4.id_class(var5, var6, var7));
               if (var8.id_byte() && var9.id_class(this.id_class, var4.id_break(), rLT.WATER) && var9.id_catch()) {
                  return rLp_1.BREACH;
               }

               if (!var8.id_class(rlG_2.id_break)) {
                  return rLp_1.BLOCKED;
               }
            }
         }
      }

      xc_3 var10 = this.id_class.id_byte(var4);
      return var10.id_class(this.id_class, var4, rLT.WATER) ? rLp_1.WATER : rLp_1.BLOCKED;
   }

   public rLt_1(boolean var1) {
      this.id_finally = var1;
   }

   @Override
   public rLp_1 id_class(rRq_1 var1, int var2, int var3, int var4, is_3 var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      return this.id_class(var1, var2, var3, var4);
   }

   @Override
   protected rLq_1 id_class(int var1, int var2, int var3) {
      rLq_1 var4 = null;
      rLp_1 var5 = this.id_class((rYB)this.id_break.id_throws[7], var1, var2, var3);
      float var6 = this.id_break.id_class(var5);
      if (var6 >= 0.0F) {
         var4 = super.id_class(var1, var2, var3);
         var4.id_native = var5;
         var4.id_extends = Math.max(var4.id_extends, var6);
         if (this.id_class.id_break(new rfH_2(var1, var2, var3)).id_byte()) {
            var4.id_extends += 8.0F;
         }
      }

      return var5 == rLp_1.OPEN ? var4 : var4;
   }

   @Override
   public rLp_1 id_class(rRq_1 var1, int var2, int var3, int var4) {
      rfH_2 var5 = new rfH_2(var2, var3, var4);
      rXE var6 = var1.id_break(var5);
      xc_3 var7 = var1.id_byte(var5);
      if (var6.id_byte() && var7.id_class(var1, var5.id_break(), rLT.WATER) && var7.id_catch()) {
         return rLp_1.BREACH;
      } else {
         return var6.id_class(rlG_2.id_break) && var7.id_class(var1, var5, rLT.WATER) ? rLp_1.WATER : rLp_1.BLOCKED;
      }
   }

   @Override
   public rLv_1 id_class(double var1, double var3, double var5) {
      return new rLv_1(
         super.id_class(
            rfU_2.id_byte(var1 - (double)(this.id_break.PN() / 2.0F)), rfU_2.id_byte(var3 + 0.5), rfU_2.id_byte(var5 - (double)(this.id_break.PN() / 2.0F))
         )
      );
   }

   @Override
   public int id_class(rLq_1[] var1, rLq_1 var2) {
      int var3 = 0;

      for (rpr_3 var7 : rpr_3.values()) {
         rLq_1 var8 = this.id_break(var2.id_class + var7.id_implements(), var2.id_break + var7.id_finally(), var2.id_byte + var7.id_extends());
         if (var8 != null && !var8.id_implements) {
            var1[var3++] = var8;
         }
      }

      return var3;
   }

   private rLq_1 id_break(int var1, int var2, int var3) {
      rLp_1 var4 = this.id_byte(var1, var2, var3);
      return (!this.id_finally || var4 != rLp_1.BREACH) && var4 != rLp_1.WATER ? null : this.id_class(var1, var2, var3);
   }

   @Override
   public rLq_1 id_break() {
      return super.id_class(
         rfU_2.id_byte(this.id_break.rN().id_class), rfU_2.id_byte(this.id_break.rN().id_break + 0.5), rfU_2.id_byte(this.id_break.rN().id_byte)
      );
   }
}
