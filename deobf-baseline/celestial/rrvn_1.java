package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvn_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;

   private static void id_byte() {
      id_byte = new byte[]{2};
   }

   public rrvn_1(rruz_1 var1, List<rrvC> var2) {
      this.id_protected();
      this.id_class[id_break[0]] = var1;
      this.id_class[id_break[1]] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6467272728067518072L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 499015811;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{107, 117, 94, -44, 73, -82, -17, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public List<rrvC> id_class() {
      return (List<rrvC>)this.id_class[id_break[3]];
   }

   public rruz_1 id_break() {
      return (rruz_1)this.id_class[id_break[2]];
   }

   private static void id_throws() {
      id_break = new short[]{0, 1, 0, 1};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
      }
   }
}
