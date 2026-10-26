package celestial;

import java.util.Random;

public class pw_3 extends pV_2<rSu_1> {
   public static final rqO_2 id_class = new rqO_2("textures/entity/end_crystal/end_crystal_beam.png");
   private static final rqO_2 id_throws = new rqO_2("textures/entity/enderdragon/dragon_exploding.png");
   private static final rqO_2 id_case = new rqO_2("textures/entity/enderdragon/dragon.png");
   private static final rqO_2 id_catch = new rqO_2("textures/entity/enderdragon/dragon_eyes.png");
   private static final HU id_private = HU.id_protected(id_case);
   private static final HU id_implements = HU.id_finally(id_case);
   private static final HU id_finally = HU.id_volatile(id_catch);
   private static final HU id_extends = HU.id_implements(id_class);
   private static final float id_native = (float)(Math.sqrt(3.0) / 2.0);
   private final pI_2 id_volatile = new pI_2();

   private static void id_byte(Ok_1 var0, rjV_2 var1, float var2, float var3) {
      var0.id_class(var1, 0.0F, var2, 1.0F * var3).id_break(255, 0, 255, 0).id_class();
   }

   public pw_3(pg_3 var1) {
      super(var1);
      this.id_byte = 0.5F;
   }

   public rqO_2 id_class(rSu_1 var1) {
      return id_case;
   }

   private static void id_class(Ok_1 var0, rjV_2 var1, int var2) {
      var0.id_class(var1, 0.0F, 0.0F, 0.0F).id_break(255, 255, 255, var2).id_class();
      var0.id_class(var1, 0.0F, 0.0F, 0.0F).id_break(255, 255, 255, var2).id_class();
   }

   private static void id_class(Ok_1 var0, rjV_2 var1, float var2, float var3) {
      var0.id_class(var1, -id_native * var3, var2, -0.5F * var3).id_break(255, 0, 255, 0).id_class();
   }

