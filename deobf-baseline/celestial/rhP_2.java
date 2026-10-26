package celestial;

import java.util.Random;

public class rhP_2 extends rOK implements aa_3 {
   private static final rkg_3 id_try = rkg_3.id_class(rdy_3.hB, xu_3.Ey.id_case());
   private static final rut_3<Integer> id_instanceof = rmE_2.id_class(rhP_2.class, ruw_3.id_break);
   private static final rut_3<Integer> id_throw = rmE_2.id_class(rhP_2.class, ruw_3.id_break);
   private static final rut_3<Integer> id_interface = rmE_2.id_class(rhP_2.class, ruw_3.id_break);
   boolean id_char;
   private rhP_2 id_abstract;
   private rhP_2 id_long;

   @Override
   protected boolean id_byte(rhd_3 var1, rdn_3 var2) {
      byte var3 = 0;
      byte var4 = 0;
      float var5 = 0.0F;
      boolean var6 = false;
      rdb_3 var7 = var2.id_break();
      if (var7 == rdy_3.hB) {
         var3 = 10;
         var4 = 3;
         var5 = 2.0F;
      } else if (var7 == xu_3.Ey.id_case()) {
         var3 = 90;
         var4 = 6;
         var5 = 10.0F;
         if (this.sm() && this.O_() == 0 && this.sk()) {
            var6 = true;
            this.id_throws(var1);
         }
      }

      if (this.Ss() < this.SK() && var5 > 0.0F) {
         this.id_protected(var5);
         var6 = true;
      }

      if (this.n_() && var3 > 0) {
         ((rYB)this.id_throws[7]).id_class(rLQ.id_char, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), 0.0, 0.0, 0.0);
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.d_(var3);
         }

