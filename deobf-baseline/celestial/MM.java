package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MM extends rl_3 implements rw_3 {
   public Object[] id_byte;
   private static short[] id_break;
   private static boolean[] id_protected;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, -105, -64, 66, -93, 117, 29, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public MM() {
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2140340269;
   }

   @Override
   public xc_3 id_class(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      this.id_catch();
      return ((xc_3[][][])this.id_byte[id_break[0]])[var1][var3][var2];
   }

   @Override
   public xc_3 id_class(int var1, int var2, int var3) {
      this.id_catch();
      return ((xc_3[][][])this.id_byte[id_break[1]])[var1][var3][var2];
   }

   @Override
   public xc_3[] id_class(int var1, int var2) {
      this.id_catch();
      return ((xc_3[][][])this.id_byte[id_break[2]])[var1][var2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5667185515423505910L;
   }

   private static void id_throws() {
      id_protected = new boolean[]{true};
   }

   private void id_catch() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_protected[0]];
         Object[] var1 = this.id_byte;
      }
   }

   private static void id_case() {
      id_break = new short[3];
   }
}
