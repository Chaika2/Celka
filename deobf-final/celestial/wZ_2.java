package celestial;

import com.google.common.collect.ImmutableList;

public class wZ_2<T extends an_3> extends wN_2<T> {
   private final Iq_1 class_;

   public wZ_2() {
      this.return_ = 64;
      this.public_ = 32;
      this.class_ = new Iq_1(this);
      this.class_.class_(0, 0).class_(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F, 0.0F);
      this.class_.class_(0, 10).class_(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F, 0.0F);
      this.class_.class_(20, 0).class_(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F);
      this.class_.class_(0.0F, 0.0F, 0.0F);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
   }
}
