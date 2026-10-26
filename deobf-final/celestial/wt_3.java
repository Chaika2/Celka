package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class wt_3<T extends rON> extends wk_3<T> {
   private final Iq_1 catch_;

   public wt_3(float var1) {
      super(12, var1, true, 120.0F, 0.0F, 9.0F, 6.0F, 120);
      this.return_ = 128;
      this.public_ = 64;
      this.class_ = new Iq_1(this, 3, 0);
      this.class_.class_(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F);
      this.class_.class_(0.0F, 19.0F, -10.0F);
      this.break_ = new Iq_1(this);
      this.break_.class_(7, 37).class_(-9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F, 0.0F);
      this.break_.class_(31, 1).class_(-5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F, 0.0F);
      this.break_.class_(0.0F, 11.0F, -10.0F);
      this.catch_ = new Iq_1(this);
      this.catch_.class_(70, 33).class_(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F, 0.0F);
      this.catch_.class_(0.0F, 11.0F, -10.0F);
      boolean var2 = true;
      this.byte_ = new Iq_1(this, 1, 23);
      this.byte_.class_(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
      this.byte_.class_(-3.5F, 22.0F, 11.0F);
      this.protected_ = new Iq_1(this, 1, 12);
      this.protected_.class_(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
      this.protected_.class_(3.5F, 22.0F, 11.0F);
      this.throws_ = new Iq_1(this, 27, 30);
      this.throws_.class_(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
      this.throws_.class_(-5.0F, 21.0F, -4.0F);
      this.case_ = new Iq_1(this, 27, 24);
      this.case_.class_(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
      this.case_.class_(5.0F, 21.0F, -4.0F);
   }

   @Override
   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      boolean var9 = this.catch_.finally_;
      if (var9) {
         var1.class_();
         var1.class_(0.0, -0.08F, 0.0);
      }

      super.class_(var1, var2, var3, var4, var5, var6, var7, var8);
      if (var9) {
         var1.break_();
      }
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      this.byte_.case_ = rfU_2.break_(var2 * 0.6662F * 0.6F) * 0.5F * var3;
      this.protected_.case_ = rfU_2.break_(var2 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * var3;
      this.throws_.private_ = rfU_2.break_(var2 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * var3;
      this.case_.private_ = rfU_2.break_(var2 * 0.6662F * 0.6F) * 0.5F * var3;
      this.throws_.case_ = 0.0F;
      this.case_.case_ = 0.0F;
      this.throws_.catch_ = 0.0F;
      this.case_.catch_ = 0.0F;
      this.byte_.catch_ = 0.0F;
      this.protected_.catch_ = 0.0F;
      this.catch_.case_ = (float) (Math.PI / 2);
      if (!var1.rT() && var1.BL()) {
         float var7 = var1.n() ? 4.0F : 1.0F;
         float var8 = var1.n() ? 2.0F : 1.0F;
         float var9 = 5.0F;
         this.throws_.catch_ = rfU_2.break_(var7 * var2 * 5.0F + (float) Math.PI) * 8.0F * var3 * var8;
         this.throws_.private_ = 0.0F;
         this.case_.catch_ = rfU_2.break_(var7 * var2 * 5.0F) * 8.0F * var3 * var8;
         this.case_.private_ = 0.0F;
         this.byte_.catch_ = rfU_2.break_(var2 * 5.0F + (float) Math.PI) * 3.0F * var3;
         this.byte_.case_ = 0.0F;
         this.protected_.catch_ = rfU_2.break_(var2 * 5.0F) * 3.0F * var3;
         this.protected_.case_ = 0.0F;
      }

      this.catch_.finally_ = !this.int_ && var1.L();
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return Iterables.concat(super.break_(), ImmutableList.of(this.catch_));
   }
}
