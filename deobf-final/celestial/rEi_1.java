package celestial;

import java.util.Random;
import java.util.function.Predicate;

public abstract class rEi_1 extends aA_2 implements rEK {
   @Override
   protected boolean boolean_() {
      return true;
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.EX;
   }

   @Override
   protected rqA_2 byte_(int var1) {
      return var1 > 4 ? rqn_3.EO : rqn_3.EJ;
   }

   public static boolean byte_(aI_2<? extends rEi_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.abstract_() != rRO.PEACEFUL && class_(var0, var1, var2, var3, var4);
   }

   protected rEi_1(aI_2<? extends rEi_1> var1, rYB var2) {
      super(var1, var2);
      this.finally_ = 5;
      this.private_(2);
   }

   public static boolean class_(rRf_1 var0, rfH_2 var1, Random var2) {
      if (var0.class_(rRo_1.SKY, var1) > var2.nextInt(32)) {
         return false;
      } else {
         int var3 = var0.byte_().S() ? var0.break_(var1, 10) : var0.package_(var1);
         return var3 <= var2.nextInt(8);
      }
   }

   @Override
   public float class_(rfH_2 var1, rRR var2) {
      return 0.5F - var2.native_(var1);
   }

   public static iz_3 sm() {
      return is_3.package_().class_(iQ_2.case_);
   }

   @Override
   public void default_() {
      this.Sg();
      this.K_();
      super.default_();
   }

   public static boolean break_(aI_2<? extends rEi_1> var0, rRf_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.abstract_() != rRO.PEACEFUL && class_(var1, var3, var4) && class_(var0, var1, var2, var3, var4);
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      return this.class_(var1) ? false : super.break_(var1, var2);
   }

   public boolean throws_(rhd_3 var1) {
      return true;
   }

   @Override
   public rdn_3 case_(rdn_3 var1) {
      if (var1.break_() instanceof rkB_2) {
         Predicate var2 = ((rkB_2)var1.break_()).private_();
         rdn_3 var3 = rkB_2.class_(this, var2);
         return var3.class_() ? new rdn_3(rdy_3.OO) : var3;
      } else {
         return rdn_3.break_;
      }
   }

   protected void K_() {
      float var1 = this.rX();
      if (var1 > 0.5F) {
         Integer var6 = (Integer)this.private_[33] + 2;
         this.private_[33] = var6;
      }
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.HOSTILE;
   }

   @Override
   protected rqA_2 BB() {
      return rqn_3.Ed;
   }

   @Override
   protected rqA_2 BJ() {
      return rqn_3.Ex;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Eh;
   }

   @Override
   protected boolean Sp() {
      return true;
   }

   @Override
   protected boolean SX() {
      return true;
   }
}
