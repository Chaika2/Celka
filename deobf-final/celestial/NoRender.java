package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoRender extends Module {
   private static boolean[] byte_;
   private static byte[] protected_;
   private static String[] throws_;
   private static short[] catch_;
   public Object[] break_;

   public NoRender() {
      super("No Render", "Убирает некоторые элементы\nигры", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.try_();
      rrIk_1 var5 = new rrIk_1("Эффект тотема", true);
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Игроков", false);
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Заголовки", false);
      this.break_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Босс бар", false);
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Скорборд", false);
      this.break_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Лаву/Воду", false).class_("fluids", (var1, var2) -> {
         if (this.aJ_()) {
            ((yX_2)import_.class_[8]).throws_();
         }
      });
      this.break_[5] = var10;
      this.class_(
         new rrIc_1(
            "Убирать",
            (rrIk_1)this.break_[0],
            (rrIk_1)this.break_[1],
            (rrIk_1)this.break_[2],
            (rrIk_1)this.break_[4],
            (rrIk_1)this.break_[3],
            (rrIk_1)this.break_[5]
         )
      );
   }

   static {
      ntfClinit();
   }

   public boolean this_() {
      this.try_();
      return this.class_((rrIk_1)this.break_[4]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7071295023097068412L;
   }

   public boolean class_(rrIk_1 var1) {
      return this.aJ_() && var1.class_() ? false : byte_[9];
   }

   public boolean class_(an_3 var1) {
      this.try_();
      if (var1 == (cb_3)import_.class_[57]) {
         return true;
      } else {
         return var1.BC() == aI_2.rM && !this.class_((rrIk_1)this.break_[1]) ? byte_[12] : byte_[11];
      }
   }

   @Override
   public void class_(boolean var1) {
      super.class_(var1);
      ((yX_2)import_.class_[8]).throws_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -439821392;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{9, -13, 35, -98, 14, 57, 12, 23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      ((yX_2)import_.class_[8]).throws_();
   }

   private static void goto_() {
      protected_ = new byte[]{6, 2, 3, 4, 5, 6};
   }

   public boolean continue_() {
      this.try_();
      return this.class_((rrIk_1)this.break_[3]);
   }

   public boolean else_() {
      this.try_();
      return this.class_((rrIk_1)this.break_[5]);
   }

   public boolean new_() {
      this.try_();
      return this.class_((rrIk_1)this.break_[2]);
   }

   private static void return_() {
      byte_ = new boolean[]{true, false, false, false, false, false, false, true, false, true, true, true, false};
   }

   public boolean super_() {
      this.try_();
      return this.class_((rrIk_1)this.break_[0]);
   }

   private void try_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
      }
   }

   private static void while_() {
      catch_ = new short[]{2, 0, 1, 2, 3, 4, 5, 0, 1, 2, 4, 3, 5, 0, 2, 3, 5, 4, 57, 1, 8, 8, 8};
   }

   private static void public_() {
      throws_ = new String[]{
         new String("No Render"),
         new String("Убирает некоторые элементы\nигры"),
         new String("Эффект тотема"),
         new String("Игроков"),
         new String("Заголовки"),
         new String("Босс бар"),
         new String("Скорборд"),
         new String("Лаву/Воду"),
         new String("fluids"),
         new String("Убирать")
      };
   }
}
