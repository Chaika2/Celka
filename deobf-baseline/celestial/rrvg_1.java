package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvg_1 {
   private static boolean[] id_class;
   private static short[] id_break;
   private static float[] id_byte;

   private static void id_byte() {
      id_byte = new float[]{225.0F, 0.0F, 90.0F, 270.0F, 180.0F, 2.0F, 1.0F, 2.0F, 255.0F};
   }

   static {
      ntfClinit();
   }

   private static void id_class(rrtN_2 var0, Ml_1 var1, float var2, float var3) {
      float var4 = var0.id_long();
      int var5 = (int)(id_byte[0] * var4);
      int var6 = ColorHelper.id_class(id_byte[1], var5);
      int var7 = ColorHelper.id_class(id_byte[2], var5);
      int var8 = ColorHelper.id_class(id_byte[3], var5);
      int var9 = ColorHelper.id_class(id_byte[4], var5);
      float var10 = var0.id_implements();
      float var11 = var0.ao_();
      rrfD_2.id_class(var1, var2, var3, var10, var11, var5, var6, var7, var8, var9, id_class[0]);
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[0]])
         .id_protected()
         .id_byte(
            var1,
            var0.id_byte(),
            var2 + var10 / id_byte[5] + id_byte[6],
            var3 + id_byte[7],
            ColorHelper.id_break(rrZF.d_, (int)(id_byte[8] * var4)),
            id_class[1]
         );
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -514924292;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5052710784145900207L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{74, 54, -25, 90, -89, -96, -15, 30}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(rrtN_2 var0, Ml_1 var1, Runnable var2) {
      id_class(var0, var1, var0.id_default(), var0.id_abstract());
      var2.run();
   }

   private static void id_class() {
      id_break = new short[1];
   }

   private static void id_break() {
      id_class = new boolean[]{true, false};
   }
}
