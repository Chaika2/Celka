package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvk_1 {
   private static float[] id_break;
   public static Object[] id_class;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_throws = new boolean[]{false, false, true, false};
   }

   static {
      ntfClinit();
   }

   public static float id_class() {
      vm_3 var1 = (vm_3)MinecraftAccessor.id_import.id_class[73];
      return var1 instanceof rrZv_1 var0 ? var0.id_package().id_byte() : 1.0F;
   }

   public static void id_class(Ml_1 var0, Runnable var1, float var2) {
      if (ClickGuiTheme.id_throws()) {
         BlurShader.id_class(var0, var1, var2);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7802045383651904679L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 261342526;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, -72, 83, 71, 11, -59, 80, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new short[]{73};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{0, 0};
      id_class = var0;
   }

   private static void id_case() {
      id_break = new float[]{1.0F};
   }

   private static void id_protected() {
      id_byte = new byte[]{2};
   }
}
