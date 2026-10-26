package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHC implements rrHH {
   private static boolean[] break_;
   private static String[] byte_;
   private static short[] protected_;
   public Object[] class_;

   private static void byte_() {
      protected_ = new short[]{0, 0, 0, 57};
   }

   public rrHC(ChatHelper var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public rVi_1 class_(Aw_1 var1) {
      String var2 = var1.class_().getName();
      rgN_2 var3 = new rgN_2(rgF_2.YELLOW + "Call");
      rgn_3 var4 = new rgn_3("chathelper.fastaction.call", var2);
      return rgv_3.class_(var3, new rgy_3(rgp_3.class_, var4), new rgl_3(() -> ((cb_3)MinecraftAccessor.import_.class_[57]).case_("/call " + var2)));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -763279024761319880L;
   }

   @Override
   public boolean class_() {
      return ((rrIk_1)((ChatHelper)this.class_[0]).break_[0]).class_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1607747235;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, -110, 0, -3, 49, 75, 94, 63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   private static void throws_() {
      break_ = new boolean[]{true, false, true};
   }

   private static void protected_() {
      byte_ = new String[]{new String("chathelper.fastaction.call")};
   }
}
