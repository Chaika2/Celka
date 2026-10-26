package celestial;

public class TA extends Tf_1<rbo_3, tn_3<rbo_3>> {
   public TA(qE_2<rbo_3, tn_3<rbo_3>> var1) {
      super(var1);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, rbo_3 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      boolean var11 = var4.Su() == rpZ_2.RIGHT;
      var1.class_();
      float var12 = 1.0F;
      float var13 = -1.0F;
      float var14 = rfU_2.throws_((Float)var4.throws_[16]) / 60.0F;
      if ((Float)var4.throws_[16] < 0.0F) {
         var1.class_(0.0, (double)(1.0F - var14 * 0.5F), (double)(-1.0F + var14 * 0.5F));
      } else {
         var1.class_(0.0, (double)(1.0F + var14 * 0.8F), (double)(-1.0F + var14 * 0.2F));
      }

      rdn_3 var15 = var11 ? var4.ss() : var4.Sn();
      QY.instanceof_().import_().class_(var4, var15, IQ.GROUND, false, var1, var2, var3);
      var1.break_();
   }
}
