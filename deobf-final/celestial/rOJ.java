package celestial;

import java.util.Random;

public class rOJ extends rOl_1 {
   public float class_;
   public float break_;
   public float protected_;
   public float super_;
   public float this_;
   public float else_;
   public float synchronized_;
   public float return_;
   private float public_;
   private float goto_;
   private float while_;
   private float try_;
   private float instanceof_;
   private float throw_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.xj;
   }

   public void byte_(float var1, float var2, float var3) {
      this.try_ = var1;
      this.instanceof_ = var2;
      this.throw_ = var3;
   }

   public rOJ(aI_2<? extends rOJ> var1, rYB var2) {
      super(var1, var2);
      ((Random)this.throws_[40]).setSeed((long)this.V());
      this.goto_ = 1.0F / (((Random)this.throws_[40]).nextFloat() + 1.0F) * 0.2F;
   }

   private void n() {
      this.class_(rqn_3.xV, this.Si(), this.SN());
      rjU_2 var1 = this.finally_(new rjU_2(0.0, -1.0, 0.0)).break_(this.rx(), this.re(), this.BO());

      for (int var2 = 0; var2 < 30; var2++) {
         rjU_2 var3 = this.finally_(
            new rjU_2((double)((Random)this.throws_[40]).nextFloat() * 0.6 - 0.3, -1.0, (double)((Random)this.throws_[40]).nextFloat() * 0.6 - 0.3)
         );
         rjU_2 var4 = var3.class_(0.3 + (double)(((Random)this.throws_[40]).nextFloat() * 2.0F));
         ((rrEm_1)((rYB)this.throws_[7])).class_(rLQ.P, var1.break_, var1.byte_ + 0.5, var1.protected_, 0, var4.break_, var4.byte_, var4.protected_, 0.1F);
      }
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 19) {
         this.this_ = 0.0F;
      } else {
         super.class_(var1);
      }
   }

   @Override
   public void default_() {
      super.default_();
      this.break_ = this.class_;
      this.super_ = this.protected_;
      this.else_ = this.this_;
      this.return_ = this.synchronized_;
      this.this_ = this.this_ + this.goto_;
      if ((double)this.this_ > Math.PI * 2) {
         if (((rYB)this.throws_[7]).continue_) {
            this.this_ = (float) (Math.PI * 2);
         } else {
            this.this_ = (float)((double)this.this_ - (Math.PI * 2));
            if (((Random)this.throws_[40]).nextInt(10) == 0) {
               this.goto_ = 1.0F / (((Random)this.throws_[40]).nextFloat() + 1.0F) * 0.2F;
            }

            ((rYB)this.throws_[7]).class_(this, (byte)19);
         }
      }

      if (this.Pa()) {
         if (this.this_ < (float) Math.PI) {
            float var1 = this.this_ / (float) Math.PI;
            this.synchronized_ = rfU_2.class_(var1 * var1 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)var1 > 0.75) {
               this.public_ = 1.0F;
               this.while_ = 1.0F;
            } else {
               this.while_ *= 0.8F;
            }
         } else {
            this.synchronized_ = 0.0F;
            this.public_ *= 0.9F;
            this.while_ *= 0.99F;
         }

         if (!((rYB)this.throws_[7]).continue_) {
            this.catch_((double)(this.try_ * this.public_), (double)(this.instanceof_ * this.public_), (double)(this.throw_ * this.public_));
         }

         rjU_2 var9 = this.rv();
         float var2 = rfU_2.class_(case_(var9));
         Float var7 = (Float)this.private_[23]
            + (-((float)rfU_2.protected_(var9.break_, var9.protected_)) * (180.0F / (float)Math.PI) - (Float)this.private_[23]) * 0.1F;
         this.private_[23] = var7;
         Float var8 = (Float)this.private_[23];
         this.throws_[15] = var8;
         this.protected_ = (float)((double)this.protected_ + Math.PI * (double)this.while_ * 1.5);
         this.class_ = this.class_ + (-((float)rfU_2.protected_((double)var2, var9.byte_)) * (180.0F / (float)Math.PI) - this.class_) * 0.1F;
      } else {
         this.synchronized_ = rfU_2.throws_(rfU_2.class_(this.this_)) * (float) Math.PI * 0.25F;
         if (!((rYB)this.throws_[7]).continue_) {
            double var10 = this.rv().byte_;
            if (this.break_(rLD.goto_)) {
               var10 = 0.05 * (double)(this.byte_(rLD.goto_).byte_() + 1);
            } else if (!this.rw()) {
               var10 -= 0.08;
            }

            this.catch_(0.0, var10 * 0.98F, 0.0);
         }

         this.class_ = (float)((double)this.class_ + (double)(-90.0F - this.class_) * 0.02);
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (super.break_(var1, var2) && this.Sr() != null) {
         this.n();
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return var2.break_ * 0.5F;
   }

   public static boolean break_(aI_2<rOJ> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var3.c_() > 45 && var3.c_() < var1.short_();
   }

   public static iz_3 throws_() {
      return is_3.package_().class_(iQ_2.class_, 10.0);
   }

   public boolean L() {
      return this.try_ != 0.0F || this.instanceof_ != 0.0F || this.throw_ != 0.0F;
   }

   private rjU_2 finally_(rjU_2 var1) {
      rjU_2 var2 = var1.class_(this.break_ * (float) (Math.PI / 180.0));
      return var2.break_(-(Float)this.private_[24] * (float) (Math.PI / 180.0));
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.xI;
   }

   @Override
   public void private_(rjU_2 var1) {
      this.class_(iG_2.SELF, this.rv());
   }

   @Override
   protected void final_() {
      this.package_.class_(0, new rOd_1(this, this));
      this.package_.class_(1, new rOx_1(this));
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.xf;
   }

   @Override
   protected float Si() {
      return 0.4F;
   }
}
