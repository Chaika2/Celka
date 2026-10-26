package celestial;

import java.util.Random;
import java.util.function.Predicate;

public abstract class rEi_1 extends aA_2 implements rEK {
   @Override
   protected boolean id_boolean() {
      return true;
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.EX;
   }

   @Override
   protected rqA_2 id_byte(int var1) {
      return var1 > 4 ? rqn_3.EO : rqn_3.EJ;
   }

   public static boolean id_byte(aI_2<? extends rEi_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.id_abstract() != rRO.PEACEFUL && id_class(var0, var1, var2, var3, var4);
   }

   protected rEi_1(aI_2<? extends rEi_1> var1, rYB var2) {
      super(var1, var2);
      this.id_finally = 5;
      this.id_private(2);
   }

   public static boolean id_class(rRf_1 var0, rfH_2 var1, Random var2) {
      if (var0.id_class(rRo_1.SKY, var1) > var2.nextInt(32)) {
         return false;
      } else {
         int var3 = var0.id_byte().S() ? var0.id_break(var1, 10) : var0.id_package(var1);
         return var3 <= var2.nextInt(8);
      }
   }

   @Override
   public float id_class(rfH_2 var1, rRR var2) {
      return 0.5F - var2.id_native(var1);
   }

   public static iz_3 sm() {
      return is_3.id_package().id_class(iQ_2.id_case);
   }

   @Override
   public void id_default() {
      this.Sg();
      this.K_();
      super.id_default();
   }

   public static boolean id_break(aI_2<? extends rEi_1> var0, rRf_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.id_abstract() != rRO.PEACEFUL && id_class(var1, var3, var4) && id_class(var0, var1, var2, var3, var4);
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      return this.id_class(var1) ? false : super.id_break(var1, var2);
   }

   public boolean id_throws(rhd_3 var1) {
      return true;
   }

   @Override
   public rdn_3 id_case(rdn_3 var1) {
      if (var1.id_break() instanceof rkB_2) {
         Predicate var2 = ((rkB_2)var1.id_break()).id_private();
         rdn_3 var3 = rkB_2.id_class(this, var2);
         return var3.id_class() ? new rdn_3(rdy_3.OO) : var3;
      } else {
         return rdn_3.id_break;
      }
   }

   protected void K_() {
      float var1 = this.rX();
      if (var1 > 0.5F) {
         Integer var6 = (Integer)this.id_private[33] + 2;
         this.id_private[33] = var6;
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
