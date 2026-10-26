package celestial;

public class Cw_1 extends lO_2 {
   private final double class_;
   private final double break_;
   private final double interface_;

   protected Cw_1(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.finally_ = var8;
      this.extends_ = var10;
      this.native_ = var12;
      this.catch_ = var2;
      this.private_ = var4;
      this.implements_ = var6;
      this.class_ = this.catch_;
      this.break_ = this.private_;
      this.interface_ = this.implements_;
      this.throw_ = 0.1F * (this.continue_.nextFloat() * 0.2F + 0.5F);
      float var14 = this.continue_.nextFloat() * 0.6F + 0.4F;
      this.synchronized_ = var14 * 0.9F;
      this.return_ = var14 * 0.3F;
      this.public_ = var14;
      this.this_ = (int)(Math.random() * 10.0) + 40;
   }

   @Override
   public float class_(float var1) {
      float var2 = ((float)this.super_ + var1) / (float)this.this_;
      var2 = 1.0F - var2;
      var2 *= var2;
      var2 = 1.0F - var2;
      return this.throw_ * var2;
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
         float var2 = -var1 + var1 * var1 * 2.0F;
         float var3 = 1.0F - var2;
         this.catch_ = this.class_ + this.finally_ * (double)var3;
         this.private_ = this.break_ + this.extends_ * (double)var3 + (double)(1.0F - var1);
         this.implements_ = this.interface_ + this.native_ * (double)var3;
      }
   }
}
