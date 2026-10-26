package celestial;

import java.nio.charset.StandardCharsets;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rU_2 extends rfH_2 {
   private static double[] catch_;
   private static boolean[] private_;
   public static Object[] class_;
   private static short[] implements_;
   public Object[] break_;
   private static String[] finally_;
   private static byte[] extends_;
   private static long[] native_;

   public rU_2 byte_(rpr_3 var1, int var2) {
      this.public_();
      if (var2 == 0) {
         return this;
      } else {
         rja_3 var3 = var1.int_();
         return new rU_2((Integer)this.break_[0] + var3.b_() * var2, (Integer)this.break_[1] + var3.c_() * var2, (Integer)this.break_[2] + var3.d_() * var2);
      }
   }

   public static long byte_(int var0, int var1, int var2) {
      long var3 = 3241L;
      var3 = 3457689L * var3 + (long)var0;
      var3 = 8734625L * var3 + (long)var1;
      return 2873465L * var3 + (long)var2;
   }

   public rU_2 byte_(int var1) {
      this.public_();
      return var1 == 0 ? this : new rU_2((Integer)this.break_[0], (Integer)this.break_[1], (Integer)this.break_[2] + var1);
   }

   public rU_2(rjU_2 var1) {
      this(var1.break_, var1.byte_, var1.protected_);
   }

   public rU_2(eX_2 var1) {
      this(var1.class_(), var1.break_(), var1.byte_());
   }

   public rU_2(rja_3 var1) {
      this(var1.b_(), var1.c_(), var1.d_());
   }

   public rU_2(double var1, double var3, double var5) {
      this(rfU_2.byte_(var1), rfU_2.byte_(var3), rfU_2.byte_(var5));
   }

   public rU_2(int var1, int var2, int var3) {
      super(var1, var2, var3);
      this.public_();
      Integer var8 = var1;
      this.break_[0] = var8;
      Integer var9 = var2;
      this.break_[1] = var9;
      Integer var10 = var3;
      this.break_[2] = var10;
   }

   public rU_2(rfH_2 var1) {
      this(var1.b_(), var1.c_(), var1.d_());
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      this.public_();
      if (var1 == null) {
         return false;
      } else if (var1 instanceof rU_2 var3) {
         return var3.break_[0] == this.break_[0] && var3.break_[1] == this.break_[1] && var3.break_[2] == this.break_[2] ? true : private_[2];
      } else {
         rfH_2 var2 = (rfH_2)var1;
         return var2.b_() == this.break_[0] && var2.c_() == this.break_[1] && var2.d_() == this.break_[2] ? true : private_[4];
      }
   }

   @Nonnull
   @Override
   public String toString() {
      this.public_();
      return String.format(
         "X: %s, Y: %s, Z: %s", Pd_1.class_((Integer)this.break_[0]), Pd_1.class_((Integer)this.break_[1]), Pd_1.class_((Integer)this.break_[2])
      );
   }

   @Override
   public int hashCode() {
      this.public_();
      return (int)byte_((Integer)this.break_[0], (Integer)this.break_[1], (Integer)this.break_[2]);
   }

   public rU_2 class_(rpr_3 var1) {
      this.public_();
      rja_3 var2 = var1.int_();
      return new rU_2((Integer)this.break_[0] + var2.b_(), (Integer)this.break_[1] + var2.c_(), (Integer)this.break_[2] + var2.d_());
   }

   public rU_2 class_(int var1, int var2, int var3) {
      this.public_();
      return new rU_2((Integer)this.break_[0] + var1, (Integer)this.break_[1] + var2, (Integer)this.break_[2] + var3);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, 44, -61, 54, -66, -13, 69, -97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static long class_(rU_2 var0) {
      return byte_((Integer)var0.break_[0], (Integer)var0.break_[1], (Integer)var0.break_[2]);
   }

   public static rU_2 class_(rfH_2 var0) {
      return var0 == null ? null : new rU_2(var0);
   }

   public rU_2 class_() {
      this.public_();
      return new rU_2((Integer)this.break_[0], (Integer)this.break_[1] + 1, (Integer)this.break_[2]);
   }

   public rU_2 break_(double var1, double var3, double var5) {
      return var1 == 0.0 && var3 == 0.0 && var5 == 0.0 ? this : new rU_2((double)this.b_() + var1, (double)this.c_() + var3, (double)this.d_() + var5);
   }

   public rU_2 throws_() {
      this.public_();
      return new rU_2((Integer)this.break_[0] + 1, (Integer)this.break_[1], (Integer)this.break_[2]);
   }

   public rU_2 throws_(int var1) {
      this.public_();
      return var1 == 0 ? this : new rU_2((Integer)this.break_[0] - var1, (Integer)this.break_[1], (Integer)this.break_[2]);
   }

   public rU_2 finally_(int var1) {
      this.public_();
      return var1 == 0 ? this : new rU_2((Integer)this.break_[0], (Integer)this.break_[1], (Integer)this.break_[2] - var1);
   }

   public rU_2 finally_() {
      this.public_();
      return new rU_2((Integer)this.break_[0], (Integer)this.break_[1], (Integer)this.break_[2] - 1);
   }

   public rU_2 extends_(int var1) {
      this.public_();
      return var1 == 0 ? this : new rU_2((Integer)this.break_[0] + var1, (Integer)this.break_[1], (Integer)this.break_[2]);
   }

   private static void goto_() {
      extends_ = new byte[]{3, 2, 3, 2};
   }

   private static long case_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3299006487926128404L;
   }

   public rU_2 case_() {
      this.public_();
      return new rU_2((Integer)this.break_[0], (Integer)this.break_[1] - 1, (Integer)this.break_[2]);
   }

   private static void continue_() {
      implements_ = new short[]{
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

   private static int package_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 158272185;
   }

   private static void return_() {
      finally_ = new String[]{new String("X: %s, Y: %s, Z: %s")};
   }

   private static void super_() {
      Object[] var0 = new Object[]{new rU_2(0, 0, 0)};
      class_ = var0;
   }

   private static void try_() {
      private_ = new boolean[]{
         false, true, false, true, false, true, true, true, true, true, true, false, true, false, false, false, false, false, false, true, false, false, true
      };
   }

   private static void while_() {
      native_ = new long[]{3241L, 3457689L, 8734625L, 2873465L};
   }

   private void public_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   public rU_2 protected_(int var1) {
      this.public_();
      return var1 == 0 ? this : new rU_2((Integer)this.break_[0], (Integer)this.break_[1] - var1, (Integer)this.break_[2]);
   }

   public rU_2 final_(int var1) {
      this.public_();
      return var1 == 0 ? this : new rU_2((Integer)this.break_[0], (Integer)this.break_[1] + var1, (Integer)this.break_[2]);
   }

   public rU_2 volatile_() {
      this.public_();
      return new rU_2((Integer)this.break_[0], (Integer)this.break_[1], (Integer)this.break_[2] + 1);
   }

   private static void synchronized_() {
      catch_ = new double[3];
   }

   public rU_2 native_() {
      this.public_();
      return new rU_2((Integer)this.break_[0] - 1, (Integer)this.break_[1], (Integer)this.break_[2]);
   }
}
