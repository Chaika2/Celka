package celestial;

import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.Random;

public class rSK extends an_3 {
   private static final rut_3<Integer> class_ = rmE_2.class_(rSK.class, ruw_3.break_);
   private static final rut_3<Integer> break_ = rmE_2.class_(rSK.class, ruw_3.break_);
   private static final rut_3<Float> protected_ = rmE_2.class_(rSK.class, ruw_3.byte_);
   private static final rut_3<Integer> catch_ = rmE_2.class_(rSK.class, ruw_3.break_);
   private static final rut_3<Boolean> private_ = rmE_2.class_(rSK.class, ruw_3.implements_);
   private static final rut_3<Boolean> implements_ = rmE_2.class_(rSK.class, ruw_3.implements_);
   private static final rut_3<Integer> finally_ = rmE_2.class_(rSK.class, ruw_3.break_);
   private final float[] extends_ = new float[2];
   private float native_;
   private float volatile_;
   private float final_;
   private int package_;
   private double int_;
   private double new_;
   private double continue_;
   private double super_;
   private double this_;
   private boolean else_;
   private boolean synchronized_;
   private boolean return_;
   private boolean public_;
   private double goto_;
   private float while_;
   private rSU try_;
   private rSU instanceof_;
   private double throw_;
   private boolean interface_;
   private boolean char_;
   private float abstract_;
   private float long_;
   private float float_;

   @Override
   public void byte_(an_3 var1) {
      if (var1 instanceof rSK) {
         if (var1.rN().break_ < this.rN().throws_) {
            super.byte_(var1);
         }
      } else if (var1.rN().break_ <= this.rN().break_) {
         super.byte_(var1);
      }
   }

   public void byte_(int var1) {
      ((rmE_2)this.throws_[49]).break_(break_, var1);
   }

   public void byte_(float var1) {
      ((rmE_2)this.throws_[49]).break_(protected_, var1);
   }

   private void int_() {
      if (((rYB)this.throws_[7]).continue_) {
         int var1 = this.goto_();
         if (var1 > 0) {
            this.abstract_ += 0.05F;
         } else {
            this.abstract_ -= 0.1F;
         }

         this.abstract_ = rfU_2.class_(this.abstract_, 0.0F, 1.0F);
         this.float_ = this.long_;
         this.long_ = 10.0F * (float)Math.sin((double)(0.5F * (float)((rYB)this.throws_[7]).r())) * this.abstract_;
      } else {
         if (!this.interface_) {
            this.extends_(0);
         }

         int var4 = this.goto_();
         if (var4 > 0) {
            this.extends_(--var4);
            int var2 = 60 - var4 - 1;
            if (var2 > 0 && var4 == 0) {
               this.extends_(0);
               rjU_2 var3 = this.rv();
               if (this.char_) {
                  this.byte_(var3.break_(0.0, -0.7, 0.0));
                  this.Bn();
               } else {
                  this.catch_(var3.break_, this.class_(rhd_3.class) ? 2.7 : 0.6, var3.protected_);
               }
            }

            this.interface_ = false;
         }
      }
   }

   public rSK(aI_2<? extends rSK> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.throws_[2] = var7;
   }

   public rSK(rYB var1, double var2, double var4, double var6) {
      this(aI_2.catch_, var1);
      this.new_(var2, var4, var6);
      this.byte_(rjU_2.class_);
      Double var12 = var2;
      this.throws_[8] = var12;
      Double var13 = var4;
      this.throws_[9] = var13;
      Double var14 = var6;
      this.throws_[10] = var14;
   }

