package celestial;

import java.util.Random;
import java.util.function.Predicate;

public class rON extends rbZ_2 {
   private static final rut_3<rfH_2> id_this = rmE_2.id_class(rON.class, ruw_3.id_native);
   private static final rut_3<Boolean> id_else = rmE_2.id_class(rON.class, ruw_3.id_implements);
   private static final rut_3<Boolean> id_synchronized = rmE_2.id_class(rON.class, ruw_3.id_implements);
   private static final rut_3<rfH_2> id_return = rmE_2.id_class(rON.class, ruw_3.id_native);
   private static final rut_3<Boolean> id_public = rmE_2.id_class(rON.class, ruw_3.id_implements);
   private static final rut_3<Boolean> id_goto = rmE_2.id_class(rON.class, ruw_3.id_implements);
   int id_while;
   public static final Predicate<iB_2> id_super = var0 -> var0.n_() && !var0.rT();

   @Override
   public int id_char() {
      return 200;
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return this.n_() ? rqn_3.dy : rqn_3.dH;
   }

   public rON(aI_2<? extends rON> var1, rYB var2) {
      super(var1, var2);
      this.id_class(rLp_1.WATER, 0.0F);
      this.id_native = new rOv_1(this);
      Float var7 = 1.0F;
      this.id_throws[37] = var7;
   }

