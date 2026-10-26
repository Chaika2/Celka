package celestial;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public abstract class rOD extends rbZ_2 implements aD_2, aK_2, rXm_1 {
   private static final Predicate<iB_2> try_ = var0 -> var0 instanceof rOD && ((rOD)var0).sA();
   private static final ay_3 instanceof_ = new ay_3().class_(16.0).class_().break_().byte_().class_(try_);
   private static final rkg_3 throw_ = rkg_3.class_(rdy_3.hB, rdy_3.XY, xu_3.Ey.case_(), rdy_3.Ob, rdy_3.dO, rdy_3.hy, rdy_3.hp);
   private static final rut_3<Byte> interface_ = rmE_2.class_(rOD.class, ruw_3.class_);
   private static final rut_3<Optional<UUID>> char_ = rmE_2.class_(rOD.class, ruw_3.package_);
   private int abstract_;
   private int long_;
   private int float_;
   public int super_;
   public int this_;
   protected boolean else_;
   protected rXA synchronized_;
   protected int return_;
   protected float public_;
   private boolean void_;
   private float static_;
   private float import_;
   private float short_;
   private float default_;
   private float const_;
   private float strictfp_;
   protected boolean goto_ = true;
   protected int while_;

   @Override
   public int char_() {
      return 400;
   }

   public float char_(float var1) {
      return rfU_2.catch_(var1, this.strictfp_, this.const_);
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      if (((Random)this.throws_[40]).nextInt(3) == 0) {
         this.sc();
      }

      return null;
   }

   @Override
   protected void byte_(float var1) {
      if (var1 > 6.0F && this.sF()) {
         this.public_(false);
      }
   }

   @Override
   public boolean byte_() {
      return this.else_(4);
   }

   protected boolean byte_(rhd_3 var1, rdn_3 var2) {
      boolean var3 = false;
      float var4 = 0.0F;
      short var5 = 0;
      byte var6 = 0;
      rdb_3 var7 = var2.break_();
      if (var7 == rdy_3.hB) {
         var4 = 2.0F;
         var5 = 20;
         var6 = 3;
      } else if (var7 == rdy_3.XY) {
         var4 = 1.0F;
         var5 = 30;
         var6 = 3;
      } else if (var7 == xu_3.Ey.case_()) {
         var4 = 20.0F;
         var5 = 180;
      } else if (var7 == rdy_3.Ob) {
         var4 = 3.0F;
         var5 = 60;
         var6 = 3;
      } else if (var7 == rdy_3.dO) {
         var4 = 4.0F;
         var5 = 60;
         var6 = 5;
         if (!((rYB)this.throws_[7]).continue_ && this.sm() && this.O_() == 0 && !this.sQ()) {
            var3 = true;
            this.throws_(var1);
         }
      } else if (var7 == rdy_3.hy || var7 == rdy_3.hp) {
         var4 = 10.0F;
         var5 = 240;
         var6 = 10;
         if (!((rYB)this.throws_[7]).continue_ && this.sm() && this.O_() == 0 && !this.sQ()) {
            var3 = true;
            this.throws_(var1);
         }
      }

      if (this.Ss() < this.SK() && var4 > 0.0F) {
         this.protected_(var4);
         var3 = true;
      }

      if (this.n_() && var5 > 0) {
         ((rYB)this.throws_[7]).class_(rLQ.char_, this.break_(1.0), this.Ph() + 0.5, this.protected_(1.0), 0.0, 0.0, 0.0);
         if (!((rYB)this.throws_[7]).continue_) {
            this.d_(var5);
         }

         var3 = true;
      }

      if (var6 > 0 && (var3 || !this.sm()) && this.sn() < this.sT()) {
         var3 = true;
         if (!((rYB)this.throws_[7]).continue_) {
            this.return_(var6);
         }
      }

      if (var3) {
         this.n();
      }

      return var3;
   }

   protected rOD(aI_2<? extends rOD> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 1.0F;
      this.throws_[37] = var7;
      this.sC();
   }

   protected rqA_2 sp() {
      this.sc();
      return null;
   }

   @Override
   public void this_() {
      super.this_();
      if (this.long_ > 0 && ++this.long_ > 30) {
         this.long_ = 0;
         this.protected_(64, false);
      }

      if ((this.Po() || this.try_()) && this.float_ > 0 && ++this.float_ > 20) {
         this.float_ = 0;
         this.goto_(false);
      }

      if (this.super_ > 0 && ++this.super_ > 8) {
         this.super_ = 0;
      }

      if (this.this_ > 0) {
         this.this_++;
         if (this.this_ > 300) {
            this.this_ = 0;
         }
      }

      this.import_ = this.static_;
      if (this.sF()) {
         this.static_ = this.static_ + (1.0F - this.static_) * 0.4F + 0.05F;
         if (this.static_ > 1.0F) {
            this.static_ = 1.0F;
         }
      } else {
         this.static_ = this.static_ + ((0.0F - this.static_) * 0.4F - 0.05F);
         if (this.static_ < 0.0F) {
            this.static_ = 0.0F;
         }
      }

      this.default_ = this.short_;
      if (this.sL()) {
         this.static_ = 0.0F;
         this.import_ = this.static_;
         this.short_ = this.short_ + (1.0F - this.short_) * 0.4F + 0.05F;
         if (this.short_ > 1.0F) {
            this.short_ = 1.0F;
         }
      } else {
         this.void_ = false;
         this.short_ = this.short_ + ((0.8F * this.short_ * this.short_ * this.short_ - this.short_) * 0.6F - 0.05F);
         if (this.short_ < 0.0F) {
            this.short_ = 0.0F;
         }
      }

      this.strictfp_ = this.const_;
      if (this.else_(64)) {
         this.const_ = this.const_ + (1.0F - this.const_) * 0.7F + 0.05F;
         if (this.const_ > 1.0F) {
            this.const_ = 1.0F;
         }
      } else {
         this.const_ = this.const_ + ((0.0F - this.const_) * 0.7F - 0.05F);
         if (this.const_ < 0.0F) {
            this.const_ = 0.0F;
         }
      }
   }

   protected void sl() {
      if (!((rYB)this.throws_[7]).continue_) {
         this.protected_(4, !this.synchronized_.extends_(0).class_());
      }
   }

   private void n() {
      this.sd();
      if (!this.BF()) {
         rqA_2 var1 = this.sy();
         if (var1 != null) {
            ((rYB)this.throws_[7])
               .class_(
                  (rhd_3)null,
                  this.rx(),
                  this.re(),
                  this.BO(),
                  var1,
                  this.Pr(),
                  1.0F,
                  1.0F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F
               );
         }
      }
   }

   public float interface_(float var1) {
      return rfU_2.catch_(var1, this.default_, this.short_);
   }

   protected void class_(zr_3 var1) {
      this.class_(rqn_3.EB, var1.class_() * 0.15F, var1.break_());
   }

   @Override
   public au_3 class_(rrEm_1 var1, au_3 var2) {
      return null;
   }

   protected void class_(au_3 var1, rOD var2) {
      double var3 = this.break_(iQ_2.class_) + var1.break_(iQ_2.class_) + (double)this.sV();
      var2.byte_(iQ_2.class_).class_(var3 / 3.0);
      double var5 = this.break_(iQ_2.volatile_) + var1.break_(iQ_2.volatile_) + this.sg();
      var2.byte_(iQ_2.volatile_).class_(var5 / 3.0);
      double var7 = this.break_(iQ_2.protected_) + var1.break_(iQ_2.protected_) + this.sR();
      var2.byte_(iQ_2.protected_).class_(var7 / 3.0);
   }

   @Override
   public boolean class_(float var1, float var2) {
      if (var1 > 1.0F) {
         this.class_(rqn_3.EE, 0.4F, 1.0F);
      }

      int var3 = this.implements_(var1, var2);
      if (var3 <= 0) {
         return false;
      } else {
         this.break_(rye_3.extends_, (float)var3);
         if (this.BP()) {
            for (an_3 var5 : this.PP()) {
               var5.break_(rye_3.extends_, (float)var3);
            }
         }

         this.sM();
         return true;
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("EatingHaystack", this.sF());
      var1.class_("Bred", this.sA());
      var1.break_("Temper", this.sn());
      var1.class_("Tame", this.sm());
      if (this.sZ() != null) {
         var1.class_("Owner", this.sZ());
      }

      if (!this.synchronized_.extends_(0).class_()) {
         var1.class_("SaddleItem", this.synchronized_.extends_(0).break_(new rcd_3()));
      }
   }

   @Override
   public void class_(rXu_1 var1) {
      boolean var2 = this.byte_();
      this.sl();
      if ((Integer)this.throws_[41] > 20 && !var2 && this.byte_()) {
         this.class_(rqn_3.EG, 0.5F, 1.0F);
      }
   }

   @Override
   public void class_(int var1) {
      if (this.byte_()) {
         if (var1 < 0) {
            var1 = 0;
         } else {
            this.void_ = true;
            this.sc();
         }

         if (var1 >= 90) {
            this.public_ = 1.0F;
         } else {
            this.public_ = 0.4F + 0.4F * (float)var1 / 90.0F;
         }
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var4 == null) {
         var4 = new am_3(0.2F);
      }

      this.L();
      return super.class_(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 7) {
         this.while_(true);
      } else if (var1 == 6) {
         this.while_(false);
      } else {
         super.class_(var1);
      }
   }

   private rjU_2 class_(rjU_2 var1, iB_2 var2) {
      double var3 = this.rx() + var1.break_;
      double var5 = this.rN().break_;
      double var7 = this.BO() + var1.protected_;
      rfw_3 var9 = new rfw_3();
      UnmodifiableIterator var10 = var2.BV().iterator();

      while (var10.hasNext()) {
         iM_2 var11 = (iM_2)var10.next();
         var9.break_(var3, var5, var7);
         double var12 = this.rN().throws_ + 0.75;

         do {
            double var14 = ((rYB)this.throws_[7]).private_(var9);
            if ((double)var9.c_() + var14 > var12) {
               break;
            }

            if (rqI_2.class_(var14)) {
               rfl_3 var16 = var2.catch_(var11);
               rjU_2 var17 = new rjU_2(var3, (double)var9.c_() + var14, var7);
               if (rqI_2.class_((rYB)this.throws_[7], var2, var16.protected_(var17))) {
                  var2.class_(var11);
                  return var17;
               }
            }

            var9.class_(rpr_3.UP);
         } while (!((double)var9.c_() < var12));
      }

      return null;
   }

   @Override
   public boolean class_(int var1, rdn_3 var2) {
      int var3 = var1 - 400;
      if (var3 >= 0 && var3 < 2 && var3 < this.synchronized_.else_()) {
         if (var3 == 0 && var2.break_() != rdy_3.hK) {
            return false;
         } else if (var3 == 1 && (!this.sY() || !this.native_(var2))) {
            return false;
         } else {
            this.synchronized_.break_(var3, var2);
            this.sl();
            return true;
         }
      } else {
         int var4 = var1 - 500 + 2;
         if (var4 >= 2 && var4 < this.synchronized_.else_()) {
            this.synchronized_.break_(var4, var2);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public void class_(rqL_2 var1) {
      this.synchronized_.break_(0, new rdn_3(rdy_3.hK));
      if (var1 != null) {
         ((rYB)this.throws_[7]).class_((rhd_3)null, this, rqn_3.EG, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean class_() {
      return this.BM() && !this.n_() && this.sm();
   }

   @Override
   public boolean class_(rbZ_2 var1) {
      return false;
   }

   public boolean sm() {
      return this.else_(2);
   }

   private void sc() {
      if (this.Po() || this.try_()) {
         this.float_ = 1;
         this.goto_(true);
      }
   }

   @Override
   public void default_() {
      if (((Random)this.throws_[40]).nextInt(200) == 0) {
         this.sJ();
      }

      super.default_();
      if (!((rYB)this.throws_[7]).continue_ && this.BM()) {
         if (((Random)this.throws_[40]).nextInt(900) == 0 && (Integer)this.private_[13] == 0) {
            this.protected_(1.0F);
         }

         if (this.sw()) {
            if (!this.sF()
               && !this.BP()
               && ((Random)this.throws_[40]).nextInt(300) == 0
               && ((rYB)this.throws_[7]).byte_(this.Bs().break_()).class_(xu_3.implements_)) {
               this.public_(true);
            }

            if (this.sF() && ++this.abstract_ > 50) {
               this.abstract_ = 0;
               this.public_(false);
            }
         }

         this.st();
      }
   }

   private void sd() {
      if (!((rYB)this.throws_[7]).continue_) {
         this.long_ = 1;
         this.protected_(64, true);
      }
   }

   protected boolean sj() {
      return !this.BP() && !this.Pm() && this.sm() && !this.n_() && this.Ss() >= this.SK() && this.sQ();
   }

   public boolean sw() {
      return true;
   }

   protected void sf() {
      this.class_(rqn_3.Es, 0.4F, 1.0F);
   }

   @Override
   public void break_(int var1) {
      this.void_ = true;
      this.sc();
      this.sf();
   }

   public ryZ_2 break_(rhd_3 var1, rdn_3 var2) {
      boolean var3 = this.byte_(var1, var2);
      if (!((rhx_3)var1.implements_[18]).protected_) {
         var2.catch_(1);
      }

      if (((rYB)this.throws_[7]).continue_) {
         return ryZ_2.CONSUME;
      } else {
         return var3 ? ryZ_2.SUCCESS : ryZ_2.PASS;
      }
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return var2.break_ * 0.95F;
   }

   public void break_(UUID var1) {
      ((rmE_2)this.throws_[49]).break_(char_, Optional.ofNullable(var1));
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.public_(var1.new_("EatingHaystack"));
      this.return_(var1.new_("Bred"));
      this.synchronized_(var1.private_("Temper"));
      this.else_(var1.new_("Tame"));
      UUID var2;
      if (var1.break_("Owner")) {
         var2 = var1.class_("Owner");
      } else {
         String var3 = var1.native_("Owner");
         var2 = rCE.class_(this.rC(), var3);
      }

      if (var2 != null) {
         this.break_(var2);
      }

      if (var1.byte_("SaddleItem", 10)) {
         rdn_3 var4 = rdn_3.class_(var1.int_("SaddleItem"));
         if (var4.break_() == rdy_3.hK) {
            this.synchronized_.break_(0, var4);
         }
      }

      this.sl();
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      if (!var2.byte_().class_()) {
         xc_3 var3 = ((rYB)this.throws_[7]).byte_(var1.final_());
         zr_3 var4 = var2.package_();
         if (var3.class_(xu_3.Pq)) {
            var4 = var3.package_();
         }

         if (this.BP() && this.goto_) {
            this.while_++;
            if (this.while_ > 5 && this.while_ % 3 == 0) {
               this.class_(var4);
            } else if (this.while_ <= 5) {
               this.class_(rqn_3.EM, var4.class_() * 0.15F, var4.break_());
            }
         } else if (var4 == zr_3.class_) {
            this.class_(rqn_3.EM, var4.class_() * 0.15F, var4.break_());
         } else {
            this.class_(rqn_3.Eb, var4.class_() * 0.15F, var4.break_());
         }
      }
   }

   @Override
   public boolean throws_() {
      return this.byte_();
   }

   @Override
   protected void L() {
   }

   protected int sx() {
      return 2;
   }

   public boolean so() {
      return !this.class_(rXQ.CHEST).class_();
   }

   public boolean sv() {
      return this.else_;
   }

   protected void catch_(rhd_3 var1) {
      this.public_(false);
      this.goto_(false);
      if (!((rYB)this.throws_[7]).continue_) {
         Float var6 = (Float)this.throws_[15];
         var1.throws_[15] = var6;
         Float var7 = (Float)this.throws_[16];
         var1.throws_[16] = var7;
         var1.this_(this);
      }
   }

   @Override
   public void catch_(an_3 var1) {
      super.catch_(var1);
      if (var1 instanceof is_3 var2) {
         Float var10 = (Float)var2.private_[23];
         this.private_[23] = var10;
      }

      if (this.default_ > 0.0F) {
         float var12 = rfU_2.class_((Float)this.private_[23] * (float) (Math.PI / 180.0));
         float var3 = rfU_2.break_((Float)this.private_[23] * (float) (Math.PI / 180.0));
         float var4 = 0.7F * this.default_;
         float var5 = 0.15F * this.default_;
         var1.new_(this.rx() + (double)(var4 * var12), this.re() + this.PS() + var1.Pv() + (double)var5, this.BO() - (double)(var4 * var3));
         if (var1 instanceof iB_2 var10000) {
            Float var11 = (Float)this.private_[23];
            var10000.private_[23] = var11;
         }
      }
   }

   @Override
   public boolean G() {
      return this.rU() instanceof iB_2;
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return throw_.class_(var1);
   }

   public void goto_(boolean var1) {
      if (var1) {
         this.public_(false);
      }

      this.protected_(32, var1);
   }

   @Override
   public void case_() {
   }

   public void case_(rhd_3 var1) {
      if (!((rYB)this.throws_[7]).continue_ && (!this.BP() || this.synchronized_(var1)) && this.sm()) {
         var1.class_(this, this.synchronized_);
      }
   }

   public void else_(boolean var1) {
      this.protected_(2, var1);
   }

   protected boolean else_(int var1) {
      return (((rmE_2)this.throws_[49]).class_(interface_) & var1) != 0;
   }

   @Override
   protected int implements_(float var1, float var2) {
      return rfU_2.case_((var1 * 0.5F - 3.0F) * var2);
   }

   public int return_(int var1) {
      int var2 = rfU_2.class_(this.sn() + var1, 0, this.sT());
      this.synchronized_(var2);
      return var2;
   }

   public void return_(boolean var1) {
      this.protected_(8, var1);
   }

   public float throw_(float var1) {
      return rfU_2.catch_(var1, this.import_, this.static_);
   }

   protected void while_(boolean var1) {
      rLO var2 = var1 ? rLQ.long_ : rLQ.double_;

      for (int var3 = 0; var3 < 7; var3++) {
         double var4 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         double var6 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         double var8 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         ((rYB)this.throws_[7]).class_(var2, this.break_(1.0), this.Ph() + 0.5, this.protected_(1.0), var4, var6, var8);
      }
   }

   @Override
   protected rqA_2 static_() {
      if (((Random)this.throws_[40]).nextInt(10) == 0 && !this.BK()) {
         this.sc();
      }

      return null;
   }

   public void public_(boolean var1) {
      this.protected_(16, var1);
   }

   protected void protected_(int var1, boolean var2) {
      byte var3 = ((rmE_2)this.throws_[49]).class_(interface_);
      if (var2) {
         ((rmE_2)this.throws_[49]).break_(interface_, (byte)(var3 | var1));
      } else {
         ((rmE_2)this.throws_[49]).break_(interface_, (byte)(var3 & ~var1));
      }
   }

   @Override
   public void private_(rjU_2 var1) {
      if (this.BM()) {
         if (this.BP() && this.G() && this.byte_()) {
            iB_2 var2 = (iB_2)this.rU();
            Float var16 = var2.sO();
            this.throws_[15] = var16;
            Float var17 = (Float)this.throws_[15];
            this.throws_[17] = var17;
            Float var18 = var2.Bo() * 0.5F;
            this.throws_[16] = var18;
            this.case_((Float)this.throws_[15], (Float)this.throws_[16]);
            Float var19 = (Float)this.throws_[15];
            this.private_[23] = var19;
            Float var20 = (Float)this.private_[23];
            this.private_[25] = var20;
            float var3 = (Float)var2.private_[42] * 0.5F;
            float var4 = (Float)var2.private_[44];
            if (var4 <= 0.0F) {
               var4 *= 0.25F;
               this.while_ = 0;
            }

            if ((Boolean)this.throws_[20] && this.public_ == 0.0F && this.sL() && !this.void_) {
               var3 = 0.0F;
               var4 = 0.0F;
            }

            if (this.public_ > 0.0F && !this.sv() && (Boolean)this.throws_[20]) {
               double var5 = this.sH() * (double)this.public_ * (double)this.rl();
               double var7;
               if (this.break_(rLD.private_)) {
                  var7 = var5 + (double)((float)(this.byte_(rLD.private_).byte_() + 1) * 0.1F);
               } else {
                  var7 = var5;
               }

               rjU_2 var9 = this.rv();
               this.catch_(var9.break_, var7, var9.protected_);
               this.synchronized_(true);
               Boolean var21 = true;
               this.throws_[57] = var21;
               if (var4 > 0.0F) {
                  float var10 = rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0));
                  float var11 = rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0));
                  this.byte_(this.rv().break_((double)(-0.4F * var10 * this.public_), 0.0, (double)(0.4F * var11 * this.public_)));
               }

               this.public_ = 0.0F;
            }

            Float var22 = this.sB() * 0.1F;
            this.private_[29] = var22;
            if (this.Po()) {
               this.super_((float)this.class_(iQ_2.protected_));
               super.private_(new rjU_2((double)var3, var1.byte_, (double)var4));
            } else if (var2 instanceof rhd_3) {
               this.byte_(rjU_2.class_);
            }

            if ((Boolean)this.throws_[20]) {
               this.public_ = 0.0F;
               this.synchronized_(false);
            }

            this.class_(this, false);
         } else {
            Float var23 = 0.02F;
            this.private_[29] = var23;
            super.private_(var1);
         }
      }
   }

   public boolean private_(rhd_3 var1) {
      this.break_(var1.ro());
      this.else_(true);
      if (var1 instanceof rhN_2) {
         Oo_1.public_.class_((rhN_2)var1, this);
      }

      ((rYB)this.throws_[7]).class_(this, (byte)7);
      return true;
   }

   @Override
   protected void final_() {
      this.package_.class_(1, new rBY(this, 1.2));
      this.package_.class_(1, new rSs_1(this, 1.2));
      this.package_.class_(2, new rBP(this, 1.0, rOD.class));
      this.package_.class_(4, new rBx_1(this, 1.0));
      this.package_.class_(6, new rSk_1(this, 0.7));
      this.package_.class_(7, new rBA(this, rhd_3.class, 6.0F));
      this.package_.class_(8, new rBC(this));
      this.su();
   }

   public void synchronized_(int var1) {
      this.return_ = var1;
   }

   public void synchronized_(boolean var1) {
      this.else_ = var1;
   }

   public boolean native_(rdn_3 var1) {
      return false;
   }

   protected void st() {
      if (this.sA() && this.n_() && !this.sF()) {
         iB_2 var1 = ((rYB)this.throws_[7]).class_(rOD.class, instanceof_, this, this.rx(), this.re(), this.BO(), this.rN().class_(16.0));
         if (var1 != null && this.int_(var1) > 4.0) {
            this.final_.class_(var1, 0);
         }
      }
   }

   @Override
   public int E() {
      return 6;
   }

   public int sn() {
      return this.return_;
   }

   public static iz_3 sq() {
      return is_3.package_().class_(iQ_2.volatile_).class_(iQ_2.class_, 53.0).class_(iQ_2.protected_, 0.225F);
   }

   @Override
   public boolean rG() {
      return !this.BP();
   }

   @Override
   public an_3 rU() {
      return this.Bh().isEmpty() ? null : this.Bh().get(0);
   }

   @Override
   protected boolean BK() {
      return super.BK() && this.BP() && this.byte_() || this.sF() || this.sL();
   }

   @Override
   protected rqA_2 Bt() {
      return null;
   }

   private void sJ() {
      this.super_ = 1;
   }

   protected rqA_2 sy() {
      return null;
   }

   public boolean sL() {
      return this.else_(32);
   }

   public double sH() {
      return this.class_(iQ_2.volatile_);
   }

   public int sT() {
      return 100;
   }

   public void sI() {
      if (!this.sL()) {
         this.sc();
         rqA_2 var1 = this.sp();
         if (var1 != null) {
            this.class_(var1, this.Si(), this.SN());
         }
      }
   }

   @Override
   protected void Sx() {
      super.Sx();
      if (this.synchronized_ != null) {
         for (int var1 = 0; var1 < this.synchronized_.else_(); var1++) {
            rdn_3 var2 = this.synchronized_.extends_(var1);
            if (!var2.class_() && !eA_2.throws_(var2)) {
               this.a_(var2);
            }
         }
      }
   }

   protected float sV() {
      return 15.0F + (float)((Random)this.throws_[40]).nextInt(8) + (float)((Random)this.throws_[40]).nextInt(9);
   }

   protected void su() {
      this.package_.class_(0, new rSb_1(this));
   }

   @Override
   protected float Si() {
      return 0.8F;
   }

   public UUID sZ() {
      return ((rmE_2)this.throws_[49]).class_(char_).orElse((UUID)null);
   }

   public boolean sF() {
      return this.else_(16);
   }

   public boolean sA() {
      return this.else_(8);
   }

   protected void sC() {
      rXA var1 = this.synchronized_;
      this.synchronized_ = new rXA(this.sx());
      if (var1 != null) {
         var1.break_(this);
         int var2 = Math.min(var1.else_(), this.synchronized_.else_());

         for (int var3 = 0; var3 < var2; var3++) {
            rdn_3 var4 = var1.extends_(var3);
            if (!var4.class_()) {
               this.synchronized_.break_(var3, var4.implements_());
            }
         }
      }

      this.synchronized_.class_(this);
      this.sl();
   }

   protected double sg() {
      return 0.4F
         + ((Random)this.throws_[40]).nextDouble() * 0.2
         + ((Random)this.throws_[40]).nextDouble() * 0.2
         + ((Random)this.throws_[40]).nextDouble() * 0.2;
   }

   protected double sR() {
      return (
            0.45F
               + ((Random)this.throws_[40]).nextDouble() * 0.3
               + ((Random)this.throws_[40]).nextDouble() * 0.3
               + ((Random)this.throws_[40]).nextDouble() * 0.3
         )
         * 0.25;
   }

   public boolean sY() {
      return false;
   }

   @Override
   public rjU_2 a_(iB_2 var1) {
      rjU_2 var2 = class_((double)this.PN(), (double)var1.PN(), (Float)this.throws_[15] + (var1.Su() == rpZ_2.RIGHT ? 90.0F : -90.0F));
      rjU_2 var3 = this.class_(var2, var1);
      if (var3 != null) {
         return var3;
      } else {
         rjU_2 var4 = class_((double)this.PN(), (double)var1.PN(), (Float)this.throws_[15] + (var1.Su() == rpZ_2.LEFT ? 90.0F : -90.0F));
         rjU_2 var5 = this.class_(var4, var1);
         return var5 != null ? var5 : this.Ps();
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(interface_, (byte)0);
      ((rmE_2)this.throws_[49]).class_(char_, Optional.empty());
   }

   @Override
   public boolean o_() {
      return false;
   }
}
