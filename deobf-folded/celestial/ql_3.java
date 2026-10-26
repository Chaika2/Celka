package celestial;

public class ql_3 extends qd_3<cG_2, wh_3<cG_2>> {
   public ql_3(pg_3 var1) {
      this(var1, false);
   }

   public ql_3(pg_3 var1, boolean var2) {
      super(var1, new wh_3<>(0.0F, var2), 0.5F);
      this.id_class(new Tc_1<>(this, new tW_2(0.5F), new tW_2(1.0F)));
      this.id_class(new TT<>(this));
      this.id_class(new TL(this));
      this.id_class(new rruM(this));
      this.id_class(new Tp_1<>(this));
      this.id_class(new TC<>(this));
      this.id_class(new TY<>(this));
      this.id_class(new tr_3<>(this));
      this.id_class(new TN<>(this));
   }

   protected void id_class(cG_2 var1, Ml_1 var2, float var3, float var4, float var5) {
      float var6 = var1.id_synchronized(var5);
      float var7 = (Float)var1.id_throws[16];
      if (var1.Sy()) {
         super.id_class(var1, var2, var3, var4, var5);
         float var8 = (float)var1.BD() + var5;
         float var9 = rfU_2.id_class(var8 * var8 / 100.0F, 0.0F, 1.0F);
         if (!var1.Sz()) {
            var2.id_class(rje_3.id_break.id_byte(var9 * (-90.0F - var7)));
         }

         rjU_2 var10 = var1.id_break(var5);
         rjU_2 var11 = var1.rv();
         double var12 = an_3.id_case(var11);
         double var14 = an_3.id_case(var10);
         if (var12 > 0.0 && var14 > 0.0) {
            double var16 = (var11.id_break * var10.id_break + var11.id_protected * var10.id_protected) / Math.sqrt(var12 * var14);
            double var18 = var11.id_break * var10.id_protected - var11.id_protected * var10.id_break;
            var2.id_class(rje_3.id_protected.id_break((float)(Math.signum(var18) * Math.acos(var16))));
         }
      } else if (var6 > 0.0F) {
         super.id_class(var1, var2, var3, var4, var5);
         float var20 = var1.rT() ? -90.0F - var7 : -90.0F;
         float var21 = rfU_2.id_catch(var6, 0.0F, var20);
         var2.id_class(rje_3.id_break.id_byte(var21));
         if (var1.rP()) {
            var2.id_class(0.0, -1.0, 0.3F);
         }
      } else {
         super.id_class(var1, var2, var3, var4, var5);
      }
   }

   private void id_class(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4, Iq_1 var5, Iq_1 var6) {
      wh_3 var7 = this.id_class();
      this.id_break(var4);
      var7.id_final = 0.0F;
      var7.id_finally = false;
      var7.id_extends = 0.0F;
      var7.id_class(var4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      var5.id_case = 0.0F;
      if (var4.Pp()) {
         var5.id_class(var1, var2.getBuffer(HU.id_private(var4.id_final())), var3, fZ_2.id_class, 0.5F);
      } else {
         var5.id_class(var1, var2.getBuffer(HU.id_break(var4.id_final())), var3, fZ_2.id_class);
      }

      var6.id_case = 0.0F;
      var6.id_class(var1, var2.getBuffer(HU.id_private(var4.id_final())), var3, fZ_2.id_class);
   }

   public rqO_2 id_class(cG_2 var1) {
      return var1.id_final();
   }

   private static tQ_2 id_class(cG_2 var0, rpm_3 var1) {
      rdn_3 var2 = var0.id_protected(var1);
      if (var2.id_class()) {
         return tQ_2.EMPTY;
      } else {
         if (var0.P() == var1 && var0.SH() > 0) {
            rkc_3 var3 = var2.id_native();
            if (var3 == rkc_3.BLOCK) {
               return tQ_2.BLOCK;
            }

            if (var3 == rkc_3.BOW) {
               return tQ_2.BOW_AND_ARROW;
            }

            if (var3 == rkc_3.SPEAR) {
               return tQ_2.THROW_SPEAR;
            }

            if (var3 == rkc_3.CROSSBOW && var1 == var0.P()) {
               return tQ_2.CROSSBOW_CHARGE;
            }
         } else if (!(Boolean)var0.id_private[5] && var2.id_break() == rdy_3.kU && rxm_3.id_protected(var2)) {
            return tQ_2.CROSSBOW_HOLD;
         }

         return tQ_2.ITEM;
      }
   }

   public rjU_2 id_class(cG_2 var1, float var2) {
      return var1.x() ? new rjU_2(0.0, -0.125, 0.0) : super.id_class(var1, var2);
   }

   public void id_class(cG_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      this.id_break(var1);
      super.id_class((cG_2)var1, var2, var3, var4, var5, var6);
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4) {
      this.id_class(var1, var2, var3, var4, this.id_throws.id_protected, this.id_throws.id_continue);
   }

   protected void id_class(cG_2 var1, rgP_2 var2, Ml_1 var3, Hx_1 var4, int var5) {
      double var6 = this.id_break.id_break(var1);
      var3.id_class();
      if (var6 < 100.0) {
         rns_3 var8 = var1.st();
         rnP_2 var9 = var8.id_class(2);
         if (var9 != null) {
            rAa_1 var10 = var8.id_break(var1.i(), var9);
            super.id_class(var1, new rgN_2(Integer.toString(var10.id_break())).id_break(" ").id_class(var9.id_protected()), var3, var4, var5);
            var3.id_class(0.0, 0.25875F, 0.0);
         }
      }

      super.id_class(var1, var2, var3, var4, var5);
      var3.id_break();
   }

   protected void id_class(cG_2 var1, Ml_1 var2, float var3) {
      float var4 = 0.9375F;
      var2.id_class(0.9375F, 0.9375F, 0.9375F);
   }

   private void id_break(cG_2 var1) {
      wh_3 var2 = this.id_class();
      if (var1.id_native()) {
         var2.b_(false);
         var2.id_class.id_finally = true;
         var2.id_break.id_finally = true;
      } else {
         var2.b_(true);
         var2.id_break.id_finally = var1.id_class(rhQ_2.HAT);
         var2.id_else.id_finally = var1.id_class(rhQ_2.JACKET);
         var2.id_super.id_finally = var1.id_class(rhQ_2.LEFT_PANTS_LEG);
         var2.id_this.id_finally = var1.id_class(rhQ_2.RIGHT_PANTS_LEG);
         var2.id_new.id_finally = var1.id_class(rhQ_2.LEFT_SLEEVE);
         var2.id_continue.id_finally = var1.id_class(rhQ_2.RIGHT_SLEEVE);
         var2.id_finally = var1.x();
         tQ_2 var3 = id_class(var1, rpm_3.MAIN_HAND);
         tQ_2 var4 = id_class(var1, rpm_3.OFF_HAND);
         if (var3.id_class()) {
            var4 = var1.Sn().id_class() ? tQ_2.EMPTY : tQ_2.ITEM;
         }

         if (var1.Su() == rpZ_2.RIGHT) {
            var2.id_implements = var3;
            var2.id_private = var4;
         } else {
            var2.id_implements = var4;
            var2.id_private = var3;
         }
      }
   }

   public void id_break(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4) {
      this.id_class(var1, var2, var3, var4, this.id_throws.id_throws, this.id_throws.id_new);
   }
}
