package celestial;

import java.util.Random;

public abstract class rOp_1 extends rOl_1 {
   private static final rut_3<Boolean> id_class = rmE_2.id_class(rOp_1.class, ruw_3.id_implements);

   public rOp_1(aI_2<? extends rOp_1> var1, rYB var2) {
      super(var1, var2);
      this.id_native = new rOq_1(this);
   }

   public void id_this(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1);
   }

   @Override
   protected boolean n() {
      return true;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("FromBucket", this.sx());
   }

   @Override
   public void id_default() {
      if (!this.rT() && (Boolean)this.id_throws[20] && (Boolean)this.id_throws[24]) {
         this.id_byte(
            this.rv()
               .id_break(
                  (double)((((Random)this.id_throws[40]).nextFloat() * 2.0F - 1.0F) * 0.05F),
                  0.4F,
                  (double)((((Random)this.id_throws[40]).nextFloat() * 2.0F - 1.0F) * 0.05F)
               )
         );
         Boolean var5 = false;
         this.id_throws[20] = var5;
         Boolean var6 = true;
         this.id_throws[57] = var6;
         this.id_class(this.sJ(), this.Si(), this.SN());
      }

      super.id_default();
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return var2.id_break * 0.65F;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_this(var1.id_new("FromBucket"));
   }

   public static boolean id_break(aI_2<? extends rOp_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.id_byte(var3).id_class(xu_3.id_try) && var1.id_byte(var3.id_final()).id_class(xu_3.id_try);
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
   }

   @Override
   protected rLy_1 id_break(rYB var1) {
      return new rLw_1(this, var1);
   }

   @Override
   protected ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (var3.id_break() == rdy_3.hR && this.BM()) {
         this.id_class(rqn_3.rN, 1.0F, 1.0F);
         var3.id_catch(1);
         rdn_3 var4 = this.L();
         this.id_extends(var4);
         if (!((rYB)this.id_throws[7]).id_continue) {
            Oo_1.id_finally.id_class((rhN_2)var1, var4);
         }

         if (var3.id_class()) {
            var1.id_class(var2, var4);
         } else if (!((rhz_3)var1.id_implements[1]).id_throws(var4)) {
            var1.id_class(var4, false);
         }

         this.PD();
         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         return super.id_break(var1, var2);
      }
   }

   public static iz_3 id_throws() {
      return is_3.id_package().id_class(iQ_2.id_class, 3.0);
   }

   protected abstract rdn_3 L();

   private boolean sx() {
      return ((rmE_2)this.id_throws[49]).id_class(id_class);
   }

   protected void id_extends(rdn_3 var1) {
      if (this.Bk()) {
         var1.id_class(this.rD());
      }
   }

   @Override
   public void id_private(rjU_2 var1) {
      if (this.id_try() && this.rT()) {
         this.id_class(0.01F, var1);
         this.id_class(iG_2.SELF, this.rv());
         this.id_byte(this.rv().id_class(0.9));
         if (this.I_() == null) {
            this.id_byte(this.rv().id_break(0.0, -0.005, 0.0));
         }
      } else {
         super.id_private(var1);
      }
   }

   @Override
   public boolean id_private(double var1) {
      return !this.sx() && !this.Bk();
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(0, new rBY(this, 1.25));
      this.id_package.id_class(2, new rPD<>(this, rhd_3.class, 8.0F, 1.6, 1.4, rpJ_2.id_catch::test));
      this.id_package.id_class(4, new rOT(this));
   }

   @Override
   public boolean id_strictfp() {
      return super.id_strictfp() || this.sx();
   }

   @Override
   public int E() {
      return 8;
   }

   @Override
   protected rqA_2 BB() {
      return rqn_3.SW;
   }

   protected abstract rqA_2 sJ();

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, false);
   }
}
