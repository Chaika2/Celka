package celestial;

import java.nio.charset.StandardCharsets;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ME extends rI_2 {
   private static short[] protected_;
   private static boolean[] throws_;
   private static int[] case_;
   public Object[] byte_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{50, 107, -120, -82, -70, -61, 72, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public ME(rw_3 var1) {
      super(var1);
      this.private_();
      int[][] var6 = class_(var1);
      this.byte_[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static int[][] class_(rw_3 var0) {
      int[][] var1 = new int[var0.break_()][var0.byte_()];
      int var2 = 0;

      for (int var3 = 0; var3 < var0.break_(); var3++) {
         for (int var4 = 0; var4 < var0.byte_(); var4++) {
            xc_3[] var5 = var0.class_(var3, var4);
            OptionalInt var6 = class_(var5, var0x -> !(var0x.break_() instanceof Ja_1) ? true : throws_[7]);
            if (var6.isPresent()) {
               var1[var3][var4] = var6.getAsInt();
            } else {
               var2++;
               var1[var3][var4] = Integer.MAX_VALUE;
            }
         }
      }

      if (var2 != 0) {
         System.out.println(var2 + " columns had no block despite being in a map art, letting them be whatever");
      }

      return var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7677980093331720097L;
   }

   private static <T> OptionalInt class_(T[] var0, Predicate<? super T> var1) {
      for (int var2 = var0.length - 1; var2 >= 0; var2--) {
         if (var1.test(var0[var2])) {
            return OptionalInt.of(var2);
         }
      }

      return OptionalInt.empty();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1502060955;
   }

   @Override
   public boolean break_(int var1, int var2, int var3, xc_3 var4) {
      this.private_();
      return var2 >= ((int[][])this.byte_[0])[var1][var3] ? true : throws_[1];
   }

   private static void throws_() {
      throws_ = new boolean[]{true, false, false, false, false, true, true, false, true};
   }

   private static void catch_() {
      protected_ = new short[2];
   }

   private static void case_() {
      case_ = new int[]{Integer.MAX_VALUE};
   }

   private void private_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }
}
