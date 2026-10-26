package celestial;

import java.util.Random;
import java.util.function.Predicate;

public class rON extends rbZ_2 {
   private static final rut_3<rfH_2> this_ = rmE_2.class_(rON.class, ruw_3.native_);
   private static final rut_3<Boolean> else_ = rmE_2.class_(rON.class, ruw_3.implements_);
   private static final rut_3<Boolean> synchronized_ = rmE_2.class_(rON.class, ruw_3.implements_);
   private static final rut_3<rfH_2> return_ = rmE_2.class_(rON.class, ruw_3.native_);
   private static final rut_3<Boolean> public_ = rmE_2.class_(rON.class, ruw_3.implements_);
   private static final rut_3<Boolean> goto_ = rmE_2.class_(rON.class, ruw_3.implements_);
   int while_;
   public static final Predicate<iB_2> super_ = var0 -> var0.n_() && !var0.rT();

   @Override
   public int char_() {
      return 200;
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return this.n_() ? rqn_3.dy : rqn_3.dH;
   }

   public rON(aI_2<? extends rON> var1, rYB var2) {
      super(var1, var2);
      this.class_(rLp_1.WATER, 0.0F);
      this.native_ = new rOv_1(this);
      Float var7 = 1.0F;
      this.throws_[37] = var7;
   }

   void this_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(else_, var1);
   }

   @Override
   public boolean n() {
      return ((rmE_2)this.throws_[49]).class_(synchronized_);
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.implements_(this.Bs());
      this.finally_(rfH_2.protected_);
      return super.class_(var1, var2, var3, var4, var5);
   }

   @Override
   public float class_(rfH_2 var1, rRR var2) {
      if (!this.sc() && var2.break_(var1).class_(rlG_2.break_)) {
         return 10.0F;
      } else {
         return zH_2.class_(var2, var1) ? 10.0F : var2.native_(var1) - 0.5F;
      }
   }

   @Override
   public au_3 class_(rrEm_1 var1, au_3 var2) {
      return aI_2.o.class_(var1);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("HomePosX", this.sx().b_());
      var1.break_("HomePosY", this.sx().c_());
      var1.break_("HomePosZ", this.sx().d_());
      var1.class_("HasEgg", this.L());
      var1.break_("TravelPosX", this.sd().b_());
      var1.break_("TravelPosY", this.sd().c_());
      var1.break_("TravelPosZ", this.sd().d_());
   }

   @Override
   public void class_(rrEm_1 var1, rSg_1 var2) {
      this.break_(rye_3.break_, Float.MAX_VALUE);
   }

   boolean sc() {
      return ((rmE_2)this.throws_[49]).class_(public_);
   }

   @Override
   public void default_() {
      super.default_();
      if (this.BM() && this.n() && this.while_ >= 1 && this.while_ % 5 == 0) {
         rfH_2 var1 = this.Bs();
         if (zH_2.class_((rYB)this.throws_[7], var1)) {
            ((rYB)this.throws_[7]).byte_(2001, var1, xd_3.finally_(xu_3.throw_.continue_()));
         }
      }
   }

   rfH_2 sd() {
      return ((rmE_2)this.throws_[49]).class_(return_);
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      rqA_2 var3 = this.n_() ? rqn_3.dT : rqn_3.dq;
      this.class_(var3, 0.15F, 1.0F);
   }

   @Override
   protected rLy_1 break_(rYB var1) {
      return new rOF(this, var1);
   }

   @Override
   public void break_(rcd_3 var1) {
      int var2 = var1.private_("HomePosX");
      int var3 = var1.private_("HomePosY");
      int var4 = var1.private_("HomePosZ");
      this.implements_(new rfH_2(var2, var3, var4));
      super.break_(var1);
      this.this_(var1.new_("HasEgg"));
      int var5 = var1.private_("TravelPosX");
      int var6 = var1.private_("TravelPosY");
      int var7 = var1.private_("TravelPosZ");
      this.finally_(new rfH_2(var5, var6, var7));
   }

   public static boolean break_(aI_2<rON> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var3.c_() < var1.short_() + 4 && zH_2.class_(var1, var3) && var1.class_(var3, 0) > 8;
   }

   public boolean L() {
      return ((rmE_2)this.throws_[49]).class_(else_);
   }

   rfH_2 sx() {
      return ((rmE_2)this.throws_[49]).class_(this_);
   }

   @Override
   public boolean sk() {
      return super.sk() && !this.L();
   }

   void finally_(rfH_2 var1) {
      ((rmE_2)this.throws_[49]).break_(return_, var1);
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return var1.break_() == xu_3.rr.case_();
   }

   void else_(boolean var1) {
      this.while_ = var1 ? 1 : 0;
      ((rmE_2)this.throws_[49]).break_(synchronized_, var1);
   }

   public void implements_(rfH_2 var1) {
      ((rmE_2)this.throws_[49]).break_(this_, var1);
   }

   void return_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(goto_, var1);
   }

   @Override
   protected rqA_2 static_() {
      return !this.rT() && this.throws_[20] && !this.n_() ? rqn_3.dF : super.static_();
   }

   @Override
   public boolean protected_(rhd_3 var1) {
      return false;
   }

   @Override
   public void private_(rjU_2 var1) {
      if (this.try_() && this.rT()) {
         this.class_(0.1F, var1);
         this.class_(iG_2.SELF, this.rv());
         this.byte_(this.rv().class_(0.9));
         if (this.I_() == null && (!this.sc() || !this.sx().class_(this.Ps(), 20.0))) {
            this.byte_(this.rv().break_(0.0, -0.005, 0.0));
         }
      } else {
         super.private_(var1);
      }
   }

   @Override
   protected void private_(float var1) {
      super.private_(var1 * 1.5F);
   }

   @Override
   protected void final_() {
      this.package_.class_(0, new rOL(this, 1.2));
      this.package_.class_(1, new rOZ(this, 1.0));
      this.package_.class_(1, new rOm_1(this, 1.0));
      this.package_.class_(2, new rOA(this, 1.1, xu_3.rr.case_()));
      this.package_.class_(3, new rOu_1(this, 1.0));
      this.package_.class_(4, new rOc_1(this, 1.0));
      this.package_.class_(7, new rOn_1(this, 1.0));
      this.package_.class_(8, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(9, new rOC(this, 1.0, 100));
   }

   void synchronized_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(public_, var1);
   }

   @Override
   protected void P_() {
      super.P_();
      if (!this.n_() && ((rYB)this.throws_[7]).B().break_(rRu_1.throws_)) {
         this.class_(rdy_3.OE, 1);
      }
   }

   @Override
   protected float rQ() {
      return (Float)this.throws_[30] + 0.15F;
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
      return is_3.package_().class_(iQ_2.class_, 30.0).class_(iQ_2.protected_, 0.25);
   }

   @Override
   public aL_2 sG() {
      return aL_2.throws_;
   }

   @Override
   public float SR() {
      return this.n_() ? 0.3F : 1.0F;
   }

   boolean su() {
      return ((rmE_2)this.throws_[49]).class_(goto_);
   }

   @Override
   public boolean SO() {
      return true;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(this_, rfH_2.protected_);
      ((rmE_2)this.throws_[49]).class_(else_, false);
      ((rmE_2)this.throws_[49]).class_(return_, rfH_2.protected_);
      ((rmE_2)this.throws_[49]).class_(public_, false);
      ((rmE_2)this.throws_[49]).class_(goto_, false);
      ((rmE_2)this.throws_[49]).class_(synchronized_, false);
   }
}
