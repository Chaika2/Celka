package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Random;

public class rEg_1 extends rbZ_2 implements rEK, rEo_1 {
   private static final rut_3<Boolean> else_ = rmE_2.class_(rEg_1.class, ruw_3.implements_);
   private int synchronized_;
   private int return_ = 0;
   private boolean public_ = false;
   protected static final ImmutableList<? extends rrP_2<? extends rrr_3<? super rEg_1>>> super_ = ImmutableList.of(
      rrP_2.byte_, rrP_2.protected_, rrP_2.final_, rrP_2.volatile_
   );
   protected static final ImmutableList<? extends il_3<?>> this_ = ImmutableList.of(
      il_3.continue_,
      il_3.catch_,
      il_3.private_,
      il_3.extends_,
      il_3.native_,
      il_3.final_,
      il_3.volatile_,
      il_3.interface_,
      il_3.this_,
      il_3.package_,
      il_3.int_,
      il_3.G,
      new il_3[]{il_3.while_, il_3.M, il_3.O, il_3.E, il_3.void_, il_3.J, il_3.x}
   );

   private void byte_(rrEm_1 var1) {
      rbP_2 var2 = this.class_(aI_2.rS, true);
      if (var2 != null) {
         var2.break_(new rLY(rLD.implements_, 200, 0));
      }
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.sI;
   }

   @Override
   protected int byte_(rhd_3 var1) {
      return this.finally_;
   }

   @Override
   protected void double_() {
      this.SF().class_((rrEm_1)((rYB)this.throws_[7]), this);
      rER.class_(this);
      if (this.sx()) {
         this.return_++;
         if (this.return_ > 300) {
            this.class_(rqn_3.st);
            this.byte_((rrEm_1)((rYB)this.throws_[7]));
         }
      } else {
         this.return_ = 0;
      }
   }

   public rEg_1(aI_2<? extends rEg_1> var1, rYB var2) {
      super(var1, var2);
      this.finally_ = 5;
   }

   public void this_(boolean var1) {
      this.BQ().break_(else_, var1);
   }

   @Override
   public int n() {
      return this.synchronized_;
   }

   @Override
   public float class_(rfH_2 var1, rRR var2) {
      if (rER.class_(this, var1)) {
         return -1.0F;
      } else {
         return var2.byte_(var1.break_()).class_(xu_3.XL) ? 10.0F : 0.0F;
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var1.long_().nextFloat() < 0.2F) {
         this.class_(true);
      }

      return super.class_(var1, var2, var3, var4, var5);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      if (this.sc()) {
         var1.class_("IsImmuneToZombification", true);
      }

      var1.break_("TimeInOverworld", this.return_);
      if (this.public_) {
         var1.class_("CannotBeHunted", true);
      }
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 4) {
         this.synchronized_ = 10;
         this.class_(rqn_3.sT, 1.0F, this.SN());
      } else {
         super.class_(var1);
      }
   }

   protected void class_(rqA_2 var1) {
      this.class_(var1, this.Si(), this.SN());
   }

   @Override
   protected iZ_2<?> class_(Dynamic<?> var1) {
      return rER.class_(this.SV().class_(var1));
   }

   @Override
   public au_3 class_(rrEm_1 var1, au_3 var2) {
      rEg_1 var3 = aI_2.long_.class_(var1);
      if (var3 != null) {
         var3.b();
      }

      return var3;
   }

   private boolean sc() {
      return this.BQ().class_(else_);
   }

   @Override
   public void default_() {
      if (this.synchronized_ > 0) {
         this.synchronized_--;
      }

      super.default_();
   }

   public boolean sd() {
      return this.sJ() && !this.public_;
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      boolean var3 = super.break_(var1, var2);
      if (((rYB)this.throws_[7]).continue_) {
         return false;
      } else {
         if (var3 && var1.extends_() instanceof iB_2) {
            rER.break_(this, (iB_2)var1.extends_());
         }

         return var3;
      }
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.sj, 0.15F, 1.0F);
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.this_(var1.new_("IsImmuneToZombification"));
      this.return_ = var1.private_("TimeInOverworld");
      this.else_(var1.new_("CannotBeHunted"));
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      ryZ_2 var3 = super.break_(var1, var2);
      if (var3.class_()) {
         this.b();
      }

      return var3;
   }

   public static boolean break_(aI_2<rEg_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return !var1.byte_(var3.break_()).class_(xu_3.bg);
   }

   @Override
   protected void throws_(iB_2 var1) {
      if (this.sJ()) {
         rEo_1.break_(this, var1);
      }
   }

   public static iz_3 L() {
      return rEi_1.sm().class_(iQ_2.class_, 40.0).class_(iQ_2.protected_, 0.3F).class_(iQ_2.byte_, 0.6F).class_(iQ_2.catch_, 1.0).class_(iQ_2.case_, 6.0);
   }

   public boolean sx() {
      return !((rYB)this.throws_[7]).default_().catch_() && !this.sc() && !this.c();
   }

   @Override
   public boolean sk() {
      return !rER.byte_(this) && super.sk();
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return var1.break_() == rdy_3.rn;
   }

   private void else_(boolean var1) {
      this.public_ = var1;
   }

   @Override
   protected void for_() {
      super.for_();
      ruP_2.class_(this);
   }

   @Override
   protected rqA_2 static_() {
      return ((rYB)this.throws_[7]).continue_ ? null : rER.break_(this).orElse((rqA_2)null);
   }

   @Override
   public boolean public_(an_3 var1) {
      if (!(var1 instanceof iB_2)) {
         return false;
      } else {
         this.synchronized_ = 10;
         ((rYB)this.throws_[7]).class_(this, (byte)4);
         this.class_(rqn_3.sT, 1.0F, this.SN());
         rER.class_(this, (iB_2)var1);
         return rEo_1.class_(this, (iB_2)var1);
      }
   }

   @Override
   public boolean protected_(rhd_3 var1) {
      return !this.z();
   }

   @Override
   public boolean private_(double var1) {
      return !this.O();
   }

   @Override
   protected void P_() {
      if (this.n_()) {
         this.finally_ = 3;
         this.byte_(iQ_2.case_).class_(0.5);
      } else {
         this.finally_ = 5;
         this.byte_(iQ_2.case_).class_(6.0);
      }
   }

   @Override
   public double PS() {
      return (double)this.Bm() - (this.n_() ? 0.2 : 0.15);
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
      return rqn_3.sw;
   }

   public boolean sJ() {
      return !this.n_();
   }

   @Override
   protected boolean Sp() {
      return true;
   }

   @Override
   public iZ_2<rEg_1> SF() {
      return (iZ_2<rEg_1>)super.SF();
   }

   @Override
   protected iF_2<rEg_1> SV() {
      return iZ_2.class_(this_, super_);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(else_, false);
   }
}
