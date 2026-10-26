package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum C_else {
   private static short[] shortsbc7116b836d43454b9c0677570bd159e;
   public static Object[] staticFieldsbc7116b836d43454b9c0677570bd159e;
   private static byte[] bytesbc7116b836d43454b9c0677570bd159e;
   private static String[] stringsbc7116b836d43454b9c0677570bd159e;
   private static boolean[] booleansbc7116b836d43454b9c0677570bd159e;
   public Object[] fieldsbc7116b836d43454b9c0677570bd159e;

   private void id_byte() {
      if (this.fieldsbc7116b836d43454b9c0677570bd159e == null) {
         this.fieldsbc7116b836d43454b9c0677570bd159e = new Object[booleansbc7116b836d43454b9c0677570bd159e[19]];
         Object[] var1 = this.fieldsbc7116b836d43454b9c0677570bd159e;
      }
   }

   private C_else(String... var3) {
      this.id_byte();
      this.fieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[1]] = var3;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 39296997875439233L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 552968765;
   }

   public static C_else id_class(String var0) {
      C_else[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleansbc7116b836d43454b9c0677570bd159e[1]; var3 < var2; var3++) {
         C_else var4 = var1[var3];
         String[] var5 = (String[])var4.fieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[3]];
         int var6 = var5.length;

         for (int var7 = booleansbc7116b836d43454b9c0677570bd159e[2]; var7 < var6; var7++) {
            String var8 = var5[var7];
            if (var8.equalsIgnoreCase(var0)) {
               return var4;
            }
         }
      }

      return null;
   }

   public String id_class() {
      return ((String[])this.fieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[2]])[booleansbc7116b836d43454b9c0677570bd159e[0]];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-40, 4, -19, 73, 9, 106, 0, -54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static String[] id_break() {
      HashSet var0 = new HashSet();
      C_else[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleansbc7116b836d43454b9c0677570bd159e[3]; var3 < var2; var3++) {
         C_else var4 = var1[var3];
         var0.addAll(Arrays.asList((String[])var4.fieldsbc7116b836d43454b9c0677570bd159e[shortsbc7116b836d43454b9c0677570bd159e[4]]));
      }

      return var0.toArray(new String[booleansbc7116b836d43454b9c0677570bd159e[4]]);
   }

   private static void id_catch() {
      Object[] var0 = new Object[6];
      String var10004 = stringsbc7116b836d43454b9c0677570bd159e[0];
      String[] var2 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[1], stringsbc7116b836d43454b9c0677570bd159e[2]};
      var0[0] = new C_else(var2);
      var10004 = stringsbc7116b836d43454b9c0677570bd159e[3];
      String[] var3 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[4]};
      var0[1] = new C_else(var3);
      var10004 = stringsbc7116b836d43454b9c0677570bd159e[5];
      String[] var4 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[6], stringsbc7116b836d43454b9c0677570bd159e[7]};
      var0[2] = new C_else(var4);
      var10004 = stringsbc7116b836d43454b9c0677570bd159e[8];
      String[] var5 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[9]};
      var0[3] = new C_else(var5);
      C_else[] var6 = new C_else[4];
      String var10006 = stringsbc7116b836d43454b9c0677570bd159e[0];
      String[] var7 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[1], stringsbc7116b836d43454b9c0677570bd159e[2]};
      var6[0] = new C_else(var7);
      var10006 = stringsbc7116b836d43454b9c0677570bd159e[3];
      String[] var8 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[4]};
      var6[1] = new C_else(var8);
      var10006 = stringsbc7116b836d43454b9c0677570bd159e[5];
      String[] var9 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[6], stringsbc7116b836d43454b9c0677570bd159e[7]};
      var6[2] = new C_else(var9);
      var10006 = stringsbc7116b836d43454b9c0677570bd159e[8];
      String[] var10 = new String[]{stringsbc7116b836d43454b9c0677570bd159e[9]};
      var6[3] = new C_else(var10);
      var0[4] = Collections.unmodifiableList(Arrays.asList(var6));
      var0[5] = new C_else[]{(C_else)var0[0], (C_else)var0[1], (C_else)var0[2], (C_else)var0[3]};
      staticFieldsbc7116b836d43454b9c0677570bd159e = var0;
   }

   private static void id_case() {
      bytesbc7116b836d43454b9c0677570bd159e = new byte[]{4, 2, 3, 2, 2, 2, 2, 3, 3, 5, 4, 6};
   }

   private static void id_implements() {
      shortsbc7116b836d43454b9c0677570bd159e = new short[]{5, 0, 0, 0, 0, 0, 1, 2, 3};
   }

   private static void id_protected() {
      booleansbc7116b836d43454b9c0677570bd159e = new boolean[]{
         false, false, false, false, false, false, true, false, false, true, false, true, true, false, true, false, true, true, false, true
      };
   }

   private static void id_private() {
      stringsbc7116b836d43454b9c0677570bd159e = new String[]{
         new String("HOME"),
         new String("home"),
         new String("base"),
         new String("DEATH"),
         new String("death"),
         new String("BED"),
         new String("bed"),
         new String("spawn"),
         new String("USER"),
         new String("user")
      };
   }
}
