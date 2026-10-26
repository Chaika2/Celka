package celestial;

import java.util.Random;
import java.util.UUID;

public abstract class rhf_3 extends an_3 {
   private UUID class_;
   private int break_;
   private boolean protected_;

   public void byte_(double var1, double var3, double var5, float var7, float var8) {
      rjU_2 var9 = new rjU_2(var1, var3, var5)
         .protected_()
         .break_(
            ((Random)this.throws_[40]).nextGaussian() * 0.0075F * (double)var8,
            ((Random)this.throws_[40]).nextGaussian() * 0.0075F * (double)var8,
            ((Random)this.throws_[40]).nextGaussian() * 0.0075F * (double)var8
         )
         .class_((double)var7);
      this.byte_(var9);
      float var10 = rfU_2.class_(case_(var9));
      Float var15 = (float)(rfU_2.protected_(var9.break_, var9.protected_) * 180.0F / (float)Math.PI);
      this.throws_[15] = var15;
      Float var16 = (float)(rfU_2.protected_(var9.byte_, (double)var10) * 180.0F / (float)Math.PI);
      this.throws_[16] = var16;
      Float var17 = (Float)this.throws_[15];
      this.throws_[17] = var17;
      Float var18 = (Float)this.throws_[16];
      this.throws_[18] = var18;
   }

   rhf_3(aI_2<? extends rhf_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      if (!this.protected_) {
         this.protected_ = this.protected_();
      }

      super.this_();
   }

   protected void class_(rff_3 var1) {
      xc_3 var2 = ((rYB)this.throws_[7]).byte_(var1.class_());
      var2.class_((rYB)this.throws_[7], var2, var1, this);
   }

   public void class_(an_3 var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = -rfU_2.class_(var3 * (float) (Math.PI / 180.0)) * rfU_2.break_(var2 * (float) (Math.PI / 180.0));
      float var8 = -rfU_2.class_((var2 + var4) * (float) (Math.PI / 180.0));
      float var9 = rfU_2.break_(var3 * (float) (Math.PI / 180.0)) * rfU_2.break_(var2 * (float) (Math.PI / 180.0));
      this.byte_((double)var7, (double)var8, (double)var9, var5, var6);
      rjU_2 var10 = var1.rv();
      this.byte_(this.rv().break_(var10.break_, var1.BL() ? 0.0 : var10.byte_, var10.protected_));
   }

   protected void class_(rjG_2 var1) {
      rjM_2 var2 = var1.byte_();
      if (var2 == rjM_2.ENTITY) {
         this.class_((rfo_3)var1);
      } else if (var2 == rjM_2.BLOCK) {
         this.class_((rff_3)var1);
      }
   }

   protected boolean class_(an_3 var1) {
      if (!var1.native_() && var1.BM() && var1.rY()) {
         an_3 var2 = this.else_();
         return var2 == null || this.protected_ || !var2.return_(var1);
      } else {
         return false;
      }
   }

   protected void class_(rfo_3 var1) {
   }

   @Override
   protected void class_(rcd_3 var1) {
      if (this.class_ != null) {
         var1.class_("Owner", this.class_);
      }

      if (this.protected_) {
         var1.class_("LeftOwner", true);
      }
   }

   public void break_(an_3 var1) {
      if (var1 != null) {
         this.class_ = var1.ro();
         this.break_ = var1.V();
      }
   }

   protected static float break_(float var0, float var1) {
      while (var1 - var0 < -180.0F) {
         var0 -= 360.0F;
      }

      while (var1 - var0 >= 180.0F) {
         var0 += 360.0F;
      }

      return rfU_2.catch_(0.2F, var0, var1);
   }

   @Override
   protected void break_(rcd_3 var1) {
      if (var1.break_("Owner")) {
         this.class_ = var1.class_("Owner");
      }

      this.protected_ = var1.new_("LeftOwner");
   }

   @Override
   public void extends_(double var1, double var3, double var5) {
      this.catch_(var1, var3, var5);
      if ((Float)this.throws_[18] == 0.0F && (Float)this.throws_[17] == 0.0F) {
         float var7 = rfU_2.class_(var1 * var1 + var5 * var5);
         Float var12 = (float)(rfU_2.protected_(var3, (double)var7) * 180.0F / (float)Math.PI);
         this.throws_[16] = var12;
         Float var13 = (float)(rfU_2.protected_(var1, var5) * 180.0F / (float)Math.PI);
         this.throws_[15] = var13;
         Float var14 = (Float)this.throws_[16];
         this.throws_[18] = var14;
         Float var15 = (Float)this.throws_[15];
         this.throws_[17] = var15;
         this.class_(this.rx(), this.re(), this.BO(), (Float)this.throws_[15], (Float)this.throws_[16]);
      }
   }

   public an_3 else_() {
      if (this.class_ != null && (rYB)this.throws_[7] instanceof rrEm_1) {
         return ((rrEm_1)((rYB)this.throws_[7])).break_(this.class_);
      } else {
         return this.break_ != 0 ? ((rYB)this.throws_[7]).break_(this.break_) : null;
      }
   }

   protected void return_() {
      rjU_2 var1 = this.rv();
      float var2 = rfU_2.class_(case_(var1));
      Float var7 = break_((Float)this.throws_[18], (float)(rfU_2.protected_(var1.byte_, (double)var2) * 180.0F / (float)Math.PI));
      this.throws_[16] = var7;
      Float var8 = break_((Float)this.throws_[17], (float)(rfU_2.protected_(var1.break_, var1.protected_) * 180.0F / (float)Math.PI));
      this.throws_[15] = var8;
   }

   private boolean protected_() {
      an_3 var1 = this.else_();
      if (var1 != null) {
         for (an_3 var3 : ((rYB)this.throws_[7]).break_(this, this.rN().break_(this.rv()).class_(1.0), var0 -> !var0.native_() && var0.rY())) {
            if (var3.PO() == var1.PO()) {
               return false;
            }
         }
      }

      return true;
   }
}
