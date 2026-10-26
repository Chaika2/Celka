package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GU extends bq_3 {
   private static short[] throws_;
   private static double[] catch_;
   private static boolean[] private_;
   public Object[] break_;
   private static String[] implements_;
   private static byte[] finally_;

   @Override
   public boolean byte_() {
      return ((Ps_1)this.case_[1]).catch_() != null && ((Ps_1)this.case_[1]).case_() != null ? private_[1] : private_[0];
   }

   private static void int_() {
      finally_ = new byte[]{3, 2};
   }

   public GU(C_class var1) {
      super(var1);
      this.final_();
   }

   static {
      ntfClinit();
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      this.final_();
      Boolean var7 = var2;
      this.break_[1] = var7;
      if ((Boolean)this.break_[0]) {
         Boolean var8 = false;
         this.break_[0] = var8;
         if (this.implements_()) {
            Integer var9 = (Integer)this.break_[2] + 1;
            this.break_[2] = var9;
         }

         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
      } else {
         Integer var10 = 0;
         this.break_[2] = var10;
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[5]);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-32, 95, 50, -75, 105, 10, 54, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1657275220;
   }

   @Override
   public String class_() {
      return "inventory pauser";
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2628449614538763159L;
   }

   private static void finally_() {
      implements_ = new String[]{new String("inventory pauser")};
   }

   @Override
   public boolean catch_() {
      return true;
   }

   private static void extends_() {
      private_ = new boolean[]{false, true, true, false, true, true, true, false, false, true, false, true, false, false, true, false, false};
   }

   @Override
   public double case_() {
      return 5.1;
   }

   private boolean implements_() {
      return this.native_() < 1.0E-5 ? true : private_[3];
   }

   private static void package_() {
      catch_ = new double[]{1.0E-5, 5.1};
   }

   public boolean private_() {
      this.final_();
      Boolean var5 = true;
      this.break_[0] = var5;
      return this.break_[1] && this.break_[2] > 1 ? true : private_[7];
   }

   private void final_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[0] = false;
         var1[1] = false;
         var1[2] = 0;
      }
   }

   private static void volatile_() {
      throws_ = new short[]{1, 1, 1, 0, 1, 2, 1, 0, 0, 2, 2, 1, 2, 5};
   }

   private double native_() {
      rjU_2 var1 = ((Ps_1)this.case_[1]).catch_().rv();
      return Math.sqrt(var1.break_ * var1.break_ + var1.protected_ * var1.protected_);
   }
}
