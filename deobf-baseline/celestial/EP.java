package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EP extends C_try {
   private static byte[] id_throws;
   private static short[] id_case;
   public Object[] id_break;
   private static String[] id_catch;
   private static boolean[] id_private;

   public EP(C_case var1) {
      String[] var10002 = new String[id_throws[0]];
      var10002[id_private[0]] = id_catch[0];
      var10002[id_private[1]] = id_catch[1];
      var10002[id_throws[1]] = id_catch[2];
      super(var1, var10002);
      this.id_native();
      ro_3 var6 = ((C_case)this.id_class[id_case[0]]).id_double();
      this.id_break[id_case[1]] = var6;
      Object var7 = null;
      this.id_break[id_case[2]] = var7;
      Object var8 = null;
      this.id_break[id_case[3]] = var8;
      Object var9 = null;
      this.id_break[id_case[4]] = var9;
      var1.s().id_class(new EB(this));
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8065351879905741349L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      this.id_native();
      Es_1 var3 = Es_1.id_break(var2.id_extends());
      if (var3 == null) {
         throw new W(var2.id_private(), id_catch[3]);
      } else {
         if (var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[5]]
            && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[6]]) {
            if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[16]]) {
               var2.id_class(id_private[3]);
               Object var26 = null;
               this.id_break[id_case[17]] = var26;
               String var10001 = id_catch[7];
               Object[] var10002 = new Object[id_private[4]];
               var10002[id_private[5]] = ((ro_3)this.id_break[id_case[18]]).id_throws().length;
               this.id_case(String.format(var10001, var10002));
            } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[19]]) {
               var2.id_class(id_private[6]);
               if ((rU_2)this.id_break[id_case[20]] != null) {
                  Object var27 = null;
                  this.id_break[id_case[21]] = var27;
                  this.id_case(id_catch[8]);
               } else {
                  rY_2[] var31 = ((ro_3)this.id_break[id_case[22]]).id_byte();
                  if (var31.length < id_private[7]) {
                     throw new k_1(id_catch[9]);
                  }

                  rU_2 var28 = ((ro_3)this.id_break[id_case[23]]).id_class(var31[var31.length - id_private[8]]).id_byte();
                  this.id_break[id_case[24]] = var28;
                  this.id_case(id_catch[10]);
               }
            } else if (var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[25]]
               && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[26]]
               && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[27]]
               && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[28]]
               && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[29]]) {
               if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[52]]) {
                  rU_2 var33 = b_.id_catch() != null ? rU_2.id_class(b_.id_catch().Bs()) : ((Ps_1)this.id_class[id_case[53]]).id_volatile();
                  rU_2 var37 = var2.id_final() ? var2.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_case[54]], var33) : var33;
                  var2.id_class(id_private[18]);
                  rY_2[] var41 = ((ro_3)this.id_break[id_case[55]]).id_byte();
                  if (var41.length < id_private[19]) {
                     throw new k_1(id_catch[14]);
                  }

                  bw_3 var43 = new bw_3((Ps_1)this.id_class[id_case[56]]);
                  rU_2 var46 = var41[id_private[20]].id_class();
                  rH_2 var49 = new rH_2(id_private[21], id_private[22], id_private[23]);
                  rY_2[] var52 = var41;
                  int var56 = var41.length;

                  for (int var60 = id_private[24]; var60 < var56; var60++) {
                     rY_2 var63 = var52[var60];
                     rU_2 var65 = var63.id_class();
                     var46 = new rU_2(
                        Math.min((Integer)var46.id_break[id_case[57]], (Integer)var65.id_break[id_case[58]]),
                        Math.min((Integer)var46.id_break[id_case[59]], (Integer)var65.id_break[id_case[60]]),
                        Math.min((Integer)var46.id_break[id_case[61]], (Integer)var65.id_break[id_case[62]])
                     );
                  }

                  var52 = var41;
                  var56 = var41.length;

                  for (int var61 = id_private[25]; var61 < var56; var61++) {
                     rY_2 var64 = var52[var61];
                     rja_3 var66 = var64.id_throws();
                     rU_2 var67 = var64.id_class();
                     xc_3[][][] var16 = new xc_3[var66.b_()][var66.d_()][var66.c_()];

                     for (int var17 = id_private[26]; var17 < var66.b_(); var17++) {
                        for (int var18 = id_private[27]; var18 < var66.c_(); var18++) {
                           for (int var19 = id_private[28]; var19 < var66.d_(); var19++) {
                              var16[var17][var19][var18] = var43.id_class(
                                 (Integer)var67.id_break[id_case[63]] + var17,
                                 (Integer)var67.id_break[id_case[64]] + var18,
                                 (Integer)var67.id_break[id_case[65]] + var19
                              );
                           }
                        }
                     }

                     ES var68 = new ES(this, var16, var66);
                     var49.id_class(
                        var68,
                        (Integer)var67.id_break[id_case[66]] - (Integer)var46.id_break[id_case[67]],
                        (Integer)var67.id_break[id_case[68]] - (Integer)var46.id_break[id_case[69]],
                        (Integer)var67.id_break[id_case[70]] - (Integer)var46.id_break[id_case[71]]
                     );
                  }

                  this.id_break[id_case[72]] = var49;
                  rfH_2 var30 = var46.id_byte(var37);
                  this.id_break[id_case[73]] = var30;
                  this.id_case(id_catch[15]);
               } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[74]]) {
                  rU_2 var34 = b_.id_catch() != null ? rU_2.id_class(b_.id_catch().Bs()) : ((Ps_1)this.id_class[id_case[75]]).id_volatile();
                  rU_2 var38 = var2.id_final() ? var2.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_case[76]], var34) : var34;
                  var2.id_class(id_private[29]);
                  if ((rq_3)this.id_break[id_case[77]] == null) {
                     throw new k_1(id_catch[16]);
                  }

                  ((C_case)this.id_class[id_case[78]])
                     .r()
                     .id_class(id_catch[17], (rq_3)this.id_break[id_case[79]], var38.id_break((rja_3)this.id_break[id_case[80]]));
                  this.id_case(id_catch[18]);
               } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[81]]
                  || var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[82]]
                  || var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[83]]) {
                  var2.id_protected(id_throws[3]);
                  EE var35 = EE.id_class(var2.id_extends());
                  if (var35 == null) {
                     throw new k_1(id_catch[19]);
                  }

                  rpr_3 var39 = var2.id_break((C_strictfp)C_strictfp.staticFields1f0c66f23770348389d783dc475286cf[id_case[84]]);
                  int var42 = var2.id_catch(Integer.class);
                  rY_2[] var44 = ((ro_3)this.id_break[id_case[85]]).id_byte();
                  if (var44.length < id_private[30]) {
                     throw new k_1(id_catch[20]);
                  }

                  var44 = var35.id_class(var44);
                  rY_2[] var47 = var44;
                  int var50 = var44.length;

                  for (int var54 = id_private[31]; var54 < var50; var54++) {
                     rY_2 var58 = var47[var54];
                     if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[86]]) {
                        ((ro_3)this.id_break[id_case[87]]).id_class(var58, var39, var42);
                     } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[88]]) {
                        ((ro_3)this.id_break[id_case[89]]).id_break(var58, var39, var42);
                     } else {
                        ((ro_3)this.id_break[id_case[90]]).id_byte(var58, var39, var42);
                     }
                  }

                  String var69 = id_catch[21];
                  Object[] var70 = new Object[id_private[32]];
                  var70[id_private[33]] = var44.length;
                  this.id_case(String.format(var69, var70));
               }
            } else {
               re_3 var32 = var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[30]]
                  ? new re_3(xu_3.id_class)
                  : var2.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_case[31]]);
               ra_3 var36 = null;
               if (var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[32]]) {
                  var2.id_class(id_private[11]);
               } else {
                  var2.id_private(id_private[9]);
                  ArrayList var6 = new ArrayList();
                  var6.add(var32);

                  while (var2.id_break(id_throws[2])) {
                     var6.add((re_3)var2.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_case[33]]));
                  }

                  var32 = var2.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_case[34]]);
                  var36 = new ra_3(var6.toArray(new re_3[id_private[10]]));
               }

               rY_2[] var40 = ((ro_3)this.id_break[id_case[35]]).id_byte();
               if (var40.length == 0) {
                  throw new k_1(id_catch[11]);
               }

               rU_2 var7 = var40[id_private[12]].id_class();
               rH_2 var8 = new rH_2(id_private[13], id_private[14], id_private[15]);
               rY_2[] var9 = var40;
               int var10 = var40.length;

               for (int var11 = id_private[16]; var11 < var10; var11++) {
                  rY_2 var12 = var9[var11];
                  rU_2 var13 = var12.id_class();
                  var7 = new rU_2(
                     Math.min((Integer)var7.id_break[id_case[36]], (Integer)var13.id_break[id_case[37]]),
                     Math.min((Integer)var7.id_break[id_case[38]], (Integer)var13.id_break[id_case[39]]),
                     Math.min((Integer)var7.id_break[id_case[40]], (Integer)var13.id_break[id_case[41]])
                  );
               }

               var9 = var40;
               var10 = var40.length;

               for (int var55 = id_private[17]; var55 < var10; var55++) {
                  rY_2 var59 = var9[var55];
                  rja_3 var62 = var59.id_throws();
                  rU_2 var14 = var59.id_class();
                  Object var15 = new rp_3(var62.b_(), var62.c_(), var62.d_(), var32);
                  if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[42]]) {
                     var15 = new rg_3((rq_3)var15);
                  } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[43]]) {
                     var15 = new rj_3((rq_3)var15);
                  } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[44]]) {
                     var15 = new rf_3((rq_3)var15, var36);
                  }

                  var8.id_class(
                     (rq_3)var15,
                     (Integer)var14.id_break[id_case[45]] - (Integer)var7.id_break[id_case[46]],
                     (Integer)var14.id_break[id_case[47]] - (Integer)var7.id_break[id_case[48]],
                     (Integer)var14.id_break[id_case[49]] - (Integer)var7.id_break[id_case[50]]
                  );
               }

               ((C_case)this.id_class[id_case[51]]).r().id_class(id_catch[12], var8, var7);
               this.id_case(id_catch[13]);
            }
         } else {
            if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[7]] && (rU_2)this.id_break[id_case[8]] == null) {
               throw new k_1(id_catch[4]);
            }

            rU_2 var4 = b_.id_catch() != null ? rU_2.id_class(b_.id_catch().Bs()) : ((Ps_1)this.id_class[id_case[9]]).id_volatile();
            rU_2 var5 = var2.id_final() ? var2.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_case[10]], var4) : var4;
            var2.id_class(id_private[2]);
            if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[11]]) {
               this.id_break[id_case[12]] = var5;
               this.id_case(id_catch[5]);
            } else {
               ((ro_3)this.id_break[id_case[13]]).id_class((rU_2)this.id_break[id_case[14]], var5);
               Object var25 = null;
               this.id_break[id_case[15]] = var25;
               this.id_case(id_catch[6]);
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 986393416;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         return new v_1().id_break(Es_1.id_class()).id_class(var2.id_extends()).id_break().id_protected();
      } else {
         Es_1 var3 = Es_1.id_break(var2.id_extends());
         if (var3 != null) {
            if (var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[91]]
               && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[92]]) {
               if (var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[94]]
                  && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[95]]
                  && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[96]]
                  && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[97]]) {
                  if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[100]]
                     || var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[101]]
                     || var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[102]]) {
                     if (var2.id_case()) {
                        return new v_1().id_break(EE.id_class()).id_class(var2.id_extends()).id_break().id_protected();
                     }

                     EE var4 = EE.id_class(var2.id_extends());
                     if (var4 != null && var2.id_case()) {
                        return var2.id_class((C_strictfp)C_strictfp.staticFields1f0c66f23770348389d783dc475286cf[id_case[103]]);
                     }
                  }
               } else if (var2.id_case() || var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[98]]) {
                  while (var2.id_break(id_throws[5])) {
                     var2.id_throws();
                  }

                  return var2.id_class((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_case[99]]);
               }
            } else if (var2.id_catch(id_throws[4])) {
               return var2.id_class((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_case[93]]);
            }
         }

         return Stream.empty();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, -120, 87, -120, 53, 6, -36, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_private = new boolean[]{
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
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
         false,
         true,
         false,
         false,
         true,
         true
      };
   }

   private static void id_finally() {
      id_throws = new byte[]{3, 2, 2, 3, 3, 2, 25, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 4};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[id_throws[6]];
      var10000[id_private[34]] = id_catch[23];
      var10000[id_private[35]] = id_catch[24];
      var10000[id_throws[7]] = id_catch[25];
      var10000[id_throws[8]] = id_catch[26];
      var10000[id_throws[9]] = id_catch[27];
      var10000[id_throws[10]] = id_catch[28];
      var10000[id_throws[11]] = id_catch[29];
      var10000[id_throws[12]] = id_catch[30];
      var10000[id_throws[13]] = id_catch[31];
      var10000[id_throws[14]] = id_catch[32];
      var10000[id_throws[15]] = id_catch[33];
      var10000[id_throws[16]] = id_catch[34];
      var10000[id_throws[17]] = id_catch[35];
      var10000[id_throws[18]] = id_catch[36];
      var10000[id_throws[19]] = id_catch[37];
      var10000[id_throws[20]] = id_catch[38];
      var10000[id_throws[21]] = id_catch[39];
      var10000[id_throws[22]] = id_catch[40];
      var10000[id_throws[23]] = id_catch[41];
      var10000[id_throws[24]] = id_catch[42];
      var10000[id_throws[25]] = id_catch[43];
      var10000[id_throws[26]] = id_catch[44];
      var10000[id_throws[27]] = id_catch[45];
      var10000[id_throws[28]] = id_catch[46];
      var10000[id_throws[29]] = id_catch[47];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_catch = new String[]{
         new String("sel"),
         new String("selection"),
         new String("s"),
         new String("действие"),
         new String("Сначала установите pos1, прежде чем использовать pos2"),
         new String("Первая позиция была установлена, теперь установите вторую"),
         new String("Выделение добавлено"),
         new String("Удалено %d выделений"),
         new String("Отменяем первую позицию"),
         new String("Нечего отменять!"),
         new String("Отменяем вторую позицию"),
         new String("Нет выделений!"),
         new String("Fill"),
         new String("Процесс запущен!"),
         new String("Нет выделений!"),
         new String("Selection copied"),
         new String("Сначала необходимо скопировать выделение"),
         new String("Fill"),
         new String("Building now"),
         new String("Недопустимый тип преобразования"),
         new String("Не найдено выделений!"),
         new String("Преобразованные %d выделений"),
         new String("Команда подобная WorldEdit"),
         new String("Команда \"sel\" позволяет вам управлять выделениями Baritone, аналогично WorldEdit."),
         new String(""),
         new String("С помощью этих выделений вы можете очищать области, заполнять их блоками или что-то еще."),
         new String(""),
         new String(
            "Команды expand/contract/shift используют своего рода селектор, чтобы выбрать, на какие выделения ориентироваться. Поддерживаются a/all, n/newest и o/oldest."
         ),
         new String(""),
         new String("Usage:"),
         new String("> sel pos1/p1/1 - Установите первую позицию к вашему текущему положению."),
         new String("> sel pos1/p1/1 <x> <y> <z> - Установите первую позицию в любые координаты."),
         new String("> sel pos2/p2/2 - Установите вторую позицию к вашему текущему положению."),
         new String("> sel pos2/p2/2 <x> <y> <z> - Установите вторую позицию в любые координаты."),
         new String(""),
         new String("> sel clear/c - Очистить все выделения."),
         new String("> sel undo/u - Отмена последнего действия (установка позиций, создание выделений и т.д.)"),
         new String("> sel set/fill/s/f [block] - Полностью заполните все выделения блоком."),
         new String("> sel walls/w [block] - Заполнить стены выделения указанным блоком."),
         new String("> sel shell/shl [block] - То же, что и стены, но заполняет также потолок и пол."),
         new String("> sel cleararea/ca - Полностью очищает территорию от блоков."),
         new String("> sel replace/r <blocks...> <with> - Заменяет блоки другим блоком."),
         new String("> sel copy/cp <x> <y> <z> - Копирование выделенной области относительно указанной или вашей позиции."),
         new String("> sel paste/p <x> <y> <z> - Постройте скопированную область относительно указанной или вашей позиции."),
         new String(""),
         new String("> sel expand <target> <direction> <blocks> - Расширить выделение."),
         new String("> sel contract <target> <direction> <blocks> - Соеденить выделения."),
         new String("> sel shift <target> <direction> <blocks> - Сдвинуть выделение.")
      };
   }

   @Override
   public boolean id_case() {
      return id_private[36];
   }

   @Override
   public String id_implements() {
      return id_catch[22];
   }

   private static void id_protected() {
      id_case = new short[]{
         0,
         0,
         1,
         2,
         3,
         0,
         1,
         1,
         1,
         1,
         0,
         0,
         1,
         0,
         1,
         1,
         2,
         1,
         0,
         3,
         1,
         1,
         0,
         0,
         1,
         4,
         5,
         6,
         7,
         8,
         7,
         0,
         8,
         0,
         0,
         0,
         0,
         0,
         1,
         1,
         2,
         2,
         5,
         6,
         8,
         0,
         0,
         1,
         1,
         2,
         2,
         0,
         10,
         1,
         0,
         0,
         1,
         0,
         0,
         1,
         1,
         2,
         2,
         0,
         1,
         2,
         0,
         0,
         1,
         1,
         2,
         2,
         2,
         3,
         11,
         1,
         0,
         2,
         0,
         2,
         3,
         9,
         12,
         13,
         0,
         0,
         9,
         0,
         12,
         0,
         0,
         0,
         1,
         0,
         4,
         5,
         7,
         8,
         8,
         0,
         9,
         12,
         13,
         0
      };
   }

   private void id_native() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[30]];
         Object[] var1 = this.id_break;
      }
   }
}
