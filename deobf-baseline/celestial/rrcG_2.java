package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcG_2 extends rrfI_2<Boolean> {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcG_2(rrcE_2 var1, rrNw_1 var2, rrNd_1 var3) {
      this.id_case();
      this.id_class[id_byte[0]] = var2;
      this.id_class[id_byte[1]] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, 7, 60, 97, 29, -96, 85, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 35121837;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2713101434082908270L;
   }

   public Boolean id_break() {
      this.id_case();
      rJY var1 = ((rrNw_1)this.id_class[id_byte[2]]).id_throws();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.id_class[id_byte[3]]).id_protected() : var1.id_class();
      return var2.id_char() >= ((rrNd_1)this.id_class[id_byte[4]]).id_native() ? id_break[0] : id_break[1];
   }

   private static void id_throws() {
      id_protected = new byte[]{2};
   }

   private static void id_catch() {
      id_byte = new short[]{0, 1, 0, 0, 1};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false};
   }
}
