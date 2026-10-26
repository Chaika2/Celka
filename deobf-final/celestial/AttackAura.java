package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AttackAura extends Module implements rrnF_2, rrnL_2 {
   private static double[] byte_;
   private static short[] protected_;
   private static float[] throws_;
   private static long[] catch_;
   private static String[] private_;
   private static byte[] implements_;
   public Object[] break_;
   private static boolean[] finally_;
   private rrIk_1 celestialSilentRotation;

   public rrIk_1 boolean_() {
      this.u();
      return (rrIk_1)this.break_[29];
   }

   public boolean char_() {
      return false;
   }

   public rrnD_2 long_() {
      this.u();
      return (rrnD_2)this.break_[8];
   }

   public boolean float_() {
      this.u();
      return !this.S().byte_().equals("Legit") && (rrnK_2)this.break_[5] != (rrCs_1)this.break_[3] ? finally_[69] : finally_[68];
   }

   public rrIk_1 double_() {
      this.u();
      return (rrIk_1)this.break_[22];
   }

   public AttackAura() {
      super("Attack Aura", "Автоматически бьет окружающих\nвас существ", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.u();
      rqO_2 var5 = new rqO_2("celestial/images/glow.png");
      this.break_[4] = var5;
      rrfP_2 var6 = new rrfP_2();
      this.break_[6] = var6;
      CheckGroup var7 = new CheckGroup().catch_(true).case_(true).throws_(false).implements_(false).byte_(false).protected_(false).class_(true);
      this.break_[7] = var7;
      rrnD_2 var8 = new rrnD_2(this);
      this.break_[8] = var8;
      rrIQ var9 = new rrIQ("Сортировка", "Умная", "Умная", "Поле зрения", "Дистанция", "Здоровье");
      this.break_[9] = var9;
      rrIQ var10 = new rrIQ("Режим", "Funtime", "Funtime", "Matrix", "Snap", "SpookyTime");
      this.break_[10] = var10;
      rrIQ var11 = new rrIQ("Обход спринта", "Funtime", "Funtime", "Legit").class_("change_mode", (var1, var2) -> {
         this.u();
         rrnD_2 var10000 = (rrnD_2)this.break_[8];
         Integer var7x = 0;
         var10000.break_[6] = var7x;
         var10000 = (rrnD_2)this.break_[8];
         Integer var8x = 0;
         var10000.break_[7] = var8x;
      });
      this.break_[11] = var11;
      rrIQ var12 = new rrIQ("Режим", "Незаметный", "Незаметный", "Строгий", "Таргет", "Свободный");
      this.break_[12] = var12;
      rrIk_1 var13 = new rrIk_1("Таргетить если у цели\nлук, арбалет или трезубец", false).class_(() -> {
         this.u();
         return !((rrIQ)this.break_[12]).byte_().equals("Таргет") ? true : finally_[97];
      });
      this.break_[13] = var13;
      rrIk_1 var14 = new rrIk_1("Заходить за спину цели", true).class_(() -> {
         this.u();
         return !((rrIQ)this.break_[12]).byte_().equals("Таргет") && !((rrIk_1)this.break_[13]).class_() ? finally_[95] : finally_[94];
      });
      this.break_[14] = var14;
      rrIm_1 var15 = new rrIm_1("Дистанция за спиной", 1.0F, 0.5F, 2.5F, 0.1F).class_(((rrIk_1)this.break_[14])::class_);
      this.break_[15] = var15;
      rrIm_1 var16 = new rrIm_1("Дистанция удара", 3.0F, 1.0F, 6.0F, 0.1F);
      this.break_[16] = var16;
      rrIm_1 var17 = new rrIm_1("Дистанция наводки", 0.0F, 0.0F, 32.0F, 0.5F);
      this.break_[17] = var17;
      rrIk_1 var18 = new rrIk_1("Только криты", true);
      this.break_[18] = var18;
      rrIk_1 var19 = new rrIk_1("Только с пробелом", false).class_(((rrIk_1)this.break_[18])::class_);
      this.break_[19] = var19;
      rrIk_1 var20 = new rrIk_1("Останавливать при\nиспользовании предмета", false);
      this.break_[20] = var20;
      rrIk_1 var21 = new rrIk_1("Останавливать при\nоткрытом контейнере", false).class_(((rrIk_1)this.break_[18])::class_);
      this.break_[21] = var21;
      rrIk_1 var22 = new rrIk_1("Бить через щит", true);
      this.break_[22] = var22;
      rrIk_1 var23 = new rrIk_1("Бить через стены", true);
      this.break_[23] = var23;
      rrIk_1 var24 = new rrIk_1("Дистанция под Grim", false)
         .class_(
            () -> (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
                     && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
                  ? true
                  : finally_[93]
         );
      this.break_[24] = var24;
      rrIk_1 var25 = new rrIk_1("Убирать интерполяцию у\nэнтити", false)
         .class_(() -> (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] ? true : finally_[91]);
      this.break_[25] = var25;
      rrIk_1 var26 = new rrIk_1("Убирать взаимодействие с\nблоками и энтити", true);
      this.break_[26] = var26;
      rrIk_1 var27 = new rrIk_1("Ломать щит", true);
      this.break_[27] = var27;
      rrIk_1 var28 = new rrIk_1("Таргет-HUD", true);
      this.break_[28] = var28;
      rrIk_1 var29 = new rrIk_1("ESP", true);
      this.break_[29] = var29;
      lD_2 var30 = new lD_2(256);
      this.break_[30] = var30;
      AnimValue var31 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[3], 0.5F, false);
      this.break_[33] = var31;
      rrne_3 var32 = new rrne_3();
      this.break_[35] = var32;
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().break_((rrne_3)this.break_[35]);
      Setting[] var10001 = new Setting[]{
         new GroupSetting("Цели", new rrIc_1("Выбор", ((CheckGroup)this.break_[7]).byte_()), (rrIQ)this.break_[9]), null, null, null, null, null, null, null
      };
      GroupSetting var33;
      GroupSetting var10004 = var33 = new GroupSetting("Обходы", (rrIQ)this.break_[10], (rrIQ)this.break_[11]);
      this.break_[34] = var33;
      var10001[1] = var10004;
      var10001[2] = new GroupSetting("Коррекция движения", (rrIQ)this.break_[12], (rrIk_1)this.break_[13], (rrIk_1)this.break_[14], (rrIm_1)this.break_[15]);
      var10001[3] = new GroupSetting("Дистанции", (rrIm_1)this.break_[16], (rrIm_1)this.break_[17]);
      var10001[4] = new GroupSetting(
         "Удары",
         (rrIk_1)this.break_[18],
         (rrIk_1)this.break_[23],
         (rrIk_1)this.break_[27],
         (rrIk_1)this.break_[22],
         (rrIk_1)this.break_[20],
         (rrIk_1)this.break_[21]
      );
      var10001[5] = new GroupSetting("Криты", (rrIk_1)this.break_[19]);
      var10001[6] = new GroupSetting("Визуалы", new rrIc_1("Отображать", (rrIk_1)this.break_[28], (rrIk_1)this.break_[29]));
      var10001[7] = new GroupSetting("Другие", (rrIk_1)this.break_[24], (rrIk_1)this.break_[25], (rrIk_1)this.break_[26]);
      this.class_(var10001);
      rrCr_1 var34 = new rrCr_1(this);
      this.break_[0] = var34;
      rrCP var35 = new rrCP(this);
      this.break_[1] = var35;
      rrna_3 var36 = new rrna_3(this);
      this.break_[2] = var36;
      rrCs_1 var37 = new rrCs_1(this);
      this.break_[3] = var37;
      rrna_3 var38 = (rrna_3)this.break_[2];
      this.break_[5] = var38;
      ((rrIQ)this.break_[10]).class_("change_mode", (var1, var2) -> {
         this.u();
         if ((rrnK_2)this.break_[5] != null && this.aJ_()) {
            ((rrnK_2)this.break_[5]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Matrix" -> (rrCr_1)this.break_[0];
            case "Snap" -> (rrCP)this.break_[1];
            case "Funtime" -> (rrna_3)this.break_[2];
            case "SpookyTime" -> (rrCs_1)this.break_[3];
            default -> null;
         };
         this.break_[5] = var9x;
         if ((rrnK_2)this.break_[5] != null && this.aJ_()) {
            ((rrnK_2)this.break_[5]).aI_();
         }
      });
      ((rrIm_1)this.break_[17]).class_(() -> {
         this.u();
         return !this.M() && (rrnK_2)this.break_[5] != (rrna_3)this.break_[2] ? true : finally_[87];
      });
      ((rrIQ)this.break_[11]).class_(() -> {
         this.u();
         return (rrnK_2)this.break_[5] != (rrCs_1)this.break_[3] ? true : finally_[85];
      });
      ((rrIk_1)this.break_[23])
         .class_(
            () -> {
               this.u();
               return (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
                     && (rrnK_2)this.break_[5] == (rrCs_1)this.break_[3]
                  ? finally_[83]
                  : finally_[82];
            }
         );
      ((rrIk_1)this.break_[20])
         .class_(
            () -> {
               this.u();
               return (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
                     && (rrnK_2)this.break_[5] == (rrCs_1)this.break_[3]
                  ? finally_[81]
                  : finally_[80];
            }
         );
      ((rrIk_1)this.break_[21])
         .class_(
            () -> {
               this.u();
               return (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
                     && (rrnK_2)this.break_[5] == (rrCs_1)this.break_[3]
                  ? finally_[79]
                  : finally_[78];
            }
         );
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(new OH<>(RenderEvent.class, var1 -> {
         this.u();
         ((AnimValue)this.break_[33]).class_((iB_2)this.break_[31] != null && ((rrIk_1)this.break_[29]).class_() ? true : finally_[77]);
         if ((iB_2)this.break_[32] != null && ((AnimValue)this.break_[33]).case_()) {
            this.class_(var1, (iB_2)this.break_[32], ((AnimValue)this.break_[33]).byte_());
         }
      }));
      this.celestialSilentRotation = new rrIk_1("Silent", true);
      this.class_(this.celestialSilentRotation);
   }

   static {
      ntfClinit();
   }

   public boolean B() {
      return this.else_().class_() && C_throws.byte_().return_().class_() ? false : finally_[67];
   }

   private static void J() {
      implements_ = new byte[]{4, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 2, 2, 2, 4, 2, 3, 3, 2, 4, 6, 2, 3, 4, 5, 5, 6, 2, 7, 3, 2, 14, 7, 4, 15, -1, 2, -1, 2, 3, 36};
   }

   public rrIQ S() {
      this.u();
      return (rrIQ)this.break_[11];
   }

   public rrIk_1 this_() {
      this.u();
      return (rrIk_1)this.break_[27];
   }

   private static void x() {
      catch_ = new long[]{200L};
   }

   public boolean s() {
      return (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] && this.void_() ? true : finally_[71];
   }

   private static void c() {
      throws_ = new float[]{
         1.0F,
         0.5F,
         2.5F,
         0.1F,
         3.0F,
         1.0F,
         6.0F,
         0.1F,
         0.0F,
         0.0F,
         32.0F,
         0.5F,
         0.5F,
         2.0F,
         0.2F,
         255.0F,
         0.4F,
         0.5F,
         -0.5F,
         -0.5F,
         0.0F,
         0.0F,
         0.0F,
         0.5F,
         -0.5F,
         0.0F,
         1.0F,
         0.0F,
         0.5F,
         0.5F,
         0.0F,
         1.0F,
         1.0F,
         -0.5F,
         0.5F,
         0.0F,
         0.0F,
         1.0F,
         Float.MAX_VALUE
      };
   }

   private void h() {
      this.u();
      if (((rrIk_1)this.break_[25]).class_()) {
         for (cG_2 var2 : ((gm_3)import_.class_[56]).continue_()) {
            if (var2 instanceof cM_2 var3) {
               var3.else_();
            }
         }
      }
   }

   private void l() {
      this.u();
      this.break_(this.long_().class_((CheckGroup)this.break_[7]));
   }

   private void d() {
      this.u();
      if (((rrIk_1)this.break_[25]).class_()) {
         for (cG_2 var2 : ((gm_3)import_.class_[56]).continue_()) {
            if (var2 instanceof cM_2 var3) {
               var3.public_();
            }
         }
      }
   }

   public rrIQ interface_() {
      this.u();
      return (rrIQ)this.break_[9];
   }

   public void class_(iB_2 var1) {
      this.u();
      this.break_[32] = var1;
   }

   @Override
   public float class_(rjU_2 var1, rjU_2 var2) {
      return this.P().class_(var1, var2);
   }

   @EventTarget
   public void class_(rrAS var1) {
      this.u();
      if ((Integer)((rrnD_2)this.break_[8]).break_[5] > 0) {
         var1.class_(true);
      }
   }

   @Override
   public List<rrTA> class_(an_3 var1, rfl_3 var2) {
      return this.P().class_(var1, var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3024045055217266005L;
   }

   private void class_(Pair<iM_2, iM_2> var1) {
      this.u();
      if (var1 != null && (iB_2)this.break_[31] != null) {
         ((cb_3)import_.class_[57]).class_((iM_2)var1.getLeft());
         ((iB_2)this.break_[31]).class_((iM_2)var1.getRight());
      }
   }

   @Override
   public Pair<rrTA, rrTA> class_(an_3 var1, PX var2) {
      return this.P().class_(var1, var2);
   }

   @EventTarget
   public void class_(rrAF var1) {
      this.u();
      if ((Integer)((rrnD_2)this.break_[8]).break_[6] > 0) {
         var1.class_(false);
      }
   }

   @Override
   public boolean class_(PX var1) {
      return this.P().class_(var1);
   }

   @EventTarget
   public void class_(rrAM var1) {
      this.break_(null);
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.u();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Integer)((rrnD_2)this.break_[8]).break_[5] > 0 && ((cb_3)import_.class_[57]).BL()) {
            rrnD_2 var10000 = (rrnD_2)this.break_[8];
            Integer var7 = (Integer)((rrnD_2)this.break_[8]).break_[5] - 1;
            var10000.break_[5] = var7;
         }

         if ((Integer)((rrnD_2)this.break_[8]).break_[6] > 0) {
            rrnD_2 var9 = (rrnD_2)this.break_[8];
            Integer var8 = (Integer)((rrnD_2)this.break_[8]).break_[6] - 1;
            var9.break_[6] = var8;
         }

         if (((Ax_1)import_.class_[55]).finally_()) {
            this.break_(null);
            return;
         }

         this.h();
         this.l();
         Pair var2 = this.m();
         this.P().class_(var1);
         this.celestialApplyClientRotation();
         this.class_(var2);
         this.d();
         ((rrfP_2)this.break_[6]).class_(System.currentTimeMillis() - ((rrnD_2)this.break_[8]).protected_() > 200L ? true : finally_[53]);
      } else {
         this.P().class_(var1);
         this.celestialApplyClientRotation();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -264689968;
   }

   private void class_(RenderEvent var1, iB_2 var2, float var3) {
      this.u();
      Ml_1 var4 = var1.class_();
      float var5 = var1.byte_();
      double var6 = rrjZ_2.protected_(var2, var5);
      double var8 = rrjZ_2.break_(var2, var5);
      double var10 = rrjZ_2.byte_(var2, var5);
      float var12 = var2.Bm() / 2.0F + 0.2F;
      float var13 = var2.PN();
      int var14 = (int)(255.0F * var3);
      byte var15 = 14;
      double var16 = (double)System.currentTimeMillis() / 1000.0;
      double var18 = var16 * 3.0 % (Math.PI * 2);
      double var20 = Math.toRadians(0.0);
      double var22 = Math.toRadians(60.0);
      double var24 = (var22 - var20) / (double)var15;
      RenderSystem.disableCull();
      RenderSystem.disableAlphaTest();
      RenderSystem.disableDepthTest();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
      static_.class_((rqO_2)this.break_[4]);
      strictfp_.class_(7, ju_3.public_);
      rjY_2 var26 = void_.byte_();
      double var27 = void_.case_();
      double var29 = void_.catch_();
      double var31 = void_.private_();

      for (int var33 = 0; var33 < 4; var33++) {
         double var34 = var16 + (double)(var33 * 15);
         double var36 = (double)var33 * (Math.PI / 2);

         for (int var38 = 0; var38 <= var15; var38++) {
            double var39 = var20 + (double)var38 * var24;
            var4.class_();
            double var41 = var39 + var18 + var36;
            double var43 = var6 + (double)var13 * Math.cos(var41);
            double var45 = var8 + Math.sin(var34 + var39 + (double)var33) * 0.7 + (double)var12;
            double var47 = var10 + (double)var13 * Math.sin(var41);
            float var49 = 0.4F * (0.5F + (float)var38 / (float)var15);
            int var50 = ColorHelper.class_((float)(var38 * var15), var14);
            var4.class_(var43 - var27, var45 - var29, var47 - var31);
            var4.class_(var26);
            var4.class_(var49, var49, var49);
            rjV_2 var51 = var4.byte_().class_();
            strictfp_.class_(var51, -0.5F, -0.5F, 0.0F).class_(0.0F, 0.0F).class_(var50).class_();
            strictfp_.class_(var51, 0.5F, -0.5F, 0.0F).class_(1.0F, 0.0F).class_(var50).class_();
            strictfp_.class_(var51, 0.5F, 0.5F, 0.0F).class_(1.0F, 1.0F).class_(var50).class_();
            strictfp_.class_(var51, -0.5F, 0.5F, 0.0F).class_(0.0F, 1.0F).class_(var50).class_();
            var4.break_();
         }
      }

      default_.break_();
      RenderSystem.blendFunc(770, 771);
      RenderSystem.enableDepthTest();
      RenderSystem.enableTexture();
      RenderSystem.enableAlphaTest();
      RenderSystem.enableCull();
   }

   @EventTarget
   public void class_(rrAR var1) {
      this.u();
      if (((rrIk_1)this.break_[26]).class_() && (iB_2)this.break_[31] != null) {
         var1.class_(true);
      }
   }

   @Override
   public boolean class_(xc_3 var1) {
      this.u();
      return ((rrnK_2)this.break_[5]).class_(var1);
   }

   @Override
   public void class_(boolean var1) {
      if (this.P().aI_()) {
         super.class_(var1);
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.u();
      ((rrfP_2)this.break_[6]).class_(var1);
   }

   @EventTarget
   public void class_(rrLe_1 var1) {
      this.u();
      if (((rrIk_1)this.break_[26]).class_() && (iB_2)this.break_[31] != null) {
         var1.class_(true);
      }
   }

   private Pair<iM_2, iM_2> m() {
      this.u();
      if (!((rrIk_1)this.break_[24]).class_()) {
         return null;
      } else {
         iM_2 var1 = null;
         iM_2 var2 = null;
         if ((iB_2)this.break_[31] != null) {
            var1 = ((cb_3)import_.class_[57]).Pb();
            var2 = ((iB_2)this.break_[31]).Pb();
            if (((cb_3)import_.class_[57]).class_((iB_2)this.break_[31], iM_2.STANDING, ((iB_2)this.break_[31]).Pb())
               > ((cb_3)import_.class_[57]).class_((iB_2)this.break_[31], iM_2.FALL_FLYING, iM_2.STANDING)) {
               ((cb_3)import_.class_[57]).class_(iM_2.FALL_FLYING);
               ((iB_2)this.break_[31]).class_(iM_2.STANDING);
            } else {
               ((cb_3)import_.class_[57]).class_(iM_2.STANDING);
               ((iB_2)this.break_[31]).class_(var2);
            }
         }

         return Pair.of(var1, var2);
      }
   }

   public Y default_() {
      return (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0];
   }

   private static void v() {
      finally_ = new boolean[]{
         true,
         true,
         false,
         false,
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
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
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
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
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
         false,
         true,
         false,
         true,
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
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false
      };
   }

   public boolean short_() {
      return false;
   }

   private static void z() {
      protected_ = new short[]{
         0,
         4,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         14,
         15,
         16,
         17,
         18,
         18,
         19,
         20,
         18,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         256,
         30,
         3,
         33,
         35,
         0,
         35,
         7,
         9,
         10,
         11,
         34,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         23,
         27,
         22,
         20,
         21,
         19,
         28,
         29,
         24,
         25,
         26,
         0,
         1,
         2,
         3,
         2,
         5,
         10,
         17,
         11,
         23,
         20,
         21,
         0,
         0,
         8,
         5,
         57,
         8,
         5,
         5,
         8,
         6,
         8,
         6,
         6,
         55,
         6,
         8,
         8,
         5,
         8,
         6,
         6,
         26,
         31,
         26,
         31,
         8,
         7,
         25,
         56,
         25,
         56,
         5,
         0,
         770,
         4,
         770,
         771,
         24,
         31,
         57,
         31,
         57,
         31,
         31,
         57,
         31,
         57,
         31,
         57,
         31,
         31,
         57,
         31,
         31,
         31,
         31,
         31,
         32,
         16,
         24,
         5,
         2,
         17,
         23,
         5,
         13,
         31,
         31,
         2,
         12,
         0,
         1,
         2,
         3,
         14,
         15,
         28,
         5,
         3,
         1,
         4,
         3,
         6,
         8,
         9,
         10,
         11,
         12,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         30,
         31,
         32,
         32,
         34,
         35,
         33,
         31,
         29,
         32,
         33,
         32,
         33,
         1,
         4,
         5,
         3,
         1,
         4,
         5,
         3,
         1,
         4,
         5,
         3,
         5,
         3,
         5,
         2,
         5,
         5,
         0,
         1,
         2,
         3,
         5,
         5,
         5,
         1,
         2,
         1,
         2,
         1,
         4,
         12,
         13,
         12,
         8,
         6,
         8,
         7
      };
   }

   public boolean void_() {
      this.u();
      return this.P() == (rrCs_1)this.break_[3] ? true : finally_[73];
   }

   private void u() {
      if (this.break_ == null) {
         this.break_ = new Object[36];
      }
   }

   public rrIm_1 r() {
      this.u();
      return (rrIm_1)this.break_[16];
   }

   @Override
   public float break_() {
      return this.P().byte_();
   }

   @Override
   public float break_(rjU_2 var1, rjU_2 var2) {
      return this.P().break_(var1, var2);
   }

   public void break_(iB_2 var1) {
      this.u();
      if (var1 == null && (iB_2)this.break_[31] != null) {
         this.P().volatile_();
      }

      this.break_[31] = var1;
      if ((iB_2)this.break_[31] != null) {
         iB_2 var7 = (iB_2)this.break_[31];
         this.break_[32] = var7;
      }
   }

   @Override
   public boolean break_(PX var1) {
      return this.P().break_(var1);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{121, -31, 35, 84, -35, -16, -113, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.u();
      rrnK_2 var2 = this.P();
      if (var2.aK_()) {
         super.throws_(var1);
         this.break_(null);
      }

      var2.throws_();
      ((rrnD_2)this.break_[8]).byte_();
   }

   private boolean M() {
      return this.P().break_();
   }

   public rrnK_2 P() {
      this.u();
      return (rrnK_2)this.break_[5];
   }

   @Override
   public rrTp_1 catch_() {
      this.u();
      if (((rrIk_1)this.break_[13]).class_() && (iB_2)this.break_[31] != null) {
         for (rdn_3 var4 : rrfH_2.class_((iB_2)this.break_[31])) {
            if (var4.break_() == rdy_3.OM || var4.break_() == rdy_3.kU || var4.break_() == rdy_3.kY) {
               return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[2];
            }
         }
      }

      String var5 = ((rrIQ)this.break_[12]).byte_();

      return switch (var5) {
         case "Незаметный" -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0];
         case "Строгий" -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[1];
         case "Таргет" -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[2];
         default -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
      };
   }

   public float G() {
      this.u();
      if (this.short_()) {
         return Float.MAX_VALUE;
      } else {
         return !this.M() && (rrnK_2)this.break_[5] != (rrna_3)this.break_[2] ? this.try_() + ((rrIm_1)this.break_[17]).byte_() : this.try_();
      }
   }

   public rrIQ goto_() {
      this.u();
      return (rrIQ)this.break_[10];
   }

   public rrfP_2 const_() {
      this.u();
      return (rrfP_2)this.break_[6];
   }

   public iB_2 continue_() {
      this.u();
      return (iB_2)this.break_[31];
   }

   public rrIk_1 else_() {
      this.u();
      return (rrIk_1)this.break_[21];
   }

   public rrne_3 for_() {
      this.u();
      return (rrne_3)this.break_[35];
   }

   public rrIk_1 import_() {
      this.u();
      return (rrIk_1)this.break_[19];
   }

   public rrIk_1 instanceof_() {
      this.u();
      return (rrIk_1)this.break_[20];
   }

   public lD_2 new_() {
      this.u();
      return (lD_2)this.break_[30];
   }

   public rrIQ return_() {
      this.u();
      return (rrIQ)this.break_[12];
   }

   public rrIk_1 super_() {
      this.u();
      return (rrIk_1)this.break_[26];
   }

   public rrIk_1 switch_() {
      this.u();
      return (rrIk_1)this.break_[23];
   }

   public boolean throw_() {
      this.u();
      return ((rrIk_1)this.break_[24]).class_();
   }

   public float try_() {
      this.u();
      return ((rrIm_1)this.break_[16]).byte_();
   }

   public rrIm_1 while_() {
      this.u();
      return (rrIm_1)this.break_[17];
   }

   public GroupSetting static_() {
      this.u();
      return (GroupSetting)this.break_[34];
   }

   public rrIk_1 public_() {
      this.u();
      return (rrIk_1)this.break_[18];
   }

   @Override
   public float private_() {
      return this.P().int_();
   }

   public rrIk_1 abstract_() {
      this.u();
      return (rrIk_1)this.break_[28];
   }

   public rrIk_1 transient_() {
      this.u();
      return (rrIk_1)this.break_[25];
   }

   @Override
   public iB_2 native_() {
      this.u();
      return !((rrIk_1)this.break_[28]).class_() ? null : this.continue_();
   }

   public rrIk_1 strictfp_() {
      this.u();
      return (rrIk_1)this.break_[24];
   }

   public iB_2 E() {
      this.u();
      return (iB_2)this.break_[32];
   }

   private static void X() {
      private_ = new String[]{
         new String("Attack Aura"),
         new String("Автоматически бьет окружающих\nвас существ"),
         new String("celestial/images/glow.png"),
         new String("Сортировка"),
         new String("Умная"),
         new String("Умная"),
         new String("Поле зрения"),
         new String("Дистанция"),
         new String("Здоровье"),
         new String("Режим"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Matrix"),
         new String("Snap"),
         new String("SpookyTime"),
         new String("Обход спринта"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Legit"),
         new String("change_mode"),
         new String("Режим"),
         new String("Незаметный"),
         new String("Незаметный"),
         new String("Строгий"),
         new String("Таргет"),
         new String("Свободный"),
         new String("Таргетить если у цели\nлук, арбалет или трезубец"),
         new String("Заходить за спину цели"),
         new String("Дистанция за спиной"),
         new String("Дистанция удара"),
         new String("Дистанция наводки"),
         new String("Только криты"),
         new String("Только с пробелом"),
         new String("Останавливать при\nиспользовании предмета"),
         new String("Останавливать при\nоткрытом контейнере"),
         new String("Бить через щит"),
         new String("Бить через стены"),
         new String("Дистанция под Grim"),
         new String("Убирать интерполяцию у\nэнтити"),
         new String("Убирать взаимодействие с\nблоками и энтити"),
         new String("Ломать щит"),
         new String("Таргет-HUD"),
         new String("ESP"),
         new String("Цели"),
         new String("Выбор"),
         new String("Обходы"),
         new String("Коррекция движения"),
         new String("Дистанции"),
         new String("Удары"),
         new String("Криты"),
         new String("Визуалы"),
         new String("Отображать"),
         new String("Другие"),
         new String("change_mode"),
         new String("Незаметный"),
         new String("Строгий"),
         new String("Таргет"),
         new String("Legit"),
         new String("Matrix"),
         new String("Snap"),
         new String("Funtime"),
         new String("SpookyTime"),
         new String("Таргет"),
         new String("Таргет")
      };
   }

   private static void Q() {
      byte_ = new double[]{1000.0, 3.0, Math.PI * 2, 0.0, 60.0, Math.PI / 2, 0.7};
   }

   @Override
   public boolean az_() {
      this.u();
      return ((rrIk_1)this.break_[14]).class_();
   }

   @Override
   public rrTH aE_() {
      return this.P().package_();
   }

   @Override
   public rrTf_1 aL_() {
      return this.P().protected_();
   }

   @Override
   public boolean aC_() {
      this.u();
      return !((rrIk_1)this.break_[23]).class_() ? true : finally_[62];
   }

   @Override
   public float aD_() {
      this.u();
      return ((rrIm_1)this.break_[15]).byte_();
   }

   @Override
   public rrTq_1 aB_() {
      return this.P().case_();
   }

   @Override
   public rrTj_1 aF_() {
      return this.P().final_();
   }

   @Override
   public rrTH aA_() {
      return this.P().finally_();
   }

   public boolean celestialSilentRotation() {
      return this.celestialSilentRotation.class_();
   }

   private void celestialApplyClientRotation() {
      if (!this.celestialSilentRotation() && this.continue_() != null) {
         PX var1 = this.P().private_();
         if (var1 != null) {
            ((cb_3)import_.class_[57]).case_(var1.throws_(), var1.protected_());
         }
      }
   }
}
