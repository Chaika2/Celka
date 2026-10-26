package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwS_2 implements rrtn_3 {
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;

   public String id_byte() {
      return (String)this.id_class[id_byte[9]];
   }

   public rrwS_2(Setting<?> var1, String var2) {
      this.id_catch();
      rruv_1 var7 = (rruv_1)rruv_1.id_class[id_byte[0]];
      this.id_class[id_byte[1]] = var7;
      this.id_class[id_byte[2]] = var1;
      this.id_class[id_byte[3]] = var2;
   }

   static {
      ntfClinit();
   }

   public void id_class(rruv_1 var1) {
      this.id_class[id_byte[5]] = var1;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 236025536;
   }

   @Override
   public rruv_1 id_class() {
      return (rruv_1)this.id_class[id_byte[4]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-82, 82, -110, -76, -10, 11, 66, -9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7504822640467380365L;
   }

   public boolean id_break() {
      return ((String)this.id_class[id_byte[6]]).equals(((Setting)this.id_class[id_byte[7]]).id_byte());
   }

   private static void id_throws() {
      id_byte = new short[]{0, 2, 0, 1, 2, 2, 1, 0, 0, 1};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_break = new byte[]{3};
   }

   public Setting<?> id_protected() {
      return (Setting<?>)this.id_class[id_byte[8]];
   }
}
