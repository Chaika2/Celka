package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum ThemeManager {
   private static short[] shortsc3c8b26240a53959b0b3ce0fbbe0f311;
   public Object[] fieldsc3c8b26240a53959b0b3ce0fbbe0f311;
   public static Object[] staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311;
   private static String[] stringsc3c8b26240a53959b0b3ce0fbbe0f311;
   private static boolean[] booleansc3c8b26240a53959b0b3ce0fbbe0f311;
   private static byte[] bytesc3c8b26240a53959b0b3ce0fbbe0f311;

   private static void id_byte() {
      shortsc3c8b26240a53959b0b3ce0fbbe0f311 = new short[]{1, 0, 17, 1, 0, 1, 1, 1, 0, 1, 0};
   }

   private ThemeManager() {
      this.id_implements();
      rrvP[] var7 = rrvP.values();
      this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[0] = var7;
      rrvP var8 = (rrvP)rrvP.staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[17];
      this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[1] = var8;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, 69, -119, 30, -99, -29, 121, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3808594880402332946L;
   }

   public rrvP[] id_class() {
      return (rrvP[])this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -213329021;
   }

   public void id_class(rrvP var1) {
      this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[1] = var1;
   }

   public rrvP id_break() {
      return (rrvP)this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[1];
   }

   public void id_break(String var1) {
      rrvP var6 = Arrays.<rrvP>stream((rrvP[])this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[0])
         .filter(var1x -> var1x.id_byte().equals(var1))
         .findFirst()
         .orElse((rrvP)this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[1]);
      this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[1] = var6;
   }

   private static void id_throws() {
      bytesc3c8b26240a53959b0b3ce0fbbe0f311 = new byte[]{2, 2};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new ThemeManager(), null};
      var0[1] = new ThemeManager[]{(ThemeManager)var0[0]};
      staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311 = var0;
   }

   private void id_implements() {
      if (this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311 == null) {
         this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311 = new Object[2];
         Object[] var1 = this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311;
      }
   }

   private static void id_protected() {
      booleansc3c8b26240a53959b0b3ce0fbbe0f311 = new boolean[]{true, false, false, false, true};
   }

   private static void id_private() {
      stringsc3c8b26240a53959b0b3ce0fbbe0f311 = new String[]{new String("INSTANCE")};
   }
}
