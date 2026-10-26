package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class ChinaHat extends Module {
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static float[] id_throws;
   private static byte[] id_catch;
   private static String[] id_private;
   public static Object[] id_break;
   private static double[] id_implements;

   public ChinaHat() {
      super("China Hat", "Китайская шляпка над головой", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new byte[]{5, 2, 4, 100};
   }

   @EventTarget
   public void id_class(rrAV var1) {
      if (var1.id_class() instanceof wh_3 var2) {
         Ml_1 var19 = var1.id_break();
         an_3 var4 = var1.id_protected();
         rfl_3 var5 = var4.rN();
         double var6 = var5.id_protected - var5.id_class;
         float var8 = this.id_class(var4);
         var19.id_class();
         var2.id_class.id_class(var19);
         rrxL_2.id_break();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         RenderSystem.disableTexture();
         RenderSystem.defaultBlendFunc();
         RenderSystem.enableSmoothShadeModel();
         RenderSystem.lineWidth(2.0F);
         GL11.glEnable(2848);
         GL11.glHint(3154, 4354);
         var19.id_class(0.0, (double)var8, 0.0);
         var19.id_class(rje_3.id_throws.id_byte(180.0F));
         var19.id_class(rje_3.id_protected.id_byte(90.0F));
         rjV_2 var9 = var19.id_byte().id_class();
         ((lD_2)rrfD_2.id_class[7]).id_class(5, ju_3.id_this);
         ((lD_2)rrfD_2.id_class[8]).id_class(2, ju_3.id_this);
         int var17 = ColorHelper.id_class(0.0F);

         for (int var18 = 0; var18 <= 180; var18++) {
            float var10 = (float)var18 * (Float)id_break[0];
            int var11 = var18 * 4;
            float var12 = (float)((double)rfU_2.id_class(var10) * var6);
            float var13 = 0.0F;
            float var14 = (float)((double)rfU_2.id_break(var10) * var6);
            int var15 = ColorHelper.id_class((float)var11, 100);
            ((lD_2)rrfD_2.id_class[7]).id_class(var9, var12, var13, var14).id_class(var15).id_class();
            ((lD_2)rrfD_2.id_class[7]).id_class(var9, 0.0F, 0.3F, 0.0F).id_class(var17).id_class();
            int var16 = ColorHelper.id_class((float)var11, 255);
            ((lD_2)rrfD_2.id_class[8]).id_class(var9, var12, var13, var14).id_class(var16).id_class();
         }

         id_default.id_class((lD_2)rrfD_2.id_class[7]);
         RenderSystem.depthMask(false);
         id_default.id_class((lD_2)rrfD_2.id_class[8]);
         RenderSystem.depthMask(true);
         RenderSystem.enableCull();
         RenderSystem.enableTexture();
         RenderSystem.disableSmoothShadeModel();
         GL11.glDisable(2848);
         var19.id_break();
      }
   }

   private float id_class(an_3 var1) {
      float var2 = -0.38F;
      if (var1 instanceof iB_2 var3 && var3.id_class(rXQ.HEAD).id_break() instanceof rxS_2) {
         var2 -= 0.11F;
      }

      if (((Qw_1)id_import.id_class[20]).id_break(rhQ_2.HAT)) {
         var2 -= 0.025F;
      }

      return var2;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4635855793450766812L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1722299101;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, -125, -47, 0, -96, -9, 59, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_private = new String[]{new String("China Hat"), new String("Китайская шляпка над головой")};
   }

   private static void id_else() {
      id_implements = new double[2];
   }

   private static void id_new() {
      id_byte = new boolean[]{false, false, true, false, true, false};
   }

   private static void id_return() {
      id_throws = new float[]{2.0F, 180.0F, 90.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, -0.38F, 0.11F, 0.025F, 90.0F, 0.0F};
   }

   private static void id_super() {
      Object[] var0 = new Object[]{-1.0842022E-19F};
      id_break = var0;
   }

   private static void id_public() {
      id_protected = new short[]{2, 2848, 3154, 4354, 7, 8, 180, 0, 7, 7, 255, 8, 7, 8, 2848, 20};
   }
}
