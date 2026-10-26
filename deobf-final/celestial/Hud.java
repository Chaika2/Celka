package celestial;

import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Hud extends Module {
   private static boolean[] protected_;
   private static short[] throws_;
   private static float[] catch_;
   private static byte[] private_;
   public static Object[] break_;
   private static String[] implements_;
   public Object[] byte_;

   private static void boolean_() {
      private_ = new byte[]{2, 9, 2, 3, 2, 4, 5, 6, 7, 4, 2, 3, 8, 4, 2, 3, 18, 16, 16, 16, 20, 20, 9, 2, 18, 17, 4, 3, 8};
   }

   private boolean char_() {
      this.import_();
      return ((rrIk_1)this.byte_[2]).class_();
   }

   private static void long_() {
      Object[] var0 = new Object[]{
         FontManager.class_("montserrat", 13.0F, false), FontManager.class_("montserrat", 13.0F, false), FontManager.class_("montserrat", 13.0F, false), 8
      };
      break_ = var0;
   }

   public Hud() {
      super("HUD", "Пользовательский интерфейс", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.import_();
      rrIk_1 var5 = new rrIk_1("Включено", true);
      this.byte_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Фпс", true);
      this.byte_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Бпс", true);
      this.byte_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Тпс", true);
      this.byte_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Координаты", true);
      this.byte_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Включено", true);
      this.byte_[5] = var10;
      rrIk_1 var11 = new rrIk_1("Включено", true);
      this.byte_[6] = var11;
      rrIk_1 var12 = new rrIk_1("Включено", true);
      this.byte_[7] = var12;
      rrIk_1 var13 = new rrIk_1("Включено", true);
      this.byte_[8] = var13;
      rrIk_1 var14 = new rrIk_1("Включено", true);
      this.byte_[9] = var14;
      rrIk_1 var15 = new rrIk_1("Включено", false);
      this.byte_[10] = var15;
      rrIk_1 var16 = new rrIk_1("Оптимизация", false);
      this.byte_[11] = var16;
      rrIQ var17 = new rrIQ("Режим", "Плавающий", "Плавающий", "Стандартный").class_(this::this_);
      this.byte_[12] = var17;
      List var18 = List.of(
         new rrqH_2(
            () -> new StringBuilder("Coords: ")
                  .append(rgF_2.GRAY)
                  .append((int)((cb_3)import_.class_[57]).rx())
                  .append(" ")
                  .append((int)((cb_3)import_.class_[57]).re())
                  .append(" ")
                  .append((int)((cb_3)import_.class_[57]).BO()),
            this::continue_
         ),
         new rrqH_2(() -> new StringBuilder("BPS: ").append(rgF_2.GRAY).append(rrfj_3.case_()), this::char_),
         new rrqH_2(() -> new StringBuilder("FPS: ").append(rgF_2.GRAY).append(((Integer)QY.break_[9]).intValue()), this::instanceof_),
         new rrqH_2(() -> new StringBuilder("TPS: ").append(rgF_2.GRAY).append(rrfp_3.protected_()), this::interface_)
      );
      this.byte_[13] = var18;
      AnimValue var19 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1], 0.5F, false);
      this.byte_[14] = var19;
      AnimValue var20 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1], 0.5F, false);
      this.byte_[15] = var20;
      this.class_(
         new Setting[]{
            new GroupSetting("Ватермарк", (rrIk_1)this.byte_[0]),
            new GroupSetting("Бинды модулей", (rrIk_1)this.byte_[7]),
            new GroupSetting("Бинды предметов", (rrIk_1)this.byte_[8]),
            new GroupSetting("Эффекты", (rrIk_1)this.byte_[5], (rrIQ)this.byte_[12]),
            new GroupSetting("Задержки", (rrIk_1)this.byte_[9]),
            new GroupSetting("Расписания", (rrIk_1)this.byte_[10]),
            new GroupSetting("Броня", (rrIk_1)this.byte_[6]),
            new GroupSetting("Информация", (rrIk_1)this.byte_[4], (rrIk_1)this.byte_[1], (rrIk_1)this.byte_[2], (rrIk_1)this.byte_[3]),
            new GroupSetting("Другое", (rrIk_1)this.byte_[11])
         }
      );
   }

   static {
      ntfClinit();
   }

   public boolean this_() {
      this.import_();
      return ((rrIk_1)this.byte_[5]).class_();
   }

   public boolean interface_() {
      this.import_();
      return ((rrIk_1)this.byte_[3]).class_();
   }

   private void class_(Ml_1 var1, rrZO var2, float var3, float var4) {
      this.import_();
      ((AnimValue)this.byte_[14]).break_(this.default_());
      var4 -= ((AnimValue)this.byte_[14]).byte_();

      for (rrqH_2 var6 : (List)this.byte_[13]) {
         var6.byte_();
         AnimValue var7 = var6.throws_();
         if (var7.case_()) {
            float var8 = var7.byte_();
            var2.class_(
               var1,
               strictfp_,
               ((StringBuilder)((Supplier)var6.class_[0]).get()).toString(),
               (double)var3,
               (double)var4,
               ColorHelper.class_((float)(((List)this.byte_[13]).indexOf(var6) * 20), (int)(255.0F * var8))
            );
            var4 -= var6.break_();
         }
      }
   }

   private void class_(Ml_1 var1, float var2, float var3, float var4) {
      this.import_();
      if (!((cb_3)import_.class_[57]).implements_() && !((cb_3)import_.class_[57]).native_() && ((Ax_1)import_.class_[55]).class_()) {
         ((AnimValue)this.byte_[15]).break_((float)((cq_3)import_.class_[19]).int_());
         var4 += ((AnimValue)this.byte_[15]).byte_();
         int var5 = (int)(var3 / 2.0F + 8.0F);
         byte var6 = 16;
         rqs_3 var7 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).break_;
         int var8 = var7.size();
         int var9 = var8 - 1;

         for (int var10 = 0; var10 < var8; var10++) {
            rXQ var11 = rJT.finally_[var10];
            rdn_3 var12 = (rdn_3)var7.get(var9 - var10);
            float var13 = (float)(var5 + var10 * var6);
            if (var12.class_()) {
               Pair var14 = Pair.of(rJT.class_, rJT.implements_[var11.break_()]);
               fj_3 var15 = import_.class_((rqO_2)var14.getFirst()).apply((rqO_2)var14.getSecond());
               import_.A().class_(var15.extends_().protected_());
               ch_3.class_(var1, var13, var4, ((cq_3)import_.class_[19]).h_(), 16, 16, var15);
            } else {
               ((cq_3)import_.class_[19]).class_(var13, var4, var2, (cb_3)import_.class_[57], var12, false);
               RenderSystem.disableDepthTest();
            }
         }

         RenderSystem.enableDepthTest();
      }
   }

   private void class_(Ml_1 var1, rrZO var2, float var3, float var4, int var5, int var6, int var7, int var8) {
      this.import_();
      String var9 = (String)rrQJ.class_[1];
      rrfD_2.class_(var1, var3, var4, (Float)this.byte_[17], (float)var2.class_() + 6.5F, 225, var5, var6, var7, var8, false);
      var2.byte_(var1, var9, var3 + 2.0F, var4 + 4.5F, ColorHelper.class_(0.0F, 180));
      var2.byte_(var1, (String)this.byte_[16], var3 + 2.0F, var4 + 4.0F, rrZF.d_);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1705112962;
   }

   private void class_(Ml_1 var1, Collection<rLY> var2, rrZO var3, float var4, float var5, float var6, float var7) {
      List var8 = Ordering.natural().sortedCopy(var2);

      for (int var9 = 0; var9 < var8.size(); var9++) {
         rLY var10 = (rLY)var8.get(var9);
         int var11 = ColorHelper.class_((float)(var9 * 20), 225);
         String var12 = "";
         if (var10.byte_() >= 1 && var10.byte_() <= 9) {
            var12 = jI_2.class_("enchantment.level." + (var10.byte_() + 1));
         }

         StringBuilder var13 = new StringBuilder()
            .append(var10.final_())
            .append(" ")
            .append(var12)
            .append("\n")
            .append(rgF_2.GRAY)
            .append(rLK.class_(var10, 1.0F));
         String var14 = var13.toString();
         String var15 = var10.final_() + " " + var12;
         float var16 = var7 * (float)var9;
         rrfD_2.class_(var1, var4, var5 + var16, var3.break_(var15) + 25.0F, var6, 225, var11, var11, var11, var11, false);
         var3.class_(var1, var14, (double)(var4 + 22.0F), (double)(var5 + var16 + 5.0F), rrZF.d_, false, false);
         rrfD_2.class_(var1, var10.class_(), var4 + 2.0F, var5 + var16 + 2.0F, 1.0F);
      }
   }

   public void class_(Ml_1 var1, float var2) {
      this.import_();
      if (this.aJ_() && ((rrIk_1)this.byte_[6]).class_()) {
         float var3 = (float)const_.super_();
         float var4 = (float)const_.this_();
         this.class_(var1, var2, var3, var4 - 45.0F);
      }
   }

   @EventTarget
   public void class_(rrnB_2 var1) {
      this.import_();
      Ml_1 var2 = var1.class_();
      float var3 = (float)((int)const_.final_());
      int var4 = ColorHelper.class_(0.0F, 225);
      int var5 = ColorHelper.class_(90.0F, 225);
      int var6 = ColorHelper.class_(270.0F, 225);
      int var7 = ColorHelper.class_(180.0F, 225);
      if (((rrIk_1)this.byte_[0]).class_() && !((Qw_1)import_.class_[20]).R) {
         this.class_(var2, (rrZO)break_[1], 5.0F, 5.0F, var4, var5, var6, var7);
      }

      if (((rrIk_1)this.byte_[5]).class_() && this.public_()) {
         this.break_(var2, (rrZO)break_[2], 5.0F, var3 / 2.0F);
      }

      var2.class_();
      ((rrZO)break_[0]).break_(strictfp_);
      this.class_(var2, (rrZO)break_[0], 2.0F, var3 - (float)((List)this.byte_[13]).size() - 2.0F);
      ((rrZO)break_[0]).byte_(strictfp_);
      var2.break_();
   }

   @EventTarget
   public void class_(j_1 var1) {
      this.import_();
      rrZr_1 var2 = (rrZr_1)rrQJ.class_[5];
      Object var3 = (String)rrQJ.class_[1];
      String[] var4 = new String[]{rgF_2.RESET + var3, rgF_2.RESET + var2.break_(), rgF_2.RESET + "UID: " + var2.protected_(), rgF_2.RESET + rrfT_2.class_()};
      String var9 = String.join(rgF_2.GRAY + " » ", var4);
      this.byte_[16] = var9;
      Float var10 = ((rrZO)break_[1]).break_((String)this.byte_[16]) + 5.0F;
      this.byte_[17] = var10;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1663863677646967364L;
   }

   private float default_() {
      float var1 = 0.0F;
      if ((vm_3)import_.class_[73] instanceof FP) {
         var1 += 7.0F;
      }

      return (float)((double)var1 * const_.return_());
   }

   private static void void_() {
      throws_ = new short[]{
         2,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         1,
         14,
         1,
         15,
         0,
         7,
         8,
         5,
         12,
         9,
         10,
         6,
         4,
         1,
         2,
         3,
         11,
         225,
         225,
         225,
         225,
         0,
         20,
         1,
         5,
         2,
         0,
         0,
         13,
         0,
         5,
         1,
         16,
         1,
         16,
         17,
         6,
         1,
         17,
         225,
         180,
         16,
         57,
         57,
         57,
         55,
         15,
         19,
         15,
         57,
         1,
         19,
         19,
         57,
         14,
         14,
         13,
         0,
         13,
         225,
         225,
         73,
         11,
         1,
         4,
         0,
         2,
         3,
         5,
         12,
         12,
         7,
         8,
         9,
         10,
         14,
         9,
         57,
         57,
         57
      };
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-54, -53, -42, 20, -3, -77, -31, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_(Ml_1 var1, rrZO var2, float var3, float var4) {
      Collection var5 = ((cb_3)import_.class_[57]).So();
      if (!var5.isEmpty()) {
         float var6 = (float)(var2.class_() + 18);
         float var7 = var6 + 7.0F;
         this.class_(var1, var5, var2, var3, var4 - (float)var5.size() * var7 / 2.0F + 10.0F, var6, var7);
      }
   }

   public boolean goto_() {
      this.import_();
      return ((rrIk_1)this.byte_[11]).class_();
   }

   private static void const_() {
      catch_ = new float[]{
         0.5F,
         0.5F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         5.0F,
         5.0F,
         5.0F,
         2.0F,
         2.0F,
         2.0F,
         5.0F,
         45.0F,
         6.5F,
         2.0F,
         4.5F,
         0.0F,
         2.0F,
         4.0F,
         7.0F,
         2.0F,
         10.0F,
         2.0F,
         8.0F,
         255.0F,
         1.0F,
         25.0F,
         22.0F,
         5.0F,
         2.0F,
         2.0F,
         1.0F,
         0.0F,
         7.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   public boolean continue_() {
      this.import_();
      if (!((rrIk_1)this.byte_[4]).class_()) {
         return false;
      } else {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().new_() ? false : protected_[51];
      }
   }

   public boolean else_() {
      this.import_();
      return ((rrIk_1)this.byte_[8]).class_();
   }

   private void import_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[18];
         this.byte_[17] = 0.0F;
      }
   }

   public boolean instanceof_() {
      this.import_();
      return ((rrIk_1)this.byte_[1]).class_();
   }

   public float new_() {
      this.import_();
      if (!this.aJ_()) {
         return 0.0F;
      } else {
         return !this.instanceof_() && !this.continue_() && !this.interface_() ? 0.0F : ((AnimValue)this.byte_[14]).byte_();
      }
   }

   public boolean return_() {
      this.import_();
      return ((rrIk_1)this.byte_[9]).class_();
   }

   public boolean super_() {
      this.import_();
      return ((rrIk_1)this.byte_[10]).class_();
   }

   public boolean throw_() {
      this.import_();
      return ((rrIQ)this.byte_[12]).byte_().equals("Плавающий");
   }

   public boolean try_() {
      this.import_();
      return ((rrIk_1)this.byte_[7]).class_();
   }

   public float while_() {
      return 0.0F;
   }

   private static void static_() {
      protected_ = new boolean[]{
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
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
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false
      };
   }

   public boolean public_() {
      this.import_();
      return ((rrIQ)this.byte_[12]).byte_().equals("Стандартный");
   }

   private static void transient_() {
      implements_ = new String[]{
         new String("HUD"),
         new String("Пользовательский интерфейс"),
         new String("Включено"),
         new String("Фпс"),
         new String("Бпс"),
         new String("Тпс"),
         new String("Координаты"),
         new String("Включено"),
         new String("Включено"),
         new String("Включено"),
         new String("Включено"),
         new String("Включено"),
         new String("Включено"),
         new String("Оптимизация"),
         new String("Режим"),
         new String("Плавающий"),
         new String("Плавающий"),
         new String("Стандартный"),
         new String("Ватермарк"),
         new String("Бинды модулей"),
         new String("Бинды предметов"),
         new String("Эффекты"),
         new String("Задержки"),
         new String("Расписания"),
         new String("Броня"),
         new String("Информация"),
         new String("Другое"),
         new String(""),
         new String(" "),
         new String("\n"),
         new String("Стандартный"),
         new String("Плавающий"),
         new String("TPS: "),
         new String("FPS: "),
         new String("BPS: "),
         new String("Coords: "),
         new String(" "),
         new String(" ")
      };
   }
}
