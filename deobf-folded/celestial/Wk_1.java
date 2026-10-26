package celestial;

import java.util.Random;

public abstract class Wk_1 extends kE_2 {
   protected static final rjC_2 id_final = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final rCN id_package = rCT.id_return;

   protected void id_byte(rYB var1, rfH_2 var2, xc_3 var3) {
      if (!this.id_class((rRR)var1, var2, var3)) {
         boolean var4 = var3.id_byte(id_package);
         boolean var5 = this.id_class(var1, var2, var3);
         if (var4 != var5 && !var1.id_finally().id_break(var2, this)) {
            rYr_1 var6 = rYr_1.HIGH;
            if (this.id_byte((rRq_1)var1, var2, var3)) {
               var6 = rYr_1.EXTREMELY_HIGH;
            } else if (var4) {
               var6 = rYr_1.VERY_HIGH;
            }

            var1.id_finally().id_class(var2, this, this.id_private(var3), var6);
         }
      }
   }

   public boolean id_byte(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      rpr_3 var4 = var3.id_byte(p).id_case();
      xc_3 var5 = var1.id_byte(var2.id_break(var4));
      return id_volatile(var5) && var5.id_byte(p) != var4;
   }

   @Override
   public boolean id_byte(xc_3 var1) {
      return true;
   }

   protected Wk_1(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return id_byte(var2, var3.id_break());
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(p, var1.id_case().id_case());
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (this.id_class(var1, var2, var3)) {
         var1.id_finally().id_class(var2, this, 1);
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      this.id_protected(var2, var3, var1);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final;
   }

   public boolean id_class(rRR var1, rfH_2 var2, xc_3 var3) {
      return false;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (var1.id_class((rRR)var2, var3)) {
         this.id_byte(var2, var3, var1);
      } else {
         ryO_2 var7 = this.id_protected() ? var2.id_class(var3) : null;
         id_class(var1, var2, var3, var7);
         var2.id_class(var3, false);

         for (rpr_3 var11 : rpr_3.values()) {
            var2.id_break(var3.id_break(var11), this);
         }
      }
   }

   protected boolean id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      return this.id_break(var1, var2, var3) > 0;
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      if (!var1.id_byte(id_package)) {
         return 0;
      } else {
         return var1.id_byte(p) == var4 ? this.id_break(var2, var3, var1) : 0;
      }
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.id_class(var4.id_break())) {
         super.id_break(var1, var2, var3, var4, var5);
         this.id_protected(var2, var3, var1);
      }
   }

   protected int id_break(rRR var1, rfH_2 var2, rpr_3 var3) {
      xc_3 var4 = var1.id_byte(var2);
      if (this.id_implements(var4)) {
         if (var4.id_class(xu_3.sn)) {
            return 15;
         } else {
            return var4.id_class(xu_3.ra) ? var4.id_byte(Wu_1.id_new) : var1.id_class(var2, var3);
         }
      } else {
         return 0;
      }
   }

   protected int id_break(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return 15;
   }

   protected int id_break(rRR var1, rfH_2 var2, xc_3 var3) {
      rpr_3 var4 = var3.id_byte(p);
      rpr_3 var5 = var4.id_catch();
      rpr_3 var6 = var4.id_private();
      return Math.max(this.id_break(var1, var2.id_break(var5), var5), this.id_break(var1, var2.id_break(var6), var6));
   }

   protected int id_break(rYB var1, rfH_2 var2, xc_3 var3) {
      rpr_3 var4 = var3.id_byte(p);
      rfH_2 var5 = var2.id_break(var4);
      int var6 = var1.id_byte(var5, var4);
      if (var6 >= 15) {
         return var6;
      } else {
         xc_3 var7 = var1.id_byte(var5);
         return Math.max(var6, var7.id_class(xu_3.ra) ? var7.id_byte(Wu_1.id_new) : 0);
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!this.id_class((rRR)var2, var3, var1)) {
         boolean var5 = var1.id_byte(id_package);
         boolean var6 = this.id_class((rYB)var2, var3, var1);
         if (var5 && !var6) {
            var2.id_class(var3, var1.id_class(id_package, Boolean.valueOf(false)), 2);
         } else if (!var5) {
            var2.id_class(var3, var1.id_class(id_package, Boolean.valueOf(true)), 2);
            if (!var6) {
               var2.id_synchronized().id_class(var3, this, this.id_private(var1), rYr_1.VERY_HIGH);
            }
         }
      }
   }

   @Override
   public int id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.id_break(var2, var3, var4);
   }

   protected boolean id_implements(xc_3 var1) {
      return var1.id_implements();
   }

   protected void id_protected(rYB var1, rfH_2 var2, xc_3 var3) {
      rpr_3 var4 = var3.id_byte(p);
      rfH_2 var5 = var2.id_break(var4.id_case());
      var1.id_class(var5, this, var2);
      var1.id_class(var5, this, var4);
   }

   protected abstract int id_private(xc_3 var1);

   public static boolean id_volatile(xc_3 var0) {
      return var0.id_break() instanceof Wk_1;
   }
}
