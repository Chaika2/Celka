package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzH_2 {
   private static short[] break_;
   public static Object[] class_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static long[] throws_;
   private static int[] case_;

   public static int byte_(byte[] var0, int var1) {
      return while_(var0, var1 + 40);
   }

   public static int byte_(byte[] var0) {
      return while_(var0, 6);
   }

   private static void byte_() {
      throws_ = new long[]{4294967295L, 67324752L, 134695760L, 33639248L, 101010256L, 0L, 0L, 0L, 0L, 101075792L, 117853008L, 4294967295L, 65557L};
   }

   public static long int_(byte[] var0, int var1) {
      return try_(var0, var1 + 24);
   }

   public static long int_(byte[] var0) {
      return catch_(var0, 48);
   }

   static {
      ntfClinit();
   }

   public static int this_(byte[] var0) {
      return while_(var0, 10);
   }

   public static boolean this_(byte[] var0, int var1) {
      return class_(var0, var1, 7, 8);
   }

   public static int interface_(byte[] var0, int var1) {
      return while_(var0, var1 + 6);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2035278064;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, -46, 23, 67, -124, -80, 72, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4558168436362600019L;
   }

   private static boolean class_(byte[] var0, int var1, int var2, int var3) {
      return (var0[var1] == 80 ? true : protected_[2])
         & (var0[var1 + 1] == 75 ? true : protected_[5])
         & (var0[var1 + 2] == var2 ? true : protected_[7])
         & (var0[var1 + 3] == var3 ? true : protected_[9]);
   }

   public static int class_(byte[] var0) {
      return while_(var0, 8);
   }

   private static void class_() {
      break_ = new short[]{2048, 768, 21589, 128};
   }

   public static int class_(byte[] var0, int var1) {
      return while_(var0, var1 + 20);
   }

   public static int break_(byte[] var0) {
      return while_(var0, 20);
   }

   public static boolean break_(byte[] var0, int var1) {
      return class_(var0, var1, 1, 2);
   }

   private static void break_() {
      case_ = new int[]{65535};
   }

   public static int throws_(byte[] var0, int var1) {
      return while_(var0, var1 + 4);
   }

   private static void throws_() {
      Object[] var0 = new Object[]{
         0,
         8,
         9,
         12,
         14,
         19,
         99,
         1,
         8,
         2048,
         67324752L,
         134695760L,
         33639248L,
         101010256L,
         30,
         16,
         46,
         22,
         3,
         768,
         4,
         6,
         8,
         10,
         14,
         18,
         22,
         26,
         28,
         4,
         8,
         12,
         4,
         6,
         8,
         10,
         12,
         16,
         20,
         24,
         28,
         30,
         32,
         34,
         36,
         38,
         42,
         8,
         10,
         12,
         16,
         20,
         101075792L,
         117853008L,
         56,
         20,
         24,
         1,
         65535,
         4294967295L,
         4,
         12,
         14,
         16,
         20,
         24,
         32,
         40,
         48,
         56,
         4,
         8,
         16,
         4,
         8,
         16,
         1,
         10,
         13,
         23,
         21589,
         65557L,
         128
      };
      class_ = var0;
   }

   public static long throws_(byte[] var0) {
      return catch_(var0, 40);
   }

   public static long finally_(byte[] var0, int var1) {
      return try_(var0, var1 + 20);
   }

   public static long finally_(byte[] var0) {
      return try_(var0, 12);
   }

   public static long catch_(byte[] var0) {
      return try_(var0, 0);
   }

   public static long catch_(byte[] var0, int var1) {
      return try_(var0, var1) | try_(var0, var1 + 4) << 32;
   }

   public static int extends_(byte[] var0) {
      return while_(var0, 26);
   }

   public static int extends_(byte[] var0, int var1) {
      return while_(var0, var1 + 34);
   }

   public static long goto_(byte[] var0, int var1) {
      return try_(var0, var1 + 0);
   }

   public static long case_(byte[] var0, int var1) {
      return try_(var0, var1);
   }

   private static void case_() {
      protected_ = new boolean[]{true, true, false, true, true, false, true, false, true, false, true, false, false, false, false, true, true, true, true};
   }

   public static int case_(byte[] var0) {
      return while_(var0, 4);
   }

   public static long continue_(byte[] var0) {
      return try_(var0, 8);
   }

   public static int continue_(byte[] var0, int var1) {
      return while_(var0, var1 + 36);
   }

   public static int else_(byte[] var0, int var1) {
      return while_(var0, var1 + 8);
   }

   public static long else_(byte[] var0) {
      return try_(var0, 14);
   }

   public static long implements_(byte[] var0) {
      return try_(var0, 12);
   }

   public static int implements_(byte[] var0, int var1) {
      return while_(var0, var1 + 32);
   }

   public static int instanceof_(byte[] var0, int var1) {
      return while_(var0, var1 + 30);
   }

   public static boolean new_(byte[] var0, int var1) {
      return class_(var0, var1, 3, 4);
   }

   public static long new_(byte[] var0) {
      return try_(var0, 22);
   }

   public static boolean package_(byte[] var0, int var1) {
      return class_(var0, var1, 6, 7);
   }

   public static long package_(byte[] var0) {
      return catch_(var0, 32);
   }

   public static long return_(byte[] var0) {
      return try_(var0, 10);
   }

   public static boolean return_(byte[] var0, int var1) {
      return class_(var0, var1, 5, 6);
   }

   public static int super_(byte[] var0, int var1) {
      return while_(var0, var1 + 28);
   }

   public static long super_(byte[] var0) {
      return try_(var0, 16);
   }

   public static long throw_(byte[] var0, int var1) {
      return try_(var0, var1 + 42);
   }

   public static long try_(byte[] var0, int var1) {
      return (long)(while_(var0, var1) | while_(var0, var1 + 2) << 16) & 4294967295L;
   }

   public static int while_(byte[] var0, int var1) {
      return Byte.toUnsignedInt(var0[var1]) | Byte.toUnsignedInt(var0[var1 + 1]) << 8;
   }

   public static long public_(byte[] var0, int var1) {
      return try_(var0, var1 + 38);
   }

   public static long protected_(byte[] var0, int var1) {
      return try_(var0, var1 + 16);
   }

   public static long protected_(byte[] var0) {
      return try_(var0, 18);
   }

   private static void protected_() {
      byte_ = new byte[]{
         8,
         2,
         16,
         4,
         32,
         80,
         75,
         2,
         3,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         6,
         6,
         6,
         7,
         4,
         6,
         8,
         10,
         14,
         18,
         22,
         26,
         28,
         4,
         8,
         12,
         8,
         10,
         12,
         16,
         20,
         20,
         24,
         32,
         40,
         48,
         8,
         4,
         5,
         6,
         8,
         10,
         12,
         16,
         20,
         24,
         28,
         30,
         32,
         34,
         36,
         38,
         40,
         42,
         10,
         11,
         12,
         13,
         83,
         8,
         2,
         9,
         3,
         12,
         4,
         14,
         5,
         19,
         6,
         99,
         7,
         8,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         30,
         15,
         16,
         16,
         46,
         17,
         22,
         18,
         3,
         19,
         20,
         4,
         21,
         6,
         22,
         8,
         23,
         10,
         24,
         14,
         25,
         18,
         26,
         22,
         27,
         26,
         28,
         28,
         29,
         4,
         30,
         8,
         31,
         12,
         32,
         4,
         33,
         6,
         34,
         8,
         35,
         10,
         36,
         12,
         37,
         16,
         38,
         20,
         39,
         24,
         40,
         28,
         41,
         30,
         42,
         32,
         43,
         34,
         44,
         36,
         45,
         38,
         46,
         42,
         47,
         8,
         48,
         10,
         49,
         12,
         50,
         16,
         51,
         20,
         52,
         53,
         54,
         56,
         55,
         20,
         56,
         24,
         57,
         58,
         59,
         60,
         4,
         61,
         12,
         62,
         14,
         63,
         16,
         64,
         20,
         65,
         24,
         66,
         32,
         67,
         40,
         68,
         48,
         69,
         56,
         70,
         4,
         71,
         8,
         72,
         16,
         73,
         4,
         74,
         8,
         75,
         16,
         76,
         77,
         10,
         78,
         13,
         79,
         23,
         80,
         81,
         82
      };
   }

   public static long private_(byte[] var0) {
      return catch_(var0, 8);
   }

   public static int private_(byte[] var0, int var1) {
      return final_(var0, var1 + 5);
   }

   public static int final_(byte[] var0, int var1) {
      return Byte.toUnsignedInt(var0[var1]);
   }

   public static int final_(byte[] var0) {
      return while_(var0, 8);
   }

   public static long volatile_(byte[] var0, int var1) {
      return try_(var0, var1 + 12);
   }

   public static int volatile_(byte[] var0) {
      return while_(var0, 28);
   }

   public static long synchronized_(byte[] var0) {
      return catch_(var0, 24);
   }

   public static int synchronized_(byte[] var0, int var1) {
      return while_(var0, var1 + 10);
   }

   public static long native_(byte[] var0) {
      return try_(var0, 4);
   }

   public static boolean native_(byte[] var0, int var1) {
      return class_(var0, var1, 6, 6);
   }
}
