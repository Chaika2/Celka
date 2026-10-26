package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFe_1 {
   public static Object[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_break;

   private static void id_byte() {
      id_byte = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1};
   }

   public rrFe_1() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4524410086231133147L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{39, -34, 112, -69, 36, 117, -83, -103}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(rrNV var0, rrFa_1 var1) {
      rrFe_1 var2 = id_break(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var2);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -775082190;
   }

   public rrNV id_class() {
      return (rrNV)this.id_break[0];
   }

   public rrFa_1 id_break() {
      return (rrFa_1)this.id_break[1];
   }

   private static rrFe_1 id_break(rrNV var0, rrFa_1 var1) {
      ((rrFe_1)id_class[0]).id_break[0] = var0;
      ((rrFe_1)id_class[0]).id_break[1] = var1;
      return (rrFe_1)id_class[0];
   }

   private static void id_throws() {
      id_throws = new boolean[]{false, true};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrFe_1()};
      id_class = var0;
   }

   private static void id_case() {
      id_protected = new byte[]{2};
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }
}
