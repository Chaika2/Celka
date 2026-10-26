package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAZ {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;

   private static void id_byte() {
      id_protected = new short[6];
   }

   public rrAZ() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -653186117;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7662644103358356692L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-83, -92, 22, -113, -42, -102, 53, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public vm_3 id_class() {
      return (vm_3)this.id_class[id_protected[5]];
   }

   public static void id_class(vm_3 var0) {
      rrAZ var1 = id_break(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[3]]).id_finally().id_class(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[4]]).id_class(var1);
   }

   public static rrAZ id_break(vm_3 var0) {
      ((rrAZ)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (rrAZ)id_break[id_protected[2]];
   }

   private static void id_break() {
      id_byte = new boolean[]{false, true, true};
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrAZ()};
      id_break = var0;
   }
}
