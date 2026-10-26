package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCp_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   public rrCp_1() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   public rfl_3 id_class() {
      return (rfl_3)this.id_class[id_break[0]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2292470231693026289L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1742568107;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, -41, 25, -57, 78, 47, 22, -42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rfl_3 var1) {
      this.id_class[id_break[1]] = var1;
   }

   private static void id_break() {
      id_byte = new boolean[]{true};
   }

   private static void id_protected() {
      id_break = new short[2];
   }
}
