package celestial;

import com.google.common.collect.ImmutableList;

public class wH_2<T extends rOk_1> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;
   private final Iq_1 private_;
   private final Iq_1 implements_;

   public wH_2() {
      this.return_ = 64;
      this.public_ = 128;
      this.class_ = new Iq_1(this, 0, 32);
      this.class_.class_(-4.0F, 8.0F, 0.0F);
      this.class_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
      this.break_ = new Iq_1(this, 0, 55);
      this.break_.class_(4.0F, 8.0F, 0.0F);
      this.break_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
      this.byte_ = new Iq_1(this, 0, 0);
      this.byte_.class_(0.0F, 1.0F, 0.0F);
      this.byte_.class_(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F, 0.0F);
      this.protected_ = new Iq_1(this, 16, 65);
      this.protected_.class_(-8.0F, 4.0F, -8.0F);
      this.protected_.class_(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.class_(this.protected_, 0.0F, 0.0F, -1.2217305F);
      this.throws_ = new Iq_1(this, 16, 49);
      this.throws_.class_(-8.0F, -1.0F, -8.0F);
      this.throws_.class_(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.class_(this.throws_, 0.0F, 0.0F, -1.134464F);
      this.case_ = new Iq_1(this, 16, 33);
      this.case_.class_(-8.0F, -5.0F, -8.0F);
      this.case_.class_(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.class_(this.case_, 0.0F, 0.0F, -0.87266463F);
      this.catch_ = new Iq_1(this, 16, 33);
      this.catch_.class_(8.0F, -6.0F, -8.0F);
      this.catch_.class_(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.class_(this.catch_, 0.0F, 0.0F, 0.87266463F);
      this.private_ = new Iq_1(this, 16, 49);
      this.private_.class_(8.0F, -2.0F, -8.0F);
      this.private_.class_(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.class_(this.private_, 0.0F, 0.0F, 1.134464F);
      this.implements_ = new Iq_1(this, 16, 65);
      this.implements_.class_(8.0F, 3.0F, -8.0F);
      this.implements_.class_(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.class_(this.implements_, 0.0F, 0.0F, 1.2217305F);
      this.byte_.break_(this.protected_);
      this.byte_.break_(this.throws_);
      this.byte_.break_(this.case_);
      this.byte_.break_(this.catch_);
      this.byte_.break_(this.private_);
      this.byte_.break_(this.implements_);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.byte_, this.break_, this.class_);
   }

   public void class_(Iq_1 var1, float var2, float var3, float var4) {
      var1.case_ = var2;
      var1.catch_ = var3;
      var1.private_ = var4;
   }

   public void class_(rOk_1 var1, float var2, float var3, float var4, float var5, float var6) {
      var3 = Math.min(0.25F, var3);
      if (var1.Bh().size() <= 0) {
         this.byte_.case_ = var6 * (float) (Math.PI / 180.0);
         this.byte_.catch_ = var5 * (float) (Math.PI / 180.0);
      } else {
         this.byte_.case_ = 0.0F;
         this.byte_.catch_ = 0.0F;
      }

      float var7 = 1.5F;
      this.byte_.private_ = 0.1F * rfU_2.class_(var2 * 1.5F) * 4.0F * var3;
      this.byte_.protected_ = 2.0F;
      this.byte_.protected_ = this.byte_.protected_ - 2.0F * rfU_2.break_(var2 * 1.5F) * 2.0F * var3;
      this.break_.case_ = rfU_2.class_(var2 * 1.5F * 0.5F) * 2.0F * var3;
      this.class_.case_ = rfU_2.class_(var2 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * var3;
      this.break_.private_ = (float) (Math.PI / 18) * rfU_2.break_(var2 * 1.5F * 0.5F) * var3;
      this.class_.private_ = (float) (Math.PI / 18) * rfU_2.break_(var2 * 1.5F * 0.5F + (float) Math.PI) * var3;
      this.break_.protected_ = 8.0F + 2.0F * rfU_2.class_(var2 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * var3;
      this.class_.protected_ = 8.0F + 2.0F * rfU_2.class_(var2 * 1.5F * 0.5F) * 2.0F * var3;
      this.protected_.private_ = -1.2217305F;
      this.throws_.private_ = -1.134464F;
      this.case_.private_ = -0.87266463F;
      this.catch_.private_ = 0.87266463F;
      this.private_.private_ = 1.134464F;
      this.implements_.private_ = 1.2217305F;
      float var8 = rfU_2.break_(var2 * 1.5F + (float) Math.PI) * var3;
      this.protected_.private_ += var8 * 1.3F;
      this.throws_.private_ += var8 * 1.2F;
      this.case_.private_ += var8 * 0.6F;
      this.catch_.private_ += var8 * 0.6F;
      this.private_.private_ += var8 * 1.2F;
      this.implements_.private_ += var8 * 1.3F;
      float var9 = 1.0F;
      float var10 = 1.0F;
      this.protected_.private_ = this.protected_.private_ + 0.05F * rfU_2.class_(var4 * 1.0F * -0.4F);
      this.throws_.private_ = this.throws_.private_ + 0.1F * rfU_2.class_(var4 * 1.0F * 0.2F);
      this.case_.private_ = this.case_.private_ + 0.1F * rfU_2.class_(var4 * 1.0F * 0.4F);
      this.catch_.private_ = this.catch_.private_ + 0.1F * rfU_2.class_(var4 * 1.0F * 0.4F);
      this.private_.private_ = this.private_.private_ + 0.1F * rfU_2.class_(var4 * 1.0F * 0.2F);
      this.implements_.private_ = this.implements_.private_ + 0.05F * rfU_2.class_(var4 * 1.0F * -0.4F);
   }
}
