package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ClickPearl extends Module {
   public Object[] break_;
   private static boolean[] byte_;
   private static byte[] protected_;
   private static short[] throws_;
   private static String[] catch_;

   public ClickPearl() {
      super("Click Pearl", "Бросает эндер-пёрл на клавишу", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.return_();
      rrIQ var5 = new rrIQ("Режим", "Vanilla", "Vanilla", "HolyWorld");
      this.break_[0] = var5;
      rrIF var6 = new rrIF("Клавиша", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[3]);
      this.break_[1] = var6;
      this.class_(new Setting[]{(rrIQ)this.break_[0], (rrIF)this.break_[1]});
      rryy_1 var7 = new rryy_1(this);
      this.break_[3] = var7;
      rryC var8 = new rryC(this);
      this.break_[4] = var8;
      rryy_1 var9 = (rryy_1)this.break_[3];
      this.break_[2] = var9;
      ((rrIQ)this.break_[0]).class_("change_mode", (var1, var2) -> {
         this.return_();
         if ((rrTF)this.break_[2] != null && this.aJ_()) {
            ((rrTF)this.break_[2]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Vanilla" -> (rryy_1)this.break_[3];
            case "HolyWorld" -> (rryC)this.break_[4];
            default -> null;
         };
         this.break_[2] = var9x;
         if ((rrTF)this.break_[2] != null && this.aJ_()) {
            ((rrTF)this.break_[2]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new byte[]{2, 2, -1, 5};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6355278915295096084L;
   }

   @Override
   public void class_(boolean var1) {
      this.return_();
      super.class_(var1);
      ((rrTF)this.break_[2]).aI_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1509486563;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, -75, 31, 3, -33, 39, -88, 7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.return_();
      super.throws_(var1);
      ((rrTF)this.break_[2]).aK_();
   }

   public rrIF continue_() {
      this.return_();
      return (rrIF)this.break_[1];
   }

   private static void else_() {
      byte_ = new boolean[]{false, true, false, true, false, true};
   }

   public rrTF<ClickPearl> new_() {
      this.return_();
      return (rrTF<ClickPearl>)this.break_[2];
   }

   private void return_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
      }
   }

   private static void super_() {
      catch_ = new String[]{
         new String("Click Pearl"),
         new String("Бросает эндер-пёрл на клавишу"),
         new String("Режим"),
         new String("Vanilla"),
         new String("Vanilla"),
         new String("HolyWorld"),
         new String("Клавиша"),
         new String("change_mode"),
         new String("Vanilla"),
         new String("HolyWorld")
      };
   }

   private static void public_() {
      throws_ = new short[]{4, 0, 3, 1, 0, 1, 3, 4, 3, 2, 0, 2, 2, 1, 2, 2, 2, 3, 4, 2, 2, 2};
   }
}
