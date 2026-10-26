package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Trails extends Module {
   private static short[] id_byte;
   private static String[] id_protected;
   private static long[] id_throws;
   private static byte[] id_catch;
   public Object[] id_break;
   private static boolean[] id_private;
   private static double[] id_implements;
   private static float[] id_finally;

   public Trails() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.id_this();
      ArrayList var5 = new ArrayList();
      this.id_break[id_byte[1]] = var5;
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4105235596140776910L;
   }

   @EventTarget
   public void id_class(RenderEvent var1) {
      this.id_this();
      boolean var2 = ((Qw_1)id_import.id_class[20]).id_volatile() == VZ.FIRST_PERSON ? true : id_private[1];
      if (!var2) {
         Ml_1 var3 = var1.id_class();
         float var4 = var1.id_byte();
         double var5 = (Double)((cb_3)id_import.id_class[57]).id_throws[34]
            + (((cb_3)id_import.id_class[57]).rx() - (Double)((cb_3)id_import.id_class[57]).id_throws[34]) * (double)var4;
         double var7 = (Double)((cb_3)id_import.id_class[57]).id_throws[35]
            + (((cb_3)id_import.id_class[57]).re() - (Double)((cb_3)id_import.id_class[57]).id_throws[35]) * (double)var4
            + 0.05;
         double var9 = (Double)((cb_3)id_import.id_class[57]).id_throws[36]
            + (((cb_3)id_import.id_class[57]).BO() - (Double)((cb_3)id_import.id_class[57]).id_throws[36]) * (double)var4;
         ((List)this.id_break[id_byte[18]]).add(new rrqR_2(var5, var7, var9));
         rrqR_2 var13 = null;
         boolean var14 = true;
         int var16 = id_private[3];
         var3.id_class();
         RenderSystem.enableSmoothShadeModel();
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.disableAlphaTest();
         RenderSystem.depthMask(id_private[4]);
         RenderSystem.disableTexture();
         rjV_2 var17 = var3.id_byte().id_class();
         id_strictfp.id_class(7, ju_3.id_this);
         Iterator var18 = ((List)this.id_break[id_byte[21]]).iterator();
         long var19 = rqR_2.id_break();
         float var21 = ((cb_3)id_import.id_class[57]).Bm();
         if (((cb_3)id_import.id_class[57]).x() && !((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break) {
            var21 *= 0.8F;
         }

         float var22 = var21 * 0.01F;
         double var23 = id_void.id_case();
         double var25 = id_void.id_catch();
         double var27 = id_void.id_private();

         while (var18.hasNext()) {
            rrqR_2 var29 = (rrqR_2)var18.next();
            if (var19 - (Long)var29.id_class[4] > 300L) {
               var18.remove();
            } else {
               int var15 = ColorHelper.id_class((Float)var29.id_class[3], (int)((float)(255 * (255 - Math.round((Float)var29.id_class[3]))) / 220.0F));
               float var30 = (float)((Double)var29.id_class[id_byte[31]] - var23);
               float var31 = (float)((Double)var29.id_class[1] - var25);
               float var32 = (float)((Double)var29.id_class[2] - var27);
               float var33 = var14 ? id_finally[3] : (float)((Double)var13.id_class[id_byte[34]] - var23);
               float var34 = var14 ? id_finally[4] : (float)((Double)var13.id_class[1] - var25);
               float var35 = var14 ? id_finally[5] : (float)((Double)var13.id_class[2] - var27);
               if (var14) {
                  id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
                  id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
               } else {
                  id_strictfp.id_class(var17, var33, var34, var35).id_class(var16).id_class();
                  id_strictfp.id_class(var17, var33, var34 + var21, var35).id_class(var16).id_class();
               }

               id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
               id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
               if (var14) {
                  id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
                  id_strictfp.id_class(var17, var30, var31 + var22, var32).id_class(var15).id_class();
               } else {
                  id_strictfp.id_class(var17, var33, var34, var35).id_class(var16).id_class();
                  id_strictfp.id_class(var17, var33, var34 + var22, var35).id_class(var16).id_class();
               }

               id_strictfp.id_class(var17, var30, var31 + var22, var32).id_class(var15).id_class();
               id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
               double var11 = (double)(var31 + var21 - var22);
               if (var14) {
                  id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
                  id_strictfp.id_class(var17, var30, (float)var11, var32).id_class(var15).id_class();
               } else {
                  id_strictfp.id_class(var17, var33, var34 + var21, var35).id_class(var16).id_class();
                  id_strictfp.id_class(var17, var33, var34 + var21 - var22, var35).id_class(var16).id_class();
               }

               id_strictfp.id_class(var17, var30, (float)var11, var32).id_class(var15).id_class();
               id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
               var14 = id_private[5];
               var13 = var29;
               var16 = var15;
               Float var40 = rfU_2.id_class((float)(var19 - (Long)var29.id_class[4]) / 250.0F, id_finally[7], 1.0F) * 255.0F;
               var29.id_class[3] = var40;
            }
         }

         id_default.id_break();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableCull();
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         RenderSystem.enableTexture();
         RenderSystem.disableSmoothShadeModel();
         var3.id_break();
         rrfa_3.id_class();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -688699667;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-89, 84, -52, 108, -75, 39, 81, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_goto() {
      id_catch = new byte[]{7};
   }

   private static void id_continue() {
      id_finally = new float[]{0.8F, 0.01F, 220.0F, 0.0F, 0.0F, 0.0F, 250.0F, 0.0F, 1.0F, 255.0F};
   }

   private static void id_else() {
      id_throws = new long[]{300L};
   }

   private static void id_new() {
      id_byte = new short[]{
         2, 0, 20, 57, 34, 57, 57, 34, 57, 35, 57, 57, 35, 57, 36, 57, 57, 36, 0, 770, 771, 0, 57, 57, 57, 18, 4, 3, 255, 255, 3, 0, 1, 2, 0, 1, 2, 4, 3
      };
   }

   private static void id_return() {
      id_protected = new String[]{new String("Trails"), new String("Оставляет след за вами")};
   }

   private static void id_super() {
      id_private = new boolean[]{true, false, true, false, false, false, true, true};
   }

   private static void id_public() {
      id_implements = new double[]{0.05};
   }
}
