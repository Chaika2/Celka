package celestial;

import java.util.Random;
import java.util.stream.Stream;

public abstract class CH {
   private static final rfl_3 class_ = new rfl_3(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   protected final gm_3 byte_;
   protected double protected_;
   protected double throws_;
   protected double case_;
   protected double catch_;
   protected double private_;
   protected double implements_;
   protected double finally_;
   protected double extends_;
   protected double native_;
   private rfl_3 break_ = class_;
   protected boolean volatile_;
   protected boolean final_ = true;
   private boolean instanceof_;
   protected boolean package_;
   protected float int_ = 0.6F;
   protected float new_ = 1.8F;
   protected final Random continue_ = new Random();
   protected int super_;
   protected int this_;
   protected float else_;
   protected float synchronized_ = 1.0F;
   protected float return_ = 1.0F;
   protected float public_ = 1.0F;
   protected float goto_ = 1.0F;
   protected float while_;
   protected float try_;
   private rrGi_1 throw_ = new rrGi_1();

   public CH byte_(float var1) {
      this.finally_ *= (double)var1;
      this.extends_ = (this.extends_ - 0.1F) * (double)var1 + 0.1F;
      this.native_ *= (double)var1;
      return this;
   }

   private boolean byte_(double var1, double var3, double var5) {
      if (!(this.int_ > 1.0F) && !(this.new_ > 1.0F)) {
         int var7 = rfU_2.byte_(this.catch_);
         int var8 = rfU_2.byte_(this.private_);
         int var9 = rfU_2.byte_(this.implements_);
         this.throw_.class_(var7, var8, var9);
         xc_3 var10 = this.byte_.byte_(this.throw_);
         if (!var10.catch_()) {
            return true;
         } else {
            double var11 = var1 > 0.0 ? this.break_.protected_ : (var1 < 0.0 ? this.break_.class_ : this.catch_);
            double var13 = var3 > 0.0 ? this.break_.throws_ : (var3 < 0.0 ? this.break_.break_ : this.private_);
            double var15 = var5 > 0.0 ? this.break_.case_ : (var5 < 0.0 ? this.break_.byte_ : this.implements_);
            int var17 = rfU_2.byte_(var11 + var1);
            int var18 = rfU_2.byte_(var13 + var3);
            int var19 = rfU_2.byte_(var15 + var5);
            if (var17 != var7 || var18 != var8 || var19 != var9) {
               this.throw_.class_(var17, var18, var19);
               xc_3 var20 = this.byte_.byte_(this.throw_);
               if (!var20.catch_()) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return true;
      }
   }

   protected CH(gm_3 var1, double var2, double var4, double var6) {
      this.byte_ = var1;
      this.class_(0.2F, 0.2F);
      this.break_(var2, var4, var6);
      this.protected_ = var2;
      this.throws_ = var4;
      this.case_ = var6;
      this.this_ = (int)(4.0F / (this.continue_.nextFloat() * 0.9F + 0.1F));
   }

   public CH(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6);
      this.finally_ = var8 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.extends_ = var10 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.native_ = var12 + (Math.random() * 2.0 - 1.0) * 0.4F;
      float var14 = (float)(Math.random() + Math.random() + 1.0) * 0.15F;
      float var15 = rfU_2.class_(this.finally_ * this.finally_ + this.extends_ * this.extends_ + this.native_ * this.native_);
      this.finally_ = this.finally_ / (double)var15 * (double)var14 * 0.4F;
      this.extends_ = this.extends_ / (double)var15 * (double)var14 * 0.4F + 0.1F;
      this.native_ = this.native_ / (double)var15 * (double)var14 * 0.4F;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName()
         + ", Pos ("
         + this.catch_
         + ","
         + this.private_
         + ","
         + this.implements_
         + "), RGBA ("
         + this.synchronized_
         + ","
         + this.return_
         + ","
         + this.public_
         + ","
         + this.goto_
         + "), Age "
         + this.super_;
   }

   public abstract void class_(Ok_1 var1, ly_3 var2, float var3);

   public void class_(double var1, double var3, double var5) {
      if (!this.instanceof_) {
         double var7 = var1;
         double var9 = var3;
         double var11 = var5;
         if (this.final_ && (var1 != 0.0 || var3 != 0.0 || var5 != 0.0) && this.byte_(var1, var3, var5)) {
            rjU_2 var13 = an_3.class_(
               (an_3)null, new rjU_2(var1, var3, var5), this.volatile_(), this.byte_, rjm_3.break_(), new rqJ_2<>(Stream.empty()), false, false
            );
            var1 = var13.break_;
            var3 = var13.byte_;
            var5 = var13.protected_;
         }

         if (var1 != 0.0 || var3 != 0.0 || var5 != 0.0) {
            this.class_(this.volatile_().protected_(var1, var3, var5));
            this.extends_();
         }

         if (Math.abs(var9) >= 1.0E-5F && Math.abs(var3) < 1.0E-5F) {
            this.instanceof_ = true;
         }

         this.volatile_ = var9 != var3 && var9 < 0.0;
         if (var7 != var1) {
            this.finally_ = 0.0;
         }

         if (var11 != var5) {
            this.native_ = 0.0;
         }
      }
   }

   protected void class_(float var1, float var2) {
      if (var1 != this.int_ || var2 != this.new_) {
         this.int_ = var1;
         this.new_ = var2;
         rfl_3 var3 = this.volatile_();
         double var4 = (var3.class_ + var3.protected_ - (double)var1) / 2.0;
         double var6 = (var3.byte_ + var3.case_ - (double)var1) / 2.0;
         this.class_(new rfl_3(var4, var3.break_, var6, var4 + (double)this.int_, var3.break_ + (double)this.new_, var6 + (double)this.int_));
      }
   }

   public void class_(float var1, float var2, float var3) {
      this.synchronized_ = var1;
      this.return_ = var2;
      this.public_ = var3;
   }

   public abstract CJ class_();

   public void class_(rfl_3 var1) {
      this.break_ = var1;
   }

   public void class_(int var1) {
      this.this_ = var1;
   }

   public void break_(double var1, double var3, double var5) {
      this.catch_ = var1;
      this.private_ = var3;
      this.implements_ = var5;
      float var7 = this.int_ / 2.0F;
      float var8 = this.new_;
      this.class_(new rfl_3(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)var8, var5 + (double)var7));
   }

   protected int break_(float var1) {
      rfH_2 var2 = new rfH_2(this.catch_, this.private_, this.implements_);
      return this.byte_.int_(var2) ? yX_2.class_(this.byte_, var2) : 0;
   }

   protected void throws_(float var1) {
      this.goto_ = var1;
   }

   public void finally_() {
      this.package_ = true;
   }

   protected void extends_() {
      rfl_3 var1 = this.volatile_();
      this.catch_ = (var1.class_ + var1.protected_) / 2.0;
      this.private_ = var1.break_;
      this.implements_ = (var1.byte_ + var1.case_) / 2.0;
   }

   public void case_() {
      this.protected_ = this.catch_;
      this.throws_ = this.private_;
      this.case_ = this.implements_;
      if (this.super_++ >= this.this_) {
         this.finally_();
      } else {
         this.extends_ = this.extends_ - 0.04 * (double)this.else_;
         this.class_(this.finally_, this.extends_, this.native_);
         this.finally_ *= 0.98F;
         this.extends_ *= 0.98F;
         this.native_ *= 0.98F;
         if (this.volatile_) {
            this.finally_ *= 0.7F;
            this.native_ *= 0.7F;
         }
      }
   }

   public int implements_() {
      return this.this_;
   }

   public CH protected_(float var1) {
      this.class_(0.2F * var1, 0.2F * var1);
      return this;
   }

   public boolean final_() {
      return !(this instanceof CA);
   }

   public rfl_3 volatile_() {
      return this.break_;
   }

   public boolean native_() {
      return !this.package_;
   }
}
