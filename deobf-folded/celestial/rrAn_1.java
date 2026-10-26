package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAn_1 {
   public Object[] id_class;
   private static short[] id_byte;
   public static Object[] id_break;
   private static boolean[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
         var1[id_protected[2]] = id_protected[3];
      }
   }

   public rrAn_1() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{51, 78, -110, -76, -38, 85, 99, 16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class() {
      return (Boolean)this.id_class[id_byte[3]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -190635172;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8504861821528033953L;
   }

   public static rrAn_1 id_class(boolean var0) {
      rrAn_1 var10000 = (rrAn_1)id_break[id_byte[0]];
      Boolean var5 = var0;
      var10000.id_class[id_byte[1]] = var5;
      return (rrAn_1)id_break[id_byte[2]];
   }

   public void id_break(boolean var1) {
      Boolean var6 = var1;
      this.id_class[id_byte[4]] = var6;
   }

   private static void id_break() {
      id_protected = new boolean[]{false, true, false, false, true};
   }

   private static void id_throws() {
      id_byte = new short[5];
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrAn_1()};
      id_break = var0;
   }
}
