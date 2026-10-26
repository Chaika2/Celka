package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum EE {
   private static boolean[] booleans89d1393b1638388fa783cab6fa7d8b95;
   private static byte[] bytes89d1393b1638388fa783cab6fa7d8b95;
   private static String[] strings89d1393b1638388fa783cab6fa7d8b95;
   public Object[] fields89d1393b1638388fa783cab6fa7d8b95;
   public static Object[] staticFields89d1393b1638388fa783cab6fa7d8b95;
   private static short[] shorts89d1393b1638388fa783cab6fa7d8b95;

   private static void id_byte() {
      Object[] var0 = new Object[4];
      String var10004 = strings89d1393b1638388fa783cab6fa7d8b95[0];
      Function var10006 = var0x -> var0x;
      String[] var2 = new String[]{strings89d1393b1638388fa783cab6fa7d8b95[1], strings89d1393b1638388fa783cab6fa7d8b95[2]};
      var0[0] = new EE(var10006, var2);
      var10004 = strings89d1393b1638388fa783cab6fa7d8b95[3];
      var10006 = var0x -> {
         rY_2[] var10000 = new rY_2[1];
         var10000[booleans89d1393b1638388fa783cab6fa7d8b95[8]] = var0x[var0x.length - 1];
         return var10000;
      };
      String[] var3 = new String[]{strings89d1393b1638388fa783cab6fa7d8b95[4], strings89d1393b1638388fa783cab6fa7d8b95[5]};
      var0[1] = new EE(var10006, var3);
      var10004 = strings89d1393b1638388fa783cab6fa7d8b95[6];
      var10006 = var0x -> {
         rY_2[] var10000 = new rY_2[1];
         var10000[booleans89d1393b1638388fa783cab6fa7d8b95[5]] = var0x[booleans89d1393b1638388fa783cab6fa7d8b95[6]];
         return var10000;
      };
      String[] var4 = new String[]{strings89d1393b1638388fa783cab6fa7d8b95[7], strings89d1393b1638388fa783cab6fa7d8b95[8]};
      var0[2] = new EE(var10006, var4);
      var0[3] = new EE[]{(EE)var0[0], (EE)var0[1], (EE)var0[2]};
      staticFields89d1393b1638388fa783cab6fa7d8b95 = var0;
   }

   private EE(Function<rY_2[], rY_2[]> var3, String... var4) {
      this.id_case();
      this.fields89d1393b1638388fa783cab6fa7d8b95[shorts89d1393b1638388fa783cab6fa7d8b95[1]] = var3;
      this.fields89d1393b1638388fa783cab6fa7d8b95[1] = var4;
   }

   static {
      ntfClinit();
   }

   public rY_2[] id_class(rY_2[] var1) {
      return (rY_2[])((Function)this.fields89d1393b1638388fa783cab6fa7d8b95[shorts89d1393b1638388fa783cab6fa7d8b95[3]]).apply(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3665061658362030167L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1264495434;
   }

   public static EE id_class(String var0) {
      EE[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleans89d1393b1638388fa783cab6fa7d8b95[0]; var3 < var2; var3++) {
         EE var4 = var1[var3];
         String[] var5 = (String[])var4.fields89d1393b1638388fa783cab6fa7d8b95[1];
         int var6 = var5.length;

         for (int var7 = booleans89d1393b1638388fa783cab6fa7d8b95[1]; var7 < var6; var7++) {
            String var8 = var5[var7];
            if (var8.equalsIgnoreCase(var0)) {
               return var4;
            }
         }
      }

      return null;
   }

   public static String[] id_class() {
      HashSet var0 = new HashSet();
      EE[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleans89d1393b1638388fa783cab6fa7d8b95[2]; var3 < var2; var3++) {
         EE var4 = var1[var3];
         var0.addAll(Arrays.asList((String[])var4.fields89d1393b1638388fa783cab6fa7d8b95[1]));
      }

      return var0.toArray(new String[booleans89d1393b1638388fa783cab6fa7d8b95[3]]);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-47, -36, 73, -72, 77, 88, -41, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      shorts89d1393b1638388fa783cab6fa7d8b95 = new short[]{3, 0, 1, 0, 1, 1, 0, 1, 2};
   }

   private static void id_throws() {
      strings89d1393b1638388fa783cab6fa7d8b95 = new String[]{
         new String("ALL"),
         new String("all"),
         new String("a"),
         new String("NEWEST"),
         new String("newest"),
         new String("n"),
         new String("OLDEST"),
         new String("oldest"),
         new String("o")
      };
   }

   private static void id_catch() {
      booleans89d1393b1638388fa783cab6fa7d8b95 = new boolean[]{
         false, false, false, false, true, false, false, true, false, true, false, true, false, false, true, false, true, false, true, true, false, true
      };
   }

   private void id_case() {
      if (this.fields89d1393b1638388fa783cab6fa7d8b95 == null) {
         this.fields89d1393b1638388fa783cab6fa7d8b95 = new Object[2];
         Object[] var1 = this.fields89d1393b1638388fa783cab6fa7d8b95;
      }
   }

   private static void id_protected() {
      bytes89d1393b1638388fa783cab6fa7d8b95 = new byte[]{3, 2, 2, 2, 2, 2, 2, 3, 2, 4};
   }
}
