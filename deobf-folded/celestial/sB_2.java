package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum sB_2 implements C_float<Long> {
   private static boolean[] booleans4194f58175203a8cae693b8dbfb27b1e;
   public static Object[] staticFields4194f58175203a8cae693b8dbfb27b1e;
   private static String[] strings4194f58175203a8cae693b8dbfb27b1e;
   private static byte[] bytes4194f58175203a8cae693b8dbfb27b1e;
   private static short[] shorts4194f58175203a8cae693b8dbfb27b1e;

   private static void id_byte() {
      strings4194f58175203a8cae693b8dbfb27b1e = new String[]{new String("INSTANCE")};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1944842646;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4132752904335788007L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{58, -78, -94, -102, 72, 5, -81, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Class<Long> id_class() {
      return Long.class;
   }

   private static void id_break() {
      shorts4194f58175203a8cae693b8dbfb27b1e = new short[]{1, 0};
   }

   public Long id_break(C_import var1) throws RuntimeException {
      return Long.parseLong(var1.id_break());
   }

   private static void id_throws() {
      booleans4194f58175203a8cae693b8dbfb27b1e = new boolean[]{true, false, false, false, true};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new sB_2(), null};
      var0[1] = new sB_2[]{(sB_2)var0[0]};
      staticFields4194f58175203a8cae693b8dbfb27b1e = var0;
   }

   private static void id_protected() {
      bytes4194f58175203a8cae693b8dbfb27b1e = new byte[]{2};
   }
}
