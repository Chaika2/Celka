package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GriefJoiner extends Module {
   private static short[] byte_;
   private static byte[] protected_;
   private static String[] throws_;
   public Object[] break_;
   private static boolean[] catch_;

   public GriefJoiner() {
      super("Grief Joiner", "Помогает зайти на гриф сервера\nReallyWorld", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.goto_();
      rrIv_1 var5 = new rrIv_1("Режим", rrte_3.class_((Pattern)rrtR_2.class_[2]));
      this.break_[0] = var5;
      this.class_((rrIv_1)this.break_[0]);
      rrpH_2 var6 = new rrpH_2(this);
      this.break_[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new String[]{
         new String("Grief Joiner"), new String("Помогает зайти на гриф сервера\nReallyWorld"), new String("Режим"), new String("Не удалось определить сервер")
      };
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1828892537;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3654383188304516265L;
   }

   @Override
   public void class_(boolean var1) {
      this.goto_();
      if (this.continue_() && ((rrpl_3)this.break_[2] == null || ((rrpl_3)this.break_[2]).aI_())) {
         super.class_(var1);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-117, -48, 9, 87, 48, 62, -6, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.goto_();
      if ((rrpl_3)this.break_[2] == null || ((rrpl_3)this.break_[2]).aK_()) {
         super.throws_(var1);
         Object var6 = null;
         this.break_[2] = var6;
      }
   }

   private void goto_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
      }
   }

   private boolean continue_() {
      this.goto_();
      ((rrpH_2)this.break_[1]).class_((rrfq_3)rrfp_3.class_[1]).ifPresentOrElse(var1 -> {
         this.goto_();
         this.break_[2] = var1;
         ((rrpl_3)this.break_[2]).class_();
      }, () -> {
         this.byte_(false);
         String var1 = "Не удалось определить сервер";
         rrfu_3.byte_(rrfu_3.class_((Module)this) + var1);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(this.final_(), var1, 2000));
      });
      return (rrpl_3)this.break_[2] != null ? true : catch_[1];
   }

   private static void else_() {
      byte_ = new short[]{4, 2, 0, 0, 1, 2, 2, 2, 2, 2, 1, 1, 2, 0, 0, 2000, 2, 2};
   }

   public String new_() {
      this.goto_();
      return ((rrIv_1)this.break_[0]).extends_();
   }

   private static void return_() {
      protected_ = new byte[]{3};
   }

   private static void public_() {
      catch_ = new boolean[]{true, false, false};
   }
}
