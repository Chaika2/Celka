package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQr_1 extends rrzi_3 {
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_throws;
   private static byte[] id_case;

   private static void id_byte() {
      id_case = new byte[]{31};
   }

   public rrQr_1() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      this.id_protected();
      if (!(var1 instanceof rrzi_3)) {
         return false;
      } else {
         byte[] var2 = (byte[])((rrzi_3)var1).id_protected[0];
         return Arrays.equals((byte[])this.id_protected[0], 0, (Integer)this.id_class[0], var2, 0, var2.length);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -13629788;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4097667861974187502L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, 95, 90, -122, -21, -91, -117, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new boolean[]{true, false, false, false, false, true, false, false};
   }

   public rrQr_1 id_class(byte[] var1, int var2) {
      this.id_break(var1, var2);
      return this;
   }

   private static void id_break() {
      id_throws = new short[]{0, 0, 1, 0, 0, 0};
   }

   public void id_break(byte[] var1, int var2) {
      this.id_protected();
      this.id_protected[0] = var1;
      Integer var10 = var2;
      this.id_class[0] = var10;
      int var3 = 1;

      for (int var4 = 0; var4 < var2; var4++) {
         var3 = 31 * var3 + var1[var4];
      }

      Integer var11 = var3;
      this.id_protected[1] = var11;
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
         var1[0] = 0;
      }
   }
}
