package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnN_2 {
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   public static Object[] id_class;
   public Object[] id_break;

   private void id_byte() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
      }
   }

   public rrnN_2() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1643049322043215562L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, 29, 38, 5, -74, -41, 34, -81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1868095707;
   }

   public static rrnN_2 id_class(SZ var0, rfl_3 var1) {
      ((rrnN_2)id_class[id_byte[0]]).id_break[id_byte[1]] = var0;
      ((rrnN_2)id_class[id_byte[2]]).id_break[id_byte[3]] = var1;
      return (rrnN_2)id_class[id_byte[4]];
   }

   public SZ id_class() {
      return (SZ)this.id_break[id_byte[5]];
   }

   public rfl_3 id_break() {
      return (rfl_3)this.id_break[id_byte[6]];
   }

   private static void id_throws() {
      id_throws = new byte[]{2};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrnN_2()};
      id_class = var0;
   }

   private static void id_case() {
      id_protected = new boolean[]{false, true};
   }

   private static void id_protected() {
      id_byte = new short[]{0, 0, 0, 1, 0, 0, 1};
   }
}
