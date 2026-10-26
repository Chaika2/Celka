package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoSprint extends Module {
   private static boolean[] byte_;
   private static String[] protected_;
   private static short[] throws_;
   private static byte[] catch_;
   public Object[] break_;

   public AutoSprint() {
      super("Auto Sprint", "Автоматически включает спринт", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.try_();
      rrIk_1 var5 = new rrIk_1("Голод", false);
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Слепоту", true);
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Приседание", true);
      this.break_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Ползание", true);
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Использование предметов", true);
      this.break_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Горизонтальную коллизию", true);
      this.break_[5] = var10;
      this.class_(
         new Setting[]{
            new GroupSetting("Авто. конфигурации", new ButtonSetting(this, "SpookyTime", () -> {
               this.try_();
               ((rrIk_1)this.break_[0]).class_(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.break_[1]).class_(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.break_[2]).class_(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.break_[3]).class_(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.break_[4]).class_(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.break_[5]).class_(Boolean.valueOf(true), false, true);
            }), new ButtonSetting(this, "Funtime", () -> {
               this.try_();
               ((rrIk_1)this.break_[0]).class_(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.break_[1]).class_(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.break_[2]).class_(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.break_[3]).class_(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.break_[4]).class_(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.break_[5]).class_(Boolean.valueOf(true), false, true);
            }), new ButtonSetting(this, "Grim", () -> {
               this.try_();
               ((rrIk_1)this.break_[0]).class_(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.break_[1]).class_(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.break_[2]).class_(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.break_[3]).class_(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.break_[4]).class_(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.break_[5]).class_(Boolean.valueOf(false), false, true);
            })),
            new GroupSetting(
               "Игнорировать",
               (rrIk_1)this.break_[0],
               (rrIk_1)this.break_[1],
               (rrIk_1)this.break_[2],
               (rrIk_1)this.break_[3],
               (rrIk_1)this.break_[4],
               (rrIk_1)this.break_[5]
            )
         }
      );
   }

   static {
      ntfClinit();
   }

   public boolean this_() {
      this.try_();
      return this.aJ_() && ((rrIk_1)this.break_[2]).class_() ? true : byte_[21];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5324248355237797422L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -905121113;
   }

   @EventTarget
   public void class_(I var1) {
      var1.class_(true);
   }

   @EventTarget
   public void class_(rrLX var1) {
      this.try_();
      if (((rrIk_1)this.break_[5]).class_()) {
         var1.break_(false);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, -53, -72, -18, 111, -104, -114, 78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void goto_() {
      catch_ = new byte[]{2, 3, 2, 6, 2, 3, 4, 5, 6};
   }

   public boolean continue_() {
      this.try_();
      return this.aJ_() && ((rrIk_1)this.break_[1]).class_() ? true : byte_[17];
   }

   public boolean else_() {
      this.try_();
      return this.aJ_() && ((rrIk_1)this.break_[0]).class_() ? true : byte_[15];
   }

   private static void instanceof_() {
      protected_ = new String[]{
         new String("Auto Sprint"),
         new String("Автоматически включает спринт"),
         new String("Голод"),
         new String("Слепоту"),
         new String("Приседание"),
         new String("Ползание"),
         new String("Использование предметов"),
         new String("Горизонтальную коллизию"),
         new String("Авто. конфигурации"),
         new String("SpookyTime"),
         new String("Funtime"),
         new String("Grim"),
         new String("Игнорировать")
      };
   }

   public boolean new_() {
      this.try_();
      return this.aJ_() && ((rrIk_1)this.break_[4]).class_() ? true : byte_[19];
   }

   private static void return_() {
      throws_ = new short[]{1, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5, 5, 0, 1, 4, 2, 3, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5};
   }

   public boolean super_() {
      this.try_();
      return this.aJ_() && ((rrIk_1)this.break_[3]).class_() ? true : byte_[23];
   }

   private void try_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
      }
   }

   private static void while_() {
      byte_ = new boolean[]{
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true
      };
   }
}
