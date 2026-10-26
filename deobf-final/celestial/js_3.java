package celestial;

public class js_3 extends jE_2<rHy_1> {
   private static final rqO_2 byte_ = new rqO_2("textures/entity/end_gateway_beam.png");

   public js_3(jz_3 var1) {
      super(var1);
   }

   @Override
   protected float class_() {
      return 1.0F;
   }

   public void class_(rHy_1 var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAe_1.class_()).byte_()) {
         if (var1.catch_() || var1.private_()) {
            float var7 = var1.catch_() ? var1.class_(var2) : var1.break_(var2);
            double var8 = var1.catch_() ? 256.0 : 50.0;
            var7 = rfU_2.class_(var7 * (float) Math.PI);
            int var10 = rfU_2.byte_((double)var7 * var8);
            float[] var11 = var1.catch_() ? rxL_2.MAGENTA.protected_() : rxL_2.PURPLE.protected_();
            long var12 = var1.while_().r();
            fU_2.class_(var3, var4, byte_, var2, var7, var12, 0, var10, var11, 0.15F, 0.175F);
            fU_2.class_(var3, var4, byte_, var2, var7, var12, 0, -var10, var11, 0.15F, 0.175F);
         }

         super.class_((rHy_1)var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   protected int class_(double var1) {
      return super.class_(var1) + 1;
   }
}
