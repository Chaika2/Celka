package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AntiAfk extends Module {
   private static String[] byte_;
   private static boolean[] protected_;
   public Object[] break_;
   private static byte[] throws_;
   private static short[] catch_;

   public AntiAfk() {
      super("Anti AFK", "Обходит сервера с проверкой на\nАФК", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.super_();
      rrIQ var5 = new rrIQ("Режим", "Funtime", "Funtime", "Vanilla");
      this.break_[1] = var5;
      this.class_((rrIQ)this.break_[1]);
      rryJ var6 = new rryJ(this);
      this.break_[2] = var6;
      rryX var7 = new rryX(this);
      this.break_[3] = var7;
      rryJ var8 = (rryJ)this.break_[2];
      this.break_[0] = var8;
      ((rrIQ)this.break_[1]).class_("change_mode", (var1, var2) -> {
         this.super_();
         if ((rrTF)this.break_[0] != null && this.aJ_()) {
            ((rrTF)this.break_[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9 = switch (var3) {
            case "Vanilla" -> (rryJ)this.break_[2];
            case "Funtime" -> (rryX)this.break_[3];
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

   private static void this_() {
      byte_ = new String[]{
         new String("Anti AFK"),
         new String("Обходит сервера с проверкой на\nАФК"),
         new String("Режим"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Vanilla"),
         new String("change_mode"),
         new String("Vanilla"),
         new String("Funtime")
      };
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -572880595;
   }

   @Override
   public void class_(boolean var1) {
      super.class_(var1);
      this.new_().aI_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1493400069218405243L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, -57, -46, -110, 117, 66, -101, -32}, "DES");
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
      catch_ = new short[]{4, 1, 1, 2, 3, 2, 0, 1, 0, 0, 0, 2, 3, 0, 0, 0};
   }

   private static void else_() {
      protected_ = new boolean[]{false, true, false, true};
   }

   public rrTF<AntiAfk> new_() {
      this.super_();
      return (rrTF<AntiAfk>)this.break_[0];
   }

   private static void return_() {
      throws_ = new byte[]{2, -1, 4};
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
      }
   }
}
