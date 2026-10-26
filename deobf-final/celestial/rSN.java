package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class rSN extends rEi_1 implements aR_2, aa_3 {
   private static final rut_3<Integer> class_ = rmE_2.class_(rSN.class, ruw_3.break_);
   private static final rut_3<Integer> break_ = rmE_2.class_(rSN.class, ruw_3.break_);
   private static final rut_3<Integer> protected_ = rmE_2.class_(rSN.class, ruw_3.break_);
   private static final List<rut_3<Integer>> super_ = ImmutableList.of(class_, break_, protected_);
   private static final rut_3<Integer> this_ = rmE_2.class_(rSN.class, ruw_3.break_);
   private final float[] else_ = new float[2];
   private final float[] synchronized_ = new float[2];
   private final float[] return_ = new float[2];
   private final float[] public_ = new float[2];
   private final int[] goto_ = new int[2];
   private final int[] while_ = new int[2];
   private int try_;
   private final rrEQ instanceof_ = (rrEQ)new rrEQ(this.L_(), rRb_1.PURPLE, rRM.PROGRESS).class_(true);
   private static final Predicate<iB_2> throw_ = var0 -> var0.sG() != aL_2.break_ && var0.Sq();
   private static final ay_3 interface_ = new ay_3().class_(20.0).class_(throw_);

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.ki;
   }

   private float byte_(float var1, float var2, float var3) {
      float var4 = rfU_2.catch_(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public static boolean byte_(xc_3 var0) {
      return !var0.catch_() && !rls_3.x.class_(var0.break_());
   }

   @Override
   protected void double_() {
      if (this.n() > 0) {
         int var1 = this.n() - 1;
         if (var1 <= 0) {
            rRz_1 var2 = ((rYB)this.throws_[7]).B().break_(rRu_1.break_) ? rRz_1.DESTROY : rRz_1.NONE;
            ((rYB)this.throws_[7]).class_(this, this.rx(), this.rH(), this.BO(), 7.0F, false, var2);
            if (!this.BF()) {
               ((rYB)this.throws_[7]).break_(1023, this.Bs(), 0);
            }
         }

         this.this_(var1);
         if ((Integer)this.throws_[41] % 10 == 0) {
            this.protected_(10.0F);
         }
      } else {
         super.double_();

         for (int var13 = 1; var13 < 3; var13++) {
            if ((Integer)this.throws_[41] >= this.goto_[var13 - 1]) {
               this.goto_[var13 - 1] = (Integer)this.throws_[41] + 10 + ((Random)this.throws_[40]).nextInt(10);
               if (((rYB)this.throws_[7]).abstract_() == rRO.NORMAL || ((rYB)this.throws_[7]).abstract_() == rRO.HARD) {
                  int var15 = var13 - 1;
                  int var3 = this.while_[var13 - 1];
                  this.while_[var15] = this.while_[var13 - 1] + 1;
                  if (var3 > 15) {
                     float var4 = 10.0F;
                     float var5 = 5.0F;
                     double var6 = rfU_2.class_((Random)this.throws_[40], this.rx() - 10.0, this.rx() + 10.0);
                     double var8 = rfU_2.class_((Random)this.throws_[40], this.re() - 5.0, this.re() + 5.0);
                     double var10 = rfU_2.class_((Random)this.throws_[40], this.BO() - 10.0, this.BO() + 10.0);
                     this.class_(var13 + 1, var6, var8, var10, true);
                     this.while_[var13 - 1] = 0;
                  }
               }

               int var16 = this.else_(var13);
               if (var16 > 0) {
                  an_3 var19 = ((rYB)this.throws_[7]).break_(var16);
                  if (var19 == null || !var19.BM() || this.int_(var19) > 900.0 || !this.while_(var19)) {
                     this.class_(var13, 0);
                  } else if (var19 instanceof rhd_3 && ((rhx_3)((rhd_3)var19).implements_[18]).class_) {
                     this.class_(var13, 0);
                  } else {
                     this.class_(var13 + 1, (iB_2)var19);
                     this.goto_[var13 - 1] = (Integer)this.throws_[41] + 40 + ((Random)this.throws_[40]).nextInt(20);
                     this.while_[var13 - 1] = 0;
                  }
               } else {
                  List var18 = ((rYB)this.throws_[7]).class_(iB_2.class, interface_, this, this.rN().byte_(20.0, 8.0, 20.0));

                  for (int var21 = 0; var21 < 10 && !var18.isEmpty(); var21++) {
                     iB_2 var23 = (iB_2)var18.get(((Random)this.throws_[40]).nextInt(var18.size()));
                     if (var23 != this && var23.BM() && this.while_(var23)) {
                        if (var23 instanceof rhd_3) {
                           if (!((rhx_3)((rhd_3)var23).implements_[18]).class_) {
                              this.class_(var13, var23.V());
                           }
                        } else {
                           this.class_(var13, var23.V());
                        }
                        break;
                     }

                     var18.remove(var23);
                  }
               }
            }
         }

         if (this.I_() != null) {
            this.class_(0, this.I_().V());
         } else {
            this.class_(0, 0);
         }

         if (this.try_ > 0) {
            this.try_--;
            if (this.try_ == 0 && ((rYB)this.throws_[7]).B().break_(rRu_1.break_)) {
               int var14 = rfU_2.byte_(this.re());
               int var17 = rfU_2.byte_(this.rx());
               int var20 = rfU_2.byte_(this.BO());
               boolean var22 = false;

               for (int var24 = -1; var24 <= 1; var24++) {
                  for (int var25 = -1; var25 <= 1; var25++) {
                     for (int var7 = 0; var7 <= 3; var7++) {
                        int var26 = var17 + var24;
                        int var9 = var14 + var7;
                        int var27 = var20 + var25;
                        rfH_2 var11 = new rfH_2(var26, var9, var27);
                        xc_3 var12 = ((rYB)this.throws_[7]).byte_(var11);
                        if (byte_(var12)) {
                           var22 = ((rYB)this.throws_[7]).class_(var11, true, this) || var22;
                        }
                     }
                  }
               }

               if (var22) {
                  ((rYB)this.throws_[7]).class_((rhd_3)null, 1022, this.Bs(), 0);
               }
            }
         }

         if ((Integer)this.throws_[41] % 20 == 0) {
            this.protected_(1.0F);
         }

         this.instanceof_.class_(this.Ss() / this.SK());
      }
   }

   public rSN(aI_2<? extends rSN> var1, rYB var2) {
      super(var1, var2);
      this.public_(this.SK());
      this.public_().byte_(true);
      this.finally_ = 50;
   }

   @Override
   public boolean I() {
      return false;
   }

   public void this_(int var1) {
      ((rmE_2)this.throws_[49]).break_(this_, var1);
   }

   public int n() {
      return ((rmE_2)this.throws_[49]).class_(this_);
   }

   private void class_(int var1, iB_2 var2) {
      this.class_(var1, var2.rx(), var2.re() + (double)var2.Bx() * 0.5, var2.BO(), var1 == 0 && ((Random)this.throws_[40]).nextFloat() < 0.001F);
   }

   private void class_(int var1, double var2, double var4, double var6, boolean var8) {
      if (!this.BF()) {
         ((rYB)this.throws_[7]).class_((rhd_3)null, 1024, this.Bs(), 0);
      }

      double var9 = this.synchronized_(var1);
      double var11 = this.return_(var1);
      double var13 = this.public_(var1);
      double var15 = var2 - var9;
      double var17 = var4 - var11;
      double var19 = var6 - var13;
      rhU_2 var21 = new rhU_2((rYB)this.throws_[7], this, var15, var17, var19);
      var21.break_(this);
      if (var8) {
         var21.class_(true);
      }

      var21.volatile_(var9, var11, var13);
      ((rYB)this.throws_[7]).a_(var21);
   }

   @Override
   public boolean class_(float var1, float var2) {
      return false;
   }

   public float class_(int var1) {
      return this.synchronized_[var1];
   }

   @Override
   public boolean class_() {
      return this.Ss() <= this.SK() / 2.0F;
   }

   public void class_(int var1, int var2) {
      ((rmE_2)this.throws_[49]).break_(super_.get(var1), var2);
   }

   @Override
   public void class_(rhN_2 var1) {
      super.class_(var1);
      this.instanceof_.class_(var1);
   }

   @Override
   protected void class_(rye_3 var1, int var2, boolean var3) {
      super.class_(var1, var2, var3);
      rsE_2 var4 = this.class_(rdy_3.dQ);
      if (var4 != null) {
         var4.int_();
      }
   }

   @Override
   public void class_(xc_3 var1, rjU_2 var2) {
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Invul", this.n());
   }

   @Override
   public void default_() {
      rjU_2 var1 = this.rv().throws_(1.0, 0.6, 1.0);
      if (!((rYB)this.throws_[7]).continue_ && this.else_(0) > 0) {
         an_3 var2 = ((rYB)this.throws_[7]).break_(this.else_(0));
         if (var2 != null) {
            double var3 = var1.byte_;
            if (this.re() < var2.re() || !this.class_() && this.re() < var2.re() + 5.0) {
               var3 = Math.max(0.0, var3);
               var3 += 0.3 - var3 * 0.6F;
            }

            var1 = new rjU_2(var1.break_, var3, var1.protected_);
            rjU_2 var5 = new rjU_2(var2.rx() - this.rx(), 0.0, var2.BO() - this.BO());
            if (case_(var5) > 9.0) {
               rjU_2 var6 = var5.protected_();
               var1 = var1.break_(var6.break_ * 0.3 - var1.break_ * 0.6, 0.0, var6.protected_ * 0.3 - var1.protected_ * 0.6);
            }
         }
      }

      this.byte_(var1);
      if (case_(var1) > 0.05) {
         Float var25 = (float)rfU_2.protected_(var1.protected_, var1.break_) * (180.0F / (float)Math.PI) - 90.0F;
         this.throws_[15] = var25;
      }

      super.default_();

      for (int var26 = 0; var26 < 2; var26++) {
         this.public_[var26] = this.synchronized_[var26];
         this.return_[var26] = this.else_[var26];
      }

      for (int var27 = 0; var27 < 2; var27++) {
         int var30 = this.else_(var27 + 1);
         an_3 var4 = null;
         if (var30 > 0) {
            var4 = ((rYB)this.throws_[7]).break_(var30);
         }

         if (var4 != null) {
            double var34 = this.synchronized_(var27 + 1);
            double var7 = this.return_(var27 + 1);
            double var9 = this.public_(var27 + 1);
            double var11 = var4.rx() - var34;
            double var13 = var4.rH() - var7;
            double var15 = var4.BO() - var9;
            double var17 = (double)rfU_2.class_(var11 * var11 + var15 * var15);
            float var19 = (float)(rfU_2.protected_(var15, var11) * 180.0F / (float)Math.PI) - 90.0F;
            float var20 = (float)(-(rfU_2.protected_(var13, var17) * 180.0F / (float)Math.PI));
            this.else_[var27] = this.byte_(this.else_[var27], var20, 40.0F);
            this.synchronized_[var27] = this.byte_(this.synchronized_[var27], var19, 10.0F);
         } else {
            this.synchronized_[var27] = this.byte_(this.synchronized_[var27], (Float)this.private_[23], 10.0F);
         }
      }

      boolean var28 = this.class_();

      for (int var31 = 0; var31 < 3; var31++) {
         double var33 = this.synchronized_(var31);
         double var35 = this.return_(var31);
         double var8 = this.public_(var31);
         ((rYB)this.throws_[7])
            .class_(
               rLQ.double_,
               var33 + ((Random)this.throws_[40]).nextGaussian() * 0.3F,
               var35 + ((Random)this.throws_[40]).nextGaussian() * 0.3F,
               var8 + ((Random)this.throws_[40]).nextGaussian() * 0.3F,
               0.0,
               0.0,
               0.0
            );
         if (var28 && ((rYB)this.throws_[7]).int_.nextInt(4) == 0) {
            ((rYB)this.throws_[7])
               .class_(
                  rLQ.else_,
                  var33 + ((Random)this.throws_[40]).nextGaussian() * 0.3F,
                  var35 + ((Random)this.throws_[40]).nextGaussian() * 0.3F,
                  var8 + ((Random)this.throws_[40]).nextGaussian() * 0.3F,
                  0.7F,
                  0.7F,
                  0.5
               );
         }
      }

      if (this.n() > 0) {
         for (int var32 = 0; var32 < 3; var32++) {
            ((rYB)this.throws_[7])
               .class_(
                  rLQ.else_,
                  this.rx() + ((Random)this.throws_[40]).nextGaussian(),
                  this.re() + (double)(((Random)this.throws_[40]).nextFloat() * 3.3F),
                  this.BO() + ((Random)this.throws_[40]).nextGaussian(),
                  0.7F,
                  0.7F,
                  0.9F
               );
         }
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else if (var1 == rye_3.private_ || var1.extends_() instanceof rSN) {
         return false;
      } else if (this.n() > 0 && var1 != rye_3.volatile_) {
         return false;
      } else {
         if (this.class_()) {
            an_3 var3 = var1.finally_();
            if (var3 instanceof rhm_3) {
               return false;
            }
         }

         an_3 var5 = var1.extends_();
         if (var5 != null && !(var5 instanceof rhd_3) && var5 instanceof iB_2 && ((iB_2)var5).sG() == this.sG()) {
            return false;
         } else {
            if (this.try_ <= 0) {
               this.try_ = 20;
            }

            for (int var4 = 0; var4 < this.while_.length; var4++) {
               this.while_[var4] = this.while_[var4] + 3;
            }

            return super.break_(var1, var2);
         }
      }
   }

   @Override
   public void break_(rhN_2 var1) {
      super.break_(var1);
      this.instanceof_.break_(var1);
   }

   public float break_(int var1) {
      return this.else_[var1];
   }

   @Override
   public boolean break_(rLY var1) {
      return false;
   }

   @Override
   public void break_(rgP_2 var1) {
      super.break_(var1);
      this.instanceof_.class_(this.L_());
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.this_(var1.private_("Invul"));
      if (this.Bk()) {
         this.instanceof_.class_(this.L_());
      }
   }

   @Override
   public void break_(iB_2 var1, float var2) {
      this.class_(0, var1);
   }

   @Override
   public boolean throws_(rLY var1) {
      return var1.class_() == rLD.this_ ? false : super.throws_(var1);
   }

   public void throws_() {
      this.this_(220);
      this.public_(this.SK() / 3.0F);
   }

   public static iz_3 L() {
      return rEi_1.sm().class_(iQ_2.class_, 300.0).class_(iQ_2.protected_, 0.6F).class_(iQ_2.break_, 40.0).class_(iQ_2.implements_, 4.0);
   }

   public int else_(int var1) {
      return ((rmE_2)this.throws_[49]).class_(super_.get(var1));
   }

   @Override
   protected boolean new_(an_3 var1) {
      return false;
   }

   private double return_(int var1) {
      return var1 <= 0 ? this.re() + 3.0 : this.re() + 2.2;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.kU;
   }

   private double public_(int var1) {
      if (var1 <= 0) {
         return this.BO();
      } else {
         float var2 = ((Float)this.private_[23] + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var3 = rfU_2.class_(var2);
         return this.BO() + (double)var3 * 1.3;
      }
   }

   @Override
   protected void final_() {
      this.package_.class_(0, new rSc_1(this));
      this.package_.class_(2, new rBe_1(this, 1.0, 40, 20.0F));
      this.package_.class_(5, new rSk_1(this, 1.0));
      this.package_.class_(6, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(7, new rBC(this));
      this.int_.class_(1, new rBc_1(this));
      this.int_.class_(2, new rBI<>(this, is_3.class, 0, false, false, throw_));
   }

   private double synchronized_(int var1) {
      if (var1 <= 0) {
         return this.rx();
      } else {
         float var2 = ((Float)this.private_[23] + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var3 = rfU_2.break_(var2);
         return this.rx() + (double)var3 * 1.3;
      }
   }

   @Override
   public void rA() {
      if (((rYB)this.throws_[7]).abstract_() == rRO.PEACEFUL && this.boolean_()) {
         this.PD();
      } else {
         Integer var5 = 0;
         this.private_[33] = var5;
      }
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.ka;
   }

   @Override
   public aL_2 sG() {
      return aL_2.break_;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, 0);
      ((rmE_2)this.throws_[49]).class_(break_, 0);
      ((rmE_2)this.throws_[49]).class_(protected_, 0);
      ((rmE_2)this.throws_[49]).class_(this_, 0);
   }
}
