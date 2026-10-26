package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLc_1 extends Om_1 {
   public static Object[] id_class;
   public Object[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   public rrLc_1() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2111377237534551303L;
   }

   public rrTi_1 id_class() {
      this.id_case();
      return (rrTi_1)this.id_break[id_protected[6]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, 85, -35, -30, -53, 107, -8, 109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1918012988;
   }

   public static rrLc_1 id_class(rrTi_1 var0) {
      ((rrLc_1)id_class[id_protected[0]]).id_break[id_protected[1]] = var0;
      ((rrLc_1)id_class[id_protected[2]]).id_class(id_byte[0]);
      return (rrLc_1)id_class[id_protected[3]];
   }

   private static void id_break() {
      id_protected = new short[7];
   }

   public static rrLc_1 id_break(rrTi_1 var0) {
      rrLc_1 var1 = id_class(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[4]]).id_finally().id_class(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[5]]).id_class(var1);
      return var1;
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLc_1()};
      id_class = var0;
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[2]];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, false, true, true};
   }
}
