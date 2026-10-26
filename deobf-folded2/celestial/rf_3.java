package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rf_3 extends rI_2 {
   private static byte[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_byte;
   private static short[] id_case;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, -27, 14, -94, 124, -69, -92, -3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rf_3(rq_3 var1, ra_3 var2) {
      super(var1);
      this.id_case();
      this.id_byte[0] = var2;
      Boolean[][][] var8 = new Boolean[this.id_break()][this.id_class()][this.id_byte()];
      this.id_byte[1] = var8;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -67774625;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1915885113435930557L;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3, xc_3 var4) {
      this.id_case();
      if (((Boolean[][][])this.id_byte[1])[var1][var2][var3] == null) {
         ((Boolean[][][])this.id_byte[1])[var1][var2][var3] = ((ra_3)this.id_byte[0]).id_class(var4);
      }

      return ((Boolean[][][])this.id_byte[1])[var1][var2][var3];
   }

   private static void id_throws() {
      id_case = new short[]{0, 1, 1, 1, 1, 1, 1, 1, 0, 1};
   }

   private static void id_catch() {
      id_protected = new byte[]{2};
   }

   private void id_case() {
      if (this.id_byte == null) {
         this.id_byte = new Object[2];
         Object[] var1 = this.id_byte;
      }
   }

   @Override
   public void id_protected() {
      this.id_case();

      for (int var1 = 0; var1 < ((Boolean[][][])this.id_byte[1]).length; var1++) {
         for (int var2 = 0; var2 < ((Boolean[][][])this.id_byte[1])[0].length; var2++) {
            for (int var3 = 0; var3 < ((Boolean[][][])this.id_byte[1])[0][0].length; var3++) {
               ((Boolean[][][])this.id_byte[1])[var1][var2][var3] = null;
            }
         }
      }
   }

   private static void id_private() {
      id_throws = new boolean[6];
   }
}
