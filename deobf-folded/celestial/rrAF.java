package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAF {
   public static Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_break;

   private void id_byte() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
         var1[id_byte[2]] = id_byte[3];
      }
   }

   public rrAF() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 599268648;
   }

   public boolean id_class() {
      return (Boolean)this.id_break[id_protected[3]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5212190196675896342L;
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_break[id_protected[4]] = var6;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-119, 93, -29, 105, 81, 95, -25, 99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAF id_break(boolean var0) {
      rrAF var10000 = (rrAF)id_class[id_protected[0]];
      Boolean var5 = var0;
      var10000.id_break[id_protected[1]] = var5;
      return (rrAF)id_class[id_protected[2]];
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrAF()};
      id_class = var0;
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, true, false, false, true};
   }

   private static void id_protected() {
      id_protected = new short[5];
   }
}
