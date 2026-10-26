package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class d_1 extends J {
   public Object[] id_class;
   private static byte[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_throws = new boolean[]{false, true, true, true};
   }

   public d_1(C_import var1, String var2) {
      super(id_class(var1, var2));
      this.id_class();
      this.id_class[id_protected[0]] = var1;
   }

   public d_1(C_import var1, String var2, Throwable var3) {
      super(id_class(var1, var2), var3);
      this.id_class();
      this.id_class[id_protected[1]] = var1;
   }

   static {
      ntfClinit();
   }

   private static String id_class(C_import var0, String var1) {
      String var10000 = id_byte[0];
      Object[] var10001 = new Object[id_break[0]];
      var10001[id_throws[0]] = var0.id_class() == id_break[1] ? id_byte[1] : Integer.toString(var0.id_class() + id_throws[1]);
      var10001[id_throws[2]] = var1;
      return String.format(var10000, var10001);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -63878381;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7486242441194048241L;
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[3]];
         Object[] var1 = this.id_class;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 92, 81, 57, -108, -50, -111, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new String[]{new String("Ошибка при аргументе #%s: %s"), new String("<unknown>")};
   }

   private static void id_throws() {
      id_protected = new short[2];
   }

   private static void id_protected() {
      id_break = new byte[]{2, -1};
   }
}
