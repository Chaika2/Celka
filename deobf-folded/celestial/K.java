package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class K<T> {
   private static String[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = id_byte[4];
      }
   }

   public K(T var1) {
      this.id_byte();
      this.id_class[id_throws[0]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      String var10000 = id_break[0];
      Object[] var10001 = new Object[2];
      var10001[id_byte[1]] = (Boolean)this.id_class[1];
      var10001[1] = this.id_class[id_throws[6]].toString();
      return String.format(var10000, var10001);
   }

   public boolean id_class() {
      return (Boolean)this.id_class[1];
   }

   public void id_class(T var1) {
      this.id_class[id_throws[2]] = var1;
      Boolean var7 = true;
      this.id_class[1] = var7;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1142315506;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2924487239077934270L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, 48, -22, 0, 14, -120, 98, 102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public T id_break() {
      return (T)this.id_class[id_throws[1]];
   }

   private static void id_throws() {
      id_throws = new short[]{0, 0, 0, 1, 1, 1, 0};
   }

   private static void id_catch() {
      id_break = new String[]{new String("Overrideable{modified=%b,value=%s}")};
   }

   private static void id_case() {
      id_protected = new byte[]{2, 2};
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, false, true, true, false};
   }
}
