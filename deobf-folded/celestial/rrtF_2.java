package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtF_2 {
   private static boolean[] id_class;
   private static short[] id_break;

   public static void id_byte(Ml_1 var0, rrtm_3 var1, rrZO var2, String var3, float var4, float var5, int var6, int var7) {
      var2.id_break(var0, var3, (double)var4, (double)var5, ColorHelper.id_break(var6, var1.id_class(var7)), id_class[5]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 84833566;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-90, 7, -62, 58, 33, -23, 87, 18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      rrfD_2.id_class(var0, var1, var2, var3, var4, var5, var5, var5, var5, ColorHelper.id_break(var6, var7));
   }

   public static void id_class(Ml_1 var0, rrtm_3 var1, float var2, float var3, float var4, int var5, float var6) {
      rrfD_2.id_class(var0, var2, var3, var4, ColorHelper.id_break(var5, var1.id_class(255)), var6);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6, int var7) {
      rrfD_2.id_class(var0, var1, var2, (float)((int)var3), (float)((int)var4), var5, ColorHelper.id_break(var6, var7));
   }

   public static void id_class(Ml_1 var0, rrZO var1, String var2, float var3, float var4, int var5, int var6, int var7, float var8, float var9) {
      var1.id_class(var0, var2, var3, var4, ColorHelper.id_break(var5, var6), (float)var7, var8, var9);
   }

   public static void id_class(Ml_1 var0, rrZO var1, String var2, float var3, float var4, int var5, int var6, int var7) {
      var1.id_class(var0, var2, var3, var4, ColorHelper.id_break(var5, var6), (float)var7);
   }

   public static void id_class(Ml_1 var0, rrtm_3 var1, rrZO var2, String var3, float var4, float var5, int var6, int var7, boolean var8) {
      var2.id_class(var0, var3, (double)var4, (double)var5, var6, var1.id_class(var7), var8);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      rrfD_2.id_protected(var0, var1, var2, var3, var4, ColorHelper.id_break(var5, var6));
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10) {
      rrfD_2.id_break(
         var0,
         var1,
         var2,
         var3,
         var4,
         var5,
         var5,
         var5,
         var5,
         ColorHelper.id_break(var6, var10),
         ColorHelper.id_break(var7, var10),
         ColorHelper.id_break(var8, var10),
         ColorHelper.id_break(var9, var10)
      );
   }

   public static void id_class(Ml_1 var0, rrtm_3 var1, rrZO var2, String var3, float var4, float var5, int var6, int var7) {
      var2.id_class(var0, var3, (double)var4, (double)var5, ColorHelper.id_break(var6, var1.id_class(var7)), id_class[2], id_class[3]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5247946746700687975L;
   }

   public static void id_class(Ml_1 var0, rrtm_3 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      rrfD_2.id_class(var0, var2, var3, var5, ColorHelper.id_break(var6, var1.id_class(var7)), var4);
   }

   public static void id_class(Ml_1 var0, rrZO var1, String var2, float var3, float var4, int var5, int var6) {
      var1.id_protected(var0, var2, var3, var4, ColorHelper.id_break(var5, var6), id_class[1]);
   }

   private static void id_class() {
      id_break = new short[]{255};
   }

   public static void id_class(Ml_1 var0, rrtm_3 var1, float var2, float var3, float var4, int var5, int var6, float var7) {
      rrfD_2.id_class(var0, (double)var2, (double)var3, var4, ColorHelper.id_break(var5, var1.id_class(var6)), var7);
   }

   public static void id_class(Ml_1 var0, rqO_2 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      rrfD_2.id_class(var0, var1, var2, var3, var4, var5, ColorHelper.id_break(var6, var7));
   }

   private static void id_break() {
      id_class = new boolean[6];
   }

   public static void id_break(Ml_1 var0, rrtm_3 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      rrfD_2.id_protected(var0, var2, var3, var4, var5, ColorHelper.id_break(var6, var1.id_class(var7)));
   }

   public static void id_break(Ml_1 var0, rrtm_3 var1, rrZO var2, String var3, float var4, float var5, int var6, int var7) {
      var2.id_byte(var0, var3, var4, var5, ColorHelper.id_break(var6, var1.id_class(var7)), id_class[4]);
   }

   public static void id_protected(Ml_1 var0, rrtm_3 var1, rrZO var2, String var3, float var4, float var5, int var6, int var7) {
      var2.id_protected(var0, var3, var4, var5, ColorHelper.id_break(var6, var1.id_class(var7)), id_class[0]);
   }
}
