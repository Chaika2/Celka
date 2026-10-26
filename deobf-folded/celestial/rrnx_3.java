package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnx_3 {
   private static boolean[] id_byte;
   private static byte[] id_protected;
   public static Object[] id_class;
   private static short[] id_throws;
   public Object[] id_break;

   private static void id_byte() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   public rrnx_3() {
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8605444625588263827L;
   }

   public static rrnx_3 id_class(iB_2 var0, rjG_2 var1) {
      ((rrnx_3)id_class[id_throws[0]]).id_break[id_throws[1]] = var0;
      ((rrnx_3)id_class[id_throws[2]]).id_break[1] = var1;
      return (rrnx_3)id_class[id_throws[4]];
   }

   public rjG_2 id_class() {
      return (rjG_2)this.id_break[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, 39, 6, -13, 15, 123, -80, 38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -699329944;
   }

   public iB_2 id_break() {
      return (iB_2)this.id_break[id_throws[5]];
   }

   private static void id_throws() {
      id_protected = new byte[]{2};
   }

   private void id_catch() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_case() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrnx_3()};
      id_class = var0;
   }
}
