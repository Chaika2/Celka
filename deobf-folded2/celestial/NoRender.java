package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoRender extends Module {
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static String[] id_throws;
   private static short[] id_catch;
   public Object[] id_break;

   public NoRender() {
      super("No Render", "Убирает некоторые элементы\nигры", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.id_try();
      rrIk_1 var5 = new rrIk_1("Эффект тотема", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Игроков", false);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Заголовки", false);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Босс бар", false);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Скорборд", false);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Лаву/Воду", false).id_class("fluids", (var1, var2) -> {
         if (this.aJ_()) {
            ((yX_2)id_import.id_class[8]).id_throws();
         }
      });
      this.id_break[5] = var10;
      this.id_class(
         new rrIc_1(
            "Убирать",
            (rrIk_1)this.id_break[0],
            (rrIk_1)this.id_break[1],
            (rrIk_1)this.id_break[2],
            (rrIk_1)this.id_break[4],
            (rrIk_1)this.id_break[3],
            (rrIk_1)this.id_break[5]
         )
      );
   }

   static {
      ntfClinit();
   }

   public boolean id_this() {
      this.id_try();
      return this.id_class((rrIk_1)this.id_break[4]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7071295023097068412L;
   }

   public boolean id_class(rrIk_1 var1) {
      return this.aJ_() && var1.id_class() ? false : id_byte[9];
   }

   public boolean id_class(an_3 var1) {
      this.id_try();
      if (var1 == (cb_3)id_import.id_class[57]) {
         return true;
      } else {
         return var1.BC() == aI_2.rM && !this.id_class((rrIk_1)this.id_break[1]) ? id_byte[12] : id_byte[11];
      }
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      ((yX_2)id_import.id_class[8]).id_throws();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -439821392;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{9, -13, 35, -98, 14, 57, 12, 23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      ((yX_2)id_import.id_class[8]).id_throws();
   }

   private static void id_goto() {
      id_protected = new byte[]{6, 2, 3, 4, 5, 6};
   }

   public boolean id_continue() {
      this.id_try();
      return this.id_class((rrIk_1)this.id_break[3]);
   }

   public boolean id_else() {
      this.id_try();
      return this.id_class((rrIk_1)this.id_break[5]);
   }

   public boolean id_new() {
      this.id_try();
      return this.id_class((rrIk_1)this.id_break[2]);
   }

   private static void id_return() {
      id_byte = new boolean[]{true, false, false, false, false, false, false, true, false, true, true, true, false};
   }

   public boolean id_super() {
      this.id_try();
      return this.id_class((rrIk_1)this.id_break[0]);
   }

   private void id_try() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   private static void id_while() {
      id_catch = new short[]{2, 0, 1, 2, 3, 4, 5, 0, 1, 2, 4, 3, 5, 0, 2, 3, 5, 4, 57, 1, 8, 8, 8};
   }

   private static void id_public() {
      id_throws = new String[]{
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
