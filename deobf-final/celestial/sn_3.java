package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sn_3 implements D {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public sn_3(sA_2 var1, C_case var2) {
      this.byte_();
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-37, -30, -7, -123, 5, 82, 39, -117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2574230454760854273L;
   }

   @Override
   public void class_(T var1) {
      rY_2 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().finally_().new_();
      rm_3 var3 = ((C_case)this.class_[0]).long_();
      if (var2 != null && var3.byte_()) {
         if ((Boolean)C_class.instanceof_().Pw.class_[0]) {
            Color var4 = (Color)C_class.instanceof_().try_.class_[0];
            float var5 = (Float)C_class.instanceof_().super_.class_[0];
            float var6 = (Float)C_class.instanceof_().PT.class_[0];
            boolean var7 = (Boolean)C_class.instanceof_().package_.class_[0];
            bj_3.class_(var4, var5, var6, var7);
            bj_3.class_(var1.byte_(), var2.break_());
            bj_3.class_(var7);
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1540115941;
   }

   private static void class_() {
      byte_ = new short[8];
   }

   private static void break_() {
      break_ = new boolean[]{true};
   }
}
