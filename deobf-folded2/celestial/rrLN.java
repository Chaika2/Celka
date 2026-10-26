package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLN {
   public Object[] id_class;
   private static boolean[] id_byte;
   public static Object[] id_break;
   private static byte[] id_protected;
   private static short[] id_throws;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   public rrLN() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{47, 110, 73, -48, -97, 49, -62, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrLN id_class(Aw_1 var0, rvY_2 var1) {
      ((rrLN)id_break[0]).id_class[1] = var0;
      ((rrLN)id_break[0]).id_class[0] = var1;
      return (rrLN)id_break[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4871422257966651314L;
   }

   public Aw_1 id_class() {
      return (Aw_1)this.id_class[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1500269682;
   }

   public rvY_2 id_break() {
      return (rvY_2)this.id_class[0];
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_catch() {
      id_protected = new byte[]{2};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrLN()};
      id_break = var0;
   }

   private static void id_protected() {
      id_throws = new short[]{0, 1, 0, 0, 0, 0, 1};
   }
}
