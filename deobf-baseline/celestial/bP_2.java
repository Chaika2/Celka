package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bP_2 extends bM_2 {
   private static boolean[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;

   public bP_2(br_3 var1, C_class var2) {
      super(var2);
      this.id_implements();
      this.id_class[id_protected[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4642546139004465218L;
   }

   @Override
   public void id_class(bb_3 var1, rVi_1 var2) {
      this.id_implements();
      super.id_class(var1, var2);
      ((br_3)this.id_class[id_protected[1]]).id_protected();
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[2]]).id_private().id_static().id_class(var2);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -31, -36, 44, -107, 69, 2, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 601285070;
   }

   private static void id_finally() {
      id_byte = new boolean[]{true};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_private() {
      id_protected = new short[3];
   }
}
