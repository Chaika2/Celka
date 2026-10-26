package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrcB_2 {
   ;
   private static short[] shorts98d16a36ad1c33518cd334d8bca22c4a;
   private static byte[] bytes98d16a36ad1c33518cd334d8bca22c4a;
   public Object[] fields98d16a36ad1c33518cd334d8bca22c4a;
   public static Object[] staticFields98d16a36ad1c33518cd334d8bca22c4a;
   private static boolean[] booleans98d16a36ad1c33518cd334d8bca22c4a;
   private static String[] strings98d16a36ad1c33518cd334d8bca22c4a;

   public String byte_() {
      return (String)this.fields98d16a36ad1c33518cd334d8bca22c4a[1];
   }

   private rrcB_2(int var3, String var4) {
      this.implements_();
      Integer var9 = var3;
      this.fields98d16a36ad1c33518cd334d8bca22c4a[0] = var9;
      this.fields98d16a36ad1c33518cd334d8bca22c4a[1] = var4;
   }

   static {
      ntfClinit();
   }

   public static rrcB_2 class_(int var0) {
      return ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[2])[var0 % ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[2]).length];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 85, 76, -117, -95, 105, 87, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rgP_2 class_() {
      return new rgn_3("autobuy.refreshType." + (String)this.fields98d16a36ad1c33518cd334d8bca22c4a[1]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3764451569422565169L;
   }

   public int break_() {
      return (Integer)this.fields98d16a36ad1c33518cd334d8bca22c4a[0];
   }

   public static rrcB_2 break_(String var0) {
      for (rrcB_2 var4 : values()) {
         if (((String)var4.fields98d16a36ad1c33518cd334d8bca22c4a[1]).equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -901161331;
   }

   private static void throws_() {
      shorts98d16a36ad1c33518cd334d8bca22c4a = new short[]{3, 0, 1, 0, 2, 2, 1, 1, 1, 2, 0, 2, 0, 1};
   }

   private static void catch_() {
      bytes98d16a36ad1c33518cd334d8bca22c4a = new byte[]{2, 3, 2, 2, 4};
   }

   private static void extends_() {
      booleans98d16a36ad1c33518cd334d8bca22c4a = new boolean[]{false, true, false, true, false, false, false, true, true, true, false, false};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrcB_2(0, "default"), new rrcB_2(1, "smart"), null, null};
      var0[2] = new rrcB_2[]{(rrcB_2)var0[0], (rrcB_2)var0[1]};
      var0[3] = new rrcB_2[]{(rrcB_2)var0[0], (rrcB_2)var0[1]};
      staticFields98d16a36ad1c33518cd334d8bca22c4a = var0;
   }

   private void implements_() {
      if (this.fields98d16a36ad1c33518cd334d8bca22c4a == null) {
         this.fields98d16a36ad1c33518cd334d8bca22c4a = new Object[2];
         Object[] var1 = this.fields98d16a36ad1c33518cd334d8bca22c4a;
         var1[0] = 0;
      }
   }

   public rrcB_2 protected_() {
      return ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[2])[(this.fields98d16a36ad1c33518cd334d8bca22c4a[0] + 1)
         % ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[2]).length];
   }

   private static void private_() {
      strings98d16a36ad1c33518cd334d8bca22c4a = new String[]{new String("DEFAULT"), new String("default"), new String("SMART"), new String("smart")};
   }
}
