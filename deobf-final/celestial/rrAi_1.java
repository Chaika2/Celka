package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAi_1 extends Om_1 {
   private static byte[] byte_;
   private static short[] protected_;
   public Object[] class_;
   private static boolean[] throws_;
   public static Object[] break_;
   private static float[] case_;

   public rrAi_1() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   public static rrAi_1 class_(Y var0, Ml_1 var1, rpm_3 var2, rpZ_2 var3, rdn_3 var4, float var5) {
      ((rrAi_1)break_[0]).class_[5] = var0;
      ((rrAi_1)break_[0]).class_[0] = var1;
      ((rrAi_1)break_[0]).class_[1] = var2;
      ((rrAi_1)break_[0]).class_[2] = var3;
      ((rrAi_1)break_[0]).class_[3] = var4;
      rrAi_1 var10000 = (rrAi_1)break_[0];
      Float var15 = var5;
      var10000.class_[4] = var15;
      ((rrAi_1)break_[0]).class_(false);
      return (rrAi_1)break_[0];
   }

   public void class_(rdn_3 var1) {
      this.private_();
      this.class_[3] = var1;
   }

   public void class_(rpZ_2 var1) {
      this.private_();
      this.class_[2] = var1;
   }

   public void class_(rpm_3 var1) {
      this.private_();
      this.class_[1] = var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, -65, 56, -111, 12, 18, 63, 104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(Ml_1 var1) {
      this.private_();
      this.class_[0] = var1;
   }

   public void class_(float var1) {
      this.private_();
      Float var6 = var1;
      this.class_[4] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -239997264344182719L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -172304177;
   }

   public void class_(Y var1) {
      this.private_();
      this.class_[5] = var1;
   }

   public rpZ_2 class_() {
      this.private_();
      return (rpZ_2)this.class_[2];
   }

   public Ml_1 break_() {
      this.private_();
      return (Ml_1)this.class_[0];
   }

   public Y throws_() {
      this.private_();
      return (Y)this.class_[5];
   }

   private static void finally_() {
      case_ = new float[1];
   }

   public float catch_() {
      this.private_();
      return (Float)this.class_[4];
   }

   private static void extends_() {
      byte_ = new byte[]{6, 4};
   }

   public rpm_3 case_() {
      this.private_();
      return (rpm_3)this.class_[1];
   }

   private static void implements_() {
      Object[] var0 = new Object[]{new rrAi_1()};
      break_ = var0;
   }

   public rdn_3 protected_() {
      this.private_();
      return (rdn_3)this.class_[3];
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[4] = 0.0F;
      }
   }

   private static void volatile_() {
      protected_ = new short[]{0, 5, 0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5};
   }

   private static void native_() {
      throws_ = new boolean[]{false, false, true};
   }
}
