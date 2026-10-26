package celestial;

public class lu_3 extends CK {
   lu_3(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6, var14, -0.05F);
      this.finally_ = var8;
      this.extends_ = var10;
      this.native_ = var12;
      this.throw_ *= 0.75F;
      this.this_ = 60 + this.continue_.nextInt(12);
      this.break_(var14);
      if (this.continue_.nextInt(4) == 0) {
         this.class_(0.6F + this.continue_.nextFloat() * 0.2F, 0.6F + this.continue_.nextFloat() * 0.3F, this.continue_.nextFloat() * 0.2F);
      } else {
         this.class_(0.1F + this.continue_.nextFloat() * 0.2F, 0.4F + this.continue_.nextFloat() * 0.3F, this.continue_.nextFloat() * 0.2F);
      }

      this.case_(0.6F);
   }
}
