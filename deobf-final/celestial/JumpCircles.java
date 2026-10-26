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
   private static byte[] byte_;
   public Object[] break_;
   private static boolean[] protected_;
   private static double[] throws_;
   private static short[] catch_;
   private static String[] private_;
   private static float[] implements_;

   public JumpCircles() {
      super("Jump Circles", "Добавляет анимацию прыжка под\nвами", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.continue_();
      rrIm_1 var5 = this.class_(new rrIm_1("Радиус", 1.5F, 1.0F, 2.0F, 0.1F));
      this.break_[0] = var5;
      rrIm_1 var6 = this.class_(new rrIm_1("Радиус свечения", 1.0F, 1.0F, 2.0F, 0.1F));
      this.break_[1] = var6;
      rrIm_1 var7 = this.class_(new rrIm_1("Скорость", 0.3F, 0.3F, 1.0F, 0.1F));
      this.break_[2] = var7;
      rrvH var8 = new rrvH(20);
      this.break_[3] = var8;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new short[]{2, 0, 1, 2, 3, 3, 770, 2884, 0, 1, 255, 3, 0, 3, 2, 3, 3, 3, 3, 3, 2884, 770, 771, 57, 57, 3, 57, 57, 0, 1, 2};
   }

   private void class_(Ml_1 var1, rrqT_2 var2, float var3, float var4, float var5) {
      int var7 = ColorHelper.class_(0.0F);
      double var8 = (Double)var2.class_[0] - void_.case_();
      double var10 = (Double)var2.class_[1] - void_.catch_();
      double var12 = (Double)var2.class_[2] - void_.private_();
      if (var4 <= 0.0F) {
         var4 = 0.0F;
      }

      float var14 = rfU_2.throws_;

      for (float var25 = 0.0F; var25 < 360.0F; var25 += 8.0F) {
         double var21 = Math.sin((double)((var25 - 8.0F) * var14));
         double var23 = Math.cos((double)((var25 - 8.0F) * var14));
         double var17 = Math.sin((double)(var25 * var14));
         double var19 = Math.cos((double)(var25 * var14));
         double var15 = (double)(var3 - var3 / 100.0F * var5);
         int var6 = ColorHelper.class_(var25);
         this.class_(var1, var3, (int)var4, var6, var7, var15, var17, var19, var21, var23, var8, var10, var12);
         var15 = (double)(var3 + var3 / 100.0F * var5);
         this.class_(var1, var3, (int)var4, var6, var7, var15, var17, var19, var21, var23, var8, var10, var12);
         this.class_(var1, var3, (int)var4, var6, var7, (double)var3 + ((double)var3 - var15) / 8.0, var17, var19, var21, var23, var8, var10, var12);
         var7 = var6;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -611624497;
   }

   @EventTarget
   public void class_(RenderEvent var1) {
      this.continue_();
      if (!((List)this.break_[3]).isEmpty()) {
         Ml_1 var2 = var1.class_();
         RenderSystem.depthMask(false);
         RenderSystem.disableTexture();
         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(770, 1);
         RenderSystem.enableSmoothShadeModel();
         GL11.glDisable(2884);
         strictfp_.class_(7, ju_3.this_);
         float var3 = ((rrIm_1)this.break_[0]).byte_();
         float var4 = ((rrIm_1)this.break_[1]).byte_();
         short var5 = 255;
         Iterator var6 = ((List)this.break_[3]).iterator();

         while (var6.hasNext()) {
            rrqT_2 var7 = (rrqT_2)var6.next();
            if (var7.class_()) {
               var6.remove();
            } else {
               Float var13 = rfU_2.class_(
                  rrQo_1.class_(
                     (rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0],
                     (double)((Float)var7.class_[3]).floatValue(),
                     (double)var3,
                     (double)(((rrIm_1)this.break_[2]).byte_() / 10.0F)
                  ),
                  0.0F,
                  var3
               );
               var7.class_[3] = var13;
               float var8 = 0.0F;
               if ((Float)var7.class_[3] > (Float)var7.class_[3] / 6.0F) {
                  var8 = (Float)var7.class_[3] / 6.0F;
               }

               this.class_(var2, var7, (Float)var7.class_[3], (float)var5 - var8 * 2000.0F / var3, var4 * 20.0F);
            }
         }

         default_.break_();
         GL11.glEnable(2884);
         RenderSystem.disableSmoothShadeModel();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.disableBlend();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableTexture();
         RenderSystem.depthMask(true);
      }
   }

   private void class_(
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
      rjV_2 var22 = var1.byte_().class_();
      strictfp_.class_(var22, (float)(var16 + var12 * var6), (float)var18, (float)(var20 + var14 * var6)).class_(var5, 0).class_();
      strictfp_.class_(var22, (float)(var16 + var12 * (double)var2), (float)var18, (float)(var20 + var14 * (double)var2)).class_(var5, var3).class_();
      strictfp_.class_(var22, (float)(var16 + var8 * (double)var2), (float)var18, (float)(var20 + var10 * (double)var2)).class_(var4, var3).class_();
      strictfp_.class_(var22, (float)(var16 + var8 * var6), (float)var18, (float)(var20 + var10 * var6)).class_(var4, 0).class_();
   }

   @EventTarget
   public void class_(rrAS var1) {
      this.continue_();
      rfl_3 var2 = rrjc_3.break_(((cb_3)import_.class_[57]).Bs());
      double var3 = ((cb_3)import_.class_[57]).re();
      var3 = Math.min(var3 + var2.throws_ + 0.05, var3 + 0.15);
      ((List)this.break_[3]).add(new rrqT_2(this, ((cb_3)import_.class_[57]).rx(), var3, ((cb_3)import_.class_[57]).BO()));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6137428043958517729L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, -50, -113, -76, -44, -128, -118, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void continue_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
      }
   }

   private static void else_() {
      protected_ = new boolean[]{false, true, true, false, false};
   }

   private static void new_() {
      throws_ = new double[]{0.05, 0.15, 8.0};
   }

   private static void return_() {
      byte_ = new byte[]{20, 7, 4};
   }

   private static void super_() {
      private_ = new String[]{
         new String("Jump Circles"),
         new String("Добавляет анимацию прыжка под\nвами"),
         new String("Радиус"),
         new String("Радиус свечения"),
         new String("Скорость")
      };
   }

   private static void public_() {
      implements_ = new float[]{
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
