package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrck_3 implements rrcT_2<rrfh_3> {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_break = new boolean[]{true};
   }

   public rrck_3(rrfh_3 var1) {
      this.id_protected();
      this.id_class[id_byte[1]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1177372036;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3834815570388926310L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-39, 91, -85, 91, 38, -16, -16, -28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrfh_3 id_class() {
      return (rrfh_3)this.id_class[id_byte[0]];
   }

   @Override
   public rrfI_2<rrfh_3> id_class(rrNd_1 var1, rrNw_1 var2) {
      return new rrcW_2(this, var2);
   }

   private static void id_break() {
      id_byte = new short[2];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }
}
