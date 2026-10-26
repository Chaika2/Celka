package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqs_3 implements MinecraftAccessor {
   private static byte[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;

   public rrqS_2 byte_() {
      return (rrqS_2)this.class_[1];
   }

   public rrqs_3(rrqP_2 var1) {
      this.catch_();
      this.class_[0] = var1;
      rrqS_2 var7 = (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[5];
      this.class_[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1666136283;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-78, 51, 7, -124, -30, -123, 11, -11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4634430409592827815L;
   }

   public rrqS_2 class_() {
      String var1 = ((rrqP_2)this.class_[0]).class_().class_().getName();
      Aw_1 var2 = rrfp_3.class_(var1);
      rhd_3 var3 = ((gm_3)import_.class_[56]).break_(var1);
      if (this.class_((rrqP_2)this.class_[0])) {
         return (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[4];
      } else if (var2 == null) {
         return (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[1];
      } else if (var2.break_() == rRl_1.SPECTATOR) {
         return (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[3];
      } else {
         return var3 != null && !var3.sc()
            ? (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[2]
            : (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[0];
      }
   }

   public boolean class_(rrqP_2 var1) {
      return var1.class_().implements_() == null ? true : byte_[1];
   }

   public rrqP_2 break_() {
      return (rrqP_2)this.class_[0];
   }

   private static void throws_() {
      byte_ = new boolean[]{true, false};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
      }
   }

   private static void case_() {
      break_ = new byte[]{2};
   }

   public void protected_() {
      rrqS_2 var1 = this.class_();
      if (var1 != (rrqS_2)this.class_[1]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrFV.class_((rrqP_2)this.class_[0], (rrqS_2)this.class_[1], var1));
         this.class_[1] = var1;
      }
   }

   private static void private_() {
      protected_ = new short[]{0, 5, 1, 1, 0, 0, 1, 1, 0, 56, 0, 4, 1, 3, 2, 0, 0, 1};
   }
}
