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
         this.fieldsbc7116b836d43454b9c0677570bd159e = new Object[1];
         Object[] var1 = this.fieldsbc7116b836d43454b9c0677570bd159e;
      }
   }

   private C_else(String... var3) {
      this.id_byte();
      this.fieldsbc7116b836d43454b9c0677570bd159e[0] = var3;
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
      for (C_else var4 : values()) {
         for (String var8 : (String[])var4.fieldsbc7116b836d43454b9c0677570bd159e[0]) {
            if (var8.equalsIgnoreCase(var0)) {
               return var4;
            }
         }
      }

      return null;
   }

   public String id_class() {
      return ((String[])this.fieldsbc7116b836d43454b9c0677570bd159e[0])[0];
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

      for (C_else var4 : values()) {
         var0.addAll(Arrays.asList((String[])var4.fieldsbc7116b836d43454b9c0677570bd159e[0]));
      }

      return var0.toArray(new String[0]);
   }

   private static void id_catch() {
      Object[] var0 = new Object[6];
      String[] var2 = new String[]{"home", "base"};
      var0[0] = new C_else(var2);
      String[] var3 = new String[]{"death"};
      var0[1] = new C_else(var3);
      String[] var4 = new String[]{"bed", "spawn"};
      var0[2] = new C_else(var4);
      String[] var5 = new String[]{"user"};
      var0[3] = new C_else(var5);
      C_else[] var6 = new C_else[4];
      String[] var7 = new String[]{"home", "base"};
      var6[0] = new C_else(var7);
      String[] var8 = new String[]{"death"};
      var6[1] = new C_else(var8);
      String[] var9 = new String[]{"bed", "spawn"};
      var6[2] = new C_else(var9);
      String[] var10 = new String[]{"user"};
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
