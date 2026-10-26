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
   private static short[] break_;
   private static boolean[] byte_;
   private static float[] protected_;
   public static Object[] class_;
   private static double[] throws_;
   private static byte[] case_;
   private static String[] catch_;

   private static void byte_() {
      catch_ = new String[]{
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

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 358090614473018996L;
   }

   public static VC class_(VC var0) {
      if (var0 != null && var0.byte_ == const_.extends_() && var0.protected_ == const_.native_()) {
         return var0;
      } else {
         if (var0 != null) {
            var0.class_();
         }

         return new VC(const_.extends_(), const_.native_(), true, (Boolean)QY.break_[2]);
      }
   }

   public static float class_(float var0, float var1) {
      double var2 = 3.141592653;
      double var4 = 1.0 / Math.sqrt(6.283185306 * (double)(var1 * var1));
      return (float)(var4 * Math.exp((double)(-(var0 * var0)) / (2.0 * (double)(var1 * var1))));
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, 116, -33, 51, -71, 89, 33, 3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      case_ = new byte[]{2, 2};
   }

   public static void class_(float var0, float var1, float var2) {
      ((ShaderManager)class_[0]).class_("textureIn", 0);
      ((ShaderManager)class_[0]).break_("texelSize", 1.0F / (float)const_.new_(), 1.0F / (float)const_.continue_());
      ((ShaderManager)class_[0]).break_("direction", var0, var1);
      ((ShaderManager)class_[0]).break_("radius", var2);
      FloatBuffer var3 = BufferUtils.createFloatBuffer(256);

      for (int var4 = 0; (float)var4 <= var2; var4++) {
         var3.put(class_((float)var4, var2 / 2.0F));
      }

      var3.rewind();
      GL20.glUniform1fv(((ShaderManager)class_[0]).class_("weights"), var3);
   }

   private static void class_(Ml_1 var0, float var1) {
      MT.package_();
      rrfa_3.class_();
      RenderSystem.blendFuncSeparate(770, 771, 1, 0);
      VC var6 = class_((VC)class_[1]);
      class_[1] = var6;
      ((VC)class_[1]).break_((Boolean)QY.break_[2]);
      ((VC)class_[1]).class_(true);
      ((ShaderManager)class_[0]).class_();
      class_(1.0F, 0.0F, var1);
      MT.super_(import_.B().extends_());
      ShaderManager.class_(var0);
      ((VC)class_[1]).throws_();
      ((ShaderManager)class_[0]).break_();
      import_.B().class_(true);
      ((ShaderManager)class_[0]).class_();
      class_(0.0F, 1.0F, var1);
      MT.super_(((VC)class_[1]).extends_());
      ShaderManager.class_(var0);
      ((ShaderManager)class_[0]).break_();
      rrfa_3.class_();
      MT.super_(0);
   }

   public static void class_(Ml_1 var0, Runnable var1, float var2) {
      rrfi_3.break_();
      var1.run();
      rrfi_3.class_(1);
      class_(var0, var2);
      rrfi_3.class_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 189336444;
   }

   private static void break_() {
      break_ = new short[]{0, 0, 0, 0, 256, 0, 770, 771, 1, 1, 1, 2, 1, 0, 1, 0, 0, 1, 0, 2};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new ShaderManager("celestial/shaders/gaussian.frag", false), new VC(1, 1, false, false)};
      class_ = var0;
   }

   private static void catch_() {
      protected_ = new float[]{1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 1.0F};
   }

   private static void case_() {
      byte_ = new boolean[]{true, false, false, false, true, true, false, true, true, false, true, false, false, true, true, false, true};
   }

   private static void protected_() {
      throws_ = new double[]{3.141592653, 1.0, 6.283185306, 2.0};
   }
}
