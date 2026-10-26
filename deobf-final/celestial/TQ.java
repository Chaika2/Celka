package celestial;

public class TQ<T extends iB_2, M extends wh_3<T>> extends tB_2<T, M> {
   private final pg_3 class_;
   private rhF_2 break_;

   public TQ(qd_3<T, M> var1) {
      super(var1);
      this.class_ = var1.break_();
   }

   @Override
   protected int class_(T var1) {
      return var1.BY();
   }

   @Override
   protected void class_(Ml_1 var1, Hx_1 var2, int var3, an_3 var4, float var5, float var6, float var7, float var8) {
      float var9 = rfU_2.byte_(var5 * var5 + var7 * var7);
      this.break_ = new rhF_2((rYB)var4.throws_[7], var4.rx(), var4.re(), var4.BO());
      rhF_2 var10000 = this.break_;
      Float var14 = (float)(Math.atan2((double)var5, (double)var7) * 180.0F / (float)Math.PI);
      var10000.throws_[15] = var14;
      var10000 = this.break_;
      Float var15 = (float)(Math.atan2((double)var6, (double)var9) * 180.0F / (float)Math.PI);
      var10000.throws_[16] = var15;
      var10000 = this.break_;
      Float var16 = (Float)this.break_.throws_[15];
      var10000.throws_[17] = var16;
      var10000 = this.break_;
      Float var17 = (Float)this.break_.throws_[16];
      var10000.throws_[18] = var17;
      this.class_.class_(this.break_, 0.0, 0.0, 0.0, 0.0F, var8, var1, var2, var3);
   }
}
