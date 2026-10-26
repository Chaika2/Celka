package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public class rrfi_3 implements MinecraftAccessor {
   private static byte[] class_;
   private static int[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   private static void byte_() {
      class_ = new byte[]{-1, -1};
   }

   static {
      ntfClinit();
   }

   public static void class_(int var0) {
      GL11.glColorMask(true, true, true, true);
      GL11.glStencilFunc(514, var0, 1);
      GL11.glStencilOp(7680, 7680, 7680);
   }

   public static void class_() {
      GL11.glDisable(2960);
   }

   private static void class_(VC var0, int var1, int var2) {
      EXTFramebufferObject.glDeleteRenderbuffersEXT(var0.finally_());
      int var3 = EXTFramebufferObject.glGenRenderbuffersEXT();
      EXTFramebufferObject.glBindRenderbufferEXT(36161, var3);
      EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, var1, var2);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, var3);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, var3);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-17, 127, 36, 67, -71, 100, -55, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(VC var0) {
      if (var0 != null && var0.finally_() > -1) {
         Qg_1 var1 = import_.else_();
         int var2 = var1.new_();
         int var3 = var1.continue_();
         if (var2 != 0 && var3 != 0) {
            class_(var0, var2, var3);
            var0.break_(-1);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6000454781659554756L;
   }

   public static void break_() {
      VC var0 = import_.B();
      var0.class_(false);
      class_(var0);
      GL11.glClear(1024);
      GL11.glEnable(2960);
      GL11.glStencilFunc(519, 1, 1);
      GL11.glStencilOp(7681, 7681, 7681);
      GL11.glColorMask(false, false, false, false);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 702215244;
   }

   private static void throws_() {
      byte_ = new boolean[]{false, true, true, false, false, false, false, true, true, true, true, true};
   }

   private static void case_() {
      protected_ = new short[]{1024, 2960, 519, 7681, 7681, 7681, 514, 7680, 7680, 7680, 2960};
   }

   private static void protected_() {
      break_ = new int[]{36161, 36161, 34041, 36160, 36128, 36161, 36160, 36096, 36161};
   }
}
