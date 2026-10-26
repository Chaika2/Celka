package celestial;

import java.util.Random;

public class rEy_1 extends aV_2 implements rEK {
   private static final rut_3<Boolean> class_ = rmE_2.class_(rEy_1.class, ruw_3.implements_);
   private int break_ = 1;

   @Override
   protected boolean boolean_() {
      return true;
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.Si;
   }

   public rEy_1(aI_2<? extends rEy_1> var1, rYB var2) {
      super(var1, var2);
      this.finally_ = 5;
      this.native_ = new rET(this);
   }

   public void this_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(class_, var1);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("ExplosionPower", this.break_);
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 2.6F;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("ExplosionPower", 99)) {
         this.break_ = var1.private_("ExplosionPower");
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else if (var1.finally_() instanceof rhH_2 && var1.extends_() instanceof rhd_3) {
         super.break_(var1, 1000.0F);
         return true;
      } else {
         return super.break_(var1, var2);
      }
   }

   public static boolean break_(aI_2<rEy_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.abstract_() != rRO.PEACEFUL && var4.nextInt(20) == 0 && class_(var0, var1, var2, var3, var4);
   }

   public boolean throws_() {
      return ((rmE_2)this.throws_[49]).class_(class_);
   }

   public int catch_() {
      return this.break_;
   }

   public static iz_3 implements_() {
      return is_3.package_().class_(iQ_2.class_, 10.0).class_(iQ_2.break_, 100.0);
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.Se;
   }

   @Override
   protected void final_() {
      this.package_.class_(5, new rEt_1(this));
      this.package_.class_(7, new rEq_1(this));
      this.package_.class_(7, new rEp_1(this));
      this.int_.class_(1, new rBI<>(this, rhd_3.class, 10, true, false, var1 -> Math.abs(var1.re() - this.re()) <= 4.0));
   }

   @Override
   public int E() {
      return 1;
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.HOSTILE;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Sa;
   }

   @Override
   protected float Si() {
      return 5.0F;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, false);
   }
}
