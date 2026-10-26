package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class R implements o_1 {
   public Object[] id_break;
   private static short[] id_class;
   private static boolean[] id_byte;

   @Override
   public boolean id_byte() {
      return (Boolean)this.id_break[id_class[1]];
   }

   public R() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6282458975139689922L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 801668446;
   }

   private static void id_class() {
      id_class = new short[2];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, -93, 66, 105, -4, 69, -92, 90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break() {
      Boolean var5 = true;
      this.id_break[id_class[0]] = var5;
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
         var1[id_byte[2]] = id_byte[3];
      }
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, true, false, false};
   }
}
