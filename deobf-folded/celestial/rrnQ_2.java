package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnQ_2 {
   private static short[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;
   public static Object[] id_break;
   private static boolean[] id_throws;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrnQ_2()};
      id_break = var0;
   }

   public rrnQ_2() {
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3602539244008878255L;
   }

   public Sz_1 id_class() {
      return (Sz_1)this.id_class[id_byte[5]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -909213969;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, -58, 37, -86, -27, 38, 80, -12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrnQ_2 id_class(Sz_1 var0, rfl_3 var1) {
      ((rrnQ_2)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      ((rrnQ_2)id_break[id_byte[2]]).id_class[1] = var1;
      return (rrnQ_2)id_break[id_byte[4]];
   }

   public rfl_3 id_break() {
      return (rfl_3)this.id_class[1];
   }

   private static void id_throws() {
      id_throws = new boolean[]{false, true};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_byte = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private static void id_protected() {
      id_protected = new byte[]{2};
   }
}
