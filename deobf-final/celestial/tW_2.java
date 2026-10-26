package celestial;

import com.google.common.collect.ImmutableList;
import java.util.function.Function;

public class tW_2<T extends iB_2> extends tX_2<T> implements tR_2, tY_2 {
   public Iq_1 class_;
   public Iq_1 break_;
   public Iq_1 byte_;
   public Iq_1 protected_;
   public Iq_1 throws_;
   public Iq_1 case_;
   public Iq_1 catch_;
   public tQ_2 private_ = tQ_2.EMPTY;
   public tQ_2 implements_ = tQ_2.EMPTY;
   public boolean finally_;
   public float extends_;

   @Override
   public Iq_1 byte_() {
      return this.class_;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void byte_(T var1) {
      switch (this.private_) {
         case EMPTY:
            this.throws_.catch_ = 0.0F;
            break;
         case BLOCK:
            this.throws_.case_ = this.throws_.case_ * 0.5F - 0.9424779F;
            this.throws_.catch_ = (float) (Math.PI / 6);
            break;
         case ITEM:
            this.throws_.case_ = this.throws_.case_ * 0.5F - (float) (Math.PI / 10);
            this.throws_.catch_ = 0.0F;
            break;
         case THROW_SPEAR:
            this.throws_.case_ = this.throws_.case_ * 0.5F - (float) Math.PI;
            this.throws_.catch_ = 0.0F;
            break;
         case BOW_AND_ARROW:
            this.protected_.catch_ = -0.1F + this.class_.catch_ - 0.4F;
            this.throws_.catch_ = 0.1F + this.class_.catch_;
            this.protected_.case_ = (float) (-Math.PI / 2) + this.class_.case_;
            this.throws_.case_ = (float) (-Math.PI / 2) + this.class_.case_;
            break;
         case CROSSBOW_CHARGE:
            Iy_1.class_(this.protected_, this.throws_, var1, false);
            break;
         case CROSSBOW_HOLD:
            Iy_1.class_(this.protected_, this.throws_, this.class_, false);
      }
   }

   public tW_2(float var1) {
      this(HU::protected_, var1, 0.0F, 64, 32);
   }

   protected tW_2(float var1, float var2, int var3, int var4) {
      this(HU::protected_, var1, var2, var3, var4);
   }

   public tW_2(Function<rqO_2, HU> var1, float var2, float var3, int var4, int var5) {
      super(var1, true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F);
      this.return_ = var4;
      this.public_ = var5;
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var2);
      this.class_.class_(0.0F, 0.0F + var3, 0.0F);
      this.break_ = new Iq_1(this, 32, 0);
      this.break_.class_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var2 + 0.5F);
      this.break_.class_(0.0F, 0.0F + var3, 0.0F);
      this.byte_ = new Iq_1(this, 16, 16);
      this.byte_.class_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var2);
      this.byte_.class_(0.0F, 0.0F + var3, 0.0F);
      this.protected_ = new Iq_1(this, 40, 16);
      this.protected_.class_(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.protected_.class_(-5.0F, 2.0F + var3, 0.0F);
      this.throws_ = new Iq_1(this, 40, 16);
      this.throws_.implements_ = true;
      this.throws_.class_(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.throws_.class_(5.0F, 2.0F + var3, 0.0F);
      this.case_ = new Iq_1(this, 0, 16);
      this.case_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.case_.class_(-1.9F, 12.0F + var3, 0.0F);
      this.catch_ = new Iq_1(this, 0, 16);
      this.catch_.implements_ = true;
      this.catch_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.catch_.class_(1.9F, 12.0F + var3, 0.0F);
   }

   private float class_(float var1) {
      return -65.0F * var1 + var1 * var1;
   }

   @Override
   public void class_(rpZ_2 var1, Ml_1 var2) {
      this.class_(var1).class_(var2);
   }

   public void class_(tW_2<T> var1) {
      super.class_(var1);
      var1.private_ = this.private_;
      var1.implements_ = this.implements_;
      var1.finally_ = this.finally_;
      var1.class_.class_(this.class_);
      var1.break_.class_(this.break_);
      var1.byte_.class_(this.byte_);
      var1.protected_.class_(this.protected_);
      var1.throws_.class_(this.throws_);
      var1.case_.class_(this.case_);
      var1.catch_.class_(this.catch_);
   }

   protected rpZ_2 class_(T var1) {
      rpZ_2 var2 = var1.Su();
      return (rpm_3)var1.private_[6] == rpm_3.MAIN_HAND ? var2 : var2.class_();
   }

   protected Iq_1 class_(rpZ_2 var1) {
      return var1 == rpZ_2.LEFT ? this.throws_ : this.protected_;
   }

   @Override
   protected Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_);
   }

   public void class_(T var1, float var2, float var3, float var4) {
      this.extends_ = var1.synchronized_(var4);
      super.class_(var1, var2, var3, var4);
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var7 = var1.BD() > 4;
      boolean var8 = var1.rP();
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      if (var7) {
         this.class_.case_ = (float) (-Math.PI / 4);
      } else if (this.extends_ > 0.0F) {
         if (var8) {
            this.class_.case_ = this.class_(this.extends_, this.class_.case_, (float) (-Math.PI / 4));
         } else {
            this.class_.case_ = this.class_(this.extends_, this.class_.case_, var6 * (float) (Math.PI / 180.0));
         }
      } else {
         this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      }

      this.byte_.catch_ = 0.0F;
      this.protected_.throws_ = 0.0F;
      this.protected_.byte_ = -5.0F;
      this.throws_.throws_ = 0.0F;
      this.throws_.byte_ = 5.0F;
      float var9 = 1.0F;
      if (var7) {
         var9 = (float)var1.rv().catch_();
         var9 /= 0.2F;
         var9 = var9 * var9 * var9;
      }

      if (var9 < 1.0F) {
         var9 = 1.0F;
      }

      this.protected_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 2.0F * var3 * 0.5F / var9;
      this.throws_.case_ = rfU_2.break_(var2 * 0.6662F) * 2.0F * var3 * 0.5F / var9;
      this.protected_.private_ = 0.0F;
      this.throws_.private_ = 0.0F;
      this.case_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3 / var9;
      this.catch_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 / var9;
      this.case_.catch_ = 0.0F;
      this.catch_.catch_ = 0.0F;
      this.case_.private_ = 0.0F;
      this.catch_.private_ = 0.0F;
      if (this.package_) {
         this.protected_.case_ += (float) (-Math.PI / 5);
         this.throws_.case_ += (float) (-Math.PI / 5);
         this.case_.case_ = -1.4137167F;
         this.case_.catch_ = (float) (Math.PI / 10);
         this.case_.private_ = 0.07853982F;
         this.catch_.case_ = -1.4137167F;
         this.catch_.catch_ = (float) (-Math.PI / 10);
         this.catch_.private_ = -0.07853982F;
      }

      this.protected_.catch_ = 0.0F;
      this.throws_.catch_ = 0.0F;
      boolean var10 = var1.Su() == rpZ_2.RIGHT;
      boolean var11 = var10 ? this.private_.class_() : this.implements_.class_();
      if (var10 != var11) {
         this.byte_((T)var1);
         this.break_((T)var1);
      } else {
         this.break_((T)var1);
         this.byte_((T)var1);
      }

      this.class_((T)var1, var4);
      if (this.finally_) {
         this.byte_.case_ = 0.5F;
         this.protected_.case_ += 0.4F;
         this.throws_.case_ += 0.4F;
         this.case_.throws_ = 4.0F;
         this.catch_.throws_ = 4.0F;
         this.case_.protected_ = 12.2F;
         this.catch_.protected_ = 12.2F;
         this.class_.protected_ = 4.2F;
         this.byte_.protected_ = 3.2F;
         this.throws_.protected_ = 5.2F;
         this.protected_.protected_ = 5.2F;
      } else {
         this.byte_.case_ = 0.0F;
         this.case_.throws_ = 0.1F;
         this.catch_.throws_ = 0.1F;
         this.case_.protected_ = 12.0F;
         this.catch_.protected_ = 12.0F;
         this.class_.protected_ = 0.0F;
         this.byte_.protected_ = 0.0F;
         this.throws_.protected_ = 2.0F;
         this.protected_.protected_ = 2.0F;
      }

      Iy_1.class_(this.protected_, this.throws_, var4);
      if (this.extends_ > 0.0F) {
         float var12 = var2 % 26.0F;
         rpZ_2 var13 = this.class_((T)var1);
         float var14 = var13 == rpZ_2.RIGHT && this.final_ > 0.0F ? 0.0F : this.extends_;
         float var15 = var13 == rpZ_2.LEFT && this.final_ > 0.0F ? 0.0F : this.extends_;
         if (var12 < 14.0F) {
            this.throws_.case_ = this.class_(var15, this.throws_.case_, 0.0F);
            this.protected_.case_ = rfU_2.catch_(var14, this.protected_.case_, 0.0F);
            this.throws_.catch_ = this.class_(var15, this.throws_.catch_, (float) Math.PI);
            this.protected_.catch_ = rfU_2.catch_(var14, this.protected_.catch_, (float) Math.PI);
            this.throws_.private_ = this.class_(var15, this.throws_.private_, (float) Math.PI + 1.8707964F * this.class_(var12) / this.class_(14.0F));
            this.protected_.private_ = rfU_2.catch_(var14, this.protected_.private_, (float) Math.PI - 1.8707964F * this.class_(var12) / this.class_(14.0F));
         } else if (var12 >= 14.0F && var12 < 22.0F) {
            float var20 = (var12 - 14.0F) / 8.0F;
            this.throws_.case_ = this.class_(var15, this.throws_.case_, (float) (Math.PI / 2) * var20);
            this.protected_.case_ = rfU_2.catch_(var14, this.protected_.case_, (float) (Math.PI / 2) * var20);
            this.throws_.catch_ = this.class_(var15, this.throws_.catch_, (float) Math.PI);
            this.protected_.catch_ = rfU_2.catch_(var14, this.protected_.catch_, (float) Math.PI);
            this.throws_.private_ = this.class_(var15, this.throws_.private_, 5.012389F - 1.8707964F * var20);
            this.protected_.private_ = rfU_2.catch_(var14, this.protected_.private_, 1.2707963F + 1.8707964F * var20);
         } else if (var12 >= 22.0F && var12 < 26.0F) {
            float var16 = (var12 - 22.0F) / 4.0F;
            this.throws_.case_ = this.class_(var15, this.throws_.case_, (float) (Math.PI / 2) - (float) (Math.PI / 2) * var16);
            this.protected_.case_ = rfU_2.catch_(var14, this.protected_.case_, (float) (Math.PI / 2) - (float) (Math.PI / 2) * var16);
            this.throws_.catch_ = this.class_(var15, this.throws_.catch_, (float) Math.PI);
            this.protected_.catch_ = rfU_2.catch_(var14, this.protected_.catch_, (float) Math.PI);
            this.throws_.private_ = this.class_(var15, this.throws_.private_, (float) Math.PI);
            this.protected_.private_ = rfU_2.catch_(var14, this.protected_.private_, (float) Math.PI);
         }

         float var21 = 0.3F;
         float var17 = 0.33333334F;
         this.catch_.case_ = rfU_2.catch_(this.extends_, this.catch_.case_, 0.3F * rfU_2.break_(var2 * 0.33333334F + (float) Math.PI));
         this.case_.case_ = rfU_2.catch_(this.extends_, this.case_.case_, 0.3F * rfU_2.break_(var2 * 0.33333334F));
      }

      this.break_.class_(this.class_);
   }

   protected float class_(float var1, float var2, float var3) {
      float var4 = (var3 - var2) % (float) (Math.PI * 2);
      if (var4 < (float) -Math.PI) {
         var4 += (float) (Math.PI * 2);
      }

      if (var4 >= (float) Math.PI) {
         var4 -= (float) (Math.PI * 2);
      }

      return var2 + var1 * var4;
   }

   protected void class_(T var1, float var2) {
      if (!(this.final_ <= 0.0F)) {
         rpZ_2 var3 = this.class_((T)var1);
         Iq_1 var4 = this.class_(var3);
         float var5 = this.final_;
         this.byte_.catch_ = rfU_2.class_(rfU_2.byte_(var5) * (float) (Math.PI * 2)) * 0.2F;
         if (var3 == rpZ_2.LEFT) {
            this.byte_.catch_ *= -1.0F;
         }

         this.protected_.throws_ = rfU_2.class_(this.byte_.catch_) * 5.0F;
         this.protected_.byte_ = -rfU_2.break_(this.byte_.catch_) * 5.0F;
         this.throws_.throws_ = -rfU_2.class_(this.byte_.catch_) * 5.0F;
         this.throws_.byte_ = rfU_2.break_(this.byte_.catch_) * 5.0F;
         this.protected_.catch_ = this.protected_.catch_ + this.byte_.catch_;
         this.throws_.catch_ = this.throws_.catch_ + this.byte_.catch_;
         this.throws_.case_ = this.throws_.case_ + this.byte_.catch_;
         var5 = 1.0F - this.final_;
         var5 *= var5;
         var5 *= var5;
         var5 = 1.0F - var5;
         float var6 = rfU_2.class_(var5 * (float) Math.PI);
         float var7 = rfU_2.class_(this.final_ * (float) Math.PI) * -(this.class_.case_ - 0.7F) * 0.75F;
         var4.case_ = (float)((double)var4.case_ - ((double)var6 * 1.2 + (double)var7));
         var4.catch_ = var4.catch_ + this.byte_.catch_ * 2.0F;
         var4.private_ = var4.private_ + rfU_2.class_(this.final_ * (float) Math.PI) * -0.4F;
      }
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return ImmutableList.of(this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.break_);
   }

   private void break_(T var1) {
      switch (this.implements_) {
         case EMPTY:
            this.protected_.catch_ = 0.0F;
            break;
         case BLOCK:
            this.protected_.case_ = this.protected_.case_ * 0.5F - 0.9424779F;
            this.protected_.catch_ = (float) (-Math.PI / 6);
            break;
         case ITEM:
            this.protected_.case_ = this.protected_.case_ * 0.5F - (float) (Math.PI / 10);
            this.protected_.catch_ = 0.0F;
            break;
         case THROW_SPEAR:
            this.protected_.case_ = this.protected_.case_ * 0.5F - (float) Math.PI;
            this.protected_.catch_ = 0.0F;
            break;
         case BOW_AND_ARROW:
            this.protected_.catch_ = -0.1F + this.class_.catch_;
            this.throws_.catch_ = 0.1F + this.class_.catch_ + 0.4F;
            this.protected_.case_ = (float) (-Math.PI / 2) + this.class_.case_;
            this.throws_.case_ = (float) (-Math.PI / 2) + this.class_.case_;
            break;
         case CROSSBOW_CHARGE:
            Iy_1.class_(this.protected_, this.throws_, var1, true);
            break;
         case CROSSBOW_HOLD:
            Iy_1.class_(this.protected_, this.throws_, this.class_, true);
      }
   }

   public void b_(boolean var1) {
      this.class_.finally_ = var1;
      this.break_.finally_ = var1;
      this.byte_.finally_ = var1;
      this.protected_.finally_ = var1;
      this.throws_.finally_ = var1;
      this.case_.finally_ = var1;
      this.catch_.finally_ = var1;
   }
}
