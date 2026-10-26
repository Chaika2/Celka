package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnk_3 {
   public Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public static Object[] id_break;

   private static void id_byte() {
      id_byte = new boolean[]{false, true, true};
   }

   public rrnk_3() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public static rrnk_3 id_class(cM_2 var0) {
      ((rrnk_3)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (rrnk_3)id_break[id_protected[2]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1713691889;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4733079032950355007L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, -60, -42, 64, -107, 91, 64, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public cM_2 id_class() {
      return (cM_2)this.id_class[id_protected[3]];
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrnk_3()};
      id_break = var0;
   }

   private static void id_throws() {
      id_protected = new short[4];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[1]];
         Object[] var1 = this.id_class;
      }
   }
}
