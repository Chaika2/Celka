package celestial;

import java.util.Random;

public class rMA extends rbZ_2 {
   private static final rkg_3 id_super = rkg_3.id_class(rdy_3.Xz, rdy_3.XQ);
   private static final rut_3<Boolean> id_this = rmE_2.id_class(rMA.class, ruw_3.id_implements);
   private rMn_1<rhd_3> id_else;
   private rMC id_synchronized;

   @Override
   public int id_char() {
      return 900;
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Mw;
   }

   @Override
   public void id_double() {
      if (this.id_super().id_break()) {
         double var1 = this.id_super().id_byte();
         if (var1 == 0.6) {
            this.id_class(iM_2.CROUCHING);
            this.c_(false);
         } else if (var1 == 1.33) {
            this.id_class(iM_2.STANDING);
            this.c_(true);
         } else {
            this.id_class(iM_2.STANDING);
            this.c_(false);
         }
      } else {
         this.id_class(iM_2.STANDING);
         this.c_(false);
      }
   }

   public rMA(aI_2<? extends rMA> var1, rYB var2) {
      super(var1, var2);
      this.n();
   }

   private void id_this(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_this, var1);
      this.n();
   }

   protected void n() {
      if (this.id_else == null) {
         this.id_else = new rMn_1<>(this, rhd_3.class, 16.0F, 0.8, 1.33);
      }

      this.id_package.id_class(this.id_else);
      if (!this.sJ()) {
         this.id_package.id_class(4, this.id_else);
      }
   }

   @Override
   public boolean id_class(float var1, float var2) {
      return false;
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 41) {
         this.id_else(true);
      } else if (var1 == 40) {
         this.id_else(false);
      } else {
         super.id_class(var1);
      }
   }

   @Override
   public boolean id_class(rRR var1) {
      if (var1.id_protected(this) && !var1.id_protected(this.rN())) {
         rfH_2 var2 = this.Bs();
         if (var2.c_() < var1.id_short()) {
            return false;
         }

         xc_3 var3 = var1.id_byte(var2.id_break());
         if (var3.id_class(xu_3.id_implements) || var3.id_class(rls_3.id_void)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Trusting", this.sJ());
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var4 == null) {
         var4 = new am_3(1.0F);
      }

      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if ((this.id_synchronized == null || this.id_synchronized.id_private()) && !this.sJ() && this.id_extends(var3) && var1.id_int(this) < 9.0) {
         this.id_class(var1, var3);
         if (!((rYB)this.id_throws[7]).id_continue) {
            if (((Random)this.id_throws[40]).nextInt(3) == 0) {
               this.id_this(true);
               this.id_else(true);
               ((rYB)this.id_throws[7]).id_class(this, (byte)41);
            } else {
               this.id_else(false);
               ((rYB)this.id_throws[7]).id_class(this, (byte)40);
            }
         }

         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         return super.id_break(var1, var2);
      }
   }

   public rMA id_break(rrEm_1 var1, au_3 var2) {
      return aI_2.M.id_class(var1);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_this(var1.id_new("Trusting"));
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      return this.id_class(var1) ? false : super.id_break(var1, var2);
   }

   public static boolean id_break(aI_2<rMA> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var4.nextInt(3) != 0;
   }

   public static iz_3 L() {
      return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_protected, 0.3F).id_class(iQ_2.id_case, 3.0);
   }

   private float sx() {
      return (float)this.id_class(iQ_2.id_case);
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return id_super.id_class(var1);
   }

   private void id_else(boolean var1) {
      rLO var2 = rLQ.id_long;
      if (!var1) {
         var2 = rLQ.id_double;
      }

      for (int var3 = 0; var3 < 7; var3++) {
         double var4 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         double var6 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         double var8 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         ((rYB)this.id_throws[7]).id_class(var2, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), var4, var6, var8);
      }
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.MI;
   }

   @Override
   public boolean id_public(an_3 var1) {
      return var1.id_break(rye_3.id_byte(this), this.sx());
   }

   @Override
   public boolean id_private(double var1) {
      return !this.sJ() && (Integer)this.id_throws[41] > 2400;
   }

   @Override
   protected void id_final() {
      this.id_synchronized = new rMC(this, 0.6, id_super, true);
      this.id_package.id_class(1, new rSb_1(this));
      this.id_package.id_class(3, this.id_synchronized);
      this.id_package.id_class(7, new rBv_1(this, 0.3F));
      this.id_package.id_class(8, new rBj_1(this));
      this.id_package.id_class(9, new rBP(this, 0.8));
      this.id_package.id_class(10, new rSk_1(this, 0.8, 1.0000001E-5F));
      this.id_package.id_class(11, new rBA(this, rhd_3.class, 10.0F));
      this.id_int.id_class(1, new rBI<>(this, rbR_2.class, false));
      this.id_int.id_class(1, new rBI<>(this, rON.class, 10, false, false, rON.id_super));
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.5F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Mf;
   }

   boolean sJ() {
      return ((rmE_2)this.id_throws[49]).id_class(id_this);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_this, false);
   }
}
