package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLw_1 extends Om_1 {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public static Object[] id_class;
   public Object[] id_break;
   private static byte[] id_throws;

   public rrLw_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1109985070;
   }

   public void id_class(VZ var1) {
      this.id_throws();
      this.id_break[1] = var1;
   }

   public static rrLw_1 id_class(VZ var0, VZ var1) {
      ((rrLw_1)id_class[0]).id_class(false);
      ((rrLw_1)id_class[0]).id_break[0] = var0;
      ((rrLw_1)id_class[0]).id_break[1] = var1;
      return (rrLw_1)id_class[0];
   }

   public VZ id_class() {
      this.id_throws();
      return (VZ)this.id_break[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2000062424826641087L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-31, -120, -98, 86, -120, 86, -2, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public VZ id_break() {
      this.id_throws();
      return (VZ)this.id_break[1];
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_catch() {
      id_protected = new short[]{0, 0, 0, 0, 1, 0, 0, 1, 1};
   }

   private static void id_case() {
      id_byte = new boolean[]{false, false, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrLw_1()};
      id_class = var0;
   }

   private static void id_private() {
      id_throws = new byte[]{2};
   }
}
