package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class y_1 {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   public Y id_byte() {
      return (Y)this.id_class[1];
   }

   public y_1(rud_3 var1, Y var2, ruS_2<?> var3) {
      this.id_throws();
      this.id_class[id_byte[0]] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1141619428;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2123466536096503113L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-94, 6, 14, -15, -61, -68, -23, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rud_3 id_class() {
      return (rud_3)this.id_class[id_byte[3]];
   }

   public <T extends ruS_2<?>> T id_break() {
      return (T)this.id_class[2];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_break = new byte[]{3};
   }

   private static void id_case() {
      id_byte = new short[]{0, 1, 2, 0, 1, 2, 2};
   }

   public ruS_2<?> id_protected() {
      return (ruS_2<?>)this.id_class[2];
   }
}
