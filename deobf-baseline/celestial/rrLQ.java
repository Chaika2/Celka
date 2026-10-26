package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLQ {
   public Object[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;
   public static Object[] id_break;
   private static boolean[] id_throws;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
      }
   }

   public rrLQ() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6619769712308966826L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, -100, -64, 70, -96, 126, 7, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1391667272;
   }

   public static rrLQ id_class(an_3 var0, List<rmG_2<?>> var1) {
      ((rrLQ)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      ((rrLQ)id_break[id_byte[2]]).id_class[id_byte[3]] = var1;
      return (rrLQ)id_break[id_byte[4]];
   }

   public an_3 id_class() {
      return (an_3)this.id_class[id_byte[5]];
   }

   public List<rmG_2<?>> id_break() {
      return (List<rmG_2<?>>)this.id_class[id_byte[6]];
   }

   private static void id_throws() {
      id_protected = new byte[]{2};
   }

   private static void id_catch() {
      id_throws = new boolean[]{false, true};
   }

   private static void id_case() {
      id_byte = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrLQ()};
      id_break = var0;
   }
}
