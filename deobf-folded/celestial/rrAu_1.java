package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAu_1 extends Om_1 {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1928450499;
   }

   public rrAu_1() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-15, 127, 5, 54, -33, 82, -85, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_class() {
      this.id_break();
      return (Integer)this.id_class[id_protected[4]];
   }

   public void id_class(int var1) {
      this.id_break();
      Integer var6 = var1;
      this.id_class[id_protected[5]] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8995391191126555108L;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
         var1[id_byte[3]] = Integer.valueOf(id_byte[4]);
      }
   }

   public static rrAu_1 id_break(int var0) {
      rrAu_1 var10000 = (rrAu_1)id_break[id_protected[0]];
      Integer var5 = var0;
      var10000.id_class[id_protected[1]] = var5;
      ((rrAu_1)id_break[id_protected[2]]).id_class(id_byte[0]);
      return (rrAu_1)id_break[id_protected[3]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrAu_1()};
      id_break = var0;
   }

   private static void id_case() {
      id_protected = new short[6];
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, false, true, false, false, true};
   }
}
