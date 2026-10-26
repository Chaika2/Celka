package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bL_2 extends rU_2 {
   private static short[] id_catch;

   public bL_2 id_byte(rpr_3 var1) {
      return new bL_2(
         (Integer)this.id_break[id_catch[0]] + var1.id_implements(),
         (Integer)this.id_break[1] + var1.id_finally(),
         (Integer)this.id_break[2] + var1.id_extends()
      );
   }

   public bL_2(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public bL_2 id_class(rja_3 var1) {
      return new bL_2((Integer)this.id_break[id_catch[6]] + var1.b_(), (Integer)this.id_break[1] + var1.c_(), (Integer)this.id_break[2] + var1.d_());
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{69, 35, 61, 89, 99, -104, -9, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_case(long var0) {
      return Long.rotateLeft(var0, 32) ^ -555794058631369404L;
   }

   private static void id_continue() {
      id_catch = new short[]{0, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   private static int id_package(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 145150951;
   }

   public bL_2 id_protected(int var1, int var2, int var3) {
      return new bL_2((Integer)this.id_break[id_catch[3]] + var1, (Integer)this.id_break[1] + var2, (Integer)this.id_break[2] + var3);
   }
}
