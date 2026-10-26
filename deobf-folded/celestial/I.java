package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class I {
   private static boolean[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static short[] id_protected;

   private static void id_byte() {
      Object[] var0 = new Object[]{new I()};
      id_break = var0;
   }

   public I() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -666575286;
   }

   public Boolean id_class() {
      return (Boolean)this.id_class[id_protected[3]];
   }

   public void id_class(Boolean var1) {
      this.id_class[id_protected[4]] = var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-79, -108, -87, 33, 57, -90, -32, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5340733805870867199L;
   }

   public static I id_break(Boolean var0) {
      ((I)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (I)id_break[id_protected[2]];
   }

   private static void id_break() {
      id_protected = new short[5];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, true, true};
   }
}
