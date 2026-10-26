package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ShulkerPreview extends Module {
   private static float[] protected_;
   private static byte[] throws_;
   private static double[] catch_;
   private static String[] private_;
   public Object[] break_;
   private static int[] implements_;
   public static Object[] byte_;
   private static short[] finally_;
   private static boolean[] extends_;

   public ShulkerPreview() {
      super("Shulker Preview", "Отображает содержимое шалкера\nпри наведении на него", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.while_();
      rrIF var5 = new rrIF("Открыть меню", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[3]);
      this.break_[1] = var5;
      this.class_((rrIF)this.break_[1]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new double[1];
   }

   public static void class_(Ml_1 var0, List<rdn_3> var1, float var2, float var3, float[] var4) {
      class_(var0, var1, var2, var3, var4, 1.0F);
   }

   private void class_(List<rdn_3> var1, vm_3 var2, rdn_3 var3, float[] var4) {
      this.while_();
      Runnable var9 = () -> {
         try {
            rJr_1 var4x = (rJr_1)((cb_3)import_.class_[finally_[31]]).implements_[finally_[32]];
            rrTN var5 = new rrTN(var1);
            ((cb_3)import_.class_[finally_[33]]).implements_[finally_[34]] = var5;
            import_.break_(new rrTW(var2, var4x, var5, var3.continue_(), var4));
         } catch (Exception var11) {
            var11.printStackTrace();
            System.out.println("Failed to open Shulker Preview screen: " + var11.getMessage());
         }
      };
      this.break_[0] = var9;
   }

   private static void class_(List<rdn_3> var0) {
      int var1 = Math.min(var0.size(), 27);
      if (var1 != 0) {
         QY var2 = QY.instanceof_();
         Hz_1 var3 = var2.float_();
         float var4 = var3.break_;
         var3.break_ = 300.0F;
         byte var5 = 7;
         byte var6 = 7;

         for (int var7 = 0; var7 < var1; var7++) {
            rdn_3 var8 = (rdn_3)var0.get(var7);
            if (var8 != null && !var8.class_()) {
               int var9 = var7 / 9;
               int var10 = var7 % 9;
               int var11 = var5 + var10 * 18 + 1;
               int var12 = var6 + var9 * 18 + 1;
               var3.class_(var8, (float)var11, (float)var12);
               var3.class_((cm_3)var2.class_[15], var8, (float)var11, (float)var12, null);
            }
         }

         var3.break_ = var4;
      }
   }

   public static void class_(Ml_1 var0, List<? extends rrTu_1> var1) {
      if (!var1.isEmpty()) {
         QY var2 = QY.instanceof_();
         Hz_1 var3 = var2.float_();
         var2.A().class_(fJ_2.class_);
         var2.A().break_(fJ_2.class_).class_(false, false);
         RenderSystem.enableRescaleNormal();
         RenderSystem.enableAlphaTest();
         RenderSystem.defaultAlphaFunc();
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         Hd_1 var4 = var2.interface_().break_();
         Ml_1 var5 = (Ml_1)byte_[10];
         int var6 = var1.size();
         if (((boolean[])byte_[12]).length < var6) {
            boolean[] var23 = new boolean[var6];
            byte_[12] = var23;
            boolean[] var24 = new boolean[var6];
            byte_[13] = var24;
         }

         boolean var7 = extends_[5];
         boolean var8 = false;
         boolean var9 = false;

         for (int var10 = 0; var10 < var6; var10++) {
            rrTu_1 var11 = (rrTu_1)var1.get(var10);
            float var12 = 250.0F + (float)var10 * 25.0F;
            var0.class_();
            var0.class_((double)var11.private_(), (double)var11.break_(), (double)var12);
            if (var11.class_() != 1.0F) {
               var0.class_(var11.class_(), var11.class_(), 1.0F);
            }

            class_(var0, var11.throws_(), true);
            if (var11.byte_() != null) {
               ((cm_3)var2.class_[15]).class_(var11.byte_().catch_(), 8.0F, 6.0F, 4210752, false, var0.byte_().class_(), var4, true, 0, 15728880);
               var9 = true;
            }

            var0.break_();
            IJ[] var13 = var11.catch_();
            int var14 = Math.min(var11.protected_().size(), 27);
            boolean var15 = false;
            boolean var16 = false;

            for (int var17 = 0; var17 < var14; var17++) {
               IJ var18 = var13[var17];
               if (var18 != null) {
                  if (var18.byte_()) {
                     var15 = true;
                  } else {
                     var16 = extends_[18];
                  }

                  if (var15 && var16) {
                     break;
                  }
               }
            }

            ((boolean[])byte_[12])[var10] = var15;
            ((boolean[])byte_[13])[var10] = var16;
            var7 |= var15;
            var8 |= var16;
         }

         if (var9) {
            var4.break_();
         }

         if (var7) {
            for (int var25 = 0; var25 < var6; var25++) {
               if (((boolean[])byte_[12])[var25]) {
                  class_(var3, var4, var5, (rrTu_1)var1.get(var25), true, 250.0F + (float)var25 * 25.0F);
               }
            }

            var4.break_();
         }

         if (var8) {
            HF.byte_();

            for (int var26 = 0; var26 < var6; var26++) {
               if (((boolean[])byte_[13])[var26]) {
                  class_(var3, var4, var5, (rrTu_1)var1.get(var26), false, 250.0F + (float)var26 * 25.0F);
               }
            }

            var4.break_();
            HF.protected_();
         }

         boolean var27 = extends_[23];

         for (int var28 = 0; var28 < var6; var28++) {
            if (class_((cm_3)var2.class_[15], var4, (rrTu_1)var1.get(var28), 250.0F + (float)var28 * 25.0F)) {
               var27 = true;
            }
         }

         if (var27) {
            var4.break_();
         }

         HF.break_();
         RenderSystem.disableLighting();
         RenderSystem.disableRescaleNormal();
         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.depthFunc(515);
         RenderSystem.enableDepthTest();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         HF.protected_();
      }
   }

   public static void class_(Ml_1 var0, List<rdn_3> var1, float var2, float var3, float[] var4, float var5) {
      var0.class_();
      var0.class_((double)var2, (double)var3, 0.0);
      if (var5 != 1.0F) {
         var0.class_(var5, var5, 1.0F);
      }

      class_(var0, var4, false);
      var0.break_();
      RenderSystem.pushMatrix();
      RenderSystem.translatef(var2, var3, 32.0F);
      if (var5 != 1.0F) {
         RenderSystem.scalef(var5, var5, 1.0F);
      }

      class_(var1);
      RenderSystem.popMatrix();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 851305851;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5663269859304031022L;
   }

   public static float[] class_(rxL_2 var0) {
      return (float[])((Map)byte_[14]).getOrDefault(var0, (float[])((Map)byte_[14]).get(null));
   }

   @EventTarget
   public void class_(j_1 var1) {
      this.while_();
      Object var6 = null;
      this.break_[0] = var6;
   }

   private static void class_(Hz_1 var0, Hx_1 var1, Ml_1 var2, rrTu_1 var3, boolean var4, float var5) {
      List var6 = var3.protected_();
      IJ[] var7 = var3.catch_();
      int var8 = Math.min(var6.size(), 27);
      float var9 = var3.class_();
      float var10 = var3.private_();
      float var11 = var3.break_();

      for (int var12 = 0; var12 < var8; var12++) {
         rdn_3 var13 = (rdn_3)var6.get(var12);
         if (var13 != null && !var13.class_()) {
            IJ var14 = var7[var12];
            if (var14 != null && var14.byte_() == var4) {
               int var15 = var12 / 9;
               int var16 = var12 % 9;
               float var17 = var10 + (float)(7 + var16 * 18 + 1) * var9;
               float var18 = var11 + (float)(17 + var15 * 18 + 1) * var9;
               var2.class_();
               var2.class_((double)(var17 + 8.0F * var9), (double)(var18 + 8.0F * var9), (double)(var5 + 10.0F));
               var2.class_(16.0F * var9, -16.0F * var9, 16.0F * var9);
               var0.class_(var13, IQ.GUI, false, var2, var1, 15728880, fZ_2.class_, var14);
               var2.break_();
            }
         }
      }
   }

   @EventTarget
   public void class_(rrnS_2 var1) {
      vm_3 var2 = var1.break_();
      if (var2 instanceof Fu_1 var3) {
         rJY var4 = var3.int_();
         vZ_2 var5 = var3.instanceof_();
         if (var4 == null || var5 == null) {
            return;
         }

         Ml_1 var6 = var1.throws_();
         rdn_3 var7 = var4.class_();
         if (var7.break_() instanceof rxJ_2 var8 && var8.catch_() instanceof Wp_1 var9) {
            rxL_2 var16 = var9.break_();
            List var11 = rrjm_3.class_(var7);
            float[] var12 = this.break_(var16);
            if (!var11.isEmpty()) {
               int var13 = (int)var5.class_();
               int var14 = (int)(var5.break_() + var5.protected_() + 2.0F);
               this.class_(var2, var11, var13, var14, var12, var6);
               this.class_(var11, var2, var7, var12);
               var2.this_ = 70;
            }
         }
      }
   }

   @EventTarget
   public void class_(rrLs_1 var1) {
      this.while_();
      if (var1.protected_() == ((rrIF)this.break_[1]).finally_().byte_() && (Runnable)this.break_[0] != null) {
         var1.class_(true);
         ((Runnable)this.break_[0]).run();
      }
   }

   public void class_(vm_3 var1, List<rdn_3> var2, int var3, int var4, float[] var5, Ml_1 var6) {
      if (var1 != null) {
         var1.class_(200);
      }

      class_(var6, var2, (float)var3, (float)var4, var5);
      if (var1 != null) {
         var1.class_(0);
      }
   }

   private static void class_(Ml_1 var0, float[] var1, boolean var2) {
      QY var3 = QY.instanceof_();
      var3.A().class_(var2 ? (rqO_2)byte_[0] : (rqO_2)byte_[1]);
      RenderSystem.color4f(var1[0], var1[1], var1[2], 1.0F);
      byte var4 = var2 ? 78 : throws_[19];
      ch_3.class_(var0, 0, 0, 0.0F, 0.0F, 176, var4, 256, 256);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private static boolean class_(cm_3 var0, Hx_1 var1, rrTu_1 var2, float var3) {
      List var4 = var2.protected_();
      int var5 = Math.min(var4.size(), 27);
      float var6 = var2.class_();
      Ml_1 var7 = (Ml_1)byte_[11];
      var7.class_();
      var7.class_((double)var2.private_(), (double)var2.break_(), (double)(var3 + 20.0F));
      if (var6 != 1.0F) {
         var7.class_(var6, var6, 1.0F);
      }

      boolean var8 = extends_[31];

      for (int var9 = 0; var9 < var5; var9++) {
         rdn_3 var10 = (rdn_3)var4.get(var9);
         if (var10 != null && !var10.class_() && var10.char_() >= 2) {
            int var11 = var9 / 9;
            int var12 = var9 % 9;
            String var13 = String.valueOf(var10.char_());
            float var14 = (float)(7 + var12 * 18 + 1);
            float var15 = (float)(17 + var11 * 18 + 1);
            float var16 = var14 + 19.0F - 2.0F - (float)var0.break_(var13);
            float var17 = var15 + 6.0F + 3.0F;
            var0.class_(var13, var16, var17, 16777215, true, var7.byte_().class_(), var1, false, 0, 15728880);
            var8 = true;
         }
      }

      var7.break_();
      return var8;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{11, 115, -7, -33, 30, -94, -52, -99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private float[] break_(rxL_2 var1) {
      return class_(var1);
   }

   @Override
   public void throws_(boolean var1) {
      this.while_();
      super.throws_(var1);
      Object var6 = null;
      this.break_[0] = var6;
   }

   private static void goto_() {
      extends_ = new boolean[]{
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false
      };
   }

   private static void continue_() {
      private_ = new String[]{
         new String("Shulker Preview"),
         new String("Отображает содержимое шалкера\nпри наведении на него"),
         new String("Открыть меню"),
         new String("celestial/images/shulker_preview/container_with_title.png"),
         new String("celestial/images/shulker_preview/container.png")
      };
   }

   private static void else_() {
      Object[] var0 = new Object[]{
         new rqO_2("celestial/images/shulker_preview/container_with_title.png"),
         new rqO_2("celestial/images/shulker_preview/container.png"),
         18,
         9,
         3,
         10,
         176,
         78,
         68,
         0.0F,
         new Ml_1(),
         new Ml_1(),
         new boolean[0],
         new boolean[0],
         new rrTQ()
      };
      byte_ = var0;
   }

   private static void new_() {
      protected_ = new float[]{
         2.0F,
         1.0F,
         1.0F,
         1.0F,
         32.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         250.0F,
         25.0F,
         1.0F,
         1.0F,
         8.0F,
         6.0F,
         250.0F,
         25.0F,
         250.0F,
         25.0F,
         250.0F,
         25.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         8.0F,
         8.0F,
         10.0F,
         16.0F,
         -16.0F,
         16.0F,
         20.0F,
         1.0F,
         1.0F,
         19.0F,
         2.0F,
         6.0F,
         3.0F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         300.0F,
         250.0F
      };
   }

   private static void return_() {
      implements_ = new int[]{4210752, 15728880, 15728880, 16777215, 15728880};
   }

   private static void super_() {
      finally_ = new short[]{
         2, 3, 1, 1, 1, 0, 0, 0, 0, 0, 200, 10, 12, 12, 13, 15, 12, 13, 12, 13, 15, 515, 11, 0, 1, 176, 256, 256, 15, 14, 14, 57, 4, 57, 4, 176
      };
   }

   private void while_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }

   private static void public_() {
      throws_ = new byte[]{
         70,
         27,
         27,
         9,
         9,
         7,
         18,
         17,
         18,
         27,
         2,
         9,
         9,
         7,
         18,
         17,
         18,
         2,
         78,
         68,
         27,
         7,
         7,
         9,
         9,
         18,
         18,
         10,
         11,
         12,
         13,
         14,
         2,
         15,
         2,
         18,
         3,
         9,
         4,
         3,
         5,
         10,
         6,
         7,
         78,
         8,
         68,
         9
      };
   }
}
