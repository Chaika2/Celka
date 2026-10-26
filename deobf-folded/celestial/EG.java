package celestial;

import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EG extends C_try {
   private static String[] id_break;
   private static short[] id_throws;
   private static byte[] id_case;
   private static boolean[] id_catch;

   public EG(C_case var1) {
      String[] var10002 = new String[3];
      var10002[id_catch[0]] = id_break[0];
      var10002[1] = id_break[1];
      var10002[2] = id_break[2];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 140216340;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7932241875734323523L;
   }

   private void id_class(C_extends<?> var1, String var2, boolean var3, String var4, String var5) {
      try {
         if (var3) {
            if (var1.id_byte() != Boolean.class) {
               this.id_case(id_break[35]);
               return;
            }

            Boolean var12 = (Boolean)var1.id_class[id_throws[8]] ^ true;
            var1.id_class[id_throws[9]] = var12;
            String var10001 = id_break[36];
            Object[] var10002 = new Object[2];
            var10002[id_catch[32]] = var1.id_protected();
            var10002[1] = var1.id_class[id_throws[10]];
            this.id_case(String.format(var10001, var10002));
         } else if (var2 != null) {
            Pd_1.id_class(C_class.id_instanceof(), var5, var2);
            String var14 = id_break[37];
            Object[] var15 = new Object[2];
            var15[id_catch[34]] = var1.id_protected();
            var15[1] = Pd_1.id_break(var1);
            this.id_case(String.format(var14, var15));
         }

         this.id_class(var1, var4);
         Pd_1.id_break(C_class.id_instanceof());
      } catch (Exception var13) {
         this.id_case("Ошибка при изменении настройки: " + var13.getMessage());
         var13.printStackTrace();
      }
   }

   private void id_class(C_extends<?> var1, C_static var2, boolean var3, boolean var4, String var5, String var6) throws x_1 {
      if (var3) {
         var1.id_break();
      } else if (var4) {
         if (var1.id_byte() != Boolean.class) {
            throw new W(var2.id_private(), id_break[24], id_break[25]);
         }

         Boolean var13 = (Boolean)var1.id_class[id_throws[3]] ^ true;
         var1.id_class[id_throws[4]] = var13;
         String var10001 = id_break[26];
         Object[] var10002 = new Object[2];
         var10002[id_catch[21]] = var1.id_protected();
         var10002[1] = var1.id_class[id_throws[5]];
         this.id_case(String.format(var10001, var10002));
      } else {
         String var7 = var2.id_extends();

         try {
            Pd_1.id_class(C_class.id_instanceof(), var6, var7);
         } catch (Throwable var14) {
            var14.printStackTrace();
            throw new W(var2.id_private(), id_break[27], var14);
         }
      }

      if (!var4) {
         String var15 = id_break[28];
         Object[] var16 = new Object[3];
         var16[id_catch[23]] = var3 ? id_break[29] : id_break[30];
         var16[1] = var1.id_protected();
         var16[2] = Pd_1.id_break(var1);
         this.id_case(String.format(var15, var16));
      }

      this.id_class(var1, var5);
   }

   private void id_class(C_extends<?> var1, String var2) {
      String var10002 = id_break[31];
      Object[] var10003 = new Object[1];
      var10003[id_catch[26]] = var2;
      rVe_1 var3 = new rVe_1(String.format(var10002, var10003));
      rgc_3 var10001 = var3.id_class().id_class(rgF_2.GRAY).id_class(new rgy_3(rgp_3.id_class, new rgN_2(id_break[32])));
      rgH_2 var10004 = rgH_2.RUN_COMMAND;
      String var10005 = (String)C_class.id_instanceof().id_protected.id_class[id_throws[6]];
      String var10006 = id_break[33];
      Object[] var10007 = new Object[2];
      var10007[id_catch[27]] = var1.id_protected();
      var10007[1] = var2;
      var3.id_class(var10001.id_class(new rgl_3(var10004, var10005 + String.format(var10006, var10007))));
      rVi_1[] var4 = new rVi_1[1];
      var4[id_catch[30]] = var3;
      this.id_class(var4);
   }

   private C_finally id_class(C_extends<?> var1) {
      try {
         Field[] var2 = C_class.id_instanceof().getClass().getFields();
         Field[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = id_catch[19]; var5 < var4; var5++) {
            Field var6 = var3[var5];
            if (var6.getType().equals(C_extends.class)) {
               try {
                  C_extends var7 = (C_extends)var6.get(C_class.id_instanceof());
                  if (var7 == var1) {
                     return var6.getAnnotation(C_finally.class);
                  }
               } catch (IllegalAccessException var8) {
                  var8.printStackTrace();
                  this.id_case("Не удалось получить значение настройки " + var6.getName());
               }
            }
         }
      } catch (Exception var9) {
         var9.printStackTrace();
         this.id_case("Не удалось получить аннотацию подтверждения для настройки " + var1.id_protected());
      }

      return null;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_final() ? var2.id_extends().toLowerCase(Locale.US) : id_break[3];
      String[] var10000 = new String[2];
      var10000[id_catch[2]] = id_break[4];
      var10000[1] = id_break[5];
      if (Arrays.asList(var10000).contains(var3)) {
         Pd_1.id_break(C_class.id_instanceof());
         this.id_case(id_break[6]);
      } else {
         var10000 = new String[3];
         var10000[id_catch[4]] = id_break[7];
         var10000[1] = id_break[8];
         var10000[2] = id_break[9];
         boolean var4 = Arrays.asList(var10000).contains(var3);
         var10000 = new String[3];
         var10000[id_catch[6]] = id_break[10];
         var10000[1] = id_break[11];
         var10000[2] = id_break[12];
         boolean var5 = Arrays.asList(var10000).contains(var3);
         boolean var6 = !var4 && !var5 ? id_catch[9] : true;
         if (var6) {
            String var15 = var2.id_final() && var2.id_throws(Integer.class) == null ? var2.id_extends() : id_break[13];
            var2.id_class(1);
            List var16 = (var4 ? Pd_1.id_class(C_class.id_instanceof()) : (List)C_class.id_instanceof().Pj[1])
               .stream()
               .filter(var0 -> !Pd_1.id_throws(var0) ? true : id_catch[64])
               .filter(var1x -> var1x.id_protected().toLowerCase(Locale.US).contains(var15.toLowerCase(Locale.US)))
               .sorted((var0, var1x) -> String.CASE_INSENSITIVE_ORDER.compare(var0.id_protected(), var1x.id_protected()))
               .collect(Collectors.toList());
            Z.id_class(var2, new Z<>(var16), () -> {
               String var3x;
               if (!var15.isEmpty()) {
                  var3x = id_break[72];
                  Object[] var10002x = new Object[2];
                  var10002x[id_catch[59]] = var4 ? id_break[73] : id_break[74];
                  var10002x[1] = var15;
                  var3x = String.format(var3x, var10002x);
               } else {
                  var3x = id_break[75];
                  Object[] var5x = new Object[1];
                  var5x[id_catch[62]] = var4 ? id_break[76] : id_break[77];
                  var3x = String.format(var3x, var5x);
               }

               this.id_case(var3x);
            }, var0 -> {
               String var10002x = id_break[66];
               Object[] var10003x = new Object[1];
               var10003x[id_catch[50]] = Pd_1.id_protected(var0);
               rgN_2 var1x = new rgN_2(String.format(var10002x, var10003x));
               var1x.id_class(var1x.id_class().id_class(rgF_2.DARK_GRAY));
               rgN_2 var2x = new rgN_2(id_break[67]);
               var2x.id_class(var2x.id_class().id_class(rgF_2.GRAY));
               var2x.id_break(var0.id_protected());
               String var10001x = id_break[68];
               Object[] var8x = new Object[1];
               var8x[id_catch[52]] = Pd_1.id_protected(var0);
               var2x.id_break(String.format(var10001x, var8x));
               var10001x = id_break[69];
               Object[] var9x = new Object[1];
               var9x[id_catch[54]] = Pd_1.id_break(var0);
               var2x.id_break(String.format(var10001x, var9x));
               var10001x = id_break[70];
               Object[] var10x = new Object[1];
               var10x[id_catch[56]] = Pd_1.id_class(var0);
               var2x.id_break(String.format(var10001x, var10x));
               String var10000x = (String)C_class.id_instanceof().id_protected.id_class[id_throws[13]];
               var10001x = id_break[71];
               Object[] var11x = new Object[1];
               var11x[id_catch[58]] = var0.id_protected();
               String var3x = var10000x + String.format(var10001x, var11x);
               rVe_1 var4x = new rVe_1(var0.id_protected());
               var4x.id_class(var4x.id_class().id_class(rgF_2.GRAY));
               var4x.id_class(var1x);
               var4x.id_class(var4x.id_class().id_class(new rgy_3(rgp_3.id_class, var2x)).id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, var3x)));
               return var4x;
            }, (String)C_class.id_instanceof().id_protected.id_class[id_throws[1]] + "set " + var3 + " " + var15);
         } else {
            var2.id_class(1);
            boolean var7 = var3.equalsIgnoreCase(id_break[14]);
            boolean var8 = var3.equalsIgnoreCase(id_break[15]);
            boolean var9 = !var7 && !var8 ? id_catch[13] : true;
            if (var7) {
               if (!var2.id_final()) {
                  this.id_case(id_break[16]);
                  this.id_case(id_break[17]);
                  this.id_case(id_break[18]);
               } else if (var2.id_implements().equalsIgnoreCase(id_break[19])) {
                  Pd_1.id_class(C_class.id_instanceof()).forEach(C_extends::id_break);
                  this.id_case(id_break[20]);
                  Pd_1.id_break(C_class.id_instanceof());
                  return;
               }
            }

            if (var8) {
               var2.id_private(1);
            }

            String var10 = var9 ? var2.id_extends() : var3;
            C_extends var11 = ((List)C_class.id_instanceof().Pj[1])
               .stream()
               .filter(var1x -> var1x.id_protected().equalsIgnoreCase(var10))
               .findFirst()
               .orElse(null);
            if (var11 == null) {
               throw new W(var2.id_private(), id_break[21]);
            } else if (Pd_1.id_throws(var11)) {
               String var19 = id_break[22];
               Object[] var10003 = new Object[1];
               var10003[id_catch[16]] = var11.id_protected();
               throw new k_1(String.format(var19, var10003));
            } else {
               if (!var9 && !var2.id_final()) {
                  String var10001 = id_break[23];
                  Object[] var10002 = new Object[1];
                  var10002[id_catch[18]] = var11.id_protected();
                  this.id_case(String.format(var10001, var10002));
                  this.id_case(Pd_1.id_break(var11));
               } else {
                  String var12 = Pd_1.id_break(var11);
                  if (!var7) {
                     C_finally var13 = this.id_class(var11);
                     if (var13 != null) {
                        String var14 = var2.id_final() ? var2.id_extends() : null;
                        this.id_class(var11, var14, var8, var12, var3, var13);
                        return;
                     }
                  }

                  this.id_class(var11, var2, var7, var8, var12, var3);
               }

               Pd_1.id_break(C_class.id_instanceof());
            }
         }
      }
   }

   private void id_class(C_extends<?> var1, String var2, boolean var3, String var4, String var5, C_finally var6) {
      try {
         QY var7 = ((Ps_1)this.id_class[1]).id_throws();
         mT_2 var8 = new mT_2(var7x -> {
            if (var7x) {
               this.id_class(var1, var2, var3, var4, var5);
            } else {
               this.id_case(id_break[65]);
            }

            var7.id_break(null);
         }, new rgn_3(var6.id_class()), new rgn_3(var6.id_break()));
         var7.id_private(() -> var7.id_break(var8));
      } catch (Exception var9) {
         this.id_case(id_break[34]);
         this.id_class(var1, var2, var3, var4, var5);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{80, -8, -88, 105, 112, -30, 64, -97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_final()) {
         String var3 = var2.id_extends();
         if (var2.id_case()) {
            String[] var10000 = new String[2];
            var10000[id_catch[36]] = id_break[38];
            var10000[1] = id_break[39];
            if (!Arrays.asList(var10000).contains(var2.id_implements().toLowerCase(Locale.US))) {
               if (var3.equalsIgnoreCase(id_break[40])) {
                  v_1 var7 = new v_1().id_case();
                  String[] var10 = new String[1];
                  var10[id_catch[39]] = id_break[41];
                  return var7.id_class(var10).id_class(var2.id_extends()).id_protected();
               }

               if (var3.equalsIgnoreCase(id_break[42])) {
                  return new v_1().id_throws().id_class(var2.id_extends()).id_protected();
               }

               C_extends var4 = (C_extends)((Map)C_class.id_instanceof().Pj[id_throws[11]]).get(var3.toLowerCase(Locale.US));
               if (var4 != null) {
                  if (var4.id_throws() == Boolean.class) {
                     v_1 var5 = new v_1();
                     if ((Boolean)var4.id_class[id_throws[12]]) {
                        String[] var8 = new String[2];
                        var8[id_catch[40]] = id_break[43];
                        var8[1] = id_break[44];
                        var5.id_break(var8);
                     } else {
                        String[] var9 = new String[2];
                        var9[id_catch[42]] = id_break[45];
                        var9[1] = id_break[46];
                        var5.id_break(var9);
                     }

                     return var5.id_class(var2.id_extends()).id_protected();
                  }

                  return Stream.of(Pd_1.id_break(var4));
               }

               return Stream.empty();
            }
         }

         if (!var2.id_final()) {
            v_1 var6 = new v_1().id_byte().id_break();
            String[] var10001 = new String[5];
            var10001[id_catch[44]] = id_break[47];
            var10001[1] = id_break[48];
            var10001[2] = id_break[49];
            var10001[3] = id_break[50];
            var10001[4] = id_break[51];
            return var6.id_class(var10001).id_class(var3).id_protected();
         }
      }

      return Stream.empty();
   }

   private static void id_throws() {
      id_case = new byte[]{3, 2, 2, 3, 2, 3, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 5, 2, 3, 4, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2};
   }

   private static void id_finally() {
      id_throws = new short[]{1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[12];
      var10000[id_catch[46]] = id_break[53];
      var10000[1] = id_break[54];
      var10000[2] = id_break[55];
      var10000[3] = id_break[56];
      var10000[4] = id_break[57];
      var10000[5] = id_break[58];
      var10000[6] = id_break[59];
      var10000[7] = id_break[60];
      var10000[8] = id_break[61];
      var10000[9] = id_break[62];
      var10000[10] = id_break[63];
      var10000[11] = id_break[64];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_catch = new boolean[]{
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
         false,
         true,
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
         true,
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
         false
      };
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return id_break[52];
   }

   private static void id_protected() {
      id_break = new String[]{
         new String("set"),
         new String("setting"),
         new String("settings"),
         new String("list"),
         new String("s"),
         new String("save"),
         new String("Настройки сохранены"),
         new String("m"),
         new String("mod"),
         new String("modified"),
         new String("all"),
         new String("l"),
         new String("list"),
         new String(""),
         new String("reset"),
         new String("toggle"),
         new String("Пожалуйста, укажите 'all' в качестве аргумента для сброса, чтобы подтвердить, что вы действительно хотите сделать это."),
         new String("Все настройки будут сброшены. Используйте команды 'set modified' или 'modified', чтобы увидеть, какие настройки будут сброшены."),
         new String("Укажите имя настройки вместо 'all', чтобы сбросить только одну настройку"),
         new String("all"),
         new String("Все настройки были сброшены до значений по умолчанию"),
         new String("валидная настройка"),
         new String("Настройка %s может быть использована только через api."),
         new String("Value of setting %s:"),
         new String("переключаемая настройка"),
         new String("другие параметры"),
         new String("Переключение настройки %s на %s"),
         new String("a valid value"),
         new String("Настройка \"%s %s\" установлена на %s"),
         new String("reset"),
         new String("set"),
         new String("Старое значение: %s"),
         new String("Нажмите, чтобы вернуть настройку к данному значению"),
         new String("set %s %s"),
         new String("Не удалось показать диалог подтверждения, применяем изменение..."),
         new String("Ошибка: настройка не может быть переключена"),
         new String("Переключение настройки %s на %s"),
         new String("Настройка \"set %s\" установлена на %s"),
         new String("s"),
         new String("save"),
         new String("reset"),
         new String("all"),
         new String("toggle"),
         new String("true"),
         new String("false"),
         new String("false"),
         new String("true"),
         new String("list"),
         new String("modified"),
         new String("reset"),
         new String("toggle"),
         new String("save"),
         new String("Изменение настроек баритона"),
         new String(
            "Используя команду set, вы можете управлять всеми настройками Celestial. Практически каждый аспект контролируется этими настройками - будьте уверены!"
         ),
         new String(""),
         new String("Использование:"),
         new String("> set - То же самое, что и `set list`."),
         new String("> set list [страница] - Просмотр всех настроек"),
         new String("> set modified [страница] - Просмотр измененных настроек"),
         new String("> set <настройка> - Просмотр текущего значения настройки"),
         new String("> set <настройка> <значение> - Установите значение параметра"),
         new String("> set reset all - Сбросить ВСЕ НАСТРОЙКИ на значения по умолчанию"),
         new String("> set reset <настройка> - Сброс настройки на значение по умолчанию"),
         new String("> set toggle <настройка> - Переключение настройки с true на false и наоборот"),
         new String("> set save - Сохранить все настройки (это происходит автоматически)"),
         new String("Изменение настройки отменено"),
         new String(" (%s)"),
         new String(""),
         new String("\nТип: %s"),
         new String("\n\nЗначение:\n%s"),
         new String("\n\nЗначение по умолчанию:\n%s"),
         new String("set %s "),
         new String("All %ssettings containing the string '%s':"),
         new String("modified "),
         new String(""),
         new String("All %ssettings:"),
         new String("modified "),
         new String("")
      };
   }
}
