package celestial;

public class Iy_1 {
   public static <T extends is_3> void id_class(Iq_1 var0, Iq_1 var1, T var2, float var3, float var4) {
      float var5 = rfU_2.id_class(var3 * (float) Math.PI);
      float var6 = rfU_2.id_class((1.0F - (1.0F - var3) * (1.0F - var3)) * (float) Math.PI);
      var0.id_private = 0.0F;
      var1.id_private = 0.0F;
      var0.id_catch = (float) (Math.PI / 20);
      var1.id_catch = (float) (-Math.PI / 20);
      if (var2.Su() == rpZ_2.RIGHT) {
         var0.id_case = -1.8849558F + rfU_2.id_break(var4 * 0.09F) * 0.15F;
         var1.id_case = -0.0F + rfU_2.id_break(var4 * 0.19F) * 0.5F;
         var0.id_case += var5 * 2.2F - var6 * 0.4F;
         var1.id_case += var5 * 1.2F - var6 * 0.4F;
      } else {
         var0.id_case = -0.0F + rfU_2.id_break(var4 * 0.19F) * 0.5F;
         var1.id_case = -1.8849558F + rfU_2.id_break(var4 * 0.09F) * 0.15F;
         var0.id_case += var5 * 1.2F - var6 * 0.4F;
         var1.id_case += var5 * 2.2F - var6 * 0.4F;
      }

      id_class(var0, var1, var4);
   }

   public static void id_class(Iq_1 var0, Iq_1 var1, float var2) {
      var0.id_private = var0.id_private + rfU_2.id_break(var2 * 0.09F) * 0.05F + 0.05F;
      var1.id_private = var1.id_private - (rfU_2.id_break(var2 * 0.09F) * 0.05F + 0.05F);
      var0.id_case = var0.id_case + rfU_2.id_class(var2 * 0.067F) * 0.05F;
      var1.id_case = var1.id_case - rfU_2.id_class(var2 * 0.067F) * 0.05F;
   }

   public static void id_class(Iq_1 var0, Iq_1 var1, boolean var2, float var3, float var4) {
      float var5 = rfU_2.id_class(var3 * (float) Math.PI);
      float var6 = rfU_2.id_class((1.0F - (1.0F - var3) * (1.0F - var3)) * (float) Math.PI);
      var1.id_private = 0.0F;
      var0.id_private = 0.0F;
      var1.id_catch = -(0.1F - var5 * 0.6F);
      var0.id_catch = 0.1F - var5 * 0.6F;
      float var7 = (float) -Math.PI / (var2 ? 1.5F : 2.25F);
      var1.id_case = var7;
      var0.id_case = var7;
      var1.id_case += var5 * 1.2F - var6 * 0.4F;
      var0.id_case += var5 * 1.2F - var6 * 0.4F;
      id_class(var1, var0, var4);
   }

   public static void id_class(Iq_1 var0, Iq_1 var1, iB_2 var2, boolean var3) {
      Iq_1 var4 = var3 ? var0 : var1;
      Iq_1 var5 = var3 ? var1 : var0;
      var4.id_catch = var3 ? -0.8F : 0.8F;
      var4.id_case = -0.97079635F;
      var5.id_case = var4.id_case;
      float var6 = (float)rxm_3.id_private(var2.sX());
      float var7 = rfU_2.id_class((float)var2.SU(), 0.0F, var6);
      float var8 = var7 / var6;
      var5.id_catch = rfU_2.id_catch(var8, 0.4F, 0.85F) * (float)(var3 ? 1 : -1);
      var5.id_case = rfU_2.id_catch(var8, var5.id_case, (float) (-Math.PI / 2));
   }

   public static void id_class(Iq_1 var0, Iq_1 var1, Iq_1 var2, boolean var3) {
      Iq_1 var4 = var3 ? var0 : var1;
      Iq_1 var5 = var3 ? var1 : var0;
      var4.id_catch = (var3 ? -0.3F : 0.3F) + var2.id_catch;
      var5.id_catch = (var3 ? 0.6F : -0.6F) + var2.id_catch;
      var4.id_case = (float) (-Math.PI / 2) + var2.id_case + 0.1F;
      var5.id_case = -1.5F + var2.id_case;
   }
}
