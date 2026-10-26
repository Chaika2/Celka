package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EB implements D {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private static void byte_() {
      break_ = new boolean[]{true, true, true, true};
   }

   public EB(EP var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3072353841831678291L;
   }

   @Override
   public void class_(T var1) {
      if ((Boolean)C_class.instanceof_().Pw.class_[0] && (rU_2)((EP)this.class_[0]).break_[1] != null) {
         Color var2 = (Color)C_class.instanceof_().short_.class_[0];
         float var3 = (Float)C_class.instanceof_().super_.class_[0];
         float var4 = (Float)C_class.instanceof_().PT.class_[0];
         boolean var5 = (Boolean)C_class.instanceof_().package_.class_[0];
         bj_3.class_(var2, var3, var4, var5);
         bj_3.class_(var1.byte_(), new rfl_3((rU_2)((EP)this.class_[0]).break_[1], ((rU_2)((EP)this.class_[0]).break_[1]).class_(1, 1, 1)));
         bj_3.class_(var5);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 16555155;
   }

   private static void class_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{109, -91, 68, 63, -57, -24, -78, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
