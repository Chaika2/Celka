package celestial;

import java.util.Random;

public class rej_3 extends rrrn_1 {
   public rej_3(rfH_2 var1) {
      super(raF_2.G, 0);
      this.final_ = new rfi_3(var1.b_(), var1.c_(), var1.d_(), var1.b_(), var1.c_(), var1.d_());
   }

   public rej_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.G, var2);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      int var8 = var1.class_(rKv_1.OCEAN_FLOOR_WG, this.final_.class_, this.final_.byte_);
      rfw_3 var9 = new rfw_3(this.final_.class_, var8, this.final_.byte_);

      while (var9.c_() > 0) {
         xc_3 var10 = var1.byte_(var9);
         xc_3 var11 = var1.byte_(var9.break_());
         if (var11 == xu_3.F.continue_()
            || var11 == xu_3.break_.continue_()
            || var11 == xu_3.catch_.continue_()
            || var11 == xu_3.byte_.continue_()
            || var11 == xu_3.throws_.continue_()) {
            xc_3 var12 = !var10.catch_() && !this.class_(var10) ? var10 : xu_3.throw_.continue_();

            for (rpr_3 var16 : rpr_3.values()) {
               rfH_2 var17 = var9.break_(var16);
               xc_3 var18 = var1.byte_(var17);
               if (var18.catch_() || this.class_(var18)) {
                  rfH_2 var19 = var17.break_();
                  xc_3 var20 = var1.byte_(var19);
                  if ((var20.catch_() || this.class_(var20)) && var16 != rpr_3.UP) {
                     var1.class_(var17, var11, 3);
                  } else {
                     var1.class_(var17, var12, 3);
                  }
               }
            }

            this.final_ = new rfi_3(var9.b_(), var9.c_(), var9.d_(), var9.b_(), var9.c_(), var9.d_());
            return this.class_(var1, var5, var4, var9, rzl_3.long_, (xc_3)null);
         }

         var9.byte_(0, -1, 0);
      }

      return false;
   }

   private boolean class_(xc_3 var1) {
      return var1 == xu_3.try_.continue_() || var1 == xu_3.instanceof_.continue_();
   }

   @Override
   protected void class_(rcd_3 var1) {
   }
}
