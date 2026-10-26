package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AntiBot extends Module {
   private static boolean[] byte_;
   private static short[] protected_;
   private static String[] throws_;
   public Object[] break_;
   private static byte[] catch_;

   public AntiBot() {
      super("Anti Bot", "Детектит НПС/ботов от античита", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.this_();
      rrIQ var5 = new rrIQ("Режим", "Matrix", "Matrix", "ReallyWorld");
      this.break_[1] = var5;
      this.class_(new Setting[]{(rrIQ)this.break_[1]});
      rrnR_2 var6 = new rrnR_2(this);
      this.break_[3] = var6;
      rrnY_2 var7 = new rrnY_2(this);
      this.break_[2] = var7;
      rrnR_2 var8 = (rrnR_2)this.break_[3];
      this.break_[0] = var8;
      ((rrIQ)this.break_[1]).class_("change_mode", (var1, var2) -> {
         this.this_();
         if ((rrTF)this.break_[0] != null && this.aJ_()) {
            ((rrTF)this.break_[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9 = switch (var3) {
            case "ReallyWorld" -> (rrnY_2)this.break_[2];
            case "Matrix" -> (rrnR_2)this.break_[3];
            default -> null;
         };
         this.break_[0] = var9;
         if ((rrTF)this.break_[0] != null && this.aJ_()) {
            ((rrTF)this.break_[0]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5066033562427460724L;
   }

   @Override
   public void class_(boolean var1) {
      super.class_(var1);
      this.new_().aI_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 272510405;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-5, -47, -124, 81, 62, -57, -69, -95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.new_().aK_();
   }

   private static void continue_() {
      throws_ = new String[]{
         new String("Anti Bot"),
         new String("Детектит НПС/ботов от античита"),
         new String("Режим"),
         new String("Matrix"),
         new String("Matrix"),
         new String("ReallyWorld"),
         new String("change_mode"),
         new String("ReallyWorld"),
         new String("Matrix")
      };
   }

   private static void else_() {
      byte_ = new boolean[]{false, true, true, false, false, true};
   }

   public rrTF<AntiBot> new_() {
      this.this_();
      return (rrTF<AntiBot>)this.break_[0];
   }

   private static void return_() {
      protected_ = new short[]{0, 1, 1, 3, 2, 3, 0, 1, 0, 0, 0, 2, 3, 0, 0, 0};
   }

   private static void super_() {
      catch_ = new byte[]{2, -1, 4};
   }
}
