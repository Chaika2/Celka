package celestial;

import java.nio.charset.StandardCharsets;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rU_2 extends rfH_2 {
   private static double[] id_catch;
   private static boolean[] id_private;
   public static Object[] id_class;
   private static short[] id_implements;
   public Object[] id_break;
   private static String[] id_finally;
   private static byte[] id_extends;
   private static long[] id_native;

   public rU_2 id_byte(rpr_3 var1, int var2) {
      this.id_public();
      if (var2 == 0) {
         return this;
      } else {
         rja_3 var3 = var1.id_int();
         return new rU_2(
            (Integer)this.id_break[0] + var3.b_() * var2, (Integer)this.id_break[1] + var3.c_() * var2, (Integer)this.id_break[2] + var3.d_() * var2
         );
      }
   }

   public static long id_byte(int var0, int var1, int var2) {
      long var3 = 3241L;
      var3 = 3457689L * var3 + (long)var0;
      var3 = 8734625L * var3 + (long)var1;
      return 2873465L * var3 + (long)var2;
   }

   public rU_2 id_byte(int var1) {
      this.id_public();
      return var1 == 0 ? this : new rU_2((Integer)this.id_break[0], (Integer)this.id_break[1], (Integer)this.id_break[2] + var1);
   }

   public rU_2(rjU_2 var1) {
      this(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public rU_2(eX_2 var1) {
      this(var1.id_class(), var1.id_break(), var1.id_byte());
   }

   public rU_2(rja_3 var1) {
      this(var1.b_(), var1.c_(), var1.d_());
   }

   public rU_2(double var1, double var3, double var5) {
      this(rfU_2.id_byte(var1), rfU_2.id_byte(var3), rfU_2.id_byte(var5));
   }

   public rU_2(int var1, int var2, int var3) {
      super(var1, var2, var3);
      this.id_public();
      Integer var8 = var1;
      this.id_break[0] = var8;
      Integer var9 = var2;
      this.id_break[1] = var9;
      Integer var10 = var3;
      this.id_break[2] = var10;
   }

   public rU_2(rfH_2 var1) {
      this(var1.b_(), var1.c_(), var1.d_());
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      this.id_public();
      if (var1 == null) {
         return false;
      } else if (var1 instanceof rU_2 var3) {
         return var3.id_break[0] == this.id_break[0] && var3.id_break[1] == this.id_break[1] && var3.id_break[2] == this.id_break[2] ? true : id_private[2];
      } else {
         rfH_2 var2 = (rfH_2)var1;
         return var2.b_() == this.id_break[0] && var2.c_() == this.id_break[1] && var2.d_() == this.id_break[2] ? true : id_private[4];
      }
   }

   @Nonnull
   @Override
   public String toString() {
      this.id_public();
      return String.format(
         "X: %s, Y: %s, Z: %s", Pd_1.id_class((Integer)this.id_break[0]), Pd_1.id_class((Integer)this.id_break[1]), Pd_1.id_class((Integer)this.id_break[2])
      );
   }

   @Override
   public int hashCode() {
      this.id_public();
      return (int)id_byte((Integer)this.id_break[0], (Integer)this.id_break[1], (Integer)this.id_break[2]);
   }

   public rU_2 id_class(rpr_3 var1) {
      this.id_public();
      rja_3 var2 = var1.id_int();
      return new rU_2((Integer)this.id_break[0] + var2.b_(), (Integer)this.id_break[1] + var2.c_(), (Integer)this.id_break[2] + var2.d_());
   }

   public rU_2 id_class(int var1, int var2, int var3) {
      this.id_public();
      return new rU_2((Integer)this.id_break[0] + var1, (Integer)this.id_break[1] + var2, (Integer)this.id_break[2] + var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, 44, -61, 54, -66, -13, 69, -97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static long id_class(rU_2 var0) {
      return id_byte((Integer)var0.id_break[0], (Integer)var0.id_break[1], (Integer)var0.id_break[2]);
   }

   public static rU_2 id_class(rfH_2 var0) {
      return var0 == null ? null : new rU_2(var0);
   }

   public rU_2 id_class() {
      this.id_public();
      return new rU_2((Integer)this.id_break[0], (Integer)this.id_break[1] + 1, (Integer)this.id_break[2]);
   }

   public rU_2 id_break(double var1, double var3, double var5) {
      return var1 == 0.0 && var3 == 0.0 && var5 == 0.0 ? this : new rU_2((double)this.b_() + var1, (double)this.c_() + var3, (double)this.d_() + var5);
   }

   public rU_2 id_throws() {
      this.id_public();
      return new rU_2((Integer)this.id_break[0] + 1, (Integer)this.id_break[1], (Integer)this.id_break[2]);
   }

   public rU_2 id_throws(int var1) {
      this.id_public();
      return var1 == 0 ? this : new rU_2((Integer)this.id_break[0] - var1, (Integer)this.id_break[1], (Integer)this.id_break[2]);
   }

   public rU_2 id_finally(int var1) {
      this.id_public();
      return var1 == 0 ? this : new rU_2((Integer)this.id_break[0], (Integer)this.id_break[1], (Integer)this.id_break[2] - var1);
   }

   public rU_2 id_finally() {
      this.id_public();
      return new rU_2((Integer)this.id_break[0], (Integer)this.id_break[1], (Integer)this.id_break[2] - 1);
   }

   public rU_2 id_extends(int var1) {
      this.id_public();
      return var1 == 0 ? this : new rU_2((Integer)this.id_break[0] + var1, (Integer)this.id_break[1], (Integer)this.id_break[2]);
   }

   private static void id_goto() {
      id_extends = new byte[]{3, 2, 3, 2};
   }

   private static long id_case(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3299006487926128404L;
   }

   public rU_2 id_case() {
      this.id_public();
      return new rU_2((Integer)this.id_break[0], (Integer)this.id_break[1] - 1, (Integer)this.id_break[2]);
   }

   private static void id_continue() {
      id_implements = new short[]{
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         0,
         1,
         1,
         2,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2
      };
   }

   private static int id_package(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 158272185;
   }

   private static void id_return() {
      id_finally = new String[]{new String("X: %s, Y: %s, Z: %s")};
   }

   private static void id_super() {
      Object[] var0 = new Object[]{new rU_2(0, 0, 0)};
      id_class = var0;
   }

   private static void id_try() {
      id_private = new boolean[]{
         false, true, false, true, false, true, true, true, true, true, true, false, true, false, false, false, false, false, false, true, false, false, true
      };
   }

   private static void id_while() {
      id_native = new long[]{3241L, 3457689L, 8734625L, 2873465L};
   }

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   public rU_2 id_protected(int var1) {
      this.id_public();
      return var1 == 0 ? this : new rU_2((Integer)this.id_break[0], (Integer)this.id_break[1] - var1, (Integer)this.id_break[2]);
   }

   public rU_2 id_final(int var1) {
      this.id_public();
      return var1 == 0 ? this : new rU_2((Integer)this.id_break[0], (Integer)this.id_break[1] + var1, (Integer)this.id_break[2]);
   }

   public rU_2 id_volatile() {
      this.id_public();
      return new rU_2((Integer)this.id_break[0], (Integer)this.id_break[1], (Integer)this.id_break[2] + 1);
   }

   private static void id_synchronized() {
      id_catch = new double[3];
   }

   public rU_2 id_native() {
      this.id_public();
      return new rU_2((Integer)this.id_break[0] - 1, (Integer)this.id_break[1], (Integer)this.id_break[2]);
   }
}
