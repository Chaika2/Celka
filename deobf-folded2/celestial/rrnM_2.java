package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnM_2 extends Om_1 {
   private static short[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;
   public Object[] id_break;

   public rrnM_2() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   public cG_2 id_class() {
      this.id_case();
      return (cG_2)this.id_break[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -432262413978621072L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2095134601;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{98, 32, -43, 51, 82, 127, -116, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrnM_2 id_class(cG_2 var0) {
      ((rrnM_2)id_class[0]).id_class(false);
      ((rrnM_2)id_class[0]).id_break[0] = var0;
      return (rrnM_2)id_class[0];
   }

   public static void id_break(cG_2 var0) {
      rrnM_2 var1 = id_class(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var1);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrnM_2()};
      id_class = var0;
   }

   private static void id_throws() {
      id_protected = new boolean[]{false, false, true, true};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_protected() {
      id_byte = new short[7];
   }
}
