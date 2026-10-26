package celestial;

import com.google.common.collect.ImmutableList;

public class wz_3 extends wN_2<rGx_1> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;
   private final Iq_1 private_;

   public wz_3() {
      this.return_ = 128;
      this.public_ = 128;
      byte var1 = 16;
      float var2 = 0.0F;
      this.private_ = new Iq_1(this);
      this.private_.class_(0.0F, -7.0F, -1.5F);
      this.private_.class_(68, 73).class_(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F, 0.0F);
      this.class_ = new Iq_1(this);
      this.class_.class_(0.0F, 16.0F, -17.0F);
      this.class_.class_(0, 0).class_(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F, 0.0F);
      this.class_.class_(0, 0).class_(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F, 0.0F);
      Iq_1 var3 = new Iq_1(this);
      var3.class_(-10.0F, -14.0F, -8.0F);
      var3.class_(74, 55).class_(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
      var3.case_ = 1.0995574F;
      this.class_.break_(var3);
      Iq_1 var4 = new Iq_1(this);
      var4.implements_ = true;
      var4.class_(8.0F, -14.0F, -8.0F);
      var4.class_(74, 55).class_(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
      var4.case_ = 1.0995574F;
      this.class_.break_(var4);
      this.break_ = new Iq_1(this);
      this.break_.class_(0.0F, -2.0F, 2.0F);
      this.break_.class_(0, 36).class_(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F, 0.0F);
      this.class_.break_(this.break_);
      this.private_.break_(this.class_);
      this.byte_ = new Iq_1(this);
      this.byte_.class_(0, 55).class_(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F, 0.0F);
      this.byte_.class_(0, 91).class_(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F, 0.0F);
      this.byte_.class_(0.0F, 1.0F, 2.0F);
      this.protected_ = new Iq_1(this, 96, 0);
      this.protected_.class_(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.protected_.class_(-8.0F, -13.0F, 18.0F);
      this.throws_ = new Iq_1(this, 96, 0);
      this.throws_.implements_ = true;
      this.throws_.class_(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.throws_.class_(8.0F, -13.0F, 18.0F);
      this.case_ = new Iq_1(this, 64, 0);
      this.case_.class_(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.case_.class_(-8.0F, -13.0F, -5.0F);
      this.catch_ = new Iq_1(this, 64, 0);
      this.catch_.implements_ = true;
      this.catch_.class_(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.catch_.class_(8.0F, -13.0F, -5.0F);
   }

   public void class_(rGx_1 var1, float var2, float var3, float var4) {
      super.class_(var1, var2, var3, var4);
      int var5 = var1.sc();
      int var6 = var1.sn();
      byte var7 = 20;
      int var8 = var1.sN();
      byte var9 = 10;
      if (var8 > 0) {
         float var10 = rfU_2.throws_((float)var8 - var4, 10.0F);
         float var11 = (1.0F + var10) * 0.5F;
         float var12 = var11 * var11 * var11 * 12.0F;
         float var13 = var12 * rfU_2.class_(this.private_.case_);
         this.private_.throws_ = -6.5F + var12;
         this.private_.protected_ = -7.0F - var13;
         float var14 = rfU_2.class_(((float)var8 - var4) / 10.0F * (float) Math.PI * 0.25F);
         this.break_.case_ = (float) (Math.PI / 2) * var14;
         if (var8 > 5) {
            this.break_.case_ = rfU_2.class_(((float)(-4 + var8) - var4) / 4.0F) * (float) Math.PI * 0.4F;
         } else {
            this.break_.case_ = (float) (Math.PI / 20) * rfU_2.class_((float) Math.PI * ((float)var8 - var4) / 10.0F);
         }
      } else {
         float var15 = -1.0F;
         float var16 = -1.0F * rfU_2.class_(this.private_.case_);
         this.private_.byte_ = 0.0F;
         this.private_.protected_ = -7.0F - var16;
         this.private_.throws_ = 5.5F;
         boolean var17 = var5 > 0;
         this.private_.case_ = var17 ? 0.2199115F : 0.0F;
         this.break_.case_ = (float) Math.PI * (var17 ? 0.05F : 0.01F);
         if (var17) {
            double var18 = (double)var5 / 40.0;
            this.private_.byte_ = (float)Math.sin(var18 * 10.0) * 3.0F;
         } else if (var6 > 0) {
            float var19 = rfU_2.class_(((float)(20 - var6) - var4) / 20.0F * (float) Math.PI * 0.25F);
            this.break_.case_ = (float) (Math.PI / 2) * var19;
         }
      }
   }

   public void class_(rGx_1 var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.byte_.case_ = (float) (Math.PI / 2);
      float var7 = 0.4F * var3;
      this.protected_.case_ = rfU_2.break_(var2 * 0.6662F) * var7;
      this.throws_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * var7;
      this.case_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * var7;
      this.catch_.case_ = rfU_2.break_(var2 * 0.6662F) * var7;
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.private_, this.byte_, this.protected_, this.throws_, this.case_, this.catch_);
   }
}
