package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ss_3 implements C_for {
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_byte;

   public sS_2 id_byte() {
      return (sS_2)this.id_class[0];
   }

   ss_3(sS_2 var1) {
      this.id_protected();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, 30, 125, 26, -87, -75, 8, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7954874985029894458L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 478173898;
   }

   @Override
   public C_case id_break() {
      return ((F)((sS_2)this.id_class[0]).id_class[0]).id_break();
   }

   private static void id_throws() {
      id_byte = new short[4];
   }

   private static void id_case() {
      id_break = new boolean[]{true};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
