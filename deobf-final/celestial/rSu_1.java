package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rSu_1 extends is_3 implements rEK {
   private static final Logger while_ = LogManager.getLogger();
   public static final rut_3<Integer> class_ = rmE_2.class_(rSu_1.class, ruw_3.break_);
   private static final ay_3 try_ = new ay_3().class_(64.0);
   public final double[][] break_ = new double[64][3];
   public int protected_ = -1;
   private final rSm_1[] instanceof_;
   public final rSm_1 super_;
   private final rSm_1 throw_;
   private final rSm_1 interface_;
   private final rSm_1 char_;
   private final rSm_1 abstract_;
   private final rSm_1 long_;
   private final rSm_1 float_;
   private final rSm_1 void_;
   public float this_;
   public float else_;
   public boolean synchronized_;
   public int return_;
   public float public_;
   public rSa_1 goto_;
   private final rKG static_;
   private final rSq_1 import_;
   private int short_ = 100;
   private int default_;
   private final rLq_1[] const_ = new rLq_1[24];
   private final int[] strictfp_ = new int[24];
   private final rLH boolean_ = new rLH();

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.BL;
   }

   public rjU_2 byte_(float var1) {
      rSl_1 var2 = this.import_.class_();
      rST var3 = var2.protected_();
      rjU_2 var4;
      if (var3 == rST.protected_ || var3 == rST.throws_) {
         rfH_2 var18 = ((rYB)this.throws_[7]).class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.class_);
         float var19 = Math.max(rfU_2.class_(var18.class_(this.Ps(), true)) / 4.0F, 1.0F);
         float var7 = 6.0F / var19;
         float var8 = (Float)this.throws_[16];
         float var9 = 1.5F;
         Float var16 = -var7 * 1.5F * 5.0F;
         this.throws_[16] = var16;
         var4 = this.break_(var1);
         Float var17 = var8;
         this.throws_[16] = var17;
      } else if (var2.M_()) {
         float var5 = (Float)this.throws_[16];
         float var6 = 1.5F;
         Float var14 = -45.0F;
         this.throws_[16] = var14;
         var4 = this.break_(var1);
         Float var15 = var5;
         this.throws_[16] = var15;
      } else {
         var4 = this.break_(var1);
      }

      return var4;
   }

   public rSu_1(aI_2<? extends rSu_1> var1, rYB var2) {
      super(aI_2.this_, var2);
      this.super_ = new rSm_1(this, "head", 1.0F, 1.0F);
      this.throw_ = new rSm_1(this, "neck", 3.0F, 3.0F);
      this.interface_ = new rSm_1(this, "body", 5.0F, 3.0F);
      this.char_ = new rSm_1(this, "tail", 2.0F, 2.0F);
      this.abstract_ = new rSm_1(this, "tail", 2.0F, 2.0F);
      this.long_ = new rSm_1(this, "tail", 2.0F, 2.0F);
      this.float_ = new rSm_1(this, "wing", 4.0F, 2.0F);
      this.void_ = new rSm_1(this, "wing", 4.0F, 2.0F);
      this.instanceof_ = new rSm_1[]{this.super_, this.throw_, this.interface_, this.char_, this.abstract_, this.long_, this.float_, this.void_};
      this.public_(this.SK());
      Boolean var7 = true;
      this.throws_[38] = var7;
      Boolean var8 = true;
      this.throws_[56] = var8;
      if (var2 instanceof rrEm_1) {
         this.static_ = ((rrEm_1)var2).Q();
      } else {
         this.static_ = null;
      }

      this.import_ = new rSq_1(this);
   }

   @Override
   public boolean I() {
      return false;
   }

   public rKG n() {
      return this.static_;
   }

   private rLC class_(rLq_1 var1, rLq_1 var2) {
      ArrayList var3 = Lists.newArrayList();
      rLq_1 var4 = var2;
      var3.add(0, var2);

      while (var4.private_ != null) {
         var4 = var4.private_;
         var3.add(0, var4);
      }

      return new rLC(var3, new rfH_2(var2.class_, var2.break_, var2.byte_), true);
   }

   public rLC class_(int var1, int var2, rLq_1 var3) {
      for (int var4 = 0; var4 < 24; var4++) {
         rLq_1 var5 = this.const_[var4];
         var5.implements_ = false;
         var5.catch_ = 0.0F;
         var5.throws_ = 0.0F;
         var5.case_ = 0.0F;
         var5.private_ = null;
         var5.protected_ = -1;
      }

      rLq_1 var13 = this.const_[var1];
      rLq_1 var14 = this.const_[var2];
      var13.throws_ = 0.0F;
      var13.case_ = var13.class_(var14);
      var13.catch_ = var13.case_;
      this.boolean_.class_();
      this.boolean_.class_(var13);
      rLq_1 var6 = var13;
      byte var7 = 0;
      if (this.static_ == null || this.static_.byte_() == 0) {
         var7 = 12;
      }

      while (!this.boolean_.byte_()) {
         rLq_1 var8 = this.boolean_.break_();
         if (var8.equals(var14)) {
            if (var3 != null) {
               var3.private_ = var14;
               var14 = var3;
            }

            return this.class_(var13, var14);
         }

         if (var8.class_(var14) < var6.class_(var14)) {
            var6 = var8;
         }

         var8.implements_ = true;
         int var9 = 0;

         for (int var10 = 0; var10 < 24; var10++) {
            if (this.const_[var10] == var8) {
               var9 = var10;
               break;
            }
         }

         for (int var15 = var7; var15 < 24; var15++) {
            if ((this.strictfp_[var9] & 1 << var15) > 0) {
               rLq_1 var11 = this.const_[var15];
               if (!var11.implements_) {
                  float var12 = var8.throws_ + var8.class_(var11);
                  if (!var11.protected_() || var12 < var11.throws_) {
                     var11.private_ = var8;
                     var11.throws_ = var12;
                     var11.case_ = var11.class_(var14);
                     if (var11.protected_()) {
                        this.boolean_.class_(var11, var11.throws_ + var11.case_);
                     } else {
                        var11.catch_ = var11.throws_ + var11.case_;
                        this.boolean_.class_(var11);
                     }
                  }
               }
            }
         }
      }

      if (var6 == var13) {
         return null;
      } else {
         while_.debug("Failed to find path from {} to {}", var1, var2);
         if (var3 != null) {
            var3.private_ = var6;
            var6 = var3;
         }

         return this.class_(var13, var6);
      }
   }

   public double[] class_(int var1, float var2) {
      if (this.Sl()) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var3 = this.protected_ - var1 & 63;
      int var4 = this.protected_ - var1 - 1 & 63;
      double[] var5 = new double[3];
      double var6 = this.break_[var3][0];
      double var8 = rfU_2.case_(this.break_[var4][0] - var6);
      var5[0] = var6 + var8 * (double)var2;
      var6 = this.break_[var3][1];
      var8 = this.break_[var4][1] - var6;
      var5[1] = var6 + var8 * (double)var2;
      var5[2] = rfU_2.protected_((double)var2, this.break_[var3][2], this.break_[var4][2]);
      return var5;
   }

   private void class_(int var1) {
      while (var1 > 0) {
         int var2 = rsP_2.class_(var1);
         var1 -= var2;
         ((rYB)this.throws_[7]).a_(new rsP_2((rYB)this.throws_[7], this.rx(), this.re(), this.BO(), var2));
      }
   }

   public float class_(int var1, double[] var2, double[] var3) {
      rSl_1 var4 = this.import_.class_();
      rST var5 = var4.protected_();
      double var6;
      if (var5 == rST.protected_ || var5 == rST.throws_) {
         rfH_2 var8 = ((rYB)this.throws_[7]).class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.class_);
         float var9 = Math.max(rfU_2.class_(var8.class_(this.Ps(), true)) / 4.0F, 1.0F);
         var6 = (double)((float)var1 / var9);
      } else if (var4.M_()) {
         var6 = (double)var1;
      } else if (var1 == 6) {
         var6 = 0.0;
      } else {
         var6 = var3[1] - var2[1];
      }

      return (float)var6;
   }

   public void class_(rSa_1 var1, rfH_2 var2, rye_3 var3) {
      rhd_3 var4;
      if (var3.extends_() instanceof rhd_3) {
         var4 = (rhd_3)var3.extends_();
      } else {
         var4 = ((rYB)this.throws_[7]).class_(try_, (double)var2.b_(), (double)var2.c_(), (double)var2.d_());
      }

      if (var1 == this.goto_) {
         this.class_(this.super_, rye_3.protected_(var4), 10.0F);
      }

      this.import_.class_().class_(var1, var2, var3, var4);
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (class_.equals(var1) && ((rYB)this.throws_[7]).continue_) {
         this.import_.class_(rST.class_(this.BQ().class_(class_)));
      }

      super.class_(var1);
   }

   public boolean class_(rSm_1 var1, rye_3 var2, float var3) {
      if (this.import_.class_().protected_() == rST.finally_) {
         return false;
      } else {
         var3 = this.import_.class_().class_(var2, var3);
         if (var1 != this.super_) {
            var3 = var3 / 4.0F + Math.min(var3, 1.0F);
         }

         if (var3 < 0.01F) {
            return false;
         } else {
            if (var2.extends_() instanceof rhd_3 || var2.protected_()) {
               float var4 = this.Ss();
               this.case_(var2, var3);
               if (this.Sl() && !this.import_.class_().M_()) {
                  this.public_(1.0F);
                  this.import_.class_(rST.finally_);
               }

               if (this.import_.class_().M_()) {
                  this.default_ = (int)((float)this.default_ + (var4 - this.Ss()));
                  if ((float)this.default_ > 0.25F * this.SK()) {
                     this.default_ = 0;
                     this.import_.class_(rST.throws_);
                  }
               }
            }

            return true;
         }
      }
   }

   private void class_(List<an_3> var1) {
      double var2 = (this.interface_.rN().class_ + this.interface_.rN().protected_) / 2.0;
      double var4 = (this.interface_.rN().byte_ + this.interface_.rN().case_) / 2.0;

      for (an_3 var7 : var1) {
         if (var7 instanceof iB_2) {
            double var8 = var7.rx() - var2;
            double var10 = var7.BO() - var4;
            double var12 = Math.max(var8 * var8 + var10 * var10, 0.1);
            var7.implements_(var8 / var12 * 4.0, 0.2F, var10 / var12 * 4.0);
            if (!this.import_.class_().M_() && ((iB_2)var7).Sb() < (Integer)var7.throws_[41] - 2) {
               var7.break_(rye_3.byte_(this), 5.0F);
               this.class_(this, var7);
            }
         }
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("DragonPhase", this.import_.class_().protected_().break_());
   }

   private void class_(rSm_1 var1, double var2, double var4, double var6) {
      var1.new_(this.rx() + var2, this.re() + var4, this.BO() + var6);
   }

   @Override
   public void default_() {
      if (((rYB)this.throws_[7]).continue_) {
         this.public_(this.Ss());
         if (!this.BF()) {
            float var1 = rfU_2.break_(this.else_ * (float) (Math.PI * 2));
            float var2 = rfU_2.break_(this.this_ * (float) (Math.PI * 2));
            if (var2 <= -0.3F && var1 >= -0.3F) {
               ((rYB)this.throws_[7])
                  .class_(this.rx(), this.re(), this.BO(), rqn_3.Bv, this.Pr(), 5.0F, 0.8F + ((Random)this.throws_[40]).nextFloat() * 0.3F, false);
            }

            if (!this.import_.class_().M_() && --this.short_ < 0) {
               ((rYB)this.throws_[7])
                  .class_(this.rx(), this.re(), this.BO(), rqn_3.BF, this.Pr(), 2.5F, 0.8F + ((Random)this.throws_[40]).nextFloat() * 0.3F, false);
               this.short_ = 200 + ((Random)this.throws_[40]).nextInt(200);
            }
         }
      }

      this.this_ = this.else_;
      if (this.Sl()) {
         float var43 = (((Random)this.throws_[40]).nextFloat() - 0.5F) * 8.0F;
         float var45 = (((Random)this.throws_[40]).nextFloat() - 0.5F) * 4.0F;
         float var3 = (((Random)this.throws_[40]).nextFloat() - 0.5F) * 8.0F;
         ((rYB)this.throws_[7]).class_(rLQ.return_, this.rx() + (double)var43, this.re() + 2.0 + (double)var45, this.BO() + (double)var3, 0.0, 0.0, 0.0);
      } else {
         this.sx();
         rjU_2 var44 = this.rv();
         float var46 = 0.2F / (rfU_2.class_(case_(var44)) * 10.0F + 1.0F);
         var46 *= (float)Math.pow(2.0, var44.byte_);
         if (this.import_.class_().M_()) {
            this.else_ += 0.1F;
         } else if (this.synchronized_) {
            this.else_ += var46 * 0.5F;
         } else {
            this.else_ += var46;
         }

         Float var30 = rfU_2.catch_((Float)this.throws_[15]);
         this.throws_[15] = var30;
         if (this.c()) {
            this.else_ = 0.5F;
         } else {
            if (this.protected_ < 0) {
               for (int var48 = 0; var48 < this.break_.length; var48++) {
                  this.break_[var48][0] = (double)((Float)this.throws_[15]).floatValue();
                  this.break_[var48][1] = this.re();
               }
            }

            if (++this.protected_ == this.break_.length) {
               this.protected_ = 0;
            }

            this.break_[this.protected_][0] = (double)((Float)this.throws_[15]).floatValue();
            this.break_[this.protected_][1] = this.re();
            if (((rYB)this.throws_[7]).continue_) {
               if ((Integer)this.private_[45] > 0) {
                  double var49 = this.rx() + ((Double)this.private_[46] - this.rx()) / (double)((Integer)this.private_[45]).intValue();
                  double var5 = this.re() + ((Double)this.private_[47] - this.re()) / (double)((Integer)this.private_[45]).intValue();
                  double var7 = this.BO() + ((Double)this.private_[48] - this.BO()) / (double)((Integer)this.private_[45]).intValue();
                  double var9 = rfU_2.case_((Double)this.private_[49] - (double)((Float)this.throws_[15]).floatValue());
                  Float var31 = (float)((double)((Float)this.throws_[15]).floatValue() + var9 / (double)((Integer)this.private_[45]).intValue());
                  this.throws_[15] = var31;
                  Float var32 = (float)(
                     (double)((Float)this.throws_[16]).floatValue()
                        + ((Double)this.private_[50] - (double)((Float)this.throws_[16]).floatValue()) / (double)((Integer)this.private_[45]).intValue()
                  );
                  this.throws_[16] = var32;
                  Integer var33 = (Integer)this.private_[45] - 1;
                  this.private_[45] = var33;
                  this.new_(var49, var5, var7);
                  this.case_((Float)this.throws_[15], (Float)this.throws_[16]);
               }

               this.import_.class_().class_();
            } else {
               rSl_1 var50 = this.import_.class_();
               var50.break_();
               if (this.import_.class_() != var50) {
                  var50 = this.import_.class_();
                  var50.break_();
               }

               rjU_2 var4 = var50.case_();
               if (var4 != null) {
                  double var54 = var4.break_ - this.rx();
                  double var56 = var4.byte_ - this.re();
                  double var58 = var4.protected_ - this.BO();
                  double var11 = var54 * var54 + var56 * var56 + var58 * var58;
                  float var13 = var50.throws_();
                  double var14 = (double)rfU_2.class_(var54 * var54 + var58 * var58);
                  if (var14 > 0.0) {
                     var56 = rfU_2.class_(var56 / var14, (double)(-var13), (double)var13);
                  }

                  this.byte_(this.rv().break_(0.0, var56 * 0.01, 0.0));
                  Float var34 = rfU_2.catch_((Float)this.throws_[15]);
                  this.throws_[15] = var34;
                  double var16 = rfU_2.class_(
                     rfU_2.case_(180.0 - rfU_2.protected_(var54, var58) * 180.0F / (float)Math.PI - (double)((Float)this.throws_[15]).floatValue()),
                     -50.0,
                     50.0
                  );
                  rjU_2 var18 = var4.class_(this.rx(), this.re(), this.BO()).protected_();
                  rjU_2 var19 = new rjU_2(
                        (double)rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0)),
                        this.rv().byte_,
                        (double)(-rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0)))
                     )
                     .protected_();
                  float var20 = Math.max(((float)var19.break_(var18) + 0.5F) / 1.5F, 0.0F);
                  this.public_ *= 0.8F;
                  this.public_ = (float)((double)this.public_ + var16 * (double)var50.implements_());
                  Float var35 = (Float)this.throws_[15] + this.public_ * 0.1F;
                  this.throws_[15] = var35;
                  float var21 = (float)(2.0 / (var11 + 1.0));
                  float var22 = 0.06F;
                  this.class_(0.06F * (var20 * var21 + (1.0F - var21)), new rjU_2(0.0, 0.0, -1.0));
                  if (this.synchronized_) {
                     this.class_(iG_2.SELF, this.rv().class_(0.8F));
                  } else {
                     this.class_(iG_2.SELF, this.rv());
                  }

                  rjU_2 var23 = this.rv().protected_();
                  double var24 = 0.8 + 0.15 * (var23.break_(var19) + 1.0) / 2.0;
                  this.byte_(this.rv().throws_(var24, 0.91F, var24));
               }
            }

            Float var36 = (Float)this.throws_[15];
            this.private_[23] = var36;
            rjU_2[] var51 = new rjU_2[this.instanceof_.length];

            for (int var52 = 0; var52 < this.instanceof_.length; var52++) {
               var51[var52] = new rjU_2(this.instanceof_[var52].rx(), this.instanceof_[var52].re(), this.instanceof_[var52].BO());
            }

            float var53 = (float)(this.class_(5, 1.0F)[1] - this.class_(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float var55 = rfU_2.break_(var53);
            float var6 = rfU_2.class_(var53);
            float var57 = (Float)this.throws_[15] * (float) (Math.PI / 180.0);
            float var8 = rfU_2.class_(var57);
            float var59 = rfU_2.break_(var57);
            this.class_(this.interface_, (double)(var8 * 0.5F), 0.0, (double)(-var59 * 0.5F));
            this.class_(this.float_, (double)(var59 * 4.5F), 2.0, (double)(var8 * 4.5F));
            this.class_(this.void_, (double)(var59 * -4.5F), 2.0, (double)(var8 * -4.5F));
            if (!((rYB)this.throws_[7]).continue_ && (Integer)this.private_[10] == 0) {
               this.class_(((rYB)this.throws_[7]).break_(this, this.float_.rN().byte_(4.0, 2.0, 4.0).protected_(0.0, -2.0, 0.0), rpJ_2.throws_));
               this.class_(((rYB)this.throws_[7]).break_(this, this.void_.rN().byte_(4.0, 2.0, 4.0).protected_(0.0, -2.0, 0.0), rpJ_2.throws_));
               this.break_(((rYB)this.throws_[7]).break_(this, this.super_.rN().class_(1.0), rpJ_2.throws_));
               this.break_(((rYB)this.throws_[7]).break_(this, this.throw_.rN().class_(1.0), rpJ_2.throws_));
            }

            float var10 = rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0) - this.public_ * 0.01F);
            float var60 = rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0) - this.public_ * 0.01F);
            float var12 = this.sJ();
            this.class_(this.super_, (double)(var10 * 6.5F * var55), (double)(var12 + var6 * 6.5F), (double)(-var60 * 6.5F * var55));
            this.class_(this.throw_, (double)(var10 * 5.5F * var55), (double)(var12 + var6 * 5.5F), (double)(-var60 * 5.5F * var55));
            double[] var61 = this.class_(5, 1.0F);

            for (int var62 = 0; var62 < 3; var62++) {
               rSm_1 var15 = null;
               if (var62 == 0) {
                  var15 = this.char_;
               }

               if (var62 == 1) {
                  var15 = this.abstract_;
               }

               if (var62 == 2) {
                  var15 = this.long_;
               }

               double[] var64 = this.class_(12 + var62 * 2, 1.0F);
               float var17 = (Float)this.throws_[15] * (float) (Math.PI / 180.0) + this.implements_(var64[0] - var61[0]) * (float) (Math.PI / 180.0);
               float var65 = rfU_2.class_(var17);
               float var66 = rfU_2.break_(var17);
               float var67 = 1.5F;
               float var68 = (float)(var62 + 1) * 2.0F;
               this.class_(
                  var15,
                  (double)(-(var8 * 1.5F + var65 * var68) * var55),
                  var64[1] - var61[1] - (double)((var68 + 1.5F) * var6) + 1.5,
                  (double)((var59 * 1.5F + var66 * var68) * var55)
               );
            }

            if (!((rYB)this.throws_[7]).continue_) {
               this.synchronized_ = this.break_(this.super_.rN()) | this.break_(this.throw_.rN()) | this.break_(this.interface_.rN());
               if (this.static_ != null) {
                  this.static_.break_(this);
               }
            }

            for (int var63 = 0; var63 < this.instanceof_.length; var63++) {
               rSm_1 var10000 = this.instanceof_[var63];
               Double var37 = var51[var63].break_;
               var10000.throws_[8] = var37;
               var10000 = this.instanceof_[var63];
               Double var38 = var51[var63].byte_;
               var10000.throws_[9] = var38;
               var10000 = this.instanceof_[var63];
               Double var39 = var51[var63].protected_;
               var10000.throws_[10] = var39;
               var10000 = this.instanceof_[var63];
               Double var40 = var51[var63].break_;
               var10000.throws_[34] = var40;
               var10000 = this.instanceof_[var63];
               Double var41 = var51[var63].byte_;
               var10000.throws_[35] = var41;
               var10000 = this.instanceof_[var63];
               Double var42 = var51[var63].protected_;
               var10000.throws_[36] = var42;
            }
         }
      }
   }

   @Override
   public void j() {
      this.PD();
      if (this.static_ != null) {
         this.static_.break_(this);
         this.static_.class_(this);
      }
   }

   private void break_(List<an_3> var1) {
      for (an_3 var3 : var1) {
         if (var3 instanceof iB_2) {
            var3.break_(rye_3.byte_(this), 10.0F);
            this.class_(this, var3);
         }
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.throws_("DragonPhase")) {
         this.import_.class_(rST.class_(var1.private_("DragonPhase")));
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (var1 instanceof rpX_2 && ((rpX_2)var1).goto_()) {
         this.class_(this.interface_, var1, var2);
      }

      return false;
   }

   @Override
   public boolean break_(rLY var1) {
      return false;
   }

   private boolean break_(rfl_3 var1) {
      int var2 = rfU_2.byte_(var1.class_);
      int var3 = rfU_2.byte_(var1.break_);
      int var4 = rfU_2.byte_(var1.byte_);
      int var5 = rfU_2.byte_(var1.protected_);
      int var6 = rfU_2.byte_(var1.throws_);
      int var7 = rfU_2.byte_(var1.case_);
      boolean var8 = false;
      boolean var9 = false;

      for (int var10 = var2; var10 <= var5; var10++) {
         for (int var11 = var3; var11 <= var6; var11++) {
            for (int var12 = var4; var12 <= var7; var12++) {
               rfH_2 var13 = new rfH_2(var10, var11, var12);
               xc_3 var14 = ((rYB)this.throws_[7]).byte_(var13);
               xd_3 var15 = var14.break_();
               if (!var14.catch_() && var14.byte_() != QP.final_) {
                  if (((rYB)this.throws_[7]).B().break_(rRu_1.break_) && !rls_3.J.class_(var15)) {
                     var9 = ((rYB)this.throws_[7]).class_(var13, false) || var9;
                  } else {
                     var8 = true;
                  }
               }
            }
         }
      }

      if (var9) {
         rfH_2 var16 = new rfH_2(
            var2 + ((Random)this.throws_[40]).nextInt(var5 - var2 + 1),
            var3 + ((Random)this.throws_[40]).nextInt(var6 - var3 + 1),
            var4 + ((Random)this.throws_[40]).nextInt(var7 - var4 + 1)
         );
         ((rYB)this.throws_[7]).byte_(2008, var16, 0);
      }

      return var8;
   }

   public static iz_3 throws_() {
      return is_3.package_().class_(iQ_2.class_, 200.0);
   }

   public rSq_1 L() {
      return this.import_;
   }

   private void sx() {
      if (this.goto_ != null) {
         if ((Boolean)this.goto_.throws_[27]) {
            this.goto_ = null;
         } else if ((Integer)this.throws_[41] % 10 == 0 && this.Ss() < this.SK()) {
            this.public_(this.Ss() + 1.0F);
         }
      }

      if (((Random)this.throws_[40]).nextInt(10) == 0) {
         List var1 = ((rYB)this.throws_[7]).class_(rSa_1.class, this.rN().class_(32.0));
         rSa_1 var2 = null;
         double var3 = Double.MAX_VALUE;

         for (rSa_1 var6 : var1) {
            double var7 = var6.int_(this);
            if (var7 < var3) {
               var3 = var7;
               var2 = var6;
            }
         }

         this.goto_ = var2;
      }
   }

   public int catch_() {
      if (this.const_[0] == null) {
         for (int var1 = 0; var1 < 24; var1++) {
            byte var2 = 5;
            int var3;
            int var4;
            if (var1 < 12) {
               var3 = rfU_2.protected_(60.0F * rfU_2.break_(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)var1)));
               var4 = rfU_2.protected_(60.0F * rfU_2.class_(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)var1)));
            } else if (var1 < 20) {
               int var5 = var1 - 12;
               var3 = rfU_2.protected_(40.0F * rfU_2.break_(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)var5)));
               var4 = rfU_2.protected_(40.0F * rfU_2.class_(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)var5)));
               var2 += 10;
            } else {
               int var6 = var1 - 20;
               var3 = rfU_2.protected_(20.0F * rfU_2.break_(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var6)));
               var4 = rfU_2.protected_(20.0F * rfU_2.class_(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var6)));
            }

            int var7 = Math.max(
               ((rYB)this.throws_[7]).short_() + 10, ((rYB)this.throws_[7]).class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, new rfH_2(var3, 0, var4)).c_() + var2
            );
            this.const_[var1] = new rLq_1(var3, var7, var4);
         }

         this.strictfp_[0] = 6146;
         this.strictfp_[1] = 8197;
         this.strictfp_[2] = 8202;
         this.strictfp_[3] = 16404;
         this.strictfp_[4] = 32808;
         this.strictfp_[5] = 32848;
         this.strictfp_[6] = 65696;
         this.strictfp_[7] = 131392;
         this.strictfp_[8] = 131712;
         this.strictfp_[9] = 263424;
         this.strictfp_[10] = 526848;
         this.strictfp_[11] = 525313;
         this.strictfp_[12] = 1581057;
         this.strictfp_[13] = 3166214;
         this.strictfp_[14] = 2138120;
         this.strictfp_[15] = 6373424;
         this.strictfp_[16] = 4358208;
         this.strictfp_[17] = 12910976;
         this.strictfp_[18] = 9044480;
         this.strictfp_[19] = 9706496;
         this.strictfp_[20] = 15216640;
         this.strictfp_[21] = 13688832;
         this.strictfp_[22] = 11763712;
         this.strictfp_[23] = 8257536;
      }

      return this.continue_(this.rx(), this.re(), this.BO());
   }

   protected boolean case_(rye_3 var1, float var2) {
      return super.break_(var1, var2);
   }

   public int continue_(double var1, double var3, double var5) {
      float var7 = 10000.0F;
      int var8 = 0;
      rLq_1 var9 = new rLq_1(rfU_2.byte_(var1), rfU_2.byte_(var3), rfU_2.byte_(var5));
      byte var10 = 0;
      if (this.static_ == null || this.static_.byte_() == 0) {
         var10 = 12;
      }

      for (int var11 = var10; var11 < 24; var11++) {
         if (this.const_[var11] != null) {
            float var12 = this.const_[var11].break_(var9);
            if (var12 < var7) {
               var7 = var12;
               var8 = var11;
            }
         }
      }

      return var8;
   }

   private float implements_(double var1) {
      return (float)rfU_2.case_(var1);
   }

   public rSm_1[] implements_() {
      return this.instanceof_;
   }

   @Override
   protected boolean new_(an_3 var1) {
      return false;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.Bu;
   }

   @Override
   public void rA() {
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.HOSTILE;
   }

   @Override
   public boolean rY() {
      return false;
   }

   private float sJ() {
      if (this.import_.class_().M_()) {
         return -1.0F;
      } else {
         double[] var1 = this.class_(5, 1.0F);
         double[] var2 = this.class_(0, 1.0F);
         return (float)(var1[1] - var2[1]);
      }
   }

   @Override
   protected void St() {
      if (this.static_ != null) {
         this.static_.break_(this);
      }

      this.return_++;
      if (this.return_ >= 180 && this.return_ <= 200) {
         float var1 = (((Random)this.throws_[40]).nextFloat() - 0.5F) * 8.0F;
         float var2 = (((Random)this.throws_[40]).nextFloat() - 0.5F) * 4.0F;
         float var3 = (((Random)this.throws_[40]).nextFloat() - 0.5F) * 8.0F;
         ((rYB)this.throws_[7]).class_(rLQ.synchronized_, this.rx() + (double)var1, this.re() + 2.0 + (double)var2, this.BO() + (double)var3, 0.0, 0.0, 0.0);
      }

      boolean var10 = ((rYB)this.throws_[7]).B().break_(rRu_1.throws_);
      short var11 = 500;
      if (this.static_ != null && !this.static_.protected_()) {
         var11 = 12000;
      }

      if (!((rYB)this.throws_[7]).continue_) {
         if (this.return_ > 150 && this.return_ % 5 == 0 && var10) {
            this.class_(rfU_2.protected_((float)var11 * 0.08F));
         }

         if (this.return_ == 1 && !this.BF()) {
            ((rYB)this.throws_[7]).break_(1028, this.Bs(), 0);
         }
      }

      this.class_(iG_2.SELF, new rjU_2(0.0, 0.1F, 0.0));
      Float var8 = (Float)this.throws_[15] + 20.0F;
      this.throws_[15] = var8;
      Float var9 = (Float)this.throws_[15];
      this.private_[23] = var9;
      if (this.return_ == 200 && !((rYB)this.throws_[7]).continue_) {
         if (var10) {
            this.class_(rfU_2.protected_((float)var11 * 0.2F));
         }

         if (this.static_ != null) {
            this.static_.class_(this);
         }

         this.PD();
      }
   }

   @Override
   protected float Si() {
      return 5.0F;
   }

   @Override
   protected void m_() {
      super.m_();
      this.BQ().class_(class_, rST.extends_.break_());
   }
}
