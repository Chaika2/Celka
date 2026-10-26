package celestial;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rMK extends rbZ_2 implements ag_3 {
   private static final rut_3<Boolean> super_ = rmE_2.class_(rMK.class, ruw_3.implements_);
   private float this_;
   private float else_;
   private int synchronized_;
   private static final rqb_3 return_ = rqt_3.class_(20, 39);
   private int public_;
   private UUID goto_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.hg;
   }

   @Override
   public UUID byte_() {
      return this.goto_;
   }

   public rMK(aI_2<? extends rMK> var1, rYB var2) {
      super(var1, var2);
   }

   public void this_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(super_, var1);
   }

   @Override
   public void this_() {
      super.this_();
      if (((rYB)this.throws_[7]).continue_) {
         if (this.else_ != this.this_) {
            this.q_();
         }

         this.this_ = this.else_;
         if (this.sJ()) {
            this.else_ = rfU_2.class_(this.else_ + 1.0F, 0.0F, 6.0F);
         } else {
            this.else_ = rfU_2.class_(this.else_ - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.synchronized_ > 0) {
         this.synchronized_--;
      }

      if (!((rYB)this.throws_[7]).continue_) {
         this.class_((rrEm_1)((rYB)this.throws_[7]), true);
      }
   }

   protected void n() {
      if (this.synchronized_ <= 0) {
         this.class_(rqn_3.hY, 1.0F, this.SN());
         this.synchronized_ = 40;
      }
   }

   @Override
   public int class_() {
      return this.public_;
   }

   @Override
   public void class_(UUID var1) {
      this.goto_ = var1;
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var4 == null) {
         var4 = new am_3(1.0F);
      }

      return super.class_(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public au_3 class_(rrEm_1 var1, au_3 var2) {
      return aI_2.z.class_(var1);
   }

   @Override
   public void class_(int var1) {
      this.public_ = var1;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      this.a_(var1);
   }

   public static boolean break_(aI_2<rMK> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      Optional var5 = var1.protected_(var3);
      return !Objects.equals(var5, Optional.of(rYl_1.extends_)) && !Objects.equals(var5, Optional.of(rYl_1.s))
         ? byte_(var0, var1, var2, var3, var4)
         : var1.class_(var3, 0) > 8 && var1.byte_(var3.break_()).class_(xu_3.PT);
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.hR, 0.15F, 1.0F);
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.class_((rrEm_1)((rYB)this.throws_[7]), var1);
   }

   public static iz_3 L() {
      return is_3.package_().class_(iQ_2.class_, 30.0).class_(iQ_2.break_, 20.0).class_(iQ_2.protected_, 0.25).class_(iQ_2.case_, 6.0);
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return false;
   }

   public float throw_(float var1) {
      return rfU_2.catch_(var1, this.this_, this.else_) / 6.0F;
   }

   @Override
   protected rqA_2 static_() {
      return this.n_() ? rqn_3.hj : rqn_3.hf;
   }

   @Override
   public boolean public_(an_3 var1) {
      boolean var2 = var1.break_(rye_3.byte_(this), (float)((int)this.class_(iQ_2.case_)));
      if (var2) {
         this.class_(this, var1);
      }

      return var2;
   }

   @Override
   public void protected_() {
      this.class_(return_.class_((Random)this.throws_[40]));
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(1, new rMe_1(this));
      this.package_.class_(1, new rMa_1(this));
      this.package_.class_(4, new rBx_1(this, 1.25));
      this.package_.class_(5, new rBU(this, 1.0));
      this.package_.class_(6, new rBA(this, rhd_3.class, 6.0F));
      this.package_.class_(7, new rBC(this));
      this.int_.class_(1, new rMU(this));
      this.int_.class_(2, new rMD(this));
      this.int_.class_(3, new rBI<>(this, rhd_3.class, 10, true, false, this::b_));
      this.int_.class_(4, new rBI<>(this, rba_3.class, 10, true, true, (Predicate<iB_2>)null));
      this.int_.class_(5, new rSP<>(this, false));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.hV;
   }

   @Override
   protected float Bf() {
      return 0.98F;
   }

   public boolean sJ() {
      return ((rmE_2)this.throws_[49]).class_(super_);
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      if (this.else_ > 0.0F) {
         float var2 = this.else_ / 6.0F;
         float var3 = 1.0F + var2;
         return super.a_(var1).class_(1.0F, var3);
      } else {
         return super.a_(var1);
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(super_, false);
   }
}
