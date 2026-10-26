package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtD_2 {
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;

   public int id_byte() {
      return (Integer)((Supplier)this.id_class[id_break[3]]).get();
   }

   rrtD_2(Supplier<Integer> var1, Supplier<Integer> var2, Supplier<Integer> var3) {
      this.id_case();
      this.id_class[id_break[0]] = var1;
      this.id_class[id_break[1]] = var2;
      this.id_class[id_break[2]] = var3;
   }

   static {
      ntfClinit();
   }

   public int id_class() {
      return (Integer)((Supplier)this.id_class[id_break[4]]).get();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -111461021;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6101253259508718890L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, 98, 110, 102, -59, -62, -81, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_break() {
      return (Integer)((Supplier)this.id_class[id_break[5]]).get();
   }

   private static void id_throws() {
      id_byte = new byte[]{3};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_break = new short[]{0, 1, 2, 0, 1, 2};
   }
}
