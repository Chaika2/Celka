package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAS extends Om_1 {
   private static float[] byte_;
   public Object[] class_;
   private static short[] protected_;
   public static Object[] break_;
   private static boolean[] throws_;
   private static byte[] case_;

   public rrAS() {
      this.finally_();
   }

   static {
      ntfClinit();
   }

   public void class_(float var1) {
      this.finally_();
      Float var6 = var1;
      this.class_[2] = var6;
   }

   public static rrAS class_(float var0, int var1, float var2) {
      rrAS var3 = break_(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var3);
      return var3;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4156794149661167508L;
   }

   public float class_() {
      this.finally_();
      return (Float)this.class_[2];
   }

   public void class_(int var1) {
      this.finally_();
      Integer var6 = var1;
      this.class_[1] = var6;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{8, -88, -23, 84, 88, -84, 3, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAS break_(float var0, int var1, float var2) {
      rrAS var10000 = (rrAS)break_[0];
      Float var7 = var0;
      var10000.class_[0] = var7;
      var10000 = (rrAS)break_[0];
      Integer var8 = var1;
      var10000.class_[1] = var8;
      var10000 = (rrAS)break_[0];
      Float var9 = var2;
      var10000.class_[2] = var9;
      ((rrAS)break_[0]).class_(false);
      return (rrAS)break_[0];
   }

   public int break_() {
      this.finally_();
      return (Integer)this.class_[1];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 237386252;
   }

   public void break_(float var1) {
      this.finally_();
      Float var6 = var1;
      this.class_[0] = var6;
   }

   private static void throws_() {
      byte_ = new float[2];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0.0F;
         var1[1] = 0;
         var1[2] = 0.0F;
      }
   }

   private static void catch_() {
      case_ = new byte[]{3, 2};
   }

   private static void case_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 1, 2, 0, 1, 2};
   }

   private static void implements_() {
      Object[] var0 = new Object[]{new rrAS()};
      break_ = var0;
   }

   public float protected_() {
      this.finally_();
      return (Float)this.class_[0];
   }

   private static void private_() {
      throws_ = new boolean[]{false, false, false, true, false, true};
   }
}
