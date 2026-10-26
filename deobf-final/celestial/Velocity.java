package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Velocity extends Module {
   private static String[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   public Object[] break_;
   private static boolean[] catch_;

   public Velocity() {
      super("Velocity", "Редактирует ваше откидывание", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.continue_();
      rrIQ var5 = this.class_(new rrIQ("Режим", "Vanilla", "Vanilla", "Custom", "Jump", "JumpReset")).class_("change_mode", (var1, var2) -> {
         this.continue_();
         if ((rrTF)this.break_[5] != null && this.aJ_()) {
            ((rrTF)this.break_[5]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Vanilla" -> (rrCf_1)this.break_[1];
            case "Jump" -> (rrCI)this.break_[3];
            case "Custom" -> (rrCt_1)this.break_[2];
            case "JumpReset" -> (rrCw_1)this.break_[4];
            default -> null;
         };
         this.break_[5] = var9x;
         if ((rrTF)this.break_[5] != null && this.aJ_()) {
            ((rrTF)this.break_[5]).aI_();
         }
      });
      this.break_[0] = var5;
      rrCf_1 var6 = new rrCf_1(this);
      this.break_[1] = var6;
      rrCt_1 var7 = new rrCt_1(this);
      this.break_[2] = var7;
      rrCI var8 = new rrCI(this);
      this.break_[3] = var8;
      rrCw_1 var9 = new rrCw_1(this);
      this.break_[4] = var9;
      rrCf_1 var10 = (rrCf_1)this.break_[1];
      this.break_[5] = var10;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new boolean[]{false, true, false, true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 506948522;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7729682805662392668L;
   }

   @Override
   public void class_(boolean var1) {
      if (this.new_().aI_()) {
         super.class_(var1);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, 28, 0, 100, -14, -64, -17, 109}, "DES");
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

   private void continue_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
      }
   }

   private static void else_() {
      throws_ = new byte[]{4, 2, 3, -1, 2, 3, 6};
   }

   public rrTF<Velocity> new_() {
      this.continue_();
      return (rrTF<Velocity>)this.break_[5];
   }

   private static void return_() {
      byte_ = new String[]{
         new String("Velocity"),
         new String("Редактирует ваше откидывание"),
         new String("Режим"),
         new String("Vanilla"),
         new String("Vanilla"),
         new String("Custom"),
         new String("Jump"),
         new String("JumpReset"),
         new String("change_mode"),
         new String("Vanilla"),
         new String("Jump"),
         new String("Custom"),
         new String("JumpReset")
      };
   }

   private static void super_() {
      protected_ = new short[]{0, 0, 1, 2, 3, 4, 1, 5, 5, 5, 5, 1, 3, 2, 4, 5, 5, 5};
   }
}
