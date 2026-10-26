package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class rrAr_1 extends rrLi_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_break = new short[2];
   }

   public rrAr_1(int var1) {
      this.id_throws();
      Integer var6 = var1;
      this.id_class[id_break[0]] = var6;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5073438374642668958L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1124900813;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, -75, 48, 125, 80, 82, -28, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_break() {
      this.id_throws();
      return (Integer)this.id_class[id_break[1]];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
         var1[id_byte[1]] = Integer.valueOf(id_byte[2]);
      }
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, false, false};
   }
}
