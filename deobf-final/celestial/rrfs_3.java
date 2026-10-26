package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrfs_3 {
   ;
   public static Object[] staticFieldsaa3157a520ba3b3b82552faf4dacb3c8;
   private static byte[] bytesaa3157a520ba3b3b82552faf4dacb3c8;
   private static boolean[] booleansaa3157a520ba3b3b82552faf4dacb3c8;
   public Object[] fieldsaa3157a520ba3b3b82552faf4dacb3c8;
   private static String[] stringsaa3157a520ba3b3b82552faf4dacb3c8;
   private static short[] shortsaa3157a520ba3b3b82552faf4dacb3c8;

   private rrfs_3(String var3) {
      this.break_();
      this.fieldsaa3157a520ba3b3b82552faf4dacb3c8[0] = var3;
   }

   static {
      ntfClinit();
   }

   public String class_() {
      return (String)this.fieldsaa3157a520ba3b3b82552faf4dacb3c8[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6500031579614996299L;
   }

   public static rrfs_3 class_(rdn_3 var0) {
      if (var0.break_() != rdy_3.OB) {
         return null;
      } else {
         Matcher var1 = ((Pattern)staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[4]).matcher(var0.continue_().getString());
         return var1.matches() ? (rrfs_3)((Map)staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[5]).get(var1.group(1)) : null;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 556220179;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{73, -38, -86, -7, -73, -3, 29, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.fieldsaa3157a520ba3b3b82552faf4dacb3c8 == null) {
         this.fieldsaa3157a520ba3b3b82552faf4dacb3c8 = new Object[1];
      }
   }

   private static void throws_() {
      booleansaa3157a520ba3b3b82552faf4dacb3c8 = new boolean[]{true, false, true, false, false, true, true, false, true};
   }

   private static void catch_() {
      stringsaa3157a520ba3b3b82552faf4dacb3c8 = new String[]{
         new String("ONE_X_ONE"),
         new String("1x1"),
         new String("THREE_X_THREE"),
         new String("3x3"),
         new String("FIVE_X_FIVE"),
         new String("5x5"),
         new String("\\[★] Прогрузчик чанков \\[(\\dx\\d)]")
      };
   }

   private static void case_() {
      shortsaa3157a520ba3b3b82552faf4dacb3c8 = new short[]{6, 4, 5, 0, 0, 0, 1, 2};
   }

   private static void protected_() {
      bytesaa3157a520ba3b3b82552faf4dacb3c8 = new byte[]{3, 2, 2, 2, 6, 3, 4, 5, 3, 5, 7};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrfs_3("1x1"), new rrfs_3("3x3"), new rrfs_3("5x5"), null, null, null, null};
      var0[3] = new rrfs_3[]{(rrfs_3)var0[0], (rrfs_3)var0[1], (rrfs_3)var0[2]};
      var0[4] = Pattern.compile("\\[★] Прогрузчик чанков \\[(\\dx\\d)]", 0);
      var0[6] = new rrfs_3[]{(rrfs_3)var0[0], (rrfs_3)var0[1], (rrfs_3)var0[2]};
      HashMap var2 = new HashMap();
      var2.put("5x5", var0[2]);
      var2.put("1x1", var0[0]);
      var2.put("3x3", var0[1]);
      var0[5] = var2;
      staticFieldsaa3157a520ba3b3b82552faf4dacb3c8 = var0;
   }
}
