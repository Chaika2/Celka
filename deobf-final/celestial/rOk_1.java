package celestial;

import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class rOk_1 extends rbZ_2 implements aK_2, ir_3 {
   private static final rkg_3 super_ = rkg_3.class_(rdy_3.rC);
   private static final rkg_3 this_ = rkg_3.class_(rdy_3.rC, rdy_3.dz);
   private static final rut_3<Integer> else_ = rmE_2.class_(rOk_1.class, ruw_3.break_);
   private static final rut_3<Boolean> synchronized_ = rmE_2.class_(rOk_1.class, ruw_3.implements_);
   private static final rut_3<Boolean> return_ = rmE_2.class_(rOk_1.class, ruw_3.implements_);
   private final av_3 public_ = new av_3((rmE_2)this.throws_[49], else_, return_);
   private rSO goto_;
   private rBY while_;

   @Override
   public boolean byte_() {
      return this.public_.break_();
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.xh;
   }

   @Override
   protected boolean int_() {
      return true;
   }

   public rOk_1(aI_2<? extends rOk_1> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.throws_[2] = var7;
      this.class_(rLp_1.WATER, -1.0F);
      this.class_(rLp_1.LAVA, 0.0F);
      this.class_(rLp_1.DANGER_FIRE, 0.0F);
      this.class_(rLp_1.DAMAGE_FIRE, 0.0F);
   }

   public void this_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(synchronized_, var1);
   }

   @Override
   public void this_() {
      if (this.sd() && ((Random)this.throws_[40]).nextInt(140) == 0) {
         this.class_(rqn_3.xb, 1.0F, this.SN());
      } else if (this.sx() && ((Random)this.throws_[40]).nextInt(60) == 0) {
         this.class_(rqn_3.xM, 1.0F, this.SN());
      }

      xc_3 var1 = ((rYB)this.throws_[7]).byte_(this.Bs());
      xc_3 var2 = this.Pl();
      boolean var3 = var1.class_(rls_3.C) || var2.class_(rls_3.C) || this.break_(rlG_2.byte_) > 0.0;
      this.this_(!var3);
      super.this_();
      this.sc();
      this.Px();
   }

   public float n() {
      return (float)this.class_(iQ_2.protected_) * (this.L() ? 0.66F : 1.0F);
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (this.n_()) {
         return super.class_(var1, var2, var3, var4, var5);
      } else {
         Object var6;
         if (((Random)this.throws_[40]).nextInt(30) == 0) {
            is_3 var7 = aI_2.rb.class_(var1.byte_());
            var6 = this.class_(var1, var2, var7, new rbs_3(rbB_2.class_((Random)this.throws_[40]), false));
            var7.class_(rXQ.MAINHAND, new rdn_3(rdy_3.dz));
            this.class_((rqL_2)null);
         } else if (((Random)this.throws_[40]).nextInt(10) == 0) {
            au_3 var8 = aI_2.w.class_(var1.byte_());
            var8.e_(-24000);
            var6 = this.class_(var1, var2, var8, (aU_2)null);
         } else {
            var6 = new am_3(0.5F);
         }

         return super.class_(var1, var2, var3, (aU_2)var6, var5);
      }
   }

   @Override
   public boolean class_(rRR var1) {
      return var1.protected_(this);
   }

   private aU_2 class_(rRf_1 var1, rRh_1 var2, is_3 var3, aU_2 var4) {
      var3.class_(this.rx(), this.re(), this.BO(), (Float)this.throws_[15], 0.0F);
      var3.class_(var1, var2, iO_2.JOCKEY, var4, (rcd_3)null);
      var3.class_(this, true);
      return new am_3(0.0F);
   }

   @Override
   public float class_(rfH_2 var1, rRR var2) {
      if (var2.byte_(var1).volatile_().class_(rlG_2.byte_)) {
         return 10.0F;
      } else {
         return this.ry() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Override
   public void class_(rjU_2 var1) {
      super.private_(var1);
   }

   @Override
   protected void class_(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
      this.Px();
      if (this.ry()) {
         Float var10 = 0.0F;
         this.throws_[31] = var10;
      } else {
         super.class_(var1, var3, var4, var5);
      }
   }

   @Override
   public void class_(rqL_2 var1) {
      this.public_.class_(true);
      if (var1 != null) {
         ((rYB)this.throws_[7]).class_((rhd_3)null, this, rqn_3.xd, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean class_() {
      return this.BM() && !this.n_();
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      this.public_.class_(var1);
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (else_.equals(var1) && ((rYB)this.throws_[7]).continue_) {
         this.public_.class_();
      }

      super.class_(var1);
   }

   @Override
   public boolean class_(rXs_1 var1) {
      return var1.class_(rlG_2.byte_);
   }

   private void sc() {
      if (this.ry()) {
         rjm_3 var1 = rjm_3.class_(this);
         if (var1.class_(dj_3.package_, this.Bs(), true) && !((rYB)this.throws_[7]).break_(this.Bs().final_()).class_(rlG_2.byte_)) {
            Boolean var6 = true;
            this.throws_[20] = var6;
         } else {
            this.byte_(this.rv().class_(0.5).break_(0.0, 0.05, 0.0));
         }
      }
   }

   private boolean sd() {
      return this.goto_ != null && this.goto_.private_();
   }

   public static boolean break_(aI_2<rOk_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      rfw_3 var5 = var3.new_();

      do {
         var5.class_(rpr_3.UP);
      } while (var1.break_(var5).class_(rlG_2.byte_));

      return var1.byte_(var5).catch_();
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.public_.break_(var1);
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      boolean var3 = this.extends_(var1.protected_(var2));
      if (!var3 && this.byte_() && !this.BP() && !var1.sN()) {
         if (!((rYB)this.throws_[7]).continue_) {
            var1.this_(this);
         }

         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         ryZ_2 var4 = super.break_(var1, var2);
         if (!var4.class_()) {
            rdn_3 var5 = var1.protected_(var2);
            return var5.break_() == rdy_3.hK ? var5.class_(var1, this, var2) : ryZ_2.PASS;
         } else {
            if (var3 && !this.BF()) {
               ((rYB)this.throws_[7])
                  .class_(
                     (rhd_3)null,
                     this.rx(),
                     this.re(),
                     this.BO(),
                     rqn_3.xx,
                     this.Pr(),
                     1.0F,
                     1.0F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F
                  );
            }

            return var4;
         }
      }
   }

   public rOk_1 break_(rrEm_1 var1, au_3 var2) {
      return aI_2.w.class_(var1);
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(this.ry() ? rqn_3.xJ : rqn_3.xX, 1.0F, 1.0F);
   }

   @Override
   protected rLy_1 break_(rYB var1) {
      return new rOW(this, var1);
   }

   @Override
   public float throws_() {
      return (float)this.class_(iQ_2.protected_) * (this.L() ? 0.23F : 0.55F);
   }

   public boolean L() {
      return this.ra() instanceof rOk_1 ? ((rOk_1)this.ra()).L() : ((rmE_2)this.throws_[49]).class_(synchronized_);
   }

   private boolean sx() {
      return this.while_ != null && this.while_.private_();
   }

   @Override
   public boolean G() {
      return !(this.rU() instanceof rhd_3 var2) ? false : var2.ss().break_() == rdy_3.dz || var2.Sn().break_() == rdy_3.dz;
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return super_.class_(var1);
   }

   @Override
   protected boolean case_(an_3 var1) {
      return this.Bh().isEmpty() && !this.class_(rlG_2.byte_);
   }

   @Override
   protected rqA_2 static_() {
      return !this.sx() && !this.sd() ? rqn_3.xG : null;
   }

   @Override
   public boolean protected_() {
      return this.public_.class_(this.Sa());
   }

   @Override
   public void private_(rjU_2 var1) {
      this.super_(this.n());
      this.class_(this, this.public_, var1);
   }

   @Override
   protected void final_() {
      this.while_ = new rBY(this, 1.65);
      this.package_.class_(1, this.while_);
      this.package_.class_(2, new rBP(this, 1.0));
      this.goto_ = new rSO(this, 1.4, false, this_);
      this.package_.class_(3, this.goto_);
      this.package_.class_(4, new rOz_1(this, 1.5));
      this.package_.class_(5, new rBx_1(this, 1.1));
      this.package_.class_(7, new rBU(this, 1.0, 60));
      this.package_.class_(8, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(8, new rBC(this));
      this.package_.class_(9, new rBA(this, rOk_1.class, 8.0F));
   }

   @Override
   protected float rQ() {
      return (Float)this.throws_[30] + 0.6F;
   }

   @Override
   public boolean Pz() {
      return false;
   }

   @Override
   public an_3 rU() {
      return this.Bh().isEmpty() ? null : this.Bh().get(0);
   }

   @Override
   public double PS() {
      float var1 = Math.min(0.25F, (Float)this.private_[18]);
      float var2 = (Float)this.private_[19];
      return (double)this.Bm() - 0.19 + (double)(0.12F * rfU_2.break_(var2 * 1.5F) * 2.0F * var1);
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.6F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.xO;
   }

   @Override
   public boolean BU() {
      return true;
   }

   public static iz_3 sJ() {
      return is_3.package_().class_(iQ_2.protected_, 0.175F).class_(iQ_2.break_, 16.0);
   }

   @Override
   protected void Sx() {
      super.Sx();
      if (this.byte_()) {
         this.class_(rdy_3.hK);
      }
   }

   @Override
   public rjU_2 a_(iB_2 var1) {
      rjU_2[] var2 = new rjU_2[]{
         class_((double)this.PN(), (double)var1.PN(), (Float)var1.throws_[15]),
         class_((double)this.PN(), (double)var1.PN(), (Float)var1.throws_[15] - 22.5F),
         class_((double)this.PN(), (double)var1.PN(), (Float)var1.throws_[15] + 22.5F),
         class_((double)this.PN(), (double)var1.PN(), (Float)var1.throws_[15] - 45.0F),
         class_((double)this.PN(), (double)var1.PN(), (Float)var1.throws_[15] + 45.0F)
      };
      LinkedHashSet var3 = Sets.newLinkedHashSet();
      double var4 = this.rN().throws_;
      double var6 = this.rN().break_ - 0.5;
      rfw_3 var8 = new rfw_3();

      for (rjU_2 var12 : var2) {
         var8.break_(this.rx() + var12.break_, var4, this.BO() + var12.protected_);

         for (double var13 = var4; var13 > var6; var13--) {
            var3.add(var8.int_());
            var8.class_(rpr_3.DOWN);
         }
      }

      for (rfH_2 var18 : var3) {
         if (!((rYB)this.throws_[7]).break_(var18).class_(rlG_2.byte_)) {
            double var19 = ((rYB)this.throws_[7]).private_(var18);
            if (rqI_2.class_(var19)) {
               rjU_2 var20 = rjU_2.class_(var18, var19);
               UnmodifiableIterator var14 = var1.BV().iterator();

               while (var14.hasNext()) {
                  iM_2 var15 = (iM_2)var14.next();
                  rfl_3 var16 = var1.catch_(var15);
                  if (rqI_2.class_((rYB)this.throws_[7], var1, var16.protected_(var20))) {
                     var1.class_(var15);
                     return var20;
                  }
               }
            }
         }
      }

      return new rjU_2(this.rx(), this.rN().throws_, this.BO());
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(else_, 0);
      ((rmE_2)this.throws_[49]).class_(synchronized_, false);
      ((rmE_2)this.throws_[49]).class_(return_, false);
   }
}
