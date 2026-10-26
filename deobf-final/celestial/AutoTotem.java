package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AutoTotem extends Module {
   public Object[] break_;
   private static float[] protected_;
   private static boolean[] throws_;
   public static Object[] byte_;
   private static short[] catch_;
   private static String[] private_;
   private static byte[] implements_;

   private static void boolean_() {
      implements_ = new byte[]{2, 11, 5, 2, 3, 4, 2, 3, 4, 5, 6, 7, 8, 9, 10, 47, 54, -1, 45, -1, -1, 2, 3, 4, 5, 9, 8, 6};
   }

   private void char_() {
      if (this.break_ == null) {
         this.break_ = new Object[9];
         this.break_[8] = 0;
      }
   }

   private boolean long_() {
      return ((rrIk_1)((Pair)byte_[4]).getLeft()).class_();
   }

   private float float_() {
      this.char_();
      return ((rrIm_1)this.break_[4]).byte_();
   }

   public AutoTotem() {
      super("Auto Totem", "Автоматически берет тотем в руку", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.char_();
      rrIQ var5 = new rrIQ("Режим", "Funtime", "Funtime", "Advanced").class_("change_mode", (var1, var2) -> {
         this.char_();
         if ((rrCk_1)this.break_[0] != null && this.aJ_()) {
            ((rrCk_1)this.break_[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Funtime" -> (rrCz_1)this.break_[6];
            case "Advanced" -> (rrCW)this.break_[7];
            default -> null;
         };
         this.break_[0] = var9x;
         if ((rrCk_1)this.break_[0] != null && this.aJ_()) {
            ((rrCk_1)this.break_[0]).aI_();
         }
      });
      this.break_[1] = var5;
      rrIk_1 var6 = new rrIk_1("Сохранять зачарованные", true);
      this.break_[2] = var6;
      rrIk_1 var7 = new rrIk_1("Не менять шар", true);
      this.break_[3] = var7;
      rrIm_1 var8 = new rrIm_1("Здоровье", 5.0F, 1.0F, 20.0F, 0.5F);
      this.break_[4] = var8;
      rrIk_1 var9 = new rrIk_1("Счетчик тотемов", true);
      this.break_[5] = var9;
      rrCz_1 var10 = new rrCz_1(this);
      this.break_[6] = var10;
      rrCW var11 = new rrCW(this);
      this.break_[7] = var11;
      this.class_(
         new Setting[]{
            new rrIc_1(
               "Срабатывать на",
               (rrIk_1)((Pair)byte_[1]).getLeft(),
               (rrIk_1)((Pair)byte_[0]).getLeft(),
               (rrIk_1)((Pair)byte_[3]).getLeft(),
               (rrIk_1)((Pair)byte_[4]).getLeft(),
               (rrIk_1)((Pair)byte_[2]).getLeft()
            ),
            (rrIQ)this.break_[1],
            (Setting)((Pair)byte_[0]).getRight(),
            (Setting)((Pair)byte_[1]).getRight(),
            (Setting)((Pair)byte_[2]).getRight(),
            (Setting)((Pair)byte_[3]).getRight(),
            (Setting)((Pair)byte_[4]).getRight(),
            (rrIm_1)this.break_[4],
            (rrIk_1)this.break_[2],
            (rrIk_1)this.break_[3],
            (rrIk_1)this.break_[5]
         }
      );
      rrCz_1 var12 = (rrCz_1)this.break_[6];
      this.break_[0] = var12;
   }

   static {
      ntfClinit();
   }

   public Pair<rdn_3, Integer> this_() {
      if (((cb_3)import_.class_[57]).sK().class_(rdy_3.kL)) {
         return Pair.of(null, -1);
      } else {
         for (int var1 = throws_[14]; var1 < 45; var1++) {
            rdn_3 var2 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var1);
            if (var2.break_() == rdy_3.kL && !this.class_(var2)) {
               return Pair.of(var2, var1);
            }
         }

         return Pair.of(null, -1);
      }
   }

   private static void interface_() {
      Object[] var0 = new Object[]{
         rrwg_3.class_(new rrIk_1("Кристалл", true), new rrIm_1("Радиус до кристалла", 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.class_(new rrIk_1("Обсидиан", false), new rrIm_1("Радиус до обсидиана", 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.class_(new rrIk_1("Якорь", false), new rrIm_1("Радиус до якоря", 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.class_(new rrIk_1("Динамит", false), new rrIm_1("Радиус до динамита", 0.0F, 0.0F, 0.0F, 0.0F)),
         rrwg_3.class_(new rrIk_1("Падение", false), new rrIm_1("Дальность падения", 0.0F, 0.0F, 0.0F, 0.0F)),
         new rdn_3(rdy_3.kL)
      };
      byte_ = var0;
   }

   public void class_(float var1) {
      this.char_();
      if (this.aJ_() && ((rrIk_1)this.break_[5]).class_()) {
         if ((cb_3)import_.class_[57] == null || (gm_3)import_.class_[56] == null) {
            return;
         }

         if (((cb_3)import_.class_[57]).implements_()
            || ((cb_3)import_.class_[57]).native_()
            || ((cb_3)import_.class_[57]).rg()
            || !((Ax_1)import_.class_[55]).class_()) {
            return;
         }

         byte var2 = ((cb_3)import_.class_[57]).implements_[19] >= 1 && !((cb_3)import_.class_[57]).L() ? implements_[16] : implements_[15];
         ((cq_3)import_.class_[19]).class_(const_.package_() - 9.0F, (float)(const_.this_() - var2), var1, (cb_3)import_.class_[57], (rdn_3)byte_[5], true);
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.char_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         Integer var6 = rrfY_2.class_(rdy_3.kL, var0 -> !var0.protected_("AttributeModifiers") ? true : throws_[36]);
         this.break_[8] = var6;
      }
   }

   private boolean class_(rdn_3 var1) {
      this.char_();
      if (!((rrIk_1)this.break_[2]).class_()) {
         return throws_[17];
      } else {
         return var1.protected_("AttributeModifiers") && this.break_[8] > 0 ? true : throws_[16];
      }
   }

   @Override
   public void class_(boolean var1) {
      if (this.new_().aI_()) {
         super.class_(var1);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 296806851;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -445587464335814465L;
   }

   @EventTarget
   public void class_(rrnb_3 var1) {
      if ((cb_3)import_.class_[57] != null && (gm_3)import_.class_[56] != null) {
         if (!((cb_3)import_.class_[57]).implements_() && !((cb_3)import_.class_[57]).rg()) {
            if (!this.for_()) {
               if (var1.class_() instanceof rSa_1 var3 && ((cb_3)import_.class_[57]).implements_(var3) <= this.default_()) {
                  this.new_().byte_();
               }
            }
         }
      }
   }

   private float default_() {
      return ((rrIm_1)((Pair)byte_[0]).getRight()).byte_();
   }

   private static void short_() {
      private_ = new String[]{
         new String("Auto Totem"),
         new String("Автоматически берет тотем в руку"),
         new String("Режим"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Advanced"),
         new String("change_mode"),
         new String("Сохранять зачарованные"),
         new String("Не менять шар"),
         new String("Здоровье"),
         new String("Счетчик тотемов"),
         new String("Срабатывать на"),
         new String("AttributeModifiers"),
         new String("AttributeModifiers"),
         new String("Funtime"),
         new String("Advanced"),
         new String("Кристалл"),
         new String("Радиус до кристалла"),
         new String("Обсидиан"),
         new String("Радиус до обсидиана"),
         new String("Якорь"),
         new String("Радиус до якоря"),
         new String("Динамит"),
         new String("Радиус до динамита"),
         new String("Падение"),
         new String("Дальность падения")
      };
   }

   private boolean void_() {
      return !this.throw_()
         ? false
         : rrjc_3.class_(var0 -> rrjc_3.protected_(var0) instanceof Wv_1, (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[2], this.instanceof_())
            .findAny()
            .isPresent();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{69, -37, -41, 25, 107, 46, -76, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.char_();
      if (this.new_().aK_()) {
         super.throws_(var1);
      }

      Integer var6 = 0;
      this.break_[8] = var6;
   }

   private boolean goto_() {
      return ((rrIk_1)((Pair)byte_[0]).getLeft()).class_();
   }

   private static void const_() {
      catch_ = new short[]{
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         1,
         0,
         3,
         4,
         2,
         1,
         0,
         1,
         2,
         3,
         4,
         4,
         2,
         3,
         5,
         6,
         0,
         0,
         8,
         57,
         56,
         57,
         57,
         57,
         5,
         57,
         56,
         57,
         57,
         57,
         55,
         57,
         19,
         57,
         19,
         57,
         5,
         0,
         57,
         57,
         57,
         1,
         2,
         8,
         57,
         57,
         57,
         57,
         57,
         56,
         57,
         57,
         2,
         2,
         57,
         31,
         3,
         57,
         8,
         0,
         1,
         2,
         3,
         4,
         0,
         1,
         2,
         3,
         4,
         4,
         0,
         0,
         6,
         7,
         0,
         0,
         0
      };
   }

   public boolean continue_() {
      for (rpm_3 var4 : rpm_3.values()) {
         rdn_3 var5 = ((cb_3)import_.class_[57]).protected_(var4);
         if (!this.class_(var5) && var5.break_() == rdy_3.kL) {
            return true;
         }
      }

      return throws_[13];
   }

   private static void else_() {
      throws_ = new boolean[]{
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false
      };
   }

   private boolean for_() {
      this.char_();
      return !((rrIk_1)this.break_[3]).class_() ? false : rrjQ_2.class_(((cb_3)import_.class_[57]).Sn());
   }

   private float import_() {
      return ((rrIm_1)((Pair)byte_[3]).getRight()).byte_();
   }

   private float instanceof_() {
      return ((rrIm_1)((Pair)byte_[2]).getRight()).byte_();
   }

   public rrCk_1 new_() {
      this.char_();
      return (rrCk_1)this.break_[0];
   }

   private static void return_() {
      protected_ = new float[]{
         5.0F,
         1.0F,
         20.0F,
         0.5F,
         9.0F,
         5.0F,
         3.0F,
         12.0F,
         1.0F,
         5.0F,
         3.0F,
         12.0F,
         1.0F,
         5.0F,
         3.0F,
         12.0F,
         1.0F,
         5.0F,
         3.0F,
         50.0F,
         1.0F,
         10.0F,
         5.0F,
         50.0F,
         1.0F
      };
   }

   public boolean super_() {
      if (!((cb_3)import_.class_[57]).implements_() && !((cb_3)import_.class_[57]).rg() && ((cb_3)import_.class_[57]).BM()) {
         if (((cb_3)import_.class_[57]).Ss() + ((cb_3)import_.class_[57]).Sd() <= this.float_()) {
            return true;
         } else {
            if (!this.for_()) {
               if (this.public_()) {
                  return true;
               }

               if (this.static_()) {
                  return true;
               }

               if (this.void_()) {
                  return true;
               }

               if (this.while_()) {
                  return true;
               }
            }

            return throws_[24];
         }
      } else {
         return throws_[18];
      }
   }

   private boolean throw_() {
      return ((rrIk_1)((Pair)byte_[2]).getLeft()).class_();
   }

   private float try_() {
      return ((rrIm_1)((Pair)byte_[1]).getRight()).byte_();
   }

   private boolean while_() {
      if (!this.long_()) {
         return false;
      } else {
         return ((cb_3)import_.class_[57]).throws_[31] >= this.transient_() ? true : throws_[32];
      }
   }

   private boolean static_() {
      return !this.strictfp_()
         ? false
         : rrjc_3.class_(rrjc_3::byte_, (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[2], this.try_()).findAny().isPresent();
   }

   private boolean public_() {
      ObjectIterator var1 = ((gm_3)import_.class_[56]).return_().int2ObjectEntrySet().iterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         an_3 var3 = (an_3)var2.getValue();
         if (var3 instanceof rSa_1 && this.goto_()) {
            if (((cb_3)import_.class_[57]).implements_(var3) <= this.default_()) {
               return true;
            }
         } else if (var3 instanceof rsX_2 && this.abstract_() && ((cb_3)import_.class_[57]).implements_(var3) <= this.import_()) {
            return true;
         }
      }

      return throws_[27];
   }

   private boolean abstract_() {
      return ((rrIk_1)((Pair)byte_[3]).getLeft()).class_();
   }

   private float transient_() {
      return ((rrIm_1)((Pair)byte_[4]).getRight()).byte_();
   }

   private boolean strictfp_() {
      return ((rrIk_1)((Pair)byte_[1]).getLeft()).class_();
   }
}
