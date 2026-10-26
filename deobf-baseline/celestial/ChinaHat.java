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
      super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_protected[0]]);
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
         RenderSystem.lineWidth(id_throws[0]);
         GL11.glEnable(id_protected[1]);
         GL11.glHint(id_protected[2], id_protected[3]);
         var19.id_class(id_implements[0], (double)var8, id_implements[1]);
         var19.id_class(rje_3.id_throws.id_byte(id_throws[1]));
         var19.id_class(rje_3.id_protected.id_byte(id_throws[2]));
         rjV_2 var9 = var19.id_byte().id_class();
         ((lD_2)rrfD_2.id_class[id_protected[4]]).id_class(id_catch[0], ju_3.id_this);
         ((lD_2)rrfD_2.id_class[id_protected[5]]).id_class(id_catch[1], ju_3.id_this);
         int var17 = ColorHelper.id_class(id_throws[3]);

         for (int var18 = id_byte[0]; var18 <= id_protected[6]; var18++) {
            float var10 = (float)var18 * (Float)id_break[id_protected[7]];
            int var11 = var18 * id_catch[2];
            float var12 = (float)((double)rfU_2.id_class(var10) * var6);
            float var13 = id_throws[4];
            float var14 = (float)((double)rfU_2.id_break(var10) * var6);
            int var15 = ColorHelper.id_class((float)var11, id_catch[3]);
            ((lD_2)rrfD_2.id_class[id_protected[8]]).id_class(var9, var12, var13, var14).id_class(var15).id_class();
            ((lD_2)rrfD_2.id_class[id_protected[9]]).id_class(var9, id_throws[5], id_throws[6], id_throws[7]).id_class(var17).id_class();
            int var16 = ColorHelper.id_class((float)var11, id_protected[10]);
            ((lD_2)rrfD_2.id_class[id_protected[11]]).id_class(var9, var12, var13, var14).id_class(var16).id_class();
         }

         id_default.id_class((lD_2)rrfD_2.id_class[id_protected[12]]);
         RenderSystem.depthMask(id_byte[1]);
         id_default.id_class((lD_2)rrfD_2.id_class[id_protected[13]]);
         RenderSystem.depthMask(id_byte[2]);
         RenderSystem.enableCull();
         RenderSystem.enableTexture();
         RenderSystem.disableSmoothShadeModel();
         GL11.glDisable(id_protected[14]);
         var19.id_break();
      }
   }

   private float id_class(an_3 var1) {
      float var2 = id_throws[8];
      if (var1 instanceof iB_2 var3 && var3.id_class(rXQ.HEAD).id_break() instanceof rxS_2) {
         var2 -= id_throws[9];
      }

      if (((Qw_1)id_import.id_class[id_protected[15]]).id_break(rhQ_2.HAT)) {
         var2 -= id_throws[10];
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
