package celestial;

import java.util.Random;

public class rhl_3 extends an_3 implements ai_3 {
   private static final rut_3<rdn_3> class_ = rmE_2.class_(rhl_3.class, ruw_3.catch_);
   private double break_;
   private double protected_;
   private double catch_;
   private int private_;
   private boolean implements_;

   public rhl_3(aI_2<? extends rhl_3> var1, rYB var2) {
      super(var1, var2);
   }

   public rhl_3(rYB var1, double var2, double var4, double var6) {
      this(aI_2.while_, var1);
      this.private_ = 0;
      this.new_(var2, var4, var6);
   }

   @Override
   public void this_() {
      super.this_();
      rjU_2 var1 = this.rv();
      double var2 = this.rx() + var1.break_;
      double var4 = this.re() + var1.byte_;
      double var6 = this.BO() + var1.protected_;
      float var8 = rfU_2.class_(case_(var1));
      Float var24 = rhf_3.break_((Float)this.throws_[18], (float)(rfU_2.protected_(var1.byte_, (double)var8) * 180.0F / (float)Math.PI));
      this.throws_[16] = var24;
      Float var25 = rhf_3.break_((Float)this.throws_[17], (float)(rfU_2.protected_(var1.break_, var1.protected_) * 180.0F / (float)Math.PI));
      this.throws_[15] = var25;
      if (!((rYB)this.throws_[7]).continue_) {
         double var9 = this.break_ - var2;
         double var11 = this.catch_ - var6;
         float var13 = (float)Math.sqrt(var9 * var9 + var11 * var11);
         float var14 = (float)rfU_2.protected_(var11, var9);
         double var15 = rfU_2.protected_(0.0025, (double)var8, (double)var13);
         double var17 = var1.byte_;
         if (var13 < 1.0F) {
            var15 *= 0.8;
            var17 *= 0.8;
         }

         int var19 = this.re() < this.protected_ ? 1 : -1;
         var1 = new rjU_2(Math.cos((double)var14) * var15, var17 + ((double)var19 - var17) * 0.015F, Math.sin((double)var14) * var15);
         this.byte_(var1);
      }

      float var26 = 0.25F;
      if (this.rT()) {
         for (int var10 = 0; var10 < 4; var10++) {
            ((rYB)this.throws_[7])
               .class_(
                  rLQ.throws_, var2 - var1.break_ * 0.25, var4 - var1.byte_ * 0.25, var6 - var1.protected_ * 0.25, var1.break_, var1.byte_, var1.protected_
               );
         }
      } else {
         ((rYB)this.throws_[7])
            .class_(
               rLQ.transient_,
               var2 - var1.break_ * 0.25 + ((Random)this.throws_[40]).nextDouble() * 0.6 - 0.3,
               var4 - var1.byte_ * 0.25 - 0.5,
               var6 - var1.protected_ * 0.25 + ((Random)this.throws_[40]).nextDouble() * 0.6 - 0.3,
               var1.break_,
               var1.byte_,
               var1.protected_
            );
      }

      if (!((rYB)this.throws_[7]).continue_) {
         this.new_(var2, var4, var6);
         this.private_++;
         if (this.private_ > 80 && !((rYB)this.throws_[7]).continue_) {
            this.class_(rqn_3.Bn, 1.0F, 1.0F);
            this.PD();
            if (this.implements_) {
               ((rYB)this.throws_[7]).a_(new rsE_2((rYB)this.throws_[7], this.rx(), this.re(), this.BO(), this.class_()));
            } else {
               ((rYB)this.throws_[7]).byte_(2003, this.Bs(), 0);
            }
         }
      } else {
         this.volatile_(var2, var4, var6);
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      rdn_3 var2 = this.protected_();
      if (!var2.class_()) {
         var1.class_("Item", var2.break_(new rcd_3()));
      }
   }

   public void class_(rfH_2 var1) {
      double var2 = (double)var1.b_();
      int var4 = var1.c_();
      double var5 = (double)var1.d_();
      double var7 = var2 - this.rx();
      double var9 = var5 - this.BO();
      float var11 = rfU_2.class_(var7 * var7 + var9 * var9);
      if (var11 > 12.0F) {
         this.break_ = this.rx() + var7 / (double)var11 * 12.0;
         this.catch_ = this.BO() + var9 / (double)var11 * 12.0;
         this.protected_ = this.re() + 8.0;
      } else {
         this.break_ = var2;
         this.protected_ = (double)var4;
         this.catch_ = var5;
      }

      this.private_ = 0;
      this.implements_ = ((Random)this.throws_[40]).nextInt(5) > 0;
   }

   @Override
   public rdn_3 class_() {
      rdn_3 var1 = this.protected_();
      return var1.class_() ? new rdn_3(rdy_3.JT) : var1;
   }

   @Override
   public boolean class_(double var1) {
      double var3 = this.rN().class_() * 4.0;
      if (Double.isNaN(var3)) {
         var3 = 4.0;
      }

      var3 *= 64.0;
      return var1 < var3 * var3;
   }

   @Override
   public void break_(rcd_3 var1) {
      rdn_3 var2 = rdn_3.class_(var1.int_("Item"));
      this.break_(var2);
   }

   public void break_(rdn_3 var1) {
      if (var1.break_() != rdy_3.JT || var1.final_()) {
         this.BQ().break_(class_, rqR_2.class_(var1.implements_(), var0 -> var0.throws_(1)));
      }
   }

   @Override
   public boolean rt() {
      return false;
   }

   @Override
   public void extends_(double var1, double var3, double var5) {
      this.catch_(var1, var3, var5);
      if ((Float)this.throws_[18] == 0.0F && (Float)this.throws_[17] == 0.0F) {
         float var7 = rfU_2.class_(var1 * var1 + var5 * var5);
         Float var12 = (float)(rfU_2.protected_(var1, var5) * 180.0F / (float)Math.PI);
         this.throws_[15] = var12;
         Float var13 = (float)(rfU_2.protected_(var3, (double)var7) * 180.0F / (float)Math.PI);
         this.throws_[16] = var13;
         Float var14 = (Float)this.throws_[15];
         this.throws_[17] = var14;
         Float var15 = (Float)this.throws_[16];
         this.throws_[18] = var15;
      }
   }

   private rdn_3 protected_() {
      return this.BQ().class_(class_);
   }

   @Override
   public float rX() {
      return 1.0F;
   }

   @Override
   protected void m_() {
      this.BQ().class_(class_, rdn_3.break_);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
