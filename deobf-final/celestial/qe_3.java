package celestial;

public class qe_3 extends qN_2<rsv_3> {
   public qe_3(pg_3 var1) {
      super(var1);
   }

   public static void class_(xc_3 var0, Ml_1 var1, Hx_1 var2, int var3, boolean var4) {
      int var5;
      if (var4) {
         var5 = fZ_2.class_(fZ_2.class_(1.0F), 10);
      } else {
         var5 = fZ_2.class_;
      }

      if (rrbb_3.rs() && var4) {
         rrdZ.break_(1.0F, 1.0F, 1.0F, 0.5F);
      }

      QY.instanceof_().synchronized_().class_(var0, var1, var2, var3, var5);
      if (rrbb_3.rs()) {
         rrdZ.break_(0.0F, 0.0F, 0.0F, 0.0F);
      }
   }

   protected void class_(rsv_3 var1, float var2, xc_3 var3, Ml_1 var4, Hx_1 var5, int var6) {
      int var7 = var1.return_();
      if (var7 > -1 && (float)var7 - var2 + 1.0F < 10.0F) {
         float var8 = 1.0F - ((float)var7 - var2 + 1.0F) / 10.0F;
         var8 = rfU_2.class_(var8, 0.0F, 1.0F);
         var8 *= var8;
         var8 *= var8;
         float var9 = 1.0F + var8 * 0.3F;
         var4.class_(var9, var9, var9);
      }

      class_(var3, var4, var5, var6, var7 > -1 && var7 / 5 % 2 == 0);
   }
}
