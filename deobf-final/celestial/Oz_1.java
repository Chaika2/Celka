package celestial;

public class Oz_1 extends Od_1 {
   private final Ok_1 private_;
   private final rjV_2 implements_;
   private final rjj_3 finally_;
   private float extends_;
   private float native_;
   private float volatile_;
   private int final_;
   private int package_;
   private int int_;
   private float new_;
   private float continue_;
   private float super_;

   @Override
   public Ok_1 byte_(int var1, int var2) {
      this.int_ = var1 | var2 << 16;
      return this;
   }

   public Oz_1(Ok_1 var1, rjV_2 var2, rjj_3 var3) {
      this.private_ = var1;
      this.implements_ = var2.case_();
      this.implements_.throws_();
      this.finally_ = var3.case_();
      this.finally_.throws_();
      this.case_();
   }

   @Override
   public Ok_1 class_(int var1) {
      return this;
   }

   @Override
   public Ok_1 class_(int var1, int var2) {
      return this;
   }

   @Override
   public Ok_1 class_(float var1, float var2) {
      return this;
   }

   @Override
   public Ok_1 class_(float var1, float var2, float var3) {
      this.new_ = var1;
      this.continue_ = var2;
      this.super_ = var3;
      return this;
   }

   @Override
   public void class_() {
      rje_3 var1 = new rje_3(this.new_, this.continue_, this.super_);
      var1.class_(this.finally_);
      rpr_3 var2 = rpr_3.class_(var1.class_(), var1.break_(), var1.byte_());
      rji_3 var3 = new rji_3(this.extends_, this.native_, this.volatile_, 1.0F);
      var3.class_(this.implements_);
      var3.class_(rje_3.protected_.byte_(180.0F));
      var3.class_(rje_3.break_.byte_(-90.0F));
      var3.class_(var2.break_());
      float var4 = -var3.class_();
      float var5 = -var3.break_();
      this.private_
         .class_((double)this.extends_, (double)this.native_, (double)this.volatile_)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(var4, var5)
         .break_(this.final_, this.package_)
         .break_(this.int_)
         .class_(this.new_, this.continue_, this.super_)
         .class_();
      this.case_();
   }

   @Override
   public Ok_1 class_(double var1, double var3, double var5) {
      this.extends_ = (float)var1;
      this.native_ = (float)var3;
      this.volatile_ = (float)var5;
      return this;
   }

   @Override
   public Ok_1 break_(int var1, int var2) {
      this.final_ = var1;
      this.package_ = var2;
      return this;
   }

   @Override
   public Ok_1 break_(int var1, int var2, int var3, int var4) {
      return this;
   }

   private void case_() {
      this.extends_ = 0.0F;
      this.native_ = 0.0F;
      this.volatile_ = 0.0F;
      this.final_ = 0;
      this.package_ = 10;
      this.int_ = 15728880;
      this.new_ = 0.0F;
      this.continue_ = 1.0F;
      this.super_ = 0.0F;
   }
}
