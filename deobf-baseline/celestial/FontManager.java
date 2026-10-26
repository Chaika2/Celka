package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum FontManager implements MinecraftAccessor {
   private static boolean[] booleans71d6c26f697c30cf88e2ba2ddc0b4971;
   public Object[] fields71d6c26f697c30cf88e2ba2ddc0b4971;
   public static Object[] staticFields71d6c26f697c30cf88e2ba2ddc0b4971;
   private static byte[] bytes71d6c26f697c30cf88e2ba2ddc0b4971;
   private static String[] strings71d6c26f697c30cf88e2ba2ddc0b4971;
   private static float[] floats71d6c26f697c30cf88e2ba2ddc0b4971;
   private static short[] shorts71d6c26f697c30cf88e2ba2ddc0b4971;

   public rrZO id_byte() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[29]];
   }

   private static void id_int() {
      shorts71d6c26f697c30cf88e2ba2ddc0b4971 = new short[]{
         1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 248, 249, 250, 9889, 9733, 4, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0
      };
   }

   private FontManager() {
      this.id_else();
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      strings71d6c26f697c30cf88e2ba2ddc0b4971 = new String[]{new String("montserrat"), new String("pixel"), new String("INSTANCE")};
   }

   private static rrZO id_class(rrZx_1 var0, String var1, float var2, boolean var3) {
      return new rrZO(rrZb_1.id_class(var1, var2), var0, booleans71d6c26f697c30cf88e2ba2ddc0b4971[12], booleans71d6c26f697c30cf88e2ba2ddc0b4971[13], var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, -101, 51, 106, 51, 41, 113, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1040983954;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7956305343625363861L;
   }

   public static rrZO id_class(String var0, float var1, boolean var2) {
      rrZx_1 var10000 = new rrZx_1();
      int[] var10001 = new int[bytes71d6c26f697c30cf88e2ba2ddc0b4971[0]];
      var10001[booleans71d6c26f697c30cf88e2ba2ddc0b4971[14]] = shorts71d6c26f697c30cf88e2ba2ddc0b4971[13];
      var10001[booleans71d6c26f697c30cf88e2ba2ddc0b4971[15]] = shorts71d6c26f697c30cf88e2ba2ddc0b4971[14];
      var10001[bytes71d6c26f697c30cf88e2ba2ddc0b4971[1]] = shorts71d6c26f697c30cf88e2ba2ddc0b4971[15];
      var10001[bytes71d6c26f697c30cf88e2ba2ddc0b4971[2]] = shorts71d6c26f697c30cf88e2ba2ddc0b4971[16];
      var10001[bytes71d6c26f697c30cf88e2ba2ddc0b4971[3]] = shorts71d6c26f697c30cf88e2ba2ddc0b4971[17];
      var10000 = var10000.id_class(var10001);
      rrZx_1[] var4 = new rrZx_1[booleans71d6c26f697c30cf88e2ba2ddc0b4971[16]];
      var4[booleans71d6c26f697c30cf88e2ba2ddc0b4971[17]] = (rrZx_1)rrZx_1.id_break[shorts71d6c26f697c30cf88e2ba2ddc0b4971[18]];
      return id_class(var10000.id_class(var4), var0, var1, var2);
   }

   public rrZO id_class() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[22]];
   }

   public rrZO id_break() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[30]];
   }

   public rrZO id_throws() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[24]];
   }

   public rrZO id_finally() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[23]];
   }

   public rrZO id_catch() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[26]];
   }

   public rrZO id_extends() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[25]];
   }

   public rrZO id_case() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[27]];
   }

   private void id_else() {
      if (this.fields71d6c26f697c30cf88e2ba2ddc0b4971 == null) {
         this.fields71d6c26f697c30cf88e2ba2ddc0b4971 = new Object[bytes71d6c26f697c30cf88e2ba2ddc0b4971[4]];
         Object[] var1 = this.fields71d6c26f697c30cf88e2ba2ddc0b4971;
      }
   }

   public rrZO id_implements() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[19]];
   }

   private static void id_new() {
      floats71d6c26f697c30cf88e2ba2ddc0b4971 = new float[]{10.0F, 11.0F, 12.0F, 13.0F, 14.0F, 15.0F, 16.0F, 17.0F, 18.0F, 20.0F, 21.0F, 16.0F};
   }

   private static void id_package() {
      bytes71d6c26f697c30cf88e2ba2ddc0b4971 = new byte[]{5, 2, 3, 4, 12, 2};
   }

   private static void id_super() {
      Object[] var0 = new Object[]{new FontManager(), null};
      var0[1] = new FontManager[]{(FontManager)var0[0]};
      staticFields71d6c26f697c30cf88e2ba2ddc0b4971 = var0;
   }

   public rrZO id_protected() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[28]];
   }

   public rrZO id_private() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[20]];
   }

   private static void id_final() {
      booleans71d6c26f697c30cf88e2ba2ddc0b4971 = new boolean[]{
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true
      };
   }

   public void id_volatile() {
      String var1 = strings71d6c26f697c30cf88e2ba2ddc0b4971[0];
      String var2 = strings71d6c26f697c30cf88e2ba2ddc0b4971[1];
      rrZO var7 = id_class(var1, floats71d6c26f697c30cf88e2ba2ddc0b4971[0], booleans71d6c26f697c30cf88e2ba2ddc0b4971[0]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[1]] = var7;
      rrZO var8 = id_class(var1, floats71d6c26f697c30cf88e2ba2ddc0b4971[1], booleans71d6c26f697c30cf88e2ba2ddc0b4971[1]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[2]] = var8;
      rrZO var9 = id_class(var1, floats71d6c26f697c30cf88e2ba2ddc0b4971[2], booleans71d6c26f697c30cf88e2ba2ddc0b4971[2]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[3]] = var9;
      rrZO var10 = id_class(var1, floats71d6c26f697c30cf88e2ba2ddc0b4971[3], booleans71d6c26f697c30cf88e2ba2ddc0b4971[3]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[4]] = var10;
      rrZO var11 = id_class(var1, floats71d6c26f697c30cf88e2ba2ddc0b4971[4], booleans71d6c26f697c30cf88e2ba2ddc0b4971[4]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[5]] = var11;
      rrZO var12 = id_class(var1, floats71d6c26f697c30cf88e2ba2ddc0b4971[5], booleans71d6c26f697c30cf88e2ba2ddc0b4971[5]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[6]] = var12;
      rrZO var13 = id_class(var1, floats71d6c26f697c30cf88e2ba2ddc0b4971[6], booleans71d6c26f697c30cf88e2ba2ddc0b4971[6]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[7]] = var13;
      rrZO var14 = id_class(var1, floats71d6c26f697c30cf88e2ba2ddc0b4971[7], booleans71d6c26f697c30cf88e2ba2ddc0b4971[7]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[8]] = var14;
      rrZO var15 = id_class(var1, floats71d6c26f697c30cf88e2ba2ddc0b4971[8], booleans71d6c26f697c30cf88e2ba2ddc0b4971[8]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[9]] = var15;
      rrZO var16 = id_class(var1, floats71d6c26f697c30cf88e2ba2ddc0b4971[9], booleans71d6c26f697c30cf88e2ba2ddc0b4971[9]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[10]] = var16;
      rrZO var17 = id_class(var1, floats71d6c26f697c30cf88e2ba2ddc0b4971[10], booleans71d6c26f697c30cf88e2ba2ddc0b4971[10]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[11]] = var17;
      rrZO var18 = id_class(var2, floats71d6c26f697c30cf88e2ba2ddc0b4971[11], booleans71d6c26f697c30cf88e2ba2ddc0b4971[11]);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[12]] = var18;
   }

   public rrZO id_native() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[shorts71d6c26f697c30cf88e2ba2ddc0b4971[21]];
   }
}
