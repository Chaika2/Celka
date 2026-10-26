package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public class rrfi_3 implements MinecraftAccessor {
   private static byte[] id_class;
   private static int[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      id_class = new byte[]{-1, -1};
   }

   static {
      ntfClinit();
   }

   public static void id_class(int var0) {
      GL11.glColorMask(true, true, true, true);
      GL11.glStencilFunc(514, var0, 1);
      GL11.glStencilOp(7680, 7680, 7680);
   }

   public static void id_class() {
      GL11.glDisable(2960);
   }

   private static void id_class(VC var0, int var1, int var2) {
      EXTFramebufferObject.glDeleteRenderbuffersEXT(var0.id_finally());
      int var3 = EXTFramebufferObject.glGenRenderbuffersEXT();
      EXTFramebufferObject.glBindRenderbufferEXT(36161, var3);
      EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, var1, var2);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, var3);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-17, 127, 36, 67, -71, 100, -55, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(VC var0) {
      if (var0 != null && var0.id_finally() > -1) {
         Qg_1 var1 = id_import.id_else();
         int var2 = var1.id_new();
         int var3 = var1.id_continue();
         if (var2 != 0 && var3 != 0) {
            id_class(var0, var2, var3);
            var0.id_break(-1);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6000454781659554756L;
   }

   public static void id_break() {
      VC var0 = id_import.B();
      var0.id_class(id_byte[0]);
      id_class(var0);
      GL11.glClear(1024);
      GL11.glEnable(2960);
      GL11.glStencilFunc(519, 1, 1);
      GL11.glStencilOp(7681, 7681, 7681);
      GL11.glColorMask(id_byte[3], id_byte[4], id_byte[5], id_byte[6]);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 702215244;
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, true, true, false, false, false, false, true, true, true, true, true};
   }

   private static void id_case() {
      id_protected = new short[]{1024, 2960, 519, 7681, 7681, 7681, 514, 7680, 7680, 7680, 2960};
   }

   private static void id_protected() {
      id_break = new int[]{36161, 36161, 34041, 36160, 36128, 36161, 36160, 36096, 36161};
   }
}
