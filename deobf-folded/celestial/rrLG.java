package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLG {
   public Object[] id_class;
   private static boolean[] id_byte;
   public static Object[] id_break;
   private static short[] id_protected;

   private static void id_byte() {
      id_protected = new short[4];
   }

   public rrLG() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   public static rrLG id_class(SC var0) {
      ((rrLG)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (rrLG)id_break[id_protected[2]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-106, -30, -62, 66, 77, -57, -103, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public SC id_class() {
      return (SC)this.id_class[id_protected[3]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6348743293599382816L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 743676164;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLG()};
      id_break = var0;
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, true, true};
   }
}
