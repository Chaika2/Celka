package celestial;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNW extends rrNO {
   private static short[] throws_;
   public Object[] byte_;
   private static byte[] case_;
   private static boolean[] catch_;
   public static Object[] protected_;
   private static double[] private_;
   private static long[] implements_;
   private static String[] finally_;
   private static float[] extends_;

   public List<rrNm_1> boolean_() {
      this.k();
      return (List<rrNm_1>)this.byte_[7];
   }

   public rrNV char_() {
      this.k();
      return (rrNV)this.byte_[31];
   }

   public void byte_(boolean var1) {
      ((Qw_1)import_.class_[20]).rB = var1;
      if (((Qw_1)import_.class_[20]).rB) {
         this.n();
      } else {
         this.m();
      }
   }

   public boolean byte_(rrNV var1) {
      return !(var1 instanceof rrNC) && !(var1 instanceof rrNq_1) ? catch_[86] : catch_[85];
   }

   public rdn_3 byte_(List<rdn_3> var1) {
      ArrayList var2 = new ArrayList();

      for (rdn_3 var4 : var1) {
         String var5 = var4.continue_().byte_();
         if (var5.equals("[Кyпить]")) {
            var2.add(var4);
         }
      }

      if (var2.isEmpty()) {
         return null;
      } else {
         return var2.size() == 1 ? (rdn_3)var2.get(0) : (rdn_3)var2.get(((Random)protected_[0]).nextInt(var2.size()));
      }
   }

   private static long byte_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8019826604759080696L;
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-106, -91, -102, -67, -2, -19, -25, 93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public List<rJY> int_() {
      this.k();
      return (List<rJY>)this.byte_[6];
   }

   public rrNV long_() {
      this.k();
      return (rrNV)this.byte_[25];
   }

   public void float_() {
      this.class_(0L);
   }

   public boolean double_() {
      this.k();
      return System.currentTimeMillis() >= this.byte_[35] ? true : catch_[6];
   }

   public rrNW(C_class var1) {
      super(var1, (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2], (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]);
      this.k();
      ArrayList var6 = new ArrayList();
      this.byte_[5] = var6;
      ArrayList var7 = new ArrayList();
      this.byte_[6] = var7;
      ArrayList var8 = new ArrayList();
      this.byte_[7] = var8;
      rrfw_3 var9 = new rrfw_3();
      this.byte_[16] = var9;
      ArrayList var10 = new ArrayList();
      this.byte_[18] = var10;
      ArrayList var11 = new ArrayList();
      this.byte_[19] = var11;
      ArrayList var12 = new ArrayList();
      this.byte_[20] = var12;
      rrfw_3 var13 = new rrfw_3();
      this.byte_[21] = var13;
      Integer var14 = this.E();
      this.byte_[22] = var14;
      rrfw_3 var15 = new rrfw_3();
      this.byte_[29] = var15;
      Integer var16 = 1;
      this.byte_[32] = var16;
   }

   static {
      ntfClinit();
   }

   public LZ B() {
      this.k();
      return (LZ)this.byte_[3];
   }

   private boolean C() {
      if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         return catch_[31];
      } else {
         int var1 = 0;

         for (int var2 = 0; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            if (var3.break_() instanceof rxJ_2 var4 && var4.catch_() instanceof Wp_1) {
               var1++;
            }

            if (var1 >= 3) {
               break;
            }
         }

         return var1 == 3 ? true : catch_[30];
      }
   }

   private void F() {
      this.k();
      if ((rrNu_1)this.byte_[30] != null) {
         switch (((int[])rrNc_1.class_[0])[((rrNu_1)this.byte_[30]).ordinal()]) {
            case 1:
               if (((rrfw_3)this.byte_[29]).class_(1000.0)) {
                  rrNV var5 = (rrNV)this.byte_[12];
                  this.byte_[31] = var5;
                  if (this.h()) {
                     Integer var6 = (Integer)this.byte_[32] + 1;
                     this.byte_[32] = var6;
                  }

                  ((rrfw_3)this.byte_[29]).class_();
               }
               break;
            case 2:
               if ((rrNV)this.byte_[31] != null && ((rrfw_3)this.byte_[29]).class_(1000.0)) {
                  this.throws_((rrNV)this.byte_[31]);
                  ((rrfw_3)this.byte_[29]).class_();
               }
         }
      }
   }

   private static void J() {
      implements_ = new long[]{0L, 0L, 0L, 1000L, 0L, 0L, 0L, 0L, 1000L, 100L, 0L, 0L, 450L, 0L, 0L, 0L, 0L};
   }

   public rrNd_1 S() {
      this.k();
      return (rrNd_1)this.byte_[8];
   }

   private static void Z() {
      finally_ = new String[]{
         new String(" "),
         new String(" "),
         new String("Auto Parser"),
         new String("Нету предметов для парсинга"),
         new String("Auto Parser"),
         new String("ru_ru"),
         new String("Auto Parser: Был замечен фейк \""),
         new String("\" за "),
         new String("Auto Buy: Нет проверяющих клиентов"),
         new String("Этот товар уже Купили"),
         new String("Вы успешно купили"),
         new String("Этот товар уже Купили"),
         new String("Anti Delay: Произошла ошибка #1, обратитесь в тикет чтобы решить проблему"),
         new String("Auto Parser"),
         new String("Auto Parser"),
         new String("Auto Parser"),
         new String("Auto Parser"),
         new String("Auto Parser"),
         new String("сфера"),
         new String("талисман"),
         new String("Хранилище"),
         new String("Хранилище"),
         new String("[»] Следующая страница"),
         new String("[⟲] Обновить"),
         new String("[Кyпить]"),
         new String("autobuy.antiDelay"),
         new String("autobuy.parsePrices"),
         new String("autobuy.parsedPricesDecreasePercentage"),
         new String("autobuy.refreshDelay"),
         new String("/ah"),
         new String("Auto Parser"),
         new String("Для работы парсера необходимо включить предметы"),
         new String("Auto Parser"),
         new String("Парсинг цен завершен"),
         new String("Auto Parser: Парсинг цен завершен"),
         new String(""),
         new String("Auto Parser: Парсинг "),
         new String("предмета"),
         new String("предмета"),
         new String("предметов"),
         new String("предметов"),
         new String(" завершен за "),
         new String("%.1f%s"),
         new String("с"),
         new String("autobuy.refreshDelay"),
         new String("autobuy.parsedPricesDecreasePercentage"),
         new String("Auto Parser"),
         new String("Ай-яй-яй, зачем нажимать сюда, если включен авто парсер?!"),
         new String("Auto Parser"),
         new String("autobuy.autoBuyDisabled"),
         new String("Auto Buy"),
         new String("трапка"),
         new String("trap"),
         new String("spooky-item"),
         new String("незеритовый лом"),
         new String("trap"),
         new String("spooky-item"),
         new String("AttributeModifiers"),
         new String("Auto Parser")
      };
   }

   public rrNF this_() {
      this.k();
      return (rrNF)this.byte_[11];
   }

   public rgP_2 b() {
      this.k();
      return (rgP_2)this.byte_[34];
   }

   private static void x() {
      private_ = new double[]{300.0, 1000.0, 1000.0, 0.0, 99.0, 0.0, 3000.0, 1000.0};
   }

   public rrNd_1 s() {
      this.k();
      return (rrNd_1)this.byte_[10];
   }

   private static void c() {
      extends_ = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   }

   private void n() {
   }

   private boolean h() {
      this.k();
      PI var1 = C_throws.byte_().native_().protected_();
      rrjx_3 var2 = rrjS_2.class_(var1, (Integer)this.byte_[32]);
      if (var2 == null) {
         rrfu_3.byte_("Anti Delay: Произошла ошибка #1, обратитесь в тикет чтобы решить проблему");
         return false;
      } else {
         String var3 = var2.class_();
         int var4 = var2.break_();
         ((cb_3)import_.class_[57]).protected_("/" + var3 + var4);
         rrfu_3.byte_("Anti Delay: Переподключение на " + var3 + var4);
         return true;
      }
   }

   private int l() {
      return (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] ? 300 : (int)((Qw_1)import_.class_[20]).rr;
   }

   private void d() {
      this.k();
      AutoBuy var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d();
      boolean var2 = var1.aJ_();
      if ((LF)this.byte_[0] != null) {
         ((LF)this.byte_[0]).int_ = var2;
      }
   }

   public LZ interface_() {
      this.k();
      return (LZ)this.byte_[4];
   }

   private void class_(Fc_1 var1, String var2) {
      this.k();
      boolean var3 = this.case_();
      if (var3) {
         Pj_1 var4 = C_throws.byte_().package_();
         rXe_1 var5 = var1.G_();
         rqs_3 var6 = var5.extends_();
         int var7 = ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_;
         boolean var8 = this.class_((rrNV)this.byte_[12]);
         boolean var9 = this.break_((rrNV)this.byte_[12]);
         boolean var10 = this.break_() && !this.class_(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d().super_())
            ? catch_[14]
            : catch_[13];
         if (var8) {
            if (!((List)this.byte_[7]).isEmpty()) {
               return;
            }

            if (this.class_(var7, true)) {
               return;
            }
         } else if (var9) {
            rdn_3 var13 = this.byte_(var6);
            int var12 = var6.indexOf(var13);
            if (var12 != -1) {
               ((Ax_1)import_.class_[55]).class_(var7, var12, 2, rXa_1.CLONE);
            }

            return;
         }

         FtHelper var11 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().default_();
         if (var11.aJ_() && var11.continue_()) {
            if (var4.byte_() && this.double_()) {
               this.break_(var1, var4, var6, var2, var7);
               return;
            }

            if ((Boolean)this.byte_[15]) {
               this.class_(var1, var4, var6, var2, var7);
               return;
            }
         }

         if (var8 && ((rrfw_3)this.byte_[16]).class_((double)this.l()) && (((Qw_1)import_.class_[20]).rP || var10)) {
            this.class_(var1, var6, var7);
            ((rrfw_3)this.byte_[16]).class_();
         }
      }
   }

   @Override
   public void class_() {
      this.k();
      super.class_();
      rrFe_1.class_((rrNV)this.byte_[12], (rrFa_1)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[1]);
      Object var5 = null;
      this.byte_[30] = var5;
      Object var6 = null;
      this.byte_[31] = var6;
      Integer var7 = 1;
      this.byte_[32] = var7;
      Boolean var8 = false;
      this.byte_[14] = var8;
      Object var9 = null;
      this.byte_[8] = var9;
      Long var10 = 0L;
      this.byte_[33] = var10;
      this.continue_();
      ((rrfw_3)this.byte_[16]).class_();
      ((List)this.byte_[5]).clear();
      ((List)this.byte_[7]).clear();
      ((List)this.byte_[6]).clear();
   }

   @Override
   public void class_(rrAT var1) {
      this.k();
      if ((rrNV)this.byte_[12] != null) {
         if (var1.class_() instanceof rXe_1 var2) {
            List var18 = var1.byte_();
            ((List)this.byte_[5]).clear();
            ((List)this.byte_[6]).clear();
            ((List)this.byte_[7]).clear();

            for (rJY var5 : var18) {
               if (var5.break_() && var5.byte_ == var2.class_() && var5.protected_ <= 44) {
                  ((List)this.byte_[6]).add(var5);
                  rrNt_1 var6 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[0]).break_(var5);
                  if (var6 != null) {
                     String var7 = var6.catch_();
                     int var8 = var6.case_();
                     if (var7 != null && var8 != -1) {
                        var6.class_((rrNV)this.byte_[12]);
                        var6.class_(var5.class_().implements_());
                        ((List)this.byte_[5]).add(var6);
                     }
                  }
               }
            }

            Boolean var17 = true;
            this.byte_[27] = var17;
            if (((List)this.byte_[5]).isEmpty() && !((List)this.byte_[19]).isEmpty()) {
               ((List)this.byte_[19]).clear();
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Auto Parser", "Нету предметов для парсинга", 3000));
               this.class_(1);
            } else if (!((List)this.byte_[19]).isEmpty() && (rrNv_1)this.byte_[23] != null) {
               for (rrNZ var20 : (List)this.byte_[19]) {
                  if (((List)this.byte_[20]).contains(var20)) {
                     ((List)this.byte_[19]).remove(var20);
                  } else {
                     rrNd_1 var21 = var20.byte_();
                     rrNw_1 var22 = var20.class_();
                     if (var22 != null) {
                        rdn_3 var23 = var22.protected_();
                        boolean var9 = false;

                        for (rrNt_1 var11 : (List)this.byte_[5]) {
                           rdn_3 var12 = var11.protected_();
                           if (var12.break_() == var23.break_()
                              && var12.continue_().byte_().equals(var23.continue_().byte_())
                              && var11.catch_().equals(var22.catch_())
                              && var11.case_() == var22.case_()) {
                              var9 = true;
                              break;
                           }
                        }

                        if (var9) {
                           var21.break_(var20.break_());
                           ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
                              .class_(new rrtQ_2("Auto Parser", "Новая цена на \"" + var21.case_() + "\" - " + rql_3.class_(var21.else_(), ' ') + "$", 3000));
                           this.class_(1);
                           ((List)this.byte_[19]).remove(var20);
                           ((List)this.byte_[20]).add(var20);
                        } else {
                           ((List)this.byte_[19]).remove(var20);
                           Object var24;
                           if (var23.this_()) {
                              var24 = var23.continue_();
                           } else {
                              var24 = new rgN_2(jI_2.class_("ru_ru", var23.finally_()));
                           }

                           rVi_1 var25 = new rgN_2("Auto Parser: Был замечен фейк \"")
                              .class_(rgF_2.GRAY)
                              .class_((rgP_2)var24)
                              .break_("\" за ")
                              .class_(new rgN_2(rql_3.class_(var22.case_(), ' ') + "$").class_(rgF_2.RED));
                           rrfu_3.class_(var25);
                           this.class_((rrNv_1)this.byte_[23], Collections.singletonList(var21), ((rrNV)this.byte_[12]).class_().byte_(), this.break_());
                        }
                        break;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void class_(rrAK var1) {
      if (this.case_() || this.private_()) {
         var1.class_(true);
      }
   }

   @Override
   public void class_(Fu_1<?> var1, rrNV var2) {
      this.k();
      String var3 = var1.new_().byte_();
      int var4 = var1.package_;
      int var5 = var1.int_;
      int var6 = var1.synchronized_;
      int var7 = var1.return_;
      int var8 = (var4 - var6) / 2;
      int var9 = (var5 - var7) / 2;
      List var10 = this.class_(var1, var3, var8, var9, var6);
      if (this.byte_(var2)) {
         for (int var11 = 0; var11 < var10.size(); var11++) {
            LZ var12 = (LZ)var10.get(var11);
            int var13 = var8 + var6 + 5;
            int var14 = var9 + 23 * var11 + 20;
            var12.volatile_ = var13;
            var12.final_ = var14;
            var1.class_(var12);
         }
      }

      if (this.class_(var2)) {
         rrNz_1 var19 = new rrNz_1(this, var4 / 2 - 52, var9 - 25, 105, 20, rgN_2.byte_, var1x -> {
            try {
               this.implements_();
            } catch (IllegalStateException var3x) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Auto Buy", var3x.getMessage(), 3000));
            }
         }, (var1x, var2x, var3x, var4x) -> {
            AutoBuy var5x = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d();
            boolean var6x = var5x.aJ_();
            if (!var6x) {
               var1.class_(var2x, new rgn_3("autobuy.autoBuyDisabled"), var3x, var4x);
            }
         });
         this.byte_[0] = var19;
         var1.class_((LF)this.byte_[0]);
      }

      this.d();
   }

   @Override
   public void class_(rrFK var1) {
      this.catch_();
   }

   public void class_(Fc_1 var1, Pj_1 var2, rqs_3<rdn_3> var3, String var4, int var5) {
      this.k();
      if (!var4.contains("Хранилище")) {
         Boolean var12 = false;
         this.byte_[15] = var12;
      } else {
         rdn_3 var6 = var2.byte_(var3);
         if (var6 != null) {
            int var7 = var1.throw_();
            if (var7 > 0 && var7 % 5 == 0) {
               ((Ax_1)import_.class_[55]).class_(var5, var3.indexOf(var6), 2, rXa_1.CLONE);
            }
         }
      }
   }

   @Override
   public void class_(q_1 var1) {
      this.k();
      super.class_(var1);
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         this.F();
         this.z();
         Boolean var6 = this.case_() && this.C() ? true : catch_[8];
         this.byte_[37] = var6;
      }
   }

   @Override
   public void class_(rrFo_1 var1) {
      this.k();
      Object var6 = null;
      this.byte_[8] = var6;
      ((List)this.byte_[7]).clear();
      ((List)this.byte_[5]).clear();
      ((List)this.byte_[6]).clear();
      Object var7 = null;
      this.byte_[34] = var7;
      if ((rrNV)this.byte_[12] != null) {
         rrNV var8 = (rrNV)this.byte_[12];
         this.byte_[13] = var8;
      }

      if (!((rrNV)this.byte_[12] instanceof rrNT)) {
         Boolean var9 = false;
         this.byte_[15] = var9;
      }

      if (this.case_() && (Boolean)this.byte_[17]) {
         var1.class_(true);
         Boolean var10 = false;
         this.byte_[17] = var10;
      }

      Object var11 = null;
      this.byte_[12] = var11;
   }

   private void class_(Fc_1 var1, rqs_3<rdn_3> var2, int var3) {
      this.k();
      rdn_3 var4 = this.class_(var1, var2, (rrNV)this.byte_[12]);
      int var5 = var2.indexOf(var4);
      if (var5 != -1) {
         ((Ax_1)import_.class_[55]).class_(var3, var5, 2, rXa_1.CLONE);
         rrFe_1.class_((rrNV)this.byte_[12], (rrFa_1)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[0]);
      }
   }

   @Override
   public void class_(rrLu_1 var1) {
      this.k();
      ruS_2 var2 = var1.class_();
      if (var2 instanceof rvt_3 var3) {
         rqA_2 var4 = var3.break_();
         if (var4 == rqn_3.Mu && this.private_()) {
            Integer var9 = 3000;
            this.byte_[22] = var9;
            Boolean var10 = false;
            this.byte_[28] = var10;
         }

         if ((var4 == rqn_3.Mu || var4 == rqn_3.BC || var4 == rqn_3.dw) && this.case_()) {
            var1.class_(true);
         }
      } else if (var2 instanceof rZU) {
         Boolean var11 = true;
         this.byte_[17] = var11;
      }
   }

   public rdn_3 class_(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.continue_().byte_();
         if (var4.equals("[»] Следующая страница")) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public void class_(rrAM var1) {
      this.k();
      if ((rrNu_1)this.byte_[30] == (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[0]) {
         rrNu_1 var6 = (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[1];
         this.byte_[30] = var6;
         ((rrfw_3)this.byte_[29]).class_();
         Integer var7 = 1;
         this.byte_[32] = var7;
      } else {
         this.catch_();
      }
   }

   private void class_(Fc_1 var1) {
      this.k();
      if ((rgP_2)this.byte_[34] != null) {
         rVi_1 var2 = ((rgP_2)this.byte_[34]).case_();
         if ((rrNV)this.byte_[12] instanceof rrNC && this.case_()) {
            var2.break_(" ").class_(new rgN_2("[⌚ " + this.L() + "]").break_(rgF_2.YELLOW));
         } else if ((rrNV)this.byte_[12] instanceof rrNq_1 && this.private_()) {
            int var3 = ((List)this.byte_[18]).size();
            int var4 = Math.min((Integer)this.byte_[26] + 1, var3);
            var2.break_(" ").class_(new rgN_2("[" + var4 + "/" + var3 + "]").break_(rgF_2.YELLOW));
         }

         var1.class_(var2);
      }
   }

   @Override
   public void class_(rrLU var1) {
      this.k();
      if (var1.class_() instanceof Fc_1 var2 && (rrfq_3)rrfp_3.class_[1] != null) {
         rgP_2 var17 = var2.new_();
         if (this.finally_().contains((rrfq_3)rrfp_3.class_[1])) {
            rrNV var10 = this.class_(var17);
            this.byte_[12] = var10;
            this.class_(var2, (rrNV)this.byte_[12]);
         }

         rgP_2 var11 = !((rrNV)this.byte_[12] instanceof rrNC) && !((rrNV)this.byte_[12] instanceof rrNq_1) ? null : var17;
         this.byte_[34] = var11;
         this.class_(var2);
         if ((rrNV)this.byte_[12] != null && this.import_() && this.case_()) {
            if ((rrNu_1)this.byte_[30] == null && this.public_()) {
               rrNu_1 var12 = (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[0];
               this.byte_[30] = var12;
            } else if ((rrNu_1)this.byte_[30] == (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[1] && (rrNV)this.byte_[12] != null) {
               ((rrfw_3)this.byte_[29]).class_();
               Object var13 = null;
               this.byte_[30] = var13;
            }
         }

         if (!((rrNV)this.byte_[12] instanceof rrNH)) {
            Object var14 = null;
            this.byte_[9] = var14;
         }

         Boolean var15 = false;
         this.byte_[27] = var15;
         Boolean var16 = false;
         this.byte_[28] = var16;
         ((rrfw_3)this.byte_[21]).class_();
         if (this.break_()) {
            rrTU var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d().super_();
            if ((rrNV)this.byte_[12] != null && this.case_() && var4 != null) {
               List var5 = var4.break_();
               if (var5.isEmpty()) {
                  rrfu_3.byte_("Auto Buy: Нет проверяющих клиентов");
               }
            }
         }
      }
   }

   @Override
   public void class_(rrLc_1 var1) {
      this.k();
      rrTi_1 var2 = var1.class_();
      if (var2 instanceof rrtS_2 var3) {
         rdn_3 var5 = var3.byte_();
         String var6 = var3.class_();
         int var7 = var3.protected_();
         rrts_3 var8 = var3.throws_();

         for (rrNm_1 var10 : (List)this.byte_[7]) {
            rrNd_1 var11 = var10.class_();
            rrNw_1 var12 = var11.break_();
            if (var12 != null) {
               rdn_3 var13 = var12.protected_();
               if (var13.break_() == var5.break_()
                  && var12.case_() == var7
                  && var12.catch_().equals(var6)
                  && var13.continue_().byte_().equals(var5.continue_().byte_())) {
                  if (var8 == (rrts_3)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[0]) {
                     this.byte_[8] = var11;
                     ((List)this.byte_[7]).clear();
                  } else {
                     ((List)this.byte_[7]).remove(var10);
                  }
                  break;
               }
            }
         }
      } else if (var2 instanceof rrtG_2 var4) {
         rrTU var20 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d().super_();
         String var21 = var4.break_();
         rrtb_3 var22 = var4.class_();

         for (rrTY var24 : var20.break_()) {
            String var25 = var24.byte_();
            if (var25.equals(var21)) {
               var24.class_(var22);
               if (var22 != (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[0]
                  && ((List)this.byte_[7]).removeIf(var1x -> var1x.break_().equals(var21))) {
                  Object var19 = null;
                  this.byte_[8] = var19;
               }
               break;
            }
         }
      }
   }

   private List<rrNd_1> class_(List<rrNd_1> var1, String var2, boolean var3) {
      List var4;
      if (var3) {
         var4 = var1.stream().filter(var0 -> var0.while_() && var0.class_() ? true : catch_[129]).toList();
      } else {
         var4 = var1;
      }

      return var4.stream().filter(var1x -> var1x.private_().stream().anyMatch(var1xx -> var1xx.toLowerCase().startsWith(var2.toLowerCase()))).toList();
   }

   private boolean class_(int var1, boolean var2) {
      this.k();
      if (var2 && (rrNd_1)this.byte_[8] != null) {
         rrNw_1 var3 = ((rrNd_1)this.byte_[8]).break_();
         if (var3 == null) {
            return true;
         } else {
            rJY var4 = var3.throws_();
            rdn_3 var5 = var4.class_();
            ((Ax_1)import_.class_[55]).break_(var1, var4.protected_, 0, rXa_1.QUICK_MOVE, true);
            rrNF var10 = new rrNF(this, (rrNd_1)this.byte_[8]);
            this.byte_[11] = var10;
            rrNd_1 var11 = (rrNd_1)this.byte_[8];
            this.byte_[9] = var11;
            rrNd_1 var12 = (rrNd_1)this.byte_[9];
            this.byte_[10] = var12;
            Object var13 = null;
            this.byte_[8] = var13;
            return true;
         }
      } else {
         return catch_[20];
      }
   }

   @Override
   public void class_(rrLh_1 var1) {
      if (var1.protected_() == null) {
         String var2 = var1.class_();
         this.throws_(var2);
         if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] && (this.case_() || this.private_())) {
            Matcher var3 = ((Pattern)rrjE_2.class_[12]).matcher(var2);
            if (var3.find()) {
               try {
                  this.class_(Long.parseLong(var3.group(catch_[43])) * implements_[8] + implements_[9]);
               } catch (NumberFormatException var5) {
               }
            }

            if (var2.contains("Этот товар уже Купили") && this.case_()) {
               this.float_();
            }
         }
      }
   }

   private boolean class_(rrNd_1 var1, rrNt_1 var2) {
      if (var1.catch_() instanceof rxJ_2 var3
         && var3.catch_() instanceof Wp_1
         && var2.protected_().break_() instanceof rxJ_2 var4
         && var4.catch_() instanceof Wp_1
         && this.class_(var2)) {
         return true;
      }

      return var1.while_() && var1.class_(var2, null) ? true : catch_[46];
   }

   @Override
   public void class_(rrAq_1 var1) {
      this.k();
      if (var1.break_() instanceof rXe_1 var2) {
         if (!this.case_() || !this.class_((rrNV)this.byte_[12]) || ((List)this.byte_[5]).isEmpty() || ((List)this.byte_[6]).isEmpty()) {
            return;
         }

         rJY var20 = var1.class_();
         if (!var20.break_()) {
            return;
         }

         if (var20.byte_ != var2.class_()) {
            return;
         }

         rrTU var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d().super_();
         if (var4 == null) {
            return;
         }

         rrNt_1 var5 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[0]).break_(var20);
         if (var5 == null) {
            return;
         }

         String var6 = var5.catch_();
         int var7 = var5.case_();
         if (var7 == -1 || var6 == null) {
            return;
         }

         var5.class_((rrNV)this.byte_[12]);
         var5.class_(var20.class_().implements_());
         var5.class_((List<rrNt_1>)this.byte_[5]);
         var5.break_((List<rJY>)this.byte_[6]);
         ArrayList var8 = new ArrayList();

         for (rrNd_1 var10 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).protected_()) {
            if ((!(var5.protected_().break_() instanceof rxJ_2 var11) || !(var11.catch_() instanceof Wp_1) || !(Boolean)this.byte_[37])
               && this.class_(var10, var5)) {
               var10.class_(var5);
               var8.add(var10);
            }
         }

         if (var8.size() > 1) {
            var8.sort(Comparator.naturalOrder());
         }

         if (!var8.isEmpty()) {
            rrNd_1 var21 = ((rrNd_1)var8.get(0)).byte_();
            rrNw_1 var22 = var21.break_();
            if (var22 == null) {
               return;
            }

            if (!this.break_() || var21.implements_()) {
               if ((rrNd_1)this.byte_[8] == null) {
                  this.byte_[8] = var21;
                  if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
                     this.class_(var2.case_, true);
                  }
               }

               return;
            }

            List var23 = var4.break_();
            if (((List)this.byte_[7]).size() >= var23.size()) {
               return;
            }

            List var24 = var4.class_(var1x -> {
               this.k();
               if (var1x.class_() != (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[0]) {
                  return false;
               } else if (rqR_2.break_() - var1x.break_() < 0L) {
                  return false;
               } else {
                  if (!((List)this.byte_[7]).isEmpty()) {
                     for (rrNm_1 var3 : (List)this.byte_[7]) {
                        if (var3.break_().equals(var1x.byte_())) {
                           return false;
                        }
                     }
                  }

                  return catch_[138];
               }
            });
            if (var24.isEmpty()) {
               return;
            }

            rrTY var13 = (rrTY)var24.get(0);
            rrNm_1 var14 = new rrNm_1(var21, var13.byte_());
            if (!((List)this.byte_[7]).contains(var14)) {
               var4.class_(new rrtM_2(var22.protected_(), var21.abstract_(), var22.catch_(), var22.case_()), var13.protected_().channel(), true);
               var13.class_(rqR_2.break_());
               ((List)this.byte_[7]).add(var14);
            }
         }
      }
   }

   public boolean class_(rrNt_1 var1) {
      return this.break_(var1) >= var1.case_() ? true : catch_[94];
   }

   public void class_(long var1) {
      this.k();
      Long var7 = System.currentTimeMillis() + Math.max(0L, var1);
      this.byte_[36] = var7;
      if (var1 > 0L) {
         rrfu_3.byte_("AutoBuy: Окно аукциона будет автоматически открыто через " + var1 / 1000L + " секунд");
      }
   }

   public rdn_3 class_(Fc_1 var1, List<rdn_3> var2, rrNV var3) {
      this.k();
      String var4 = var1.new_().byte_();
      if (this.case_() && var3 instanceof rrNq_1 && !(Boolean)this.byte_[14]) {
         Matcher var5 = ((Pattern)rrjE_2.class_[10]).matcher(var4);
         if (var5.find()) {
            String var6 = var5.group(2);
            String var7 = var5.group(3);
            if (!var6.equals(var7)) {
               return this.class_(var2);
            }

            Boolean var12 = true;
            this.byte_[14] = var12;
         }
      }

      return this.break_(var2);
   }

   @Override
   public void class_(rrFY var1) {
      this.k();
      if ((rrNV)this.byte_[12] != null) {
         this.catch_();
      }
   }

   public rrNV class_(rgP_2 var1) {
      String var2 = var1.byte_();
      String var3 = var2.toLowerCase();
      Matcher var4 = ((Pattern)rrjE_2.class_[9]).matcher(var2);
      Matcher var5 = ((Pattern)rrjE_2.class_[11]).matcher(var2);
      Matcher var6 = ((Pattern)rrjE_2.class_[10]).matcher(var2);
      if (var4.find()) {
         long var12 = Long.parseLong(var4.group(1));
         long var9 = Long.parseLong(var4.group(2));
         return new rrNy_1(var1, var12, var9);
      } else if (var5.find()) {
         String var11 = var5.group(1);
         return new rrNp_1(var1, var11);
      } else if (var6.find()) {
         String var7 = var6.group(1);
         return new rrNq_1(var1, var7);
      } else if (Arrays.<String>stream((String[])rrjE_2.class_[13]).anyMatch(var3::contains)) {
         return new rrNT(var1);
      } else if (Arrays.<String>stream((String[])rrjE_2.class_[14]).anyMatch(var3::contains)) {
         return new rrNH(var1);
      } else {
         return Arrays.stream((String[])rrjE_2.class_[15]).anyMatch(var3::contains) ? new rrNl_1(var1) : null;
      }
   }

   public boolean class_(rrNV var1) {
      return !(var1 instanceof rrNC) && !(var1 instanceof rrNq_1) ? catch_[84] : catch_[83];
   }

   public void class_(int var1) {
      this.k();
      Integer var6 = (Integer)this.byte_[26] + var1;
      this.byte_[26] = var6;
   }

   public void class_(rrNv_1 var1, List<rrNd_1> var2, String var3, boolean var4) {
      this.k();
      Matcher var5 = ((Pattern)rrjE_2.class_[10]).matcher(var3);
      if (var5.find()) {
         String var6 = var5.group(1);
         List var7 = this.class_(var2, var6, var1.class_());
         if (var7.isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Auto Parser", "Не удалось найти \"" + var6 + "\"", 3000));
            this.class_(1);
            return;
         }

         if (((List)this.byte_[6]).isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Auto Parser", "Не удалось найти \"" + var6 + "\"", 3000));
            this.class_(var7.size());
            return;
         }

         ArrayList var8 = new ArrayList();

         for (rJY var10 : (List)this.byte_[6]) {
            if (var10.break_()) {
               rrNt_1 var11 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[0]).break_(var10);
               if (var11 != null && var11.case_() != -1 && var11.catch_() != null) {
                  var11.class_(var10.class_());
                  var11.class_((List<rrNt_1>)this.byte_[5]);
                  var11.break_((List<rJY>)this.byte_[6]);

                  for (rrNd_1 var13 : var7) {
                     if (var13.class_(var11, var0 -> !(var0 instanceof rrcj_3) && !(var0 instanceof rrcE_2) ? true : catch_[134])) {
                        var8.add(var11);
                        break;
                     }
                  }
               }
            }
         }

         if (var8.isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Auto Parser", "Не удалось найти \"" + var6 + "\"", 3000));
            this.class_(var7.size());
            return;
         }

         if (var4) {
            HashSet var14 = new HashSet(var7);

            for (rrNw_1 var19 : var8) {
               var14.removeIf(var1x -> var1x.class_(var19, var0x -> !(var0x instanceof rrcj_3) && !(var0x instanceof rrcE_2) ? true : catch_[132]));
            }

            if (!var14.isEmpty()) {
               for (rrNd_1 var20 : var14) {
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
                     .class_(new rrtx_3("Auto Parser", "Не удалось найти \"" + var20.case_() + "\"", 3000));
                  this.class_(1);
               }
            }
         }

         rrNi_1 var15 = this.class_(((rrNw_1)var8.get(0)).protected_(), var6);
         boolean var18 = var15.class_(
            var6,
            var8,
            var7,
            (var2x, var3x, var4x) -> {
               this.k();
               if (var4 && !var2x.implements_()) {
                  rrNZ var5x = new rrNZ(var2x, var3x, var4x);
                  if (!((List)this.byte_[20]).contains(var5x)) {
                     ((List)this.byte_[19]).add(var5x);
                  }
               } else {
                  var2x.break_(var4x);
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
                     .class_(new rrtQ_2("Auto Parser", "Новая цена на \"" + var2x.case_() + "\" - " + rql_3.class_(var2x.else_(), ' ') + "$", 3000));
                  this.class_(1);
               }
            }
         );
         if (!var4 && !var18) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Auto Parser", "Не удалось найти \"" + var6 + "\"", 3000));
            this.class_(1);
         }
      }
   }

   private boolean class_(rrTU var1) {
      this.k();
      if (var1 == null) {
         return false;
      } else {
         boolean var2 = catch_[81];

         for (rrTY var4 : var1.break_()) {
            if (var4.class_() == (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[0]
               && rqR_2.break_() - var4.break_() > 0L
               && ((List)this.byte_[7]).stream().noneMatch(var1x -> var1x.break_().equals(var4.byte_()))) {
               var2 = true;
               break;
            }
         }

         return var2;
      }
   }

   private rrNi_1<?> class_(rdn_3 var1, String var2) {
      rdb_3 var3 = var1.break_();
      String var4 = var2.toLowerCase();
      if (var3 == rdy_3.kk) {
         return new rrND((var1x, var2x) -> this.class_(var1x.case_(), var2x.char_()));
      } else if (var3 == rdy_3.kz) {
         return new rrNY((var1x, var2x) -> this.class_(var1x.case_(), var2x.char_()));
      } else if (var3 == rdy_3.WN) {
         return new rrNo_1((var1x, var2x) -> this.class_(var1x.case_(), var2x.char_()));
      } else if (var3 == rdy_3.kc) {
         return new rrNe_1((var1x, var2x) -> this.class_(var1x.case_(), var2x.char_()));
      } else if (var3 == rdy_3.OB) {
         return new rrNg_1((var1x, var2x) -> this.class_(var1x.case_(), var2x.char_()));
      } else if (var3 == rdy_3.dJ && var4.startsWith("сфера")) {
         return new rrNK((var1x, var2x) -> this.class_(var1x.case_(), var2x.char_()));
      } else if (var3 == rdy_3.kL && var4.startsWith("талисман")) {
         return new rrNU((var1x, var2x) -> this.class_(var1x.case_(), var2x.char_()));
      } else {
         if (var3 instanceof rxJ_2 var5 && var5.catch_().continue_().byte_() == QP.public_) {
            return new rrcP_2((var1x, var2x) -> this.class_(var1x.case_(), var2x.char_()));
         }

         return new rrNR((var1x, var2x) -> this.class_(var1x.case_(), var2x.char_()), var1x -> {
            rdn_3 var2x = var1x.protected_();
            rdb_3 var3x = var2x.break_();
            if (var3x == rdy_3.OW) {
               if (var4.equals("трапка")) {
                  return !var2x.protected_("trap") && !var2x.protected_("spooky-item") ? catch_[122] : catch_[121];
               }

               if (var4.equals("незеритовый лом")) {
                  return !var2x.protected_("trap") && !var2x.protected_("spooky-item") ? true : catch_[124];
               }
            } else if (var3x == rdy_3.kL) {
               return !var2x.protected_("AttributeModifiers") ? true : catch_[126];
            }

            return catch_[127];
         });
      }
   }

   @Override
   public List<LZ> class_(Fu_1<?> var1, String var2, int var3, int var4, int var5) {
      this.k();
      ArrayList var6 = new ArrayList();
      if (this.break_()) {
         rrNQ var12 = new rrNQ(
            this, var3 + var5 + 5, var4, 105, 20, new rgn_3("autobuy.antiDelay"), var1x -> this.byte_(!((Qw_1)import_.class_[20]).rB ? true : catch_[120])
         );
         this.byte_[4] = var12;
         var6.add((LZ)this.byte_[4]);
      }

      rrNN var13;
      rrNN var10001 = var13 = new rrNN(this, var3 + var5 + 5, var4, 105, 20, rgN_2.byte_, var1x -> {
         try {
            this.byte_();
         } catch (IllegalStateException var3x) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Auto Parser", var3x.getMessage(), 3000));
         }
      });
      this.byte_[1] = var13;
      var6.add(var10001);
      LF var14 = new LF(
         var3 + var5 + 5,
         var4,
         105,
         20,
         new rgn_3("autobuy.parsePrices"),
         var2x -> {
            this.k();
            if (this.private_()) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
                  .class_(new rrtx_3("Auto Parser", "Ай-яй-яй, зачем нажимать сюда, если включен авто парсер?!", 5000));
            } else {
               if (this.throws_(true)) {
                  rrNv_1 var7x = new rrNv_1((List<rrNd_1>)this.byte_[18], rqR_2.break_(), false);
                  this.byte_[23] = var7x;
                  this.throws_();
                  this.class_((rrNv_1)this.byte_[23], ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).protected_(), var2, this.break_());
               }
            }
         }
      );
      this.byte_[2] = var14;
      if (this.protected_(var2)) {
         var6.add((LF)this.byte_[2]);
      }

      LZ var15 = new VF(
            "autobuy.parsedPricesDecreasePercentage",
            0.0,
            99.0,
            1.0F,
            var0 -> var0.rS,
            (var0, var1x) -> var0.rS = var1x,
            (var0, var1x) -> new rgn_3("autobuy.parsedPricesDecreasePercentage", (int)var1x.class_(var0))
         )
         .class_((Qw_1)import_.class_[20], var3 + var5 + 5, var4, 105)
         .break_(1.0F);
      this.byte_[3] = var15;
      var6.add((LZ)this.byte_[3]);
      if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         LZ var7 = new VF(
               "autobuy.refreshDelay",
               0.0,
               3000.0,
               1.0F,
               var0 -> var0.rr,
               (var0, var1x) -> var0.rr = var1x,
               (var0, var1x) -> new rgn_3("autobuy.refreshDelay", (int)var1x.class_(var0))
            )
            .class_((Qw_1)import_.class_[20], var3 + var5 + 5, var4, 105)
            .break_(1.0F);
         var6.add(var7);
      }

      return var6;
   }

   @Override
   public void class_(rrAZ var1) {
      if (var1.class_() instanceof Fc_1 var2) {
         this.class_(var2);
         String var4 = var2.new_().byte_();
         this.d();
         this.break_(var2, var4);
         this.class_(var2, var4);
      }
   }

   private void m() {
   }

   private void k() {
      if (this.byte_ == null) {
         this.byte_ = new Object[38];
         Object[] var1 = this.byte_;
         var1[14] = false;
         var1[15] = false;
         var1[17] = false;
         var1[22] = 0;
         var1[26] = 0;
         var1[27] = false;
         var1[28] = false;
         var1[32] = 0;
         var1[33] = 0L;
         var1[35] = 0L;
         var1[36] = 0L;
         var1[37] = false;
      }
   }

   public boolean default_() {
      this.k();
      return (Boolean)this.byte_[17];
   }

   private static void v() {
      catch_ = new boolean[]{
         false,
         true,
         true,
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
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
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
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
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
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
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
         false,
         true,
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
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false
      };
   }

   public long short_() {
      this.k();
      return (Long)this.byte_[36];
   }

   private void z() {
      this.k();
      if ((Long)this.byte_[36] != 0L && System.currentTimeMillis() >= (Long)this.byte_[36]) {
         Long var5 = 0L;
         this.byte_[36] = var5;
         if ((rrNV)this.byte_[12] != null && !this.X()) {
            this.protected_((rrNV)this.byte_[12]);
         }
      }
   }

   public boolean void_() {
      this.k();
      return (Boolean)this.byte_[14];
   }

   private static void u() {
      throws_ = new short[]{
         2,
         4,
         5,
         6,
         7,
         16,
         18,
         19,
         20,
         21,
         22,
         29,
         32,
         34,
         34,
         12,
         12,
         18,
         26,
         33,
         35,
         35,
         0,
         37,
         36,
         36,
         36,
         36,
         36,
         12,
         12,
         30,
         0,
         1,
         30,
         29,
         32,
         12,
         18,
         12,
         18,
         26,
         18,
         12,
         57,
         4,
         10,
         19,
         16,
         16,
         21,
         22,
         18,
         26,
         24,
         24,
         28,
         27,
         57,
         0,
         57,
         28,
         22,
         21,
         24,
         27,
         23,
         23,
         0,
         24,
         57,
         4,
         12,
         12,
         0,
         7,
         55,
         0,
         15,
         16,
         20,
         16,
         1,
         4,
         300,
         20,
         8,
         8,
         55,
         8,
         11,
         8,
         9,
         9,
         10,
         8,
         30,
         0,
         30,
         29,
         12,
         31,
         32,
         32,
         29,
         31,
         29,
         31,
         29,
         12,
         5,
         6,
         0,
         0,
         12,
         5,
         6,
         0,
         37,
         8,
         8,
         1,
         4,
         7,
         7,
         7,
         1,
         4,
         57,
         1,
         12,
         5,
         6,
         7,
         6,
         0,
         12,
         5,
         27,
         5,
         19,
         19,
         0,
         3000,
         19,
         23,
         19,
         20,
         19,
         5,
         0,
         3000,
         19,
         20,
         19,
         23,
         12,
         1,
         1,
         12,
         12,
         12,
         12,
         34,
         12,
         30,
         0,
         30,
         30,
         1,
         12,
         29,
         30,
         12,
         9,
         27,
         28,
         21,
         0,
         12,
         8,
         7,
         5,
         6,
         34,
         12,
         12,
         13,
         12,
         15,
         17,
         17,
         12,
         1,
         4,
         12,
         12,
         55,
         12,
         0,
         10,
         11,
         11,
         10,
         11,
         1,
         11,
         2,
         11,
         10,
         7,
         0,
         8,
         7,
         7,
         0,
         0,
         7,
         8,
         3000,
         22,
         28,
         17,
         12,
         33,
         12,
         1,
         30,
         31,
         32,
         14,
         8,
         33,
         16,
         5,
         7,
         6,
         18,
         23,
         12,
         25,
         22,
         26,
         18,
         19,
         20,
         21,
         24,
         25,
         26,
         28,
         27,
         32,
         57,
         10,
         0,
         3000,
         6,
         0,
         3000,
         6,
         0,
         5,
         6,
         0,
         3000,
         0,
         3000,
         0,
         3000,
         10,
         0,
         55,
         15,
         55,
         14,
         10,
         14,
         0,
         7,
         0,
         9,
         11,
         10,
         13,
         14,
         15,
         0,
         0,
         4,
         4,
         1,
         2,
         2,
         20,
         3,
         3,
         1,
         4,
         20,
         57,
         57,
         57,
         0,
         57,
         4,
         0,
         26,
         26,
         200,
         15,
         20,
         20,
         20,
         0,
         0,
         0,
         0,
         18,
         18,
         0,
         3000,
         12,
         10,
         0,
         18,
         23,
         0,
         3000,
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
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
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
         33,
         34,
         35,
         36,
         0,
         5000,
         18,
         23,
         23,
         0,
         0,
         3000,
         20,
         0,
         0,
         3000,
         20,
         19,
         0,
         3000,
         0,
         7,
         7
      };
   }

   public List<rrNZ> r() {
      this.k();
      return (List<rrNZ>)this.byte_[20];
   }

   private static void N() {
      case_ = new byte[]{
         2,
         -1,
         2,
         -1,
         45,
         3,
         3,
         44,
         -1,
         32,
         32,
         -1,
         2,
         -1,
         5,
         2,
         5,
         2,
         2,
         3,
         2,
         2,
         2,
         5,
         23,
         20,
         2,
         52,
         25,
         105,
         20,
         5,
         105,
         20,
         5,
         105,
         20,
         5,
         105,
         20,
         5,
         105,
         5,
         105,
         4,
         2,
         3,
         2,
         32,
         38,
         14,
         15,
         17,
         22,
         26,
         27,
         28,
         32,
         33,
         35,
         36,
         37,
         2
      };
   }

   public void break_(long var1) {
      this.k();
      Long var7 = System.currentTimeMillis() + var1;
      this.byte_[35] = var7;
   }

   public int break_(rrNt_1 var1) {
      List var2 = rrjm_3.class_(var1.protected_());
      String var3 = var1.catch_();
      int var4 = 0;

      for (rdn_3 var6 : var2) {
         int var7 = var6.char_();

         for (rrNd_1 var9 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).protected_()) {
            if (var9.while_()) {
               int var10 = var9.else_();
               rrNt_1 var11 = new rrNt_1(var6, var3, var10);
               if (var9.class_(var11, null)) {
                  var4 += var10 * var7;
                  break;
               }
            }
         }
      }

      return var4;
   }

   private void break_(Fc_1 var1, String var2) {
      this.k();
      if ((rrNV)this.byte_[12] != null && !((List)this.byte_[18]).isEmpty()) {
         if ((Integer)this.byte_[26] >= ((List)this.byte_[18]).size()) {
            this.W();
         }

         rXe_1 var3 = var1.G_();
         rqs_3 var4 = var3.extends_();
         boolean var5 = this.class_((rrNV)this.byte_[12]);
         int var6 = ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_;
         String var7 = null;
         Matcher var8 = ((Pattern)rrjE_2.class_[10]).matcher(var2);
         if (var8.find()) {
            var7 = var8.group(1);
         }

         if (var5 && !((List)this.byte_[19]).isEmpty() && var7 != null) {
            if (((rrfw_3)this.byte_[16]).class_(300.0)) {
               this.class_(var1, var4, var6);
               ((rrfw_3)this.byte_[16]).class_();
            }
         } else {
            if (((rrfw_3)this.byte_[21]).class_((double)((Integer)this.byte_[22]).intValue()) && !this.X()) {
               rrNd_1 var14 = (rrNd_1)((List)this.byte_[18]).get((Integer)this.byte_[26]);
               this.byte_[24] = var14;
               String var9 = ((rrNd_1)this.byte_[24]).abstract_();
               if (!var9.isEmpty() && !(Boolean)this.byte_[28]) {
                  Boolean var15 = false;
                  this.byte_[27] = var15;
                  ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rmj_3(var6));
                  ((cb_3)import_.class_[57]).case_("/ah search " + var9);
                  Boolean var16 = true;
                  this.byte_[28] = var16;
               }

               Integer var17 = this.E();
               this.byte_[22] = var17;
               ((rrfw_3)this.byte_[21]).class_();
            }

            if ((rrNd_1)this.byte_[24] != null && (Boolean)this.byte_[27] && (rrNv_1)this.byte_[23] != null && var7 != null) {
               this.class_((rrNv_1)this.byte_[23], ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).protected_(), var2, this.break_());
               Object var18 = null;
               this.byte_[24] = var18;
            }
         }
      }
   }

   @Override
   public void break_(boolean var1) throws IllegalStateException {
      this.k();
      if (!var1 || this.throws_(false)) {
         super.break_(var1);
         if (this.private_()) {
            rrNv_1 var6 = new rrNv_1((List<rrNd_1>)this.byte_[18], rqR_2.break_(), true);
            this.byte_[23] = var6;
         }
      }
   }

   public boolean break_(Fc_1 var1, Pj_1 var2, rqs_3<rdn_3> var3, String var4, int var5) {
      if (var4.contains("Хранилище")) {
         return false;
      } else {
         rdn_3 var6 = var2.class_(var3);
         if (var6 == null) {
            return false;
         } else {
            int var7 = var1.throw_();
            if (var7 > 0 && var7 % 5 == 0) {
               ((Ax_1)import_.class_[55]).class_(var5, var3.indexOf(var6), 2, rXa_1.CLONE);
            }

            return catch_[77];
         }
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1964311060;
   }

   public rdn_3 break_(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.continue_().byte_();
         if (var4.equals("[⟲] Обновить")) {
            return var3;
         }
      }

      return null;
   }

   public boolean break_(rrNV var1) {
      return var1 instanceof rrNH;
   }

   private boolean throws_(boolean var1) {
      this.k();
      if (var1) {
         return this.Q();
      } else {
         ArrayList var2 = new ArrayList();

         for (rrNd_1 var4 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).protected_()) {
            if (var4.while_() && var4.class_()) {
               var2.add(var4);
            }
         }

         for (rrNd_1 var7 : var2) {
            String var5 = var7.abstract_();
            if (var5 == null || var5.isEmpty()) {
               throw new IllegalStateException("Не указан SearchName для предмета \"" + var7.case_() + "\"");
            }

            ((List)this.byte_[18]).add(var7);
         }

         if (((List)this.byte_[18]).isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
               .class_(new rrtx_3("Auto Parser", "Для работы парсера необходимо включить предметы", 3000));
            return false;
         } else {
            return catch_[102];
         }
      }
   }

   private void throws_(rrNV var1) {
      if (var1 instanceof rrNq_1 var2) {
         ((cb_3)import_.class_[57]).case_("/ah search " + var2.break_());
      } else {
         ((cb_3)import_.class_[57]).case_("/ah");
      }
   }

   private void throws_(String var1) {
      this.k();
      if ((rrNd_1)this.byte_[10] != null && (rrNF)this.byte_[11] != null) {
         rrNd_1 var2 = ((rrNF)this.byte_[11]).break_();
         if (var2.equals((rrNd_1)this.byte_[10])) {
            boolean var3 = catch_[47];
            if (var1.contains("Вы успешно купили")) {
               ((rrNF)this.byte_[11]).class_((rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[1]);
               var3 = true;
            } else if (var1.contains("Этот товар уже Купили")) {
               ((rrNF)this.byte_[11]).class_((rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[2]);
               var3 = true;
            }

            if (var3) {
               Object var8 = null;
               this.byte_[11] = var8;
               Object var9 = null;
               this.byte_[10] = var9;
            }
         }
      }
   }

   @Override
   public void throws_() {
      this.k();
      super.throws_();
      rrNV var5 = (rrNV)this.byte_[12];
      this.byte_[25] = var5;
      Integer var6 = this.E();
      this.byte_[22] = var6;
      Integer var7 = 0;
      this.byte_[26] = var7;
   }

   private String L() {
      this.k();
      long var1 = Math.max(0L, System.currentTimeMillis() - (Long)this.byte_[33]);
      return rql_3.class_(Duration.ofMillis(var1));
   }

   public List<rrNd_1> M() {
      this.k();
      return (List<rrNd_1>)this.byte_[18];
   }

   private void W() {
      this.k();
      rrNv_1 var1 = (rrNv_1)this.byte_[23];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Auto Parser", "Парсинг цен завершен", 3000));
      MinecraftAccessor.a_("Auto Parser: Парсинг цен завершен", false);
      if (var1 != null) {
         List var2 = var1.byte_();
         long var3 = var1.break_();
         long var5 = rqR_2.break_() - var3;
         int var7 = var2.size();
         rVi_1 var8 = new rgN_2("")
            .class_(rgF_2.GRAY)
            .break_("Auto Parser: Парсинг ")
            .class_(new rgN_2(var7 + " " + rql_3.class_((long)var7, "предмета", "предмета", "предметов", "предметов")).class_(rgF_2.RED))
            .break_(" завершен за ")
            .class_(new rgN_2(String.format("%.1f%s", (double)var5 / 1000.0, "с")).class_(rgF_2.RED));
         rrfu_3.class_(var8);
      }

      this.break_(false);
   }

   public LF P() {
      this.k();
      return (LF)this.byte_[1];
   }

   @Override
   public void catch_() {
      this.k();
      super.catch_();
      if (!((List)this.byte_[18]).isEmpty()) {
         this.extends_();
      }
   }

   public rrfw_3 G() {
      this.k();
      return (rrfw_3)this.byte_[21];
   }

   @Override
   public void extends_() {
      this.k();
      super.extends_();
      ((List)this.byte_[18]).clear();
      ((List)this.byte_[19]).clear();
      ((List)this.byte_[20]).clear();
      ((rrfw_3)this.byte_[21]).class_();
      Object var5 = null;
      this.byte_[24] = var5;
      Object var6 = null;
      this.byte_[25] = var6;
      Integer var7 = 0;
      this.byte_[26] = var7;
      Boolean var8 = false;
      this.byte_[28] = var8;
      Boolean var9 = false;
      this.byte_[27] = var9;
   }

   public boolean goto_() {
      this.k();
      return (Boolean)this.byte_[15];
   }

   @Override
   public boolean case_() {
      this.k();
      return super.case_() && (rrNV)this.byte_[12] != null ? true : catch_[55];
   }

   public rrNd_1 const_() {
      this.k();
      return (rrNd_1)this.byte_[9];
   }

   public void continue_() {
      this.k();
      Long var5 = 0L;
      this.byte_[36] = var5;
   }

   public rrfw_3 else_() {
      this.k();
      return (rrfw_3)this.byte_[29];
   }

   public int for_() {
      this.k();
      return (Integer)this.byte_[32];
   }

   public boolean import_() {
      return ((Qw_1)import_.class_[20]).rB && this.break_() ? true : catch_[100];
   }

   public long instanceof_() {
      this.k();
      return (Long)this.byte_[33];
   }

   public rrNu_1 new_() {
      this.k();
      return (rrNu_1)this.byte_[30];
   }

   public LF package_() {
      this.k();
      return (LF)this.byte_[2];
   }

   public rrNd_1 return_() {
      this.k();
      return (rrNd_1)this.byte_[24];
   }

   public LF super_() {
      this.k();
      return (LF)this.byte_[0];
   }

   public rrNV switch_() {
      this.k();
      return (rrNV)this.byte_[12];
   }

   public boolean throw_() {
      this.k();
      return (Boolean)this.byte_[28];
   }

   public int try_() {
      this.k();
      return (Integer)this.byte_[26];
   }

   public boolean while_() {
      this.k();
      return (Boolean)this.byte_[27];
   }

   public List<rrNZ> static_() {
      this.k();
      return (List<rrNZ>)this.byte_[19];
   }

   public boolean public_() {
      return C_throws.byte_().for_().class_() >= 450L ? true : catch_[98];
   }

   public void protected_(boolean var1) {
      this.k();
      Boolean var6 = var1;
      this.byte_[15] = var6;
   }

   @Override
   public void protected_() {
      this.k();
      super.protected_();
      Long var5 = System.currentTimeMillis();
      this.byte_[33] = var5;
   }

   public boolean protected_(String var1) {
      Matcher var2 = ((Pattern)rrjE_2.class_[10]).matcher(var1);
      if (!var2.find()) {
         return catch_[74];
      } else {
         String var3 = var2.group(1);

         for (rrNd_1 var5 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).protected_()) {
            for (String var8 : var5.private_()) {
               if (var8.toLowerCase().startsWith(var3.toLowerCase())) {
                  return true;
               }
            }
         }

         return catch_[73];
      }
   }

   private void protected_(rrNV var1) {
      ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rmj_3(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_));
      this.throws_(var1);
   }

   public rrfw_3 abstract_() {
      this.k();
      return (rrfw_3)this.byte_[16];
   }

   public rrNV final_() {
      this.k();
      return (rrNV)this.byte_[13];
   }

   public long transient_() {
      this.k();
      return (Long)this.byte_[35];
   }

   public List<rrNt_1> synchronized_() {
      this.k();
      return (List<rrNt_1>)this.byte_[5];
   }

   public rrNv_1 strictfp_() {
      this.k();
      return (rrNv_1)this.byte_[23];
   }

   public int E() {
      return 200;
   }

   private static void A() {
      Object[] var0 = new Object[]{new Random(), 0};
      protected_ = var0;
   }

   private boolean X() {
      PF var1 = C_throws.byte_().try_();
      return var1.class_(true);
   }

   private boolean Q() {
      this.k();
      rrNV var1 = (rrNV)this.byte_[12];
      if (var1 instanceof rrNq_1 var2) {
         Matcher var3 = ((Pattern)rrjE_2.class_[10]).matcher(var2.class_().byte_());
         if (var3.find()) {
            String var4 = var3.group(1);
            List var5 = this.class_(((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).protected_(), var4, false);
            ((List)this.byte_[18]).addAll(var5);
            return true;
         }
      }

      return catch_[106];
   }
}
