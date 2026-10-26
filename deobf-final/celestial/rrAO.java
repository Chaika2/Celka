package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAO extends Om_1 {
   private static double[] byte_;
   private static boolean[] protected_;
   public static Object[] class_;
   private static byte[] throws_;
   private static short[] case_;
   private static float[] catch_;
   public Object[] break_;

   public void byte_(boolean var1) {
      this.package_();
      Boolean var6 = var1;
      this.break_[1] = var6;
   }

   private static void int_() {
      byte_ = new double[1];
   }

   public rrAO() {
      this.package_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 134561779;
   }

   public void class_(float var1) {
      this.package_();
      Float var6 = var1;
      this.break_[5] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4806048170652259312L;
   }

   public boolean class_() {
      this.package_();
      return (Boolean)this.break_[1];
   }

   public static rrAO class_(boolean var0, boolean var1, boolean var2, boolean var3, float var4, float var5, boolean var6, boolean var7, double var8) {
      rrAO var10 = break_(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var10);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var10);
      return var10;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{32, -5, -110, 119, -80, -10, -54, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(double var1) {
      this.package_();
      Double var7 = var1;
      this.break_[8] = var7;
   }

   public void break_(float var1) {
      this.package_();
      Float var6 = var1;
      this.break_[4] = var6;
   }

   private static rrAO break_(boolean var0, boolean var1, boolean var2, boolean var3, float var4, float var5, boolean var6, boolean var7, double var8) {
      rrAO var10000 = (rrAO)class_[0];
      Boolean var14 = var0;
      var10000.break_[0] = var14;
      var10000 = (rrAO)class_[0];
      Boolean var15 = var1;
      var10000.break_[1] = var15;
      var10000 = (rrAO)class_[0];
      Boolean var16 = var2;
      var10000.break_[2] = var16;
      var10000 = (rrAO)class_[0];
      Boolean var17 = var3;
      var10000.break_[3] = var17;
      var10000 = (rrAO)class_[0];
      Float var18 = var4;
      var10000.break_[4] = var18;
      var10000 = (rrAO)class_[0];
      Float var19 = var5;
      var10000.break_[5] = var19;
      var10000 = (rrAO)class_[0];
      Boolean var20 = var6;
      var10000.break_[6] = var20;
      var10000 = (rrAO)class_[0];
      Boolean var21 = var7;
      var10000.break_[7] = var21;
      var10000 = (rrAO)class_[0];
      Double var22 = var8;
      var10000.break_[8] = var22;
      ((rrAO)class_[0]).class_(false);
      return (rrAO)class_[0];
   }

   public boolean break_() {
      this.package_();
      return (Boolean)this.break_[6];
   }

   public void break_(boolean var1) {
      this.package_();
      Boolean var6 = var1;
      this.break_[6] = var6;
   }

   public float throws_() {
      this.package_();
      return (Float)this.break_[5];
   }

   public void throws_(boolean var1) {
      this.package_();
      Boolean var6 = var1;
      this.break_[3] = var6;
   }

   public boolean finally_() {
      this.package_();
      return (Boolean)this.break_[3];
   }

   public void catch_(boolean var1) {
      this.package_();
      Boolean var6 = var1;
      this.break_[7] = var6;
   }

   public float catch_() {
      this.package_();
      return (Float)this.break_[4];
   }

   public boolean extends_() {
      this.package_();
      return (Boolean)this.break_[0];
   }

   public double case_() {
      this.package_();
      return (Double)this.break_[8];
   }

   public void case_(boolean var1) {
      this.package_();
      Boolean var6 = var1;
      this.break_[2] = var6;
   }

   private static void continue_() {
      case_ = new short[]{
         0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 0, 0, 0, 0, 1, 2, 3, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 1, 2, 3, 4, 5, 6, 7, 8
      };
   }

   public boolean implements_() {
      this.package_();
      return (Boolean)this.break_[7];
   }

   private static void new_() {
      throws_ = new byte[]{9, 2, 3, 4, 5, 6, 7, 8};
   }

   private void package_() {
      if (this.break_ == null) {
         this.break_ = new Object[9];
         Object[] var1 = this.break_;
         var1[0] = false;
         var1[1] = false;
         var1[2] = false;
         var1[3] = false;
         var1[4] = 0.0F;
         var1[5] = 0.0F;
         var1[6] = false;
         var1[7] = false;
         var1[8] = 0.0;
      }
   }

   public void protected_(boolean var1) {
      this.package_();
      Boolean var6 = var1;
      this.break_[0] = var6;
   }

   public boolean protected_() {
      this.package_();
      return (Boolean)this.break_[2];
   }

   public boolean private_() {
      this.package_();
      return !this.break_[0] && !this.break_[1] && !this.break_[2] && !this.break_[3] && !this.break_[6] && !this.break_[7] ? protected_[2] : protected_[1];
   }

   private static void final_() {
      protected_ = new boolean[]{false, true, false, false, false, false, true, false, false, false, false, false, true};
   }

   private static void volatile_() {
      catch_ = new float[2];
   }

   private static void native_() {
      Object[] var0 = new Object[]{new rrAO()};
      class_ = var0;
   }
}
