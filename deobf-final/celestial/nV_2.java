package celestial;

public class nV_2 extends lO_2 {
   private final double class_;
   private final double break_;
   private final double interface_;

   nV_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.finally_ = var8;
      this.extends_ = var10;
      this.native_ = var12;
      this.class_ = var2;
      this.break_ = var4;
      this.interface_ = var6;
      this.protected_ = var2 + var8;
      this.throws_ = var4 + var10;
      this.case_ = var6 + var12;
      this.catch_ = this.protected_;
      this.private_ = this.throws_;
      this.implements_ = this.case_;
      this.throw_ = 0.1F * (this.continue_.nextFloat() * 0.5F + 0.2F);
      float var14 = this.continue_.nextFloat() * 0.6F + 0.4F;
      this.synchronized_ = 0.9F * var14;
      this.return_ = 0.9F * var14;
      this.public_ = var14;
      this.final_ = false;
      this.this_ = (int)(Math.random() * 10.0) + 30;
   }

   @Override
   public void class_(double var1, double var3, double var5) {
      this.class_(this.volatile_().protected_(var1, var3, var5));
      this.extends_();
   }

   @Override
   public CJ class_() {
      return CJ.break_;
   }

   @Override
   public int break_(float var1) {
      int var2 = super.break_(var1);
      float var3 = (float)this.super_ / (float)this.this_;
      var3 *= var3;
      var3 *= var3;
      int var4 = var2 & 0xFF;
      int var5 = var2 >> 16 & 0xFF;
      var5 += (int)(var3 * 15.0F * 16.0F);
      if (var5 > 240) {
         var5 = 240;
      }

      return var4 | var5 << 16;
   }

   @Override
   public void case_() {
      this.protected_ = this.catch_;
      this.throws_ = this.private_;
      this.case_ = this.implements_;
      if (this.super_++ >= this.this_) {
         this.finally_();
      } else {
         float var1 = (float)this.super_ / (float)this.this_;
         var1 = 1.0F - var1;
         float var2 = 1.0F - var1;
         var2 *= var2;
         var2 *= var2;
         this.catch_ = this.class_ + this.finally_ * (double)var1;
         this.private_ = this.break_ + this.extends_ * (double)var1 - (double)(var2 * 1.2F);
         this.implements_ = this.interface_ + this.native_ * (double)var1;
      }
   }
}
