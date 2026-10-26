package celestial;

import com.google.common.collect.ImmutableList;

public class wV_2<T extends rOH> extends wy_3<T> {
   private final Iq_1 class_ = new Iq_1(this, 0, 0);
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;
   private final Iq_1 private_;
   private final Iq_1 implements_;
   private final Iq_1 finally_;

   public wV_2() {
      this.class_.class_(-1.0F, 13.5F, -7.0F);
      this.break_ = new Iq_1(this, 0, 0);
      this.break_.class_(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F);
      this.class_.break_(this.break_);
      this.byte_ = new Iq_1(this, 18, 14);
      this.byte_.class_(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F);
      this.byte_.class_(0.0F, 14.0F, 2.0F);
      this.finally_ = new Iq_1(this, 21, 0);
      this.finally_.class_(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, 0.0F);
      this.finally_.class_(-1.0F, 14.0F, 2.0F);
      this.protected_ = new Iq_1(this, 0, 18);
      this.protected_.class_(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.protected_.class_(-2.5F, 16.0F, 7.0F);
      this.throws_ = new Iq_1(this, 0, 18);
      this.throws_.class_(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.throws_.class_(0.5F, 16.0F, 7.0F);
      this.case_ = new Iq_1(this, 0, 18);
      this.case_.class_(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.case_.class_(-2.5F, 16.0F, -4.0F);
      this.catch_ = new Iq_1(this, 0, 18);
      this.catch_.class_(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.catch_.class_(0.5F, 16.0F, -4.0F);
      this.private_ = new Iq_1(this, 9, 18);
      this.private_.class_(-1.0F, 12.0F, 8.0F);
      this.implements_ = new Iq_1(this, 9, 18);
      this.implements_.class_(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.private_.break_(this.implements_);
      this.break_.class_(16, 14).class_(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.break_.class_(16, 14).class_(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.break_.class_(0, 10).class_(-0.5F, 0.0F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F);
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.private_.case_ = var4;
   }

   public void class_(T var1, float var2, float var3, float var4) {
      if (var1.T_()) {
         this.private_.catch_ = 0.0F;
      } else {
         this.private_.catch_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
      }

      if (var1.Sc()) {
         this.finally_.class_(-1.0F, 16.0F, -3.0F);
         this.finally_.case_ = (float) (Math.PI * 2.0 / 5.0);
         this.finally_.catch_ = 0.0F;
         this.byte_.class_(0.0F, 18.0F, 0.0F);
         this.byte_.case_ = (float) (Math.PI / 4);
         this.private_.class_(-1.0F, 21.0F, 6.0F);
         this.protected_.class_(-2.5F, 22.7F, 2.0F);
         this.protected_.case_ = (float) (Math.PI * 3.0 / 2.0);
         this.throws_.class_(0.5F, 22.7F, 2.0F);
         this.throws_.case_ = (float) (Math.PI * 3.0 / 2.0);
         this.case_.case_ = 5.811947F;
         this.case_.class_(-2.49F, 17.0F, -4.0F);
         this.catch_.case_ = 5.811947F;
         this.catch_.class_(0.51F, 17.0F, -4.0F);
      } else {
         this.byte_.class_(0.0F, 14.0F, 2.0F);
         this.byte_.case_ = (float) (Math.PI / 2);
         this.finally_.class_(-1.0F, 14.0F, -3.0F);
         this.finally_.case_ = this.byte_.case_;
         this.private_.class_(-1.0F, 12.0F, 8.0F);
         this.protected_.class_(-2.5F, 16.0F, 7.0F);
         this.throws_.class_(0.5F, 16.0F, 7.0F);
         this.case_.class_(-2.5F, 16.0F, -4.0F);
         this.catch_.class_(0.5F, 16.0F, -4.0F);
         this.protected_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
         this.throws_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
         this.case_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
         this.catch_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
      }

      this.break_.private_ = var1.interface_(var4) + var1.break_(var4, 0.0F);
      this.finally_.private_ = var1.break_(var4, -0.08F);
      this.byte_.private_ = var1.break_(var4, -0.16F);
      this.implements_.private_ = var1.break_(var4, -0.2F);
   }

   @Override
   protected Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_);
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return ImmutableList.of(this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.private_, this.finally_);
   }
}
