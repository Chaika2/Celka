package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcS_2 implements rrcT_2<rrfs_3> {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   public rrcS_2(rrfs_3 var1) {
      this.id_byte();
      this.id_class[id_byte[1]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1181179542;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3141396676239308699L;
   }

   public rrfs_3 id_class() {
      return (rrfs_3)this.id_class[id_byte[0]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{121, -121, -64, 32, 124, 55, -61, -59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rrfI_2<rrfs_3> id_class(rrNd_1 var1, rrNw_1 var2) {
      return new rrcs_3(this, var2);
   }

   private static void id_break() {
      id_break = new boolean[]{true};
   }

   private static void id_protected() {
      id_byte = new short[2];
   }
}