   @Override
   public void this_() {
      this.instanceof_ = this.try_;
      this.try_ = this.continue_();
      if (this.try_ != rSU.UNDER_WATER && this.try_ != rSU.UNDER_FLOWING_WATER) {
         this.volatile_ = 0.0F;
      } else {
         this.volatile_++;
      }

      if (!((rYB)this.throws_[7]).continue_ && this.volatile_ >= 60.0F) {
         this.Bn();
      }

      if (this.implements_() > 0) {
         this.break_(this.implements_() - 1);
      }

      if (this.private_() > 0.0F) {
         this.byte_(this.private_() - 1.0F);
      }

      super.this_();
      this.new_();
      if (this.Po()) {
         if (this.Bh().isEmpty() || !(this.Bh().get(0) instanceof rhd_3)) {
            this.class_(false, false);
         }

         this.return_();
         if (((rYB)this.throws_[7]).continue_) {
            this.public_();
            ((rYB)this.throws_[7]).class_(new rZF(this.class_(0), this.class_(1)));
         }

         this.class_(iG_2.SELF, this.rv());
      } else {
         this.byte_(rjU_2.class_);
      }

      this.int_();

      for (int var1 = 0; var1 <= 1; var1++) {
         if (this.class_(var1)) {
            if (!this.BF()
               && (double)(this.extends_[var1] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && ((double)this.extends_[var1] + (float) (Math.PI / 8)) % (float) (Math.PI * 2) >= (float) (Math.PI / 4)) {
               rqA_2 var2 = this.throws_();
               if (var2 != null) {
                  rjU_2 var3 = this.break_(1.0F);
                  double var4 = var1 == 1 ? -var3.protected_ : var3.protected_;
                  double var6 = var1 == 1 ? var3.break_ : -var3.break_;
                  ((rYB)this.throws_[7])
                     .class_(
                        (rhd_3)null, this.rx() + var4, this.re(), this.BO() + var6, var2, this.Pr(), 1.0F, 0.8F + 0.4F * ((Random)this.throws_[40]).nextFloat()
                     );
               }
            }

            this.extends_[var1] = (float)((double)this.extends_[var1] + (float) (Math.PI / 8));
         } else {
            this.extends_[var1] = 0.0F;
         }
      }

      this.Px();
      List var8 = ((rYB)this.throws_[7]).break_(this, this.rN().byte_(0.2F, -0.01F, 0.2F), rpJ_2.class_(this));
      if (!var8.isEmpty()) {
         boolean var9 = !((rYB)this.throws_[7]).continue_ && !(this.rU() instanceof rhd_3);

         for (int var10 = 0; var10 < var8.size(); var10++) {
            an_3 var11 = (an_3)var8.get(var10);
            if (!var11.synchronized_(this)) {
               if (var9
                  && this.Bh().size() < 2
                  && !var11.Pm()
                  && var11.PN() < this.PN()
                  && var11 instanceof iB_2
                  && !(var11 instanceof rOl_1)
                  && !(var11 instanceof rhd_3)) {
                  var11.this_(this);
               } else {
                  this.byte_(var11);
               }
            }
         }
      }
   }

   @Override
   public void class_(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.int_ = var1;
      this.new_ = var3;
      this.continue_ = var5;
      this.super_ = (double)var7;
      this.this_ = (double)var8;
      this.package_ = 10;
   }

   @Override
   protected void class_(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
      this.throw_ = this.rv().byte_;
      if (!this.Pm()) {
         if (var3) {
            if ((Float)this.throws_[31] > 3.0F) {
               if (this.try_ != rSU.ON_LAND) {
                  Float var11 = 0.0F;
                  this.throws_[31] = var11;
                  return;
               }

               this.class_((Float)this.throws_[31], 1.0F);
               if (!((rYB)this.throws_[7]).continue_ && !(Boolean)this.throws_[27]) {
                  this.PD();
                  if (((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
                     for (int var6 = 0; var6 < 3; var6++) {
                        this.class_(this.package_().break_());
                     }

                     for (int var14 = 0; var14 < 2; var14++) {
                        this.class_(rdy_3.OD);
                     }
                  }
               }
            }

            Float var12 = 0.0F;
            this.throws_[31] = var12;
         } else if (!((rYB)this.throws_[7]).break_(this.Bs().break_()).class_(rlG_2.break_) && var1 < 0.0) {
            Float var13 = (float)((double)((Float)this.throws_[31]).floatValue() - var1);
            this.throws_[31] = var13;
         }
      }
   }

   public void class_(rSe_1 var1) {
      ((rmE_2)this.throws_[49]).break_(catch_, var1.ordinal());
   }

   @Override
   protected float class_(iM_2 var1, ap_3 var2) {
      return var2.break_;
   }

   public float class_(int var1, float var2) {
      return this.class_(var1) ? (float)rfU_2.break_((double)this.extends_[var1] - (float) (Math.PI / 8), (double)this.extends_[var1], (double)var2) : 0.0F;
   }

   public void class_(boolean var1, boolean var2) {
      ((rmE_2)this.throws_[49]).break_(private_, var1);
      ((rmE_2)this.throws_[49]).break_(implements_, var2);
   }

   public boolean class_(int var1) {
      return ((rmE_2)this.throws_[49]).class_(var1 == 0 ? private_ : implements_) && this.rU() != null;
   }

   public void class_(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.else_ = var1;
      this.synchronized_ = var2;
      this.return_ = var3;
      this.public_ = var4;
   }

   @Override
   protected rjU_2 class_(rpB_2 var1, rqT_2 var2) {
      return iB_2.implements_(super.class_(var1, var2));
   }

   @Override
   protected void class_(rcd_3 var1) {
      var1.class_("Type", this.package_().class_());
   }

   protected void class_(an_3 var1) {
      var1.native_((Float)this.throws_[15]);
      float var2 = rfU_2.catch_((Float)var1.throws_[15] - (Float)this.throws_[15]);
      float var3 = rfU_2.class_(var2, -105.0F, 105.0F);
      Float var8 = (Float)var1.throws_[17] + (var3 - var2);
      var1.throws_[17] = var8;
      Float var9 = (Float)var1.throws_[15] + (var3 - var2);
      var1.throws_[15] = var9;
      var1.implements_((Float)var1.throws_[15]);
   }

   @Override
   public ryZ_2 class_(rhd_3 var1, rpm_3 var2) {
      if (var1.sN()) {
         return ryZ_2.PASS;
      } else if (this.volatile_ < 60.0F) {
         if (!((rYB)this.throws_[7]).continue_) {
            return var1.this_(this) ? ryZ_2.CONSUME : ryZ_2.PASS;
         } else {
            return ryZ_2.SUCCESS;
         }
      } else {
         return ryZ_2.PASS;
      }
   }

   public static boolean class_(an_3 var0, an_3 var1) {
      return (var1.PU() || var1.rG()) && !var0.return_(var1);
   }

   @Override
   protected void break_(rcd_3 var1) {
      if (var1.byte_("Type", 8)) {
         this.class_(rSe_1.class_(var1.native_("Type")));
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else if (!((rYB)this.throws_[7]).continue_ && !(Boolean)this.throws_[27]) {
         this.byte_(-this.final_());
         this.break_(10);
         this.byte_(this.private_() + var2 * 10.0F);
         this.rf();
         boolean var3 = var1.extends_() instanceof rhd_3 && ((rhx_3)((rhd_3)var1.extends_()).implements_[18]).protected_;
         if (var3 || this.private_() > 40.0F) {
            if (!var3 && ((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
               this.class_(this.protected_());
            }

            this.PD();
         }

         return true;
      } else {
         return true;
      }
   }

   public void break_(int var1) {
      ((rmE_2)this.throws_[49]).break_(class_, var1);
   }

   protected rqA_2 throws_() {
      switch (this.continue_()) {
         case IN_WATER:
         case UNDER_WATER:
         case UNDER_FLOWING_WATER:
            return rqn_3.e;
         case ON_LAND:
            return rqn_3.U;
         case IN_AIR:
         default:
            return null;
      }
   }

   @Override
   public boolean W() {
      return this.try_ == rSU.UNDER_WATER || this.try_ == rSU.UNDER_FLOWING_WATER;
   }

   @Override
   public void catch_(an_3 var1) {
      if (this.synchronized_(var1)) {
         float var2 = 0.0F;
         float var3 = (float)((this.throws_[27] ? 0.01F : this.PS()) + var1.Pv());
         if (this.Bh().size() > 1) {
            int var4 = this.Bh().indexOf(var1);
            if (var4 == 0) {
               var2 = 0.2F;
            } else {
               var2 = -0.6F;
            }

            if (var1 instanceof rbZ_2) {
               var2 = (float)((double)var2 + 0.2);
            }
         }

         rjU_2 var11 = new rjU_2((double)var2, 0.0, 0.0).break_(-(Float)this.throws_[15] * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
         var1.new_(this.rx() + var11.break_, this.re() + (double)var3, this.BO() + var11.protected_);
         Float var10 = (Float)var1.throws_[15] + this.final_;
         var1.throws_[15] = var10;
         var1.implements_(var1.t() + this.final_);
         this.class_(var1);
         if (var1 instanceof rbZ_2 && this.Bh().size() > 1) {
            int var5 = var1.V() % 2 == 0 ? 90 : 270;
            var1.native_((Float)((rbZ_2)var1).private_[23] + (float)var5);
            var1.implements_(var1.t() + (float)var5);
         }
      }
   }

   public float catch_() {
      rfl_3 var1 = this.rN();
      rfl_3 var2 = new rfl_3(var1.class_, var1.break_ - 0.001, var1.byte_, var1.protected_, var1.break_, var1.case_);
      int var3 = rfU_2.byte_(var2.class_) - 1;
      int var4 = rfU_2.throws_(var2.protected_) + 1;
      int var5 = rfU_2.byte_(var2.break_) - 1;
      int var6 = rfU_2.throws_(var2.throws_) + 1;
      int var7 = rfU_2.byte_(var2.byte_) - 1;
      int var8 = rfU_2.throws_(var2.case_) + 1;
      rjC_2 var9 = rjw_3.class_(var2);
      float var10 = 0.0F;
      int var11 = 0;
      rfw_3 var12 = new rfw_3();

      for (int var13 = var3; var13 < var4; var13++) {
         for (int var14 = var7; var14 < var8; var14++) {
            int var15 = (var13 != var3 && var13 != var4 - 1 ? 0 : 1) + (var14 != var7 && var14 != var8 - 1 ? 0 : 1);
            if (var15 != 2) {
               for (int var16 = var5; var16 < var6; var16++) {
                  if (var15 <= 0 || var16 != var5 && var16 != var6 - 1) {
                     var12.class_(var13, var16, var14);
                     xc_3 var17 = ((rYB)this.throws_[7]).byte_(var12);
                     if (!(var17.break_() instanceof kn_3)
                        && rjw_3.byte_(var17.extends_((rYB)this.throws_[7], var12).class_((double)var13, (double)var16, (double)var14), var9, rjN_2.implements_)
                        )
                      {
                        var10 += var17.break_().final_();
                        var11++;
                     }
                  }
               }
            }
         }
      }

      return var10 / (float)var11;
   }

   private void extends_(int var1) {
      ((rmE_2)this.throws_[49]).break_(finally_, var1);
   }

   private int goto_() {
      return ((rmE_2)this.throws_[49]).class_(finally_);
   }

   @Override
   protected boolean case_(an_3 var1) {
      return this.Bh().size() < 2 && !this.class_(rlG_2.break_);
   }

   public float case_() {
      rfl_3 var1 = this.rN();
      int var2 = rfU_2.byte_(var1.class_);
      int var3 = rfU_2.throws_(var1.protected_);
      int var4 = rfU_2.byte_(var1.throws_);
      int var5 = rfU_2.throws_(var1.throws_ - this.throw_);
      int var6 = rfU_2.byte_(var1.byte_);
      int var7 = rfU_2.throws_(var1.case_);
      rfw_3 var8 = new rfw_3();

      label39:
      for (int var9 = var4; var9 < var5; var9++) {
         float var10 = 0.0F;

         for (int var11 = var2; var11 < var3; var11++) {
            for (int var12 = var6; var12 < var7; var12++) {
               var8.class_(var11, var9, var12);
               rXE var13 = ((rYB)this.throws_[7]).break_(var8);
               if (var13.class_(rlG_2.break_)) {
                  var10 = Math.max(var10, var13.class_((rRq_1)((rYB)this.throws_[7]), var8));
               }

               if (var10 >= 1.0F) {
                  continue label39;
               }
            }
         }

         if (var10 < 1.0F) {
            return (float)var8.c_() + var10;
         }
      }

      return (float)(var5 + 1);
   }

   private rSU continue_() {
      rSU var1 = this.else_();
      if (var1 != null) {
         this.goto_ = this.rN().throws_;
         return var1;
      } else if (this.super_()) {
         return rSU.IN_WATER;
      } else {
         float var2 = this.catch_();
         if (var2 > 0.0F) {
            this.while_ = var2;
            return rSU.ON_LAND;
         } else {
            return rSU.IN_AIR;
         }
      }
   }

   private rSU else_() {
      rfl_3 var1 = this.rN();
      double var2 = var1.throws_ + 0.001;
      int var4 = rfU_2.byte_(var1.class_);
      int var5 = rfU_2.throws_(var1.protected_);
      int var6 = rfU_2.byte_(var1.throws_);
      int var7 = rfU_2.throws_(var2);
      int var8 = rfU_2.byte_(var1.byte_);
      int var9 = rfU_2.throws_(var1.case_);
      boolean var10 = false;
      rfw_3 var11 = new rfw_3();

      for (int var12 = var4; var12 < var5; var12++) {
         for (int var13 = var6; var13 < var7; var13++) {
            for (int var14 = var8; var14 < var9; var14++) {
               var11.class_(var12, var13, var14);
               rXE var15 = ((rYB)this.throws_[7]).break_(var11);
               if (var15.class_(rlG_2.break_) && var2 < (double)((float)var11.c_() + var15.class_((rRq_1)((rYB)this.throws_[7]), var11))) {
                  if (!var15.break_()) {
                     return rSU.UNDER_FLOWING_WATER;
                  }

                  var10 = true;
               }
            }
         }
      }

      return var10 ? rSU.UNDER_WATER : null;
   }

   public int implements_() {
      return ((rmE_2)this.throws_[49]).class_(class_);
   }

   private void new_() {
      if (this.Po()) {
         this.package_ = 0;
         this.byte_(this.rx(), this.re(), this.BO());
      }

      if (this.package_ > 0) {
         double var1 = this.rx() + (this.int_ - this.rx()) / (double)this.package_;
         double var3 = this.re() + (this.new_ - this.re()) / (double)this.package_;
         double var5 = this.BO() + (this.continue_ - this.BO()) / (double)this.package_;
         double var7 = rfU_2.case_(this.super_ - (double)((Float)this.throws_[15]).floatValue());
         Float var13 = (float)((double)((Float)this.throws_[15]).floatValue() + var7 / (double)this.package_);
         this.throws_[15] = var13;
         Float var14 = (float)(
            (double)((Float)this.throws_[16]).floatValue() + (this.this_ - (double)((Float)this.throws_[16]).floatValue()) / (double)this.package_
         );
         this.throws_[16] = var14;
         this.package_--;
         this.new_(var1, var3, var5);
         this.case_((Float)this.throws_[15], (Float)this.throws_[16]);
      }
   }

   public rSe_1 package_() {
      return rSe_1.class_(((rmE_2)this.throws_[49]).class_(catch_));
   }

   private void return_() {
      double var1 = -0.04F;
      double var3 = this.rw() ? 0.0 : -0.04F;
      double var5 = 0.0;
      this.native_ = 0.05F;
      if (this.instanceof_ == rSU.IN_AIR && this.try_ != rSU.IN_AIR && this.try_ != rSU.ON_LAND) {
         this.goto_ = this.byte_(1.0);
         this.new_(this.rx(), (double)(this.case_() - this.Bm()) + 0.101, this.BO());
         this.byte_(this.rv().throws_(1.0, 0.0, 1.0));
         this.throw_ = 0.0;
         this.try_ = rSU.IN_WATER;
      } else {
         if (this.try_ == rSU.IN_WATER) {
            var5 = (this.goto_ - this.re()) / (double)this.Bm();
            this.native_ = 0.9F;
         } else if (this.try_ == rSU.UNDER_FLOWING_WATER) {
            var3 = -7.0E-4;
            this.native_ = 0.9F;
         } else if (this.try_ == rSU.UNDER_WATER) {
            var5 = 0.01F;
            this.native_ = 0.45F;
         } else if (this.try_ == rSU.IN_AIR) {
            this.native_ = 0.9F;
         } else if (this.try_ == rSU.ON_LAND) {
            this.native_ = this.while_;
            if (this.rU() instanceof rhd_3) {
               this.while_ /= 2.0F;
            }
         }

         rjU_2 var7 = this.rv();
         this.catch_(var7.break_ * (double)this.native_, var7.byte_ + var3, var7.protected_ * (double)this.native_);
         this.final_ = this.final_ * this.native_;
         if (var5 > 0.0) {
            rjU_2 var8 = this.rv();
            this.catch_(var8.break_, (var8.byte_ + var5 * 0.06153846016296973) * 0.75, var8.protected_);
         }
      }
   }

   private boolean super_() {
      rfl_3 var1 = this.rN();
      int var2 = rfU_2.byte_(var1.class_);
      int var3 = rfU_2.throws_(var1.protected_);
      int var4 = rfU_2.byte_(var1.break_);
      int var5 = rfU_2.throws_(var1.break_ + 0.001);
      int var6 = rfU_2.byte_(var1.byte_);
      int var7 = rfU_2.throws_(var1.case_);
      boolean var8 = false;
      this.goto_ = Double.MIN_VALUE;
      rfw_3 var9 = new rfw_3();

      for (int var10 = var2; var10 < var3; var10++) {
         for (int var11 = var4; var11 < var5; var11++) {
            for (int var12 = var6; var12 < var7; var12++) {
               var9.class_(var10, var11, var12);
               rXE var13 = ((rYB)this.throws_[7]).break_(var9);
               if (var13.class_(rlG_2.break_)) {
                  float var14 = (float)var11 + var13.class_((rRq_1)((rYB)this.throws_[7]), var9);
                  this.goto_ = Math.max((double)var14, this.goto_);
                  var8 |= var1.break_ < (double)var14;
               }
            }
         }
      }

      return var8;
   }

   @Override
   public boolean super_(an_3 var1) {
      return class_(this, var1);
   }

   private void public_() {
      if (this.BP()) {
         float var1 = 0.0F;
         if (this.else_) {
            this.final_--;
         }

         if (this.synchronized_) {
            this.final_++;
         }

         if (this.synchronized_ != this.else_ && !this.return_ && !this.public_) {
            var1 += 0.005F;
         }

         Float var6 = (Float)this.throws_[15] + this.final_;
         this.throws_[15] = var6;
         if (this.return_) {
            var1 += 0.04F;
         }

         if (this.public_) {
            var1 -= 0.005F;
         }

         this.byte_(
            this.rv()
               .break_(
                  (double)(rfU_2.class_(-(Float)this.throws_[15] * (float) (Math.PI / 180.0)) * var1),
                  0.0,
                  (double)(rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0)) * var1)
               )
         );
         this.class_(this.synchronized_ && !this.else_ || this.return_, this.else_ && !this.synchronized_ || this.return_);
      }
   }

   public float protected_(float var1) {
      return rfU_2.catch_(var1, this.float_, this.long_);
   }

   public rdb_3 protected_() {
      switch (this.package_()) {
         case OAK:
         default:
            return rdy_3.he;
         case SPRUCE:
            return rdy_3.ku;
         case BIRCH:
            return rdy_3.km;
         case JUNGLE:
            return rdy_3.kZ;
         case ACACIA:
            return rdy_3.kv;
         case DARK_OAK:
            return rdy_3.kF;
      }
   }

   @Override
   public void private_(boolean var1) {
      if (!((rYB)this.throws_[7]).continue_) {
         this.interface_ = true;
         this.char_ = var1;
         if (this.goto_() == 0) {
            this.extends_(60);
         }
      }

      ((rYB)this.throws_[7])
         .class_(
            rLQ.E,
            this.rx() + (double)((Random)this.throws_[40]).nextFloat(),
            this.re() + 0.7,
            this.BO() + (double)((Random)this.throws_[40]).nextFloat(),
            0.0,
            0.0,
            0.0
         );
      if (((Random)this.throws_[40]).nextInt(20) == 0) {
         ((rYB)this.throws_[7])
            .class_(this.rx(), this.re(), this.BO(), this.BJ(), this.Pr(), 1.0F, 0.8F + 0.4F * ((Random)this.throws_[40]).nextFloat(), false);
      }
   }

   public float private_() {
      return ((rmE_2)this.throws_[49]).class_(protected_);
   }

   public int final_() {
      return ((rmE_2)this.throws_[49]).class_(break_);
   }

   @Override
   public void volatile_(an_3 var1) {
      this.class_(var1);
   }

   @Override
   public boolean rG() {
      return true;
   }

   @Override
   public an_3 rU() {
      List var1 = this.Bh();
      return var1.isEmpty() ? null : (an_3)var1.get(0);
   }

   @Override
   public double PS() {
      return -0.1;
   }

   @Override
   public void rF() {
      this.byte_(-this.final_());
      this.break_(10);
      this.byte_(this.private_() * 11.0F);
   }

   @Override
   public boolean rY() {
      return !(Boolean)this.throws_[27];
   }

   @Override
   public rpr_3 rS() {
      return this.Pg().catch_();
   }

   @Override
   public boolean PU() {
      return true;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   public rjU_2 a_(iB_2 var1) {
      rjU_2 var2 = class_((double)(this.PN() * rfU_2.class_), (double)var1.PN(), (Float)this.throws_[15]);
      double var3 = this.rx() + var2.break_;
      double var5 = this.BO() + var2.protected_;
      rfH_2 var7 = new rfH_2(var3, this.rN().throws_, var5);
      rfH_2 var8 = var7.break_();
      if (!((rYB)this.throws_[7]).final_(var8)) {
         double var9 = (double)var7.c_() + ((rYB)this.throws_[7]).private_(var7);
         double var11 = (double)var7.c_() + ((rYB)this.throws_[7]).private_(var8);
         UnmodifiableIterator var13 = var1.BV().iterator();

         while (var13.hasNext()) {
            iM_2 var14 = (iM_2)var13.next();
            rjU_2 var15 = rqI_2.class_((rYB)this.throws_[7], var3, var9, var5, var1, var14);
            if (var15 != null) {
               var1.class_(var14);
               return var15;
            }

            rjU_2 var16 = rqI_2.class_((rYB)this.throws_[7], var3, var11, var5, var1, var14);
            if (var16 != null) {
               var1.class_(var14);
               return var16;
            }
         }
      }

      return super.a_(var1);
   }

   @Override
   protected void m_() {
      ((rmE_2)this.throws_[49]).class_(class_, 0);
      ((rmE_2)this.throws_[49]).class_(break_, 1);
      ((rmE_2)this.throws_[49]).class_(protected_, 0.0F);
      ((rmE_2)this.throws_[49]).class_(catch_, rSe_1.OAK.ordinal());
      ((rmE_2)this.throws_[49]).class_(private_, false);
      ((rmE_2)this.throws_[49]).class_(implements_, false);
      ((rmE_2)this.throws_[49]).class_(finally_, 0);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
