package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnb_3 extends Om_1 {
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;

   public rrnb_3() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   public ao_3 id_class() {
      this.id_break();
      return (ao_3)this.id_class[id_byte[4]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{34, 73, -23, 20, 40, -47, -126, 19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1560584844;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5164332387383149215L;
   }

   public static rrnb_3 id_class(ao_3 var0) {
      ((rrnb_3)id_break[id_byte[0]]).id_class(id_protected[0]);
      ((rrnb_3)id_break[id_byte[1]]).id_class[id_byte[2]] = var0;
      return (rrnb_3)id_break[id_byte[3]];
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrnb_3()};
      id_break = var0;
   }

   private static void id_case() {
      id_protected = new boolean[]{false, false, true, true};
   }

   private static void id_protected() {
      id_byte = new short[5];
   }
}
