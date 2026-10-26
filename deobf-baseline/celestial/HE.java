package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class HE {
   public static float id_class;
   public static float id_break;
   public static float id_byte;
   private static int id_throws = -1;
   private static int id_case = -1;
   private static long id_catch = -1L;
   public static boolean id_protected = false;

   public static void id_class(ly_3 var0, HG var1, float var2, boolean var3, float var4) {
      float var5;
      float var6;
      if (var3) {
         id_protected = true;
         var5 = var2 * 0.05F;
         var6 = Math.min(var2, 192.0F) * 0.5F;
      } else if (var1 == HG.FOG_SKY) {
         id_protected = true;
         var5 = 0.0F;
         var6 = var2;
      } else {
         id_protected = true;
         var5 = var2 * rrbb_3.id_public();
         var6 = var2;
      }

      RenderSystem.fogStart(var5);
      RenderSystem.fogEnd(var6);
      RenderSystem.fogMode(MD.LINEAR);
      RenderSystem.setupNvFogDistance();
   }

   public static void id_class(ly_3 var0, float var1, gm_3 var2, int var3, float var4) {
      rXE var5 = var0.id_finally();
      if (var5.id_class(rlG_2.id_break)) {
         long var6 = rqR_2.id_break();
         int var8 = var2.id_implements(new rfH_2(var0.id_break())).id_final();
         if (id_catch < 0L) {
            id_throws = var8;
            id_case = var8;
            id_catch = var6;
         }

         int var9 = id_throws >> 16 & 0xFF;
         int var10 = id_throws >> 8 & 0xFF;
         int var11 = id_throws & 0xFF;
         int var12 = id_case >> 16 & 0xFF;
         int var13 = id_case >> 8 & 0xFF;
         int var14 = id_case & 0xFF;
         float var15 = rfU_2.id_class((float)(var6 - id_catch) / 5000.0F, 0.0F, 1.0F);
         float var16 = rfU_2.id_catch(var15, (float)var12, (float)var9);
         float var17 = rfU_2.id_catch(var15, (float)var13, (float)var10);
         float var18 = rfU_2.id_catch(var15, (float)var14, (float)var11);
         id_class = var16 / 255.0F;
         id_break = var17 / 255.0F;
         id_byte = var18 / 255.0F;
         if (id_throws != var8) {
            id_throws = var8;
            id_case = rfU_2.id_protected(var16) << 16 | rfU_2.id_protected(var17) << 8 | rfU_2.id_protected(var18);
            id_catch = var6;
         }
      } else if (var5.id_class(rlG_2.id_byte)) {
         id_class = 0.6F;
         id_break = 0.1F;
         id_byte = 0.0F;
         id_catch = -1L;
      } else {
         float var19 = 0.25F + 0.75F * (float)var3 / 32.0F;
         var19 = 1.0F - (float)Math.pow((double)var19, 0.25);
         rjU_2 var7 = var2.id_class(var0.id_byte(), var1);
         var7 = rrbN_2.id_break(var7, var2, var0.id_catch(), var1);
         float var24 = (float)var7.id_break;
         float var29 = (float)var7.id_byte;
         float var33 = (float)var7.id_protected;
         float var34 = rfU_2.id_class(rfU_2.id_break(var2.id_protected(var1) * (float) (Math.PI * 2)) * 2.0F + 0.5F, 0.0F, 1.0F);
         rYA var35 = var2.id_static();
         rjU_2 var36 = var0.id_break().id_class(2.0, 2.0, 2.0).id_class(0.25);
         rjU_2 var37 = ryD_2.id_class(
            var36, (var3x, var4x, var5x) -> var2.id_break().id_class(rjU_2.id_class(var35.id_class(var3x, var4x, var5x).id_case()), var34)
         );
         var37 = rrbN_2.id_class(var37, var2, var0.id_catch(), var1);
         id_class = (float)var37.id_class();
         id_break = (float)var37.id_break();
         id_byte = (float)var37.id_byte();
         if (var3 >= 4) {
            float var39 = rfU_2.id_class(var2.id_throws(var1)) > 0.0F ? -1.0F : 1.0F;
            rje_3 var41 = new rje_3(var39, 0.0F, 0.0F);
            float var44 = var0.id_volatile().id_byte(var41);
            if (var44 < 0.0F) {
               var44 = 0.0F;
            }

            if (var44 > 0.0F) {
               float[] var48 = var2.id_break().id_class(var2.id_protected(var1), var1);
               if (var48 != null) {
                  var44 *= var48[3];
                  id_class = id_class * (1.0F - var44) + var48[0] * var44;
                  id_break = id_break * (1.0F - var44) + var48[1] * var44;
                  id_byte = id_byte * (1.0F - var44) + var48[2] * var44;
               }
            }
         }

         id_class = id_class + (var24 - id_class) * var19;
         id_break = id_break + (var29 - id_break) * var19;
         id_byte = id_byte + (var33 - id_byte) * var19;
         float var40 = var2.id_private(var1);
         if (var40 > 0.0F) {
            float var42 = 1.0F - var40 * 0.5F;
            float var46 = 1.0F - var40 * 0.4F;
            id_class *= var42;
            id_break *= var42;
            id_byte *= var46;
         }

         float var43 = var2.id_case(var1);
         if (var43 > 0.0F) {
            float var47 = 1.0F - var43 * 0.5F;
            id_class *= var47;
            id_break *= var47;
            id_byte *= var47;
         }

         id_catch = -1L;
      }

      double var21 = var0.id_break().id_byte * var2.id_synchronized().id_final();
      if (var21 < 1.0 && !var5.id_class(rlG_2.id_byte)) {
         if (var21 < 0.0) {
            var21 = 0.0;
         }

         var21 *= var21;
         id_class = (float)((double)id_class * var21);
         id_break = (float)((double)id_break * var21);
         id_byte = (float)((double)id_byte * var21);
      }

      if (var4 > 0.0F) {
         id_class = id_class * (1.0F - var4) + id_class * 0.7F * var4;
         id_break = id_break * (1.0F - var4) + id_break * 0.6F * var4;
         id_byte = id_byte * (1.0F - var4) + id_byte * 0.6F * var4;
      }

      if (var5.id_class(rlG_2.id_break)) {
         float var25 = 0.0F;
         if (var0.id_catch() == (cb_3)QY.id_instanceof().id_class[57]) {
            var25 = ((cb_3)QY.id_instanceof().id_class[57]).id_public();
         }

         float var30 = Math.min(1.0F / id_class, Math.min(1.0F / id_break, 1.0F / id_byte));
         if (Float.isInfinite(var30)) {
            var30 = Math.nextAfter(var30, 0.0);
         }

         id_class = id_class * (1.0F - var25) + id_class * var30 * var25;
         id_break = id_break * (1.0F - var25) + id_break * var30 * var25;
         id_byte = id_byte * (1.0F - var25) + id_byte * var30 * var25;
      } else if (((Qw_1)QY.id_instanceof().id_class[20]).a == 100.0) {
         float var26 = 1.0F;
         float var31 = Math.min(1.0F / id_class, Math.min(1.0F / id_break, 1.0F / id_byte));
         if (Float.isInfinite(var31)) {
            var31 = Math.nextAfter(var31, 0.0);
         }

         id_class = id_class * (1.0F - var26) + id_class * var31 * var26;
         id_break = id_break * (1.0F - var26) + id_break * var31 * var26;
         id_byte = id_byte * (1.0F - var26) + id_byte * var31 * var26;
      } else if (var0.id_catch() instanceof iB_2 && ((iB_2)var0.id_catch()).id_break(rLD.id_int)) {
         float var27 = Hh_1.id_class((iB_2)var0.id_catch(), var1);
         float var32 = Math.min(1.0F / id_class, Math.min(1.0F / id_break, 1.0F / id_byte));
         if (Float.isInfinite(var32)) {
            var32 = Math.nextAfter(var32, 0.0);
         }

         id_class = id_class * (1.0F - var27) + id_class * var32 * var27;
         id_break = id_break * (1.0F - var27) + id_break * var32 * var27;
         id_byte = id_byte * (1.0F - var27) + id_byte * var32 * var27;
      }

      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().id_else()) {
         float var28 = 0.2F;
         rrdZ.id_class(var28, var28, var28, 0.0F);
         RenderSystem.clearColor(var28, var28, var28, 0.0F);
      } else {
         rrdZ.id_class(id_class, id_break, id_byte, 0.0F);
         RenderSystem.clearColor(id_class, id_break, id_byte, 0.0F);
      }
   }

   public static void id_class(ly_3 var0, HG var1, float var2, boolean var3) {
      id_class(var0, var1, var2, var3, 0.0F);
   }

   public static void id_class() {
      RenderSystem.fogDensity(0.0F);
      RenderSystem.fogMode(MD.EXP2);
   }

   public static void id_break() {
      RenderSystem.fog(2918, id_class, id_break, id_byte, 1.0F);
      if (rrbb_3.rs()) {
         rrdZ.id_class(id_class, id_break, id_byte);
      }
   }
}
