package celestial;

public class js_3 extends jE_2<rHy_1> {
   private static final rqO_2 id_byte = new rqO_2("textures/entity/end_gateway_beam.png");

   public js_3(jz_3 var1) {
      super(var1);
   }

   @Override
   protected float id_class() {
      return 1.0F;
   }

   public void id_class(rHy_1 var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAe_1.id_class()).id_byte()) {
         if (var1.id_catch() || var1.id_private()) {
            float var7 = var1.id_catch() ? var1.id_class(var2) : var1.id_break(var2);
            double var8 = var1.id_catch() ? 256.0 : 50.0;
            var7 = rfU_2.id_class(var7 * (float) Math.PI);
            int var10 = rfU_2.id_byte((double)var7 * var8);
            float[] var11 = var1.id_catch() ? rxL_2.MAGENTA.id_protected() : rxL_2.PURPLE.id_protected();
            long var12 = var1.id_while().r();
            fU_2.id_class(var3, var4, id_byte, var2, var7, var12, 0, var10, var11, 0.15F, 0.175F);
            fU_2.id_class(var3, var4, id_byte, var2, var7, var12, 0, -var10, var11, 0.15F, 0.175F);
         }

         super.id_class((rHy_1)var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   protected int id_class(double var1) {
      return super.id_class(var1) + 1;
   }
}
