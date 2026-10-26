package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAv_1 extends Om_1 {
   private static short[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;
   public Object[] id_break;

   public void id_byte(String var1) {
      this.id_protected();
      this.id_break[id_byte[5]] = var1;
   }

   public rrAv_1() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7776318601605689274L;
   }

   public String id_class() {
      this.id_protected();
      return (String)this.id_break[id_byte[4]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, 63, -70, -33, 81, 18, -50, 9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 985027896;
   }

   private static void id_break() {
      id_byte = new short[6];
   }

   public static rrAv_1 id_break(String var0) {
      ((rrAv_1)id_class[id_byte[0]]).id_break[id_byte[1]] = var0;
      ((rrAv_1)id_class[id_byte[2]]).id_class(id_protected[0]);
      return (rrAv_1)id_class[id_byte[3]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrAv_1()};
      id_class = var0;
   }

   private static void id_case() {
      id_protected = new boolean[]{false, false, true, true};
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[2]];
         Object[] var1 = this.id_break;
      }
   }
}
