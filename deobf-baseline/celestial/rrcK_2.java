package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcK_2 extends rrfI_2<Boolean> {
   public Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcK_2(rrco_3 var1, rrNw_1 var2) {
      this.id_case();
      this.id_class[id_break[0]] = var2;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2045146456;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1302274677736625231L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 73, -74, -103, -61, -93, -88, 55}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Boolean id_break() {
      this.id_case();
      rJY var1 = ((rrNw_1)this.id_class[id_break[1]]).id_throws();
      return (var1 == null ? ((rrNw_1)this.id_class[id_break[2]]).id_protected().id_break() : var1.id_class().id_break()) instanceof rxJ_2 var3
         ? var3.id_catch() instanceof Wp_1
         : id_byte[0];
   }

   private static void id_throws() {
      id_break = new short[3];
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[1]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, true};
   }
}
