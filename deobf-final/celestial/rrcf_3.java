package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcf_3 extends rrfI_2<Boolean> {
   public Object[] class_;
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rrcf_3(rrcI_2 var1, rrNw_1 var2, rrNd_1 var3) {
      this.protected_();
      this.class_[0] = var2;
      this.class_[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 39, 57, 77, -6, -30, -120, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1072799475;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -833094010532912901L;
   }

   public Boolean break_() {
      this.protected_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_();
      List var3 = ((rrNd_1)this.class_[1]).protected_();
      List var4 = ((rrNd_1)this.class_[1]).char_();
      if (!var2.final_()) {
         return false;
      } else {
         if (var4 != null && !var4.isEmpty()) {
            for (String var6 : var4) {
               if (var2.protected_(var6)) {
                  return false;
               }
            }
         }

         if (var3 != null && !var3.isEmpty()) {
            for (String var8 : var3) {
               if (!var2.protected_(var8)) {
                  return false;
               }
            }
         }

         return protected_[3];
      }
   }

   private static void throws_() {
      protected_ = new boolean[]{false, false, false, true};
   }

   private static void catch_() {
      byte_ = new short[]{0, 1, 0, 0, 1, 1};
   }

   private static void case_() {
      break_ = new byte[]{2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }
}
