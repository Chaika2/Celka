package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class TestFunc extends Module {
   private static String[] protected_;
   private static double[] throws_;
   private static long[] catch_;
   public Object[] break_;
   private static float[] private_;
   private static boolean[] implements_;
   public static Object[] byte_;
   private static short[] finally_;
   private static byte[] extends_;

   public TestFunc() {
      super("Test Func", "Test :)", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.goto_();
      ArrayList var5 = new ArrayList();
      this.break_[0] = var5;
      ArrayList var6 = new ArrayList();
      this.break_[1] = var6;
      ArrayList var7 = new ArrayList();
      this.break_[2] = var7;
      Long var8 = -1L;
      this.break_[4] = var8;
   }

   static {
      ntfClinit();
   }

   private void this_() {
      this.goto_();
      Integer var5 = 0;
      this.break_[3] = var5;
      Long var6 = -1L;
      this.break_[4] = var6;
      ((List)this.break_[0]).clear();
      ((List)this.break_[1]).clear();
      ((List)this.break_[2]).clear();
      ((List)byte_[0]).clear();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6091643480443415464L;
   }

   @EventTarget
   public void class_(rrnB_2 var1) {
      this.goto_();
      Ml_1 var2 = var1.class_();
      rrZO var3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).break_();
      float var4 = import_.else_().final_() / 2.0F + 45.0F;
      var2.class_();
      var3.break_(strictfp_);
      rrfD_2.throws_((lD_2)rrfD_2.class_[7]);

      for (rryE var6 : (List)byte_[0]) {
         rrfD_2.class_(var2, (lD_2)rrfD_2.class_[7], (Float)var6.class_[1], var4 + (Float)var6.class_[2], 5.0F, 1.0F, -1);
         if (Math.abs((Float)var6.class_[2]) > 3.0F) {
            String var7 = String.format("%.1f", Math.abs((Float)var6.class_[2]));
            var3.class_(
               var2,
               strictfp_,
               var7,
               (double)((Float)var6.class_[1]).floatValue(),
               (double)(var4 + (Float)var6.class_[2] + (float)(var6.class_[2] > 0.0F ? 5 : extends_[2])),
               Color.RED.getRGB(),
               false,
               false
            );
         }
      }

      rrfD_2.private_((lD_2)rrfD_2.class_[7]);
      var3.byte_(strictfp_);
      var2.break_();
      int var9 = 40;
      ((cm_3)import_.class_[15]).class_(var2, "Hit count: " + (Integer)this.break_[3], (int)(import_.else_().volatile_() / 2.0F), var9, -1);
      var9 += 15;
      if ((Long)this.break_[4] != -1L) {
         long var13 = rqR_2.break_() - (Long)this.break_[4];
         String var8 = "Duration: " + rql_3.class_(Duration.ofMillis(var13), rqy_3.HOURS, rqy_3.MINUTES, rqy_3.SECONDS);
         ((cm_3)import_.class_[15]).class_(var2, var8, (int)(import_.else_().volatile_() / 2.0F), var9, -1);
         var9 += 15;
      }

      if (!((List)this.break_[1]).isEmpty()) {
         float var14 = (float)((List)this.break_[1]).stream().mapToDouble(Float::doubleValue).average().orElse(0.0);
         float var16 = (float)((List)this.break_[1]).stream().mapToDouble(Float::doubleValue).max().orElse(0.0);
         float var18 = (float)((List)this.break_[1]).stream().mapToDouble(Float::doubleValue).min().orElse(0.0);
         ((cm_3)import_.class_[15]).class_(var2, String.format("Average yaw speed: %.2f", var14), (int)(import_.else_().volatile_() / 2.0F), var9, -1);
         var9 += 15;
         ((cm_3)import_.class_[15])
            .class_(var2, String.format("Max yaw speed: %.2f | Min yaw speed: %.2f", var16, var18), (int)(import_.else_().volatile_() / 2.0F), var9, -1);
         var9 += 15;
      }

      if (!((List)this.break_[2]).isEmpty()) {
         float var15 = (float)((List)this.break_[2]).stream().mapToDouble(Float::doubleValue).average().orElse(0.0);
         float var17 = (float)((List)this.break_[2]).stream().mapToDouble(Float::doubleValue).max().orElse(0.0);
         float var19 = (float)((List)this.break_[2]).stream().mapToDouble(Float::doubleValue).min().orElse(0.0);
         ((cm_3)import_.class_[15]).class_(var2, String.format("Average pitch speed: %.2f", var15), (int)(import_.else_().volatile_() / 2.0F), var9, -1);
         var9 += 15;
         ((cm_3)import_.class_[15])
            .class_(var2, String.format("Max pitch speed: %.2f | Min pitch speed: %.2f", var17, var19), (int)(import_.else_().volatile_() / 2.0F), var9, -1);
      }
   }

   @EventTarget
   public void class_(rrAM var1) {
      this.this_();
   }

   @EventTarget
   public void class_(RenderEvent var1) {
      if (!((List)rrTT.break_[1]).isEmpty()) {
         double var2 = void_.case_();
         double var4 = void_.catch_();
         double var6 = void_.private_();
         Ml_1 var8 = var1.class_();
         var8.class_();
         RenderSystem.enableBlend();
         RenderSystem.disableTexture();
         RenderSystem.disableDepthTest();
         RenderSystem.disableCull();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.lineWidth(5.0F);
         GL11.glEnable(2848);
         GL11.glHint(3154, 4354);
         GL11.glPointSize(5.0F);
         strictfp_.class_(0, ju_3.this_);
         rjV_2 var9 = var8.byte_().class_();

         for (rrTA var11 : (List)rrTT.break_[1]) {
            rjU_2 var12 = var11.rr();
            int var13 = ColorHelper.class_(255, 0, 0, 255);
            strictfp_.class_(var9, (float)(var12.break_ - var2), (float)(var12.byte_ - var4), (float)(var12.protected_ - var6)).class_(var13).class_();
         }

         default_.break_();
         if ((rrTA)rrTT.break_[2] != null) {
            strictfp_.class_(0, ju_3.this_);
            rrTA var14 = (rrTA)rrTT.break_[2];
            rjU_2 var15 = var14.rr();
            int var16 = ColorHelper.class_(0, 0, 255, 255);
            strictfp_.class_(var9, (float)(var15.break_ - var2), (float)(var15.byte_ - var4), (float)(var15.protected_ - var6)).class_(var16).class_();
            default_.break_();
         }

         RenderSystem.enableDepthTest();
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
         RenderSystem.enableCull();
         RenderSystem.lineWidth(1.0F);
         var8.break_();
      }
   }

   @EventTarget
   public void class_(rrFj_1 var1) {
      this.goto_();
      Integer var6 = (Integer)this.break_[3] + 1;
      this.break_[3] = var6;
      if ((Long)this.break_[4] == -1L) {
         Long var7 = rqR_2.break_();
         this.break_[4] = var7;
      }
   }

   @EventTarget
   public void class_(rrAo_1 var1) {
      this.goto_();
      float var2 = var1.throws_();
      float var3 = var1.this_();
      if (var3 > 0.0F && var2 > 0.0F) {
      }

      if (var3 > 0.0F && (Integer)this.break_[3] > 0) {
         ((List)this.break_[1]).add(Math.abs(var3));
      }

      if (var2 > 0.0F) {
         if ((Integer)this.break_[3] > 0) {
            ((List)this.break_[2]).add(Math.abs(var2));
         }

         float var4 = var1.continue_();
         float var5 = ((List)byte_[0]).isEmpty() ? 0.0F : (Float)((rryE)((List)byte_[0]).get(((List)byte_[0]).size() - 1)).class_[1];
         float var6 = var4 - ((cb_3)import_.class_[57]).b();
         byte var7 = 5;
         ((List)byte_[0]).add(new rryE(var4, var5 + (float)var7, var6));
         if (var5 + (float)(var7 * 2) > import_.else_().volatile_()) {
            ((List)byte_[0]).clear();
         }
      }

      if (((List)this.break_[0]).size() > 300) {
         StringBuilder var8 = new StringBuilder();

         for (PX var11 : (List)this.break_[0]) {
            var8.append("new Rotation(").append(var11.throws_()).append("F, ").append(var11.protected_()).append("F), ");
         }

         String var10 = var8.toString();
         rrfu_3.byte_("First 300 rotations");
         System.out.println(var10);
         ((List)this.break_[0]).clear();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1827744530;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, 51, 57, 88, -52, 63, -72, 18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.this_();
   }

   private void goto_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
         this.break_[3] = 0;
         this.break_[4] = 0L;
      }
   }

   private static void continue_() {
      extends_ = new byte[]{-1, 5, -5, 40, -1, 3, 2, -1, -1, 2, -1, -1, 2, -1, 5, 2, 5, 3, 4};
   }

   private static void else_() {
      throws_ = new double[6];
   }

   private static void new_() {
      protected_ = new String[]{
         new String("Test Func"),
         new String("Test :)"),
         new String("%.1f"),
         new String("Average yaw speed: %.2f"),
         new String("Max yaw speed: %.2f | Min yaw speed: %.2f"),
         new String("Average pitch speed: %.2f"),
         new String("Max pitch speed: %.2f | Min pitch speed: %.2f"),
         new String("new Rotation("),
         new String("F, "),
         new String("F), "),
         new String("First 300 rotations")
      };
   }

   private static void return_() {
      finally_ = new short[]{
         4,
         0,
         1,
         2,
         4,
         0,
         7,
         0,
         7,
         1,
         2,
         2,
         2,
         1,
         2,
         2,
         7,
         15,
         3,
         4,
         4,
         15,
         1,
         1,
         1,
         1,
         15,
         15,
         2,
         2,
         2,
         2,
         15,
         15,
         3,
         1,
         3,
         2,
         0,
         0,
         0,
         1,
         57,
         0,
         0,
         0,
         300,
         0,
         0,
         1,
         770,
         771,
         2848,
         3154,
         4354,
         1,
         255,
         255,
         2,
         2,
         255,
         255,
         3,
         3,
         4,
         4,
         3,
         4,
         0,
         1,
         2,
         0
      };
   }

   private static void super_() {
      implements_ = new boolean[]{
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true
      };
   }

   private static void try_() {
      Object[] var0 = new Object[]{new ArrayList()};
      byte_ = var0;
   }

   private static void while_() {
      catch_ = new long[]{-1L, -1L, -1L, -1L, 0L};
   }

   private static void public_() {
      private_ = new float[]{2.0F, 45.0F, 5.0F, 1.0F, 3.0F, 0.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 5.0F, 1.0F};
   }
}
