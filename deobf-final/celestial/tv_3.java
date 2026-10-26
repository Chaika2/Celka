package celestial;

import com.google.common.collect.ImmutableList;

public class tv_3<T extends an_3> extends tX_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;
   private final Iq_1 private_;

   public tv_3() {
      byte var1 = 16;
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F);
      this.class_.class_(0.0F, 15.0F, -4.0F);
      this.catch_ = new Iq_1(this, 14, 0);
      this.catch_.class_(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F);
      this.catch_.class_(0.0F, 15.0F, -4.0F);
      this.private_ = new Iq_1(this, 14, 4);
      this.private_.class_(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F);
      this.private_.class_(0.0F, 15.0F, -4.0F);
      this.break_ = new Iq_1(this, 0, 9);
      this.break_.class_(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F);
      this.break_.class_(0.0F, 16.0F, 0.0F);
      this.byte_ = new Iq_1(this, 26, 0);
      this.byte_.class_(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      this.byte_.class_(-2.0F, 19.0F, 1.0F);
      this.protected_ = new Iq_1(this, 26, 0);
      this.protected_.class_(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      this.protected_.class_(1.0F, 19.0F, 1.0F);
      this.throws_ = new Iq_1(this, 24, 13);
      this.throws_.class_(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
      this.throws_.class_(-4.0F, 13.0F, 0.0F);
      this.case_ = new Iq_1(this, 24, 13);
      this.case_.class_(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
      this.case_.class_(4.0F, 13.0F, 0.0F);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.catch_.case_ = this.class_.case_;
      this.catch_.catch_ = this.class_.catch_;
      this.private_.case_ = this.class_.case_;
      this.private_.catch_ = this.class_.catch_;
      this.break_.case_ = (float) (Math.PI / 2);
      this.byte_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
      this.protected_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.throws_.private_ = var4;
      this.case_.private_ = -var4;
   }

   @Override
   protected Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.catch_, this.private_);
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return ImmutableList.of(this.break_, this.byte_, this.protected_, this.throws_, this.case_);
   }
}
