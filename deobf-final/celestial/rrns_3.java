package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrns_3 extends Om_1 {
   private static float[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static byte[] protected_;
   private static boolean[] throws_;
   private static short[] case_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 511789574;
   }

   public rrns_3() {
      this.final_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8309499739747166358L;
   }

   public static rrns_3 class_(Fu_1<?> var0, List<rJY> var1, String var2, float var3, float var4, int var5, int var6) {
      ((rrns_3)break_[0]).class_[0] = var0;
      ((rrns_3)break_[0]).class_[1] = var1;
      ((rrns_3)break_[0]).class_[2] = var2;
      rrns_3 var10000 = (rrns_3)break_[0];
      Float var14 = var3;
      var10000.class_[3] = var14;
      var10000 = (rrns_3)break_[0];
      Float var15 = var4;
      var10000.class_[4] = var15;
      var10000 = (rrns_3)break_[0];
      Integer var16 = var5;
      var10000.class_[5] = var16;
      var10000 = (rrns_3)break_[0];
      Integer var17 = var6;
      var10000.class_[6] = var17;
      ((rrns_3)break_[0]).class_(false);
      return (rrns_3)break_[0];
   }

   public void class_(int var1) {
      this.final_();
      Integer var6 = var1;
      this.class_[6] = var6;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-4, 97, 4, 7, -58, 60, 83, -83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Fu_1<?> class_() {
      this.final_();
      return (Fu_1<?>)this.class_[0];
   }

   public void class_(List<rJY> var1) {
      this.final_();
      this.class_[1] = var1;
   }

   public void break_(int var1) {
      this.final_();
      Integer var6 = var1;
      this.class_[5] = var6;
   }

   public float break_() {
      this.final_();
      return (Float)this.class_[3];
   }

   public List<rJY> throws_() {
      this.final_();
      return (List<rJY>)this.class_[1];
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new rrns_3()};
      break_ = var0;
   }

   public float catch_() {
      this.final_();
      return (Float)this.class_[4];
   }

   private static void extends_() {
      throws_ = new boolean[]{false, false, false, false, true};
   }

   public String case_() {
      this.final_();
      return (String)this.class_[2];
   }

   private static void implements_() {
      case_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 0, 0, 1, 2, 3, 4, 5, 6, 1, 5, 6};
   }

   public int protected_() {
      this.final_();
      return (Integer)this.class_[5];
   }

   public int private_() {
      this.final_();
      return (Integer)this.class_[6];
   }

   private void final_() {
      if (this.class_ == null) {
         this.class_ = new Object[7];
         Object[] var1 = this.class_;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
         var1[5] = 0;
         var1[6] = 0;
      }
   }

   private static void volatile_() {
      byte_ = new float[2];
   }

   private static void native_() {
      protected_ = new byte[]{7, 3, 4, 5, 6};
   }
}
