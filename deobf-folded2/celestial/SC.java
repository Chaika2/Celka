package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class SC {
   private static boolean[] id_class;
   public Object[] id_break;
   private static short[] id_byte;

   public String id_byte() {
      return (String)this.id_break[0];
   }

   public SC(String var1) {
      this.id_class();
      this.id_break[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void id_class() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1184601894;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8742757687240941025L;
   }

   public abstract int id_break();

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-119, 113, -47, 104, 89, 3, -9, 113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_byte = new short[2];
   }

   private static void id_protected() {
      id_class = new boolean[]{true};
   }
}
