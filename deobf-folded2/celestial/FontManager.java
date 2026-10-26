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
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[10];
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
      return new rrZO(rrZb_1.id_class(var1, var2), var0, true, false, var3);
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
      return id_class(new rrZx_1().id_class(248, 249, 250, 9889, 9733).id_class((rrZx_1)rrZx_1.id_break[4]), var0, var1, var2);
   }

   public rrZO id_class() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[3];
   }

   public rrZO id_break() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[11];
   }

   public rrZO id_throws() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[5];
   }

   public rrZO id_finally() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[4];
   }

   public rrZO id_catch() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[7];
   }

   public rrZO id_extends() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[6];
   }

   public rrZO id_case() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[8];
   }

   private void id_else() {
      if (this.fields71d6c26f697c30cf88e2ba2ddc0b4971 == null) {
         this.fields71d6c26f697c30cf88e2ba2ddc0b4971 = new Object[12];
         Object[] var1 = this.fields71d6c26f697c30cf88e2ba2ddc0b4971;
      }
   }

   public rrZO id_implements() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[0];
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
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[9];
   }

   public rrZO id_private() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[1];
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
      String var1 = "montserrat";
      String var2 = "pixel";
      rrZO var7 = id_class(var1, 10.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[0] = var7;
      rrZO var8 = id_class(var1, 11.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[1] = var8;
      rrZO var9 = id_class(var1, 12.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[2] = var9;
      rrZO var10 = id_class(var1, 13.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[3] = var10;
      rrZO var11 = id_class(var1, 14.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[4] = var11;
      rrZO var12 = id_class(var1, 15.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[5] = var12;
      rrZO var13 = id_class(var1, 16.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[6] = var13;
      rrZO var14 = id_class(var1, 17.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[7] = var14;
      rrZO var15 = id_class(var1, 18.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[8] = var15;
      rrZO var16 = id_class(var1, 20.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[9] = var16;
      rrZO var17 = id_class(var1, 21.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[10] = var17;
      rrZO var18 = id_class(var2, 16.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[11] = var18;
   }

   public rrZO id_native() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[2];
   }
}
