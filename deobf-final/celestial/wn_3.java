package celestial;

import com.google.common.collect.ImmutableList;

public class wn_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;

   public wn_3() {
      float var1 = 4.0F;
      float var2 = 0.0F;
      this.byte_ = new Iq_1(this, 0, 0).break_(64, 64);
      this.byte_.class_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F);
      this.byte_.class_(0.0F, 4.0F, 0.0F);
      this.protected_ = new Iq_1(this, 32, 0).break_(64, 64);
      this.protected_.class_(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
      this.protected_.class_(0.0F, 6.0F, 0.0F);
      this.throws_ = new Iq_1(this, 32, 0).break_(64, 64);
      this.throws_.class_(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
      this.throws_.class_(0.0F, 6.0F, 0.0F);
      this.class_ = new Iq_1(this, 0, 16).break_(64, 64);
      this.class_.class_(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, -0.5F);
      this.class_.class_(0.0F, 13.0F, 0.0F);
      this.break_ = new Iq_1(this, 0, 36).break_(64, 64);
      this.break_.class_(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, -0.5F);
      this.break_.class_(0.0F, 24.0F, 0.0F);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.break_, this.byte_, this.protected_, this.throws_);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.byte_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.byte_.case_ = var6 * (float) (Math.PI / 180.0);
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0) * 0.25F;
      float var7 = rfU_2.class_(this.class_.catch_);
      float var8 = rfU_2.break_(this.class_.catch_);
      this.protected_.private_ = 1.0F;
      this.throws_.private_ = -1.0F;
      this.protected_.catch_ = 0.0F + this.class_.catch_;
      this.throws_.catch_ = (float) Math.PI + this.class_.catch_;
      this.protected_.byte_ = var8 * 5.0F;
      this.protected_.throws_ = -var7 * 5.0F;
      this.throws_.byte_ = -var8 * 5.0F;
      this.throws_.throws_ = var7 * 5.0F;
   }

   public Iq_1 break_() {
      return this.byte_;
   }
}
