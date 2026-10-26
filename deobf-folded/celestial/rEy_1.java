package celestial;

import java.util.Random;

public class rEy_1 extends aV_2 implements rEK {
   private static final rut_3<Boolean> id_class = rmE_2.id_class(rEy_1.class, ruw_3.id_implements);
   private int id_break = 1;

   @Override
   protected boolean id_boolean() {
      return true;
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Si;
   }

   public rEy_1(aI_2<? extends rEy_1> var1, rYB var2) {
      super(var1, var2);
      this.id_finally = 5;
      this.id_native = new rET(this);
   }

   public void id_this(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("ExplosionPower", this.id_break);
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 2.6F;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("ExplosionPower", 99)) {
         this.id_break = var1.id_private("ExplosionPower");
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else if (var1.id_finally() instanceof rhH_2 && var1.id_extends() instanceof rhd_3) {
         super.id_break(var1, 1000.0F);
         return true;
      } else {
         return super.id_break(var1, var2);
      }
   }

   public static boolean id_break(aI_2<rEy_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.id_abstract() != rRO.PEACEFUL && var4.nextInt(20) == 0 && id_class(var0, var1, var2, var3, var4);
   }

   public boolean id_throws() {
      return ((rmE_2)this.id_throws[49]).id_class(id_class);
   }

   public int id_catch() {
      return this.id_break;
   }

   public static iz_3 id_implements() {
      return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_break, 100.0);
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Se;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(5, new rEt_1(this));
      this.id_package.id_class(7, new rEq_1(this));
      this.id_package.id_class(7, new rEp_1(this));
      this.id_int.id_class(1, new rBI<>(this, rhd_3.class, 10, true, false, var1 -> Math.abs(var1.re() - this.re()) <= 4.0));
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
      ((rmE_2)this.id_throws[49]).id_class(id_class, false);
   }
}
