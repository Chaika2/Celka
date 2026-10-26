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
   private static short[] id_throws;
   public Object[] id_byte;
   private static byte[] id_case;
   private static boolean[] id_catch;
   public static Object[] id_protected;
   private static double[] id_private;
   private static long[] id_implements;
   private static String[] id_finally;
   private static float[] id_extends;

   public List<rrNm_1> id_boolean() {
      this.k();
      return (List<rrNm_1>)this.id_byte[7];
   }

   public rrNV id_char() {
      this.k();
      return (rrNV)this.id_byte[31];
   }

   public void id_byte(boolean var1) {
      ((Qw_1)id_import.id_class[20]).rB = var1;
      if (((Qw_1)id_import.id_class[20]).rB) {
         this.n();
      } else {
         this.m();
      }
   }

   public boolean id_byte(rrNV var1) {
      return !(var1 instanceof rrNC) && !(var1 instanceof rrNq_1) ? id_catch[86] : true;
   }

   public rdn_3 id_byte(List<rdn_3> var1) {
      ArrayList var2 = new ArrayList();

      for (rdn_3 var4 : var1) {
         String var5 = var4.id_continue().id_byte();
         if (var5.equals(id_finally[24])) {
            var2.add(var4);
         }
      }

      if (var2.isEmpty()) {
         return null;
      } else {
         return var2.size() == 1 ? (rdn_3)var2.get(id_catch[88]) : (rdn_3)var2.get(((Random)id_protected[id_throws[280]]).nextInt(var2.size()));
      }
   }

   private static long id_byte(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8019826604759080696L;
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-106, -91, -102, -67, -2, -19, -25, 93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public List<rJY> id_int() {
      this.k();
      return (List<rJY>)this.id_byte[6];
   }

   public rrNV id_long() {
      this.k();
      return (rrNV)this.id_byte[25];
   }

   public void id_float() {
      this.id_class(id_implements[4]);
   }

   public boolean id_double() {
      this.k();
      return System.currentTimeMillis() >= this.id_byte[35] ? true : id_catch[6];
   }

   public rrNW(C_class var1) {
      rrfq_3[] var10002 = new rrfq_3[2];
      var10002[id_catch[0]] = (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2];
      var10002[1] = (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4];
      super(var1, var10002);
      this.k();
      ArrayList var6 = new ArrayList();
      this.id_byte[5] = var6;
      ArrayList var7 = new ArrayList();
      this.id_byte[6] = var7;
      ArrayList var8 = new ArrayList();
      this.id_byte[7] = var8;
      rrfw_3 var9 = new rrfw_3();
      this.id_byte[16] = var9;
      ArrayList var10 = new ArrayList();
      this.id_byte[18] = var10;
      ArrayList var11 = new ArrayList();
      this.id_byte[19] = var11;
      ArrayList var12 = new ArrayList();
      this.id_byte[20] = var12;
      rrfw_3 var13 = new rrfw_3();
      this.id_byte[21] = var13;
      Integer var14 = this.E();
      this.id_byte[22] = var14;
      rrfw_3 var15 = new rrfw_3();
      this.id_byte[29] = var15;
      Integer var16 = 1;
      this.id_byte[32] = var16;
   }

   static {
      ntfClinit();
   }

   public LZ B() {
      this.k();
      return (LZ)this.id_byte[3];
   }

   private boolean C() {
      if ((rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         return id_catch[31];
      } else {
         int var1 = id_catch[27];

         for (int var2 = id_catch[28]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
            if (var3.id_break() instanceof rxJ_2 var4 && var4.id_catch() instanceof Wp_1) {
               var1++;
            }

            if (var1 >= 3) {
               break;
            }
         }

         return var1 == 3 ? true : id_catch[30];
      }
   }

   private void F() {
      this.k();
      if ((rrNu_1)this.id_byte[30] != null) {
         switch (((int[])rrNc_1.id_class[id_throws[97]])[((rrNu_1)this.id_byte[30]).ordinal()]) {
            case 1:
               if (((rrfw_3)this.id_byte[29]).id_class(1000.0)) {
                  rrNV var5 = (rrNV)this.id_byte[12];
                  this.id_byte[31] = var5;
                  if (this.h()) {
                     Integer var6 = (Integer)this.id_byte[32] + 1;
                     this.id_byte[32] = var6;
                  }

                  ((rrfw_3)this.id_byte[29]).id_class();
               }
               break;
            case 2:
               if ((rrNV)this.id_byte[31] != null && ((rrfw_3)this.id_byte[29]).id_class(1000.0)) {
                  this.id_throws((rrNV)this.id_byte[31]);
                  ((rrfw_3)this.id_byte[29]).id_class();
               }
         }
      }
   }

   private static void J() {
      id_implements = new long[]{0L, 0L, 0L, 1000L, 0L, 0L, 0L, 0L, 1000L, 100L, 0L, 0L, 450L, 0L, 0L, 0L, 0L};
   }

   public rrNd_1 S() {
      this.k();
      return (rrNd_1)this.id_byte[8];
   }

   private static void Z() {
      id_finally = new String[]{
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

   public rrNF id_this() {
      this.k();
      return (rrNF)this.id_byte[11];
   }

   public rgP_2 b() {
      this.k();
      return (rgP_2)this.id_byte[34];
   }

   private static void x() {
      id_private = new double[]{300.0, 1000.0, 1000.0, 0.0, 99.0, 0.0, 3000.0, 1000.0};
   }

   public rrNd_1 s() {
      this.k();
      return (rrNd_1)this.id_byte[10];
   }

   private static void c() {
      id_extends = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   }

   private void n() {
   }

   private boolean h() {
      this.k();
      PI var1 = C_throws.id_byte().id_native().id_protected();
      rrjx_3 var2 = rrjS_2.id_class(var1, (Integer)this.id_byte[32]);
      if (var2 == null) {
         rrfu_3.id_byte(id_finally[12]);
         return id_catch[64];
      } else {
         String var3 = var2.id_class();
         int var4 = var2.id_break();
         ((cb_3)id_import.id_class[57]).id_protected("/" + var3 + var4);
         rrfu_3.id_byte("Anti Delay: Переподключение на " + var3 + var4);
         return true;
      }
   }

   private int l() {
      return (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] ? 300 : (int)((Qw_1)id_import.id_class[20]).rr;
   }

   private void d() {
      this.k();
      AutoBuy var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[314]]).id_private().d();
      boolean var2 = var1.aJ_();
      if ((LF)this.id_byte[id_throws[315]] != null) {
         ((LF)this.id_byte[id_throws[316]]).id_int = var2;
      }
   }

   public LZ id_interface() {
      this.k();
      return (LZ)this.id_byte[4];
   }

   private void id_class(Fc_1 var1, String var2) {
      this.k();
      boolean var3 = this.id_case();
      if (var3) {
         Pj_1 var4 = C_throws.id_byte().id_package();
         rXe_1 var5 = var1.G_();
         rqs_3 var6 = var5.id_extends();
         int var7 = ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case;
         boolean var8 = this.id_class((rrNV)this.id_byte[12]);
         boolean var9 = this.id_break((rrNV)this.id_byte[12]);
         boolean var10 = this.id_break()
               && !this.id_class(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[74]]).id_private().d().id_super())
            ? id_catch[14]
            : true;
         if (var8) {
            if (!((List)this.id_byte[7]).isEmpty()) {
               return;
            }

            if (this.id_class(var7, true)) {
               return;
            }
         } else if (var9) {
            rdn_3 var13 = this.id_byte(var6);
            int var12 = var6.indexOf(var13);
            if (var12 != -1) {
               ((Ax_1)id_import.id_class[55]).id_class(var7, var12, 2, rXa_1.CLONE);
            }

            return;
         }

         FtHelper var11 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[77]]).id_private().id_default();
         if (var11.aJ_() && var11.id_continue()) {
            if (var4.id_byte() && this.id_double()) {
               this.id_break(var1, var4, var6, var2, var7);
               return;
            }

            if ((Boolean)this.id_byte[15]) {
               this.id_class(var1, var4, var6, var2, var7);
               return;
            }
         }

         if (var8 && ((rrfw_3)this.id_byte[16]).id_class((double)this.l()) && (((Qw_1)id_import.id_class[20]).rP || var10)) {
            this.id_class(var1, var6, var7);
            ((rrfw_3)this.id_byte[16]).id_class();
         }
      }
   }

   @Override
   public void id_class() {
      this.k();
      super.id_class();
      rrFe_1.id_class((rrNV)this.id_byte[12], (rrFa_1)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[1]);
      Object var5 = null;
      this.id_byte[30] = var5;
      Object var6 = null;
      this.id_byte[31] = var6;
      Integer var7 = 1;
      this.id_byte[32] = var7;
      Boolean var8 = id_catch[57];
      this.id_byte[14] = var8;
      Object var9 = null;
      this.id_byte[8] = var9;
      Long var10 = id_implements[10];
      this.id_byte[33] = var10;
      this.id_continue();
      ((rrfw_3)this.id_byte[16]).id_class();
      ((List)this.id_byte[5]).clear();
      ((List)this.id_byte[7]).clear();
      ((List)this.id_byte[6]).clear();
   }

   @Override
   public void id_class(rrAT var1) {
      this.k();
      if ((rrNV)this.id_byte[12] != null) {
         if (var1.id_class() instanceof rXe_1 var2) {
            List var18 = var1.id_byte();
            ((List)this.id_byte[5]).clear();
            ((List)this.id_byte[6]).clear();
            ((List)this.id_byte[7]).clear();

            for (rJY var5 : var18) {
               if (var5.id_break() && var5.id_byte == var2.id_class() && var5.id_protected <= 44) {
                  ((List)this.id_byte[6]).add(var5);
                  rrNt_1 var6 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_throws[135]]).id_break(var5);
                  if (var6 != null) {
                     String var7 = var6.id_catch();
                     int var8 = var6.id_case();
                     if (var7 != null && var8 != -1) {
                        var6.id_class((rrNV)this.id_byte[12]);
                        var6.id_class(var5.id_class().id_implements());
                        ((List)this.id_byte[5]).add(var6);
                     }
                  }
               }
            }

            Boolean var17 = true;
            this.id_byte[27] = var17;
            if (((List)this.id_byte[5]).isEmpty() && !((List)this.id_byte[19]).isEmpty()) {
               ((List)this.id_byte[19]).clear();
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[142]]).id_class(new rrtx_3(id_finally[2], id_finally[3], 3000));
               this.id_class(1);
            } else if (!((List)this.id_byte[19]).isEmpty() && (rrNv_1)this.id_byte[23] != null) {
               for (rrNZ var20 : (List)this.id_byte[19]) {
                  if (((List)this.id_byte[20]).contains(var20)) {
                     ((List)this.id_byte[19]).remove(var20);
                  } else {
                     rrNd_1 var21 = var20.id_byte();
                     rrNw_1 var22 = var20.id_class();
                     if (var22 != null) {
                        rdn_3 var23 = var22.id_protected();
                        boolean var9 = id_catch[34];

                        for (rrNt_1 var11 : (List)this.id_byte[5]) {
                           rdn_3 var12 = var11.id_protected();
                           if (var12.id_break() == var23.id_break()
                              && var12.id_continue().id_byte().equals(var23.id_continue().id_byte())
                              && var11.id_catch().equals(var22.id_catch())
                              && var11.id_case() == var22.id_case()) {
                              var9 = true;
                              break;
                           }
                        }

                        if (var9) {
                           var21.id_break(var20.id_break());
                           ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[150]])
                              .id_class(
                                 new rrtQ_2(id_finally[4], "Новая цена на \"" + var21.id_case() + "\" - " + rql_3.id_class(var21.id_else(), ' ') + "$", 3000)
                              );
                           this.id_class(1);
                           ((List)this.id_byte[19]).remove(var20);
                           ((List)this.id_byte[20]).add(var20);
                        } else {
                           ((List)this.id_byte[19]).remove(var20);
                           Object var24;
                           if (var23.id_this()) {
                              var24 = var23.id_continue();
                           } else {
                              var24 = new rgN_2(jI_2.id_class(id_finally[5], var23.id_finally()));
                           }

                           rVi_1 var25 = new rgN_2(id_finally[6])
                              .id_class(rgF_2.GRAY)
                              .id_class((rgP_2)var24)
                              .id_break(id_finally[7])
                              .id_class(new rgN_2(rql_3.id_class(var22.id_case(), ' ') + "$").id_class(rgF_2.RED));
                           rrfu_3.id_class(var25);
                           this.id_class(
                              (rrNv_1)this.id_byte[23], Collections.singletonList(var21), ((rrNV)this.id_byte[12]).id_class().id_byte(), this.id_break()
                           );
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
   public void id_class(rrAK var1) {
      if (this.id_case() || this.id_private()) {
         var1.id_class(true);
      }
   }

   @Override
   public void id_class(Fu_1<?> var1, rrNV var2) {
      this.k();
      String var3 = var1.id_new().id_byte();
      int var4 = var1.id_package;
      int var5 = var1.id_int;
      int var6 = var1.id_synchronized;
      int var7 = var1.id_return;
      int var8 = (var4 - var6) / 2;
      int var9 = (var5 - var7) / 2;
      List var10 = this.id_class(var1, var3, var8, var9, var6);
      if (this.id_byte(var2)) {
         for (int var11 = id_catch[92]; var11 < var10.size(); var11++) {
            LZ var12 = (LZ)var10.get(var11);
            int var13 = var8 + var6 + 5;
            int var14 = var9 + 23 * var11 + 20;
            var12.id_volatile = var13;
            var12.id_final = var14;
            var1.id_class(var12);
         }
      }

      if (this.id_class(var2)) {
         rrNz_1 var19 = new rrNz_1(this, var4 / 2 - 52, var9 - 25, 105, 20, rgN_2.id_byte, var1x -> {
            try {
               this.id_implements();
            } catch (IllegalStateException var3x) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[375]]).id_class(new rrtx_3(id_finally[50], var3x.getMessage(), 3000));
            }
         }, (var1x, var2x, var3x, var4x) -> {
            AutoBuy var5x = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[374]]).id_private().d();
            boolean var6x = var5x.aJ_();
            if (!var6x) {
               var1.id_class(var2x, new rgn_3(id_finally[49]), var3x, var4x);
            }
         });
         this.id_byte[id_throws[287]] = var19;
         var1.id_class((LF)this.id_byte[id_throws[288]]);
      }

      this.d();
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_catch();
   }

   public void id_class(Fc_1 var1, Pj_1 var2, rqs_3<rdn_3> var3, String var4, int var5) {
      this.k();
      if (!var4.contains(id_finally[21])) {
         Boolean var12 = id_catch[78];
         this.id_byte[15] = var12;
      } else {
         rdn_3 var6 = var2.id_byte(var3);
         if (var6 != null) {
            int var7 = var1.id_throw();
            if (var7 > 0 && var7 % 5 == 0) {
               ((Ax_1)id_import.id_class[55]).id_class(var5, var3.indexOf(var6), 2, rXa_1.CLONE);
            }
         }
      }
   }

   @Override
   public void id_class(q_1 var1) {
      this.k();
      super.id_class(var1);
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[22]]) {
         this.F();
         this.z();
         Boolean var6 = this.id_case() && this.C() ? true : id_catch[8];
         this.id_byte[37] = var6;
      }
   }

   @Override
   public void id_class(rrFo_1 var1) {
      this.k();
      Object var6 = null;
      this.id_byte[8] = var6;
      ((List)this.id_byte[7]).clear();
      ((List)this.id_byte[5]).clear();
      ((List)this.id_byte[6]).clear();
      Object var7 = null;
      this.id_byte[34] = var7;
      if ((rrNV)this.id_byte[12] != null) {
         rrNV var8 = (rrNV)this.id_byte[12];
         this.id_byte[13] = var8;
      }

      if (!((rrNV)this.id_byte[12] instanceof rrNT)) {
         Boolean var9 = id_catch[40];
         this.id_byte[15] = var9;
      }

      if (this.id_case() && (Boolean)this.id_byte[17]) {
         var1.id_class(true);
         Boolean var10 = id_catch[42];
         this.id_byte[17] = var10;
      }

      Object var11 = null;
      this.id_byte[12] = var11;
   }

   private void id_class(Fc_1 var1, rqs_3<rdn_3> var2, int var3) {
      this.k();
      rdn_3 var4 = this.id_class(var1, var2, (rrNV)this.id_byte[12]);
      int var5 = var2.indexOf(var4);
      if (var5 != -1) {
         ((Ax_1)id_import.id_class[55]).id_class(var3, var5, 2, rXa_1.CLONE);
         rrFe_1.id_class((rrNV)this.id_byte[12], (rrFa_1)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[id_throws[199]]);
      }
   }

   @Override
   public void id_class(rrLu_1 var1) {
      this.k();
      ruS_2 var2 = var1.id_class();
      if (var2 instanceof rvt_3 var3) {
         rqA_2 var4 = var3.id_break();
         if (var4 == rqn_3.Mu && this.id_private()) {
            Integer var9 = 3000;
            this.id_byte[22] = var9;
            Boolean var10 = id_catch[51];
            this.id_byte[28] = var10;
         }

         if ((var4 == rqn_3.Mu || var4 == rqn_3.BC || var4 == rqn_3.dw) && this.id_case()) {
            var1.id_class(true);
         }
      } else if (var2 instanceof rZU) {
         Boolean var11 = true;
         this.id_byte[17] = var11;
      }
   }

   public rdn_3 id_class(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.id_continue().id_byte();
         if (var4.equals(id_finally[22])) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public void id_class(rrAM var1) {
      this.k();
      if ((rrNu_1)this.id_byte[30] == (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[id_throws[32]]) {
         rrNu_1 var6 = (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[1];
         this.id_byte[30] = var6;
         ((rrfw_3)this.id_byte[29]).id_class();
         Integer var7 = 1;
         this.id_byte[32] = var7;
      } else {
         this.id_catch();
      }
   }

   private void id_class(Fc_1 var1) {
      this.k();
      if ((rgP_2)this.id_byte[34] != null) {
         rVi_1 var2 = ((rgP_2)this.id_byte[34]).id_case();
         if ((rrNV)this.id_byte[12] instanceof rrNC && this.id_case()) {
            var2.id_break(id_finally[0]).id_class(new rgN_2("[⌚ " + this.L() + "]").id_break(rgF_2.YELLOW));
         } else if ((rrNV)this.id_byte[12] instanceof rrNq_1 && this.id_private()) {
            int var3 = ((List)this.id_byte[18]).size();
            int var4 = Math.min((Integer)this.id_byte[26] + 1, var3);
            var2.id_break(id_finally[1]).id_class(new rgN_2("[" + var4 + "/" + var3 + "]").id_break(rgF_2.YELLOW));
         }

         var1.id_class(var2);
      }
   }

   @Override
   public void id_class(rrLU var1) {
      this.k();
      if (var1.id_class() instanceof Fc_1 var2 && (rrfq_3)rrfp_3.id_class[1] != null) {
         rgP_2 var17 = var2.id_new();
         if (this.id_finally().contains((rrfq_3)rrfp_3.id_class[1])) {
            rrNV var10 = this.id_class(var17);
            this.id_byte[12] = var10;
            this.id_class(var2, (rrNV)this.id_byte[12]);
         }

         rgP_2 var11 = !((rrNV)this.id_byte[12] instanceof rrNC) && !((rrNV)this.id_byte[12] instanceof rrNq_1) ? null : var17;
         this.id_byte[34] = var11;
         this.id_class(var2);
         if ((rrNV)this.id_byte[12] != null && this.id_import() && this.id_case()) {
            if ((rrNu_1)this.id_byte[30] == null && this.id_public()) {
               rrNu_1 var12 = (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[id_throws[166]];
               this.id_byte[30] = var12;
            } else if ((rrNu_1)this.id_byte[30] == (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[1] && (rrNV)this.id_byte[12] != null) {
               ((rrfw_3)this.id_byte[29]).id_class();
               Object var13 = null;
               this.id_byte[30] = var13;
            }
         }

         if (!((rrNV)this.id_byte[12] instanceof rrNH)) {
            Object var14 = null;
            this.id_byte[9] = var14;
         }

         Boolean var15 = id_catch[38];
         this.id_byte[27] = var15;
         Boolean var16 = id_catch[39];
         this.id_byte[28] = var16;
         ((rrfw_3)this.id_byte[21]).id_class();
         if (this.id_break()) {
            rrTU var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[178]]).id_private().d().id_super();
            if ((rrNV)this.id_byte[12] != null && this.id_case() && var4 != null) {
               List var5 = var4.id_break();
               if (var5.isEmpty()) {
                  rrfu_3.id_byte(id_finally[8]);
               }
            }
         }
      }
   }

   @Override
   public void id_class(rrLc_1 var1) {
      this.k();
      rrTi_1 var2 = var1.id_class();
      if (var2 instanceof rrtS_2 var3) {
         rdn_3 var5 = var3.id_byte();
         String var6 = var3.id_class();
         int var7 = var3.id_protected();
         rrts_3 var8 = var3.id_throws();

         for (rrNm_1 var10 : (List)this.id_byte[7]) {
            rrNd_1 var11 = var10.id_class();
            rrNw_1 var12 = var11.id_break();
            if (var12 != null) {
               rdn_3 var13 = var12.id_protected();
               if (var13.id_break() == var5.id_break()
                  && var12.id_case() == var7
                  && var12.id_catch().equals(var6)
                  && var13.id_continue().id_byte().equals(var5.id_continue().id_byte())) {
                  if (var8 == (rrts_3)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[id_throws[211]]) {
                     this.id_byte[8] = var11;
                     ((List)this.id_byte[7]).clear();
                  } else {
                     ((List)this.id_byte[7]).remove(var10);
                  }
                  break;
               }
            }
         }
      } else if (var2 instanceof rrtG_2 var4) {
         rrTU var20 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[215]]).id_private().d().id_super();
         String var21 = var4.id_break();
         rrtb_3 var22 = var4.id_class();

         for (rrTY var24 : var20.id_break()) {
            String var25 = var24.id_byte();
            if (var25.equals(var21)) {
               var24.id_class(var22);
               if (var22 != (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_throws[216]]
                  && ((List)this.id_byte[7]).removeIf(var1x -> var1x.id_break().equals(var21))) {
                  Object var19 = null;
                  this.id_byte[8] = var19;
               }
               break;
            }
         }
      }
   }

   private List<rrNd_1> id_class(List<rrNd_1> var1, String var2, boolean var3) {
      List var4;
      if (var3) {
         var4 = var1.stream().filter(var0 -> var0.id_while() && var0.id_class() ? true : id_catch[129]).toList();
      } else {
         var4 = var1;
      }

      return var4.stream().filter(var1x -> var1x.id_private().stream().anyMatch(var1xx -> var1xx.toLowerCase().startsWith(var2.toLowerCase()))).toList();
   }

   private boolean id_class(int var1, boolean var2) {
      this.k();
      if (var2 && (rrNd_1)this.id_byte[8] != null) {
         rrNw_1 var3 = ((rrNd_1)this.id_byte[8]).id_break();
         if (var3 == null) {
            return true;
         } else {
            rJY var4 = var3.id_throws();
            rdn_3 var5 = var4.id_class();
            ((Ax_1)id_import.id_class[55]).id_break(var1, var4.id_protected, id_catch[17], rXa_1.QUICK_MOVE, true);
            rrNF var10 = new rrNF(this, (rrNd_1)this.id_byte[8]);
            this.id_byte[11] = var10;
            rrNd_1 var11 = (rrNd_1)this.id_byte[8];
            this.id_byte[9] = var11;
            rrNd_1 var12 = (rrNd_1)this.id_byte[9];
            this.id_byte[10] = var12;
            Object var13 = null;
            this.id_byte[8] = var13;
            return true;
         }
      } else {
         return id_catch[20];
      }
   }

   @Override
   public void id_class(rrLh_1 var1) {
      if (var1.id_protected() == null) {
         String var2 = var1.id_class();
         this.id_throws(var2);
         if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] && (this.id_case() || this.id_private())) {
            Matcher var3 = ((Pattern)rrjE_2.id_class[12]).matcher(var2);
            if (var3.find()) {
               try {
                  this.id_class(Long.parseLong(var3.group(1)) * 1000L + 100L);
               } catch (NumberFormatException var5) {
               }
            }

            if (var2.contains(id_finally[9]) && this.id_case()) {
               this.id_float();
            }
         }
      }
   }

   private boolean id_class(rrNd_1 var1, rrNt_1 var2) {
      if (var1.id_catch() instanceof rxJ_2 var3
         && var3.id_catch() instanceof Wp_1
         && var2.id_protected().id_break() instanceof rxJ_2 var4
         && var4.id_catch() instanceof Wp_1
         && this.id_class(var2)) {
         return true;
      }

      return var1.id_while() && var1.id_class(var2, null) ? true : id_catch[46];
   }

   @Override
   public void id_class(rrAq_1 var1) {
      this.k();
      if (var1.id_break() instanceof rXe_1 var2) {
         if (!this.id_case() || !this.id_class((rrNV)this.id_byte[12]) || ((List)this.id_byte[5]).isEmpty() || ((List)this.id_byte[6]).isEmpty()) {
            return;
         }

         rJY var20 = var1.id_class();
         if (!var20.id_break()) {
            return;
         }

         if (var20.id_byte != var2.id_class()) {
            return;
         }

         rrTU var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[112]]).id_private().d().id_super();
         if (var4 == null) {
            return;
         }

         rrNt_1 var5 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_throws[113]]).id_break(var20);
         if (var5 == null) {
            return;
         }

         String var6 = var5.id_catch();
         int var7 = var5.id_case();
         if (var7 == -1 || var6 == null) {
            return;
         }

         var5.id_class((rrNV)this.id_byte[12]);
         var5.id_class(var20.id_class().id_implements());
         var5.id_class((List<rrNt_1>)this.id_byte[5]);
         var5.id_break((List<rJY>)this.id_byte[6]);
         ArrayList var8 = new ArrayList();

         for (rrNd_1 var10 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[117]]).id_protected()) {
            if ((!(var5.id_protected().id_break() instanceof rxJ_2 var11) || !(var11.id_catch() instanceof Wp_1) || !(Boolean)this.id_byte[37])
               && this.id_class(var10, var5)) {
               var10.id_class(var5);
               var8.add(var10);
            }
         }

         if (var8.size() > 1) {
            var8.sort(Comparator.naturalOrder());
         }

         if (!var8.isEmpty()) {
            rrNd_1 var21 = ((rrNd_1)var8.get(id_catch[23])).id_byte();
            rrNw_1 var22 = var21.id_break();
            if (var22 == null) {
               return;
            }

            if (!this.id_break() || var21.id_implements()) {
               if ((rrNd_1)this.id_byte[8] == null) {
                  this.id_byte[8] = var21;
                  if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
                     this.id_class(var2.id_case, true);
                  }
               }

               return;
            }

            List var23 = var4.id_break();
            if (((List)this.id_byte[7]).size() >= var23.size()) {
               return;
            }

            List var24 = var4.id_class(var1x -> {
               this.k();
               if (var1x.id_class() != (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_throws[381]]) {
                  return id_catch[135];
               } else if (rqR_2.id_break() - var1x.id_break() < id_implements[13]) {
                  return id_catch[136];
               } else {
                  if (!((List)this.id_byte[7]).isEmpty()) {
                     for (rrNm_1 var3 : (List)this.id_byte[7]) {
                        if (var3.id_break().equals(var1x.id_byte())) {
                           return id_catch[137];
                        }
                     }
                  }

                  return true;
               }
            });
            if (var24.isEmpty()) {
               return;
            }

            rrTY var13 = (rrTY)var24.get(id_catch[25]);
            rrNm_1 var14 = new rrNm_1(var21, var13.id_byte());
            if (!((List)this.id_byte[7]).contains(var14)) {
               var4.id_class(new rrtM_2(var22.id_protected(), var21.id_abstract(), var22.id_catch(), var22.id_case()), var13.id_protected().channel(), true);
               var13.id_class(rqR_2.id_break());
               ((List)this.id_byte[7]).add(var14);
            }
         }
      }
   }

   public boolean id_class(rrNt_1 var1) {
      return this.id_break(var1) >= var1.id_case() ? true : id_catch[94];
   }

   public void id_class(long var1) {
      this.k();
      Long var7 = System.currentTimeMillis() + Math.max(id_implements[1], var1);
      this.id_byte[36] = var7;
      if (var1 > id_implements[2]) {
         rrfu_3.id_byte("AutoBuy: Окно аукциона будет автоматически открыто через " + var1 / 1000L + " секунд");
      }
   }

   public rdn_3 id_class(Fc_1 var1, List<rdn_3> var2, rrNV var3) {
      this.k();
      String var4 = var1.id_new().id_byte();
      if (this.id_case() && var3 instanceof rrNq_1 && !(Boolean)this.id_byte[14]) {
         Matcher var5 = ((Pattern)rrjE_2.id_class[10]).matcher(var4);
         if (var5.find()) {
            String var6 = var5.group(2);
            String var7 = var5.group(3);
            if (!var6.equals(var7)) {
               return this.id_class(var2);
            }

            Boolean var12 = true;
            this.id_byte[14] = var12;
         }
      }

      return this.id_break(var2);
   }

   @Override
   public void id_class(rrFY var1) {
      this.k();
      if ((rrNV)this.id_byte[12] != null) {
         this.id_catch();
      }
   }

   public rrNV id_class(rgP_2 var1) {
      String var2 = var1.id_byte();
      String var3 = var2.toLowerCase();
      Matcher var4 = ((Pattern)rrjE_2.id_class[9]).matcher(var2);
      Matcher var5 = ((Pattern)rrjE_2.id_class[11]).matcher(var2);
      Matcher var6 = ((Pattern)rrjE_2.id_class[10]).matcher(var2);
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
      } else if (Arrays.<String>stream((String[])rrjE_2.id_class[13]).anyMatch(var3::contains)) {
         return new rrNT(var1);
      } else if (Arrays.<String>stream((String[])rrjE_2.id_class[14]).anyMatch(var3::contains)) {
         return new rrNH(var1);
      } else {
         return Arrays.stream((String[])rrjE_2.id_class[15]).anyMatch(var3::contains) ? new rrNl_1(var1) : null;
      }
   }

   public boolean id_class(rrNV var1) {
      return !(var1 instanceof rrNC) && !(var1 instanceof rrNq_1) ? id_catch[84] : true;
   }

   public void id_class(int var1) {
      this.k();
      Integer var6 = (Integer)this.id_byte[26] + var1;
      this.id_byte[26] = var6;
   }

   public void id_class(rrNv_1 var1, List<rrNd_1> var2, String var3, boolean var4) {
      this.k();
      Matcher var5 = ((Pattern)rrjE_2.id_class[10]).matcher(var3);
      if (var5.find()) {
         String var6 = var5.group(1);
         List var7 = this.id_class(var2, var6, var1.id_class());
         if (var7.isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[255]])
               .id_class(new rrtx_3(id_finally[13], "Не удалось найти \"" + var6 + "\"", 3000));
            this.id_class(1);
            return;
         }

         if (((List)this.id_byte[6]).isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[258]])
               .id_class(new rrtx_3(id_finally[14], "Не удалось найти \"" + var6 + "\"", 3000));
            this.id_class(var7.size());
            return;
         }

         ArrayList var8 = new ArrayList();

         for (rJY var10 : (List)this.id_byte[6]) {
            if (var10.id_break()) {
               rrNt_1 var11 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_throws[261]]).id_break(var10);
               if (var11 != null && var11.id_case() != -1 && var11.id_catch() != null) {
                  var11.id_class(var10.id_class());
                  var11.id_class((List<rrNt_1>)this.id_byte[5]);
                  var11.id_break((List<rJY>)this.id_byte[6]);

                  for (rrNd_1 var13 : var7) {
                     if (var13.id_class(var11, var0 -> !(var0 instanceof rrcj_3) && !(var0 instanceof rrcE_2) ? true : id_catch[134])) {
                        var8.add(var11);
                        break;
                     }
                  }
               }
            }
         }

         if (var8.isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[264]])
               .id_class(new rrtx_3(id_finally[15], "Не удалось найти \"" + var6 + "\"", 3000));
            this.id_class(var7.size());
            return;
         }

         if (var4) {
            HashSet var14 = new HashSet(var7);

            for (rrNw_1 var19 : var8) {
               var14.removeIf(var1x -> var1x.id_class(var19, var0x -> !(var0x instanceof rrcj_3) && !(var0x instanceof rrcE_2) ? true : id_catch[132]));
            }

            if (!var14.isEmpty()) {
               for (rrNd_1 var20 : var14) {
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[266]])
                     .id_class(new rrtx_3(id_finally[16], "Не удалось найти \"" + var20.id_case() + "\"", 3000));
                  this.id_class(1);
               }
            }
         }

         rrNi_1 var15 = this.id_class(((rrNw_1)var8.get(id_catch[69])).id_protected(), var6);
         boolean var18 = var15.id_class(
            var6,
            var8,
            var7,
            (var2x, var3x, var4x) -> {
               this.k();
               if (var4 && !var2x.id_implements()) {
                  rrNZ var5x = new rrNZ(var2x, var3x, var4x);
                  if (!((List)this.id_byte[20]).contains(var5x)) {
                     ((List)this.id_byte[19]).add(var5x);
                  }
               } else {
                  var2x.id_break(var4x);
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[379]])
                     .id_class(new rrtQ_2(id_finally[58], "Новая цена на \"" + var2x.id_case() + "\" - " + rql_3.id_class(var2x.id_else(), ' ') + "$", 3000));
                  this.id_class(1);
               }
            }
         );
         if (!var4 && !var18) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[268]])
               .id_class(new rrtx_3(id_finally[17], "Не удалось найти \"" + var6 + "\"", 3000));
            this.id_class(1);
         }
      }
   }

   private boolean id_class(rrTU var1) {
      this.k();
      if (var1 == null) {
         return id_catch[80];
      } else {
         boolean var2 = id_catch[81];

         for (rrTY var4 : var1.id_break()) {
            if (var4.id_class() == (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_throws[278]]
               && rqR_2.id_break() - var4.id_break() > id_implements[11]
               && ((List)this.id_byte[7]).stream().noneMatch(var1x -> var1x.id_break().equals(var4.id_byte()))) {
               var2 = true;
               break;
            }
         }

         return var2;
      }
   }

   private rrNi_1<?> id_class(rdn_3 var1, String var2) {
      rdb_3 var3 = var1.id_break();
      String var4 = var2.toLowerCase();
      if (var3 == rdy_3.kk) {
         return new rrND((var1x, var2x) -> this.id_class(var1x.id_case(), var2x.id_char()));
      } else if (var3 == rdy_3.kz) {
         return new rrNY((var1x, var2x) -> this.id_class(var1x.id_case(), var2x.id_char()));
      } else if (var3 == rdy_3.WN) {
         return new rrNo_1((var1x, var2x) -> this.id_class(var1x.id_case(), var2x.id_char()));
      } else if (var3 == rdy_3.kc) {
         return new rrNe_1((var1x, var2x) -> this.id_class(var1x.id_case(), var2x.id_char()));
      } else if (var3 == rdy_3.OB) {
         return new rrNg_1((var1x, var2x) -> this.id_class(var1x.id_case(), var2x.id_char()));
      } else if (var3 == rdy_3.dJ && var4.startsWith(id_finally[18])) {
         return new rrNK((var1x, var2x) -> this.id_class(var1x.id_case(), var2x.id_char()));
      } else if (var3 == rdy_3.kL && var4.startsWith(id_finally[19])) {
         return new rrNU((var1x, var2x) -> this.id_class(var1x.id_case(), var2x.id_char()));
      } else {
         if (var3 instanceof rxJ_2 var5 && var5.id_catch().id_continue().id_byte() == QP.id_public) {
            return new rrcP_2((var1x, var2x) -> this.id_class(var1x.id_case(), var2x.id_char()));
         }

         return new rrNR((var1x, var2x) -> this.id_class(var1x.id_case(), var2x.id_char()), var1x -> {
            rdn_3 var2x = var1x.id_protected();
            rdb_3 var3x = var2x.id_break();
            if (var3x == rdy_3.OW) {
               if (var4.equals(id_finally[51])) {
                  return !var2x.id_protected(id_finally[52]) && !var2x.id_protected(id_finally[53]) ? id_catch[122] : true;
               }

               if (var4.equals(id_finally[54])) {
                  return !var2x.id_protected(id_finally[55]) && !var2x.id_protected(id_finally[56]) ? true : id_catch[124];
               }
            } else if (var3x == rdy_3.kL) {
               return !var2x.id_protected(id_finally[57]) ? true : id_catch[126];
            }

            return true;
         });
      }
   }

   @Override
   public List<LZ> id_class(Fu_1<?> var1, String var2, int var3, int var4, int var5) {
      this.k();
      ArrayList var6 = new ArrayList();
      if (this.id_break()) {
         rrNQ var12 = new rrNQ(
            this, var3 + var5 + 5, var4, 105, 20, new rgn_3(id_finally[25]), var1x -> this.id_byte(!((Qw_1)id_import.id_class[20]).rB ? true : id_catch[120])
         );
         this.id_byte[4] = var12;
         var6.add((LZ)this.id_byte[4]);
      }

      rrNN var13;
      rrNN var10001 = var13 = new rrNN(this, var3 + var5 + 5, var4, 105, 20, rgN_2.id_byte, var1x -> {
         try {
            this.id_byte();
         } catch (IllegalStateException var3x) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[371]]).id_class(new rrtx_3(id_finally[48], var3x.getMessage(), 3000));
         }
      });
      this.id_byte[1] = var13;
      var6.add(var10001);
      LF var14 = new LF(
         var3 + var5 + 5,
         var4,
         105,
         20,
         new rgn_3(id_finally[26]),
         var2x -> {
            this.k();
            if (this.id_private()) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[365]]).id_class(new rrtx_3(id_finally[46], id_finally[47], 5000));
            } else {
               if (this.id_throws(true)) {
                  rrNv_1 var7x = new rrNv_1((List<rrNd_1>)this.id_byte[18], rqR_2.id_break(), id_catch[118]);
                  this.id_byte[23] = var7x;
                  this.id_throws();
                  this.id_class(
                     (rrNv_1)this.id_byte[23],
                     ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[370]]).id_protected(),
                     var2,
                     this.id_break()
                  );
               }
            }
         }
      );
      this.id_byte[2] = var14;
      if (this.id_protected(var2)) {
         var6.add((LF)this.id_byte[2]);
      }

      LZ var15 = new VF(id_finally[27], id_private[3], 99.0, 1.0F, var0 -> var0.rS, (var0, var1x) -> var0.rS = var1x, (var0, var1x) -> {
         String var10002 = id_finally[45];
         Object[] var10003 = new Object[1];
         var10003[id_catch[116]] = (int)var1x.id_class(var0);
         return new rgn_3(var10002, var10003);
      }).id_class((Qw_1)id_import.id_class[20], var3 + var5 + 5, var4, 105).id_break(1.0F);
      this.id_byte[3] = var15;
      var6.add((LZ)this.id_byte[3]);
      if ((rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         LZ var7 = new VF(id_finally[28], id_private[5], 3000.0, 1.0F, var0 -> var0.rr, (var0, var1x) -> var0.rr = var1x, (var0, var1x) -> {
            String var10002 = id_finally[44];
            Object[] var10003 = new Object[1];
            var10003[id_catch[114]] = (int)var1x.id_class(var0);
            return new rgn_3(var10002, var10003);
         }).id_class((Qw_1)id_import.id_class[20], var3 + var5 + 5, var4, 105).id_break(1.0F);
         var6.add(var7);
      }

      return var6;
   }

   @Override
   public void id_class(rrAZ var1) {
      if (var1.id_class() instanceof Fc_1 var2) {
         this.id_class(var2);
         String var4 = var2.id_new().id_byte();
         this.d();
         this.id_break(var2, var4);
         this.id_class(var2, var4);
      }
   }

   private void m() {
   }

   private void k() {
      if (this.id_byte == null) {
         this.id_byte = new Object[38];
         Object[] var1 = this.id_byte;
         var1[14] = id_catch[140];
         var1[15] = id_catch[141];
         var1[17] = id_catch[142];
         var1[22] = Integer.valueOf(id_catch[143]);
         var1[26] = Integer.valueOf(id_catch[144]);
         var1[27] = id_catch[145];
         var1[28] = id_catch[146];
         var1[32] = Integer.valueOf(id_catch[147]);
         var1[33] = id_implements[14];
         var1[35] = id_implements[15];
         var1[36] = id_implements[16];
         var1[37] = id_catch[148];
      }
   }

   public boolean id_default() {
      this.k();
      return (Boolean)this.id_byte[17];
   }

   private static void v() {
      id_catch = new boolean[]{
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

   public long id_short() {
      this.k();
      return (Long)this.id_byte[36];
   }

   private void z() {
      this.k();
      if ((Long)this.id_byte[36] != id_implements[6] && System.currentTimeMillis() >= (Long)this.id_byte[36]) {
         Long var5 = id_implements[7];
         this.id_byte[36] = var5;
         if ((rrNV)this.id_byte[12] != null && !this.X()) {
            this.id_protected((rrNV)this.id_byte[12]);
         }
      }
   }

   public boolean id_void() {
      this.k();
      return (Boolean)this.id_byte[14];
   }

   private static void u() {
      id_throws = new short[]{
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
      return (List<rrNZ>)this.id_byte[20];
   }

   private static void N() {
      id_case = new byte[]{
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

   public void id_break(long var1) {
      this.k();
      Long var7 = System.currentTimeMillis() + var1;
      this.id_byte[35] = var7;
   }

   public int id_break(rrNt_1 var1) {
      List var2 = rrjm_3.id_class(var1.id_protected());
      String var3 = var1.id_catch();
      int var4 = id_catch[96];

      for (rdn_3 var6 : var2) {
         int var7 = var6.id_char();

         for (rrNd_1 var9 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[306]]).id_protected()) {
            if (var9.id_while()) {
               int var10 = var9.id_else();
               rrNt_1 var11 = new rrNt_1(var6, var3, var10);
               if (var9.id_class(var11, null)) {
                  var4 += var10 * var7;
                  break;
               }
            }
         }
      }

      return var4;
   }

   private void id_break(Fc_1 var1, String var2) {
      this.k();
      if ((rrNV)this.id_byte[12] != null && !((List)this.id_byte[18]).isEmpty()) {
         if ((Integer)this.id_byte[26] >= ((List)this.id_byte[18]).size()) {
            this.W();
         }

         rXe_1 var3 = var1.G_();
         rqs_3 var4 = var3.id_extends();
         boolean var5 = this.id_class((rrNV)this.id_byte[12]);
         int var6 = ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case;
         String var7 = null;
         Matcher var8 = ((Pattern)rrjE_2.id_class[10]).matcher(var2);
         if (var8.find()) {
            var7 = var8.group(1);
         }

         if (var5 && !((List)this.id_byte[19]).isEmpty() && var7 != null) {
            if (((rrfw_3)this.id_byte[16]).id_class(300.0)) {
               this.id_class(var1, var4, var6);
               ((rrfw_3)this.id_byte[16]).id_class();
            }
         } else {
            if (((rrfw_3)this.id_byte[21]).id_class((double)((Integer)this.id_byte[22]).intValue()) && !this.X()) {
               rrNd_1 var14 = (rrNd_1)((List)this.id_byte[18]).get((Integer)this.id_byte[26]);
               this.id_byte[24] = var14;
               String var9 = ((rrNd_1)this.id_byte[24]).id_abstract();
               if (!var9.isEmpty() && !(Boolean)this.id_byte[28]) {
                  Boolean var15 = id_catch[11];
                  this.id_byte[27] = var15;
                  ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_throws[59]]).id_break(new rmj_3(var6));
                  ((cb_3)id_import.id_class[57]).id_case("/ah search " + var9);
                  Boolean var16 = true;
                  this.id_byte[28] = var16;
               }

               Integer var17 = this.E();
               this.id_byte[22] = var17;
               ((rrfw_3)this.id_byte[21]).id_class();
            }

            if ((rrNd_1)this.id_byte[24] != null && (Boolean)this.id_byte[27] && (rrNv_1)this.id_byte[23] != null && var7 != null) {
               this.id_class(
                  (rrNv_1)this.id_byte[23], ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[68]]).id_protected(), var2, this.id_break()
               );
               Object var18 = null;
               this.id_byte[24] = var18;
            }
         }
      }
   }

   @Override
   public void id_break(boolean var1) throws IllegalStateException {
      this.k();
      if (!var1 || this.id_throws(id_catch[58])) {
         super.id_break(var1);
         if (this.id_private()) {
            rrNv_1 var6 = new rrNv_1((List<rrNd_1>)this.id_byte[18], rqR_2.id_break(), true);
            this.id_byte[23] = var6;
         }
      }
   }

   public boolean id_break(Fc_1 var1, Pj_1 var2, rqs_3<rdn_3> var3, String var4, int var5) {
      if (var4.contains(id_finally[20])) {
         return id_catch[75];
      } else {
         rdn_3 var6 = var2.id_class(var3);
         if (var6 == null) {
            return id_catch[76];
         } else {
            int var7 = var1.id_throw();
            if (var7 > 0 && var7 % 5 == 0) {
               ((Ax_1)id_import.id_class[55]).id_class(var5, var3.indexOf(var6), 2, rXa_1.CLONE);
            }

            return true;
         }
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1964311060;
   }

   public rdn_3 id_break(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.id_continue().id_byte();
         if (var4.equals(id_finally[23])) {
            return var3;
         }
      }

      return null;
   }

   public boolean id_break(rrNV var1) {
      return var1 instanceof rrNH;
   }

   private boolean id_throws(boolean var1) {
      this.k();
      if (var1) {
         return this.Q();
      } else {
         ArrayList var2 = new ArrayList();

         for (rrNd_1 var4 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[317]]).id_protected()) {
            if (var4.id_while() && var4.id_class()) {
               var2.add(var4);
            }
         }

         for (rrNd_1 var7 : var2) {
            String var5 = var7.id_abstract();
            if (var5 == null || var5.isEmpty()) {
               throw new IllegalStateException("Не указан SearchName для предмета \"" + var7.id_case() + "\"");
            }

            ((List)this.id_byte[18]).add(var7);
         }

         if (((List)this.id_byte[18]).isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[320]]).id_class(new rrtx_3(id_finally[30], id_finally[31], 3000));
            return id_catch[101];
         } else {
            return true;
         }
      }
   }

   private void id_throws(rrNV var1) {
      if (var1 instanceof rrNq_1 var2) {
         ((cb_3)id_import.id_class[57]).id_case("/ah search " + var2.id_break());
      } else {
         ((cb_3)id_import.id_class[57]).id_case(id_finally[29]);
      }
   }

   private void id_throws(String var1) {
      this.k();
      if ((rrNd_1)this.id_byte[10] != null && (rrNF)this.id_byte[11] != null) {
         rrNd_1 var2 = ((rrNF)this.id_byte[11]).id_break();
         if (var2.equals((rrNd_1)this.id_byte[10])) {
            boolean var3 = id_catch[47];
            if (var1.contains(id_finally[10])) {
               ((rrNF)this.id_byte[11]).id_class((rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[1]);
               var3 = true;
            } else if (var1.contains(id_finally[11])) {
               ((rrNF)this.id_byte[11]).id_class((rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[2]);
               var3 = true;
            }

            if (var3) {
               Object var8 = null;
               this.id_byte[11] = var8;
               Object var9 = null;
               this.id_byte[10] = var9;
            }
         }
      }
   }

   @Override
   public void id_throws() {
      this.k();
      super.id_throws();
      rrNV var5 = (rrNV)this.id_byte[12];
      this.id_byte[25] = var5;
      Integer var6 = this.E();
      this.id_byte[22] = var6;
      Integer var7 = Integer.valueOf(id_catch[60]);
      this.id_byte[26] = var7;
   }

   private String L() {
      this.k();
      long var1 = Math.max(id_implements[0], System.currentTimeMillis() - (Long)this.id_byte[33]);
      return rql_3.id_class(Duration.ofMillis(var1));
   }

   public List<rrNd_1> M() {
      this.k();
      return (List<rrNd_1>)this.id_byte[18];
   }

   private void W() {
      this.k();
      rrNv_1 var1 = (rrNv_1)this.id_byte[23];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[327]]).id_class(new rrtQ_2(id_finally[32], id_finally[33], 3000));
      MinecraftAccessor.a_(id_finally[34], id_catch[107]);
      if (var1 != null) {
         List var2 = var1.id_byte();
         long var3 = var1.id_break();
         long var5 = rqR_2.id_break() - var3;
         int var7 = var2.size();
         rVi_1 var10000 = new rgN_2(id_finally[35]).id_class(rgF_2.GRAY).id_break(id_finally[36]);
         long var10004 = (long)var7;
         String[] var10005 = new String[4];
         var10005[id_catch[108]] = id_finally[37];
         var10005[1] = id_finally[38];
         var10005[2] = id_finally[39];
         var10005[3] = id_finally[40];
         var10000 = var10000.id_class(new rgN_2(var7 + " " + rql_3.id_class(var10004, var10005)).id_class(rgF_2.RED)).id_break(id_finally[41]);
         String var10003 = id_finally[42];
         Object[] var10 = new Object[2];
         var10[id_catch[110]] = (double)var5 / 1000.0;
         var10[1] = id_finally[43];
         rVi_1 var8 = var10000.id_class(new rgN_2(String.format(var10003, var10)).id_class(rgF_2.RED));
         rrfu_3.id_class(var8);
      }

      this.id_break(id_catch[112]);
   }

   public LF P() {
      this.k();
      return (LF)this.id_byte[1];
   }

   @Override
   public void id_catch() {
      this.k();
      super.id_catch();
      if (!((List)this.id_byte[18]).isEmpty()) {
         this.id_extends();
      }
   }

   public rrfw_3 G() {
      this.k();
      return (rrfw_3)this.id_byte[21];
   }

   @Override
   public void id_extends() {
      this.k();
      super.id_extends();
      ((List)this.id_byte[18]).clear();
      ((List)this.id_byte[19]).clear();
      ((List)this.id_byte[20]).clear();
      ((rrfw_3)this.id_byte[21]).id_class();
      Object var5 = null;
      this.id_byte[24] = var5;
      Object var6 = null;
      this.id_byte[25] = var6;
      Integer var7 = Integer.valueOf(id_catch[61]);
      this.id_byte[26] = var7;
      Boolean var8 = id_catch[62];
      this.id_byte[28] = var8;
      Boolean var9 = id_catch[63];
      this.id_byte[27] = var9;
   }

   public boolean id_goto() {
      this.k();
      return (Boolean)this.id_byte[15];
   }

   @Override
   public boolean id_case() {
      this.k();
      return super.id_case() && (rrNV)this.id_byte[12] != null ? true : id_catch[55];
   }

   public rrNd_1 id_const() {
      this.k();
      return (rrNd_1)this.id_byte[9];
   }

   public void id_continue() {
      this.k();
      Long var5 = id_implements[5];
      this.id_byte[36] = var5;
   }

   public rrfw_3 id_else() {
      this.k();
      return (rrfw_3)this.id_byte[29];
   }

   public int id_for() {
      this.k();
      return (Integer)this.id_byte[32];
   }

   public boolean id_import() {
      return ((Qw_1)id_import.id_class[20]).rB && this.id_break() ? true : id_catch[100];
   }

   public long id_instanceof() {
      this.k();
      return (Long)this.id_byte[33];
   }

   public rrNu_1 id_new() {
      this.k();
      return (rrNu_1)this.id_byte[30];
   }

   public LF id_package() {
      this.k();
      return (LF)this.id_byte[2];
   }

   public rrNd_1 id_return() {
      this.k();
      return (rrNd_1)this.id_byte[24];
   }

   public LF id_super() {
      this.k();
      return (LF)this.id_byte[id_throws[329]];
   }

   public rrNV id_switch() {
      this.k();
      return (rrNV)this.id_byte[12];
   }

   public boolean id_throw() {
      this.k();
      return (Boolean)this.id_byte[28];
   }

   public int id_try() {
      this.k();
      return (Integer)this.id_byte[26];
   }

   public boolean id_while() {
      this.k();
      return (Boolean)this.id_byte[27];
   }

   public List<rrNZ> id_static() {
      this.k();
      return (List<rrNZ>)this.id_byte[19];
   }

   public boolean id_public() {
      return C_throws.id_byte().id_for().id_class() >= 450L ? true : id_catch[98];
   }

   public void id_protected(boolean var1) {
      this.k();
      Boolean var6 = var1;
      this.id_byte[15] = var6;
   }

   @Override
   public void id_protected() {
      this.k();
      super.id_protected();
      Long var5 = System.currentTimeMillis();
      this.id_byte[33] = var5;
   }

   public boolean id_protected(String var1) {
      Matcher var2 = ((Pattern)rrjE_2.id_class[10]).matcher(var1);
      if (!var2.find()) {
         return id_catch[74];
      } else {
         String var3 = var2.group(1);

         for (rrNd_1 var5 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[271]]).id_protected()) {
            for (String var8 : var5.id_private()) {
               if (var8.toLowerCase().startsWith(var3.toLowerCase())) {
                  return true;
               }
            }
         }

         return id_catch[73];
      }
   }

   private void id_protected(rrNV var1) {
      ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_throws[303]]).id_break(new rmj_3(((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case));
      this.id_throws(var1);
   }

   public rrfw_3 id_abstract() {
      this.k();
      return (rrfw_3)this.id_byte[16];
   }

   public rrNV id_final() {
      this.k();
      return (rrNV)this.id_byte[13];
   }

   public long id_transient() {
      this.k();
      return (Long)this.id_byte[35];
   }

   public List<rrNt_1> id_synchronized() {
      this.k();
      return (List<rrNt_1>)this.id_byte[5];
   }

   public rrNv_1 id_strictfp() {
      this.k();
      return (rrNv_1)this.id_byte[23];
   }

   public int E() {
      return 200;
   }

   private static void A() {
      Object[] var0 = new Object[]{new Random(), 0};
      id_protected = var0;
   }

   private boolean X() {
      PF var1 = C_throws.id_byte().id_try();
      return var1.id_class(true);
   }

   private boolean Q() {
      this.k();
      rrNV var1 = (rrNV)this.id_byte[12];
      if (var1 instanceof rrNq_1 var2) {
         Matcher var3 = ((Pattern)rrjE_2.id_class[10]).matcher(var2.id_class().id_byte());
         if (var3.find()) {
            String var4 = var3.group(1);
            List var5 = this.id_class(((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[324]]).id_protected(), var4, id_catch[104]);
            ((List)this.id_byte[18]).addAll(var5);
            return true;
         }
      }

      return id_catch[106];
   }
}
