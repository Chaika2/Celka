package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoDuel extends Module {
   private static byte[] byte_;
   private static String[] protected_;
   private static boolean[] throws_;
   private static short[] catch_;
   public Object[] break_;

   public AutoDuel() {
      super("Auto Duel", "Автоматически находит дуэли", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.return_();
      rrIQ var5 = new rrIQ("Сервер", "Funtime", "Funtime", "ReallyWorld");
      this.break_[0] = var5;
      this.class_((rrIQ)this.break_[0]);
      rryQ var6 = new rryQ(this);
      this.break_[1] = var6;
      rryA var7 = new rryA(this);
      this.break_[2] = var7;
      rryQ var8 = (rryQ)this.break_[1];
      this.break_[3] = var8;
      ((rrIQ)this.break_[0]).class_("change_mode", (var1, var2) -> {
         this.return_();
         if ((rrTF)this.break_[3] != null && this.aJ_()) {
            ((rrTF)this.break_[3]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9 = switch (var3) {
            case "Funtime" -> (rryQ)this.break_[1];
            case "ReallyWorld" -> (rryA)this.break_[2];
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

   private static void this_() {
      throws_ = new boolean[]{false, true, false, false, true};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2807325463839614754L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1278666294;
   }

   @EventTarget
   public void class_(rrFK var1) {
      this.byte_(false);
   }

   @Override
   public void class_(boolean var1) {
      if (this.new_().aI_()) {
         super.class_(var1);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, 46, -7, -49, 66, 73, -60, 76}, "DES");
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

   private static void continue_() {
      byte_ = new byte[]{2, -1, 4};
   }

   private static void else_() {
      protected_ = new String[]{
         new String("Auto Duel"),
         new String("Автоматически находит дуэли"),
         new String("Сервер"),
         new String("Funtime"),
         new String("Funtime"),
         new String("ReallyWorld"),
         new String("change_mode"),
         new String("Funtime"),
         new String("ReallyWorld")
      };
   }

   public rrTF<AutoDuel> new_() {
      this.return_();
      return (rrTF<AutoDuel>)this.break_[3];
   }

   private void return_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
      }
   }

   private static void super_() {
      catch_ = new short[]{4, 0, 0, 1, 2, 1, 3, 0, 3, 3, 3, 1, 2, 3, 3, 3};
   }
}
