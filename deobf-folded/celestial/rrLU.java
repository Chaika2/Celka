package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLU {
   public Object[] id_class;
   public static Object[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      id_byte = new boolean[]{false, true, true};
   }

   public rrLU() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, -40, -92, -1, 36, 29, 124, -104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2042235693;
   }

   public static void id_class(vm_3 var0) {
      rrLU var1 = id_break(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[3]]).id_class(var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[4]]).id_finally().id_class(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3681916678409354687L;
   }

   public vm_3 id_class() {
      return (vm_3)this.id_class[id_protected[5]];
   }

   private static rrLU id_break(vm_3 var0) {
      ((rrLU)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (rrLU)id_break[id_protected[2]];
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      id_protected = new short[6];
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrLU()};
      id_break = var0;
   }
}
