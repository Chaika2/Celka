package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcy_3 {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_protected = new byte[]{2};
   }

   public rrcy_3(int var1) {
      this.id_case();
      Integer var6 = var1;
      this.id_class[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7627204733082405828L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{10, -65, 69, -26, -66, -29, -56, -127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_class() {
      return (Integer)this.id_class[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1827277212;
   }

   public rrcy_3 id_class(Predicate<rJY> var1) {
      this.id_class[1] = var1;
      return this;
   }

   public Predicate<rJY> id_break() {
      return (Predicate<rJY>)this.id_class[1];
   }

   private static void id_throws() {
      id_byte = new boolean[2];
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[0] = 0;
      }
   }

   private static void id_protected() {
      id_break = new short[]{1, 0, 1, 0};
   }
}
