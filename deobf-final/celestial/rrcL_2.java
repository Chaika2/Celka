package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcL_2 extends rrfI_2<Boolean> {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rrcL_2(rrcF_2 var1, rrNw_1 var2) {
      this.protected_();
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 976138470;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-35, -88, 45, -65, 45, 48, -85, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6829119020563490660L;
   }

   public Boolean break_() {
      this.protected_();
      if ((rrNw_1)this.class_[0] instanceof rrNt_1 var1) {
         rJY var2 = var1.throws_();
         int var3 = var1.case_();
         rdn_3 var4 = var2 == null ? ((rrNw_1)this.class_[0]).protected_() : var2.class_();
         rdb_3 var5 = var4.break_();

         for (rrcA_2 var7 : (Set)rrcF_2.class_[0]) {
            if (var7.break_() == var5) {
               for (rrcn_3 var11 : var7.class_()) {
                  Predicate var12 = var11.class_();
                  if (var12 == null || var12.test(var2)) {
                     int var13 = var11.break_();
                     if (var3 == var13) {
                        return false;
                     }
                  }
               }
            }
         }
      }

      return break_[2];
   }

   private static void throws_() {
      break_ = new boolean[]{false, false, true, true};
   }

   private static void case_() {
      byte_ = new short[5];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
