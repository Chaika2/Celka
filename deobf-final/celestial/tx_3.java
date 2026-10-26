package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class tx_3 extends tJ_2 {
   private final Iq_1 native_;
   private final Iq_1 volatile_;
   private final Iq_1 new_;
   private final Iq_1 continue_;

   public tx_3() {
      this(0.0F);
   }

   public tx_3(float var1) {
      super(var1, 64, 64);
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.class_.class_(0.0F, 0.0F, 0.0F);
      this.byte_ = new Iq_1(this, 0, 26);
      this.byte_.class_(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F, var1);
      this.byte_.class_(0.0F, 0.0F, 0.0F);
      this.protected_ = new Iq_1(this, 24, 0);
      this.protected_.class_(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
      this.protected_.class_(-5.0F, 2.0F, 0.0F);
      this.throws_ = new Iq_1(this, 32, 16);
      this.throws_.implements_ = true;
      this.throws_.class_(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
      this.throws_.class_(5.0F, 2.0F, 0.0F);
      this.case_ = new Iq_1(this, 8, 0);
      this.case_.class_(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, var1);
      this.case_.class_(-1.9F, 12.0F, 0.0F);
      this.catch_ = new Iq_1(this, 40, 16);
      this.catch_.implements_ = true;
      this.catch_.class_(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, var1);
      this.catch_.class_(1.9F, 12.0F, 0.0F);
      this.native_ = new Iq_1(this, 16, 0);
      this.native_.class_(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.native_.class_(0.0F, 0.0F, 0.0F);
      this.native_.finally_ = true;
      this.volatile_ = new Iq_1(this, 48, 16);
      this.volatile_.class_(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.volatile_.class_(0.0F, 0.0F, 0.0F);
      this.new_ = new Iq_1(this, 0, 48);
      this.new_.class_(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F, var1);
      this.new_.class_(0.0F, 0.0F, 0.0F);
      this.continue_ = new Iq_1(this, 0, 32);
      this.continue_.class_(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F, var1);
      this.continue_.class_(0.0F, 12.0F, 0.0F);
      this.break_.finally_ = false;
   }

   public void class_(rSY var1, float var2, float var3, float var4) {
      this.continue_.case_ = 0.0F;
      this.continue_.catch_ = (float) (Math.PI / 180.0) * -rfU_2.private_(var4, (Float)var1.throws_[17], (Float)var1.throws_[15]);
      this.continue_.private_ = 0.0F;
   }

   @Override
   public void class_(rSY var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_(var1, var2, var3, var4, var5, var6);
      this.throws_.finally_ = var1.catch_();
      this.protected_.finally_ = var1.catch_();
      this.continue_.finally_ = !var1.private_();
      this.catch_.class_(1.9F, 12.0F, 0.0F);
      this.case_.class_(-1.9F, 12.0F, 0.0F);
      this.native_.case_ = (float) (Math.PI / 180.0) * var1.package_().break_();
      this.native_.catch_ = (float) (Math.PI / 180.0) * var1.package_().byte_();
      this.native_.private_ = (float) (Math.PI / 180.0) * var1.package_().protected_();
      this.volatile_.case_ = (float) (Math.PI / 180.0) * var1.package_().break_();
      this.volatile_.catch_ = (float) (Math.PI / 180.0) * var1.package_().byte_();
      this.volatile_.private_ = (float) (Math.PI / 180.0) * var1.package_().protected_();
      this.new_.case_ = (float) (Math.PI / 180.0) * var1.package_().break_();
      this.new_.catch_ = (float) (Math.PI / 180.0) * var1.package_().byte_();
      this.new_.private_ = (float) (Math.PI / 180.0) * var1.package_().protected_();
   }

   @Override
   public void class_(rpZ_2 var1, Ml_1 var2) {
      Iq_1 var3 = this.class_(var1);
      boolean var4 = var3.finally_;
      var3.finally_ = true;
      super.class_(var1, var2);
      var3.finally_ = var4;
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return Iterables.concat(super.break_(), ImmutableList.of(this.native_, this.volatile_, this.new_, this.continue_));
   }
}
