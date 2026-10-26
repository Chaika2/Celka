package celestial;

public class CA extends CH {
   private final In_1 class_ = new tf_3();
   private final HU break_ = HU.private_(pT_2.class_);

   CA(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.else_ = 0.0F;
      this.this_ = 30;
   }

   @Override
   public CJ class_() {
      return CJ.throws_;
   }

   @Override
   public void class_(Ok_1 var1, ly_3 var2, float var3) {
      float var4 = ((float)this.super_ + var3) / (float)this.this_;
      float var5 = 0.05F + 0.5F * rfU_2.class_(var4 * (float) Math.PI);
      Ml_1 var6 = new Ml_1();
      var6.class_(var2.case_());
      var6.class_(rje_3.break_.byte_(150.0F * var4 - 60.0F));
      var6.class_(-1.0F, -1.0F, 1.0F);
      var6.class_(0.0, -1.101F, 1.5);
      Hd_1 var7 = QY.instanceof_().interface_().break_();
      Ok_1 var8 = var7.getBuffer(this.break_);
      this.class_.class_(var6, var8, 15728880, fZ_2.class_, 1.0F, 1.0F, 1.0F, var5);
      var7.break_();
   }
}
