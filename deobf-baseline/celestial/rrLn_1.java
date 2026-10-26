package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLn_1 extends Om_1 {
   private static short[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   public static Object[] id_break;

   public rrLn_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3092080240723336261L;
   }

   public rvs_3 id_class() {
      this.id_throws();
      return (rvs_3)this.id_class[id_byte[4]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1668870798;
   }

   public static rrLn_1 id_class(rvs_3 var0) {
      ((rrLn_1)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      ((rrLn_1)id_break[id_byte[2]]).id_class(id_protected[0]);
      return (rrLn_1)id_break[id_byte[3]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, 52, -7, -2, 102, -79, 39, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new short[5];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[2]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_protected = new boolean[]{false, false, true, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrLn_1()};
      id_break = var0;
   }
}
