package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLj_1 {
   private static boolean[] id_byte;
   public static Object[] id_class;
   private static short[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrLj_1()};
      id_class = var0;
   }

   public rrLj_1() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-41, 83, -86, -12, -104, 101, 24, -85}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrLj_1 id_class(boolean var0, boolean var1) {
      rrLj_1 var10000 = (rrLj_1)id_class[0];
      Boolean var6 = var0;
      var10000.id_break[0] = var6;
      var10000 = (rrLj_1)id_class[0];
      Boolean var7 = var1;
      var10000.id_break[1] = var7;
      return (rrLj_1)id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3048651392433928292L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2019739973;
   }

   public boolean id_class() {
      return (Boolean)this.id_break[1];
   }

   public boolean id_break() {
      return (Boolean)this.id_break[0];
   }

   private static void id_throws() {
      id_protected = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private static void id_catch() {
      id_throws = new byte[]{2};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
         var1[0] = false;
         var1[1] = false;
      }
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, false, false, true, false, true};
   }
}
