package celestial;

import java.nio.charset.StandardCharsets;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ME extends rI_2 {
   private static short[] id_protected;
   private static boolean[] id_throws;
   private static int[] id_case;
   public Object[] id_byte;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{50, 107, -120, -82, -70, -61, 72, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public ME(rw_3 var1) {
      super(var1);
      this.id_private();
      int[][] var6 = id_class(var1);
      this.id_byte[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static int[][] id_class(rw_3 var0) {
      int[][] var1 = new int[var0.id_break()][var0.id_byte()];
      int var2 = 0;

      for (int var3 = 0; var3 < var0.id_break(); var3++) {
         for (int var4 = 0; var4 < var0.id_byte(); var4++) {
            xc_3[] var5 = var0.id_class(var3, var4);
            OptionalInt var6 = id_class(var5, var0x -> !(var0x.id_break() instanceof Ja_1) ? true : id_throws[7]);
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

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7677980093331720097L;
   }

   private static <T> OptionalInt id_class(T[] var0, Predicate<? super T> var1) {
      for (int var2 = var0.length - 1; var2 >= 0; var2--) {
         if (var1.test(var0[var2])) {
            return OptionalInt.of(var2);
         }
      }

      return OptionalInt.empty();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1502060955;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3, xc_3 var4) {
      this.id_private();
      return var2 >= ((int[][])this.id_byte[0])[var1][var3] ? true : id_throws[1];
   }

   private static void id_throws() {
      id_throws = new boolean[]{true, false, false, false, false, true, true, false, true};
   }

   private static void id_catch() {
      id_protected = new short[2];
   }

   private static void id_case() {
      id_case = new int[]{Integer.MAX_VALUE};
   }

   private void id_private() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
         Object[] var1 = this.id_byte;
      }
   }
}
