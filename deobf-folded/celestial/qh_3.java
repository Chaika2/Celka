package celestial;

public class qh_3 extends pV_2<rsG_2> {
   private static final II id_class = new II("item_frame", "map=false");
   private static final II id_throws = new II("item_frame", "map=true");
   private final QY id_case = QY.id_instanceof();
   private final Hz_1 id_catch;
   private static double id_private = 4096.0;

   private boolean id_byte(rsG_2 var1) {
      if (rrdZ.id_new) {
         return false;
      } else {
         if (!rrbb_3.id_package) {
            an_3 var2 = this.id_case.id_catch();
            double var3 = var1.id_class(var2.rx(), var2.re(), var2.BO());
            if (var3 > id_private) {
               return false;
            }
         }

         return true;
      }
   }

   public qh_3(pg_3 var1, Hz_1 var2) {
      super(var1);
      this.id_catch = var2;
   }

   public void id_class(rsG_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      super.id_class(var1, var2, var3, var4, var5, var6);
      var4.id_class();
      rpr_3 var7 = var1.Pg();
      rjU_2 var8 = this.id_class(var1, var3);
      var4.id_class(-var8.id_class(), -var8.id_break(), -var8.id_byte());
      double var9 = 0.46875;
      var4.id_class((double)var7.id_implements() * 0.46875, (double)var7.id_finally() * 0.46875, (double)var7.id_extends() * 0.46875);
      var4.id_class(rje_3.id_break.id_byte((Float)var1.id_throws[16]));
      var4.id_class(rje_3.id_protected.id_byte(180.0F - (Float)var1.id_throws[15]));
      boolean var11 = var1.Pp();
      if (!var11) {
         lo_3 var12 = this.id_case.id_synchronized();
         Ip_1 var13 = var12.id_break().id_class();
         II var14 = var1.id_final().id_break() instanceof rxI_2 ? id_throws : id_class;
         var4.id_class();
         var4.id_class(-0.5, -0.5, -0.5);
         var12.id_byte().id_class(var4.id_byte(), var5.getBuffer(lp_3.id_catch()), (xc_3)null, var13.id_class(var14), 1.0F, 1.0F, 1.0F, var6, fZ_2.id_class);
         var4.id_break();
      }

      rdn_3 var16 = var1.id_final();
      if (!var16.id_class()) {
         boolean var17 = var16.id_break() instanceof rxI_2;
         if (var11) {
            var4.id_class(0.0, 0.0, 0.5);
         } else {
            var4.id_class(0.0, 0.0, 0.4375);
         }

         int var18 = var17 ? var1.id_package() % 4 * 2 : var1.id_package();
         var4.id_class(rje_3.id_case.id_byte((float)var18 * 360.0F / 8.0F));
         if (var17) {
            var4.id_class(rje_3.id_case.id_byte(180.0F));
            var4.id_class(0.0078125F, 0.0078125F, 0.0078125F);
            var4.id_class(-64.0, -64.0, 0.0);
            rrGb_1 var15 = rxI_2.id_break(var16, (rYB)var1.id_throws[7]);
            var4.id_class(0.0, 0.0, -1.0);
            if (var15 != null) {
               ((Hh_1)this.id_case.id_class[16]).id_catch().id_class(var4, var5, var15, true, var6);
            }
         } else {
            var4.id_class(0.5F, 0.5F, 0.5F);
            if (this.id_byte(var1)) {
               this.id_catch.id_class(var16, IQ.FIXED, var6, fZ_2.id_class, var4, var5);
            }
         }
      }

      var4.id_break();
   }

   public rqO_2 id_class(rsG_2 var1) {
      return fJ_2.id_class;
   }

   protected void id_class(rsG_2 var1, rgP_2 var2, Ml_1 var3, Hx_1 var4, int var5) {
      super.id_class(var1, var1.id_final().id_continue(), var3, var4, var5);
   }

   public rjU_2 id_class(rsG_2 var1, float var2) {
      return new rjU_2((double)((float)var1.Pg().id_implements() * 0.3F), -0.25, (double)((float)var1.Pg().id_extends() * 0.3F));
   }

   protected boolean id_break(rsG_2 var1) {
      if (QY.id_public() && !var1.id_final().id_class() && var1.id_final().id_this() && this.id_break.id_byte == var1) {
         double var2 = this.id_break.id_break(var1);
         float var4 = var1.Pw() ? 32.0F : 64.0F;
         return var2 < (double)(var4 * var4);
      } else {
         return false;
      }
   }

   public static void id_throws() {
      QY var0 = QY.id_instanceof();
      double var1 = rrbb_3.id_class(((Qw_1)var0.id_class[20]).U, 1.0, 120.0);
      double var3 = Math.max(6.0 * (double)var0.id_else().id_continue() / var1, 16.0);
      id_private = var3 * var3;
   }
}
