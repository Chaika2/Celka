package celestial;

import com.google.common.collect.ImmutableList;

public class tf_3 extends wN_2<rEI> {
   private static final float[] class_ = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
   private static final float[] break_ = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
   private static final float[] byte_ = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
   private static final float[] protected_ = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
   private static final float[] throws_ = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
   private static final float[] case_ = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
   private final Iq_1 catch_;
   private final Iq_1 private_;
   private final Iq_1[] implements_;
   private final Iq_1[] finally_;

   public tf_3() {
      this.return_ = 64;
      this.public_ = 64;
      this.implements_ = new Iq_1[12];
      this.catch_ = new Iq_1(this);
      this.catch_.class_(0, 0).class_(-6.0F, 10.0F, -8.0F, 12.0F, 12.0F, 16.0F);
      this.catch_.class_(0, 28).class_(-8.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F);
      this.catch_.class_(0, 28).class_(6.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F, true);
      this.catch_.class_(16, 40).class_(-6.0F, 8.0F, -6.0F, 12.0F, 2.0F, 12.0F);
      this.catch_.class_(16, 40).class_(-6.0F, 22.0F, -6.0F, 12.0F, 2.0F, 12.0F);

      for (int var1 = 0; var1 < this.implements_.length; var1++) {
         this.implements_[var1] = new Iq_1(this, 0, 0);
         this.implements_[var1].class_(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F);
         this.catch_.break_(this.implements_[var1]);
      }

      this.private_ = new Iq_1(this, 8, 0);
      this.private_.class_(-1.0F, 15.0F, 0.0F, 2.0F, 2.0F, 1.0F);
      this.catch_.break_(this.private_);
      this.finally_ = new Iq_1[3];
      this.finally_[0] = new Iq_1(this, 40, 0);
      this.finally_[0].class_(-2.0F, 14.0F, 7.0F, 4.0F, 4.0F, 8.0F);
      this.finally_[1] = new Iq_1(this, 0, 54);
      this.finally_[1].class_(0.0F, 14.0F, 0.0F, 3.0F, 3.0F, 7.0F);
      this.finally_[2] = new Iq_1(this);
      this.finally_[2].class_(41, 32).class_(0.0F, 14.0F, 0.0F, 2.0F, 2.0F, 6.0F);
      this.finally_[2].class_(25, 19).class_(1.0F, 10.5F, 3.0F, 1.0F, 9.0F, 9.0F);
      this.catch_.break_(this.finally_[0]);
      this.finally_[0].break_(this.finally_[1]);
      this.finally_[1].break_(this.finally_[2]);
      this.class_(0.0F, 0.0F);
   }

   private void class_(float var1, float var2) {
      for (int var3 = 0; var3 < 12; var3++) {
         this.implements_[var3].case_ = (float) Math.PI * class_[var3];
         this.implements_[var3].catch_ = (float) Math.PI * break_[var3];
         this.implements_[var3].private_ = (float) Math.PI * byte_[var3];
         this.implements_[var3].byte_ = protected_[var3] * (1.0F + rfU_2.break_(var1 * 1.5F + (float)var3) * 0.01F - var2);
         this.implements_[var3].protected_ = 16.0F + throws_[var3] * (1.0F + rfU_2.break_(var1 * 1.5F + (float)var3) * 0.01F - var2);
         this.implements_[var3].throws_ = case_[var3] * (1.0F + rfU_2.break_(var1 * 1.5F + (float)var3) * 0.01F - var2);
      }
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.catch_);
   }

   public void class_(rEI var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var4 - (float)((Integer)var1.throws_[41]).intValue();
      this.catch_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.catch_.case_ = var6 * (float) (Math.PI / 180.0);
      float var8 = (1.0F - var1.interface_(var7)) * 0.55F;
      this.class_(var4, var8);
      this.private_.throws_ = -8.25F;
      Object var9 = QY.instanceof_().catch_();
      if (var1.sk()) {
         var9 = var1.sW();
      }

      if (var9 != null) {
         rjU_2 var10 = ((an_3)var9).new_(0.0F);
         rjU_2 var11 = var1.new_(0.0F);
         double var12 = var10.byte_ - var11.byte_;
         if (var12 > 0.0) {
            this.private_.protected_ = 0.0F;
         } else {
            this.private_.protected_ = 1.0F;
         }

         rjU_2 var14 = var1.break_(0.0F);
         var14 = new rjU_2(var14.break_, 0.0, var14.protected_);
         rjU_2 var15 = new rjU_2(var11.break_ - var10.break_, 0.0, var11.protected_ - var10.protected_).protected_().break_((float) (Math.PI / 2));
         double var16 = var14.break_(var15);
         this.private_.byte_ = rfU_2.byte_((float)Math.abs(var16)) * 2.0F * (float)Math.signum(var16);
      }

      this.private_.finally_ = true;
      float var18 = var1.throw_(var7);
      this.finally_[0].catch_ = rfU_2.class_(var18) * (float) Math.PI * 0.05F;
      this.finally_[1].catch_ = rfU_2.class_(var18) * (float) Math.PI * 0.1F;
      this.finally_[1].byte_ = -1.5F;
      this.finally_[1].protected_ = 0.5F;
      this.finally_[1].throws_ = 14.0F;
      this.finally_[2].catch_ = rfU_2.class_(var18) * (float) Math.PI * 0.15F;
      this.finally_[2].byte_ = 0.5F;
      this.finally_[2].protected_ = 0.5F;
      this.finally_[2].throws_ = 6.0F;
   }
}
