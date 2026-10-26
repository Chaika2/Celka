package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class ww_3 extends tW_2<rGg_1> {
   private final Iq_1 native_;
   private final Iq_1 volatile_;

   public ww_3() {
      super(0.0F, 0.0F, 64, 64);
      this.catch_.finally_ = false;
      this.break_.finally_ = false;
      this.case_ = new Iq_1(this, 32, 0);
      this.case_.class_(-1.0F, -1.0F, -2.0F, 6.0F, 10.0F, 4.0F, 0.0F);
      this.case_.class_(-1.9F, 12.0F, 0.0F);
      this.volatile_ = new Iq_1(this, 0, 32);
      this.volatile_.class_(-20.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
      this.native_ = new Iq_1(this, 0, 32);
      this.native_.implements_ = true;
      this.native_.class_(0.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
   }

   public void class_(rGg_1 var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((rGg_1)var1, var2, var3, var4, var5, var6);
      if (var1.sx()) {
         if (var1.ss().class_()) {
            this.protected_.case_ = (float) (Math.PI * 3.0 / 2.0);
            this.throws_.case_ = (float) (Math.PI * 3.0 / 2.0);
         } else if (var1.Su() == rpZ_2.RIGHT) {
            this.protected_.case_ = 3.7699115F;
         } else {
            this.throws_.case_ = 3.7699115F;
         }
      }

      this.case_.case_ += (float) (Math.PI / 5);
      this.volatile_.throws_ = 2.0F;
      this.native_.throws_ = 2.0F;
      this.volatile_.protected_ = 1.0F;
      this.native_.protected_ = 1.0F;
      this.volatile_.catch_ = 0.47123894F + rfU_2.break_(var4 * 0.8F) * (float) Math.PI * 0.05F;
      this.native_.catch_ = -this.volatile_.catch_;
      this.native_.private_ = -0.47123894F;
      this.native_.case_ = 0.47123894F;
      this.volatile_.case_ = 0.47123894F;
      this.volatile_.private_ = 0.47123894F;
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return Iterables.concat(super.break_(), ImmutableList.of(this.volatile_, this.native_));
   }
}
