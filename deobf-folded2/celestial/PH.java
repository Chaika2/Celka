package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PH {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -741995032;
   }

   public int id_byte() {
      return this.id_protected() - this.id_class();
   }

   public PH(String var1, int var2) {
      this.id_implements();
      this.id_class[0] = var1;
      Integer var8 = var2;
      this.id_class[1] = var8;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -10, -44, -24, 30, 87, -85, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(int var1) {
      this.id_break(this.id_class() + var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3710832080344191855L;
   }

   public int id_class() {
      return (Integer)this.id_class[2];
   }

   public String id_break() {
      return (String)this.id_class[0];
   }

   public void id_break(int var1) {
      Integer var6 = var1;
      this.id_class[2] = var6;
   }

   public boolean id_throws() {
      return this.id_class() >= this.id_protected() ? true : id_break[1];
   }

   private static void id_catch() {
      id_byte = new short[]{0, 1, 2, 0, 1, 2};
   }

   private static void id_case() {
      id_protected = new byte[]{3, 2};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   public int id_protected() {
      return (Integer)this.id_class[1];
   }

   private static void id_private() {
      id_break = new boolean[]{true, false, true, false, false};
   }
}
