package celestial;

public class qe_3 extends qN_2<rsv_3> {
   public qe_3(pg_3 var1) {
      super(var1);
   }

   public static void id_class(xc_3 var0, Ml_1 var1, Hx_1 var2, int var3, boolean var4) {
      int var5;
      if (var4) {
         var5 = fZ_2.id_class(fZ_2.id_class(1.0F), 10);
      } else {
         var5 = fZ_2.id_class;
      }

      if (rrbb_3.rs() && var4) {
         rrdZ.id_break(1.0F, 1.0F, 1.0F, 0.5F);
      }

      QY.id_instanceof().id_synchronized().id_class(var0, var1, var2, var3, var5);
      if (rrbb_3.rs()) {
         rrdZ.id_break(0.0F, 0.0F, 0.0F, 0.0F);
      }
   }

   protected void id_class(rsv_3 var1, float var2, xc_3 var3, Ml_1 var4, Hx_1 var5, int var6) {
      int var7 = var1.id_return();
      if (var7 > -1 && (float)var7 - var2 + 1.0F < 10.0F) {
         float var8 = 1.0F - ((float)var7 - var2 + 1.0F) / 10.0F;
         var8 = rfU_2.id_class(var8, 0.0F, 1.0F);
         var8 *= var8;
         var8 *= var8;
         float var9 = 1.0F + var8 * 0.3F;
         var4.id_class(var9, var9, var9);
      }

      id_class(var3, var4, var5, var6, var7 > -1 && var7 / 5 % 2 == 0);
   }
}
