package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAl_1 extends Om_1 {
   private static String[] byte_;
   private static float[] protected_;
   public static Object[] class_;
   private static double[] throws_;
   private static boolean[] case_;
   private static byte[] catch_;
   private static short[] private_;
   public Object[] break_;

   public void byte_(boolean var1) {
      this.final_();
      Boolean var6 = var1;
      this.break_[7] = var6;
   }

   public void byte_(double var1) {
      this.final_();
      Double var7 = var1;
      this.break_[0] = var7;
   }

   private static void int_() {
      Object[] var0 = new Object[]{new rrAl_1()};
      class_ = var0;
   }

   public rrAl_1() {
      this.final_();
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      byte_ = new String[]{new String("Был отключен из-за флага!")};
   }

   public float class_() {
      this.final_();
      double var1 = Math.pow((Double)this.break_[0] - (Double)this.break_[3], 2.0);
      double var3 = Math.pow((Double)this.break_[1] - (Double)this.break_[4], 2.0);
      double var5 = Math.pow((Double)this.break_[2] - (Double)this.break_[5], 2.0);
      return rfU_2.class_(var1 + var3 + var5);
   }

   public static rrAl_1 class_(double var0, double var2, double var4, double var6, double var8, double var10, int var12, boolean var13, boolean var14) {
      rrAl_1 var10000 = (rrAl_1)class_[0];
      Double var19 = var0;
      var10000.break_[0] = var19;
      var10000 = (rrAl_1)class_[0];
      Double var20 = var2;
      var10000.break_[1] = var20;
      var10000 = (rrAl_1)class_[0];
      Double var21 = var4;
      var10000.break_[2] = var21;
      var10000 = (rrAl_1)class_[0];
      Double var22 = var6;
      var10000.break_[3] = var22;
      var10000 = (rrAl_1)class_[0];
      Double var23 = var8;
      var10000.break_[4] = var23;
      var10000 = (rrAl_1)class_[0];
      Double var24 = var10;
      var10000.break_[5] = var24;
      var10000 = (rrAl_1)class_[0];
      Integer var25 = var12;
      var10000.break_[6] = var25;
      var10000 = (rrAl_1)class_[0];
      Boolean var26 = var13;
      var10000.break_[7] = var26;
      var10000 = (rrAl_1)class_[0];
      Boolean var27 = var14;
      var10000.break_[8] = var27;
      ((rrAl_1)class_[0]).class_(false);
      return (rrAl_1)class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, 54, 13, 56, 106, 107, 47, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(double var1) {
      this.final_();
      Double var7 = var1;
      this.break_[3] = var7;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2825966880584819239L;
   }

   public void class_(int var1) {
      this.final_();
      Integer var6 = var1;
      this.break_[6] = var6;
   }

   public void break_(boolean var1) {
      this.final_();
      Boolean var6 = var1;
      this.break_[8] = var6;
   }

   public void break_(double var1) {
      this.final_();
      Double var7 = var1;
      this.break_[1] = var7;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1961356492;
   }

   public double break_() {
      this.final_();
      return (Double)this.break_[0];
   }

   public void throws_(double var1) {
      this.final_();
      Double var7 = var1;
      this.break_[4] = var7;
   }

   public double throws_() {
      this.final_();
      return (Double)this.break_[3];
   }

   public int finally_() {
      this.final_();
      return (Integer)this.break_[6];
   }

   public double catch_() {
      this.final_();
      return (Double)this.break_[2];
   }

   public double extends_() {
      this.final_();
      return (Double)this.break_[1];
   }

   public boolean case_() {
      this.final_();
      return (Boolean)this.break_[7];
   }

   public void case_(double var1) {
      this.final_();
      Double var7 = var1;
      this.break_[2] = var7;
   }

   private static void continue_() {
      protected_ = new float[]{10.0F};
   }

   public void implements_() {
      if (!(this.class_() > 10.0F)) {
         for (Module var2 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().g()) {
            if (var2 instanceof rrnZ_2) {
               rrnZ_2 var3 = (rrnZ_2)var2;
               if (var2.implements_() && var2.aJ_()) {
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(var2.final_(), "Был отключен из-за флага!", 1500));
                  var3.class_();
               }
            }
         }
      }
   }

   private static void new_() {
      catch_ = new byte[]{9, 2, 3, 4, 5, 6, 7, 8};
   }

   private static void package_() {
      case_ = new boolean[]{false, false, false, true, false, false, false, true};
   }

   private static void super_() {
      throws_ = new double[]{2.0, 2.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   }

   public double protected_() {
      this.final_();
      return (Double)this.break_[5];
   }

   public void protected_(double var1) {
      this.final_();
      Double var7 = var1;
      this.break_[5] = var7;
   }

   public double private_() {
      this.final_();
      return (Double)this.break_[4];
   }

   private void final_() {
      if (this.break_ == null) {
         this.break_ = new Object[9];
         Object[] var1 = this.break_;
         var1[0] = 0.0;
         var1[1] = 0.0;
         var1[2] = 0.0;
         var1[3] = 0.0;
         var1[4] = 0.0;
         var1[5] = 0.0;
         var1[6] = 0;
         var1[7] = false;
         var1[8] = false;
      }
   }

   private static void volatile_() {
      private_ = new short[]{
         0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 0, 0, 0, 1500, 0, 3, 1, 4, 2, 5, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 1, 2, 3, 4, 5, 6, 7, 8
      };
   }

   public boolean native_() {
      this.final_();
      return (Boolean)this.break_[8];
   }
}
