package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Flight extends Module implements rrnZ_2 {
   private static boolean[] byte_;
   private static String[] protected_;
   public Object[] break_;
   private static short[] throws_;
   private static float[] catch_;
   private static byte[] private_;

   public Flight() {
      super("Flight", "Позволяет летать без креатив\nрежима", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.throw_();
      rrIQ var5 = new rrIQ("Режим", "Vanilla", "Vanilla", "Levitation Boost", "Jump");
      this.break_[1] = var5;
      rrIm_1 var6 = new rrIm_1("Скорость", 2.0F, 0.5F, 10.0F, 0.1F).class_(() -> {
         this.throw_();
         return this.new_() == (rrCD)this.break_[4] ? true : byte_[10];
      });
      this.break_[2] = var6;
      rrIm_1 var7 = new rrIm_1("Скорость", 1.0F, 0.6F, 5.0F, 0.1F).class_(() -> {
         this.throw_();
         return this.new_() == (rrCK)this.break_[5] ? true : byte_[8];
      });
      this.break_[3] = var7;
      rrCD var8 = new rrCD(this);
      this.break_[4] = var8;
      rrCK var9 = new rrCK(this);
      this.break_[5] = var9;
      rrCo_1 var10 = new rrCo_1(this);
      this.break_[6] = var10;
      this.class_(new Setting[]{(rrIQ)this.break_[1], (rrIm_1)this.break_[2], (rrIm_1)this.break_[3]});
      rrCD var11 = (rrCD)this.break_[4];
      this.break_[0] = var11;
      ((rrIQ)this.break_[1]).class_("change_mode", (var1, var2) -> {
         this.throw_();
         if ((rrTF)this.break_[0] != null && this.aJ_()) {
            ((rrTF)this.break_[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Vanilla" -> (rrCD)this.break_[4];
            case "Levitation Boost" -> (rrCK)this.break_[5];
            case "Jump" -> (rrCo_1)this.break_[6];
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

   public rrIm_1 this_() {
      this.throw_();
      return (rrIm_1)this.break_[2];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -879094649;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4720540146179947115L;
   }

   @Override
   public void class_(boolean var1) {
      super.class_(var1);
      this.new_().aI_();
   }

   @Override
   public void class_() {
      this.byte_(false);
      this.new_().super_();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, 85, 25, -60, -55, 3, 50, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.new_().aK_();
   }

   private static void goto_() {
      catch_ = new float[]{2.0F, 0.5F, 10.0F, 0.1F, 1.0F, 0.6F, 5.0F, 0.1F};
   }

   public rrIQ continue_() {
      this.throw_();
      return (rrIQ)this.break_[1];
   }

   private static void else_() {
      protected_ = new String[]{
         new String("Flight"),
         new String("Позволяет летать без креатив\nрежима"),
         new String("Режим"),
         new String("Vanilla"),
         new String("Vanilla"),
         new String("Levitation Boost"),
         new String("Jump"),
         new String("Скорость"),
         new String("Скорость"),
         new String("change_mode"),
         new String("Vanilla"),
         new String("Levitation Boost"),
         new String("Jump")
      };
   }

   private static void instanceof_() {
      throws_ = new short[]{1, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 0, 1, 0, 1, 2, 3, 0, 0, 4, 5, 6, 0, 0, 0, 5, 4};
   }

   public rrTF<Flight> new_() {
      this.throw_();
      return (rrTF<Flight>)this.break_[0];
   }

   public rrIm_1 super_() {
      this.throw_();
      return (rrIm_1)this.break_[3];
   }

   private void throw_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
      }
   }

   private static void try_() {
      private_ = new byte[]{3, 2, 3, 2, -1, 2, 7};
   }

   private static void while_() {
      byte_ = new boolean[]{false, true, false, true, false, false, true, true, false, true, false};
   }
}
