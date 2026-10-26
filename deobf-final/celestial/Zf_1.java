package celestial;

public class Zf_1 extends LZ {
   final ZI throws_;
   private boolean case_;

   public Zf_1(Zt_1 var1, ZI var2, int var3, int var4) {
      super(var3, var4, 25, 25, var2.class_());
      this.class_ = var1;
      this.throws_ = var2;
   }

   private void class_(Ml_1 var1, fY_2 var2) {
      var2.class_(Zt_1.class_);
      var1.class_();
      var1.class_((double)this.volatile_, (double)this.final_, 0.0);
      class_(var1, 0, 0, 0.0F, 75.0F, 25, 25, 128, 128);
      var1.break_();
   }

   public void class_(boolean var1) {
      this.case_ = var1;
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      QY var5 = QY.instanceof_();
      this.class_(var1, var5.A());
      this.throws_.class_(this.class_.final_, this.volatile_ + 5, this.final_ + 5);
      if (this.case_) {
         this.break_(var1, var5.A());
      }
   }

   private void break_(Ml_1 var1, fY_2 var2) {
      var2.class_(Zt_1.class_);
      var1.class_();
      var1.class_((double)this.volatile_, (double)this.final_, 0.0);
      class_(var1, 0, 0, 25.0F, 75.0F, 25, 25, 128, 128);
      var1.break_();
   }

   @Override
   public boolean B_() {
      return super.B_() || this.case_;
   }
}
