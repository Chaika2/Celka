package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PM {
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   public PM(PO var1, a_1 var2) {
      this.id_byte();
      Objects.requireNonNull(var1);
      this.id_class[id_byte[0]] = var2;
      this.id_class[1] = var1;
   }

   public PM(PO var1) {
      this(var1, null);
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, -78, -8, -50, 31, 127, 98, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5325629904514335996L;
   }

   public Optional<a_1> id_class() {
      return Optional.ofNullable((a_1)this.id_class[id_byte[2]]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1512224130;
   }

   public PO id_break() {
      return (PO)this.id_class[1];
   }

   private static void id_throws() {
      id_break = new byte[]{2};
   }

   private static void id_protected() {
      id_byte = new short[]{0, 1, 0, 1};
   }
}
