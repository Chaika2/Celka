package celestial;

import java.util.EnumSet;
import java.util.Random;

public class rEI extends rEi_1 {
   private static final rut_3<Boolean> class_ = rmE_2.class_(rEI.class, ruw_3.implements_);
   private static final rut_3<Integer> protected_ = rmE_2.class_(rEI.class, ruw_3.break_);
   private float super_;
   private float this_;
   private float else_;
   private float synchronized_;
   private float return_;
   private iB_2 public_;
   private int goto_;
   private boolean while_;
   protected rBU break_;

   @Override
   public int char_() {
      return 160;
   }

   public float char_(float var1) {
      return ((float)this.goto_ + var1) / (float)this.L();
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return this.Pa() ? rqn_3.sl : rqn_3.sH;
   }

   public rEI(aI_2<? extends rEI> var1, rYB var2) {
      super(var1, var2);
      this.finally_ = 10;
      this.class_(rLp_1.WATER, 0.0F);
      this.native_ = new rEj_1(this);
      this.super_ = ((Random)this.throws_[40]).nextFloat();
      this.this_ = this.super_;
   }

   void this_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(class_, var1);
   }

   public float interface_(float var1) {
      return rfU_2.catch_(var1, this.return_, this.synchronized_);
   }

   void class_(int var1) {
      ((rmE_2)this.throws_[49]).break_(protected_, var1);
   }

   @Override
   public void class_(rut_3<?> var1) {
      super.class_(var1);
      if (protected_.equals(var1)) {
         this.goto_ = 0;
         this.public_ = null;
      }
   }

   @Override
   public boolean class_(rRR var1) {
      return var1.protected_(this);
   }

   @Override
   public float class_(rfH_2 var1, rRR var2) {
      return var2.break_(var1).class_(rlG_2.break_) ? 10.0F + var2.native_(var1) - 0.5F : super.class_(var1, var2);
   }

   @Override
   public void default_() {
      if (this.BM()) {
         if (((rYB)this.throws_[7]).continue_) {
            this.this_ = this.super_;
            if (!this.rT()) {
               this.else_ = 2.0F;
               rjU_2 var1 = this.rv();
               if (var1.byte_ > 0.0 && this.while_ && !this.BF()) {
                  ((rYB)this.throws_[7]).class_(this.rx(), this.re(), this.BO(), this.sJ(), this.Pr(), 1.0F, 1.0F, false);
               }

               this.while_ = var1.byte_ < 0.0 && ((rYB)this.throws_[7]).class_(this.Bs().break_(), this);
            } else if (this.sd()) {
               if (this.else_ < 0.5F) {
                  this.else_ = 4.0F;
               } else {
                  this.else_ = this.else_ + (0.5F - this.else_) * 0.1F;
               }
            } else {
               this.else_ = this.else_ + (0.125F - this.else_) * 0.2F;
            }

            this.super_ = this.super_ + this.else_;
            this.return_ = this.synchronized_;
            if (!this.Pa()) {
               this.synchronized_ = ((Random)this.throws_[40]).nextFloat();
            } else if (this.sd()) {
               this.synchronized_ = this.synchronized_ + (0.0F - this.synchronized_) * 0.25F;
            } else {
               this.synchronized_ = this.synchronized_ + (1.0F - this.synchronized_) * 0.06F;
            }

            if (this.sd() && this.rT()) {
               rjU_2 var22 = this.break_(0.0F);

               for (int var2 = 0; var2 < 2; var2++) {
                  ((rYB)this.throws_[7])
                     .class_(
                        rLQ.throws_,
                        this.break_(0.5) - var22.break_ * 1.5,
                        this.Ph() - var22.byte_ * 1.5,
                        this.protected_(0.5) - var22.protected_ * 1.5,
                        0.0,
                        0.0,
                        0.0
                     );
               }
            }

            if (this.sk()) {
               if (this.goto_ < this.L()) {
                  this.goto_++;
               }

               iB_2 var23 = this.sW();
               if (var23 != null) {
                  this.continue_().class_(var23, 90.0F, 90.0F);
                  this.continue_().class_();
                  double var24 = (double)this.char_(0.0F);
                  double var4 = var23.rx() - this.rx();
                  double var6 = var23.byte_(0.5) - this.rH();
                  double var8 = var23.BO() - this.BO();
                  double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
                  var4 /= var10;
                  var6 /= var10;
                  var8 /= var10;
                  double var12 = ((Random)this.throws_[40]).nextDouble();

                  while (var12 < var10) {
                     var12 += 1.8 - var24 + ((Random)this.throws_[40]).nextDouble() * (1.7 - var24);
                     ((rYB)this.throws_[7]).class_(rLQ.throws_, this.rx() + var4 * var12, this.rH() + var6 * var12, this.BO() + var8 * var12, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.Pa()) {
            this.throws_(300);
         } else if ((Boolean)this.throws_[20]) {
            this.byte_(
               this.rv()
                  .break_(
                     (double)((((Random)this.throws_[40]).nextFloat() * 2.0F - 1.0F) * 0.4F),
                     0.5,
                     (double)((((Random)this.throws_[40]).nextFloat() * 2.0F - 1.0F) * 0.4F)
                  )
            );
            Float var18 = ((Random)this.throws_[40]).nextFloat() * 360.0F;
            this.throws_[15] = var18;
            Boolean var19 = false;
            this.throws_[20] = var19;
            Boolean var20 = true;
            this.throws_[57] = var20;
         }

         if (this.sk()) {
            Float var21 = (Float)this.private_[25];
            this.throws_[15] = var21;
         }
      }

      super.default_();
   }

   public boolean sd() {
      return ((rmE_2)this.throws_[49]).class_(class_);
   }

   @Override
   public int r() {
      return 180;
   }

   public static boolean break_(aI_2<? extends rEI> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return (var4.nextInt(20) == 0 || !var1.extends_(var3))
         && var1.abstract_() != rRO.PEACEFUL
         && (var2 == iO_2.SPAWNER || var1.break_(var3).class_(rlG_2.break_));
   }

   @Override
   protected rLy_1 break_(rYB var1) {
      return new rLw_1(this, var1);
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return var2.break_ * 0.5F;
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (!this.sd() && !var1.this_() && var1.finally_() instanceof iB_2) {
         iB_2 var3 = (iB_2)var1.finally_();
         if (!var1.protected_()) {
            var3.break_(rye_3.class_((an_3)this), 2.0F);
         }
      }

      if (this.break_ != null) {
         this.break_.private_();
      }

      return super.break_(var1, var2);
   }

   public int L() {
      return 80;
   }

   public static iz_3 sx() {
      return rEi_1.sm().class_(iQ_2.case_, 6.0).class_(iQ_2.protected_, 0.5).class_(iQ_2.break_, 16.0).class_(iQ_2.class_, 30.0);
   }

   public boolean sk() {
      return ((rmE_2)this.throws_[49]).class_(protected_) != 0;
   }

   public float throw_(float var1) {
      return rfU_2.catch_(var1, this.this_, this.super_);
   }

   @Override
   protected rqA_2 static_() {
      return this.Pa() ? rqn_3.sv : rqn_3.sF;
   }

   @Override
   public void private_(rjU_2 var1) {
      if (this.try_() && this.rT()) {
         this.class_(0.1F, var1);
         this.class_(iG_2.SELF, this.rv());
         this.byte_(this.rv().class_(0.9));
         if (!this.sd() && this.I_() == null) {
            this.byte_(this.rv().break_(0.0, -0.005, 0.0));
         }
      } else {
         super.private_(var1);
      }
   }

   @Override
   protected void final_() {
      rBT var1 = new rBT(this, 1.0);
      this.break_ = new rBU(this, 1.0, 80);
      this.package_.class_(4, new rEf_1(this));
      this.package_.class_(5, var1);
      this.package_.class_(7, this.break_);
      this.package_.class_(8, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(8, new rBA(this, rEI.class, 12.0F, 0.01F));
      this.package_.class_(9, new rBC(this));
      this.break_.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
      var1.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
      this.int_.class_(1, new rBI<>(this, iB_2.class, 10, true, false, new rEV(this)));
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected rqA_2 Bt() {
      return this.Pa() ? rqn_3.sA : rqn_3.sn;
   }

   protected rqA_2 sJ() {
      return rqn_3.sC;
   }

   @Override
   public aL_2 sG() {
      return aL_2.throws_;
   }

   public iB_2 sW() {
      if (!this.sk()) {
         return null;
      } else if (((rYB)this.throws_[7]).continue_) {
         if (this.public_ != null) {
            return this.public_;
         } else {
            an_3 var1 = ((rYB)this.throws_[7]).break_(((rmE_2)this.throws_[49]).class_(protected_));
            if (var1 instanceof iB_2) {
               this.public_ = (iB_2)var1;
               return this.public_;
            } else {
               return null;
            }
         }
      } else {
         return this.I_();
      }
   }

   @Override
   public boolean SO() {
      return true;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, false);
      ((rmE_2)this.throws_[49]).class_(protected_, 0);
   }
}
