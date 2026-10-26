package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmi_3 {
   private static byte[] break_;
   private static String[] byte_;
   private static short[] protected_;
   public Object[] class_;
   private static boolean[] throws_;

   public rdn_3 byte_() {
      return (rdn_3)this.class_[2];
   }

   public rrmi_3() {
      this.implements_();
      Integer var5 = -1;
      this.class_[0] = var5;
      rdb_3 var6 = rdy_3.class_;
      this.class_[1] = var6;
      rdn_3 var7 = rdn_3.break_;
      this.class_[2] = var7;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof rrmi_3 var2)) {
         return false;
      } else if (!var2.class_(this)) {
         return false;
      } else if (this.break_() != var2.break_()) {
         return false;
      } else {
         rdb_3 var3 = this.protected_();
         rdb_3 var4 = var2.protected_();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            rdn_3 var5 = this.byte_();
            rdn_3 var6 = var2.byte_();
            return (var5 == null ? var6 == null : var5.equals(var6)) ? throws_[8] : throws_[7];
         } else {
            return throws_[6];
         }
      }
   }

   @Override
   public String toString() {
      return "SavedItemData(savedSlot=" + this.break_() + ", savedItem=" + this.protected_() + ", savedStack=" + this.byte_() + ")";
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.break_();
      rdb_3 var3 = this.protected_();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      rdn_3 var4 = this.byte_();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   public boolean class_() {
      return this.class_[0] != -1 && (rdb_3)this.class_[1] != rdy_3.class_ ? true : throws_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, 85, 102, -52, 126, 67, 81, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_(Object var1) {
      return var1 instanceof rrmi_3;
   }

   public void class_(rdn_3 var1) {
      this.class_[2] = var1;
   }

   public void class_(rdn_3 var1, int var2) {
      Integer var7 = var2;
      this.class_[0] = var7;
      rdb_3 var8 = var1.break_();
      this.class_[1] = var8;
      rdn_3 var9 = var1.implements_();
      this.class_[2] = var9;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6652828080369116964L;
   }

   public int class_(boolean var1, String... var2) {
      if (!this.class_()) {
         return -1;
      } else {
         HashSet var3 = new HashSet();
         var3.add("Damage");
         if (var2 != null && var2.length > 0) {
            var3.addAll(Arrays.asList(var2));
         }

         int var4 = rrfY_2.class_((rdn_3)this.class_[2], (rdb_3)this.class_[1], var3);
         return var1 ? (var4 >= 0 && var4 < 9 ? var4 + 36 : var4) : var4;
      }
   }

   public void class_(int var1) {
      Integer var6 = var1;
      this.class_[0] = var6;
   }

   public void class_(rdb_3 var1) {
      this.class_[1] = var1;
   }

   public int break_() {
      return (Integer)this.class_[0];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1996420802;
   }

   public void throws_() {
      Integer var5 = -1;
      this.class_[0] = var5;
      rdb_3 var6 = rdy_3.class_;
      this.class_[1] = var6;
      rdn_3 var7 = rdn_3.break_;
      this.class_[2] = var7;
   }

   private static void finally_() {
      byte_ = new String[]{new String("Damage")};
   }

   private static void catch_() {
      protected_ = new short[]{0, 1, 2, 0, 1, 2, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void case_() {
      break_ = new byte[]{-1, -1, 9, 36, -1, -1, 59, 59, 59, 43, 59, 43, 3};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }

   public rdb_3 protected_() {
      return (rdb_3)this.class_[1];
   }

   private static void private_() {
      throws_ = new boolean[]{true, false, true, false, false, false, false, false, true, true, false, false};
   }
}
