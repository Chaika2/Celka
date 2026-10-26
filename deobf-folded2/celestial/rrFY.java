package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFY extends Om_1 {
   public Object[] id_class;
   public static Object[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   public rrFY() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7315550379352348987L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 164204858;
   }

   public vm_3 id_class() {
      this.id_break();
      return (vm_3)this.id_class[0];
   }

   public static rrFY id_class(vm_3 var0) {
      rrFY var1 = id_break(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var1);
      return var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -7, 52, -100, -16, 93, -65, 112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static rrFY id_break(vm_3 var0) {
      ((rrFY)id_break[0]).id_class[0] = var0;
      ((rrFY)id_break[0]).id_class(false);
      return (rrFY)id_break[0];
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      id_protected = new short[7];
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrFY()};
      id_break = var0;
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, false, true, true};
   }
}
