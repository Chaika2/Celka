package celestial;

public class tH_2<T extends iB_2> extends tW_2<T> {
   public boolean native_;
   public boolean volatile_;

   public tH_2(float var1) {
      super(0.0F, -14.0F, 64, 32);
      float var2 = -14.0F;
      this.break_ = new Iq_1(this, 0, 16);
      this.break_.class_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1 - 0.5F);
      this.break_.class_(0.0F, -14.0F, 0.0F);
      this.byte_ = new Iq_1(this, 32, 16);
      this.byte_.class_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.byte_.class_(0.0F, -14.0F, 0.0F);
      this.protected_ = new Iq_1(this, 56, 0);
      this.protected_.class_(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.protected_.class_(-3.0F, -12.0F, 0.0F);
      this.throws_ = new Iq_1(this, 56, 0);
      this.throws_.implements_ = true;
      this.throws_.class_(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.throws_.class_(5.0F, -12.0F, 0.0F);
      this.case_ = new Iq_1(this, 56, 0);
      this.case_.class_(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.case_.class_(-2.0F, -2.0F, 0.0F);
      this.catch_ = new Iq_1(this, 56, 0);
      this.catch_.implements_ = true;
      this.catch_.class_(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.catch_.class_(2.0F, -2.0F, 0.0F);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      this.class_.finally_ = true;
      float var7 = -14.0F;
      this.byte_.case_ = 0.0F;
      this.byte_.protected_ = -14.0F;
      this.byte_.throws_ = -0.0F;
      this.case_.case_ -= 0.0F;
      this.catch_.case_ -= 0.0F;
      this.protected_.case_ = (float)((double)this.protected_.case_ * 0.5);
      this.throws_.case_ = (float)((double)this.throws_.case_ * 0.5);
      this.case_.case_ = (float)((double)this.case_.case_ * 0.5);
      this.catch_.case_ = (float)((double)this.catch_.case_ * 0.5);
      float var8 = 0.4F;
      if (this.protected_.case_ > 0.4F) {
         this.protected_.case_ = 0.4F;
      }

      if (this.throws_.case_ > 0.4F) {
         this.throws_.case_ = 0.4F;
      }

      if (this.protected_.case_ < -0.4F) {
         this.protected_.case_ = -0.4F;
      }

      if (this.throws_.case_ < -0.4F) {
         this.throws_.case_ = -0.4F;
      }

      if (this.case_.case_ > 0.4F) {
         this.case_.case_ = 0.4F;
      }

      if (this.catch_.case_ > 0.4F) {
         this.catch_.case_ = 0.4F;
      }

      if (this.case_.case_ < -0.4F) {
         this.case_.case_ = -0.4F;
      }

      if (this.catch_.case_ < -0.4F) {
         this.catch_.case_ = -0.4F;
      }

      if (this.native_) {
         this.protected_.case_ = -0.5F;
         this.throws_.case_ = -0.5F;
         this.protected_.private_ = 0.05F;
         this.throws_.private_ = -0.05F;
      }

      this.protected_.throws_ = 0.0F;
      this.throws_.throws_ = 0.0F;
      this.case_.throws_ = 0.0F;
      this.catch_.throws_ = 0.0F;
      this.case_.protected_ = -5.0F;
      this.catch_.protected_ = -5.0F;
      this.class_.throws_ = -0.0F;
      this.class_.protected_ = -13.0F;
      this.break_.byte_ = this.class_.byte_;
      this.break_.protected_ = this.class_.protected_;
      this.break_.throws_ = this.class_.throws_;
      this.break_.case_ = this.class_.case_;
      this.break_.catch_ = this.class_.catch_;
      this.break_.private_ = this.class_.private_;
      if (this.volatile_) {
         float var9 = 1.0F;
         this.class_.protected_ -= 5.0F;
      }

      float var10 = -14.0F;
      this.protected_.class_(-5.0F, -12.0F, 0.0F);
      this.throws_.class_(5.0F, -12.0F, 0.0F);
   }
}
