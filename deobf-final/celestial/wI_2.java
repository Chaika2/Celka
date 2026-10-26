package celestial;

import com.google.common.collect.ImmutableList;

public class wI_2<T extends an_3> extends wN_2<T> implements tY_2, to_3 {
   protected Iq_1 class_;
   protected Iq_1 break_;
   protected final Iq_1 byte_;
   protected final Iq_1 protected_;
   protected final Iq_1 throws_;
   protected final Iq_1 case_;
   protected final Iq_1 catch_;
   protected final Iq_1 private_;
   protected final Iq_1 implements_;

   @Override
   public Iq_1 byte_() {
      return this.class_;
   }

   public wI_2(float var1) {
      this(var1, 64, 64);
   }

   public wI_2(float var1, int var2, int var3) {
      float var4 = 0.5F;
      this.class_ = new Iq_1(this).break_(var2, var3);
      this.class_.class_(0.0F, 0.0F, 0.0F);
      this.class_.class_(0, 0).class_(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.break_ = new Iq_1(this).break_(var2, var3);
      this.break_.class_(0.0F, 0.0F, 0.0F);
      this.break_.class_(32, 0).class_(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1 + 0.5F);
      this.class_.break_(this.break_);
      this.byte_ = new Iq_1(this).break_(var2, var3);
      this.byte_.class_(0.0F, 0.0F, 0.0F);
      this.byte_.class_(30, 47).class_(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F, var1);
      this.byte_.case_ = (float) (-Math.PI / 2);
      this.break_.break_(this.byte_);
      this.implements_ = new Iq_1(this).break_(var2, var3);
      this.implements_.class_(0.0F, -2.0F, 0.0F);
      this.implements_.class_(24, 0).class_(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
      this.class_.break_(this.implements_);
      this.protected_ = new Iq_1(this).break_(var2, var3);
      this.protected_.class_(0.0F, 0.0F, 0.0F);
      this.protected_.class_(16, 20).class_(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
      this.throws_ = new Iq_1(this).break_(var2, var3);
      this.throws_.class_(0.0F, 0.0F, 0.0F);
      this.throws_.class_(0, 38).class_(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.5F);
      this.protected_.break_(this.throws_);
      this.case_ = new Iq_1(this).break_(var2, var3);
      this.case_.class_(0.0F, 2.0F, 0.0F);
      this.case_.class_(44, 22).class_(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      this.case_.class_(44, 22).class_(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1, true);
      this.case_.class_(40, 38).class_(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, var1);
      this.catch_ = new Iq_1(this, 0, 22).break_(var2, var3);
      this.catch_.class_(-2.0F, 12.0F, 0.0F);
      this.catch_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.private_ = new Iq_1(this, 0, 22).break_(var2, var3);
      this.private_.implements_ = true;
      this.private_.class_(2.0F, 12.0F, 0.0F);
      this.private_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
   }

   @Override
   public void class_(boolean var1) {
      this.class_.finally_ = var1;
      this.break_.finally_ = var1;
      this.byte_.finally_ = var1;
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var7 = false;
      if (var1 instanceof rsy_3) {
         var7 = ((rsy_3)var1).L() > 0;
      }

      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      if (var7) {
         this.class_.private_ = 0.3F * rfU_2.class_(0.45F * var4);
         this.class_.case_ = 0.4F;
      } else {
         this.class_.private_ = 0.0F;
      }

      this.case_.protected_ = 3.0F;
      this.case_.throws_ = -1.0F;
      this.case_.case_ = -0.75F;
      this.catch_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3 * 0.5F;
      this.private_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 * 0.5F;
      this.catch_.catch_ = 0.0F;
      this.private_.catch_ = 0.0F;
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.protected_, this.catch_, this.private_, this.case_);
   }
}
