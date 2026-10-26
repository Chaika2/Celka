package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Speed extends Module implements rrnZ_2 {
   private static boolean[] byte_;
   public Object[] break_;
   private static byte[] protected_;
   private static String[] throws_;
   private static short[] catch_;

   public Speed() {
      super("Speed", "Увеличивает скорость игрока", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.continue_();
      rrIQ var5 = this.class_(new rrIQ("Режим", "Vanilla", "Vanilla", "Collision", "Matrix", "Grim"));
      this.break_[1] = var5;
      rrlB_2 var6 = new rrlB_2(this);
      this.break_[2] = var6;
      rrls_3 var7 = new rrls_3(this);
      this.break_[3] = var7;
      rrlS_2 var8 = new rrlS_2(this);
      this.break_[4] = var8;
      rrlE_2 var9 = new rrlE_2(this);
      this.break_[5] = var9;
      rrlE_2 var10 = (rrlE_2)this.break_[5];
      this.break_[0] = var10;
      ((rrIQ)this.break_[1]).class_("change_mode", (var1, var2) -> {
         this.continue_();
         if ((rrTF)this.break_[0] != null && this.aJ_()) {
            ((rrTF)this.break_[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Vanilla" -> (rrlE_2)this.break_[5];
            case "Collision" -> (rrlB_2)this.break_[2];
            case "Matrix" -> (rrls_3)this.break_[3];
            case "Grim" -> (rrlS_2)this.break_[4];
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
      protected_ = new byte[]{4, 2, 3, -1, 2, 3, 6};
   }

   @Override
   public void class_() {
      this.byte_(false);
      rrTF var1 = this.new_();
      var1.aK_();
      var1.super_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -630759078;
   }

   @Override
   public void class_(boolean var1) {
      if (this.new_().aI_()) {
         super.class_(var1);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1386181535954914130L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, 59, -107, 122, -75, 125, -74, -91}, "DES");
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
      throws_ = new String[]{
         new String("Speed"),
         new String("Увеличивает скорость игрока"),
         new String("Режим"),
         new String("Vanilla"),
         new String("Vanilla"),
         new String("Collision"),
         new String("Matrix"),
         new String("Grim"),
         new String("change_mode"),
         new String("Vanilla"),
         new String("Collision"),
         new String("Matrix"),
         new String("Grim")
      };
   }

   public rrTF<Speed> new_() {
      this.continue_();
      return (rrTF<Speed>)this.break_[0];
   }

   private static void return_() {
      catch_ = new short[]{1, 1, 2, 3, 4, 5, 5, 0, 1, 0, 0, 0, 5, 2, 3, 4, 0, 0, 0};
   }

   private static void super_() {
      byte_ = new boolean[]{false, true, false, false, true};
   }
}