   void id_this(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_else, var1);
   }

   @Override
   public boolean n() {
      return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_implements(this.Bs());
      this.id_finally(rfH_2.id_protected);
      return super.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public float id_class(rfH_2 var1, rRR var2) {
      if (!this.sc() && var2.id_break(var1).id_class(rlG_2.id_break)) {
         return 10.0F;
      } else {
         return zH_2.id_class(var2, var1) ? 10.0F : var2.id_native(var1) - 0.5F;
      }
   }

   @Override
   public au_3 id_class(rrEm_1 var1, au_3 var2) {
      return aI_2.o.id_class(var1);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("HomePosX", this.sx().b_());
      var1.id_break("HomePosY", this.sx().c_());
      var1.id_break("HomePosZ", this.sx().d_());
      var1.id_class("HasEgg", this.L());
      var1.id_break("TravelPosX", this.sd().b_());
      var1.id_break("TravelPosY", this.sd().c_());
      var1.id_break("TravelPosZ", this.sd().d_());
   }

   @Override
   public void id_class(rrEm_1 var1, rSg_1 var2) {
      this.id_break(rye_3.id_break, Float.MAX_VALUE);
   }

   boolean sc() {
      return ((rmE_2)this.id_throws[49]).id_class(id_public);
   }

   @Override
   public void id_default() {
      super.id_default();
      if (this.BM() && this.n() && this.id_while >= 1 && this.id_while % 5 == 0) {
         rfH_2 var1 = this.Bs();
         if (zH_2.id_class((rYB)this.id_throws[7], var1)) {
            ((rYB)this.id_throws[7]).id_byte(2001, var1, xd_3.id_finally(xu_3.id_throw.id_continue()));
         }
      }
   }

   rfH_2 sd() {
      return ((rmE_2)this.id_throws[49]).id_class(id_return);
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      rqA_2 var3 = this.n_() ? rqn_3.dT : rqn_3.dq;
      this.id_class(var3, 0.15F, 1.0F);
   }

   @Override
   protected rLy_1 id_break(rYB var1) {
      return new rOF(this, var1);
   }

   @Override
   public void id_break(rcd_3 var1) {
      int var2 = var1.id_private("HomePosX");
      int var3 = var1.id_private("HomePosY");
      int var4 = var1.id_private("HomePosZ");
      this.id_implements(new rfH_2(var2, var3, var4));
      super.id_break(var1);
      this.id_this(var1.id_new("HasEgg"));
      int var5 = var1.id_private("TravelPosX");
      int var6 = var1.id_private("TravelPosY");
      int var7 = var1.id_private("TravelPosZ");
      this.id_finally(new rfH_2(var5, var6, var7));
   }

   public static boolean id_break(aI_2<rON> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var3.c_() < var1.id_short() + 4 && zH_2.id_class(var1, var3) && var1.id_class(var3, 0) > 8;
   }

   public boolean L() {
      return ((rmE_2)this.id_throws[49]).id_class(id_else);
   }

   rfH_2 sx() {
      return ((rmE_2)this.id_throws[49]).id_class(id_this);
   }

   @Override
   public boolean sk() {
      return super.sk() && !this.L();
   }

   void id_finally(rfH_2 var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_return, var1);
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return var1.id_break() == xu_3.rr.id_case();
   }

   void id_else(boolean var1) {
      this.id_while = var1 ? 1 : 0;
      ((rmE_2)this.id_throws[49]).id_break(id_synchronized, var1);
   }

   public void id_implements(rfH_2 var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_this, var1);
   }

   void id_return(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_goto, var1);
   }

   @Override
   protected rqA_2 id_static() {
      return !this.rT() && this.id_throws[20] && !this.n_() ? rqn_3.dF : super.id_static();
   }

   @Override
   public boolean id_protected(rhd_3 var1) {
      return false;
   }

   @Override
   public void id_private(rjU_2 var1) {
      if (this.id_try() && this.rT()) {
         this.id_class(0.1F, var1);
         this.id_class(iG_2.SELF, this.rv());
         this.id_byte(this.rv().id_class(0.9));
         if (this.I_() == null && (!this.sc() || !this.sx().id_class(this.Ps(), 20.0))) {
            this.id_byte(this.rv().id_break(0.0, -0.005, 0.0));
         }
      } else {
         super.id_private(var1);
      }
   }

   @Override
   protected void id_private(float var1) {
      super.id_private(var1 * 1.5F);
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rOL(this, 1.2));
      this.id_package.id_class(1, new rOZ(this, 1.0));
      this.id_package.id_class(1, new rOm_1(this, 1.0));
      this.id_package.id_class(2, new rOA(this, 1.1, xu_3.rr.id_case()));
      this.id_package.id_class(3, new rOu_1(this, 1.0));
      this.id_package.id_class(4, new rOc_1(this, 1.0));
      this.id_package.id_class(7, new rOn_1(this, 1.0));
      this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(9, new rOC(this, 1.0, 100));
   }

   void id_synchronized(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_public, var1);
   }

   @Override
   protected void P_() {
      super.P_();
      if (!this.n_() && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_throws)) {
         this.id_class(rdy_3.OE, 1);
      }
   }

   @Override
   protected float rQ() {
      return (Float)this.id_throws[30] + 0.15F;
   }

   @Override
   protected rqA_2 BB() {
      return rqn_3.dt;
   }

   @Override
   protected rqA_2 Bt() {
      return this.n_() ? rqn_3.dA : rqn_3.dL;
   }

   public static iz_3 sJ() {
      return is_3.id_package().id_class(iQ_2.id_class, 30.0).id_class(iQ_2.id_protected, 0.25);
   }

   @Override
   public aL_2 sG() {
      return aL_2.id_throws;
   }

   @Override
   public float SR() {
      return this.n_() ? 0.3F : 1.0F;
   }

   boolean su() {
      return ((rmE_2)this.id_throws[49]).id_class(id_goto);
   }

   @Override
   public boolean SO() {
      return true;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_this, rfH_2.id_protected);
      ((rmE_2)this.id_throws[49]).id_class(id_else, false);
      ((rmE_2)this.id_throws[49]).id_class(id_return, rfH_2.id_protected);
      ((rmE_2)this.id_throws[49]).id_class(id_public, false);
      ((rmE_2)this.id_throws[49]).id_class(id_goto, false);
      ((rmE_2)this.id_throws[49]).id_class(id_synchronized, false);
   }
}
