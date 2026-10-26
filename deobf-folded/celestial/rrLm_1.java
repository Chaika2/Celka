package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLm_1 extends Om_1 {
   public static Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_break;

   public rrLm_1() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   public static rrLm_1 id_class(rrTi_1 var0) {
      rrLm_1 var1 = id_break(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[4]]).id_finally().id_class(var1);
      return var1;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1866096165;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -14, 87, 17, 122, 46, 10, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -290293535589922348L;
   }

   public rrTi_1 id_class() {
      this.id_break();
      return (rrTi_1)this.id_break[id_byte[5]];
   }

   private void id_break() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   public static rrLm_1 id_break(rrTi_1 var0) {
      ((rrLm_1)id_class[id_byte[0]]).id_break[id_byte[1]] = var0;
      ((rrLm_1)id_class[id_byte[2]]).id_class(id_protected[0]);
      return (rrLm_1)id_class[id_byte[3]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLm_1()};
      id_class = var0;
   }

   private static void id_case() {
      id_byte = new short[6];
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, false, true, true};
   }
}
