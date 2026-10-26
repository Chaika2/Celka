package celestial;

public class wf_3<T extends an_3> extends wI_2<T> {
   private boolean finally_;
   private final Iq_1 extends_ = new Iq_1(this).break_(64, 128);

   public wf_3(float var1) {
      super(var1, 64, 128);
      this.extends_.class_(0.0F, -2.0F, 0.0F);
      this.extends_.class_(0, 0).class_(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, -0.25F);
      this.implements_.break_(this.extends_);
      this.class_ = new Iq_1(this).break_(64, 128);
      this.class_.class_(0.0F, 0.0F, 0.0F);
      this.class_.class_(0, 0).class_(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.break_ = new Iq_1(this).break_(64, 128);
      this.break_.class_(-5.0F, -10.03125F, -5.0F);
      this.break_.class_(0, 64).class_(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F);
      this.class_.break_(this.break_);
      this.class_.break_(this.implements_);
      Iq_1 var2 = new Iq_1(this).break_(64, 128);
      var2.class_(1.75F, -4.0F, 2.0F);
      var2.class_(0, 76).class_(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F);
      var2.case_ = -0.05235988F;
      var2.private_ = 0.02617994F;
      this.break_.break_(var2);
      Iq_1 var3 = new Iq_1(this).break_(64, 128);
      var3.class_(1.75F, -4.0F, 2.0F);
      var3.class_(0, 87).class_(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F);
      var3.case_ = -0.10471976F;
      var3.private_ = 0.05235988F;
      var2.break_(var3);
      Iq_1 var4 = new Iq_1(this).break_(64, 128);
      var4.class_(1.75F, -2.0F, 2.0F);
      var4.class_(0, 95).class_(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.25F);
      var4.case_ = (float) (-Math.PI / 15);
      var4.private_ = 0.10471976F;
      var3.break_(var4);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      this.implements_.class_(0.0F, -2.0F, 0.0F);
      float var7 = 0.01F * (float)(var1.V() % 10);
      this.implements_.case_ = rfU_2.class_((float)((Integer)var1.throws_[41]).intValue() * var7) * 4.5F * (float) (Math.PI / 180.0);
      this.implements_.catch_ = 0.0F;
      this.implements_.private_ = rfU_2.break_((float)((Integer)var1.throws_[41]).intValue() * var7) * 2.5F * (float) (Math.PI / 180.0);
      if (this.finally_) {
         this.implements_.class_(0.0F, 1.0F, -1.5F);
         this.implements_.case_ = -0.9F;
      }
   }

   public void break_(boolean var1) {
      this.finally_ = var1;
   }

   public Iq_1 break_() {
      return this.implements_;
   }
}
