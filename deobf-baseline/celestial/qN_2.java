package celestial;

public class qN_2<T extends rsJ_2> extends pV_2<T> {
   private static final rqO_2 id_throws = new rqO_2("textures/entity/minecart.png");
   protected final tp_3<T> id_class = new wr_3<>();

   public qN_2(pg_3 var1) {
      super(var1);
      this.id_byte = 0.7F;
   }

   protected void id_class(T var1, float var2, xc_3 var3, Ml_1 var4, Hx_1 var5, int var6) {
      QY.id_instanceof().id_synchronized().id_class(var3, var4, var5, var6, fZ_2.id_class);
   }

   public void id_class(T var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      var4.id_class();
      long var7 = (long)var1.V() * 493286711L;
      var7 = var7 * var7 * 4392167121L + var7 * 98761L;
      float var9 = (((float)(var7 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var10 = (((float)(var7 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var11 = (((float)(var7 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      var4.id_class((double)var9, (double)var10, (double)var11);
      double var12 = rfU_2.id_protected((double)var3, (Double)var1.id_throws[34], var1.rx());
      double var14 = rfU_2.id_protected((double)var3, (Double)var1.id_throws[35], var1.re());
      double var16 = rfU_2.id_protected((double)var3, (Double)var1.id_throws[36], var1.BO());
      double var18 = 0.3F;
      rjU_2 var20 = var1.id_continue(var12, var14, var16);
      float var21 = rfU_2.id_catch(var3, (Float)var1.id_throws[18], (Float)var1.id_throws[16]);
      if (var20 != null) {
         rjU_2 var22 = var1.id_class(var12, var14, var16, 0.3F);
         rjU_2 var23 = var1.id_class(var12, var14, var16, -0.3F);
         if (var22 == null) {
            var22 = var20;
         }

         if (var23 == null) {
            var23 = var20;
         }

         var4.id_class(var20.id_break - var12, (var22.id_byte + var23.id_byte) / 2.0 - var14, var20.id_protected - var16);
         rjU_2 var24 = var23.id_break(-var22.id_break, -var22.id_byte, -var22.id_protected);
         if (var24.id_case() != 0.0) {
            var24 = var24.id_protected();
            var2 = (float)(Math.atan2(var24.id_protected, var24.id_break) * 180.0 / Math.PI);
            var21 = (float)(Math.atan(var24.id_byte) * 73.0);
         }
      }

      var4.id_class(0.0, 0.375, 0.0);
      var4.id_class(rje_3.id_protected.id_byte(180.0F - var2));
      var4.id_class(rje_3.id_case.id_byte(-var21));
      float var28 = (float)var1.id_private() - var3;
      float var29 = var1.id_catch() - var3;
      if (var29 < 0.0F) {
         var29 = 0.0F;
      }

      if (var28 > 0.0F) {
         var4.id_class(rje_3.id_break.id_byte(rfU_2.id_class(var28) * var28 * var29 / 10.0F * (float)var1.id_implements()));
      }

      int var31 = var1.id_new();
      xc_3 var25 = var1.id_package();
      if (var25.id_private() != xN_2.INVISIBLE) {
         var4.id_class();
         float var26 = 0.75F;
         var4.id_class(0.75F, 0.75F, 0.75F);
         var4.id_class(-0.5, (double)((float)(var31 - 8) / 16.0F), 0.5);
         var4.id_class(rje_3.id_protected.id_byte(90.0F));
         this.id_class((T)var1, var3, var25, var4, var5, var6);
         var4.id_break();
      }

      var4.id_class(-1.0F, -1.0F, 1.0F);
      this.id_class.id_class((T)var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
      Ok_1 var32 = var5.getBuffer(this.id_class.id_class(this.id_class((T)var1)));
      this.id_class.id_class(var4, var32, var6, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.id_break();
   }

   public rqO_2 id_class(T var1) {
      return id_throws;
   }
}
