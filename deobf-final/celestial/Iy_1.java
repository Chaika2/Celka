package celestial;

public class Iy_1 {
   public static <T extends is_3> void class_(Iq_1 var0, Iq_1 var1, T var2, float var3, float var4) {
      float var5 = rfU_2.class_(var3 * (float) Math.PI);
      float var6 = rfU_2.class_((1.0F - (1.0F - var3) * (1.0F - var3)) * (float) Math.PI);
      var0.private_ = 0.0F;
      var1.private_ = 0.0F;
      var0.catch_ = (float) (Math.PI / 20);
      var1.catch_ = (float) (-Math.PI / 20);
      if (var2.Su() == rpZ_2.RIGHT) {
         var0.case_ = -1.8849558F + rfU_2.break_(var4 * 0.09F) * 0.15F;
         var1.case_ = -0.0F + rfU_2.break_(var4 * 0.19F) * 0.5F;
         var0.case_ += var5 * 2.2F - var6 * 0.4F;
         var1.case_ += var5 * 1.2F - var6 * 0.4F;
      } else {
         var0.case_ = -0.0F + rfU_2.break_(var4 * 0.19F) * 0.5F;
         var1.case_ = -1.8849558F + rfU_2.break_(var4 * 0.09F) * 0.15F;
         var0.case_ += var5 * 1.2F - var6 * 0.4F;
         var1.case_ += var5 * 2.2F - var6 * 0.4F;
      }

      class_(var0, var1, var4);
   }

   public static void class_(Iq_1 var0, Iq_1 var1, float var2) {
      var0.private_ = var0.private_ + rfU_2.break_(var2 * 0.09F) * 0.05F + 0.05F;
      var1.private_ = var1.private_ - (rfU_2.break_(var2 * 0.09F) * 0.05F + 0.05F);
      var0.case_ = var0.case_ + rfU_2.class_(var2 * 0.067F) * 0.05F;
      var1.case_ = var1.case_ - rfU_2.class_(var2 * 0.067F) * 0.05F;
   }

   public static void class_(Iq_1 var0, Iq_1 var1, boolean var2, float var3, float var4) {
      float var5 = rfU_2.class_(var3 * (float) Math.PI);
      float var6 = rfU_2.class_((1.0F - (1.0F - var3) * (1.0F - var3)) * (float) Math.PI);
      var1.private_ = 0.0F;
      var0.private_ = 0.0F;
      var1.catch_ = -(0.1F - var5 * 0.6F);
      var0.catch_ = 0.1F - var5 * 0.6F;
      float var7 = (float) -Math.PI / (var2 ? 1.5F : 2.25F);
      var1.case_ = var7;
      var0.case_ = var7;
      var1.case_ += var5 * 1.2F - var6 * 0.4F;
      var0.case_ += var5 * 1.2F - var6 * 0.4F;
      class_(var1, var0, var4);
   }

   public static void class_(Iq_1 var0, Iq_1 var1, iB_2 var2, boolean var3) {
      Iq_1 var4 = var3 ? var0 : var1;
      Iq_1 var5 = var3 ? var1 : var0;
      var4.catch_ = var3 ? -0.8F : 0.8F;
      var4.case_ = -0.97079635F;
      var5.case_ = var4.case_;
      float var6 = (float)rxm_3.private_(var2.sX());
      float var7 = rfU_2.class_((float)var2.SU(), 0.0F, var6);
      float var8 = var7 / var6;
      var5.catch_ = rfU_2.catch_(var8, 0.4F, 0.85F) * (float)(var3 ? 1 : -1);
      var5.case_ = rfU_2.catch_(var8, var5.case_, (float) (-Math.PI / 2));
   }

   public static void class_(Iq_1 var0, Iq_1 var1, Iq_1 var2, boolean var3) {
      Iq_1 var4 = var3 ? var0 : var1;
      Iq_1 var5 = var3 ? var1 : var0;
      var4.catch_ = (var3 ? -0.3F : 0.3F) + var2.catch_;
      var5.catch_ = (var3 ? 0.6F : -0.6F) + var2.catch_;
      var4.case_ = (float) (-Math.PI / 2) + var2.case_ + 0.1F;
      var5.case_ = -1.5F + var2.case_;
   }
}
