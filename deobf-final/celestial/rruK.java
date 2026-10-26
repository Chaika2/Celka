package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rruK {
   ;
   private static byte[] bytes11fe8af515b33fa79776ddc4dd3ca7f8;
   public static Object[] staticFields11fe8af515b33fa79776ddc4dd3ca7f8;
   private static int[] integers11fe8af515b33fa79776ddc4dd3ca7f8;
   private static short[] shorts11fe8af515b33fa79776ddc4dd3ca7f8;
   private static boolean[] booleans11fe8af515b33fa79776ddc4dd3ca7f8;
   public Object[] fields11fe8af515b33fa79776ddc4dd3ca7f8;
   private static double[] doubles11fe8af515b33fa79776ddc4dd3ca7f8;
   private static String[] strings11fe8af515b33fa79776ddc4dd3ca7f8;

   private rruK(String var3, Supplier<Integer> var4) {
      this.final_();
      this.fields11fe8af515b33fa79776ddc4dd3ca7f8[0] = var3;
      this.fields11fe8af515b33fa79776ddc4dd3ca7f8[1] = var4;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2302078691197123403L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -519373608;
   }

   public String class_() {
      return (String)this.fields11fe8af515b33fa79776ddc4dd3ca7f8[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-57, -101, 79, 79, -97, 71, -19, -68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Supplier<Integer> break_() {
      return (Supplier<Integer>)this.fields11fe8af515b33fa79776ddc4dd3ca7f8[1];
   }

   private static void throws_() {
      strings11fe8af515b33fa79776ddc4dd3ca7f8 = new String[]{
         new String("RANDOM"),
         new String("random"),
         new String("GREEN"),
         new String("green"),
         new String("RED"),
         new String("red"),
         new String("BLUE"),
         new String("blue"),
         new String("YELLOW"),
         new String("yellow"),
         new String("PURPLE"),
         new String("purple"),
         new String("CYAN"),
         new String("cyan"),
         new String("WHITE"),
         new String("white"),
         new String("BLACK"),
         new String("black"),
         new String("GRAY"),
         new String("gray"),
         new String("BROWN"),
         new String("brown"),
         new String("ORANGE"),
         new String("orange"),
         new String("PINK"),
         new String("pink"),
         new String("LIME"),
         new String("lime"),
         new String("MAGENTA"),
         new String("magenta")
      };
   }

   private static void catch_() {
      integers11fe8af515b33fa79776ddc4dd3ca7f8 = new int[]{
         -65281, -16711936, -5952982, -8355712, -16777216, -16711681, -8388480, -16776961, -65536, -16711936, -16777216
      };
   }

   private static void extends_() {
      Object[] var0 = new Object[]{
         new rruK("random", () -> 0xFF000000 | (int)(Math.random() * 1.6777216E7)),
         new rruK("green", () -> -16711936),
         new rruK("red", () -> -65536),
         new rruK("blue", () -> -16776961),
         new rruK("yellow", () -> -256),
         new rruK("purple", () -> -8388480),
         new rruK("cyan", () -> -16711681),
         new rruK("white", () -> -1),
         new rruK("black", () -> -16777216),
         new rruK("gray", () -> -8355712),
         new rruK("brown", () -> -5952982),
         new rruK("orange", () -> -23296),
         new rruK("pink", () -> -16181),
         new rruK("lime", () -> -16711936),
         new rruK("magenta", () -> -65281),
         null
      };
      var0[15] = new rruK[]{
         (rruK)var0[0],
         (rruK)var0[1],
         (rruK)var0[2],
         (rruK)var0[3],
         (rruK)var0[4],
         (rruK)var0[5],
         (rruK)var0[6],
         (rruK)var0[7],
         (rruK)var0[8],
         (rruK)var0[9],
         (rruK)var0[10],
         (rruK)var0[11],
         (rruK)var0[12],
         (rruK)var0[13],
         (rruK)var0[14]
      };
      staticFields11fe8af515b33fa79776ddc4dd3ca7f8 = var0;
   }

   private static void implements_() {
      booleans11fe8af515b33fa79776ddc4dd3ca7f8 = new boolean[]{false, true, false, false, true, true};
   }

   private static void package_() {
      shorts11fe8af515b33fa79776ddc4dd3ca7f8 = new short[]{15, 0, 1, 0, 1, -16181, -23296, -256, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
   }

   private static void public_() {
      bytes11fe8af515b33fa79776ddc4dd3ca7f8 = new byte[]{
         -1, 15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 2, 16
      };
   }

   private void final_() {
      if (this.fields11fe8af515b33fa79776ddc4dd3ca7f8 == null) {
         this.fields11fe8af515b33fa79776ddc4dd3ca7f8 = new Object[2];
         Object[] var1 = this.fields11fe8af515b33fa79776ddc4dd3ca7f8;
      }
   }

   private static void volatile_() {
      doubles11fe8af515b33fa79776ddc4dd3ca7f8 = new double[]{1.6777216E7};
   }
}
