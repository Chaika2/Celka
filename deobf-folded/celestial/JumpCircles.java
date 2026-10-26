package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class JumpCircles extends Module {
   private static byte[] id_byte;
   public Object[] id_break;
   private static boolean[] id_protected;
   private static double[] id_throws;
   private static short[] id_catch;
   private static String[] id_private;
   private static float[] id_implements;

   public JumpCircles() {
      super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.id_continue();
      rrIm_1 var5 = this.id_class(new rrIm_1(id_private[2], 1.5F, 1.0F, 2.0F, 0.1F));
      this.id_break[id_catch[1]] = var5;
      rrIm_1 var6 = this.id_class(new rrIm_1(id_private[3], 1.0F, 1.0F, 2.0F, 0.1F));
      this.id_break[1] = var6;
      rrIm_1 var7 = this.id_class(new rrIm_1(id_private[4], 0.3F, 0.3F, 1.0F, 0.1F));
      this.id_break[2] = var7;
      rrvH var8 = new rrvH(20);
      this.id_break[3] = var8;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new short[]{2, 0, 1, 2, 3, 3, 770, 2884, 0, 1, 255, 3, 0, 3, 2, 3, 3, 3, 3, 3, 2884, 770, 771, 57, 57, 3, 57, 57, 0, 1, 2};
   }

   private void id_class(Ml_1 var1, rrqT_2 var2, float var3, float var4, float var5) {
      int var7 = ColorHelper.id_class(id_implements[19]);
      double var8 = (Double)var2.id_class[id_catch[28]] - id_void.id_case();
      double var10 = (Double)var2.id_class[1] - id_void.id_catch();
      double var12 = (Double)var2.id_class[2] - id_void.id_private();
      if (var4 <= id_implements[20]) {
         var4 = id_implements[21];
      }

      float var14 = rfU_2.id_throws;

      for (float var25 = id_implements[22]; var25 < 360.0F; var25 += 8.0F) {
         double var21 = Math.sin((double)((var25 - 8.0F) * var14));
         double var23 = Math.cos((double)((var25 - 8.0F) * var14));
         double var17 = Math.sin((double)(var25 * var14));
         double var19 = Math.cos((double)(var25 * var14));
         double var15 = (double)(var3 - var3 / 100.0F * var5);
         int var6 = ColorHelper.id_class(var25);
         this.id_class(var1, var3, (int)var4, var6, var7, var15, var17, var19, var21, var23, var8, var10, var12);
         var15 = (double)(var3 + var3 / 100.0F * var5);
         this.id_class(var1, var3, (int)var4, var6, var7, var15, var17, var19, var21, var23, var8, var10, var12);
         this.id_class(var1, var3, (int)var4, var6, var7, (double)var3 + ((double)var3 - var15) / 8.0, var17, var19, var21, var23, var8, var10, var12);
         var7 = var6;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -611624497;
   }

   @EventTarget
   public void id_class(RenderEvent var1) {
      this.id_continue();
      if (!((List)this.id_break[3]).isEmpty()) {
         Ml_1 var2 = var1.id_class();
         RenderSystem.depthMask(id_protected[0]);
         RenderSystem.disableTexture();
         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(770, 1);
         RenderSystem.enableSmoothShadeModel();
         GL11.glDisable(2884);
         id_strictfp.id_class(7, ju_3.id_this);
         float var3 = ((rrIm_1)this.id_break[id_catch[8]]).id_byte();
         float var4 = ((rrIm_1)this.id_break[1]).id_byte();
         short var5 = 255;
         Iterator var6 = ((List)this.id_break[3]).iterator();

         while (var6.hasNext()) {
            rrqT_2 var7 = (rrqT_2)var6.next();
            if (var7.id_class()) {
               var6.remove();
            } else {
               Float var13 = rfU_2.id_class(
                  rrQo_1.id_class(
                     (rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_catch[12]],
                     (double)((Float)var7.id_class[3]).floatValue(),
                     (double)var3,
                     (double)(((rrIm_1)this.id_break[2]).id_byte() / 10.0F)
                  ),
                  id_implements[13],
                  var3
               );
               var7.id_class[3] = var13;
               float var8 = id_implements[14];
               if ((Float)var7.id_class[3] > (Float)var7.id_class[3] / 6.0F) {
                  var8 = (Float)var7.id_class[3] / 6.0F;
               }

               this.id_class(var2, var7, (Float)var7.id_class[3], (float)var5 - var8 * 2000.0F / var3, var4 * 20.0F);
            }
         }

         id_default.id_break();
         GL11.glEnable(2884);
         RenderSystem.disableSmoothShadeModel();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.disableBlend();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableTexture();
         RenderSystem.depthMask(true);
      }
   }

   private void id_class(
      Ml_1 var1,
      float var2,
      int var3,
      int var4,
      int var5,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20
   ) {
      rjV_2 var22 = var1.id_byte().id_class();
      id_strictfp.id_class(var22, (float)(var16 + var12 * var6), (float)var18, (float)(var20 + var14 * var6)).id_class(var5, id_protected[3]).id_class();
      id_strictfp.id_class(var22, (float)(var16 + var12 * (double)var2), (float)var18, (float)(var20 + var14 * (double)var2)).id_class(var5, var3).id_class();
      id_strictfp.id_class(var22, (float)(var16 + var8 * (double)var2), (float)var18, (float)(var20 + var10 * (double)var2)).id_class(var4, var3).id_class();
      id_strictfp.id_class(var22, (float)(var16 + var8 * var6), (float)var18, (float)(var20 + var10 * var6)).id_class(var4, id_protected[4]).id_class();
   }

   @EventTarget
   public void id_class(rrAS var1) {
      this.id_continue();
      rfl_3 var2 = rrjc_3.id_break(((cb_3)id_import.id_class[57]).Bs());
      double var3 = ((cb_3)id_import.id_class[57]).re();
      var3 = Math.min(var3 + var2.id_throws + 0.05, var3 + 0.15);
      ((List)this.id_break[3]).add(new rrqT_2(this, ((cb_3)id_import.id_class[57]).rx(), var3, ((cb_3)id_import.id_class[57]).BO()));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6137428043958517729L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, -50, -113, -76, -44, -128, -118, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_continue() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }

   private static void id_else() {
      id_protected = new boolean[]{false, true, true, false, false};
   }

   private static void id_new() {
      id_throws = new double[]{0.05, 0.15, 8.0};
   }

   private static void id_return() {
      id_byte = new byte[]{20, 7, 4};
   }

   private static void id_super() {
      id_private = new String[]{
         new String("Jump Circles"),
         new String("Добавляет анимацию прыжка под\nвами"),
         new String("Радиус"),
         new String("Радиус свечения"),
         new String("Скорость")
      };
   }

   private static void id_public() {
      id_implements = new float[]{
         1.5F,
         1.0F,
         2.0F,
         0.1F,
         1.0F,
         1.0F,
         2.0F,
         0.1F,
         0.3F,
         0.3F,
         1.0F,
         0.1F,
         10.0F,
         0.0F,
         0.0F,
         6.0F,
         6.0F,
         2000.0F,
         20.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         360.0F,
         8.0F,
         8.0F,
         100.0F,
         100.0F,
         8.0F
      };
   }
}
