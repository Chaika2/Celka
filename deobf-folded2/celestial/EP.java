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
      super(var1, "sel", "selection", "s");
      this.id_native();
      ro_3 var6 = ((C_case)this.id_class[0]).id_double();
      this.id_break[0] = var6;
      Object var7 = null;
      this.id_break[1] = var7;
      Object var8 = null;
      this.id_break[2] = var8;
      Object var9 = null;
      this.id_break[3] = var9;
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
         throw new W(var2.id_private(), "действие");
      } else {
         if (var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[0] && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[1]) {
            if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[2]) {
               var2.id_class(0);
               Object var26 = null;
               this.id_break[1] = var26;
               this.id_case(String.format("Удалено %d выделений", ((ro_3)this.id_break[0]).id_throws().length));
            } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[3]) {
               var2.id_class(0);
               if ((rU_2)this.id_break[1] != null) {
                  Object var27 = null;
                  this.id_break[1] = var27;
                  this.id_case("Отменяем первую позицию");
               } else {
                  rY_2[] var31 = ((ro_3)this.id_break[0]).id_byte();
                  if (var31.length < 1) {
                     throw new k_1("Нечего отменять!");
                  }

                  rU_2 var28 = ((ro_3)this.id_break[0]).id_class(var31[var31.length - 1]).id_byte();
                  this.id_break[1] = var28;
                  this.id_case("Отменяем вторую позицию");
               }
            } else if (var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[4]
               && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[5]
               && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[6]
               && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[7]
               && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[8]) {
               if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[10]) {
                  rU_2 var33 = b_.id_catch() != null ? rU_2.id_class(b_.id_catch().Bs()) : ((Ps_1)this.id_class[1]).id_volatile();
                  rU_2 var37 = var2.id_final() ? var2.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[0], var33) : var33;
                  var2.id_class(0);
                  rY_2[] var41 = ((ro_3)this.id_break[0]).id_byte();
                  if (var41.length < 1) {
                     throw new k_1("Нет выделений!");
                  }

                  bw_3 var43 = new bw_3((Ps_1)this.id_class[1]);
                  rU_2 var46 = var41[0].id_class();
                  rH_2 var49 = new rH_2(0, 0, 0);

                  for (rY_2 var63 : var41) {
                     rU_2 var65 = var63.id_class();
                     var46 = new rU_2(
                        Math.min((Integer)var46.id_break[0], (Integer)var65.id_break[0]),
                        Math.min((Integer)var46.id_break[1], (Integer)var65.id_break[1]),
                        Math.min((Integer)var46.id_break[2], (Integer)var65.id_break[2])
                     );
                  }

                  for (rY_2 var64 : var41) {
                     rja_3 var66 = var64.id_throws();
                     rU_2 var67 = var64.id_class();
                     xc_3[][][] var16 = new xc_3[var66.b_()][var66.d_()][var66.c_()];

                     for (int var17 = 0; var17 < var66.b_(); var17++) {
                        for (int var18 = 0; var18 < var66.c_(); var18++) {
                           for (int var19 = 0; var19 < var66.d_(); var19++) {
                              var16[var17][var19][var18] = var43.id_class(
                                 (Integer)var67.id_break[0] + var17, (Integer)var67.id_break[1] + var18, (Integer)var67.id_break[2] + var19
                              );
                           }
                        }
                     }

                     ES var68 = new ES(this, var16, var66);
                     var49.id_class(
                        var68,
                        (Integer)var67.id_break[0] - (Integer)var46.id_break[0],
                        (Integer)var67.id_break[1] - (Integer)var46.id_break[1],
                        (Integer)var67.id_break[2] - (Integer)var46.id_break[2]
                     );
                  }

                  this.id_break[2] = var49;
                  rfH_2 var30 = var46.id_byte(var37);
                  this.id_break[3] = var30;
                  this.id_case("Selection copied");
               } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[11]) {
                  rU_2 var34 = b_.id_catch() != null ? rU_2.id_class(b_.id_catch().Bs()) : ((Ps_1)this.id_class[1]).id_volatile();
                  rU_2 var38 = var2.id_final() ? var2.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[0], var34) : var34;
                  var2.id_class(0);
                  if ((rq_3)this.id_break[2] == null) {
                     throw new k_1("Сначала необходимо скопировать выделение");
                  }

                  ((C_case)this.id_class[0]).r().id_class("Fill", (rq_3)this.id_break[2], var38.id_break((rja_3)this.id_break[3]));
                  this.id_case("Building now");
               } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[9]
                  || var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[12]
                  || var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[13]) {
                  var2.id_protected(3);
                  EE var35 = EE.id_class(var2.id_extends());
                  if (var35 == null) {
                     throw new k_1("Недопустимый тип преобразования");
                  }

                  rpr_3 var39 = var2.id_break((C_strictfp)C_strictfp.staticFields1f0c66f23770348389d783dc475286cf[0]);
                  int var42 = var2.id_catch(Integer.class);
                  rY_2[] var44 = ((ro_3)this.id_break[0]).id_byte();
                  if (var44.length < 1) {
                     throw new k_1("Не найдено выделений!");
                  }

                  var44 = var35.id_class(var44);

                  for (rY_2 var58 : var44) {
                     if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[9]) {
                        ((ro_3)this.id_break[0]).id_class(var58, var39, var42);
                     } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[12]) {
                        ((ro_3)this.id_break[0]).id_break(var58, var39, var42);
                     } else {
                        ((ro_3)this.id_break[0]).id_byte(var58, var39, var42);
                     }
                  }

                  this.id_case(String.format("Преобразованные %d выделений", var44.length));
               }
            } else {
               re_3 var32 = var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[7]
                  ? new re_3(xu_3.id_class)
                  : var2.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[0]);
               ra_3 var36 = null;
               if (var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[8]) {
                  var2.id_class(0);
               } else {
                  var2.id_private(1);
                  ArrayList var6 = new ArrayList();
                  var6.add(var32);

                  while (var2.id_break(2)) {
                     var6.add((re_3)var2.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[0]));
                  }

                  var32 = var2.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[0]);
                  var36 = new ra_3(var6.toArray(new re_3[0]));
               }

               rY_2[] var40 = ((ro_3)this.id_break[0]).id_byte();
               if (var40.length == 0) {
                  throw new k_1("Нет выделений!");
               }

               rU_2 var7 = var40[0].id_class();
               rH_2 var8 = new rH_2(0, 0, 0);

               for (rY_2 var12 : var40) {
                  rU_2 var13 = var12.id_class();
                  var7 = new rU_2(
                     Math.min((Integer)var7.id_break[0], (Integer)var13.id_break[0]),
                     Math.min((Integer)var7.id_break[1], (Integer)var13.id_break[1]),
                     Math.min((Integer)var7.id_break[2], (Integer)var13.id_break[2])
                  );
               }

               for (rY_2 var59 : var40) {
                  rja_3 var62 = var59.id_throws();
                  rU_2 var14 = var59.id_class();
                  Object var15 = new rp_3(var62.b_(), var62.c_(), var62.d_(), var32);
                  if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[5]) {
                     var15 = new rg_3((rq_3)var15);
                  } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[6]) {
                     var15 = new rj_3((rq_3)var15);
                  } else if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[8]) {
                     var15 = new rf_3((rq_3)var15, var36);
                  }

                  var8.id_class(
                     (rq_3)var15,
                     (Integer)var14.id_break[0] - (Integer)var7.id_break[0],
                     (Integer)var14.id_break[1] - (Integer)var7.id_break[1],
                     (Integer)var14.id_break[2] - (Integer)var7.id_break[2]
                  );
               }

               ((C_case)this.id_class[0]).r().id_class("Fill", var8, var7);
               this.id_case("Процесс запущен!");
            }
         } else {
            if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[1] && (rU_2)this.id_break[1] == null) {
               throw new k_1("Сначала установите pos1, прежде чем использовать pos2");
            }

            rU_2 var4 = b_.id_catch() != null ? rU_2.id_class(b_.id_catch().Bs()) : ((Ps_1)this.id_class[1]).id_volatile();
            rU_2 var5 = var2.id_final() ? var2.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[0], var4) : var4;
            var2.id_class(0);
            if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[0]) {
               this.id_break[1] = var5;
               this.id_case("Первая позиция была установлена, теперь установите вторую");
            } else {
               ((ro_3)this.id_break[0]).id_class((rU_2)this.id_break[1], var5);
               Object var25 = null;
               this.id_break[1] = var25;
               this.id_case("Выделение добавлено");
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
            if (var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[0] && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[1]) {
               if (var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[4]
                  && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[5]
                  && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[7]
                  && var3 != (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[8]) {
                  if (var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[9]
                     || var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[12]
                     || var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[13]) {
                     if (var2.id_case()) {
                        return new v_1().id_break(EE.id_class()).id_class(var2.id_extends()).id_break().id_protected();
                     }

                     EE var4 = EE.id_class(var2.id_extends());
                     if (var4 != null && var2.id_case()) {
                        return var2.id_class((C_strictfp)C_strictfp.staticFields1f0c66f23770348389d783dc475286cf[0]);
                     }
                  }
               } else if (var2.id_case() || var3 == (Es_1)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[8]) {
                  while (var2.id_break(2)) {
                     var2.id_throws();
                  }

                  return var2.id_class((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[0]);
               }
            } else if (var2.id_catch(3)) {
               return var2.id_class((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[0]);
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
      return Arrays.asList(
         "Команда \"sel\" позволяет вам управлять выделениями Baritone, аналогично WorldEdit.",
         "",
         "С помощью этих выделений вы можете очищать области, заполнять их блоками или что-то еще.",
         "",
         "Команды expand/contract/shift используют своего рода селектор, чтобы выбрать, на какие выделения ориентироваться. Поддерживаются a/all, n/newest и o/oldest.",
         "",
         "Usage:",
         "> sel pos1/p1/1 - Установите первую позицию к вашему текущему положению.",
         "> sel pos1/p1/1 <x> <y> <z> - Установите первую позицию в любые координаты.",
         "> sel pos2/p2/2 - Установите вторую позицию к вашему текущему положению.",
         "> sel pos2/p2/2 <x> <y> <z> - Установите вторую позицию в любые координаты.",
         "",
         "> sel clear/c - Очистить все выделения.",
         "> sel undo/u - Отмена последнего действия (установка позиций, создание выделений и т.д.)",
         "> sel set/fill/s/f [block] - Полностью заполните все выделения блоком.",
         "> sel walls/w [block] - Заполнить стены выделения указанным блоком.",
         "> sel shell/shl [block] - То же, что и стены, но заполняет также потолок и пол.",
         "> sel cleararea/ca - Полностью очищает территорию от блоков.",
         "> sel replace/r <blocks...> <with> - Заменяет блоки другим блоком.",
         "> sel copy/cp <x> <y> <z> - Копирование выделенной области относительно указанной или вашей позиции.",
         "> sel paste/p <x> <y> <z> - Постройте скопированную область относительно указанной или вашей позиции.",
         "",
         "> sel expand <target> <direction> <blocks> - Расширить выделение.",
         "> sel contract <target> <direction> <blocks> - Соеденить выделения.",
         "> sel shift <target> <direction> <blocks> - Сдвинуть выделение."
      );
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
      return true;
   }

   @Override
   public String id_implements() {
      return "Команда подобная WorldEdit";
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
         this.id_break = new Object[4];
         Object[] var1 = this.id_break;
      }
   }
}
