package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHl_1 implements rrHH {
   public Object[] class_;
   private static boolean[] break_;
   private static String[] byte_;
   private static short[] protected_;

   private static void byte_() {
      break_ = new boolean[]{true, false, true};
   }

   public rrHl_1(ChatHelper var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, 121, 10, 73, 127, 78, -52, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rVi_1 class_(Aw_1 var1) {
      String var2 = var1.class_().getName();
      rgN_2 var3 = new rgN_2(rgF_2.YELLOW + "Duel");
      rgn_3 var4 = new rgn_3("chathelper.fastaction.duel", var2);
      return rgv_3.class_(var3, new rgy_3(rgp_3.class_, var4), new rgl_3(() -> ((cb_3)MinecraftAccessor.import_.class_[57]).case_("/duel " + var2)));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -932717695985847213L;
   }

   @Override
   public boolean class_() {
      return ((rrIk_1)((ChatHelper)this.class_[0]).break_[3]).class_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1598843696;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   private static void throws_() {
      byte_ = new String[]{new String("chathelper.fastaction.duel")};
   }

   private static void protected_() {
      protected_ = new short[]{0, 0, 3, 57};
   }
}
