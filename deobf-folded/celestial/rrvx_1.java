package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrvx_1 {
   private static float[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new float[]{0.55F, 1.0F};
   }

   public rrvx_1() {
      this.id_break();
      AnimValue var5 = new AnimValue(0.55F, true);
      this.id_class[id_protected[0]] = var5;
   }

   static {
      ntfClinit();
   }

   public void id_class(Runnable var1, Ml_1 var2, float var3, float var4, float var5, float var6) {
      rrvJ.id_class(var2, var3, var4, (int)var5, (int)var6);
      var1.run();
      rrvJ.id_final();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2141109568;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1218084674821103428L;
   }

   public void id_class(
      Ml_1 var1, rrZl_1 var2, rrtu_3 var3, float var4, float var5, int var6, int var7, float var8, float var9, float var10, int var11, boolean var12
   ) {
      AnimValue var13 = var2.id_package();
      float var14 = ((AnimValue)this.id_class[id_protected[1]]).id_byte();
      if (!var2.id_int() && var14 < 1.0F) {
         boolean var15 = var10 > var9 ? true : id_byte[2];
         if (var15) {
            var13.id_class();
         } else {
            var13.id_extends();
         }
      }

      int var16 = var2.id_int() ? (int)((float)var11 * var14) : (int)((float)var11 * var13.id_byte() * var14);
      var2.id_class(var1, var3, var4, var5, var6, var7, var8, var10, var9, var12, (float)var16);
   }

   public AnimValue id_class() {
      return (AnimValue)this.id_class[id_protected[2]];
   }

   public Pair<Float, Boolean> id_class(rrZl_1 var1) {
      AnimValue var2 = var1.id_package();
      return Pair.of(var2.id_byte(), var2.id_case());
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{27, 27, -21, 73, 76, 24, -78, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      id_byte = new boolean[]{true, true, false, true};
   }

   private static void id_protected() {
      id_protected = new short[3];
   }
}
