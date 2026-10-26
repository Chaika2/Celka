package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlK_2 {
   private static byte[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static long[] protected_;
   private static short[] throws_;

   public boolean byte_() {
      return (Boolean)this.class_[2];
   }

   public rrlK_2(rHu_1 var1) {
      this.extends_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrlK_2 var2 = (rrlK_2)var1;
         return this.case_().equals(var2.case_());
      } else {
         return byte_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.case_());
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, 127, 56, 37, -115, 11, -114, 28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(long var1) {
      Long var7 = var1;
      this.class_[1] = var7;
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.class_[2] = var6;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -634165424;
   }

   public xc_3 class_() {
      return ((rHu_1)this.class_[0]).abstract_();
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7384276017873484323L;
   }

   public long break_() {
      return (Long)this.class_[1];
   }

   public rHu_1 throws_() {
      return (rHu_1)this.class_[0];
   }

   private static void finally_() {
      break_ = new byte[]{3, 2};
   }

   private static void catch_() {
      protected_ = new long[1];
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         this.class_[1] = 0L;
         this.class_[2] = false;
      }
   }

   public rfH_2 case_() {
      return ((rHu_1)this.class_[0]).char_();
   }

   private static void implements_() {
      throws_ = new short[]{0, 56, 0, 0, 0, 1, 2, 1, 2};
   }

   public rfl_3 protected_() {
      xc_3 var1 = this.class_();
      rfH_2 var2 = this.case_();
      rjC_2 var3 = var1.break_().class_(var1, (gm_3)MinecraftAccessor.import_.class_[56], var2, rjm_3.break_());
      return var3.class_().class_(var2);
   }

   private static void private_() {
      byte_ = new boolean[]{true, false, true, false, true, false};
   }
}
