package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFV {
   private static short[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static byte[] id_protected;
   private static boolean[] id_throws;

   public rrqP_2 id_byte() {
      return (rrqP_2)this.id_class[id_byte[7]];
   }

   public rrFV() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   public static rrFV id_class(rrqP_2 var0, rrqS_2 var1, rrqS_2 var2) {
      ((rrFV)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      ((rrFV)id_break[id_byte[2]]).id_class[id_byte[3]] = var1;
      ((rrFV)id_break[id_byte[4]]).id_class[id_byte[5]] = var2;
      return (rrFV)id_break[id_byte[6]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -76, 43, -5, -66, -106, -62, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrqS_2 id_class() {
      return (rrqS_2)this.id_class[id_byte[9]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8799065564282182548L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 939691046;
   }

   public rrqS_2 id_break() {
      return (rrqS_2)this.id_class[id_byte[8]];
   }

   private static void id_throws() {
      id_protected = new byte[]{3};
   }

   private static void id_catch() {
      id_throws = new boolean[]{false, true};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrFV()};
      id_break = var0;
   }

   private static void id_protected() {
      id_byte = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
      }
   }
}
