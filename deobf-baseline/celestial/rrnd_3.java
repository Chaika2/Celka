package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnd_3 {
   public static Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;

   private static void id_byte() {
      id_throws = new byte[]{2};
   }

   public rrnd_3() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{81, -124, -56, 58, -25, 18, 15, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(rjU_2 var0, int var1) {
      rrnd_3 var2 = id_break(var0, var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[5]]).id_class(var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1698678631;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6592760529786525274L;
   }

   public int id_class() {
      return (Integer)this.id_break[id_byte[7]];
   }

   private static rrnd_3 id_break(rjU_2 var0, int var1) {
      ((rrnd_3)id_class[id_byte[0]]).id_break[id_byte[1]] = var0;
      rrnd_3 var10000 = (rrnd_3)id_class[id_byte[2]];
      Integer var7 = var1;
      var10000.id_break[id_byte[3]] = var7;
      return (rrnd_3)id_class[id_byte[4]];
   }

   public rjU_2 id_break() {
      return (rjU_2)this.id_break[id_byte[6]];
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
         var1[id_protected[1]] = Integer.valueOf(id_protected[2]);
      }
   }

   private static void id_catch() {
      id_protected = new boolean[]{false, true, false, true};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrnd_3()};
      id_class = var0;
   }

   private static void id_protected() {
      id_byte = new short[]{0, 0, 0, 1, 0, 0, 0, 1};
   }
}
