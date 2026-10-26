package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrIV extends rrIl_1 {
   private static byte[] id_class;
   private static float[] id_break;
   private static boolean[] id_byte;

   private static void id_int() {
      id_byte = new boolean[]{true, false, false};
   }

   public rrIV(String var1) {
      super(var1, 1.0F, 1.0F, 1, NT.FILE, id_byte[1], id_byte[2], 16);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4252089174561169274L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, 120, -46, 112, -34, -72, -104, 109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -103996386;
   }

   private static void id_package() {
      id_break = new float[]{1.0F, 1.0F};
   }

   @Override
   public rqO_2 id_protected() {
      return new rqO_2(this.id_native().id_byte(), "celestial/sounds/module/" + this.id_native().id_break() + ".ogg");
   }

   private static void id_final() {
      id_class = new byte[]{16};
   }
}
