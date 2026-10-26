package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class q_1 {
   private static short[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;

   private static void id_byte() {
      id_byte = new boolean[]{true};
   }

   public q_1(Y var1) {
      this.id_protected();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2037747312431737292L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{120, 89, -10, 123, 55, 84, -82, -45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1305930874;
   }

   public Y id_class() {
      return (Y)this.id_class[0];
   }

   public static void id_class(Y var0) {
      q_1 var1 = new q_1(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1);
      if (var0 == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrIK)rrIK.staticFields1247f214054b3fe790ff7a957ceb5ae0[0]).id_class();
      }
   }

   public void id_break(Y var1) {
      this.id_class[0] = var1;
   }

   private static void id_break() {
      id_break = new short[7];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
