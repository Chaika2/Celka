package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoSlow extends Module implements rrnZ_2 {
   private static boolean[] byte_;
   private static String[] protected_;
   public Object[] break_;
   private static short[] throws_;
   private static byte[] catch_;

   public NoSlow() {
      super("No Slow", "Убирает замедление при\nиспользовании предмета", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.this_();
      rrIQ var5 = new rrIQ("Режим", "Funtime", "Funtime", "SpookyTime", "ReallyWorld", "Vanilla");
      this.break_[0] = var5;
      this.class_((rrIQ)this.break_[0]);
      rrlr_3 var6 = new rrlr_3(this);
      this.break_[2] = var6;
      rrCe_1 var7 = new rrCe_1(this);
      this.break_[3] = var7;
      rrCi_1 var8 = new rrCi_1(this);
      this.break_[4] = var8;
      rrCa_1 var9 = new rrCa_1(this);
      this.break_[5] = var9;
      rrCe_1 var10 = (rrCe_1)this.break_[3];
      this.break_[1] = var10;
      ((rrIQ)this.break_[0]).class_("change_mode", (var1, var2) -> {
         this.this_();
         if ((rrTF)this.break_[1] != null && this.aJ_()) {
            ((rrTF)this.break_[1]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Funtime" -> (rrCe_1)this.break_[3];
            case "Vanilla" -> (rrlr_3)this.break_[2];
            case "SpookyTime" -> (rrCi_1)this.break_[4];
            case "ReallyWorld" -> (rrCa_1)this.break_[5];
            default -> null;
         };
         this.break_[1] = var9x;
         if ((rrTF)this.break_[1] != null && this.aJ_()) {
            ((rrTF)this.break_[1]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7835112948601203375L;
   }

   @Override
   public void class_(boolean var1) {
      super.class_(var1);
      this.new_().aI_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -347817080;
   }

   @Override
   public void class_() {
      this.byte_(false);
      this.new_().super_();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-52, -62, 93, -58, -36, -76, -42, 82}, "DES");
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
      throws_ = new short[]{1, 0, 0, 2, 3, 4, 5, 3, 1, 0, 1, 1, 1, 3, 2, 4, 5, 1, 1, 1};
   }

   private static void else_() {
      byte_ = new boolean[]{false, true, false, false, true};
   }

   public rrTF<NoSlow> new_() {
      this.this_();
      return (rrTF<NoSlow>)this.break_[1];
   }

   private static void return_() {
      protected_ = new String[]{
         new String("No Slow"),
         new String("Убирает замедление при\nиспользовании предмета"),
         new String("Режим"),
         new String("Funtime"),
         new String("Funtime"),
         new String("SpookyTime"),
         new String("ReallyWorld"),
         new String("Vanilla"),
         new String("change_mode"),
         new String("Funtime"),
         new String("Vanilla"),
         new String("SpookyTime"),
         new String("ReallyWorld")
      };
   }

   private static void super_() {
      catch_ = new byte[]{4, 2, 3, -1, 2, 3, 6};
   }
}
