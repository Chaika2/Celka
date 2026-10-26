package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAB extends Om_1 {
   private static boolean[] byte_;
   private static byte[] protected_;
   private static short[] throws_;
   public Object[] class_;
   public static Object[] break_;
   private static float[] case_;

   public void byte_(float var1) {
      this.extends_();
      Float var6 = var1;
      this.class_[3] = var6;
   }

   public rrAB() {
      this.extends_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2844221065803574656L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, -37, -103, 72, -27, -113, 6, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int class_() {
      this.extends_();
      return (Integer)this.class_[5];
   }

   public void class_(rdn_3 var1) {
      this.extends_();
      this.class_[0] = var1;
   }

   public void class_(float var1) {
      this.extends_();
      Float var6 = var1;
      this.class_[4] = var6;
   }

   public boolean class_(rdb_3 var1) {
      this.extends_();
      return ((rdn_3)this.class_[1]).break_() != var1 && ((rdn_3)this.class_[0]).break_() != var1 ? byte_[2] : byte_[1];
   }

   public void class_(int var1) {
      this.extends_();
      Integer var6 = var1;
      this.class_[5] = var6;
   }

   public static rrAB class_(rdn_3 var0, rdn_3 var1, rpm_3 var2, int var3, float var4, float var5) {
      ((rrAB)break_[0]).class_[1] = var0;
      ((rrAB)break_[0]).class_[0] = var1;
      ((rrAB)break_[0]).class_[2] = var2;
      rrAB var10000 = (rrAB)break_[0];
      Integer var13 = var3;
      var10000.class_[5] = var13;
      var10000 = (rrAB)break_[0];
      Float var14 = var4;
      var10000.class_[3] = var14;
      var10000 = (rrAB)break_[0];
      Float var15 = var5;
      var10000.class_[4] = var15;
      ((rrAB)break_[0]).class_(false);
      return (rrAB)break_[0];
   }

   public void class_(rpm_3 var1) {
      this.extends_();
      this.class_[2] = var1;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -389387108;
   }

   public void break_(rdn_3 var1) {
      this.extends_();
      this.class_[1] = var1;
   }

   public void break_(float var1) {
      this.extends_();
      Float var6 = var1;
      this.class_[3] = var6;
      Float var7 = var1;
      this.class_[4] = var7;
   }

   public float break_() {
      this.extends_();
      return (Float)this.class_[4];
   }

   public rpm_3 throws_() {
      this.extends_();
      return (rpm_3)this.class_[2];
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new rrAB()};
      break_ = var0;
   }

   public rdn_3 catch_() {
      this.extends_();
      return (rdn_3)this.class_[1];
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
         var1[5] = 0;
      }
   }

   public float case_() {
      this.extends_();
      return (Float)this.class_[3];
   }

   private static void implements_() {
      protected_ = new byte[]{6, 3, 4, 5};
   }

   public rdn_3 protected_() {
      this.extends_();
      return (rdn_3)this.class_[0];
   }

   private static void private_() {
      byte_ = new boolean[]{false, true, false, false, false, true};
   }

   private static void volatile_() {
      throws_ = new short[]{0, 1, 0, 0, 0, 2, 0, 5, 0, 3, 0, 4, 0, 0, 3, 4, 1, 0, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5};
   }

   private static void native_() {
      case_ = new float[2];
   }
}
