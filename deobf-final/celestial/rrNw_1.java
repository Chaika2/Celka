package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrNw_1 {
   public Object[] break_;
   private static byte[] class_;
   private static String[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;

   private static void byte_() {
      protected_ = new boolean[]{true, false, true, false, false, true, false};
   }

   public rrNw_1(rdn_3 var1) {
      this.break_();
      this.break_[1] = var1;
   }

   public rrNw_1(rJY var1, String var2, int var3) {
      this.break_();
      this.break_[0] = var1;
      this.break_[2] = var2;
      Integer var10 = var3;
      this.break_[3] = var10;
   }

   public rrNw_1(rdn_3 var1, String var2, int var3) {
      this.break_();
      this.break_[1] = var1;
      this.break_[2] = var2;
      Integer var10 = var3;
      this.break_[3] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrNw_1 var2 = (rrNw_1)var1;
         return this.break_[3] == var2.break_[3]
               && Objects.equals(((rdn_3)this.break_[1]).break_(), ((rdn_3)var2.break_[1]).break_())
               && Objects.equals(((rdn_3)this.break_[1]).char_(), ((rdn_3)var2.break_[1]).char_())
               && Objects.equals((String)this.break_[2], (String)var2.break_[2])
            ? true
            : protected_[3];
      } else {
         return protected_[1];
      }
   }

   @Override
   public String toString() {
      return "ItemMetaData{, itemStack="
         + ((rdn_3)this.break_[1] == null ? "null" : ((rdn_3)this.break_[1]).continue_().byte_())
         + ", seller='"
         + (String)this.break_[2]
         + "', price="
         + (Integer)this.break_[3]
         + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash((rdn_3)this.break_[1], (String)this.break_[2], (Integer)this.break_[3]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8017418041711901448L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 609615075;
   }

   private static void class_() {
      throws_ = new short[]{0, 2, 3, 1, 2, 3, 1, 1, 1, 2, 3, 3, 3, 1, 1, 1, 1, 2, 2, 1, 2, 3, 0, 1, 2, 3, 1};
   }

   public void class_(rdn_3 var1) {
      this.break_[1] = var1;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{34, 31, -116, -128, 40, 87, -44, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
         var1[3] = 0;
      }
   }

   public rJY throws_() {
      return (rJY)this.break_[0];
   }

   public String catch_() {
      return (String)this.break_[2];
   }

   public int case_() {
      return (Integer)this.break_[3];
   }

   private static void implements_() {
      byte_ = new String[]{new String("null")};
   }

   public rdn_3 protected_() {
      return (rdn_3)this.break_[1];
   }

   private static void private_() {
      class_ = new byte[]{3, 2, 4, 3};
   }
}
