package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrIp_1 extends rrIl_1 {
   private static float[] id_class;
   private static boolean[] id_break;
   private static String[] id_byte;
   private static byte[] id_protected;

   private static void id_int() {
      id_byte = new String[]{new String("hitsound")};
   }

   public rrIp_1(String var1) {
      super(var1, 1.0F, 1.0F, 1, NT.FILE, id_break[1], id_break[2], 16);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1062640643;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5987554055632379146L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, -95, -4, 27, -97, 68, -52, 42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_new() {
      id_protected = new byte[]{16};
   }

   private static void id_package() {
      id_break = new boolean[]{true, false, false, false};
   }

   @Override
   public rqO_2 id_protected() {
      return new rqO_2(this.id_native().id_byte(), "celestial/sounds/hitsounds/" + this.id_native().id_break() + ".ogg");
   }

   private static void id_final() {
      id_class = new float[]{1.0F, 1.0F};
   }

   @Override
   public NY id_volatile() {
      return new NY(this, id_break[3], id_byte[0]);
   }
}
