package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLR extends Om_1 {
   public Object[] id_class;
   private static boolean[] id_byte;
   public static Object[] id_break;
   private static short[] id_protected;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2122044064;
   }

   public rrLR() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8906123811809368203L;
   }

   public void id_class(int var1) {
      this.id_protected();
      Integer var6 = var1;
      this.id_class[id_protected[5]] = var6;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, 14, 124, -56, -97, -59, 17, -9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_class() {
      this.id_protected();
      return (Integer)this.id_class[id_protected[4]];
   }

   public static rrLR id_break(int var0) {
      rrLR var10000 = (rrLR)id_break[id_protected[0]];
      Integer var5 = var0;
      var10000.id_class[id_protected[1]] = var5;
      ((rrLR)id_break[id_protected[2]]).id_class(id_byte[0]);
      return (rrLR)id_break[id_protected[3]];
   }

   private static void id_break() {
      id_byte = new boolean[]{false, false, true, false, false, true};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLR()};
      id_break = var0;
   }

   private static void id_case() {
      id_protected = new short[6];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[2]];
         Object[] var1 = this.id_class;
         var1[id_byte[3]] = Integer.valueOf(id_byte[4]);
      }
   }
}
