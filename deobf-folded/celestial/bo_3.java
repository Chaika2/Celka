package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bo_3 implements D {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new boolean[]{true};
   }

   public bo_3(bY_2 var1) {
      this.id_class();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 820737075;
   }

   @Override
   public void id_class(j_1 var1) {
      if (var1.id_class() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_byte[1]]) {
         ((bY_2)this.id_class[id_byte[2]]).id_volatile();
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, 10, -52, -113, 54, -43, 115, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5143892211699326403L;
   }

   private static void id_break() {
      id_byte = new short[3];
   }
}
