package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcs_3 extends rrfI_2<rrfs_3> {
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;

   @Override
   public boolean id_byte() {
      this.id_catch();
      return this.id_break() == (rrfs_3)((rrcS_2)this.id_class[1]).id_class[id_byte[5]] ? true : id_protected[1];
   }

   public rrcs_3(rrcS_2 var1, rrNw_1 var2) {
      this.id_catch();
      this.id_class[1] = var1;
      this.id_class[id_byte[1]] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2326983981678645917L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, -90, 4, -122, -7, 121, -84, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1368275262;
   }

   public rrfs_3 id_break() {
      this.id_catch();
      rJY var1 = ((rrNw_1)this.id_class[id_byte[2]]).id_throws();
      return rrfs_3.id_class(var1 == null ? ((rrNw_1)this.id_class[id_byte[3]]).id_protected() : var1.id_class());
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, false};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_break = new byte[]{2};
   }

   private static void id_protected() {
      id_byte = new short[]{1, 0, 0, 0, 1, 0};
   }
}
