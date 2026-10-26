package celestial;

import com.google.common.collect.ImmutableList;

public class tq_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 class_ = new Iq_1(this, 0, 0);
   private final Iq_1 break_;
   private final Iq_1 byte_;

   public tq_3() {
      this.class_.class_(-5.0F, 22.0F, -5.0F);
      this.class_.class_(0.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F);
      this.break_ = new Iq_1(this, 40, 0);
      this.break_.class_(1.5F, 22.0F, -4.0F);
      this.break_.class_(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
      this.byte_ = new Iq_1(this, 40, 0);
      this.byte_.class_(-1.5F, 22.0F, 4.0F);
      this.byte_.class_(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var2 * 2.0F;
      if (var7 > 1.0F) {
         var7 = 1.0F;
      }

      var7 = 1.0F - var7 * var7 * var7;
      this.break_.private_ = (float) Math.PI - var7 * 0.35F * (float) Math.PI;
      this.byte_.private_ = (float) Math.PI + var7 * 0.35F * (float) Math.PI;
      this.byte_.catch_ = (float) Math.PI;
      float var8 = (var2 + rfU_2.class_(var2 * 2.7F)) * 0.6F * 12.0F;
      this.break_.protected_ = 24.0F - var8;
      this.byte_.protected_ = this.break_.protected_;
      this.class_.protected_ = this.break_.protected_;
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.break_, this.byte_);
   }
}
