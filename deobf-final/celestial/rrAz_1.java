package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAz_1 {
   private static byte[] byte_;
   public static Object[] class_;
   private static boolean[] protected_;
   private static float[] throws_;
   private static double[] case_;
   private static short[] catch_;
   public Object[] break_;

   public boolean byte_() {
      return (Boolean)this.break_[7];
   }

   private static void int_() {
      case_ = new double[2];
   }

   public rrAz_1() {
      this.package_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1899598388127777641L;
   }

   public static void class_(rrAz_1 var0) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var0);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1748699761;
   }

   public void class_(rfl_3 var1) {
      this.break_[3] = var1;
   }

   public static rrAz_1 class_(rjG_2 var0, double var1, double var3, rjU_2 var5, rfl_3 var6, PX var7, boolean var8, float var9) {
      ((rrAz_1)class_[0]).break_[0] = var0;
      rrAz_1 var10000 = (rrAz_1)class_[0];
      Double var15 = var1;
      var10000.break_[5] = var15;
      var10000 = (rrAz_1)class_[0];
      Double var16 = var3;
      var10000.break_[6] = var16;
      ((rrAz_1)class_[0]).break_[2] = var5;
      ((rrAz_1)class_[0]).break_[3] = var6;
      ((rrAz_1)class_[0]).break_[4] = var7;
      var10000 = (rrAz_1)class_[0];
      Boolean var20 = var8;
      var10000.break_[7] = var20;
      var10000 = (rrAz_1)class_[0];
      Float var21 = var9;
      var10000.break_[8] = var21;
      return (rrAz_1)class_[0];
   }

   public void class_(rjG_2 var1) {
      this.break_[0] = var1;
   }

   public void class_(rjU_2 var1) {
      this.break_[2] = var1;
   }

   public void class_(PX var1) {
      this.break_[4] = var1;
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.break_[7] = var6;
   }

   public void class_(rfo_3 var1) {
      this.break_[1] = var1;
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.break_[8] = var6;
   }

   public rfo_3 class_() {
      return (rfo_3)this.break_[1];
   }

   public void class_(double var1) {
      Double var7 = var1;
      this.break_[6] = var7;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, -46, -38, -120, 82, 37, -37, -83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_(double var1) {
      Double var7 = var1;
      this.break_[5] = var7;
   }

   public rjG_2 break_() {
      return (rjG_2)this.break_[0];
   }

   public rjU_2 throws_() {
      return (rjU_2)this.break_[2];
   }

   private static void finally_() {
      catch_ = new short[]{0, 0, 0, 5, 0, 6, 0, 2, 0, 3, 0, 4, 0, 7, 0, 8, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 1, 2, 3, 5, 6, 7, 8, 4};
   }

   public PX catch_() {
      return (PX)this.break_[4];
   }

   private static void extends_() {
      byte_ = new byte[]{9, 5, 6, 7, 8};
   }

   public float case_() {
      return (Float)this.break_[8];
   }

   public rfl_3 implements_() {
      return (rfl_3)this.break_[3];
   }

   private void package_() {
      if (this.break_ == null) {
         this.break_ = new Object[9];
         Object[] var1 = this.break_;
         var1[5] = 0.0;
         var1[6] = 0.0;
         var1[7] = false;
         var1[8] = 0.0F;
      }
   }

   public double protected_() {
      return (Double)this.break_[6];
   }

   public double private_() {
      return (Double)this.break_[5];
   }

   private static void final_() {
      protected_ = new boolean[]{false, false, true};
   }

   private static void volatile_() {
      throws_ = new float[1];
   }

   private static void native_() {
      Object[] var0 = new Object[]{new rrAz_1()};
      class_ = var0;
   }
}
