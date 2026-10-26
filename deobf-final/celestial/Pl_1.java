package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pl_1 extends Pv_1 {
   public Object[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   public void byte_() {
      this.class_(null);
   }

   public Pl_1(C_class var1) {
      super(var1);
      this.protected_();
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(C var1) {
      super.class_(var1);
      if (this.break_()) {
         String var2 = var1.class_();
         PH var3 = this.class_();
         if (!var2.equalsIgnoreCase(var3.break_().toLowerCase())) {
            this.byte_();
         }
      }
   }

   public PH class_() {
      this.protected_();
      return (PH)this.break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -643476238;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5755133210238211836L;
   }

   public void class_(PH var1) {
      this.protected_();
      this.break_[0] = var1;
   }

   public boolean break_() {
      return this.class_() != null ? true : byte_[1];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, -49, 67, 9, 32, -89, -15, 4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      protected_ = new short[2];
   }

   private static void case_() {
      byte_ = new boolean[]{true, false, true};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}
