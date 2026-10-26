package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class br_3 extends bq_3 implements rA_2 {
   private static short[] catch_;
   private static boolean[] private_;
   private static byte[] implements_;
   private static String[] finally_;
   public Object[] break_;
   private static float[] extends_;
   private static double[] native_;
   public static Object[] throws_;

   @Override
   public boolean byte_() {
      this.volatile_();
      return !this.break_[0] || (Supplier)this.break_[1] != null && !((Supplier)this.break_[1]).get() ? private_[3] : private_[2];
   }

   private static void int_() {
      implements_ = new byte[]{9, 7, 8, 2};
   }

   public br_3(C_class var1) {
      super(var1);
      this.volatile_();
      Boolean var6 = true;
      this.break_[8] = var6;
      bB_2 var7 = new bB_2();
      this.break_[5] = var7;
      bP_2 var8 = new bP_2(this, var1);
      this.break_[2] = var8;
      bM_2 var10000 = (bM_2)this.break_[2];
      bS_2 var9;
      bS_2 var10001 = var9 = new bS_2(var1, (bM_2)this.break_[2]);
      this.break_[3] = var9;
      var10000.class_(var10001);
      var10000 = (bM_2)this.break_[2];
      bG_2 var10;
      bG_2 var12 = var10 = new bG_2(var1, (bM_2)this.break_[2]);
      this.break_[4] = var10;
      var10000.class_(var12);
   }

   static {
      ntfClinit();
   }

   @Override
   public String class_() {
      return "Auto Tunneling";
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      this.volatile_();
      ((bB_2)this.break_[5]).class_(((Ps_1)this.case_[1]).catch_().Ps());
      if (((bB_2)this.break_[5]).class_() >= 15.0F) {
         Boolean var9 = true;
         this.break_[7] = var9;
      }

      Ps_1 var3 = ((C_class)this.case_[0]).throw_();
      Br_1 var4 = ((C_class)this.case_[0]).private_();
      if ((Boolean)this.break_[7]) {
         this.class_(var3, var4);
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
      } else {
         this.class_(var3);
         return new rn_3((rO_2)this.break_[6], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[0]);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 963514663;
   }

   private void class_(Ps_1 var1) {
      rYB var2 = var1.case_();
      cb_3 var3 = var1.catch_();
      roE_2 var4 = var2.instanceof_();
      if (var4.class_(var3) <= 2.0) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().static_().new_();
         this.private_();
      }
   }

   @Override
   public void class_(Supplier<Boolean> var1, Map<bE_2, rrIk_1> var2) {
      this.volatile_();
      Boolean var7 = true;
      this.break_[0] = var7;
      this.break_[1] = var1;
      rO_2 var9 = new rO_2(((Ps_1)this.case_[1]).volatile_(), ((Ps_1)this.case_[1]).catch_().Pg());
      this.break_[6] = var9;
      ((bM_2)this.break_[2]).protected_();
      ((bS_2)this.break_[3]).class_(true);
      ((bG_2)this.break_[4]).class_(true);
      ((bS_2)this.break_[3]).class_(var2);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{79, -47, -25, -118, 0, 74, -107, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8997363086083576378L;
   }

   private void class_(Ps_1 var1, Br_1 var2) {
      this.volatile_();
      PX var3 = var2.protected_().orElse(var1.protected_());
      if ((Boolean)this.break_[8]) {
         var2.class_(var3.case_(var3.protected_() - 50.0F), false);
         if (var3.protected_() <= -90.0F) {
            Boolean var8 = false;
            this.break_[8] = var8;
         }
      } else {
         var2.class_(var3.case_(var3.protected_() + 50.0F), false);
         if (var3.protected_() >= 90.0F) {
            ((bB_2)this.break_[5]).byte_();
            Boolean var9 = true;
            this.break_[8] = var9;
            Boolean var10 = false;
            this.break_[7] = var10;
         }
      }
   }

   private static void finally_() {
      private_ = new boolean[]{true, true, true, false, true, true, true, false, false, false, false, true, false, false, false, false, false, false, true};
   }

   private static void extends_() {
      finally_ = new String[]{new String("Auto Tunneling")};
   }

   private static void implements_() {
      catch_ = new short[]{8, 5, 2, 2, 2, 3, 2, 2, 4, 5, 1, 5, 7, 0, 0, 7, 1, 6, 0, 0, 1, 1, 0, 1, 1, 1, 6, 2, 3, 4, 3, 0, 0, 2, 5, 0, 8, 8, 5, 8, 7, 2, 2};
   }

   private static void package_() {
      extends_ = new float[]{15.0F, 50.0F, -90.0F, 50.0F, 90.0F, 15.0F, 50.0F};
   }

   @Override
   public void protected_() {
      this.volatile_();
      super.protected_();
      if ((Boolean)this.break_[0]) {
         Boolean var5 = false;
         this.break_[0] = var5;
         ((bM_2)this.break_[2]).catch_();
         ((bB_2)this.break_[5]).byte_();
      }
   }

   public void private_() {
      this.volatile_();
      this.protected_();
      ((bM_2)this.break_[2]).class_();
      ((bM_2)this.break_[2]).byte_();
   }

   private static void final_() {
      native_ = new double[]{2.0};
   }

   private void volatile_() {
      if (this.break_ == null) {
         this.break_ = new Object[9];
         Object[] var1 = this.break_;
         var1[0] = false;
         var1[7] = false;
         var1[8] = false;
      }
   }

   private static void native_() {
      Object[] var0 = new Object[]{0.0F, 0.0F};
      throws_ = var0;
   }
}
