package celestial;

public class TR extends Tf_1<rMl_1, wS_2<rMl_1>> {
   public TR(qE_2<rMl_1, wS_2<rMl_1>> var1) {
      super(var1);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, rMl_1 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      rdn_3 var11 = var4.class_(rXQ.MAINHAND);
      if (var4.sJ() && !var4.sl()) {
         float var12 = -0.6F;
         float var13 = 1.4F;
         if (var4.sd()) {
            var12 -= 0.2F * rfU_2.class_(var8 * 0.6F) + 0.2F;
            var13 -= 0.09F * rfU_2.class_(var8 * 0.6F);
         }

         var1.class_();
         var1.class_(0.1F, (double)var13, (double)var12);
         QY.instanceof_().import_().class_(var4, var11, IQ.GROUND, false, var1, var2, var3);
         var1.break_();
      }
   }
}
