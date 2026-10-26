package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcQ_2 extends rrfI_2<Boolean> {
   private static byte[] id_break;
   private static float[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   private static boolean[] id_throws;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcQ_2(rrcz_3 var1, rrNw_1 var2, rrNd_1 var3) {
      this.id_protected();
      this.id_class[id_protected[0]] = var2;
      this.id_class[id_protected[1]] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -81, -124, 79, -114, -2, -12, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1039155112;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6398868611017966626L;
   }

   public Boolean id_break() {
      this.id_protected();
      rJY var1 = ((rrNw_1)this.id_class[id_protected[2]]).id_throws();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.id_class[id_protected[3]]).id_protected() : var1.id_class();
      if (((rrNd_1)this.id_class[id_protected[4]]).id_throws() && ((rrNd_1)this.id_class[id_protected[5]]).id_return() && var2.id_throws()) {
         int var3 = var2.id_private();
         int var4 = var3 - var2.id_catch();
         int var5 = (int)((float)var4 / (float)var3 * id_byte[0]);
         return var5 >= ((rrNd_1)this.id_class[id_protected[6]]).id_public() ? id_throws[1] : id_throws[2];
      } else {
         return id_throws[0];
      }
   }

   private static void id_throws() {
      id_byte = new float[]{100.0F};
   }

   private static void id_catch() {
      id_throws = new boolean[]{true, true, false};
   }

   private static void id_case() {
      id_protected = new short[]{0, 1, 0, 0, 1, 1, 1};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_private() {
      id_break = new byte[]{2};
   }
}
