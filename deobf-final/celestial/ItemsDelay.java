package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class ItemsDelay extends Module {
   private static String[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;
   private static float[] catch_;
   public Object[] break_;
   private static byte[] private_;

   private float char_() {
      this.public_();
      return ((rrIm_1)((Pair)this.break_[3]).getRight()).byte_();
   }

   private int byte_(rdn_3 var1) {
      rdb_3 var2 = var1.break_();
      return !var2.super_() && var2 != rdy_3.hi && var2 != rdy_3.WF && var2 != rdy_3.JA ? protected_[34] : var2.break_(var2.continue_());
   }

   public ItemsDelay() {
      super("Items Delay", "Ставит задержку на предмет после\nего использования", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.public_();
      Pair var5 = rrwg_3.class_(new rrIk_1("Включено", true), new rrIm_1("Задержка в секундах", 14.0F, 1.5F, 60.0F, 0.5F));
      this.break_[0] = var5;
      Pair var6 = rrwg_3.class_(new rrIk_1("Включено", true), new rrIm_1("Задержка в секундах", 5.0F, 0.1F, 60.0F, 0.5F));
      this.break_[1] = var6;
      Pair var7 = rrwg_3.class_(new rrIk_1("Включено", true), new rrIm_1("Задержка в секундах", 5.0F, 0.1F, 60.0F, 0.5F));
      this.break_[2] = var7;
      Pair var8 = rrwg_3.class_(new rrIk_1("Включено", true), new rrIm_1("Задержка в секундах", 5.0F, 0.1F, 60.0F, 0.5F));
      this.break_[3] = var8;
      Pair var9 = rrwg_3.class_(new rrIk_1("Включено", true), new rrIm_1("Задержка в секундах", 5.0F, 1.5F, 60.0F, 0.5F));
      this.break_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Компенсировать задержку", false)
         .class_(() -> (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] ? true : protected_[77]);
      this.break_[5] = var10;
      rrIk_1 var11 = new rrIk_1("Только в ПВП", false);
      this.break_[6] = var11;
      this.class_(
         new Setting[]{
            new GroupSetting("Авто. конфигурации", new ButtonSetting(this, "ReallyWorld", () -> {
               this.public_();
               ((rrIk_1)this.break_[6]).class_(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.break_[5]).class_(Boolean.valueOf(false), false, true);
               ((rrIm_1)((Pair)this.break_[0]).getRight()).class_(14.0F, false, true);
               ((rrIm_1)((Pair)this.break_[2]).getRight()).class_(5.0F, false, true);
            }), new ButtonSetting(this, "Funtime", () -> {
               this.public_();
               ((rrIk_1)((Pair)this.break_[3]).getLeft()).class_(Boolean.valueOf(true), false, true);
               ((rrIm_1)((Pair)this.break_[3]).getRight()).class_(20.0F, false, true);
               ((rrIk_1)this.break_[5]).class_(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.break_[6]).class_(Boolean.valueOf(true), false, true);
               ((rrIk_1)((Pair)this.break_[0]).getLeft()).class_(Boolean.valueOf(false), false, true);
               ((rrIk_1)((Pair)this.break_[2]).getLeft()).class_(Boolean.valueOf(false), false, true);
               ((rrIk_1)((Pair)this.break_[1]).getLeft()).class_(Boolean.valueOf(false), false, true);
               ((rrIk_1)((Pair)this.break_[4]).getLeft()).class_(Boolean.valueOf(false), false, true);
            })),
            new GroupSetting("Эндер жемчуги", (Setting)((Pair)this.break_[0]).getLeft(), (Setting)((Pair)this.break_[0]).getRight()),
            new GroupSetting("Зачар. золотые яблоки", (Setting)((Pair)this.break_[1]).getLeft(), (Setting)((Pair)this.break_[1]).getRight()),
            new GroupSetting("Золотые яблоки", (Setting)((Pair)this.break_[2]).getLeft(), (Setting)((Pair)this.break_[2]).getRight()),
            new GroupSetting("Зелье исцеления", (Setting)((Pair)this.break_[3]).getLeft(), (Setting)((Pair)this.break_[3]).getRight()),
            new GroupSetting("Хорус", (Setting)((Pair)this.break_[4]).getLeft(), (Setting)((Pair)this.break_[4]).getRight()),
            new GroupSetting("Другое", (rrIk_1)this.break_[5], (rrIk_1)this.break_[6])
         }
      );
   }

   static {
      ntfClinit();
   }

   private boolean this_() {
      this.public_();
      return ((rrIk_1)((Pair)this.break_[0]).getLeft()).class_();
   }

   private boolean interface_() {
      this.public_();
      return ((rrIk_1)((Pair)this.break_[2]).getLeft()).class_();
   }

   private rVi_1 class_(rdn_3 var1, float var2) {
      rVi_1 var3;
      if (var1.this_()) {
         var3 = var1.continue_().case_().class_(rgF_2.RED);
      } else {
         var3 = new rgN_2(jI_2.class_("ru_ru", var1.finally_())).class_(rgF_2.RED);
      }

      return rrfu_3.break_((Module)this)
         .class_(rgF_2.GRAY)
         .break_("Задержка компенсирована")
         .break_("\nТеперь использование ")
         .class_(var3)
         .break_(" доступно на " + rgF_2.RED + var2 + "с" + rgF_2.GRAY + " быстрее");
   }

   @EventTarget
   public void class_(rrAY var1) {
      if (this.goto_()) {
         rdn_3 var2 = var1.break_();
         rdb_3 var3 = var2.break_();
         if (this.this_() && var3 == rdy_3.Jm) {
            if (rrfo_3.class_(var2)) {
               var1.class_(true);
            }
         } else if (this.interface_() && var3 == rdy_3.hy) {
            if (rrfo_3.class_(var2)) {
               var1.class_(true);
            }
         } else if (this.try_() && var3 == rdy_3.hp) {
            if (rrfo_3.class_(var2)) {
               var1.class_(true);
            }
         } else if (this.while_() && rrfH_2.break_(var2)) {
            if (rrfo_3.class_(var2)) {
               var1.class_(true);
            }
         } else if (this.else_() && var3 == rdy_3.kO && rrfo_3.class_(var2)) {
            var1.class_(true);
         }
      }
   }

   @EventTarget
   public void class_(rrLK var1) {
      if (this.goto_()) {
         rdn_3 var2 = var1.class_();
         rdb_3 var3 = var2.break_();
         if (this.try_() && var3 == rdy_3.hp) {
            this.class_(var2, var0 -> var0.break_() == rdy_3.hp ? true : protected_[42], this.super_());
         } else if (this.interface_() && var3 == rdy_3.hy) {
            this.class_(var2, var0 -> var0.break_() == rdy_3.hy ? true : protected_[40], this.instanceof_());
         } else if (this.while_() && rrfH_2.break_(var2)) {
            this.class_(var2, var0 -> rrfH_2.break_(var0), this.char_());
         } else if (this.else_() && var3 == rdy_3.kO) {
            this.class_(var2, var0 -> var0.break_() == rdy_3.kO ? true : protected_[38], this.import_());
         }
      }
   }

   @EventTarget
   public void class_(rrLn_1 var1) {
      rvs_3 var2 = var1.class_();
      rdb_3 var3 = var2.break_();
      int var4 = var2.byte_();
      if (var4 != 0) {
         rdn_3 var5 = var3.continue_();
         if (this.goto_() && this.this_() && var3 == rdy_3.Jm) {
            this.class_(var5, var0 -> var0.break_() == rdy_3.Jm ? true : protected_[36], this.continue_());
         }

         if (this.throws_(var5) && !rrfo_3.class_(var5)) {
            int var6 = this.byte_(var5);
            if (var6 > 0 && var4 > var6) {
               int var7 = var2.byte_();
               var2.class_(var4 - var6);
               float var8 = (float)(var7 - var2.byte_()) / 20.0F;
               rrfu_3.class_(this.class_(var5, var8));
            }
         }
      }
   }

   private void class_(rdn_3 var1, Predicate<rdn_3> var2, float var3) {
      int var4 = (int)(var3 * 20.0F);
      if (this.throws_(var1)) {
         int var5 = this.byte_(var1);
         if (var5 > 0 && var4 > var5) {
            int var6 = var4;
            var4 -= var5;
            float var7 = (float)(var6 - var4) / 20.0F;
            rrfu_3.class_(this.class_(var1, var7));
         }
      }

      ((cb_3)import_.class_[57]).r().class_(var1, var2, var4);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1260884897;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1880531544961888906L;
   }

   private void class_(rdn_3 var1) {
      ((cb_3)import_.class_[57]).r().break_(var1);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-37, -65, -10, 73, -66, -120, 8, -125}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean throws_(rdn_3 var1) {
      this.public_();
      if (!((rrIk_1)this.break_[5]).class_()) {
         return false;
      } else {
         return (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] && var1.break_() == rdy_3.Jd
            ? false
            : protected_[30];
      }
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      if ((cb_3)import_.class_[57] != null) {
         ((cb_3)import_.class_[57]).r().break_();
      }
   }

   private boolean goto_() {
      this.public_();
      return ((rrIk_1)this.break_[6]).class_() && !rrfZ_2.byte_() ? false : protected_[32];
   }

   private float continue_() {
      this.public_();
      return ((rrIm_1)((Pair)this.break_[0]).getRight()).byte_();
   }

   private boolean else_() {
      this.public_();
      return ((rrIk_1)((Pair)this.break_[4]).getLeft()).class_();
   }

   private float import_() {
      this.public_();
      return ((rrIm_1)((Pair)this.break_[4]).getRight()).byte_();
   }

   private float instanceof_() {
      this.public_();
      return ((rrIm_1)((Pair)this.break_[2]).getRight()).byte_();
   }

   private static void new_() {
      catch_ = new float[]{
         14.0F,
         1.5F,
         60.0F,
         0.5F,
         5.0F,
         0.1F,
         60.0F,
         0.5F,
         5.0F,
         0.1F,
         60.0F,
         0.5F,
         5.0F,
         0.1F,
         60.0F,
         0.5F,
         5.0F,
         1.5F,
         60.0F,
         0.5F,
         20.0F,
         20.0F,
         20.0F,
         20.0F,
         14.0F,
         5.0F
      };
   }

   private static void return_() {
      byte_ = new String[]{
         new String("Items Delay"),
         new String("Ставит задержку на предмет после\nего использования"),
         new String("Включено"),
         new String("Задержка в секундах"),
         new String("Включено"),
         new String("Задержка в секундах"),
         new String("Включено"),
         new String("Задержка в секундах"),
         new String("Включено"),
         new String("Задержка в секундах"),
         new String("Включено"),
         new String("Задержка в секундах"),
         new String("Компенсировать задержку"),
         new String("Только в ПВП"),
         new String("Авто. конфигурации"),
         new String("ReallyWorld"),
         new String("Funtime"),
         new String("Эндер жемчуги"),
         new String("Зачар. золотые яблоки"),
         new String("Золотые яблоки"),
         new String("Зелье исцеления"),
         new String("Хорус"),
         new String("Другое"),
         new String("ru_ru"),
         new String("Задержка компенсирована"),
         new String("\nТеперь использование ")
      };
   }

   private float super_() {
      this.public_();
      return ((rrIm_1)((Pair)this.break_[1]).getRight()).byte_();
   }

   private static void throw_() {
      protected_ = new boolean[]{
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
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
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
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
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false
      };
   }

   private boolean try_() {
      this.public_();
      return ((rrIk_1)((Pair)this.break_[1]).getLeft()).class_();
   }

   private boolean while_() {
      this.public_();
      return ((rrIk_1)((Pair)this.break_[3]).getLeft()).class_();
   }

   private static void static_() {
      throws_ = new short[]{
         3,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         0,
         0,
         1,
         1,
         2,
         2,
         3,
         3,
         4,
         4,
         5,
         6,
         57,
         57,
         57,
         5,
         1,
         2,
         57,
         6,
         0,
         2,
         1,
         3,
         4,
         0,
         3,
         2,
         1,
         4,
         3,
         3,
         5,
         6,
         0,
         2,
         1,
         4,
         6,
         5,
         0,
         2,
         1,
         2
      };
   }

   private void public_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
      }
   }

   private static void abstract_() {
      private_ = new byte[]{7, 2, 2, 2, 2, 3, 2, 4, 2, 5, 2, 6, 2, 7};
   }
}
