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
      return (List<rrNm_1>)this.id_byte[id_throws[336]];
   }

   public rrNV id_char() {
      this.k();
      return (rrNV)this.id_byte[id_throws[359]];
   }

   public void id_byte(boolean var1) {
      ((Qw_1)id_import.id_class[id_throws[312]]).rB = var1;
      if (((Qw_1)id_import.id_class[id_throws[313]]).rB) {
         this.n();
      } else {
         this.m();
      }
   }

   public boolean id_byte(rrNV var1) {
      return !(var1 instanceof rrNC) && !(var1 instanceof rrNq_1) ? id_catch[86] : id_catch[85];
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
         return var2.size() == id_catch[87] ? (rdn_3)var2.get(id_catch[88]) : (rdn_3)var2.get(((Random)id_protected[id_throws[280]]).nextInt(var2.size()));
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
      return (List<rJY>)this.id_byte[id_throws[335]];
   }

   public rrNV id_long() {
      this.k();
      return (rrNV)this.id_byte[id_throws[353]];
   }

   public void id_float() {
      this.id_class(id_implements[4]);
   }

   public boolean id_double() {
      this.k();
      return System.currentTimeMillis() >= this.id_byte[id_throws[20]] ? id_catch[5] : id_catch[6];
   }

   public rrNW(C_class var1) {
      rrfq_3[] var10002 = new rrfq_3[id_case[0]];
      var10002[id_catch[0]] = (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[0]];
      var10002[id_catch[1]] = (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[1]];
      super(var1, var10002);
      this.k();
      ArrayList var6 = new ArrayList();
      this.id_byte[id_throws[2]] = var6;
      ArrayList var7 = new ArrayList();
      this.id_byte[id_throws[3]] = var7;
      ArrayList var8 = new ArrayList();
      this.id_byte[id_throws[4]] = var8;
      rrfw_3 var9 = new rrfw_3();
      this.id_byte[id_throws[5]] = var9;
      ArrayList var10 = new ArrayList();
      this.id_byte[id_throws[6]] = var10;
      ArrayList var11 = new ArrayList();
      this.id_byte[id_throws[7]] = var11;
      ArrayList var12 = new ArrayList();
      this.id_byte[id_throws[8]] = var12;
      rrfw_3 var13 = new rrfw_3();
      this.id_byte[id_throws[9]] = var13;
      Integer var14 = this.E();
      this.id_byte[id_throws[10]] = var14;
      rrfw_3 var15 = new rrfw_3();
      this.id_byte[id_throws[11]] = var15;
      Integer var16 = Integer.valueOf(id_catch[2]);
      this.id_byte[id_throws[12]] = var16;
   }

   static {
      ntfClinit();
   }

   public LZ B() {
      this.k();
      return (LZ)this.id_byte[id_throws[332]];
   }

   private boolean C() {
      if ((rrfq_3)rrfp_3.id_class[id_throws[126]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[127]]) {
         return id_catch[31];
      } else {
         int var1 = id_catch[27];

         for (int var2 = id_catch[28]; var2 < id_case[4]; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_throws[128]]).id_implements[id_throws[129]]).id_extends(var2);
            if (var3.id_break() instanceof rxJ_2 var4 && var4.id_catch() instanceof Wp_1) {
               var1++;
            }

            if (var1 >= id_case[5]) {
               break;
            }
         }

         return var1 == id_case[6] ? id_catch[29] : id_catch[30];
      }
   }

   private void F() {
      this.k();
      if ((rrNu_1)this.id_byte[id_throws[96]] != null) {
         switch (((int[])rrNc_1.id_class[id_throws[97]])[((rrNu_1)this.id_byte[id_throws[98]]).ordinal()]) {
            case 1:
               if (((rrfw_3)this.id_byte[id_throws[99]]).id_class(id_private[1])) {
                  rrNV var5 = (rrNV)this.id_byte[id_throws[100]];
                  this.id_byte[id_throws[101]] = var5;
                  if (this.h()) {
                     Integer var6 = (Integer)this.id_byte[id_throws[102]] + id_catch[21];
                     this.id_byte[id_throws[103]] = var6;
                  }

                  ((rrfw_3)this.id_byte[id_throws[104]]).id_class();
               }
               break;
            case 2:
               if ((rrNV)this.id_byte[id_throws[105]] != null && ((rrfw_3)this.id_byte[id_throws[106]]).id_class(id_private[2])) {
                  this.id_throws((rrNV)this.id_byte[id_throws[107]]);
                  ((rrfw_3)this.id_byte[id_throws[108]]).id_class();
               }
         }
      }
   }

   private static void J() {
      id_implements = new long[]{0L, 0L, 0L, 1000L, 0L, 0L, 0L, 0L, 1000L, 100L, 0L, 0L, 450L, 0L, 0L, 0L, 0L};
   }

   public rrNd_1 S() {
      this.k();
      return (rrNd_1)this.id_byte[id_throws[337]];
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
      return (rrNF)this.id_byte[id_throws[340]];
   }

   public rgP_2 b() {
      this.k();
      return (rgP_2)this.id_byte[id_throws[362]];
   }

   private static void x() {
      id_private = new double[]{300.0, 1000.0, 1000.0, 0.0, 99.0, 0.0, 3000.0, 1000.0};
   }

   public rrNd_1 s() {
      this.k();
      return (rrNd_1)this.id_byte[id_throws[339]];
   }

   private static void c() {
      id_extends = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   }

   private void n() {
   }

   private boolean h() {
      this.k();
      PI var1 = C_throws.id_byte().id_native().id_protected();
      rrjx_3 var2 = rrjS_2.id_class(var1, (Integer)this.id_byte[id_throws[252]]);
      if (var2 == null) {
         rrfu_3.id_byte(id_finally[12]);
         return id_catch[64];
      } else {
         String var3 = var2.id_class();
         int var4 = var2.id_break();
         ((cb_3)id_import.id_class[id_throws[253]]).id_protected("/" + var3 + var4);
         rrfu_3.id_byte("Anti Delay: Переподключение на " + var3 + var4);
         return id_catch[65];
      }
   }

   private int l() {
      return (rrfq_3)rrfp_3.id_class[id_throws[82]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[83]]
         ? id_throws[84]
         : (int)((Qw_1)id_import.id_class[id_throws[85]]).rr;
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
      return (LZ)this.id_byte[id_throws[333]];
   }

   private void id_class(Fc_1 var1, String var2) {
      this.k();
      boolean var3 = this.id_case();
      if (var3) {
         Pj_1 var4 = C_throws.id_byte().id_package();
         rXe_1 var5 = var1.G_();
         rqs_3 var6 = var5.id_extends();
         int var7 = ((rJr_1)((cb_3)id_import.id_class[id_throws[70]]).id_implements[id_throws[71]]).id_case;
         boolean var8 = this.id_class((rrNV)this.id_byte[id_throws[72]]);
         boolean var9 = this.id_break((rrNV)this.id_byte[id_throws[73]]);
         boolean var10 = this.id_break()
               && !this.id_class(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[74]]).id_private().d().id_super())
            ? id_catch[14]
            : id_catch[13];
         if (var8) {
            if (!((List)this.id_byte[id_throws[75]]).isEmpty()) {
               return;
            }

            if (this.id_class(var7, id_catch[15])) {
               return;
            }
         } else if (var9) {
            rdn_3 var13 = this.id_byte(var6);
            int var12 = var6.indexOf(var13);
            if (var12 != id_case[1]) {
               ((Ax_1)id_import.id_class[id_throws[76]]).id_class(var7, var12, id_case[2], rXa_1.CLONE);
            }

            return;
         }

         FtHelper var11 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[77]]).id_private().id_default();
         if (var11.aJ_() && var11.id_continue()) {
            if (var4.id_byte() && this.id_double()) {
               this.id_break(var1, var4, var6, var2, var7);
               return;
            }

            if ((Boolean)this.id_byte[id_throws[78]]) {
               this.id_class(var1, var4, var6, var2, var7);
               return;
            }
         }

         if (var8 && ((rrfw_3)this.id_byte[id_throws[79]]).id_class((double)this.l()) && (((Qw_1)id_import.id_class[id_throws[80]]).rP || var10)) {
            this.id_class(var1, var6, var7);
            ((rrfw_3)this.id_byte[id_throws[81]]).id_class();
         }
      }
   }

   @Override
   public void id_class() {
      this.k();
      super.id_class();
      rrFe_1.id_class((rrNV)this.id_byte[id_throws[225]], (rrFa_1)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[id_throws[226]]);
      Object var5 = null;
      this.id_byte[id_throws[227]] = var5;
      Object var6 = null;
      this.id_byte[id_throws[228]] = var6;
      Integer var7 = Integer.valueOf(id_catch[56]);
      this.id_byte[id_throws[229]] = var7;
      Boolean var8 = id_catch[57];
      this.id_byte[id_throws[230]] = var8;
      Object var9 = null;
      this.id_byte[id_throws[231]] = var9;
      Long var10 = id_implements[10];
      this.id_byte[id_throws[232]] = var10;
      this.id_continue();
      ((rrfw_3)this.id_byte[id_throws[233]]).id_class();
      ((List)this.id_byte[id_throws[234]]).clear();
      ((List)this.id_byte[id_throws[235]]).clear();
      ((List)this.id_byte[id_throws[236]]).clear();
   }

   @Override
   public void id_class(rrAT var1) {
      this.k();
      if ((rrNV)this.id_byte[id_throws[130]] != null) {
         if (var1.id_class() instanceof rXe_1 var2) {
            List var18 = var1.id_byte();
            ((List)this.id_byte[id_throws[131]]).clear();
            ((List)this.id_byte[id_throws[132]]).clear();
            ((List)this.id_byte[id_throws[133]]).clear();

            for (rJY var5 : var18) {
               if (var5.id_break() && var5.id_byte == var2.id_class() && var5.id_protected <= id_case[7]) {
                  ((List)this.id_byte[id_throws[134]]).add(var5);
                  rrNt_1 var6 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_throws[135]]).id_break(var5);
                  if (var6 != null) {
                     String var7 = var6.id_catch();
                     int var8 = var6.id_case();
                     if (var7 != null && var8 != id_case[8]) {
                        var6.id_class((rrNV)this.id_byte[id_throws[136]]);
                        var6.id_class(var5.id_class().id_implements());
                        ((List)this.id_byte[id_throws[137]]).add(var6);
                     }
                  }
               }
            }

            Boolean var17 = id_catch[32];
            this.id_byte[id_throws[138]] = var17;
            if (((List)this.id_byte[id_throws[139]]).isEmpty() && !((List)this.id_byte[id_throws[140]]).isEmpty()) {
               ((List)this.id_byte[id_throws[141]]).clear();
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[142]]).id_class(new rrtx_3(id_finally[2], id_finally[3], id_throws[143]));
               this.id_class(id_catch[33]);
            } else if (!((List)this.id_byte[id_throws[144]]).isEmpty() && (rrNv_1)this.id_byte[id_throws[145]] != null) {
               for (rrNZ var20 : (List)this.id_byte[id_throws[146]]) {
                  if (((List)this.id_byte[id_throws[147]]).contains(var20)) {
                     ((List)this.id_byte[id_throws[148]]).remove(var20);
                  } else {
                     rrNd_1 var21 = var20.id_byte();
                     rrNw_1 var22 = var20.id_class();
                     if (var22 != null) {
                        rdn_3 var23 = var22.id_protected();
                        boolean var9 = id_catch[34];

                        for (rrNt_1 var11 : (List)this.id_byte[id_throws[149]]) {
                           rdn_3 var12 = var11.id_protected();
                           if (var12.id_break() == var23.id_break()
                              && var12.id_continue().id_byte().equals(var23.id_continue().id_byte())
                              && var11.id_catch().equals(var22.id_catch())
                              && var11.id_case() == var22.id_case()) {
                              var9 = id_catch[35];
                              break;
                           }
                        }

                        if (var9) {
                           var21.id_break(var20.id_break());
                           ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[150]])
                              .id_class(
                                 new rrtQ_2(
                                    id_finally[4],
                                    "Новая цена на \"" + var21.id_case() + "\" - " + rql_3.id_class(var21.id_else(), (char)id_case[9]) + "$",
                                    id_throws[151]
                                 )
                              );
                           this.id_class(id_catch[36]);
                           ((List)this.id_byte[id_throws[152]]).remove(var20);
                           ((List)this.id_byte[id_throws[153]]).add(var20);
                        } else {
                           ((List)this.id_byte[id_throws[154]]).remove(var20);
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
                              .id_class(new rgN_2(rql_3.id_class(var22.id_case(), (char)id_case[10]) + "$").id_class(rgF_2.RED));
                           rrfu_3.id_class(var25);
                           this.id_class(
                              (rrNv_1)this.id_byte[id_throws[155]],
                              Collections.singletonList(var21),
                              ((rrNV)this.id_byte[id_throws[156]]).id_class().id_byte(),
                              this.id_break()
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
         var1.id_class(id_catch[50]);
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
      int var8 = (var4 - var6) / id_case[21];
      int var9 = (var5 - var7) / id_case[22];
      List var10 = this.id_class(var1, var3, var8, var9, var6);
      if (this.id_byte(var2)) {
         for (int var11 = id_catch[92]; var11 < var10.size(); var11++) {
            LZ var12 = (LZ)var10.get(var11);
            int var13 = var8 + var6 + id_case[23];
            int var14 = var9 + id_case[24] * var11 + id_case[25];
            var12.id_volatile = var13;
            var12.id_final = var14;
            var1.id_class(var12);
         }
      }

      if (this.id_class(var2)) {
         rrNz_1 var19 = new rrNz_1(
            this,
            var4 / id_case[26] - id_case[27],
            var9 - id_case[28],
            id_case[29],
            id_case[30],
            rgN_2.id_byte,
            var1x -> {
               try {
                  this.id_implements();
               } catch (IllegalStateException var3x) {
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[375]])
                     .id_class(new rrtx_3(id_finally[50], var3x.getMessage(), id_throws[376]));
               }
            },
            (var1x, var2x, var3x, var4x) -> {
               AutoBuy var5x = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[374]]).id_private().d();
               boolean var6x = var5x.aJ_();
               if (!var6x) {
                  var1.id_class(var2x, new rgn_3(id_finally[49]), var3x, var4x);
               }
            }
         );
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
         this.id_byte[id_throws[273]] = var12;
      } else {
         rdn_3 var6 = var2.id_byte(var3);
         if (var6 != null) {
            int var7 = var1.id_throw();
            if (var7 > 0 && var7 % id_case[16] == 0) {
               ((Ax_1)id_import.id_class[id_throws[274]]).id_class(var5, var3.indexOf(var6), id_case[17], rXa_1.CLONE);
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
         Boolean var6 = this.id_case() && this.C() ? id_catch[7] : id_catch[8];
         this.id_byte[id_throws[23]] = var6;
      }
   }

   @Override
   public void id_class(rrFo_1 var1) {
      this.k();
      Object var6 = null;
      this.id_byte[id_throws[180]] = var6;
      ((List)this.id_byte[id_throws[181]]).clear();
      ((List)this.id_byte[id_throws[182]]).clear();
      ((List)this.id_byte[id_throws[183]]).clear();
      Object var7 = null;
      this.id_byte[id_throws[184]] = var7;
      if ((rrNV)this.id_byte[id_throws[185]] != null) {
         rrNV var8 = (rrNV)this.id_byte[id_throws[186]];
         this.id_byte[id_throws[187]] = var8;
      }

      if (!((rrNV)this.id_byte[id_throws[188]] instanceof rrNT)) {
         Boolean var9 = id_catch[40];
         this.id_byte[id_throws[189]] = var9;
      }

      if (this.id_case() && (Boolean)this.id_byte[id_throws[190]]) {
         var1.id_class(id_catch[41]);
         Boolean var10 = id_catch[42];
         this.id_byte[id_throws[191]] = var10;
      }

      Object var11 = null;
      this.id_byte[id_throws[192]] = var11;
   }

   private void id_class(Fc_1 var1, rqs_3<rdn_3> var2, int var3) {
      this.k();
      rdn_3 var4 = this.id_class(var1, var2, (rrNV)this.id_byte[id_throws[196]]);
      int var5 = var2.indexOf(var4);
      if (var5 != id_case[11]) {
         ((Ax_1)id_import.id_class[id_throws[197]]).id_class(var3, var5, id_case[12], rXa_1.CLONE);
         rrFe_1.id_class((rrNV)this.id_byte[id_throws[198]], (rrFa_1)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[id_throws[199]]);
      }
   }

   @Override
   public void id_class(rrLu_1 var1) {
      this.k();
      ruS_2 var2 = var1.id_class();
      if (var2 instanceof rvt_3 var3) {
         rqA_2 var4 = var3.id_break();
         if (var4 == rqn_3.Mu && this.id_private()) {
            Integer var9 = Integer.valueOf(id_throws[219]);
            this.id_byte[id_throws[220]] = var9;
            Boolean var10 = id_catch[51];
            this.id_byte[id_throws[221]] = var10;
         }

         if ((var4 == rqn_3.Mu || var4 == rqn_3.BC || var4 == rqn_3.dw) && this.id_case()) {
            var1.id_class(id_catch[52]);
         }
      } else if (var2 instanceof rZU) {
         Boolean var11 = id_catch[53];
         this.id_byte[id_throws[222]] = var11;
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
      if ((rrNu_1)this.id_byte[id_throws[31]] == (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[id_throws[32]]) {
         rrNu_1 var6 = (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[id_throws[33]];
         this.id_byte[id_throws[34]] = var6;
         ((rrfw_3)this.id_byte[id_throws[35]]).id_class();
         Integer var7 = Integer.valueOf(id_catch[9]);
         this.id_byte[id_throws[36]] = var7;
      } else {
         this.id_catch();
      }
   }

   private void id_class(Fc_1 var1) {
      this.k();
      if ((rgP_2)this.id_byte[id_throws[13]] != null) {
         rVi_1 var2 = ((rgP_2)this.id_byte[id_throws[14]]).id_case();
         if ((rrNV)this.id_byte[id_throws[15]] instanceof rrNC && this.id_case()) {
            var2.id_break(id_finally[0]).id_class(new rgN_2("[⌚ " + this.L() + "]").id_break(rgF_2.YELLOW));
         } else if ((rrNV)this.id_byte[id_throws[16]] instanceof rrNq_1 && this.id_private()) {
            int var3 = ((List)this.id_byte[id_throws[17]]).size();
            int var4 = Math.min((Integer)this.id_byte[id_throws[18]] + id_catch[3], var3);
            var2.id_break(id_finally[1]).id_class(new rgN_2("[" + var4 + "/" + var3 + "]").id_break(rgF_2.YELLOW));
         }

         var1.id_class(var2);
      }
   }

   @Override
   public void id_class(rrLU var1) {
      this.k();
      if (var1.id_class() instanceof Fc_1 var2 && (rrfq_3)rrfp_3.id_class[id_throws[157]] != null) {
         rgP_2 var17 = var2.id_new();
         if (this.id_finally().contains((rrfq_3)rrfp_3.id_class[id_throws[158]])) {
            rrNV var10 = this.id_class(var17);
            this.id_byte[id_throws[159]] = var10;
            this.id_class(var2, (rrNV)this.id_byte[id_throws[160]]);
         }

         rgP_2 var11 = !((rrNV)this.id_byte[id_throws[161]] instanceof rrNC) && !((rrNV)this.id_byte[id_throws[162]] instanceof rrNq_1) ? null : var17;
         this.id_byte[id_throws[163]] = var11;
         this.id_class(var2);
         if ((rrNV)this.id_byte[id_throws[164]] != null && this.id_import() && this.id_case()) {
            if ((rrNu_1)this.id_byte[id_throws[165]] == null && this.id_public()) {
               rrNu_1 var12 = (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[id_throws[166]];
               this.id_byte[id_throws[167]] = var12;
            } else if ((rrNu_1)this.id_byte[id_throws[168]] == (rrNu_1)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[id_throws[169]]
               && (rrNV)this.id_byte[id_throws[170]] != null) {
               ((rrfw_3)this.id_byte[id_throws[171]]).id_class();
               Object var13 = null;
               this.id_byte[id_throws[172]] = var13;
            }
         }

         if (!((rrNV)this.id_byte[id_throws[173]] instanceof rrNH)) {
            Object var14 = null;
            this.id_byte[id_throws[174]] = var14;
         }

         Boolean var15 = id_catch[38];
         this.id_byte[id_throws[175]] = var15;
         Boolean var16 = id_catch[39];
         this.id_byte[id_throws[176]] = var16;
         ((rrfw_3)this.id_byte[id_throws[177]]).id_class();
         if (this.id_break()) {
            rrTU var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[178]]).id_private().d().id_super();
            if ((rrNV)this.id_byte[id_throws[179]] != null && this.id_case() && var4 != null) {
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

         for (rrNm_1 var10 : (List)this.id_byte[id_throws[210]]) {
            rrNd_1 var11 = var10.id_class();
            rrNw_1 var12 = var11.id_break();
            if (var12 != null) {
               rdn_3 var13 = var12.id_protected();
               if (var13.id_break() == var5.id_break()
                  && var12.id_case() == var7
                  && var12.id_catch().equals(var6)
                  && var13.id_continue().id_byte().equals(var5.id_continue().id_byte())) {
                  if (var8 == (rrts_3)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[id_throws[211]]) {
                     this.id_byte[id_throws[212]] = var11;
                     ((List)this.id_byte[id_throws[213]]).clear();
                  } else {
                     ((List)this.id_byte[id_throws[214]]).remove(var10);
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
                  && ((List)this.id_byte[id_throws[217]]).removeIf(var1x -> var1x.id_break().equals(var21))) {
                  Object var19 = null;
                  this.id_byte[id_throws[218]] = var19;
               }
               break;
            }
         }
      }
   }

   private List<rrNd_1> id_class(List<rrNd_1> var1, String var2, boolean var3) {
      List var4;
      if (var3) {
         var4 = var1.stream().filter(var0 -> var0.id_while() && var0.id_class() ? id_catch[128] : id_catch[129]).toList();
      } else {
         var4 = var1;
      }

      return var4.stream().filter(var1x -> var1x.id_private().stream().anyMatch(var1xx -> var1xx.toLowerCase().startsWith(var2.toLowerCase()))).toList();
   }

   private boolean id_class(int var1, boolean var2) {
      this.k();
      if (var2 && (rrNd_1)this.id_byte[id_throws[86]] != null) {
         rrNw_1 var3 = ((rrNd_1)this.id_byte[id_throws[87]]).id_break();
         if (var3 == null) {
            return id_catch[16];
         } else {
            rJY var4 = var3.id_throws();
            rdn_3 var5 = var4.id_class();
            ((Ax_1)id_import.id_class[id_throws[88]]).id_break(var1, var4.id_protected, id_catch[17], rXa_1.QUICK_MOVE, id_catch[18]);
            rrNF var10 = new rrNF(this, (rrNd_1)this.id_byte[id_throws[89]]);
            this.id_byte[id_throws[90]] = var10;
            rrNd_1 var11 = (rrNd_1)this.id_byte[id_throws[91]];
            this.id_byte[id_throws[92]] = var11;
            rrNd_1 var12 = (rrNd_1)this.id_byte[id_throws[93]];
            this.id_byte[id_throws[94]] = var12;
            Object var13 = null;
            this.id_byte[id_throws[95]] = var13;
            return id_catch[19];
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
         if ((rrfq_3)rrfp_3.id_class[id_throws[193]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[194]]
            && (this.id_case() || this.id_private())) {
            Matcher var3 = ((Pattern)rrjE_2.id_class[id_throws[195]]).matcher(var2);
            if (var3.find()) {
               try {
                  this.id_class(Long.parseLong(var3.group(id_catch[43])) * id_implements[8] + id_implements[9]);
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
         return id_catch[44];
      }

      return var1.id_while() && var1.id_class(var2, null) ? id_catch[45] : id_catch[46];
   }

   @Override
   public void id_class(rrAq_1 var1) {
      this.k();
      if (var1.id_break() instanceof rXe_1 var2) {
         if (!this.id_case()
            || !this.id_class((rrNV)this.id_byte[id_throws[109]])
            || ((List)this.id_byte[id_throws[110]]).isEmpty()
            || ((List)this.id_byte[id_throws[111]]).isEmpty()) {
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
         if (var7 == id_case[3] || var6 == null) {
            return;
         }

         var5.id_class((rrNV)this.id_byte[id_throws[114]]);
         var5.id_class(var20.id_class().id_implements());
         var5.id_class((List<rrNt_1>)this.id_byte[id_throws[115]]);
         var5.id_break((List<rJY>)this.id_byte[id_throws[116]]);
         ArrayList var8 = new ArrayList();

         for (rrNd_1 var10 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[117]]).id_protected()) {
            if ((!(var5.id_protected().id_break() instanceof rxJ_2 var11) || !(var11.id_catch() instanceof Wp_1) || !(Boolean)this.id_byte[id_throws[118]])
               && this.id_class(var10, var5)) {
               var10.id_class(var5);
               var8.add(var10);
            }
         }

         if (var8.size() > id_catch[22]) {
            var8.sort(Comparator.naturalOrder());
         }

         if (!var8.isEmpty()) {
            rrNd_1 var21 = ((rrNd_1)var8.get(id_catch[23])).id_byte();
            rrNw_1 var22 = var21.id_break();
            if (var22 == null) {
               return;
            }

            if (!this.id_break() || var21.id_implements()) {
               if ((rrNd_1)this.id_byte[id_throws[119]] == null) {
                  this.id_byte[id_throws[120]] = var21;
                  if ((rrfq_3)rrfp_3.id_class[id_throws[121]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[122]]) {
                     this.id_class(var2.id_case, id_catch[24]);
                  }
               }

               return;
            }

            List var23 = var4.id_break();
            if (((List)this.id_byte[id_throws[123]]).size() >= var23.size()) {
               return;
            }

            List var24 = var4.id_class(var1x -> {
               this.k();
               if (var1x.id_class() != (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_throws[381]]) {
                  return id_catch[135];
               } else if (rqR_2.id_break() - var1x.id_break() < id_implements[13]) {
                  return id_catch[136];
               } else {
                  if (!((List)this.id_byte[id_throws[382]]).isEmpty()) {
                     for (rrNm_1 var3 : (List)this.id_byte[id_throws[383]]) {
                        if (var3.id_break().equals(var1x.id_byte())) {
                           return id_catch[137];
                        }
                     }
                  }

                  return id_catch[138];
               }
            });
            if (var24.isEmpty()) {
               return;
            }

            rrTY var13 = (rrTY)var24.get(id_catch[25]);
            rrNm_1 var14 = new rrNm_1(var21, var13.id_byte());
            if (!((List)this.id_byte[id_throws[124]]).contains(var14)) {
               var4.id_class(
                  new rrtM_2(var22.id_protected(), var21.id_abstract(), var22.id_catch(), var22.id_case()), var13.id_protected().channel(), id_catch[26]
               );
               var13.id_class(rqR_2.id_break());
               ((List)this.id_byte[id_throws[125]]).add(var14);
            }
         }
      }
   }

   public boolean id_class(rrNt_1 var1) {
      return this.id_break(var1) >= var1.id_case() ? id_catch[93] : id_catch[94];
   }

   public void id_class(long var1) {
      this.k();
      Long var7 = System.currentTimeMillis() + Math.max(id_implements[1], var1);
      this.id_byte[id_throws[24]] = var7;
      if (var1 > id_implements[2]) {
         rrfu_3.id_byte("AutoBuy: Окно аукциона будет автоматически открыто через " + var1 / id_implements[3] + " секунд");
      }
   }

   public rdn_3 id_class(Fc_1 var1, List<rdn_3> var2, rrNV var3) {
      this.k();
      String var4 = var1.id_new().id_byte();
      if (this.id_case() && var3 instanceof rrNq_1 && !(Boolean)this.id_byte[id_throws[275]]) {
         Matcher var5 = ((Pattern)rrjE_2.id_class[id_throws[276]]).matcher(var4);
         if (var5.find()) {
            String var6 = var5.group(id_case[18]);
            String var7 = var5.group(id_case[19]);
            if (!var6.equals(var7)) {
               return this.id_class(var2);
            }

            Boolean var12 = id_catch[79];
            this.id_byte[id_throws[277]] = var12;
         }
      }

      return this.id_break(var2);
   }

   @Override
   public void id_class(rrFY var1) {
      this.k();
      if ((rrNV)this.id_byte[id_throws[37]] != null) {
         this.id_catch();
      }
   }

   public rrNV id_class(rgP_2 var1) {
      String var2 = var1.id_byte();
      String var3 = var2.toLowerCase();
      Matcher var4 = ((Pattern)rrjE_2.id_class[id_throws[281]]).matcher(var2);
      Matcher var5 = ((Pattern)rrjE_2.id_class[id_throws[282]]).matcher(var2);
      Matcher var6 = ((Pattern)rrjE_2.id_class[id_throws[283]]).matcher(var2);
      if (var4.find()) {
         long var12 = Long.parseLong(var4.group(id_catch[89]));
         long var9 = Long.parseLong(var4.group(id_case[20]));
         return new rrNy_1(var1, var12, var9);
      } else if (var5.find()) {
         String var11 = var5.group(id_catch[90]);
         return new rrNp_1(var1, var11);
      } else if (var6.find()) {
         String var7 = var6.group(id_catch[91]);
         return new rrNq_1(var1, var7);
      } else if (Arrays.<String>stream((String[])rrjE_2.id_class[id_throws[284]]).anyMatch(var3::contains)) {
         return new rrNT(var1);
      } else if (Arrays.<String>stream((String[])rrjE_2.id_class[id_throws[285]]).anyMatch(var3::contains)) {
         return new rrNH(var1);
      } else {
         return Arrays.stream((String[])rrjE_2.id_class[id_throws[286]]).anyMatch(var3::contains) ? new rrNl_1(var1) : null;
      }
   }

   public boolean id_class(rrNV var1) {
      return !(var1 instanceof rrNC) && !(var1 instanceof rrNq_1) ? id_catch[84] : id_catch[83];
   }

   public void id_class(int var1) {
      this.k();
      Integer var6 = (Integer)this.id_byte[id_throws[307]] + var1;
      this.id_byte[id_throws[308]] = var6;
   }

   public void id_class(rrNv_1 var1, List<rrNd_1> var2, String var3, boolean var4) {
      this.k();
      Matcher var5 = ((Pattern)rrjE_2.id_class[id_throws[254]]).matcher(var3);
      if (var5.find()) {
         String var6 = var5.group(id_catch[66]);
         List var7 = this.id_class(var2, var6, var1.id_class());
         if (var7.isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[255]])
               .id_class(new rrtx_3(id_finally[13], "Не удалось найти \"" + var6 + "\"", id_throws[256]));
            this.id_class(id_catch[67]);
            return;
         }

         if (((List)this.id_byte[id_throws[257]]).isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[258]])
               .id_class(new rrtx_3(id_finally[14], "Не удалось найти \"" + var6 + "\"", id_throws[259]));
            this.id_class(var7.size());
            return;
         }

         ArrayList var8 = new ArrayList();

         for (rJY var10 : (List)this.id_byte[id_throws[260]]) {
            if (var10.id_break()) {
               rrNt_1 var11 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_throws[261]]).id_break(var10);
               if (var11 != null && var11.id_case() != id_case[13] && var11.id_catch() != null) {
                  var11.id_class(var10.id_class());
                  var11.id_class((List<rrNt_1>)this.id_byte[id_throws[262]]);
                  var11.id_break((List<rJY>)this.id_byte[id_throws[263]]);

                  for (rrNd_1 var13 : var7) {
                     if (var13.id_class(var11, var0 -> !(var0 instanceof rrcj_3) && !(var0 instanceof rrcE_2) ? id_catch[133] : id_catch[134])) {
                        var8.add(var11);
                        break;
                     }
                  }
               }
            }
         }

         if (var8.isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[264]])
               .id_class(new rrtx_3(id_finally[15], "Не удалось найти \"" + var6 + "\"", id_throws[265]));
            this.id_class(var7.size());
            return;
         }

         if (var4) {
            HashSet var14 = new HashSet(var7);

            for (rrNw_1 var19 : var8) {
               var14.removeIf(var1x -> var1x.id_class(var19, var0x -> !(var0x instanceof rrcj_3) && !(var0x instanceof rrcE_2) ? id_catch[131] : id_catch[132]));
            }

            if (!var14.isEmpty()) {
               for (rrNd_1 var20 : var14) {
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[266]])
                     .id_class(new rrtx_3(id_finally[16], "Не удалось найти \"" + var20.id_case() + "\"", id_throws[267]));
                  this.id_class(id_catch[68]);
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
                  if (!((List)this.id_byte[id_throws[377]]).contains(var5x)) {
                     ((List)this.id_byte[id_throws[378]]).add(var5x);
                  }
               } else {
                  var2x.id_break(var4x);
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[379]])
                     .id_class(
                        new rrtQ_2(
                           id_finally[58],
                           "Новая цена на \"" + var2x.id_case() + "\" - " + rql_3.id_class(var2x.id_else(), (char)id_case[48]) + "$",
                           id_throws[380]
                        )
                     );
                  this.id_class(id_catch[130]);
               }
            }
         );
         if (!var4 && !var18) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[268]])
               .id_class(new rrtx_3(id_finally[17], "Не удалось найти \"" + var6 + "\"", id_throws[269]));
            this.id_class(id_catch[70]);
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
               && ((List)this.id_byte[id_throws[279]]).stream().noneMatch(var1x -> var1x.id_break().equals(var4.id_byte()))) {
               var2 = id_catch[82];
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
                  return !var2x.id_protected(id_finally[52]) && !var2x.id_protected(id_finally[53]) ? id_catch[122] : id_catch[121];
               }

               if (var4.equals(id_finally[54])) {
                  return !var2x.id_protected(id_finally[55]) && !var2x.id_protected(id_finally[56]) ? id_catch[123] : id_catch[124];
               }
            } else if (var3x == rdy_3.kL) {
               return !var2x.id_protected(id_finally[57]) ? id_catch[125] : id_catch[126];
            }

            return id_catch[127];
         });
      }
   }

   @Override
   public List<LZ> id_class(Fu_1<?> var1, String var2, int var3, int var4, int var5) {
      this.k();
      ArrayList var6 = new ArrayList();
      if (this.id_break()) {
         rrNQ var12 = new rrNQ(
            this,
            var3 + var5 + id_case[31],
            var4,
            id_case[32],
            id_case[33],
            new rgn_3(id_finally[25]),
            var1x -> this.id_byte(!((Qw_1)id_import.id_class[id_throws[373]]).rB ? id_catch[119] : id_catch[120])
         );
         this.id_byte[id_throws[289]] = var12;
         var6.add((LZ)this.id_byte[id_throws[290]]);
      }

      rrNN var13;
      rrNN var10001 = var13 = new rrNN(
         this,
         var3 + var5 + id_case[34],
         var4,
         id_case[35],
         id_case[36],
         rgN_2.id_byte,
         var1x -> {
            try {
               this.id_byte();
            } catch (IllegalStateException var3x) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[371]])
                  .id_class(new rrtx_3(id_finally[48], var3x.getMessage(), id_throws[372]));
            }
         }
      );
      this.id_byte[id_throws[291]] = var13;
      var6.add(var10001);
      LF var14 = new LF(
         var3 + var5 + id_case[37],
         var4,
         id_case[38],
         id_case[39],
         new rgn_3(id_finally[26]),
         var2x -> {
            this.k();
            if (this.id_private()) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[365]])
                  .id_class(new rrtx_3(id_finally[46], id_finally[47], id_throws[366]));
            } else {
               if (this.id_throws(id_catch[117])) {
                  rrNv_1 var7x = new rrNv_1((List<rrNd_1>)this.id_byte[id_throws[367]], rqR_2.id_break(), id_catch[118]);
                  this.id_byte[id_throws[368]] = var7x;
                  this.id_throws();
                  this.id_class(
                     (rrNv_1)this.id_byte[id_throws[369]],
                     ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[370]]).id_protected(),
                     var2,
                     this.id_break()
                  );
               }
            }
         }
      );
      this.id_byte[id_throws[292]] = var14;
      if (this.id_protected(var2)) {
         var6.add((LF)this.id_byte[id_throws[293]]);
      }

      LZ var15 = new VF(id_finally[27], id_private[3], id_private[4], id_extends[0], var0 -> var0.rS, (var0, var1x) -> var0.rS = var1x, (var0, var1x) -> {
         String var10002 = id_finally[45];
         Object[] var10003 = new Object[id_catch[115]];
         var10003[id_catch[116]] = (int)var1x.id_class(var0);
         return new rgn_3(var10002, var10003);
      }).id_class((Qw_1)id_import.id_class[id_throws[294]], var3 + var5 + id_case[40], var4, id_case[41]).id_break(id_extends[1]);
      this.id_byte[id_throws[295]] = var15;
      var6.add((LZ)this.id_byte[id_throws[296]]);
      if ((rrfq_3)rrfp_3.id_class[id_throws[297]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[298]]) {
         LZ var7 = new VF(id_finally[28], id_private[5], id_private[6], id_extends[2], var0 -> var0.rr, (var0, var1x) -> var0.rr = var1x, (var0, var1x) -> {
            String var10002 = id_finally[44];
            Object[] var10003 = new Object[id_catch[113]];
            var10003[id_catch[114]] = (int)var1x.id_class(var0);
            return new rgn_3(var10002, var10003);
         }).id_class((Qw_1)id_import.id_class[id_throws[299]], var3 + var5 + id_case[42], var4, id_case[43]).id_break(id_extends[3]);
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
         this.id_byte = new Object[id_case[49]];
         Object[] var1 = this.id_byte;
         var1[id_case[50]] = id_catch[140];
         var1[id_case[51]] = id_catch[141];
         var1[id_case[52]] = id_catch[142];
         var1[id_case[53]] = Integer.valueOf(id_catch[143]);
         var1[id_case[54]] = Integer.valueOf(id_catch[144]);
         var1[id_case[55]] = id_catch[145];
         var1[id_case[56]] = id_catch[146];
         var1[id_case[57]] = Integer.valueOf(id_catch[147]);
         var1[id_case[58]] = id_implements[14];
         var1[id_case[59]] = id_implements[15];
         var1[id_case[60]] = id_implements[16];
         var1[id_case[61]] = id_catch[148];
      }
   }

   public boolean id_default() {
      this.k();
      return (Boolean)this.id_byte[id_throws[346]];
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
      return (Long)this.id_byte[id_throws[364]];
   }

   private void z() {
      this.k();
      if ((Long)this.id_byte[id_throws[26]] != id_implements[6] && System.currentTimeMillis() >= (Long)this.id_byte[id_throws[27]]) {
         Long var5 = id_implements[7];
         this.id_byte[id_throws[28]] = var5;
         if ((rrNV)this.id_byte[id_throws[29]] != null && !this.X()) {
            this.id_protected((rrNV)this.id_byte[id_throws[30]]);
         }
      }
   }

   public boolean id_void() {
      this.k();
      return (Boolean)this.id_byte[id_throws[343]];
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
      return (List<rrNZ>)this.id_byte[id_throws[349]];
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
      this.id_byte[id_throws[21]] = var7;
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
      if ((rrNV)this.id_byte[id_throws[39]] != null && !((List)this.id_byte[id_throws[40]]).isEmpty()) {
         if ((Integer)this.id_byte[id_throws[41]] >= ((List)this.id_byte[id_throws[42]]).size()) {
            this.W();
         }

         rXe_1 var3 = var1.G_();
         rqs_3 var4 = var3.id_extends();
         boolean var5 = this.id_class((rrNV)this.id_byte[id_throws[43]]);
         int var6 = ((rJr_1)((cb_3)id_import.id_class[id_throws[44]]).id_implements[id_throws[45]]).id_case;
         String var7 = null;
         Matcher var8 = ((Pattern)rrjE_2.id_class[id_throws[46]]).matcher(var2);
         if (var8.find()) {
            var7 = var8.group(id_catch[10]);
         }

         if (var5 && !((List)this.id_byte[id_throws[47]]).isEmpty() && var7 != null) {
            if (((rrfw_3)this.id_byte[id_throws[48]]).id_class(id_private[0])) {
               this.id_class(var1, var4, var6);
               ((rrfw_3)this.id_byte[id_throws[49]]).id_class();
            }
         } else {
            if (((rrfw_3)this.id_byte[id_throws[50]]).id_class((double)((Integer)this.id_byte[id_throws[51]]).intValue()) && !this.X()) {
               rrNd_1 var14 = (rrNd_1)((List)this.id_byte[id_throws[52]]).get((Integer)this.id_byte[id_throws[53]]);
               this.id_byte[id_throws[54]] = var14;
               String var9 = ((rrNd_1)this.id_byte[id_throws[55]]).id_abstract();
               if (!var9.isEmpty() && !(Boolean)this.id_byte[id_throws[56]]) {
                  Boolean var15 = id_catch[11];
                  this.id_byte[id_throws[57]] = var15;
                  ((Aq_1)((cb_3)id_import.id_class[id_throws[58]]).id_break[id_throws[59]]).id_break(new rmj_3(var6));
                  ((cb_3)id_import.id_class[id_throws[60]]).id_case("/ah search " + var9);
                  Boolean var16 = id_catch[12];
                  this.id_byte[id_throws[61]] = var16;
               }

               Integer var17 = this.E();
               this.id_byte[id_throws[62]] = var17;
               ((rrfw_3)this.id_byte[id_throws[63]]).id_class();
            }

            if ((rrNd_1)this.id_byte[id_throws[64]] != null
               && (Boolean)this.id_byte[id_throws[65]]
               && (rrNv_1)this.id_byte[id_throws[66]] != null
               && var7 != null) {
               this.id_class(
                  (rrNv_1)this.id_byte[id_throws[67]],
                  ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[68]]).id_protected(),
                  var2,
                  this.id_break()
               );
               Object var18 = null;
               this.id_byte[id_throws[69]] = var18;
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
            rrNv_1 var6 = new rrNv_1((List<rrNd_1>)this.id_byte[id_throws[237]], rqR_2.id_break(), id_catch[59]);
            this.id_byte[id_throws[238]] = var6;
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
            if (var7 > 0 && var7 % id_case[14] == 0) {
               ((Ax_1)id_import.id_class[id_throws[272]]).id_class(var5, var3.indexOf(var6), id_case[15], rXa_1.CLONE);
            }

            return id_catch[77];
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

            ((List)this.id_byte[id_throws[318]]).add(var7);
         }

         if (((List)this.id_byte[id_throws[319]]).isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[320]]).id_class(new rrtx_3(id_finally[30], id_finally[31], id_throws[321]));
            return id_catch[101];
         } else {
            return id_catch[102];
         }
      }
   }

   private void id_throws(rrNV var1) {
      if (var1 instanceof rrNq_1 var2) {
         ((cb_3)id_import.id_class[id_throws[300]]).id_case("/ah search " + var2.id_break());
      } else {
         ((cb_3)id_import.id_class[id_throws[301]]).id_case(id_finally[29]);
      }
   }

   private void id_throws(String var1) {
      this.k();
      if ((rrNd_1)this.id_byte[id_throws[200]] != null && (rrNF)this.id_byte[id_throws[201]] != null) {
         rrNd_1 var2 = ((rrNF)this.id_byte[id_throws[202]]).id_break();
         if (var2.equals((rrNd_1)this.id_byte[id_throws[203]])) {
            boolean var3 = id_catch[47];
            if (var1.contains(id_finally[10])) {
               ((rrNF)this.id_byte[id_throws[204]]).id_class((rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[id_throws[205]]);
               var3 = id_catch[48];
            } else if (var1.contains(id_finally[11])) {
               ((rrNF)this.id_byte[id_throws[206]]).id_class((rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[id_throws[207]]);
               var3 = id_catch[49];
            }

            if (var3) {
               Object var8 = null;
               this.id_byte[id_throws[208]] = var8;
               Object var9 = null;
               this.id_byte[id_throws[209]] = var9;
            }
         }
      }
   }

   @Override
   public void id_throws() {
      this.k();
      super.id_throws();
      rrNV var5 = (rrNV)this.id_byte[id_throws[239]];
      this.id_byte[id_throws[240]] = var5;
      Integer var6 = this.E();
      this.id_byte[id_throws[241]] = var6;
      Integer var7 = Integer.valueOf(id_catch[60]);
      this.id_byte[id_throws[242]] = var7;
   }

   private String L() {
      this.k();
      long var1 = Math.max(id_implements[0], System.currentTimeMillis() - (Long)this.id_byte[id_throws[19]]);
      return rql_3.id_class(Duration.ofMillis(var1));
   }

   public List<rrNd_1> M() {
      this.k();
      return (List<rrNd_1>)this.id_byte[id_throws[347]];
   }

   private void W() {
      this.k();
      rrNv_1 var1 = (rrNv_1)this.id_byte[id_throws[326]];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[327]]).id_class(new rrtQ_2(id_finally[32], id_finally[33], id_throws[328]));
      MinecraftAccessor.a_(id_finally[34], id_catch[107]);
      if (var1 != null) {
         List var2 = var1.id_byte();
         long var3 = var1.id_break();
         long var5 = rqR_2.id_break() - var3;
         int var7 = var2.size();
         rVi_1 var10000 = new rgN_2(id_finally[35]).id_class(rgF_2.GRAY).id_break(id_finally[36]);
         long var10004 = (long)var7;
         String[] var10005 = new String[id_case[44]];
         var10005[id_catch[108]] = id_finally[37];
         var10005[id_catch[109]] = id_finally[38];
         var10005[id_case[45]] = id_finally[39];
         var10005[id_case[46]] = id_finally[40];
         var10000 = var10000.id_class(new rgN_2(var7 + " " + rql_3.id_class(var10004, var10005)).id_class(rgF_2.RED)).id_break(id_finally[41]);
         String var10003 = id_finally[42];
         Object[] var10 = new Object[id_case[47]];
         var10[id_catch[110]] = (double)var5 / id_private[7];
         var10[id_catch[111]] = id_finally[43];
         rVi_1 var8 = var10000.id_class(new rgN_2(String.format(var10003, var10)).id_class(rgF_2.RED));
         rrfu_3.id_class(var8);
      }

      this.id_break(id_catch[112]);
   }

   public LF P() {
      this.k();
      return (LF)this.id_byte[id_throws[330]];
   }

   @Override
   public void id_catch() {
      this.k();
      super.id_catch();
      if (!((List)this.id_byte[id_throws[38]]).isEmpty()) {
         this.id_extends();
      }
   }

   public rrfw_3 G() {
      this.k();
      return (rrfw_3)this.id_byte[id_throws[350]];
   }

   @Override
   public void id_extends() {
      this.k();
      super.id_extends();
      ((List)this.id_byte[id_throws[243]]).clear();
      ((List)this.id_byte[id_throws[244]]).clear();
      ((List)this.id_byte[id_throws[245]]).clear();
      ((rrfw_3)this.id_byte[id_throws[246]]).id_class();
      Object var5 = null;
      this.id_byte[id_throws[247]] = var5;
      Object var6 = null;
      this.id_byte[id_throws[248]] = var6;
      Integer var7 = Integer.valueOf(id_catch[61]);
      this.id_byte[id_throws[249]] = var7;
      Boolean var8 = id_catch[62];
      this.id_byte[id_throws[250]] = var8;
      Boolean var9 = id_catch[63];
      this.id_byte[id_throws[251]] = var9;
   }

   public boolean id_goto() {
      this.k();
      return (Boolean)this.id_byte[id_throws[344]];
   }

   @Override
   public boolean id_case() {
      this.k();
      return super.id_case() && (rrNV)this.id_byte[id_throws[223]] != null ? id_catch[54] : id_catch[55];
   }

   public rrNd_1 id_const() {
      this.k();
      return (rrNd_1)this.id_byte[id_throws[338]];
   }

   public void id_continue() {
      this.k();
      Long var5 = id_implements[5];
      this.id_byte[id_throws[25]] = var5;
   }

   public rrfw_3 id_else() {
      this.k();
      return (rrfw_3)this.id_byte[id_throws[357]];
   }

   public int id_for() {
      this.k();
      return (Integer)this.id_byte[id_throws[360]];
   }

   public boolean id_import() {
      return ((Qw_1)id_import.id_class[id_throws[311]]).rB && this.id_break() ? id_catch[99] : id_catch[100];
   }

   public long id_instanceof() {
      this.k();
      return (Long)this.id_byte[id_throws[361]];
   }

   public rrNu_1 id_new() {
      this.k();
      return (rrNu_1)this.id_byte[id_throws[358]];
   }

   public LF id_package() {
      this.k();
      return (LF)this.id_byte[id_throws[331]];
   }

   public rrNd_1 id_return() {
      this.k();
      return (rrNd_1)this.id_byte[id_throws[352]];
   }

   public LF id_super() {
      this.k();
      return (LF)this.id_byte[id_throws[329]];
   }

   public rrNV id_switch() {
      this.k();
      return (rrNV)this.id_byte[id_throws[341]];
   }

   public boolean id_throw() {
      this.k();
      return (Boolean)this.id_byte[id_throws[356]];
   }

   public int id_try() {
      this.k();
      return (Integer)this.id_byte[id_throws[354]];
   }

   public boolean id_while() {
      this.k();
      return (Boolean)this.id_byte[id_throws[355]];
   }

   public List<rrNZ> id_static() {
      this.k();
      return (List<rrNZ>)this.id_byte[id_throws[348]];
   }

   public boolean id_public() {
      return C_throws.id_byte().id_for().id_class() >= id_implements[12] ? id_catch[97] : id_catch[98];
   }

   public void id_protected(boolean var1) {
      this.k();
      Boolean var6 = var1;
      this.id_byte[id_throws[310]] = var6;
   }

   @Override
   public void id_protected() {
      this.k();
      super.id_protected();
      Long var5 = System.currentTimeMillis();
      this.id_byte[id_throws[224]] = var5;
   }

   public boolean id_protected(String var1) {
      Matcher var2 = ((Pattern)rrjE_2.id_class[id_throws[270]]).matcher(var1);
      if (!var2.find()) {
         return id_catch[74];
      } else {
         String var3 = var2.group(id_catch[71]);

         for (rrNd_1 var5 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[271]]).id_protected()) {
            for (String var8 : var5.id_private()) {
               if (var8.toLowerCase().startsWith(var3.toLowerCase())) {
                  return id_catch[72];
               }
            }
         }

         return id_catch[73];
      }
   }

   private void id_protected(rrNV var1) {
      ((Aq_1)((cb_3)id_import.id_class[id_throws[302]]).id_break[id_throws[303]])
         .id_break(new rmj_3(((rJr_1)((cb_3)id_import.id_class[id_throws[304]]).id_implements[id_throws[305]]).id_case));
      this.id_throws(var1);
   }

   public rrfw_3 id_abstract() {
      this.k();
      return (rrfw_3)this.id_byte[id_throws[345]];
   }

   public rrNV id_final() {
      this.k();
      return (rrNV)this.id_byte[id_throws[342]];
   }

   public long id_transient() {
      this.k();
      return (Long)this.id_byte[id_throws[363]];
   }

   public List<rrNt_1> id_synchronized() {
      this.k();
      return (List<rrNt_1>)this.id_byte[id_throws[334]];
   }

   public rrNv_1 id_strictfp() {
      this.k();
      return (rrNv_1)this.id_byte[id_throws[351]];
   }

   public int E() {
      return id_throws[309];
   }

   private static void A() {
      Object[] var0 = new Object[]{new Random(), 0};
      id_protected = var0;
   }

   private boolean X() {
      PF var1 = C_throws.id_byte().id_try();
      return var1.id_class(id_catch[95]);
   }

   private boolean Q() {
      this.k();
      rrNV var1 = (rrNV)this.id_byte[id_throws[322]];
      if (var1 instanceof rrNq_1 var2) {
         Matcher var3 = ((Pattern)rrjE_2.id_class[id_throws[323]]).matcher(var2.id_class().id_byte());
         if (var3.find()) {
            String var4 = var3.group(id_catch[103]);
            List var5 = this.id_class(((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[324]]).id_protected(), var4, id_catch[104]);
            ((List)this.id_byte[id_throws[325]]).addAll(var5);
            return id_catch[105];
         }
      }

      return id_catch[106];
   }
}
