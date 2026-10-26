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
   private static short[] byte_;
   private static String[] protected_;
   private static long[] throws_;
   private static byte[] catch_;
   public Object[] break_;
   private static boolean[] private_;
   private static double[] implements_;
   private static float[] finally_;

   public Trails() {
      super("Trails", "Оставляет след за вами", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.this_();
      ArrayList var5 = new ArrayList();
      this.break_[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4105235596140776910L;
   }

   @EventTarget
   public void class_(RenderEvent var1) {
      this.this_();
      boolean var2 = ((Qw_1)import_.class_[20]).volatile_() == VZ.FIRST_PERSON ? true : private_[1];
      if (!var2) {
         Ml_1 var3 = var1.class_();
         float var4 = var1.byte_();
         double var5 = (Double)((cb_3)import_.class_[57]).throws_[34]
            + (((cb_3)import_.class_[57]).rx() - (Double)((cb_3)import_.class_[57]).throws_[34]) * (double)var4;
         double var7 = (Double)((cb_3)import_.class_[57]).throws_[35]
            + (((cb_3)import_.class_[57]).re() - (Double)((cb_3)import_.class_[57]).throws_[35]) * (double)var4
            + 0.05;
         double var9 = (Double)((cb_3)import_.class_[57]).throws_[36]
            + (((cb_3)import_.class_[57]).BO() - (Double)((cb_3)import_.class_[57]).throws_[36]) * (double)var4;
         ((List)this.break_[0]).add(new rrqR_2(var5, var7, var9));
         rrqR_2 var13 = null;
         boolean var14 = true;
         int var16 = 0;
         var3.class_();
         RenderSystem.enableSmoothShadeModel();
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.disableAlphaTest();
         RenderSystem.depthMask(false);
         RenderSystem.disableTexture();
         rjV_2 var17 = var3.byte_().class_();
         strictfp_.class_(7, ju_3.this_);
         Iterator var18 = ((List)this.break_[0]).iterator();
         long var19 = rqR_2.break_();
         float var21 = ((cb_3)import_.class_[57]).Bm();
         if (((cb_3)import_.class_[57]).x() && !((rhx_3)((cb_3)import_.class_[57]).implements_[18]).break_) {
            var21 *= 0.8F;
         }

         float var22 = var21 * 0.01F;
         double var23 = void_.case_();
         double var25 = void_.catch_();
         double var27 = void_.private_();

         while (var18.hasNext()) {
            rrqR_2 var29 = (rrqR_2)var18.next();
            if (var19 - (Long)var29.class_[4] > 300L) {
               var18.remove();
            } else {
               int var15 = ColorHelper.class_((Float)var29.class_[3], (int)((float)(255 * (255 - Math.round((Float)var29.class_[3]))) / 220.0F));
               float var30 = (float)((Double)var29.class_[0] - var23);
               float var31 = (float)((Double)var29.class_[1] - var25);
               float var32 = (float)((Double)var29.class_[2] - var27);
               float var33 = var14 ? 0.0F : (float)((Double)var13.class_[0] - var23);
               float var34 = var14 ? 0.0F : (float)((Double)var13.class_[1] - var25);
               float var35 = var14 ? 0.0F : (float)((Double)var13.class_[2] - var27);
               if (var14) {
                  strictfp_.class_(var17, var30, var31, var32).class_(var15).class_();
                  strictfp_.class_(var17, var30, var31 + var21, var32).class_(var15).class_();
               } else {
                  strictfp_.class_(var17, var33, var34, var35).class_(var16).class_();
                  strictfp_.class_(var17, var33, var34 + var21, var35).class_(var16).class_();
               }

               strictfp_.class_(var17, var30, var31 + var21, var32).class_(var15).class_();
               strictfp_.class_(var17, var30, var31, var32).class_(var15).class_();
               if (var14) {
                  strictfp_.class_(var17, var30, var31, var32).class_(var15).class_();
                  strictfp_.class_(var17, var30, var31 + var22, var32).class_(var15).class_();
               } else {
                  strictfp_.class_(var17, var33, var34, var35).class_(var16).class_();
                  strictfp_.class_(var17, var33, var34 + var22, var35).class_(var16).class_();
               }

               strictfp_.class_(var17, var30, var31 + var22, var32).class_(var15).class_();
               strictfp_.class_(var17, var30, var31, var32).class_(var15).class_();
               double var11 = (double)(var31 + var21 - var22);
               if (var14) {
                  strictfp_.class_(var17, var30, var31 + var21, var32).class_(var15).class_();
                  strictfp_.class_(var17, var30, (float)var11, var32).class_(var15).class_();
               } else {
                  strictfp_.class_(var17, var33, var34 + var21, var35).class_(var16).class_();
                  strictfp_.class_(var17, var33, var34 + var21 - var22, var35).class_(var16).class_();
               }

               strictfp_.class_(var17, var30, (float)var11, var32).class_(var15).class_();
               strictfp_.class_(var17, var30, var31 + var21, var32).class_(var15).class_();
               var14 = false;
               var13 = var29;
               var16 = var15;
               Float var40 = rfU_2.class_((float)(var19 - (Long)var29.class_[4]) / 250.0F, 0.0F, 1.0F) * 255.0F;
               var29.class_[3] = var40;
            }
         }

         default_.break_();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableCull();
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         RenderSystem.enableTexture();
         RenderSystem.disableSmoothShadeModel();
         var3.break_();
         rrfa_3.class_();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -688699667;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-89, 84, -52, 108, -75, 39, 81, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void goto_() {
      catch_ = new byte[]{7};
   }

   private static void continue_() {
      finally_ = new float[]{0.8F, 0.01F, 220.0F, 0.0F, 0.0F, 0.0F, 250.0F, 0.0F, 1.0F, 255.0F};
   }

   private static void else_() {
      throws_ = new long[]{300L};
   }

   private static void new_() {
      byte_ = new short[]{
         2, 0, 20, 57, 34, 57, 57, 34, 57, 35, 57, 57, 35, 57, 36, 57, 57, 36, 0, 770, 771, 0, 57, 57, 57, 18, 4, 3, 255, 255, 3, 0, 1, 2, 0, 1, 2, 4, 3
      };
   }

   private static void return_() {
      protected_ = new String[]{new String("Trails"), new String("Оставляет след за вами")};
   }

   private static void super_() {
      private_ = new boolean[]{true, false, true, false, false, false, true, true};
   }

   private static void public_() {
      implements_ = new double[]{0.05};
   }
}
