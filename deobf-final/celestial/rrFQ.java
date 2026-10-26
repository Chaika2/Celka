package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFQ implements rrFz_1 {
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static float[] throws_;
   public Object[] class_;

   @Override
   public boolean byte_() {
      return false;
   }

   private static void int_() {
      throws_ = new float[]{0.5F, 1.0F};
   }

   public rrFQ(rLY var1) {
      this.final_();
      AnimValue var6 = new AnimValue(0.5F, false);
      this.class_[3] = var6;
      this.class_[0] = var1;
      String var8 = this.extends_();
      this.class_[1] = var8;
      String var9 = this.native_();
      this.class_[2] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrFQ var2 = (rrFQ)var1;
         return Objects.equals(((rLY)this.class_[0]).class_(), ((rLY)var2.class_[0]).class_());
      } else {
         return protected_[7];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(((rLY)this.class_[0]).class_());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 684957092659849671L;
   }

   @Override
   public AnimValue class_() {
      return (AnimValue)this.class_[3];
   }

   public void class_(rLY var1) {
      this.class_[0] = var1;
      this.case_();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -28, -33, -14, 80, 53, -119, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -470123910;
   }

   @Override
   public void class_(boolean var1) {
      ((AnimValue)this.class_[3]).class_(var1);
   }

   @Override
   public String break_() {
      return (String)this.class_[2];
   }

   @Override
   public boolean throws_() {
      return !((AnimValue)this.class_[3]).new_() ? true : protected_[4];
   }

   private static void finally_() {
      byte_ = new short[]{3, 0, 1, 2, 3, 2, 1, 0, 0, 0, 0, 3, 0, 0, 0, 0, 1, 2, 3};
   }

   public void catch_() {
      String var5 = this.native_();
      this.class_[2] = var5;
   }

   private String extends_() {
      int var1 = Math.max(0, ((rLY)this.class_[0]).byte_()) + 1;
      return ((rLY)this.class_[0]).final_() + " " + this.implements_() + var1;
   }

   public void case_() {
      String var5 = this.extends_();
      this.class_[1] = var5;
   }

   public rgF_2 implements_() {
      return rgF_2.RED;
   }

   private static void package_() {
      break_ = new byte[]{4};
   }

   @Override
   public String protected_() {
      return (String)this.class_[1];
   }

   public rLY private_() {
      return (rLY)this.class_[0];
   }

   private void final_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   private static void volatile_() {
      protected_ = new boolean[]{false, false, true, true, false, false, true, false, true, false};
   }

   private String native_() {
      return rLK.class_((rLY)this.class_[0], 1.0F);
   }
}
