package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHn_1 implements rrHH {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;
   private static String[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   public rrHn_1(ChatHelper var1) {
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 547195259;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1027650636904956267L;
   }

   @Override
   public boolean class_() {
      return ((rrIk_1)((ChatHelper)this.class_[0]).break_[2]).class_();
   }

   @Override
   public rVi_1 class_(Aw_1 var1) {
      String var2 = var1.class_().getName();
      rgN_2 var3 = new rgN_2(rgF_2.YELLOW + "Ah");
      rgn_3 var4 = new rgn_3("chathelper.fastaction.ahsearch", var2);
      return rgv_3.class_(var3, new rgy_3(rgp_3.class_, var4), new rgl_3(() -> ((cb_3)MinecraftAccessor.import_.class_[57]).case_("/ah " + var2)));
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-15, 15, -26, -117, -67, 117, 92, 21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new String[]{new String("chathelper.fastaction.ahsearch")};
   }

   private static void throws_() {
      byte_ = new short[]{0, 0, 2, 57};
   }

   private static void protected_() {
      break_ = new boolean[]{true, false, true};
   }
}
