package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLb_1 extends Om_1 {
   public static Object[] id_class;
   private static short[] id_byte;
   public Object[] id_break;
   private static boolean[] id_protected;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, -49, -12, -12, 43, 60, -6, 13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrLb_1() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3371091469669464821L;
   }

   public String id_class() {
      this.id_break();
      return (String)this.id_break[id_byte[3]];
   }

   public static rrLb_1 id_class(String var0) {
      ((rrLb_1)id_class[id_byte[0]]).id_break[id_byte[1]] = var0;
      return (rrLb_1)id_class[id_byte[2]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1305737962;
   }

   public void id_break(String var1) {
      this.id_break();
      this.id_break[id_byte[4]] = var1;
   }

   private void id_break() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLb_1()};
      id_class = var0;
   }

   private static void id_case() {
      id_protected = new boolean[]{false, true, true};
   }

   private static void id_protected() {
      id_byte = new short[5];
   }
}
