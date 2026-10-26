package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIY extends rrIl_1 {
   private static byte[] id_class;
   private static float[] id_break;
   private static boolean[] id_byte;
   private static String[] id_protected;

   private static void id_int() {
      id_protected = new String[]{new String("notification"), new String("notification")};
   }

   public rrIY() {
      super(id_protected[0], id_break[0], id_break[1], id_byte[0], NT.FILE, id_byte[1], id_byte[2], id_class[0]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8680847957927081413L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -112958829;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, -97, -84, -89, 119, 79, 109, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_new() {
      id_break = new float[]{1.0F, 1.0F};
   }

   private static void id_package() {
      id_class = new byte[]{16};
   }

   @Override
   public rqO_2 id_protected() {
      return new rqO_2(this.id_native().id_byte(), "celestial/sounds/notifications/" + this.id_native().id_break() + ".ogg");
   }

   private static void id_final() {
      id_byte = new boolean[]{true, false, false, false};
   }

   @Override
   public NY id_volatile() {
      return new NY(this, id_byte[3], id_protected[1]);
   }
}
