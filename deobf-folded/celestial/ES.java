package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ES extends MM {
   private static short[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;

   public ES(EP var1, xc_3[][][] var2, rja_3 var3) {
      this.id_throws();
      this.id_break[id_protected[0]] = var2;
      this.id_break[1] = var3;
      xc_3[][][] var10 = (xc_3[][][])this.id_break[id_protected[2]];
      this.id_byte[id_protected[3]] = var10;
      Integer var11 = ((rja_3)this.id_break[1]).b_();
      this.id_class[id_protected[5]] = var11;
      Integer var12 = ((rja_3)this.id_break[1]).c_();
      this.id_class[1] = var12;
      Integer var13 = ((rja_3)this.id_break[1]).d_();
      this.id_class[2] = var13;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4368112342949944859L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1455785450;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, -72, 111, -47, 15, 112, -51, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_catch() {
      id_protected = new short[]{0, 1, 0, 0, 1, 0, 1, 1, 1, 2};
   }

   private static void id_case() {
      id_throws = new byte[]{2};
   }
}
