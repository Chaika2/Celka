package celestial;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rEu_1 extends rEi_1 implements ag_3 {
   private static final UUID class_ = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final ix_3 break_ = new ix_3(class_, "Attacking speed boost", 0.15F, id_3.ADDITION);
   private static final rut_3<Optional<xc_3>> protected_ = rmE_2.class_(rEu_1.class, ruw_3.private_);
   private static final rut_3<Boolean> super_ = rmE_2.class_(rEu_1.class, ruw_3.implements_);
   private static final rut_3<Boolean> this_ = rmE_2.class_(rEu_1.class, ruw_3.implements_);
   private static final Predicate<iB_2> else_ = var0 -> var0 instanceof rEL && ((rEL)var0).L();
   private int synchronized_ = Integer.MIN_VALUE;
   private int return_;
   private static final rqb_3 public_ = rqt_3.class_(20, 39);
   private int goto_;
   private UUID while_;

   @Override
   public UUID byte_() {
      return this.while_;
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.By;
   }

   public void byte_(xc_3 var1) {
      ((rmE_2)this.throws_[49]).break_(protected_, Optional.ofNullable(var1));
   }

   @Override
   public void byte_(iB_2 var1) {
      super.byte_(var1);
      ic_3 var2 = this.byte_(iQ_2.protected_);
      if (var1 == null) {
         this.return_ = 0;
         ((rmE_2)this.throws_[49]).break_(super_, false);
         ((rmE_2)this.throws_[49]).break_(this_, false);
         var2.protected_(break_);
      } else {
         this.return_ = (Integer)this.throws_[41];
         ((rmE_2)this.throws_[49]).break_(super_, true);
         if (!var2.class_(break_)) {
            var2.break_(break_);
         }
      }
   }

   @Override
   protected void double_() {
      if (((rYB)this.throws_[7]).strictfp_() && (Integer)this.throws_[41] >= this.return_ + 600) {
         float var1 = this.rX();
         if (var1 > 0.5F && ((rYB)this.throws_[7]).case_(this.Bs()) && ((Random)this.throws_[40]).nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.byte_((iB_2)null);
            this.sx();
         }
      }

      super.double_();
   }

   public rEu_1(aI_2<? extends rEu_1> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 1.0F;
      this.throws_[37] = var7;
      this.class_(rLp_1.WATER, -1.0F);
   }

   @Override
   protected void class_(rye_3 var1, int var2, boolean var3) {
      super.class_(var1, var2, var3);
      xc_3 var4 = this.sd();
      if (var4 != null) {
         this.class_(var4.break_());
      }
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (super_.equals(var1) && this.sW() && ((rYB)this.throws_[7]).continue_) {
         this.sJ();
      }

      super.class_(var1);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      xc_3 var2 = this.sd();
      if (var2 != null) {
         var1.class_("carriedBlockState", rco_3.class_(var2));
      }

      this.a_(var1);
   }

   boolean class_(an_3 var1) {
      rjU_2 var2 = new rjU_2(this.rx() - var1.rx(), this.byte_(0.5) - var1.rH(), this.BO() - var1.BO());
      var2 = var2.protected_();
      double var3 = 16.0;
      double var5 = this.rx() + (((Random)this.throws_[40]).nextDouble() - 0.5) * 8.0 - var2.break_ * 16.0;
      double var7 = this.re() + (double)(((Random)this.throws_[40]).nextInt(16) - 8) - var2.byte_ * 16.0;
      double var9 = this.BO() + (((Random)this.throws_[40]).nextDouble() - 0.5) * 8.0 - var2.protected_ * 16.0;
      return this.continue_(var5, var7, var9);
   }

   @Override
   public int class_() {
      return this.goto_;
   }

   @Override
   public void class_(UUID var1) {
      this.while_ = var1;
   }

   @Override
   public void class_(int var1) {
      this.goto_ = var1;
   }

   @Override
   public void default_() {
      if (((rYB)this.throws_[7]).continue_) {
         for (int var1 = 0; var1 < 2; var1++) {
            ((rYB)this.throws_[7])
               .class_(
                  rLQ.transient_,
                  this.break_(0.5),
                  this.Ph() - 0.25,
                  this.protected_(0.5),
                  (((Random)this.throws_[40]).nextDouble() - 0.5) * 2.0,
                  -((Random)this.throws_[40]).nextDouble(),
                  (((Random)this.throws_[40]).nextDouble() - 0.5) * 2.0
               );
         }
      }

      Boolean var6 = false;
      this.private_[41] = var6;
      if (!((rYB)this.throws_[7]).continue_) {
         this.class_((rrEm_1)((rYB)this.throws_[7]), true);
      }

      super.default_();
   }

   public xc_3 sd() {
      return ((rmE_2)this.throws_[49]).class_(protected_).orElse((xc_3)null);
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else if (var1 instanceof rpw_3) {
         for (int var4 = 0; var4 < 64; var4++) {
            if (this.sx()) {
               return true;
            }
         }

         return false;
      } else {
         boolean var3 = super.break_(var1, var2);
         if (!((rYB)this.throws_[7]).import_() && !(var1.extends_() instanceof iB_2) && ((Random)this.throws_[40]).nextInt(10) != 0) {
            this.sx();
         }

         return var3;
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      xc_3 var2 = null;
      if (var1.byte_("carriedBlockState", 10)) {
         var2 = rco_3.byte_(var1.int_("carriedBlockState"));
         if (var2.catch_()) {
            var2 = null;
         }
      }

      this.byte_(var2);
      this.class_((rrEm_1)((rYB)this.throws_[7]), var1);
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 2.55F;
   }

   public static iz_3 L() {
      return rEi_1.sm().class_(iQ_2.class_, 40.0).class_(iQ_2.protected_, 0.3F).class_(iQ_2.case_, 7.0).class_(iQ_2.break_, 64.0);
   }

   protected boolean sx() {
      if (!((rYB)this.throws_[7]).import_() && this.BM()) {
         double var1 = this.rx() + (((Random)this.throws_[40]).nextDouble() - 0.5) * 64.0;
         double var3 = this.re() + (double)(((Random)this.throws_[40]).nextInt(64) - 32);
         double var5 = this.BO() + (((Random)this.throws_[40]).nextDouble() - 0.5) * 64.0;
         return this.continue_(var1, var3, var5);
      } else {
         return false;
      }
   }

   public boolean sk() {
      return ((rmE_2)this.throws_[49]).class_(super_);
   }

   boolean case_(rhd_3 var1) {
      rdn_3 var2 = ((rhz_3)var1.implements_[1]).break_.get(3);
      if (var2.break_() == xu_3.Br.case_()) {
         return false;
      } else {
         rjU_2 var3 = var1.break_(1.0F).protected_();
         rjU_2 var4 = new rjU_2(this.rx() - var1.rx(), this.rH() - var1.rH(), this.BO() - var1.BO());
         double var5 = var4.case_();
         var4 = var4.protected_();
         double var7 = var3.break_(var4);
         return var7 > 1.0 - 0.025 / var5 ? var1.while_(this) : false;
      }
   }

   private boolean continue_(double var1, double var3, double var5) {
      rfw_3 var7 = new rfw_3(var1, var3, var5);

      while (var7.c_() > 0 && !((rYB)this.throws_[7]).byte_(var7).byte_().byte_()) {
         var7.class_(rpr_3.DOWN);
      }

      xc_3 var8 = ((rYB)this.throws_[7]).byte_(var7);
      boolean var9 = var8.byte_().byte_();
      boolean var10 = var8.volatile_().class_(rlG_2.break_);
      if (var9 && !var10) {
         boolean var11 = this.class_(var1, var3, var5, true);
         if (var11 && !this.BF()) {
            ((rYB)this.throws_[7])
               .class_((rhd_3)null, (Double)this.throws_[8], (Double)this.throws_[9], (Double)this.throws_[10], rqn_3.BT, this.Pr(), 1.0F, 1.0F);
            this.class_(rqn_3.BT, 1.0F, 1.0F);
         }

         return var11;
      } else {
         return false;
      }
   }

   @Override
   protected rqA_2 static_() {
      return this.sk() ? rqn_3.Bp : rqn_3.Bl;
   }

   @Override
   public void protected_() {
      this.class_(public_.class_((Random)this.throws_[40]));
   }

   @Override
   protected void final_() {
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(1, new rEv_1(this));
      this.package_.class_(2, new rBl_1(this, 1.0, false));
      this.package_.class_(7, new rSk_1(this, 1.0, 0.0F));
      this.package_.class_(8, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(8, new rBC(this));
      this.package_.class_(10, new rEZ(this));
      this.package_.class_(11, new rEF(this));
      this.int_.class_(1, new rEm_1(this, this::b_));
      this.int_.class_(2, new rBc_1(this));
      this.int_.class_(3, new rBI<>(this, rEL.class, 10, true, false, else_));
      this.int_.class_(4, new rSP<>(this, false));
   }

   @Override
   public boolean strictfp_() {
      return super.strictfp_() || this.sd() != null;
   }

   public void sz() {
      ((rmE_2)this.throws_[49]).break_(this_, true);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.BH;
   }

   @Override
   public boolean BU() {
      return true;
   }

   @Override
   public void sJ() {
      if ((Integer)this.throws_[41] >= this.synchronized_ + 400) {
         this.synchronized_ = (Integer)this.throws_[41];
         if (!this.BF()) {
            ((rYB)this.throws_[7]).class_(this.rx(), this.rH(), this.BO(), rqn_3.Bq, this.Pr(), 2.5F, 1.0F, false);
         }
      }
   }

   public boolean sW() {
      return ((rmE_2)this.throws_[49]).class_(this_);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(protected_, Optional.empty());
      ((rmE_2)this.throws_[49]).class_(super_, false);
      ((rmE_2)this.throws_[49]).class_(this_, false);
   }
}
