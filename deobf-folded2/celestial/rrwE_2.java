package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrwE_2 {
   private static byte[] bytes6648a4467c4f300f966c59969d37f426;
   public Object[] fields6648a4467c4f300f966c59969d37f426;
   private static short[] shorts6648a4467c4f300f966c59969d37f426;
   private static float[] floats6648a4467c4f300f966c59969d37f426;
   private static String[] strings6648a4467c4f300f966c59969d37f426;
   public static Object[] staticFields6648a4467c4f300f966c59969d37f426;
   private static boolean[] booleans6648a4467c4f300f966c59969d37f426;

   private void id_byte() {
      if (this.fields6648a4467c4f300f966c59969d37f426 == null) {
         this.fields6648a4467c4f300f966c59969d37f426 = new Object[2];
         Object[] var1 = this.fields6648a4467c4f300f966c59969d37f426;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
      }
   }

   private rrwE_2(float var3, float var4) {
      this.id_byte();
      Float var9 = var3;
      this.fields6648a4467c4f300f966c59969d37f426[0] = var9;
      Float var10 = var4;
      this.fields6648a4467c4f300f966c59969d37f426[1] = var10;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 821534189;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, 8, -10, -65, 4, -21, -53, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3721089162285173993L;
   }

   public float id_class(float var1, float var2) {
      return (var1 - var2) * (Float)this.fields6648a4467c4f300f966c59969d37f426[0];
   }

   public static rrwE_2 id_class(float var0, float var1, float var2, float var3) {
      byte var4 = var0 < var2 / 3.0F ? 0 : (var0 < var2 * 2.0F / 3.0F ? 1 : bytes6648a4467c4f300f966c59969d37f426[0]);
      byte var5 = var1 < var3 / 3.0F ? 0 : (var1 < var3 * 2.0F / 3.0F ? 1 : bytes6648a4467c4f300f966c59969d37f426[1]);
      return values()[var5 * 3 + var4];
   }

   public float id_class() {
      return (Float)this.fields6648a4467c4f300f966c59969d37f426[0];
   }

   public float id_break() {
      return (Float)this.fields6648a4467c4f300f966c59969d37f426[1];
   }

   public float id_break(float var1, float var2) {
      return (var1 - var2) * (Float)this.fields6648a4467c4f300f966c59969d37f426[1];
   }

   private static void id_finally() {
      shorts6648a4467c4f300f966c59969d37f426 = new short[]{9, 0, 1, 0, 1, 0, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{
         new rrwE_2(0.0F, 0.0F),
         new rrwE_2(0.0F, 0.0F),
         new rrwE_2(0.0F, 0.0F),
         new rrwE_2(0.0F, 0.0F),
         new rrwE_2(0.0F, 0.0F),
         new rrwE_2(0.0F, 0.0F),
         new rrwE_2(0.0F, 0.0F),
         new rrwE_2(0.0F, 0.0F),
         new rrwE_2(0.0F, 0.0F),
         null
      };
      var0[9] = new rrwE_2[]{
         (rrwE_2)var0[0],
         (rrwE_2)var0[1],
         (rrwE_2)var0[2],
         (rrwE_2)var0[3],
         (rrwE_2)var0[4],
         (rrwE_2)var0[5],
         (rrwE_2)var0[6],
         (rrwE_2)var0[7],
         (rrwE_2)var0[8]
      };
      staticFields6648a4467c4f300f966c59969d37f426 = var0;
   }

   private static void id_case() {
      booleans6648a4467c4f300f966c59969d37f426 = new boolean[]{false, true, false, true, false, true, false, false, true, true, false, true};
   }

   private static void id_implements() {
      bytes6648a4467c4f300f966c59969d37f426 = new byte[]{2, 2, 3, 9, 2, 3, 4, 5, 6, 7, 8, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 2, 10};
   }

   private static void id_protected() {
      strings6648a4467c4f300f966c59969d37f426 = new String[]{
         new String("TOP_LEFT"),
         new String("TOP_CENTER"),
         new String("TOP_RIGHT"),
         new String("MIDDLE_LEFT"),
         new String("CENTER"),
         new String("MIDDLE_RIGHT"),
         new String("BOTTOM_LEFT"),
         new String("BOTTOM_CENTER"),
         new String("BOTTOM_RIGHT")
      };
   }

   private static void id_private() {
      floats6648a4467c4f300f966c59969d37f426 = new float[]{
         3.0F,
         2.0F,
         3.0F,
         3.0F,
         2.0F,
         3.0F,
         0.0F,
         0.0F,
         0.5F,
         0.0F,
         1.0F,
         0.0F,
         0.0F,
         0.5F,
         0.5F,
         0.5F,
         1.0F,
         0.5F,
         0.0F,
         1.0F,
         0.5F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F
      };
   }
}
