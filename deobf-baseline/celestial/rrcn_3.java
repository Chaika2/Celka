package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcn_3 {
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_break = new short[]{1, 0, 1, 0};
   }

   public rrcn_3(int var1) {
      this.id_case();
      Integer var6 = var1;
      this.id_class[id_break[3]] = var6;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7113842133423058461L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 261485176;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, -94, 78, -61, -49, 101, -76, 81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrcn_3 id_class(Predicate<rJY> var1) {
      this.id_class[id_break[0]] = var1;
      return this;
   }

   public Predicate<rJY> id_class() {
      return (Predicate<rJY>)this.id_class[id_break[2]];
   }

   public int id_break() {
      return (Integer)this.id_class[id_break[1]];
   }

   private static void id_throws() {
      id_protected = new boolean[2];
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
         var1[id_protected[0]] = Integer.valueOf(id_protected[1]);
      }
   }

   private static void id_protected() {
      id_byte = new byte[]{2};
   }
}
