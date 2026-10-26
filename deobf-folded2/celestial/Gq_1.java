package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gq_1 implements Gt_1 {
   private static int[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      id_byte = new short[]{1, 1, 0, 0, 0, 0, 2, 1, 0};
   }

   Gq_1(GH var1) {
      this.id_protected();
      this.id_class[1] = var1;
      C_super var7 = GH.id_class((GH)this.id_class[1]).id_strictfp().id_byte().id_break();
      this.id_class[0] = var7;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6148643338742963247L;
   }

   @Override
   public int id_class() {
      return Integer.MAX_VALUE;
   }

   @Override
   public GI id_class(int var1, int var2) {
      int var3 = var1 << 4;
      int var4 = var2 << 4;
      if (((C_super)this.id_class[0]).id_break(var3, var4)) {
         return (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[0];
      } else if (!((SI)((C_super)this.id_class[0])).id_byte(var3, var4)) {
         C_class.id_interface().execute(() -> ((SI)((C_super)this.id_class[0])).id_protected(var3 >> 9, var4 >> 9));
         return (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[2];
      } else {
         return (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[1];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, -78, -120, -122, 110, -33, 61, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 438987694;
   }

   private static void id_break() {
      id_break = new int[]{Integer.MAX_VALUE};
   }

   private static void id_throws() {
      id_protected = new byte[]{4, 4, 9, 9, 2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }
}
