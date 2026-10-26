package celestial;

import java.util.Random;

public class rbR_2 extends rbZ_2 {
   private static final rkg_3 id_while = rkg_3.id_class(rdy_3.hP, rdy_3.JW, rdy_3.Jk, rdy_3.kJ);
   public float id_super;
   public float id_this;
   public float id_else;
   public float id_synchronized;
   public float id_return = 1.0F;
   public int id_public = ((Random)this.id_throws[40]).nextInt(6000) + 6000;
   public boolean id_goto;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.rg;
   }

   @Override
   protected int id_byte(rhd_3 var1) {
      return this.n() ? 10 : super.id_byte(var1);
   }

   public rbR_2(aI_2<? extends rbR_2> var1, rYB var2) {
      super(var1, var2);
      this.id_class(rLp_1.WATER, 0.0F);
   }

   public void id_this(boolean var1) {
      this.id_goto = var1;
   }

   @Override
   public boolean n() {
      return this.id_goto;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("IsChickenJockey", this.id_goto);
      var1.id_break("EggLayTime", this.id_public);
   }

   @Override
   public boolean id_class(float var1, float var2) {
      return false;
   }

   @Override
   public void id_default() {
      super.id_default();
      this.id_synchronized = this.id_super;
      this.id_else = this.id_this;
      this.id_this = (float)((double)this.id_this + (double)(this.id_throws[20] ? -1 : 4) * 0.3);
      this.id_this = rfU_2.id_class(this.id_this, 0.0F, 1.0F);
      if (!(Boolean)this.id_throws[20] && this.id_return < 1.0F) {
         this.id_return = 1.0F;
      }

      this.id_return = (float)((double)this.id_return * 0.9);
      rjU_2 var1 = this.rv();
      if (!(Boolean)this.id_throws[20] && var1.id_byte < 0.0) {
         this.id_byte(var1.id_throws(1.0, 0.6, 1.0));
      }

      this.id_super = this.id_super + this.id_return * 2.0F;
      if (!((rYB)this.id_throws[7]).id_continue && this.BM() && !this.n_() && !this.n() && --this.id_public <= 0) {
         this.id_class(rqn_3.rV, 1.0F, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F);
         this.id_class(rdy_3.XJ);
         this.id_public = ((Random)this.id_throws[40]).nextInt(6000) + 6000;
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_goto = var1.id_new("IsChickenJockey");
      if (var1.id_throws("EggLayTime")) {
         this.id_public = var1.id_private("EggLayTime");
      }
   }

   public rbR_2 id_break(rrEm_1 var1, au_3 var2) {
      return aI_2.id_finally.id_class(var1);
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.rR, 0.15F, 1.0F);
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return this.n_() ? var2.id_break * 0.85F : var2.id_break * 0.92F;
   }

   public static iz_3 L() {
      return is_3.id_package().id_class(iQ_2.id_class, 4.0).id_class(iQ_2.id_protected, 0.25);
   }

   @Override
   public void id_catch(an_3 var1) {
      super.id_catch(var1);
      float var2 = rfU_2.id_class((Float)this.id_private[23] * (float) (Math.PI / 180.0));
      float var3 = rfU_2.id_break((Float)this.id_private[23] * (float) (Math.PI / 180.0));
      float var4 = 0.1F;
      float var5 = 0.0F;
      var1.id_new(this.rx() + (double)(0.1F * var2), this.id_byte(0.5) + var1.Pv() + 0.0, this.BO() - (double)(0.1F * var3));
      if (var1 instanceof iB_2 var10000) {
         Float var10 = (Float)this.id_private[23];
         var10000.id_private[23] = var10;
      }
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return id_while.id_class(var1);
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.rf;
   }

   @Override
   public boolean id_private(double var1) {
      return this.n();
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(1, new rBY(this, 1.4));
      this.id_package.id_class(2, new rBP(this, 1.0));
      this.id_package.id_class(3, new rSO(this, 1.0, false, id_while));
      this.id_package.id_class(4, new rBx_1(this, 1.1));
      this.id_package.id_class(5, new rSk_1(this, 1.0));
      this.id_package.id_class(6, new rBA(this, rhd_3.class, 6.0F));
      this.id_package.id_class(7, new rBC(this));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.rj;
   }
}
