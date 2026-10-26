package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrch_3 extends rrfI_2<rrfG_2> {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;

   @Override
   public boolean id_byte() {
      this.id_catch();
      rrfG_2 var1 = this.id_break();
      return var1 == null ? false : var1.equals((rrfG_2)((rrcO_2)this.id_class[1]).id_class[0]);
   }

   public rrch_3(rrcO_2 var1, rrNw_1 var2) {
      this.id_catch();
      this.id_class[1] = var1;
      this.id_class[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -339473956;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-73, 117, -86, -10, -88, 103, -55, 14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2158858257501645399L;
   }

   public rrfG_2 id_break() {
      this.id_catch();
      rJY var1 = ((rrNw_1)this.id_class[0]).id_throws();
      return rrfG_2.id_class(var1 == null ? ((rrNw_1)this.id_class[0]).id_protected() : var1.id_class());
   }

   private static void id_throws() {
      id_protected = new byte[]{2};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_byte = new short[]{1, 0, 0, 0, 1, 0};
   }

   private static void id_protected() {
      id_break = new boolean[1];
   }
}
