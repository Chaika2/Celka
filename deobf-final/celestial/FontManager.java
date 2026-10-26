package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum FontManager implements MinecraftAccessor {
   ;
   private static boolean[] booleans71d6c26f697c30cf88e2ba2ddc0b4971;
   public Object[] fields71d6c26f697c30cf88e2ba2ddc0b4971;
   public static Object[] staticFields71d6c26f697c30cf88e2ba2ddc0b4971;
   private static byte[] bytes71d6c26f697c30cf88e2ba2ddc0b4971;
   private static String[] strings71d6c26f697c30cf88e2ba2ddc0b4971;
   private static float[] floats71d6c26f697c30cf88e2ba2ddc0b4971;
   private static short[] shorts71d6c26f697c30cf88e2ba2ddc0b4971;

   public rrZO byte_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[10];
   }

   private static void int_() {
      shorts71d6c26f697c30cf88e2ba2ddc0b4971 = new short[]{
         1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 248, 249, 250, 9889, 9733, 4, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0
      };
   }

   private FontManager() {
      this.else_();
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      strings71d6c26f697c30cf88e2ba2ddc0b4971 = new String[]{new String("montserrat"), new String("pixel"), new String("INSTANCE")};
   }

   private static rrZO class_(rrZx_1 var0, String var1, float var2, boolean var3) {
      return new rrZO(rrZb_1.class_(var1, var2), var0, true, false, var3);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, -101, 51, 106, 51, 41, 113, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1040983954;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7956305343625363861L;
   }

   public static rrZO class_(String var0, float var1, boolean var2) {
      return class_(new rrZx_1().class_(248, 249, 250, 9889, 9733).class_((rrZx_1)rrZx_1.break_[4]), var0, var1, var2);
   }

   public rrZO class_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[3];
   }

   public rrZO break_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[11];
   }

   public rrZO throws_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[5];
   }

   public rrZO finally_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[4];
   }

   public rrZO catch_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[7];
   }

   public rrZO extends_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[6];
   }

   public rrZO case_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[8];
   }

   private void else_() {
      if (this.fields71d6c26f697c30cf88e2ba2ddc0b4971 == null) {
         this.fields71d6c26f697c30cf88e2ba2ddc0b4971 = new Object[12];
         Object[] var1 = this.fields71d6c26f697c30cf88e2ba2ddc0b4971;
      }
   }

   public rrZO implements_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[0];
   }

   private static void new_() {
      floats71d6c26f697c30cf88e2ba2ddc0b4971 = new float[]{10.0F, 11.0F, 12.0F, 13.0F, 14.0F, 15.0F, 16.0F, 17.0F, 18.0F, 20.0F, 21.0F, 16.0F};
   }

   private static void package_() {
      bytes71d6c26f697c30cf88e2ba2ddc0b4971 = new byte[]{5, 2, 3, 4, 12, 2};
   }

   private static void super_() {
      Object[] var0 = new Object[]{new FontManager(), null};
      var0[1] = new FontManager[]{(FontManager)var0[0]};
      staticFields71d6c26f697c30cf88e2ba2ddc0b4971 = var0;
   }

   public rrZO protected_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[9];
   }

   public rrZO private_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[1];
   }

   private static void final_() {
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

   public void volatile_() {
      String var1 = "montserrat";
      String var2 = "pixel";
      rrZO var7 = class_(var1, 10.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[0] = var7;
      rrZO var8 = class_(var1, 11.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[1] = var8;
      rrZO var9 = class_(var1, 12.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[2] = var9;
      rrZO var10 = class_(var1, 13.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[3] = var10;
      rrZO var11 = class_(var1, 14.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[4] = var11;
      rrZO var12 = class_(var1, 15.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[5] = var12;
      rrZO var13 = class_(var1, 16.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[6] = var13;
      rrZO var14 = class_(var1, 17.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[7] = var14;
      rrZO var15 = class_(var1, 18.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[8] = var15;
      rrZO var16 = class_(var1, 20.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[9] = var16;
      rrZO var17 = class_(var1, 21.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[10] = var17;
      rrZO var18 = class_(var2, 16.0F, false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[11] = var18;
   }

   public rrZO native_() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[2];
   }
}
