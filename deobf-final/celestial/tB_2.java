package celestial;

import java.util.Random;

public abstract class tB_2<T extends iB_2, M extends wh_3<T>> extends Tf_1<T, M> {
   public tB_2(qd_3<T, M> var1) {
      super(var1);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      int var11 = this.class_((T)var4);
      Random var12 = new Random((long)var4.V());
      if (var11 > 0) {
         for (int var13 = 0; var13 < var11; var13++) {
            var1.class_();
            Iq_1 var14 = this.byte_().class_(var12);
            IT var15 = var14.class_(var12);
            var14.class_(var1);
            float var16 = var12.nextFloat();
            float var17 = var12.nextFloat();
            float var18 = var12.nextFloat();
            float var19 = rfU_2.catch_(var16, var15.class_, var15.protected_) / 16.0F;
            float var20 = rfU_2.catch_(var17, var15.break_, var15.throws_) / 16.0F;
            float var21 = rfU_2.catch_(var18, var15.byte_, var15.case_) / 16.0F;
            var1.class_((double)var19, (double)var20, (double)var21);
            var16 = -1.0F * (var16 * 2.0F - 1.0F);
            var17 = -1.0F * (var17 * 2.0F - 1.0F);
            var18 = -1.0F * (var18 * 2.0F - 1.0F);
            this.class_(var1, var2, var3, var4, var16, var17, var18, var7);
            var1.break_();
         }
      }
   }

   protected abstract void class_(Ml_1 var1, Hx_1 var2, int var3, an_3 var4, float var5, float var6, float var7, float var8);

   protected abstract int class_(T var1);
}
