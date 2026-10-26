package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AutoLeave extends Module {
   private static float[] byte_;
   public Object[] break_;
   private static byte[] protected_;
   private static boolean[] throws_;
   private static short[] catch_;
   private static String[] private_;

   private Pair<rVi_1, rVi_1> byte_(cb_3 var1) {
      this.else_();
      rrIm_1 var2 = (rrIm_1)((Pair)this.break_[1]).getRight();
      boolean var3 = var2.int_();
      double var4 = (double)var2.byte_().floatValue();

      for (cG_2 var7 : ((gm_3)import_.class_[56]).continue_()) {
         if (rrff_3.class_(var7)) {
            double var8 = (double)var1.implements_(var7);
            if (var3 || !(var8 > var4)) {
               rVi_1 var10 = new rgN_2("Рядом был игрок ").class_(var7.L_());
               rVi_1 var11 = var10.case_();
               rVi_1 var12 = new rgN_2((int)var8 + "м").class_(rgF_2.RED);
               var10.break_("\n\nДистанция до игрока: ").class_(var12);
               var11.break_("\n • Дистанция до игрока: ").class_(var12);
               if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().new_()) {
                  String var13 = (int)var7.rx() + " " + (int)var7.re() + " " + (int)var7.BO();
                  rVi_1 var14 = new rgN_2(var13).class_(rgF_2.RED);
                  var10.break_("\n\nКоординаты игрока: ").class_(var14);
                  var11.break_("\n • Координаты игрока: ").class_(var14);
               }

               return Pair.of(var10, var11);
            }
         }
      }

      return null;
   }

   public AutoLeave() {
      super("Auto Leave", "Избегает определенных условий", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.else_();
      Pair var5 = rrwg_3.class_(new rrIk_1("Мало ХП", true), new rrIm_1("Количество ХП", 10.0F, 5.0F, 19.0F, 1.0F));
      this.break_[0] = var5;
      Pair var6 = rrwg_3.class_(
         new rrIk_1("Рядом игрок", false),
         new rrIm_1("Дистанция до игрока", 128.0F, 10.0F, 128.0F, 5.0F)
            .class_((var0, var1) -> "MAX")
            .break_((var0, var1) -> var1 == var0.native_() ? "MAX" : null)
      );
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Staff в сети", false);
      this.break_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Staff в спеке", false).class_(() -> {
         this.else_();
         return !((rrIk_1)this.break_[2]).class_() ? true : throws_[44];
      });
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Бан в чате", false).class_("banInChat", (var1, var2) -> {
         this.else_();
         Boolean var7x = false;
         this.break_[9] = var7x;
      });
      this.break_[4] = var9;
      rrIQ var10 = new rrIQ("Метод лива", "Отключение", "Отключение", "Перезаход", "Сообщение");
      this.break_[5] = var10;
      rrIm_1 var11 = new rrIm_1("Минут для перезахода", 1.0F, 0.1F, 30.0F, 0.1F).class_(() -> {
         this.else_();
         return ((rrIQ)this.break_[5]).byte_().equals("Перезаход");
      });
      this.break_[6] = var11;
      rrIv_1 var12 = new rrIv_1("Сообщение для лива (home/rtp)", rrte_3.class_((Pattern)rrtR_2.class_[5])).package_().class_(120.0F).class_(() -> {
         this.else_();
         return ((rrIQ)this.break_[5]).byte_().equals("Сообщение");
      });
      this.break_[7] = var12;
      this.class_(
         new Setting[]{
            new rrIc_1(
               "Ливать если",
               (rrIk_1)((Pair)this.break_[0]).getLeft(),
               (rrIk_1)((Pair)this.break_[1]).getLeft(),
               (rrIk_1)this.break_[2],
               (rrIk_1)this.break_[3],
               (rrIk_1)this.break_[4]
            ),
            (rrIQ)this.break_[5],
            (rrIm_1)this.break_[6],
            (Setting)((Pair)this.break_[0]).getRight(),
            (Setting)((Pair)this.break_[1]).getRight(),
            (rrIv_1)this.break_[7]
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new short[]{
         3,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         5,
         7,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         0,
         1,
         7,
         0,
         8,
         1,
         2,
         1,
         4,
         56,
         0,
         57,
         1,
         57,
         2,
         57,
         3,
         57,
         4,
         9,
         4,
         9,
         8,
         9,
         5,
         7,
         57,
         8,
         8,
         6,
         1,
         2,
         1,
         4,
         57,
         1,
         6,
         57,
         1,
         0,
         57,
         5,
         1,
         2,
         1,
         4,
         1,
         0,
         1,
         6,
         0,
         2000,
         0,
         1,
         56,
         0,
         0,
         0,
         1,
         9,
         5,
         5,
         9,
         2
      };
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.else_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.instanceof_() || C_throws.byte_().default_().throws_()) {
            Boolean var11 = false;
            this.break_[8] = var11;
            return;
         }

         if (rrfZ_2.byte_()) {
            return;
         }

         boolean var2 = throws_[12];
         if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            || (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
            PI var3 = C_throws.byte_().native_().protected_();
            if (var3 != null && !var3.class_().break_()) {
               return;
            }

            rqM_2 var4 = ((gm_3)import_.class_[56]).E();
            rqO_2 var5 = var4.class_();
            String var6 = var5.break_();
            if (var4 != null && var6 != null && (var6.equals("lobby") || var6.equals("spawn"))) {
               var2 = throws_[13];
            }
         }

         C_class var13 = C_throws.byte_();
         if (((rrIk_1)((Pair)this.break_[0]).getLeft()).class_()) {
            Pair var14 = this.protected_((cb_3)import_.class_[57]);
            if (var14 != null) {
               this.class_(var13, (rVi_1)var14.getLeft(), (rVi_1)var14.getRight());
               return;
            }
         }

         if (((rrIk_1)((Pair)this.break_[1]).getLeft()).class_() && !var2) {
            Pair var15 = this.byte_((cb_3)import_.class_[57]);
            if (var15 != null) {
               this.class_(var13, (rVi_1)var15.getLeft(), (rVi_1)var15.getRight());
               return;
            }
         }

         if (((rrIk_1)this.break_[2]).class_()) {
            Pair var16 = this.break_((cb_3)import_.class_[57]);
            if (var16 != null) {
               this.class_(var13, (rVi_1)var16.getLeft(), (rVi_1)var16.getRight());
               return;
            }
         }

         if (((rrIk_1)this.break_[3]).class_()) {
            Pair var17 = this.class_((cb_3)import_.class_[57]);
            if (var17 != null) {
               this.class_(var13, (rVi_1)var17.getLeft(), (rVi_1)var17.getRight());
               return;
            }
         }

         if (((rrIk_1)this.break_[4]).class_()) {
            Pair var18 = this.new_();
            if (var18 != null && this.class_(var13, (rVi_1)var18.getLeft(), (rVi_1)var18.getRight())) {
               Boolean var12 = false;
               this.break_[9] = var12;
            }
         }
      }
   }

   private boolean class_(C_class var1, rVi_1 var2, rVi_1 var3) {
      this.else_();
      boolean var4 = false;
      String var5 = ((rrIQ)this.break_[5]).byte_();
      switch (var5) {
         case "Отключение":
            rrjv_3.class_(this.case_(), var2);
            var4 = true;
            break;
         case "Сообщение":
            String var7 = ((rrIv_1)this.break_[7]).extends_();
            if (var7 == null || var7.isEmpty()) {
               return throws_[23];
            }

            ((cb_3)import_.class_[57]).protected_(var7);
            var4 = true;
            break;
         case "Перезаход":
            if (!this.class_(var1)) {
               return false;
            }
      }

      if (!(Boolean)this.break_[8]) {
         if (!var1.break_().byte_() && !var1.volatile_().byte_()) {
            rrfZ_2.break_();
         }

         this.class_(var3);
      }

      Boolean var12 = true;
      this.break_[8] = var12;
      if (var4) {
         this.byte_(true);
      }

      return throws_[28];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6191522545172092546L;
   }

   private void class_(rVi_1 var1) {
      rVi_1 var2 = rrfu_3.break_((Module)this).class_(rgF_2.GRAY);
      rVi_1 var3 = var2.class_(var1.case_().class_(rgF_2.GRAY));
      rrfu_3.class_(var3);
      MinecraftAccessor.a_(var3.byte_(), false);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1764955597;
   }

   @EventTarget
   public void class_(rrFH var1) {
      this.else_();
      if (((rrIk_1)this.break_[4]).class_() && var1.class_().equals("Пункт 4.3.1")) {
         Boolean var6 = true;
         this.break_[9] = var6;
      }
   }

   private Pair<rVi_1, rVi_1> class_(cb_3 var1) {
      for (rrqr_3 var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().o().new_()) {
         if (var3 instanceof rrqP_2 var4 && var4.case_().class_() && var4.finally_().byte_() == (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[1]) {
            rVi_1 var5 = new rgN_2("Персонал ").class_(var4.implements_().case_().break_(" в спеке"));
            return Pair.of(var5, var5);
         }
      }

      return null;
   }

   @Override
   public void class_(boolean var1) {
      if (!this.instanceof_()) {
         this.byte_(false);
      } else {
         super.class_(var1);
      }
   }

   private boolean class_(C_class var1) {
      this.else_();
      SL var2 = var1.default_();
      float var3 = ((rrIm_1)this.break_[6]).byte_();
      if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
         || (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         PI var9 = var1.native_().protected_();
         if (var9 == null) {
            return false;
         } else {
            Pf_1 var11 = var9.class_();
            if (!var11.break_()) {
               return false;
            } else {
               int var12 = Math.round(var3 * 60.0F * 20.0F);
               ((cb_3)import_.class_[57]).case_("/hub");
               var2.class_(new Sl_1(var11.class_() + var9.break_(), var12));
               return true;
            }
         }
      } else if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6]) {
         Po_1 var8 = var1.P().break_();
         if (var8 == null) {
            return false;
         } else {
            PK var10 = var8.break_();
            if (!var10.break_()) {
               return false;
            } else {
               long var6 = (long)Math.round(var3 * 60000.0F);
               ((cb_3)import_.class_[57]).case_("/hub");
               var2.class_(new SF(var10.class_() + var8.class_(), var6));
               return true;
            }
         }
      } else if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
         String var4 = C_throws.byte_().final_().throws_();
         if (var4.isEmpty()) {
            return false;
         } else {
            ((cb_3)import_.class_[57]).case_("/hub");
            long var5 = (long)Math.round(var3 * 60000.0F);
            var2.class_(new SF(var4, var5));
            return true;
         }
      } else {
         return throws_[37];
      }
   }

   private Pair<rVi_1, rVi_1> break_(cb_3 var1) {
      for (rrqr_3 var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().o().new_()) {
         if (var3 instanceof rrqP_2 var4 && var4.case_().class_()) {
            rVi_1 var5 = new rgN_2("Персонал ").class_(var4.implements_().case_().break_(" в сети"));
            return Pair.of(var5, var5);
         }
      }

      return null;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{69, -76, -65, -128, -25, 37, -66, -68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.else_();
      super.throws_(var1);
      Boolean var6 = false;
      this.break_[8] = var6;
      Boolean var7 = false;
      this.break_[9] = var7;
   }

   private static void continue_() {
      private_ = new String[]{
         new String("Auto Leave"),
         new String("Избегает определенных условий"),
         new String("Мало ХП"),
         new String("Количество ХП"),
         new String("Рядом игрок"),
         new String("Дистанция до игрока"),
         new String("Staff в сети"),
         new String("Staff в спеке"),
         new String("Бан в чате"),
         new String("banInChat"),
         new String("Метод лива"),
         new String("Отключение"),
         new String("Отключение"),
         new String("Перезаход"),
         new String("Сообщение"),
         new String("Минут для перезахода"),
         new String("Сообщение для лива (home/rtp)"),
         new String("Ливать если"),
         new String("lobby"),
         new String("spawn"),
         new String("Пункт 4.3.1"),
         new String("Отключение"),
         new String("Сообщение"),
         new String("Перезаход"),
         new String("/hub"),
         new String("/hub"),
         new String("/hub"),
         new String("Перезаход"),
         new String("Режим \"Перезаход\" не работает на этом сервере"),
         new String("У вас мало ХП "),
         new String("Рядом был игрок "),
         new String("\n\nДистанция до игрока: "),
         new String("\n • Дистанция до игрока: "),
         new String("\n\nКоординаты игрока: "),
         new String("\n • Координаты игрока: "),
         new String("Персонал "),
         new String(" в сети"),
         new String("Персонал "),
         new String(" в спеке"),
         new String("Бан в чате"),
         new String("Сообщение"),
         new String("Перезаход"),
         new String("MAX"),
         new String("MAX")
      };
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[10];
         this.break_[8] = false;
         this.break_[9] = false;
      }
   }

   private boolean instanceof_() {
      this.else_();
      if (((rrIQ)this.break_[5]).byte_().equals("Перезаход")
         && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
         && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]
         && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6]) {
         String var1 = "Режим \"Перезаход\" не работает на этом сервере";
         rrfu_3.byte_(rrfu_3.class_((Module)this) + var1);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(this.final_(), var1, 2000));
         this.byte_(false);
         return false;
      } else {
         return throws_[40];
      }
   }

   private Pair<rVi_1, rVi_1> new_() {
      this.else_();
      if ((Boolean)this.break_[9]) {
         rgN_2 var1 = new rgN_2("Бан в чате");
         return Pair.of(var1, var1);
      } else {
         return null;
      }
   }

   private static void super_() {
      protected_ = new byte[]{3, 2, 6, 5, 2, 3, 4, 2, 3, 4, 5, -1, 2, 10, 8, 9};
   }

   private static void while_() {
      throws_ = new boolean[]{
         true,
         false,
         false,
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
         true,
         false,
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
         true,
         true,
         false,
         false,
         true,
         false,
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
         false
      };
   }

   private static void public_() {
      byte_ = new float[]{10.0F, 5.0F, 19.0F, 1.0F, 128.0F, 10.0F, 128.0F, 5.0F, 1.0F, 0.1F, 30.0F, 0.1F, 120.0F, 60.0F, 20.0F, 60000.0F, 60000.0F};
   }

   private Pair<rVi_1, rVi_1> protected_(cb_3 var1) {
      this.else_();
      if (var1.Ss() <= ((rrIm_1)((Pair)this.break_[0]).getRight()).byte_()) {
         rVi_1 var2 = new rgN_2("У вас мало ХП ").class_(new rgN_2("(" + (int)var1.Ss() + ")").class_(rgF_2.RED));
         return Pair.of(var2, var2);
      } else {
         return null;
      }
   }
}
