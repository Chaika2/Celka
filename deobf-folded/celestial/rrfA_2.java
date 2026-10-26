package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfA_2 {
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_break = new short[]{0, 1, 0, 1};
   }

   private rrfA_2(ev_3 var1, int var2) {
      this.id_throws();
      this.id_class[id_break[0]] = var1;
      Integer var8 = var2;
      this.id_class[1] = var8;
   }

   static {
      ntfClinit();
   }

   public static rrfA_2 id_class(ev_3 var0, int var1) {
      return new rrfA_2(var0, var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 358833922;
   }

   public int id_class() {
      return (Integer)this.id_class[1];
   }

   public static rrfA_2 id_class(ev_3 var0) {
      return id_class(var0, var0.id_throws());
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, -96, 55, 13, 55, -59, -55, -15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4657530844620310831L;
   }

   public ev_3 id_break() {
      return (ev_3)this.id_class[id_break[2]];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[1] = 0;
      }
   }

   private static void id_case() {
      id_protected = new boolean[]{true, false};
   }

   private static void id_protected() {
      id_byte = new byte[]{2};
   }
}
