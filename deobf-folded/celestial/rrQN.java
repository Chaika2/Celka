package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrQN {
   private static String[] strings065bd3322daf3178a8bd0d03c4b20e54;
   private static byte[] bytes065bd3322daf3178a8bd0d03c4b20e54;
   private static short[] shorts065bd3322daf3178a8bd0d03c4b20e54;
   public Object[] fields065bd3322daf3178a8bd0d03c4b20e54;
   private static boolean[] booleans065bd3322daf3178a8bd0d03c4b20e54;
   public static Object[] staticFields065bd3322daf3178a8bd0d03c4b20e54;

   private static void id_byte() {
      booleans065bd3322daf3178a8bd0d03c4b20e54 = new boolean[]{true, false, false, false, true};
   }

   private rrQN() {
      this.id_case();
      rrQc_1 var7 = new rrQc_1();
      this.fields065bd3322daf3178a8bd0d03c4b20e54[shorts065bd3322daf3178a8bd0d03c4b20e54[1]] = var7;
      rrQu_1 var8 = new rrQu_1();
      this.fields065bd3322daf3178a8bd0d03c4b20e54[1] = var8;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-120, 14, 111, 57, -35, -85, -74, -80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 425142553;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3985479629498218664L;
   }

   private static void id_class() {
      shorts065bd3322daf3178a8bd0d03c4b20e54 = new short[]{1, 0, 1, 0};
   }

   private static void id_break() {
      bytes065bd3322daf3178a8bd0d03c4b20e54 = new byte[]{2, 2};
   }

   private static void id_throws() {
      strings065bd3322daf3178a8bd0d03c4b20e54 = new String[]{new String("INSTANCE")};
   }

   private void id_case() {
      if (this.fields065bd3322daf3178a8bd0d03c4b20e54 == null) {
         this.fields065bd3322daf3178a8bd0d03c4b20e54 = new Object[2];
         Object[] var1 = this.fields065bd3322daf3178a8bd0d03c4b20e54;
      }
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrQN(), null};
      var0[1] = new rrQN[]{(rrQN)var0[0]};
      staticFields065bd3322daf3178a8bd0d03c4b20e54 = var0;
   }
}
