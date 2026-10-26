package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mx_1 extends MM {
   private static String[] protected_;
   private static double[] throws_;
   public Object[] break_;
   private static int[] case_;
   private static byte[] catch_;
   private static short[] private_;
   private static boolean[] implements_;

   private void int_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   public Mx_1(rcd_3 var1, boolean var2) {
      this.int_();
      this.break_[1] = var1;
      rja_3 var8 = new rja_3(this.protected_("x"), this.protected_("y"), this.protected_("z"));
      this.break_[0] = var8;
      Integer var9 = Math.abs(((rcd_3)this.break_[1]).int_("Metadata").int_("EnclosingSize").private_("y"));
      this.class_[1] = var9;
      if (var2) {
         Integer var10 = Math.abs(((rcd_3)this.break_[1]).int_("Metadata").int_("EnclosingSize").private_("z"));
         this.class_[0] = var10;
         Integer var11 = Math.abs(((rcd_3)this.break_[1]).int_("Metadata").int_("EnclosingSize").private_("x"));
         this.class_[2] = var11;
      } else {
         Integer var12 = Math.abs(((rcd_3)this.break_[1]).int_("Metadata").int_("EnclosingSize").private_("x"));
         this.class_[0] = var12;
         Integer var13 = Math.abs(((rcd_3)this.break_[1]).int_("Metadata").int_("EnclosingSize").private_("z"));
         this.class_[2] = var13;
      }

      xc_3[][][] var14 = new xc_3[this.class_[0]][this.class_[2]][this.class_[1]];
      this.byte_[0] = var14;
      this.implements_();
   }

   static {
      ntfClinit();
   }

   private static <T extends Comparable<T>> xc_3 class_(xc_3 var0, rCZ<T> var1, String var2) {
      Optional var3 = var1.break_(var2);
      if (var3.isPresent()) {
         return var0.class_(var1, (Comparable)var3.get());
      } else {
         throw new IllegalArgumentException("Invalid value for property " + var1);
      }
   }

   private static xc_3 class_(xd_3 var0, rcd_3 var1) {
      xc_3 var2 = var0.continue_();

      for (Object var6 : var1.protected_().toArray()) {
         rCZ var7 = var0.new_().class_((String)var6);
         String var8 = var1.native_((String)var6);
         if (var7 != null) {
            var2 = class_(var2, var7, var8);
         }
      }

      return var2;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7200999688664337847L;
   }

   private static int class_(rcd_3 var0, String var1, String var2) {
      int var3 = var0.int_("Regions").int_(var1).int_("Position").private_(var2);
      int var4 = var0.int_("Regions").int_(var1).int_("Size").private_(var2);
      if (var4 < 0) {
         var4++;
      }

      return Math.min(var3, var3 + var4);
   }

   private static boolean class_(rcd_3 var0, String var1, int var2, int var3, int var4) {
      return var2 >= 0
            && var3 >= 0
            && var4 >= 0
            && var2 < Math.abs(var0.int_("Regions").int_(var1).int_("Size").private_("x"))
            && var3 < Math.abs(var0.int_("Regions").int_(var1).int_("Size").private_("y"))
            && var4 < Math.abs(var0.int_("Regions").int_(var1).int_("Size").private_("z"))
         ? true
         : implements_[4];
   }

   private static xc_3[] class_(rcy_3 var0) {
      xc_3[] var1 = new xc_3[var0.size()];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         xd_3 var3 = rVL.strictfp_.class_(new rqO_2(((rcd_3)var0.finally_(var2)).native_("Name")));
         rcd_3 var4 = ((rcd_3)var0.finally_(var2)).int_("Properties");
         var1[var2] = class_(var3, var4);
      }

      return var1;
   }

   private static String[] class_(rcd_3 var0) {
      return var0.int_("Regions").protected_().toArray(new String[0]);
   }

   public Mx_1 class_(boolean var1) {
      this.int_();
      return new Mx_1((rcd_3)this.break_[1], var1);
   }

   private static long[] class_(rcd_3 var0, String var1) {
      return var0.int_("Regions").int_(var1).package_("BlockStates");
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 62648604;
   }

   private void class_(rcd_3 var1, String var2, xc_3[] var3, Md_1 var4) {
      this.int_();
      rja_3 var5 = new rja_3(class_(var1, var2, "x"), class_(var1, var2, "y"), class_(var1, var2, "z"));
      int var6 = 0;

      for (int var7 = 0; var7 < this.class_[1]; var7++) {
         for (int var8 = 0; var8 < this.class_[2]; var8++) {
            for (int var9 = 0; var9 < this.class_[0]; var9++) {
               if (class_(var1, var2, var9, var7, var8)) {
                  ((xc_3[][][])this.byte_[0])[var9 - (((rja_3)this.break_[0]).b_() - var5.b_())][var8 - (((rja_3)this.break_[0]).d_() - var5.d_())][var7
                     - (((rja_3)this.break_[0]).c_() - var5.c_())] = var3[var4.class_((long)var6)];
                  var6++;
               }
            }
         }
      }
   }

   private static int break_(int var0) {
      return (int)Math.max(2.0, Math.ceil(Math.log((double)var0) / Math.log(2.0)));
   }

   public void break_(int var1, int var2, int var3, xc_3 var4) {
      ((xc_3[][][])this.byte_[0])[var1][var3][var2] = var4;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, -103, -11, 88, 40, 108, 90, -8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long break_(rcd_3 var0, String var1) {
      return (long)Math.abs(
         var0.int_("Regions").int_(var1).int_("Size").private_("x")
            * var0.int_("Regions").int_(var1).int_("Size").private_("y")
            * var0.int_("Regions").int_(var1).int_("Size").private_("z")
      );
   }

   public int throws_() {
      return (Integer)this.class_[0];
   }

   private static void finally_() {
      throws_ = new double[]{2.0, 2.0};
   }

   public int catch_() {
      return (Integer)this.class_[2];
   }

   private static void extends_() {
      case_ = new int[]{Integer.MAX_VALUE};
   }

   public rja_3 case_() {
      this.int_();
      return (rja_3)this.break_[0];
   }

   private void implements_() {
      this.int_();

      for (String var4 : class_((rcd_3)this.break_[1])) {
         rcy_3 var5 = ((rcd_3)this.break_[1]).int_("Regions").int_(var4).protected_("BlockStatePalette", 10);
         xc_3[] var6 = class_(var5);
         int var7 = break_(var5.size());
         long var8 = break_((rcd_3)this.break_[1], var4);
         long[] var10 = class_((rcd_3)this.break_[1], var4);
         Md_1 var11 = new Md_1(var7, var8, var10);
         this.class_((rcd_3)this.break_[1], var4, var6, var11);
      }
   }

   private static void package_() {
      private_ = new short[]{1, 0, 1, 1, 1, 0, 1, 2, 1, 0, 1, 2, 0, 2, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 1};
   }

   private int protected_(String var1) {
      this.int_();
      int var2 = Integer.MAX_VALUE;

      for (String var6 : class_((rcd_3)this.break_[1])) {
         var2 = Math.min(var2, class_((rcd_3)this.break_[1], var6, var1));
      }

      return var2;
   }

   public int private_() {
      return (Integer)this.class_[1];
   }

   private static void final_() {
      implements_ = new boolean[]{false, false, false, true, false, false, false, false, false, false, false};
   }

   private static void volatile_() {
      protected_ = new String[]{
         new String("x"),
         new String("y"),
         new String("z"),
         new String("Metadata"),
         new String("EnclosingSize"),
         new String("y"),
         new String("Metadata"),
         new String("EnclosingSize"),
         new String("z"),
         new String("Metadata"),
         new String("EnclosingSize"),
         new String("x"),
         new String("Metadata"),
         new String("EnclosingSize"),
         new String("x"),
         new String("Metadata"),
         new String("EnclosingSize"),
         new String("z"),
         new String("Regions"),
         new String("Regions"),
         new String("Position"),
         new String("Regions"),
         new String("Size"),
         new String("Name"),
         new String("Properties"),
         new String("Regions"),
         new String("Size"),
         new String("x"),
         new String("Regions"),
         new String("Size"),
         new String("y"),
         new String("Regions"),
         new String("Size"),
         new String("z"),
         new String("Regions"),
         new String("BlockStates"),
         new String("Regions"),
         new String("Size"),
         new String("x"),
         new String("Regions"),
         new String("Size"),
         new String("y"),
         new String("Regions"),
         new String("Size"),
         new String("z"),
         new String("Regions"),
         new String("BlockStatePalette"),
         new String("x"),
         new String("y"),
         new String("z")
      };
   }

   private static void native_() {
      catch_ = new byte[]{10, 2};
   }
}
