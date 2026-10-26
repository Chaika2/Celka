package celestial;

import java.util.Random;

public class xR_2 extends Wt_1 {
   protected xR_2(Jq_1 var1) {
      super(0.3125F, var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, Boolean.valueOf(false))
            .id_class(id_final, Boolean.valueOf(false))
            .id_class(id_package, Boolean.valueOf(false))
            .id_class(id_int, Boolean.valueOf(false))
            .id_class(id_new, Boolean.valueOf(false))
            .id_class(id_continue, Boolean.valueOf(false))
      );
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.id_byte(var3.id_break());
      boolean var5 = !var2.id_byte(var3.id_final()).id_catch() && !var4.id_catch();

      for (rpr_3 var7 : rpb_3.HORIZONTAL) {
         rfH_2 var8 = var3.id_break(var7);
         xd_3 var9 = var2.id_byte(var8).id_break();
         if (var9 == this) {
            if (var5) {
               return false;
            }

            xd_3 var10 = var2.id_byte(var8.id_break()).id_break();
            if (var10 == this || var10 == xu_3.Sh) {
               return true;
            }
         }
      }

      xd_3 var11 = var4.id_break();
      return var11 == this || var11 == xu_3.Sh;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final, id_package, id_int, id_new, id_continue);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_class(var1.id_int(), var1.id_class());
   }

   public xc_3 id_class(rRq_1 var1, rfH_2 var2) {
      xd_3 var3 = var1.id_byte(var2.id_break()).id_break();
      xd_3 var4 = var1.id_byte(var2.id_final()).id_break();
      xd_3 var5 = var1.id_byte(var2.id_private()).id_break();
      xd_3 var6 = var1.id_byte(var2.id_extends()).id_break();
      xd_3 var7 = var1.id_byte(var2.id_protected()).id_break();
      xd_3 var8 = var1.id_byte(var2.id_byte()).id_break();
      return this.id_continue()
         .id_class(id_continue, Boolean.valueOf(var3 == this || var3 == xu_3.bl || var3 == xu_3.Sh))
         .id_class(id_new, Boolean.valueOf(var4 == this || var4 == xu_3.bl))
         .id_class(id_volatile, Boolean.valueOf(var5 == this || var5 == xu_3.bl))
         .id_class(id_final, Boolean.valueOf(var6 == this || var6 == xu_3.bl))
         .id_class(id_package, Boolean.valueOf(var7 == this || var7 == xu_3.bl))
         .id_class(id_int, Boolean.valueOf(var8 == this || var8 == xu_3.bl));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.id_class(var4, var5)) {
         var4.id_finally().id_class(var5, this, 1);
         return super.id_class(var1, var2, var3, var4, var5, var6);
      } else {
         boolean var7 = var3.id_break() == this || var3.id_class(xu_3.bl) || var2 == rpr_3.DOWN && var3.id_class(xu_3.Sh);
         return var1.id_class(id_super.get(var2), Boolean.valueOf(var7));
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.id_class(var2, var3)) {
         var2.id_break(var3, true);
      }
   }
}
