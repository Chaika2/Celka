package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFH {
   public static Object[] id_class;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_break;

   private static void id_byte() {
      id_protected = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   public rrFH() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -414954783;
   }

   public static rrFH id_class(String var0, String var1) {
      ((rrFH)id_class[id_protected[0]]).id_break[id_protected[1]] = var0;
      ((rrFH)id_class[id_protected[2]]).id_break[id_protected[3]] = var1;
      return (rrFH)id_class[id_protected[4]];
   }

   public String id_class() {
      return (String)this.id_break[id_protected[5]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -67, -103, 20, 27, -80, 53, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6901453050301836543L;
   }

   public String id_break() {
      return (String)this.id_break[id_protected[6]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrFH()};
      id_class = var0;
   }

   private static void id_catch() {
      id_throws = new boolean[]{false, true};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[0]];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_protected() {
      id_byte = new byte[]{2};
   }
}
