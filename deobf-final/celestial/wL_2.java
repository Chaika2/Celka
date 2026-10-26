package celestial;

public class wL_2<T extends is_3 & aa_3> extends tW_2<T> {
   public wL_2() {
      this(0.0F, false);
   }

   public wL_2(float var1, boolean var2) {
      super(var1);
      if (!var2) {
         this.protected_ = new Iq_1(this, 40, 16);
         this.protected_.class_(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.protected_.class_(-5.0F, 2.0F, 0.0F);
         this.throws_ = new Iq_1(this, 40, 16);
         this.throws_.implements_ = true;
         this.throws_.class_(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.throws_.class_(5.0F, 2.0F, 0.0F);
         this.case_ = new Iq_1(this, 0, 16);
         this.case_.class_(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.case_.class_(-2.0F, 12.0F, 0.0F);
         this.catch_ = new Iq_1(this, 0, 16);
         this.catch_.implements_ = true;
         this.catch_.class_(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.catch_.class_(2.0F, 12.0F, 0.0F);
      }
   }

   @Override
   public void class_(rpZ_2 var1, Ml_1 var2) {
      float var3 = var1 == rpZ_2.RIGHT ? 1.0F : -1.0F;
      Iq_1 var4 = this.class_(var1);
      var4.byte_ += var3;
      var4.class_(var2);
      var4.byte_ -= var3;
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      rdn_3 var7 = var1.ss();
      if (var1.v() && (var7.class_() || var7.break_() != rdy_3.OM)) {
         float var8 = rfU_2.class_(this.final_ * (float) Math.PI);
         float var9 = rfU_2.class_((1.0F - (1.0F - this.final_) * (1.0F - this.final_)) * (float) Math.PI);
         this.protected_.private_ = 0.0F;
         this.throws_.private_ = 0.0F;
         this.protected_.catch_ = -(0.1F - var8 * 0.6F);
         this.throws_.catch_ = 0.1F - var8 * 0.6F;
         this.protected_.case_ = (float) (-Math.PI / 2);
         this.throws_.case_ = (float) (-Math.PI / 2);
         this.protected_.case_ -= var8 * 1.2F - var9 * 0.4F;
         this.throws_.case_ -= var8 * 1.2F - var9 * 0.4F;
         Iy_1.class_(this.protected_, this.throws_, var4);
      }
   }

   public void class_(T var1, float var2, float var3, float var4) {
      this.implements_ = tQ_2.EMPTY;
      this.private_ = tQ_2.EMPTY;
      rdn_3 var5 = var1.protected_(rpm_3.MAIN_HAND);
      if (var5.break_() == rdy_3.OM && var1.v()) {
         if (var1.Su() == rpZ_2.RIGHT) {
            this.implements_ = tQ_2.BOW_AND_ARROW;
         } else {
            this.private_ = tQ_2.BOW_AND_ARROW;
         }
      }

      super.class_((T)var1, var2, var3, var4);
   }
}
