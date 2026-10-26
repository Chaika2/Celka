package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum p_1 {
   public static Object[] staticFields210b45dc4af9338b80bcf1ca23dea17d;
   private static boolean[] booleans210b45dc4af9338b80bcf1ca23dea17d;
   private static String[] strings210b45dc4af9338b80bcf1ca23dea17d;
   private static short[] shorts210b45dc4af9338b80bcf1ca23dea17d;
   private static byte[] bytes210b45dc4af9338b80bcf1ca23dea17d;

   private static void id_byte() {
      bytes210b45dc4af9338b80bcf1ca23dea17d = new byte[]{
         12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13
      };
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, 46, 60, 40, 91, 55, 61, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1751380605;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5113137425524187979L;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{
         new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), null
      };
      var0[12] = new p_1[]{
         (p_1)var0[0],
         (p_1)var0[1],
         (p_1)var0[2],
         (p_1)var0[3],
         (p_1)var0[4],
         (p_1)var0[5],
         (p_1)var0[6],
         (p_1)var0[7],
         (p_1)var0[8],
         (p_1)var0[9],
         (p_1)var0[10],
         (p_1)var0[11]
      };
      staticFields210b45dc4af9338b80bcf1ca23dea17d = var0;
   }

   private static void id_break() {
      strings210b45dc4af9338b80bcf1ca23dea17d = new String[]{
         new String("CALC_STARTED"),
         new String("CALC_FINISHED_NOW_EXECUTING"),
         new String("CALC_FAILED"),
         new String("NEXT_SEGMENT_CALC_STARTED"),
         new String("NEXT_SEGMENT_CALC_FINISHED"),
         new String("CONTINUING_ONTO_PLANNED_NEXT"),
         new String("SPLICING_ONTO_NEXT_EARLY"),
         new String("AT_GOAL"),
         new String("PATH_FINISHED_NEXT_STILL_CALCULATING"),
         new String("NEXT_CALC_FAILED"),
         new String("DISCARD_NEXT"),
         new String("CANCELED")
      };
   }

   private static void id_case() {
      booleans210b45dc4af9338b80bcf1ca23dea17d = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_protected() {
      shorts210b45dc4af9338b80bcf1ca23dea17d = new short[]{12, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
   }
}
