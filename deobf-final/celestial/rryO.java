package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryO {
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static long[] protected_;
   private static boolean[] throws_;

   public boolean byte_() {
      return (Boolean)this.class_[3];
   }

   public rryO(rhd_3 var1, rdn_3 var2) {
      this.case_();
      Long var7 = rqR_2.break_();
      this.class_[2] = var7;
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rryO var2 = (rryO)var1;
         return Objects.equals((rhd_3)this.class_[0], (rhd_3)var2.class_[0]);
      } else {
         return throws_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((rhd_3)this.class_[0]);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{56, -71, 19, -9, -88, -21, -87, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.class_[3] = var6;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2026049751;
   }

   public rdn_3 class_() {
      return (rdn_3)this.class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4683044087926002858L;
   }

   public long break_() {
      return (Long)this.class_[2];
   }

   private static void throws_() {
      break_ = new short[]{0, 0, 0, 0, 1, 2, 3, 2, 0, 1, 3};
   }

   private static void catch_() {
      byte_ = new byte[]{4, 2, 3};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         this.class_[2] = 0L;
         this.class_[3] = false;
      }
   }

   private static void implements_() {
      throws_ = new boolean[]{true, false, false};
   }

   public rhd_3 protected_() {
      return (rhd_3)this.class_[0];
   }

   private static void private_() {
      protected_ = new long[1];
   }
}
