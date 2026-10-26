package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFg_1 {
   public Object[] id_class;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_break;
   private static short[] id_throws;

   private static void id_byte() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   public rrFg_1() {
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   public Lu_1 id_class() {
      return (Lu_1)this.id_class[id_throws[5]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, -126, 125, 47, -91, -56, -104, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7252474042059367466L;
   }

   public static rrFg_1 id_class(Lu_1 var0, String var1) {
      ((rrFg_1)id_break[id_throws[0]]).id_class[id_throws[1]] = var0;
      ((rrFg_1)id_break[id_throws[2]]).id_class[id_throws[3]] = var1;
      return (rrFg_1)id_break[id_throws[4]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 370867406;
   }

   public String id_break() {
      return (String)this.id_class[id_throws[6]];
   }

   private static void id_throws() {
      id_byte = new byte[]{2};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrFg_1()};
      id_break = var0;
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, true};
   }
}