   public void id_class(rSu_1 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.id_class();
      float var7 = (float)var1.id_class(7, var3)[0];
      float var8 = (float)(var1.id_class(5, var3)[1] - var1.id_class(10, var3)[1]);
      var4.id_class(rje_3.id_protected.id_byte(-var7));
      var4.id_class(rje_3.id_break.id_byte(var8 * 10.0F));
      var4.id_class(0.0, 0.0, 1.0);
      var4.id_class(-1.0F, -1.0F, 1.0F);
      var4.id_class(0.0, -1.501F, 0.0);
      boolean var9 = (Integer)var1.id_private[10] > 0;
      this.id_volatile.id_class(var1, 0.0F, 0.0F, var3);
      if (var1.id_return > 0) {
         float var10 = (float)var1.id_return / 200.0F;
         Ok_1 var11 = var5.getBuffer(HU.id_class(id_throws, var10));
         this.id_volatile.id_class(var4, var11, var6, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
         Ok_1 var12 = var5.getBuffer(id_implements);
         this.id_volatile.id_class(var4, var12, var6, fZ_2.id_class(0.0F, var9), 1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         Ok_1 var20 = var5.getBuffer(id_private);
         this.id_volatile.id_class(var4, var20, var6, fZ_2.id_class(0.0F, var9), 1.0F, 1.0F, 1.0F, 1.0F);
      }

      Ok_1 var21 = var5.getBuffer(id_finally);
      if (rrbb_3.rs()) {
         rrdZ.id_double();
      }

      rrbb_3.z().id_case = true;
      this.id_volatile.id_class(var4, var21, var6, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
      rrbb_3.z().id_case = false;
      if (rrbb_3.rs()) {
         rrdZ.id_switch();
      }

      if (var1.id_return > 0) {
         float var22 = ((float)var1.id_return + var3) / 200.0F;
         float var24 = Math.min(var22 > 0.8F ? (var22 - 0.8F) / 0.2F : 0.0F, 1.0F);
         Random var13 = new Random(432L);
         Ok_1 var14 = var5.getBuffer(HU.id_else());
         var4.id_class();
         var4.id_class(0.0, -1.0, -2.0);

         for (int var15 = 0; (float)var15 < (var22 + var22 * var22) / 2.0F * 60.0F; var15++) {
            var4.id_class(rje_3.id_break.id_byte(var13.nextFloat() * 360.0F));
            var4.id_class(rje_3.id_protected.id_byte(var13.nextFloat() * 360.0F));
            var4.id_class(rje_3.id_case.id_byte(var13.nextFloat() * 360.0F));
            var4.id_class(rje_3.id_break.id_byte(var13.nextFloat() * 360.0F));
            var4.id_class(rje_3.id_protected.id_byte(var13.nextFloat() * 360.0F));
            var4.id_class(rje_3.id_case.id_byte(var13.nextFloat() * 360.0F + var22 * 90.0F));
            float var16 = var13.nextFloat() * 20.0F + 5.0F + var24 * 10.0F;
            float var17 = var13.nextFloat() * 2.0F + 1.0F + var24 * 2.0F;
            rjV_2 var18 = var4.id_byte().id_class();
            int var19 = (int)(255.0F * (1.0F - var24));
            id_class(var14, var18, var19);
            id_class(var14, var18, var16, var17);
            id_break(var14, var18, var16, var17);
            id_class(var14, var18, var19);
            id_break(var14, var18, var16, var17);
            id_byte(var14, var18, var16, var17);
            id_class(var14, var18, var19);
            id_byte(var14, var18, var16, var17);
            id_class(var14, var18, var16, var17);
         }

         var4.id_break();
      }

      var4.id_break();
      if (var1.id_goto != null) {
         var4.id_class();
         float var23 = (float)(var1.id_goto.rx() - rfU_2.id_protected((double)var3, (Double)var1.id_throws[8], var1.rx()));
         float var25 = (float)(var1.id_goto.re() - rfU_2.id_protected((double)var3, (Double)var1.id_throws[9], var1.re()));
         float var26 = (float)(var1.id_goto.BO() - rfU_2.id_protected((double)var3, (Double)var1.id_throws[10], var1.BO()));
         id_class(var23, var25 + pt_3.id_class(var1.id_goto, var3), var26, var3, (Integer)var1.id_throws[41], var4, var5, var6);
         var4.id_break();
      }

      super.id_class(var1, var2, var3, var4, var5, var6);
   }

   public static void id_class(float var0, float var1, float var2, float var3, int var4, Ml_1 var5, Hx_1 var6, int var7) {
      float var8 = rfU_2.id_byte(var0 * var0 + var2 * var2);
      float var9 = rfU_2.id_byte(var0 * var0 + var1 * var1 + var2 * var2);
      var5.id_class();
      var5.id_class(0.0, 2.0, 0.0);
      var5.id_class(rje_3.id_protected.id_break((float)(-Math.atan2((double)var2, (double)var0)) - (float) (Math.PI / 2)));
      var5.id_class(rje_3.id_break.id_break((float)(-Math.atan2((double)var8, (double)var1)) - (float) (Math.PI / 2)));
      Ok_1 var10 = var6.getBuffer(id_extends);
      float var11 = 0.0F - ((float)var4 + var3) * 0.01F;
      float var12 = rfU_2.id_byte(var0 * var0 + var1 * var1 + var2 * var2) / 32.0F - ((float)var4 + var3) * 0.01F;
      byte var13 = 8;
      float var14 = 0.0F;
      float var15 = 0.75F;
      float var16 = 0.0F;
      MH var17 = var5.id_byte();
      rjV_2 var18 = var17.id_class();
      rjj_3 var19 = var17.id_break();

      for (int var20 = 1; var20 <= 8; var20++) {
         float var21 = rfU_2.id_class((float)var20 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float var22 = rfU_2.id_break((float)var20 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float var23 = (float)var20 / 8.0F;
         var10.id_class(var18, var14 * 0.2F, var15 * 0.2F, 0.0F)
            .id_break(0, 0, 0, 255)
            .id_class(var16, var11)
            .id_byte(fZ_2.id_class)
            .id_break(var7)
            .id_class(var19, 0.0F, -1.0F, 0.0F)
            .id_class();
         var10.id_class(var18, var14, var15, var9)
            .id_break(255, 255, 255, 255)
            .id_class(var16, var12)
            .id_byte(fZ_2.id_class)
            .id_break(var7)
            .id_class(var19, 0.0F, -1.0F, 0.0F)
            .id_class();
         var10.id_class(var18, var21, var22, var9)
            .id_break(255, 255, 255, 255)
            .id_class(var23, var12)
            .id_byte(fZ_2.id_class)
            .id_break(var7)
            .id_class(var19, 0.0F, -1.0F, 0.0F)
            .id_class();
         var10.id_class(var18, var21 * 0.2F, var22 * 0.2F, 0.0F)
            .id_break(0, 0, 0, 255)
            .id_class(var23, var11)
            .id_byte(fZ_2.id_class)
            .id_break(var7)
            .id_class(var19, 0.0F, -1.0F, 0.0F)
            .id_class();
         var14 = var21;
         var15 = var22;
         var16 = var23;
      }

      var5.id_break();
   }

   private static void id_break(Ok_1 var0, rjV_2 var1, float var2, float var3) {
      var0.id_class(var1, id_native * var3, var2, -0.5F * var3).id_break(255, 0, 255, 0).id_class();
   }
}
