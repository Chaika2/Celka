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
      GL11.glColorMask(id_byte[7], id_byte[8], id_byte[9], id_byte[10]);
      GL11.glStencilFunc(id_protected[6], var0, id_byte[11]);
      GL11.glStencilOp(id_protected[7], id_protected[8], id_protected[9]);
   }

   public static void id_class() {
      GL11.glDisable(id_protected[10]);
   }

   private static void id_class(VC var0, int var1, int var2) {
      EXTFramebufferObject.glDeleteRenderbuffersEXT(var0.id_finally());
      int var3 = EXTFramebufferObject.glGenRenderbuffersEXT();
      EXTFramebufferObject.glBindRenderbufferEXT(id_break[0], var3);
      EXTFramebufferObject.glRenderbufferStorageEXT(id_break[1], id_break[2], var1, var2);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(id_break[3], id_break[4], id_break[5], var3);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(id_break[6], id_break[7], id_break[8], var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-17, 127, 36, 67, -71, 100, -55, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(VC var0) {
      if (var0 != null && var0.id_finally() > id_class[0]) {
         Qg_1 var1 = id_import.id_else();
         int var2 = var1.id_new();
         int var3 = var1.id_continue();
         if (var2 != 0 && var3 != 0) {
            id_class(var0, var2, var3);
            var0.id_break(id_class[1]);
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
      GL11.glClear(id_protected[0]);
      GL11.glEnable(id_protected[1]);
      GL11.glStencilFunc(id_protected[2], id_byte[1], id_byte[2]);
      GL11.glStencilOp(id_protected[3], id_protected[4], id_protected[5]);
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
