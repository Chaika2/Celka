package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLo_1 {
   public static Object[] id_class;
   public Object[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;

   private static void id_byte() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 0, 1};
   }

   public rrLo_1() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -152963854642222419L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1513698364;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{2, 79, -60, 101, -18, -45, -33, -53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rLY id_class() {
      return (rLY)this.id_break[1];
   }

   public static void id_class(iB_2 var0, rLY var1) {
      rrLo_1 var2 = id_break(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[5]]).id_finally().id_class(var2);
   }

   public iB_2 id_break() {
      return (iB_2)this.id_break[id_throws[6]];
   }

   public static rrLo_1 id_break(iB_2 var0, rLY var1) {
      ((rrLo_1)id_class[id_throws[0]]).id_break[id_throws[1]] = var0;
      ((rrLo_1)id_class[id_throws[2]]).id_break[1] = var1;
      return (rrLo_1)id_class[id_throws[4]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLo_1()};
      id_class = var0;
   }

   private static void id_catch() {
      id_byte = new byte[]{2};
   }

   private static void id_case() {
      id_protected = new boolean[]{false, true};
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }
}
