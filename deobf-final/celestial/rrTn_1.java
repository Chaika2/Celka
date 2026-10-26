package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTn_1 implements rrTA, MinecraftAccessor {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;

   public rrTn_1(rjU_2 var1) {
      this.case_();
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
         rrTn_1 var2 = (rrTn_1)var1;
         return Objects.equals((rjU_2)this.class_[0], (rjU_2)var2.class_[0]);
      } else {
         return break_[6];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((rjU_2)this.class_[0]);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, -76, -64, 96, 88, 25, -104, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5642351483299387607L;
   }

   @Override
   public boolean class_(rjU_2 var1, rrTj_1 var2, Predicate<xc_3> var3) {
      rjG_2 var4 = Ph_1.class_(var1, (rjU_2)this.class_[0], rjS_2.OUTLINE, false);
      if (var4 instanceof rff_3 var5) {
         if (var3 != null && !var3.test(((gm_3)import_.class_[56]).byte_(var5.class_()))) {
            return true;
         }

         if (var2 instanceof rrTV var6 && var6.class_(var5.class_())) {
            return true;
         }
      }

      return var4 != null && var4.byte_() != rjM_2.MISS ? break_[4] : break_[3];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1324837578;
   }

   private static void throws_() {
      byte_ = new short[]{0, 0, 56, 0, 0, 0, 0};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      break_ = new boolean[]{false, true, true, true, false, true, false, true, false, true};
   }

   @Override
   public rjU_2 rr() {
      return (rjU_2)this.class_[0];
   }
}
