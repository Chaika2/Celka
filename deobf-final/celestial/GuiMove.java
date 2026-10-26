package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GuiMove extends Module {
   private static short[] byte_;
   private static String[] protected_;
   private static boolean[] throws_;
   public Object[] break_;
   private static long[] catch_;
   private static byte[] private_;

   public GuiMove() {
      super("Gui Move", "Позволяет ходить в открытых\nконтейнерах", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.while_();
      rrIQ var5 = new rrIQ("Режим", "Advanced", "Advanced", "Funtime", "Vanilla");
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Не в текстовых полях", true);
      this.break_[1] = var6;
      this.class_(new Setting[]{(rrIQ)this.break_[0], (rrIk_1)this.break_[1]});
      rrHr_1 var7 = new rrHr_1(this);
      this.break_[2] = var7;
      rrHB var8 = new rrHB(this);
      this.break_[3] = var8;
      rrHS var9 = new rrHS(this);
      this.break_[4] = var9;
      rrHB var10 = (rrHB)this.break_[3];
      this.break_[5] = var10;
      ((rrIQ)this.break_[0]).class_("change_mode", (var1, var2) -> {
         this.while_();
         if ((rrli_3)this.break_[5] != null && this.aJ_()) {
            ((rrli_3)this.break_[5]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Advanced" -> (rrHr_1)this.break_[2];
            case "Funtime" -> (rrHB)this.break_[3];
            case "Vanilla" -> (rrHS)this.break_[4];
            default -> null;
         };
         this.break_[5] = var9x;
         if ((rrli_3)this.break_[5] != null && this.aJ_()) {
            ((rrli_3)this.break_[5]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      private_ = new byte[]{3, 2, 2, -1, 2, 7, 6};
   }

   @Override
   public void class_(boolean var1) {
      if (this.new_().aI_()) {
         super.class_(var1);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1216617370;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.while_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.super_()) {
            Long var6 = System.currentTimeMillis();
            this.break_[6] = var6;
         }

         if ((vm_3)import_.class_[73] == null) {
            return;
         }

         if (this.class_((vm_3)import_.class_[73])) {
            this.class_(var0 -> false);
            return;
         }

         this.class_(var0 -> rrfC_2.break_(var0.int_().break_()));
         if (((rhx_3)((cb_3)import_.class_[57]).implements_[18]).break_ && !((cb_3)import_.class_[57]).BL()) {
            ((Qw_1)import_.class_[20]).k.class_(rrfC_2.break_(((Qw_1)import_.class_[20]).k.int_().break_()));
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7599234538623721953L;
   }

   private void class_(Function<Vu_1, Boolean> var1) {
      for (Vu_1 var5 : ((Qw_1)import_.class_[20]).Pj) {
         var5.class_((Boolean)var1.apply(var5));
      }
   }

   private boolean class_(vm_3 var1) {
      this.while_();
      if (!((rrIk_1)this.break_[1]).class_() || !((rrvd_1)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]).break_() && !vs_3.INSTANCE.break_()) {
         return ((rrli_3)this.break_[5]).class_(var1) ? true : throws_[7];
      } else {
         return throws_[5];
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-107, 24, -125, 121, 27, -2, -70, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      if (this.new_().aK_()) {
         super.throws_(var1);
      }

      this.class_(var0 -> false);
   }

   private static void goto_() {
      byte_ = new short[]{3, 0, 1, 0, 1, 2, 3, 4, 3, 5, 0, 0, 6, 73, 73, 57, 18, 57, 20, 20, 1, 0, 5, 5, 5, 3, 3, 5, 2, 2, 20, 6, 5, 5, 2, 3, 4, 5, 5, 5};
   }

   public long continue_() {
      this.while_();
      return (Long)this.break_[6];
   }

   private static void else_() {
      catch_ = new long[1];
   }

   public rrTF<GuiMove> new_() {
      this.while_();
      return (rrli_3)this.break_[5];
   }

   private static void return_() {
      throws_ = new boolean[]{false, true, true, false, true, true, true, false, true, false, false, false, false, true};
   }

   public boolean super_() {
      this.while_();
      if ((rrli_3)this.break_[5] == (rrHB)this.break_[3]) {
         return ((rrHB)this.break_[3]).class_();
      } else {
         return (rrli_3)this.break_[5] == (rrHr_1)this.break_[2] ? ((rrHr_1)this.break_[2]).class_() : throws_[8];
      }
   }

   private void while_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
         this.break_[6] = 0L;
      }
   }

   private static void public_() {
      protected_ = new String[]{
         new String("Gui Move"),
         new String("Позволяет ходить в открытых\nконтейнерах"),
         new String("Режим"),
         new String("Advanced"),
         new String("Advanced"),
         new String("Funtime"),
         new String("Vanilla"),
         new String("Не в текстовых полях"),
         new String("change_mode"),
         new String("Advanced"),
         new String("Funtime"),
         new String("Vanilla")
      };
   }
}
