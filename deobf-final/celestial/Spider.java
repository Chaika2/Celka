package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Spider extends Module implements rrnZ_2 {
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] break_;
   private static short[] throws_;
   private static String[] catch_;

   public Spider() {
      super("Spider", "Позволяет взбираться по стенам", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.else_();
      rrIQ var5 = new rrIQ("Режим", "Grim", "Grim", "Matrix", "Funtime");
      this.break_[1] = var5;
      this.class_(new Setting[]{(rrIQ)this.break_[1]});
      rrlM_2 var6 = new rrlM_2(this);
      this.break_[2] = var6;
      rrlO_2 var7 = new rrlO_2(this);
      this.break_[3] = var7;
      rrlb_3 var8 = new rrlb_3(this);
      this.break_[4] = var8;
      rrlM_2 var9 = (rrlM_2)this.break_[2];
      this.break_[0] = var9;
      ((rrIQ)this.break_[1]).class_("change_mode", (var1, var2) -> {
         this.else_();
         if ((rrTF)this.break_[0] != null && this.aJ_()) {
            ((rrTF)this.break_[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Grim" -> (rrlM_2)this.break_[2];
            case "Matrix" -> (rrlO_2)this.break_[3];
            case "Funtime" -> (rrlb_3)this.break_[4];
            default -> null;
         };
         this.break_[0] = var9x;
         if ((rrTF)this.break_[0] != null && this.aJ_()) {
            ((rrTF)this.break_[0]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new boolean[]{false, true, true, false, false, false, true};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1091183455412216698L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 26088505;
   }

   @Override
   public void class_() {
      this.protected_(false);
      this.new_().aK_();
   }

   @Override
   public void class_(boolean var1) {
      if (this.new_().aI_()) {
         super.class_(var1);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-56, -84, 104, 9, -62, 49, 113, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      if (this.new_().aK_()) {
         super.throws_(var1);
      }
   }

   public rrlM_2 continue_() {
      this.else_();
      return (rrlM_2)this.break_[2];
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
      }
   }

   public rrTF<Spider> new_() {
      this.else_();
      return (rrTF<Spider>)this.break_[0];
   }

   private static void return_() {
      catch_ = new String[]{
         new String("Spider"),
         new String("Позволяет взбираться по стенам"),
         new String("Режим"),
         new String("Grim"),
         new String("Grim"),
         new String("Matrix"),
         new String("Funtime"),
         new String("change_mode"),
         new String("Grim"),
         new String("Matrix"),
         new String("Funtime")
      };
   }

   private static void super_() {
      throws_ = new short[]{1, 1, 1, 2, 3, 4, 2, 0, 1, 0, 2, 0, 0, 2, 3, 4, 0, 0, 0};
   }

   private static void public_() {
      byte_ = new byte[]{3, 2, -1, 2, 5};
   }
}
