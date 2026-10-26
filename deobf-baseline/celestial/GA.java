package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GA {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
         var1[id_byte[0]] = Integer.valueOf(id_byte[1]);
      }
   }

   public GA(int var1, rfH_2 var2, rpr_3 var3, PX var4) {
      this.id_byte();
      Integer var9 = var1;
      this.id_class[id_break[0]] = var9;
      this.id_class[id_break[1]] = var2;
      this.id_class[id_break[2]] = var3;
      this.id_class[id_break[3]] = var4;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6520998950048108130L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1970599151;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{21, -17, -53, -97, -75, 113, 122, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_protected = new byte[]{4};
   }

   private static void id_break() {
      id_break = new short[]{0, 1, 2, 3};
   }

   private static void id_protected() {
      id_byte = new boolean[2];
   }
}
