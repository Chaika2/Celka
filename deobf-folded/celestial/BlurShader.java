package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;

public class BlurShader implements MinecraftAccessor {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static float[] id_protected;
   public static Object[] id_class;
   private static double[] id_throws;
   private static byte[] id_case;
   private static String[] id_catch;

   private static void id_byte() {
      id_catch = new String[]{
         new String("textureIn"),
         new String("texelSize"),
         new String("direction"),
         new String("radius"),
         new String("weights"),
         new String("celestial/shaders/gaussian.frag")
      };
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 358090614473018996L;
   }

   public static VC id_class(VC var0) {
      if (var0 != null && var0.id_byte == id_const.id_extends() && var0.id_protected == id_const.id_native()) {
         return var0;
      } else {
         if (var0 != null) {
            var0.id_class();
         }

         return new VC(id_const.id_extends(), id_const.id_native(), true, (Boolean)QY.id_break[2]);
      }
   }

   public static float id_class(float var0, float var1) {
      double var2 = 3.141592653;
      double var4 = 1.0 / Math.sqrt(6.283185306 * (double)(var1 * var1));
      return (float)(var4 * Math.exp((double)(-(var0 * var0)) / (2.0 * (double)(var1 * var1))));
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, 116, -33, 51, -71, 89, 33, 3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_case = new byte[]{2, 2};
   }

   public static void id_class(float var0, float var1, float var2) {
      ShaderManager var10000 = (ShaderManager)id_class[id_break[0]];
      String var10001 = id_catch[0];
      int[] var10002 = new int[1];
      var10002[id_byte[1]] = id_byte[2];
      var10000.id_class(var10001, var10002);
      ((ShaderManager)id_class[id_break[1]]).id_break(id_catch[1], 1.0F / (float)id_const.id_new(), 1.0F / (float)id_const.id_continue());
      ((ShaderManager)id_class[id_break[2]]).id_break(id_catch[2], var0, var1);
      ((ShaderManager)id_class[id_break[3]]).id_break(id_catch[3], var2);
      FloatBuffer var3 = BufferUtils.createFloatBuffer(256);

      for (int var4 = id_byte[3]; (float)var4 <= var2; var4++) {
         var3.put(id_class((float)var4, var2 / 2.0F));
      }

      var3.rewind();
      GL20.glUniform1fv(((ShaderManager)id_class[id_break[5]]).id_class(id_catch[4]), var3);
   }

   private static void id_class(Ml_1 var0, float var1) {
      MT.id_package();
      rrfa_3.id_class();
      RenderSystem.blendFuncSeparate(770, 771, 1, id_byte[6]);
      VC var6 = id_class((VC)id_class[1]);
      id_class[1] = var6;
      ((VC)id_class[1]).id_break((Boolean)QY.id_break[2]);
      ((VC)id_class[1]).id_class(true);
      ((ShaderManager)id_class[id_break[13]]).id_class();
      id_class(1.0F, id_protected[4], var1);
      MT.id_super(id_import.B().id_extends());
      ShaderManager.id_class(var0);
      ((VC)id_class[1]).id_throws();
      ((ShaderManager)id_class[id_break[15]]).id_break();
      id_import.B().id_class(true);
      ((ShaderManager)id_class[id_break[16]]).id_class();
      id_class(id_protected[5], 1.0F, var1);
      MT.id_super(((VC)id_class[1]).id_extends());
      ShaderManager.id_class(var0);
      ((ShaderManager)id_class[id_break[18]]).id_break();
      rrfa_3.id_class();
      MT.id_super(id_byte[9]);
   }

   public static void id_class(Ml_1 var0, Runnable var1, float var2) {
      rrfi_3.id_break();
      var1.run();
      rrfi_3.id_class(1);
      id_class(var0, var2);
      rrfi_3.id_class();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 189336444;
   }

   private static void id_break() {
      id_break = new short[]{0, 0, 0, 0, 256, 0, 770, 771, 1, 1, 1, 2, 1, 0, 1, 0, 0, 1, 0, 2};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new ShaderManager(id_catch[5], false), new VC(1, 1, false, false)};
      id_class = var0;
   }

   private static void id_catch() {
      id_protected = new float[]{1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 1.0F};
   }

   private static void id_case() {
      id_byte = new boolean[]{true, false, false, false, true, true, false, true, true, false, true, false, false, true, true, false, true};
   }

   private static void id_protected() {
      id_throws = new double[]{3.141592653, 1.0, 6.283185306, 2.0};
   }
}
