package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum EE {
   ;
   private static boolean[] booleans89d1393b1638388fa783cab6fa7d8b95;
   private static byte[] bytes89d1393b1638388fa783cab6fa7d8b95;
   private static String[] strings89d1393b1638388fa783cab6fa7d8b95;
   public Object[] fields89d1393b1638388fa783cab6fa7d8b95;
   public static Object[] staticFields89d1393b1638388fa783cab6fa7d8b95;
   private static short[] shorts89d1393b1638388fa783cab6fa7d8b95;

   private static void byte_() {
      Object[] var0 = new Object[4];
      Function var10006 = var0x -> var0x;
      String[] var2 = new String[]{"all", "a"};
      var0[0] = new EE(var10006, var2);
      var10006 = var0x -> new rY_2[]{var0x[var0x.length - 1]};
      String[] var3 = new String[]{"newest", "n"};
      var0[1] = new EE(var10006, var3);
      var10006 = var0x -> new rY_2[]{var0x[0]};
      String[] var4 = new String[]{"oldest", "o"};
      var0[2] = new EE(var10006, var4);
      var0[3] = new EE[]{(EE)var0[0], (EE)var0[1], (EE)var0[2]};
      staticFields89d1393b1638388fa783cab6fa7d8b95 = var0;
   }

   private EE(Function<rY_2[], rY_2[]> var3, String... var4) {
      this.case_();
      this.fields89d1393b1638388fa783cab6fa7d8b95[0] = var3;
      this.fields89d1393b1638388fa783cab6fa7d8b95[1] = var4;
   }

   static {
      ntfClinit();
   }

   public rY_2[] class_(rY_2[] var1) {
      return (rY_2[])((Function)this.fields89d1393b1638388fa783cab6fa7d8b95[0]).apply(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3665061658362030167L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1264495434;
   }

   public static EE class_(String var0) {
      for (EE var4 : values()) {
         for (String var8 : (String[])var4.fields89d1393b1638388fa783cab6fa7d8b95[1]) {
            if (var8.equalsIgnoreCase(var0)) {
               return var4;
            }
         }
      }

      return null;
   }

   public static String[] class_() {
      HashSet var0 = new HashSet();

      for (EE var4 : values()) {
         var0.addAll(Arrays.asList((String[])var4.fields89d1393b1638388fa783cab6fa7d8b95[1]));
      }

      return var0.toArray(new String[0]);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-47, -36, 73, -72, 77, 88, -41, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      shorts89d1393b1638388fa783cab6fa7d8b95 = new short[]{3, 0, 1, 0, 1, 1, 0, 1, 2};
   }

   private static void throws_() {
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

   private static void catch_() {
      booleans89d1393b1638388fa783cab6fa7d8b95 = new boolean[]{
         false, false, false, false, true, false, false, true, false, true, false, true, false, false, true, false, true, false, true, true, false, true
      };
   }

   private void case_() {
      if (this.fields89d1393b1638388fa783cab6fa7d8b95 == null) {
         this.fields89d1393b1638388fa783cab6fa7d8b95 = new Object[2];
         Object[] var1 = this.fields89d1393b1638388fa783cab6fa7d8b95;
      }
   }

   private static void protected_() {
      bytes89d1393b1638388fa783cab6fa7d8b95 = new byte[]{3, 2, 2, 2, 2, 2, 2, 3, 2, 4};
   }
}
