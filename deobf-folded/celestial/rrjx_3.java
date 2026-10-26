package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjx_3 {
   public Object[] id_break;
   private static boolean[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;

   public String[] id_byte() {
      return (String[])this.id_break[id_byte[2]];
   }

   public rrjx_3(String[] var1, int var2) {
      this.id_case();
      this.id_break[id_byte[4]] = var1;
      Integer var8 = var2;
      this.id_break[1] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "Server{names=" + this.id_class() + ", number=" + (Integer)this.id_break[1] + "}";
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1415776998;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3895380000036359602L;
   }

   public String id_class() {
      return ((String[])this.id_break[id_byte[0]])[id_class[0]];
   }

   public int id_break() {
      return (Integer)this.id_break[1];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{32, 96, 54, 117, 98, -56, 92, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_protected = new byte[]{2};
   }

   private static void id_catch() {
      id_class = new boolean[]{false, true, false};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         this.id_break[1] = 0;
      }
   }

   private static void id_protected() {
      id_byte = new short[]{0, 1, 0, 1, 0, 1};
   }
}
