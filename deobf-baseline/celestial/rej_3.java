package celestial;

import java.util.Random;

public class rej_3 extends rrrn_1 {
   public rej_3(rfH_2 var1) {
      super(raF_2.G, 0);
      this.id_final = new rfi_3(var1.b_(), var1.c_(), var1.d_(), var1.b_(), var1.c_(), var1.d_());
   }

   public rej_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.G, var2);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      int var8 = var1.id_class(rKv_1.OCEAN_FLOOR_WG, this.id_final.id_class, this.id_final.id_byte);
      rfw_3 var9 = new rfw_3(this.id_final.id_class, var8, this.id_final.id_byte);

      while (var9.c_() > 0) {
         xc_3 var10 = var1.id_byte(var9);
         xc_3 var11 = var1.id_byte(var9.id_break());
         if (var11 == xu_3.F.id_continue()
            || var11 == xu_3.id_break.id_continue()
            || var11 == xu_3.id_catch.id_continue()
            || var11 == xu_3.id_byte.id_continue()
            || var11 == xu_3.id_throws.id_continue()) {
            xc_3 var12 = !var10.id_catch() && !this.id_class(var10) ? var10 : xu_3.id_throw.id_continue();

            for (rpr_3 var16 : rpr_3.values()) {
               rfH_2 var17 = var9.id_break(var16);
               xc_3 var18 = var1.id_byte(var17);
               if (var18.id_catch() || this.id_class(var18)) {
                  rfH_2 var19 = var17.id_break();
                  xc_3 var20 = var1.id_byte(var19);
                  if ((var20.id_catch() || this.id_class(var20)) && var16 != rpr_3.UP) {
                     var1.id_class(var17, var11, 3);
                  } else {
                     var1.id_class(var17, var12, 3);
                  }
               }
            }

            this.id_final = new rfi_3(var9.b_(), var9.c_(), var9.d_(), var9.b_(), var9.c_(), var9.d_());
            return this.id_class(var1, var5, var4, var9, rzl_3.id_long, (xc_3)null);
         }

         var9.id_byte(0, -1, 0);
      }

      return false;
   }

   private boolean id_class(xc_3 var1) {
      return var1 == xu_3.id_try.id_continue() || var1 == xu_3.id_instanceof.id_continue();
   }

   @Override
   protected void id_class(rcd_3 var1) {
   }
}
