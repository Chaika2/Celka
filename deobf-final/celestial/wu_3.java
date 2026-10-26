package celestial;

public class wu_3<T extends rOb_1> extends wk_3<T> {
   private float catch_;

   public wu_3() {
      super(12, 0.0F, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.6F);
      this.class_.class_(0.0F, 6.0F, -8.0F);
      this.break_ = new Iq_1(this, 28, 8);
      this.break_.class_(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, 1.75F);
      this.break_.class_(0.0F, 5.0F, 2.0F);
      float var1 = 0.5F;
      this.byte_ = new Iq_1(this, 0, 16);
      this.byte_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.byte_.class_(-3.0F, 12.0F, 7.0F);
      this.protected_ = new Iq_1(this, 0, 16);
      this.protected_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.protected_.class_(3.0F, 12.0F, 7.0F);
      this.throws_ = new Iq_1(this, 0, 16);
      this.throws_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.throws_.class_(-3.0F, 12.0F, -5.0F);
      this.case_ = new Iq_1(this, 0, 16);
      this.case_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.case_.class_(3.0F, 12.0F, -5.0F);
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      this.class_.case_ = this.catch_;
   }

   public void class_(T var1, float var2, float var3, float var4) {
      super.class_((T)var1, var2, var3, var4);
      this.class_.protected_ = 6.0F + var1.throw_(var4) * 9.0F;
      this.catch_ = var1.interface_(var4);
   }
}
