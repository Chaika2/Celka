package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrcB_2 {
   private static short[] shorts98d16a36ad1c33518cd334d8bca22c4a;
   private static byte[] bytes98d16a36ad1c33518cd334d8bca22c4a;
   public Object[] fields98d16a36ad1c33518cd334d8bca22c4a;
   public static Object[] staticFields98d16a36ad1c33518cd334d8bca22c4a;
   private static boolean[] booleans98d16a36ad1c33518cd334d8bca22c4a;
   private static String[] strings98d16a36ad1c33518cd334d8bca22c4a;

   public String id_byte() {
      return (String)this.fields98d16a36ad1c33518cd334d8bca22c4a[1];
   }

   private rrcB_2(int var3, String var4) {
      this.id_implements();
      Integer var9 = var3;
      this.fields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[1]] = var9;
      this.fields98d16a36ad1c33518cd334d8bca22c4a[1] = var4;
   }

   static {
      ntfClinit();
   }

   public static rrcB_2 id_class(int var0) {
      return ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[2])[var0 % ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[2]).length];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 85, 76, -117, -95, 105, 87, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rgP_2 id_class() {
      return new rgn_3("autobuy.refreshType." + (String)this.fields98d16a36ad1c33518cd334d8bca22c4a[1]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3764451569422565169L;
   }

   public int id_break() {
      return (Integer)this.fields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[3]];
   }

   public static rrcB_2 id_break(String var0) {
      rrcB_2[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleans98d16a36ad1c33518cd334d8bca22c4a[0]; var3 < var2; var3++) {
         rrcB_2 var4 = var1[var3];
         if (((String)var4.fields98d16a36ad1c33518cd334d8bca22c4a[1]).equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -901161331;
   }

   private static void id_throws() {
      shorts98d16a36ad1c33518cd334d8bca22c4a = new short[]{3, 0, 1, 0, 2, 2, 1, 1, 1, 2, 0, 2, 0, 1};
   }

   private static void id_catch() {
      bytes98d16a36ad1c33518cd334d8bca22c4a = new byte[]{2, 3, 2, 2, 4};
   }

   private static void id_extends() {
      booleans98d16a36ad1c33518cd334d8bca22c4a = new boolean[]{false, true, false, true, false, false, false, true, true, true, false, false};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{
         new rrcB_2(0, strings98d16a36ad1c33518cd334d8bca22c4a[1]), new rrcB_2(1, strings98d16a36ad1c33518cd334d8bca22c4a[3]), null, null
      };
      var0[2] = new rrcB_2[]{(rrcB_2)var0[0], (rrcB_2)var0[1]};
      var0[3] = new rrcB_2[]{(rrcB_2)var0[0], (rrcB_2)var0[1]};
      staticFields98d16a36ad1c33518cd334d8bca22c4a = var0;
   }

   private void id_implements() {
      if (this.fields98d16a36ad1c33518cd334d8bca22c4a == null) {
         this.fields98d16a36ad1c33518cd334d8bca22c4a = new Object[2];
         Object[] var1 = this.fields98d16a36ad1c33518cd334d8bca22c4a;
         var1[booleans98d16a36ad1c33518cd334d8bca22c4a[10]] = Integer.valueOf(booleans98d16a36ad1c33518cd334d8bca22c4a[11]);
      }
   }

   public rrcB_2 id_protected() {
      return ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[2])[(
            this.fields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[10]] + 1
         )
         % ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[2]).length];
   }

   private static void id_private() {
      strings98d16a36ad1c33518cd334d8bca22c4a = new String[]{new String("DEFAULT"), new String("default"), new String("SMART"), new String("smart")};
   }
}
