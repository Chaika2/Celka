package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrTB {
   private static byte[] break_;
   public Object[] class_;
   private static float[] byte_;
   private static short[] protected_;
   private static String[] throws_;
   private static boolean[] case_;

   public float byte_() {
      return (Float)this.class_[5];
   }

   public rrTB(rrTS var1, String var2, rrTE[] var3) {
      this.finally_();
      String var8 = "";
      this.class_[3] = var8;
      this.class_[1] = var1;
      this.class_[2] = var2;
      this.class_[0] = var3;
   }

   static {
      ntfClinit();
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.class_[5] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5463614634277186153L;
   }

   public void class_(int var1) {
      Integer var6 = var1;
      this.class_[6] = var6;
   }

   public rrTS class_() {
      return (rrTS)this.class_[1];
   }

   public void class_(LocalDateTime var1) {
      this.class_[4] = var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{101, 127, -48, 114, -100, 14, -86, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 357133775;
   }

   public void break_(String var1) {
      this.class_[3] = var1;
   }

   public int break_() {
      return (Integer)this.class_[6];
   }

   public String throws_() {
      return (String)this.class_[2];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[7];
         this.class_[5] = 0.0F;
         this.class_[6] = 0;
      }
   }

   public rrTE[] catch_() {
      return (rrTE[])this.class_[0];
   }

   private static void extends_() {
      protected_ = new short[]{3, 1, 2, 0, 0, 1, 2, 3, 4, 5, 6, 3, 4, 5, 6};
   }

   public String case_() {
      return (String)this.class_[3];
   }

   private static void implements_() {
      case_ = new boolean[1];
   }

   public LocalDateTime protected_() {
      return (LocalDateTime)this.class_[4];
   }

   private static void private_() {
      byte_ = new float[1];
   }

   private static void volatile_() {
      break_ = new byte[]{7, 5, 6};
   }

   private static void native_() {
      throws_ = new String[]{new String("")};
   }
}
