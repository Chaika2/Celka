package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sl_1 extends SC {
   public Object[] id_class;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;

   public Sl_1(String var1, int var2) {
      super(var1);
      this.id_case();
      Integer var7 = var2;
      this.id_class[id_throws[0]] = var7;
   }

   public Sl_1(String var1) {
      this(var1, -1);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -547436702;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, 6, 34, 6, -76, -21, -11, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new byte[]{-1};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9124776747113590689L;
   }

   @Override
   public int id_break() {
      this.id_case();
      return (Integer)this.id_class[id_throws[1]];
   }

   private static void id_throws() {
      id_throws = new short[2];
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
         var1[id_protected[1]] = Integer.valueOf(id_protected[2]);
      }
   }

   private static void id_protected() {
      id_protected = new boolean[]{true, false, false};
   }
}
