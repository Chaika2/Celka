package celestial;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpZ_2 {
   public Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;

   public int id_byte() {
      return (Integer)this.id_class[1];
   }

   public rrpZ_2(UUID var1, int var2) {
      this.id_private();
      this.id_class[id_protected[0]] = var1;
      Integer var8 = var2;
      this.id_class[1] = var8;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{88, -59, -29, -95, 59, 95, -116, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1531831667;
   }

   public void id_class(rrpv_3 var1, int var2) {
      this.id_class[2] = var1;
      Integer var8 = var2;
      this.id_class[3] = var8;
   }

   public UUID id_class() {
      return (UUID)this.id_class[id_protected[4]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7441837909566012135L;
   }

   public rrpv_3 id_break() {
      return (rrpv_3)this.id_class[2];
   }

   private static void id_throws() {
      id_byte = new byte[]{4, 3};
   }

   private static void id_catch() {
      id_break = new boolean[]{true, false, false};
   }

   private static void id_case() {
      id_protected = new short[]{0, 1, 2, 3, 0, 1, 2, 3};
   }

   public int id_protected() {
      return (Integer)this.id_class[3];
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         this.id_class[1] = 0;
         this.id_class[3] = 0;
      }
   }
}
