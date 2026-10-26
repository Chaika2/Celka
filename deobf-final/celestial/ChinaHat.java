package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class ChinaHat extends Module {
   private static boolean[] byte_;
   private static short[] protected_;
   private static float[] throws_;
   private static byte[] catch_;
   private static String[] private_;
   public static Object[] break_;
   private static double[] implements_;

   public ChinaHat() {
      super("China Hat", "Китайская шляпка над головой", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new byte[]{5, 2, 4, 100};
   }

   @EventTarget
   public void class_(rrAV var1) {
      if (var1.class_() instanceof wh_3 var2) {
         Ml_1 var19 = var1.break_();
         an_3 var4 = var1.protected_();
         rfl_3 var5 = var4.rN();
         double var6 = var5.protected_ - var5.class_;
         float var8 = this.class_(var4);
         var19.class_();
         var2.class_.class_(var19);
         rrxL_2.break_();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         RenderSystem.disableTexture();
         RenderSystem.defaultBlendFunc();
         RenderSystem.enableSmoothShadeModel();
         RenderSystem.lineWidth(2.0F);
         GL11.glEnable(2848);
         GL11.glHint(3154, 4354);
         var19.class_(0.0, (double)var8, 0.0);
         var19.class_(rje_3.throws_.byte_(180.0F));
         var19.class_(rje_3.protected_.byte_(90.0F));
         rjV_2 var9 = var19.byte_().class_();
         ((lD_2)rrfD_2.class_[7]).class_(5, ju_3.this_);
         ((lD_2)rrfD_2.class_[8]).class_(2, ju_3.this_);
         int var17 = ColorHelper.class_(0.0F);

         for (int var18 = 0; var18 <= 180; var18++) {
            float var10 = (float)var18 * (Float)break_[0];
            int var11 = var18 * 4;
            float var12 = (float)((double)rfU_2.class_(var10) * var6);
            float var13 = 0.0F;
            float var14 = (float)((double)rfU_2.break_(var10) * var6);
            int var15 = ColorHelper.class_((float)var11, 100);
            ((lD_2)rrfD_2.class_[7]).class_(var9, var12, var13, var14).class_(var15).class_();
            ((lD_2)rrfD_2.class_[7]).class_(var9, 0.0F, 0.3F, 0.0F).class_(var17).class_();
            int var16 = ColorHelper.class_((float)var11, 255);
            ((lD_2)rrfD_2.class_[8]).class_(var9, var12, var13, var14).class_(var16).class_();
         }

         default_.class_((lD_2)rrfD_2.class_[7]);
         RenderSystem.depthMask(false);
         default_.class_((lD_2)rrfD_2.class_[8]);
         RenderSystem.depthMask(true);
         RenderSystem.enableCull();
         RenderSystem.enableTexture();
         RenderSystem.disableSmoothShadeModel();
         GL11.glDisable(2848);
         var19.break_();
      }
   }

   private float class_(an_3 var1) {
      float var2 = -0.38F;
      if (var1 instanceof iB_2 var3 && var3.class_(rXQ.HEAD).break_() instanceof rxS_2) {
         var2 -= 0.11F;
      }

      if (((Qw_1)import_.class_[20]).break_(rhQ_2.HAT)) {
         var2 -= 0.025F;
      }

      return var2;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4635855793450766812L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1722299101;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, -125, -47, 0, -96, -9, 59, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      private_ = new String[]{new String("China Hat"), new String("Китайская шляпка над головой")};
   }

   private static void else_() {
      implements_ = new double[2];
   }

   private static void new_() {
      byte_ = new boolean[]{false, false, true, false, true, false};
   }

   private static void return_() {
      throws_ = new float[]{2.0F, 180.0F, 90.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, -0.38F, 0.11F, 0.025F, 90.0F, 0.0F};
   }

   private static void super_() {
      Object[] var0 = new Object[]{-1.0842022E-19F};
      break_ = var0;
   }

   private static void public_() {
      protected_ = new short[]{2, 2848, 3154, 4354, 7, 8, 180, 0, 7, 7, 255, 8, 7, 8, 2848, 20};
   }
}
