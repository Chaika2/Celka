package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EA {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   public rk_3 id_byte() {
      return (rk_3)this.id_class[0];
   }

   public EA() {
      this.id_throws();
      En_1 var5 = new En_1();
      this.id_class[1] = var5;
      HashMap var6 = new HashMap();
      this.id_class[2] = var6;
   }

   static {
      ntfClinit();
   }

   public EA id_class(Pm_1 var1, boolean var2) {
      ((Map)this.id_class[2]).put(var1, var2);
      return this;
   }

   public EA id_class(En_1 var1) {
      this.id_class[1] = var1;
      return this;
   }

   public EA id_class(rk_3 var1) {
      this.id_class[0] = var1;
      return this;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, -13, 26, -50, -101, -86, -64, 53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1012984061;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5548255413247025014L;
   }

   public En_1 id_class() {
      return (En_1)this.id_class[1];
   }

   public Map<Pm_1, Boolean> id_break() {
      return (Map<Pm_1, Boolean>)this.id_class[2];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_break = new byte[]{3};
   }

   private static void id_protected() {
      id_byte = new short[]{1, 2, 0, 0, 1, 1, 2, 2};
   }
}
