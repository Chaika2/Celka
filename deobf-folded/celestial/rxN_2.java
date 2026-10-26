package celestial;

public class rxN_2 extends rdb_3 {
   private final rXs_1 id_class;

   public rxN_2(rXs_1 var1, rdO_2 var2) {
      super(var2);
      this.id_class = var1;
   }

   public void id_class(rYB var1, rdn_3 var2, rfH_2 var3) {
   }

   public boolean id_class(rhd_3 var1, rYB var2, rfH_2 var3, rff_3 var4) {
      if (!(this.id_class instanceof rXB)) {
         return false;
      } else {
         xc_3 var5 = var2.id_byte(var3);
         xd_3 var6 = var5.id_break();
         QP var7 = var5.id_byte();
         boolean var8 = var5.id_class(this.id_class);
         boolean var9 = var5.id_catch() || var8 || var6 instanceof kJ_2 && ((kJ_2)var6).id_class(var2, var3, var5, this.id_class);
         if (!var9) {
            return var4 != null && this.id_class(var1, var2, var4.id_class().id_break(var4.id_break()), (rff_3)null);
         } else if (var2.id_default().id_protected() && this.id_class.id_class(rlG_2.id_break)) {
            int var10 = var3.b_();
            int var11 = var3.c_();
            int var12 = var3.d_();
            var2.id_class(var1, var3, rqn_3.Sk, rqL_2.BLOCKS, 0.5F, 2.6F + (var2.id_int.nextFloat() - var2.id_int.nextFloat()) * 0.8F);

            for (int var13 = 0; var13 < 8; var13++) {
               var2.id_class(rLQ.id_short, (double)var10 + Math.random(), (double)var11 + Math.random(), (double)var12 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else if (var6 instanceof kJ_2 && this.id_class == rXG.id_byte) {
            ((kJ_2)var6).id_class(var2, var3, var5, ((rXB)this.id_class).id_class(false));
            this.id_class(var1, var2, var3);
            return true;
         } else {
            if (!var2.id_continue && var8 && !var7.id_class()) {
               var2.id_break(var3, true);
            }

            if (!var2.id_class(var3, this.id_class.id_private().id_catch(), 11) && !var5.id_volatile().id_break()) {
               return false;
            } else {
               this.id_class(var1, var2, var3);
               return true;
            }
         }
      }
   }

   protected void id_class(rhd_3 var1, rRg_1 var2, rfH_2 var3) {
      rqA_2 var4 = this.id_class.id_class(rlG_2.id_byte) ? rqn_3.rz : rqn_3.rk;
      var2.id_class(var1, var3, var4, rqL_2.BLOCKS, 1.0F, 1.0F);
   }

   protected rdn_3 id_class(rdn_3 var1, rhd_3 var2) {
      return !((rhx_3)var2.id_implements[18]).id_protected ? new rdn_3(rdy_3.hg) : var1;
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      rff_3 var5 = id_class(var1, var2, this.id_class == rXG.id_class ? rjs_3.SOURCE_ONLY : rjs_3.NONE);
      if (var5.id_byte() == rjM_2.MISS) {
         return rym_3.id_byte(var4);
      } else if (var5.id_byte() != rjM_2.BLOCK) {
         return rym_3.id_byte(var4);
      } else {
         rff_3 var6 = var5;
         rfH_2 var7 = var6.id_class();
         rpr_3 var8 = var6.id_break();
         rfH_2 var9 = var7.id_break(var8);
         if (!var1.id_class(var2, var7) || !var2.id_class(var9, var8, var4)) {
            return rym_3.id_protected(var4);
         } else if (this.id_class == rXG.id_class) {
            xc_3 var13 = var1.id_byte(var7);
            if (var13.id_break() instanceof kh_3) {
               rXs_1 var14 = ((kh_3)var13.id_break()).id_break(var1, var7, var13);
               if (var14 != rXG.id_class) {
                  var2.id_class(rlB_2.id_byte.id_break(this));
                  var2.id_class(var14.id_class(rlG_2.id_byte) ? rqn_3.rc : rqn_3.rQ, 1.0F, 1.0F);
                  rdn_3 var12 = rpO_2.id_class(var4, var2, new rdn_3(var14.id_class()));
                  if (!var1.id_continue) {
                     Oo_1.id_finally.id_class((rhN_2)var2, new rdn_3(var14.id_class()));
                  }

                  return rym_3.id_class(var12, var1.id_import());
               }
            }

            return rym_3.id_protected(var4);
         } else {
            xc_3 var10 = var1.id_byte(var7);
            rfH_2 var11 = var10.id_break() instanceof kJ_2 && this.id_class == rXG.id_byte ? var7 : var9;
            if (this.id_class(var2, var1, var11, var6)) {
               this.id_class(var1, var4, var11);
               if (var2 instanceof rhN_2) {
                  Oo_1.id_goto.id_class((rhN_2)var2, var11, var4);
               }

               var2.id_class(rlB_2.id_byte.id_break(this));
               return rym_3.id_class(this.id_class(var4, var2), var1.id_import());
            } else {
               return rym_3.id_protected(var4);
            }
         }
      }
   }
}