         var6 = true;
      }

      if (var4 > 0 && (var6 || !this.sm()) && this.sn() < this.sT()) {
         var6 = true;
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_return(var4);
         }
      }

      if (var6 && !this.BF()) {
         rqA_2 var8 = this.sy();
         if (var8 != null) {
            ((rYB)this.id_throws[7])
               .id_class(
                  (rhd_3)null,
                  this.rx(),
                  this.re(),
                  this.BO(),
                  this.sy(),
                  this.Pr(),
                  1.0F,
                  1.0F + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F
               );
         }
      }

      return var6;
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.GW;
   }

   public rhP_2(aI_2<? extends rhP_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected rqA_2 sp() {
      return rqn_3.GJ;
   }

   @Override
   protected void sl() {
      if (!((rYB)this.id_throws[7]).id_continue) {
         super.sl();
         this.id_class(id_volatile(this.id_synchronized.id_extends(1)));
      }
   }

   public rxL_2 sa() {
      int var1 = ((rmE_2)this.id_throws[49]).id_class(id_throw);
      return var1 == -1 ? null : rxL_2.id_class(var1);
   }

   private void id_class(rxL_2 var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_throw, var1 == null ? -1 : var1.id_break());
   }

   @Override
   public boolean id_class(float var1, float var2) {
      int var3 = this.id_implements(var1, var2);
      if (var3 <= 0) {
         return false;
      } else {
         if (var1 >= 6.0F) {
            this.id_break(rye_3.id_extends, (float)var3);
            if (this.BP()) {
               for (an_3 var5 : this.PP()) {
                  var5.id_break(rye_3.id_extends, (float)var3);
               }
            }
         }

         this.sM();
         return true;
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.Es();
      int var6;
      if (var4 instanceof rhs_3) {
         var6 = ((rhs_3)var4).id_class;
      } else {
         var6 = ((Random)this.id_throws[40]).nextInt(4);
         var4 = new rhs_3(var6);
      }

      this.id_public(var6);
      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public boolean id_class(rbZ_2 var1) {
      return var1 != this && var1 instanceof rhP_2 && this.sj() && ((rhP_2)var1).sj();
   }

   public void id_class(rhP_2 var1) {
      this.id_abstract = var1;
      this.id_abstract.id_long = this;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Variant", this.se());
      var1.id_break("Strength", this.sD());
      if (!this.id_synchronized.id_extends(1).id_class()) {
         var1.id_class("DecorItem", this.id_synchronized.id_extends(1).id_break(new rcd_3()));
      }
   }

   @Override
   public void id_class(rXu_1 var1) {
      rxL_2 var2 = this.sa();
      super.id_class(var1);
      rxL_2 var3 = this.sa();
      if ((Integer)this.id_throws[41] > 20 && var3 != null && var3 != var2) {
         this.id_class(rqn_3.GN, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean id_class() {
      return false;
   }

   protected rhP_2 si() {
      return aI_2.id_transient.id_class((rYB)this.id_throws[7]);
   }

   @Override
   public int sc() {
      return this.sD();
   }

   public int se() {
      return rfU_2.id_class(((rmE_2)this.id_throws[49]).id_class(id_interface), 0, 3);
   }

   @Override
   protected void sd() {
      this.id_class(rqn_3.Gx, 1.0F, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F);
   }

   @Override
   public boolean sw() {
      return false;
   }

   public rhP_2 id_break(rrEm_1 var1, au_3 var2) {
      rhP_2 var3 = this.si();
      this.id_class(var2, var3);
      rhP_2 var4 = (rhP_2)var2;
      int var5 = ((Random)this.id_throws[40]).nextInt(Math.max(this.sD(), var4.sD())) + 1;
      if (((Random)this.id_throws[40]).nextFloat() < 0.03F) {
         var5++;
      }

      var3.id_goto(var5);
      var3.id_public(((Random)this.id_throws[40]).nextBoolean() ? this.se() : var4.se());
      return var3;
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.GQ, 0.15F, 1.0F);
   }

   @Override
   public void id_break(rcd_3 var1) {
      this.id_goto(var1.id_private("Strength"));
      super.id_break(var1);
      this.id_public(var1.id_private("Variant"));
      if (var1.id_byte("DecorItem", 10)) {
         this.id_synchronized.id_break(1, rdn_3.id_class(var1.id_int("DecorItem")));
      }

      this.sl();
   }

   @Override
   public void id_break(iB_2 var1, float var2) {
      this.id_private(var1);
   }

   @Override
   protected int sx() {
      return this.sJ() ? 2 + 3 * this.sc() : super.sx();
   }

   @Override
   public boolean so() {
      return !this.id_synchronized.id_extends(1).id_class();
   }

   @Override
   public void id_catch(an_3 var1) {
      if (this.id_synchronized(var1)) {
         float var2 = rfU_2.id_break((Float)this.id_private[23] * (float) (Math.PI / 180.0));
         float var3 = rfU_2.id_class((Float)this.id_private[23] * (float) (Math.PI / 180.0));
         var1.id_new(this.rx() + (double)(0.3F * var3), this.re() + this.PS() + var1.Pv(), this.BO() - (double)(0.3F * var2));
      }
   }

   @Override
   public boolean G() {
      return false;
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return id_try.id_class(var1);
   }

   private void id_goto(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_instanceof, Math.max(1, Math.min(5, var1)));
   }

   @Override
   protected double id_implements() {
      return 2.0;
   }

   void id_try(boolean var1) {
      this.id_char = var1;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.GX;
   }

   public void id_public(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_interface, var1);
   }

   private void id_private(iB_2 var1) {
      rhw_3 var2 = new rhw_3((rYB)this.id_throws[7], this);
      double var3 = var1.rx() - this.rx();
      double var5 = var1.id_byte(0.3333333333333333) - var2.re();
      double var7 = var1.BO() - this.BO();
      float var9 = rfU_2.id_class(var3 * var3 + var7 * var7) * 0.2F;
      var2.id_byte(var3, var5 + (double)var9, var7, 1.5F, 10.0F);
      if (!this.BF()) {
         ((rYB)this.id_throws[7])
            .id_class(
               (rhd_3)null,
               this.rx(),
               this.re(),
               this.BO(),
               rqn_3.Gz,
               this.Pr(),
               1.0F,
               1.0F + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F
            );
      }

      ((rYB)this.id_throws[7]).a_(var2);
      this.id_char = true;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(1, new rSs_1(this, 1.2));
      this.id_package.id_class(2, new rBF(this, 2.1F));
      this.id_package.id_class(3, new rBe_1(this, 1.25, 40, 20.0F));
      this.id_package.id_class(3, new rBY(this, 1.2));
      this.id_package.id_class(4, new rBP(this, 1.0));
      this.id_package.id_class(5, new rBx_1(this, 1.0));
      this.id_package.id_class(6, new rSk_1(this, 0.7));
      this.id_package.id_class(7, new rBA(this, rhd_3.class, 6.0F));
      this.id_package.id_class(8, new rBC(this));
      this.id_int.id_class(1, new rhS_2(this));
      this.id_int.id_class(2, new rhB_2(this));
   }

   private static rxL_2 id_volatile(rdn_3 var0) {
      xd_3 var1 = xd_3.id_class(var0.id_break());
      return var1 instanceof xC_2 ? ((xC_2)var1).id_break() : null;
   }

   @Override
   public boolean id_native(rdn_3 var1) {
      rdb_3 var2 = var1.id_break();
      return rlc_3.id_catch.id_class(var2);
   }

   @Override
   protected void st() {
      if (!this.EB() && this.n_()) {
         super.st();
      }
   }

   @Override
   public double PS() {
      return (double)this.Bm() * 0.67;
   }

   @Override
   protected boolean BK() {
      return this.Sl() || this.sF();
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, 0.75 * (double)this.Bx(), (double)this.PN() * 0.5);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Gd;
   }

   @Override
   protected rqA_2 sy() {
      return rqn_3.Gk;
   }

   @Override
   public int sT() {
      return 30;
   }

   @Override
   public void sI() {
      rqA_2 var1 = this.sp();
      if (var1 != null) {
         this.id_class(var1, this.Si(), this.SN());
      }
   }

   public int sD() {
      return ((rmE_2)this.id_throws[49]).id_class(id_instanceof);
   }

   public boolean EB() {
      return this.id_abstract != null;
   }

   private void Es() {
      int var1 = ((Random)this.id_throws[40]).nextFloat() < 0.04F ? 5 : 3;
      this.id_goto(1 + ((Random)this.id_throws[40]).nextInt(var1));
   }

   @Override
   public boolean sY() {
      return true;
   }

   public boolean EP() {
      return this.id_long != null;
   }

   public rhP_2 ES() {
      return this.id_abstract;
   }

   public boolean sK() {
      return false;
   }

   public void Er() {
      if (this.id_abstract != null) {
         this.id_abstract.id_long = null;
      }

      this.id_abstract = null;
   }

   public static iz_3 sU() {
      return n().id_class(iQ_2.id_break, 40.0);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_instanceof, 0);
      ((rmE_2)this.id_throws[49]).id_class(id_throw, -1);
      ((rmE_2)this.id_throws[49]).id_class(id_interface, 0);
   }
}
