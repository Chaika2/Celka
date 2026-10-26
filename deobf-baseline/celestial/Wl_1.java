package celestial;

import java.util.Random;

public class Wl_1 extends xd_3 implements kd_3 {
   private static final rjC_2 id_int;
   private static final rjC_2 id_new;
   private static final rjC_2 id_continue = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final rjC_2 id_super = rjw_3.id_break().id_class(0.0, -1.0, 0.0);
   public static final rCm_1 id_volatile = rCT.p;
   public static final rCN id_final = rCT.id_throw;
   public static final rCN id_package = rCT.id_break;

   @Override
   public rjC_2 id_byte(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return rjw_3.id_break();
   }

   protected Wl_1(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, Integer.valueOf(7))
            .id_class(id_final, Boolean.valueOf(false))
            .id_class(id_package, Boolean.valueOf(false))
      );
   }

   static {
      rjC_2 var0 = xd_3.id_class(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      rjC_2 var1 = xd_3.id_class(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      rjC_2 var2 = xd_3.id_class(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      rjC_2 var3 = xd_3.id_class(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      rjC_2 var4 = xd_3.id_class(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      id_int = rjw_3.id_class(var0, var1, var2, var3, var4);
      rjC_2 var5 = xd_3.id_class(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      rjC_2 var6 = xd_3.id_class(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      rjC_2 var7 = xd_3.id_class(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      rjC_2 var8 = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      id_new = rjw_3.id_class(Wl_1.id_continue, id_int, var6, var5, var8, var7);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final, id_package);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      super.id_class(var1, var2, var3, var4);
      var4.rL();
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return id_class(var2, var3) < 7;
   }

   private boolean id_class(rRq_1 var1, rfH_2 var2, int var3) {
      return var3 > 0 && !var1.id_byte(var2.id_break()).id_class(this);
   }

   public static int id_class(rRq_1 var0, rfH_2 var1) {
      rfw_3 var2 = var1.id_new().id_class(rpr_3.DOWN);
      xc_3 var3 = var0.id_byte(var2);
      int var4 = 7;
      if (var3.id_class(xu_3.hU)) {
         var4 = var3.id_byte(id_volatile);
      } else if (var3.id_protected(var0, var2, rpr_3.UP)) {
         return 0;
      }

      for (rpr_3 var6 : rpb_3.HORIZONTAL) {
         xc_3 var7 = var0.id_byte(var2.id_class(var1, var6));
         if (var7.id_class(xu_3.hU)) {
            var4 = Math.min(var4, var7.id_byte(id_volatile) + 1);
            if (var4 == 1) {
               break;
            }
         }
      }

      return var4;
   }

   @Override
   public boolean id_class(xc_3 var1, rxx_3 var2) {
      return var2.id_volatile().id_break() == this.id_case();
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (!var4.id_class(var1.id_break().id_case())) {
         return var1.id_byte(id_package) ? id_new : id_int;
      } else {
         return rjw_3.id_break();
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rfH_2 var2 = var1.id_class();
      rYB var3 = var1.id_int();
      int var4 = id_class(var3, var2);
      return this.id_continue()
         .id_class(id_final, Boolean.valueOf(var3.id_break(var2).id_class() == rXG.id_byte))
         .id_class(id_volatile, Integer.valueOf(var4))
         .id_class(id_package, Boolean.valueOf(this.id_class(var3, var2, var4)));
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var2.id_continue) {
         var2.id_finally().id_class(var3, this, 1);
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_final)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      if (!var4.id_import()) {
         var4.id_finally().id_class(var5, this, 1);
      }

      return var1;
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      int var5 = id_class(var2, var3);
      xc_3 var6 = var1.id_class(id_volatile, Integer.valueOf(var5)).id_class(id_package, Boolean.valueOf(this.id_class(var2, var3, var5)));
      if (var6.id_byte(id_volatile) == 7) {
         if (var1.id_byte(id_volatile) == 7) {
            var2.a_(new rsB_2(var2, (double)var3.b_() + 0.5, (double)var3.c_(), (double)var3.d_() + 0.5, var6.id_class(id_final, Boolean.valueOf(false))));
         } else {
            var2.id_break(var3, true);
         }
      } else if (var1 != var6) {
         var2.id_class(var3, var6, 3);
      }
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var4.id_class(rjw_3.id_break(), var3, true) && !var4.id_class()) {
         return id_int;
      } else {
         return var1.id_byte(id_volatile) != 0 && var1.id_byte(id_package) && var4.id_class(id_super, var3, true) ? id_continue : rjw_3.id_class();
      }
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_final) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }
}
