package celestial;

public class Tj_1 extends Tf_1<rOi_1, tV_2<rOi_1>> {
   private final tV_2<rOi_1> class_ = new tV_2<>(0.1F);

   public Tj_1(qE_2<rOi_1, tV_2<rOi_1>> var1) {
      super(var1);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, rOi_1 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      rdn_3 var11 = var4.n();
      if (var11.break_() instanceof rdP_2) {
         rdP_2 var12 = (rdP_2)var11.break_();
         this.byte_().class_(this.class_);
         this.class_.class_(var4, var5, var6, var7);
         this.class_.class_((rOi_1)var4, var5, var6, var8, var9, var10);
         float var13;
         float var14;
         float var15;
         if (var12 instanceof rxC_2) {
            int var16 = ((rxC_2)var12).d_(var11);
            var13 = (float)(var16 >> 16 & 0xFF) / 255.0F;
            var14 = (float)(var16 >> 8 & 0xFF) / 255.0F;
            var15 = (float)(var16 & 0xFF) / 255.0F;
         } else {
            var13 = 1.0F;
            var14 = 1.0F;
            var15 = 1.0F;
         }

         Ok_1 var17 = var2.getBuffer(HU.protected_(var12.catch_()));
         this.class_.class_(var1, var17, var3, fZ_2.class_, var13, var14, var15, 1.0F);
      }
   }
}
