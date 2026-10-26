package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class WaterSpeed extends Module implements rrnZ_2 {
   public Object[] break_;
   private static short[] byte_;
   private static String[] protected_;
   private static byte[] throws_;
   private static boolean[] catch_;

   public WaterSpeed() {
      super("Water Speed", "Увеличивает скорость в воде", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.this_();
      rrIQ var5 = new rrIQ("Режим", "Funtime", "Funtime", "Vulcan");
      this.break_[0] = var5;
      this.class_((rrIQ)this.break_[0]);
      rrlx_3 var6 = new rrlx_3(this);
      this.break_[1] = var6;
      rrld_3 var7 = new rrld_3(this);
      this.break_[2] = var7;
      rrlx_3 var8 = (rrlx_3)this.break_[1];
      this.break_[3] = var8;
      ((rrIQ)this.break_[0]).class_("change_mode", (var1, var2) -> {
         this.this_();
         if ((rrTF)this.break_[3] != null && this.aJ_()) {
            ((rrTF)this.break_[3]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9 = switch (var3) {
            case "Funtime" -> (rrlx_3)this.break_[1];
            case "Vulcan" -> (rrld_3)this.break_[2];
            default -> null;
         };
         this.break_[3] = var9;
         if ((rrTF)this.break_[3] != null && this.aJ_()) {
            ((rrTF)this.break_[3]).aI_();
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

   @Override
   public void class_() {
      this.byte_(false);
      this.new_().super_();
   }

   @Override
   public void class_(boolean var1) {
      super.class_(var1);
      this.new_().aI_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8560510927816771796L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 536343992;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, 70, -51, -53, -122, 36, -9, -37}, "DES");
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
      throws_ = new byte[]{2, -1, 4};
   }

   private static void else_() {
      protected_ = new String[]{
         new String("Water Speed"),
         new String("Увеличивает скорость в воде"),
         new String("Режим"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Vulcan"),
         new String("change_mode"),
         new String("Funtime"),
         new String("Vulcan")
      };
   }

   public rrTF<WaterSpeed> new_() {
      this.this_();
      return (rrTF<WaterSpeed>)this.break_[3];
   }

   private static void return_() {
      byte_ = new short[]{1, 0, 0, 1, 2, 1, 3, 0, 3, 3, 3, 1, 2, 3, 3, 3};
   }

   private static void super_() {
      catch_ = new boolean[]{false, true, false, false, true};
   }
}
