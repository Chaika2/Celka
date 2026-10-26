package celestial;

public class wR_2<T extends rbB_2> extends tW_2<T> implements to_3 {
   private Iq_1 native_;

   public wR_2(float var1, boolean var2) {
      super(var1, 0.0F, 64, var2 ? 32 : 64);
      if (var2) {
         this.class_ = new Iq_1(this, 0, 0);
         this.class_.class_(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
         this.byte_ = new Iq_1(this, 16, 16);
         this.byte_.class_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1 + 0.1F);
         this.case_ = new Iq_1(this, 0, 16);
         this.case_.class_(-2.0F, 12.0F, 0.0F);
         this.case_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.1F);
         this.catch_ = new Iq_1(this, 0, 16);
         this.catch_.implements_ = true;
         this.catch_.class_(2.0F, 12.0F, 0.0F);
         this.catch_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.1F);
      } else {
         this.class_ = new Iq_1(this, 0, 0);
         this.class_.class_(0, 0).class_(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
         this.class_.class_(24, 0).class_(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
         this.break_ = new Iq_1(this, 32, 0);
         this.break_.class_(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1 + 0.5F);
         this.native_ = new Iq_1(this);
         this.native_.class_(30, 47).class_(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F, var1);
         this.native_.case_ = (float) (-Math.PI / 2);
         this.break_.break_(this.native_);
         this.byte_ = new Iq_1(this, 16, 20);
         this.byte_.class_(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
         this.byte_.class_(0, 38).class_(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.05F);
         this.protected_ = new Iq_1(this, 44, 22);
         this.protected_.class_(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.protected_.class_(-5.0F, 2.0F, 0.0F);
         this.throws_ = new Iq_1(this, 44, 22);
         this.throws_.implements_ = true;
         this.throws_.class_(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.throws_.class_(5.0F, 2.0F, 0.0F);
         this.case_ = new Iq_1(this, 0, 22);
         this.case_.class_(-2.0F, 12.0F, 0.0F);
         this.case_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.catch_ = new Iq_1(this, 0, 22);
         this.catch_.implements_ = true;
         this.catch_.class_(2.0F, 12.0F, 0.0F);
         this.catch_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      }
   }

   @Override
   public void class_(boolean var1) {
      this.class_.finally_ = var1;
      this.break_.finally_ = var1;
      this.native_.finally_ = var1;
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      Iy_1.class_(this.throws_, this.protected_, var1.v(), this.final_, var4);
   }
}
