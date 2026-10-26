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
   private static String[] break_;
   private static short[] throws_;
   private static byte[] case_;
   private static boolean[] catch_;

   public EG(C_case var1) {
      super(var1, "set", "setting", "settings");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 140216340;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7932241875734323523L;
   }

   private void class_(C_extends<?> var1, String var2, boolean var3, String var4, String var5) {
      try {
         if (var3) {
            if (var1.byte_() != Boolean.class) {
               this.case_(break_[35]);
               return;
            }

            Boolean var12 = (Boolean)var1.class_[throws_[8]] ^ catch_[31];
            var1.class_[throws_[9]] = var12;
            String var10001 = break_[36];
            Object[] var10002 = new Object[case_[11]];
            var10002[catch_[32]] = var1.protected_();
            var10002[catch_[33]] = var1.class_[throws_[10]];
            this.case_(String.format(var10001, var10002));
         } else if (var2 != null) {
            Pd_1.class_(C_class.instanceof_(), var5, var2);
            String var14 = break_[37];
            Object[] var15 = new Object[case_[12]];
            var15[catch_[34]] = var1.protected_();
            var15[catch_[35]] = Pd_1.break_(var1);
            this.case_(String.format(var14, var15));
         }

         this.class_(var1, var4);
         Pd_1.break_(C_class.instanceof_());
      } catch (Exception var13) {
         this.case_("Ошибка при изменении настройки: " + var13.getMessage());
         var13.printStackTrace();
      }
   }

   private void class_(C_extends<?> var1, C_static var2, boolean var3, boolean var4, String var5, String var6) throws x_1 {
      if (var3) {
         var1.break_();
      } else if (var4) {
         if (var1.byte_() != Boolean.class) {
            throw new W(var2.private_(), "переключаемая настройка", "другие параметры");
         }

         Boolean var13 = (Boolean)var1.class_[0] ^ true;
         var1.class_[0] = var13;
         this.case_(String.format("Переключение настройки %s на %s", var1.protected_(), var1.class_[0]));
      } else {
         String var7 = var2.extends_();

         try {
            Pd_1.class_(C_class.instanceof_(), var6, var7);
         } catch (Throwable var14) {
            var14.printStackTrace();
            throw new W(var2.private_(), "a valid value", var14);
         }
      }

      if (!var4) {
         this.case_(String.format("Настройка \"%s %s\" установлена на %s", var3 ? "reset" : break_[30], var1.protected_(), Pd_1.break_(var1)));
      }

      this.class_(var1, var5);
   }

   private void class_(C_extends<?> var1, String var2) {
      rVe_1 var3 = new rVe_1(String.format("Старое значение: %s", var2));
      var3.class_(
         var3.class_()
            .class_(rgF_2.GRAY)
            .class_(new rgy_3(rgp_3.class_, new rgN_2("Нажмите, чтобы вернуть настройку к данному значению")))
            .class_(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + String.format("set %s %s", var1.protected_(), var2)))
      );
      this.class_(new rVi_1[]{var3});
   }

   private C_finally class_(C_extends<?> var1) {
      try {
         Field[] var2 = C_class.instanceof_().getClass().getFields();
         Field[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = catch_[19]; var5 < var4; var5++) {
            Field var6 = var3[var5];
            if (var6.getType().equals(C_extends.class)) {
               try {
                  C_extends var7 = (C_extends)var6.get(C_class.instanceof_());
                  if (var7 == var1) {
                     return var6.getAnnotation(C_finally.class);
                  }
               } catch (IllegalAccessException var8) {
                  var8.printStackTrace();
                  this.case_("Не удалось получить значение настройки " + var6.getName());
               }
            }
         }
      } catch (Exception var9) {
         var9.printStackTrace();
         this.case_("Не удалось получить аннотацию подтверждения для настройки " + var1.protected_());
      }

      return null;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.final_() ? var2.extends_().toLowerCase(Locale.US) : break_[3];
      if (Arrays.asList("s", "save").contains(var3)) {
         Pd_1.break_(C_class.instanceof_());
         this.case_("Настройки сохранены");
      } else {
         String[] var10000 = new String[case_[3]];
         var10000[0] = "m";
         var10000[1] = "mod";
         var10000[2] = "modified";
         boolean var4 = Arrays.asList(var10000).contains(var3);
         boolean var5 = Arrays.asList("all", "l", "list").contains(var3);
         boolean var6 = !var4 && !var5 ? catch_[9] : catch_[8];
         if (var6) {
            String var15 = var2.final_() && var2.throws_(Integer.class) == null ? var2.extends_() : break_[13];
            var2.class_(1);
            List var16 = (var4 ? Pd_1.class_(C_class.instanceof_()) : (List)C_class.instanceof_().Pj[1])
               .stream()
               .filter(var0 -> !Pd_1.throws_(var0) ? true : catch_[64])
               .filter(var1x -> var1x.protected_().toLowerCase(Locale.US).contains(var15.toLowerCase(Locale.US)))
               .sorted((var0, var1x) -> String.CASE_INSENSITIVE_ORDER.compare(var0.protected_(), var1x.protected_()))
               .collect(Collectors.toList());
            Z.class_(
               var2,
               new Z<>(var16),
               () -> this.case_(
                     !var15.isEmpty()
                        ? String.format("All %ssettings containing the string '%s':", var4 ? "modified " : break_[74], var15)
                        : String.format(break_[75], var4 ? "modified " : break_[77])
                  ),
               var0 -> {
                  rgN_2 var1x = new rgN_2(String.format(" (%s)", Pd_1.protected_(var0)));
                  var1x.class_(var1x.class_().class_(rgF_2.DARK_GRAY));
                  rgN_2 var2x = new rgN_2("");
                  var2x.class_(var2x.class_().class_(rgF_2.GRAY));
                  var2x.break_(var0.protected_());
                  var2x.break_(String.format("\nТип: %s", Pd_1.protected_(var0)));
                  var2x.break_(String.format("\n\nЗначение:\n%s", Pd_1.break_(var0)));
                  var2x.break_(String.format("\n\nЗначение по умолчанию:\n%s", Pd_1.class_(var0)));
                  String var3x = (String)C_class.instanceof_().protected_.class_[0] + String.format("set %s ", var0.protected_());
                  rVe_1 var4x = new rVe_1(var0.protected_());
                  var4x.class_(var4x.class_().class_(rgF_2.GRAY));
                  var4x.class_(var1x);
                  var4x.class_(var4x.class_().class_(new rgy_3(rgp_3.class_, var2x)).class_(new rgl_3(rgH_2.SUGGEST_COMMAND, var3x)));
                  return var4x;
               },
               (String)C_class.instanceof_().protected_.class_[0] + "set " + var3 + " " + var15
            );
         } else {
            var2.class_(1);
            boolean var7 = var3.equalsIgnoreCase("reset");
            boolean var8 = var3.equalsIgnoreCase("toggle");
            boolean var9 = !var7 && !var8 ? catch_[13] : catch_[12];
            if (var7) {
               if (!var2.final_()) {
                  this.case_("Пожалуйста, укажите 'all' в качестве аргумента для сброса, чтобы подтвердить, что вы действительно хотите сделать это.");
                  this.case_("Все настройки будут сброшены. Используйте команды 'set modified' или 'modified', чтобы увидеть, какие настройки будут сброшены.");
                  this.case_("Укажите имя настройки вместо 'all', чтобы сбросить только одну настройку");
               } else if (var2.implements_().equalsIgnoreCase("all")) {
                  Pd_1.class_(C_class.instanceof_()).forEach(C_extends::break_);
                  this.case_("Все настройки были сброшены до значений по умолчанию");
                  Pd_1.break_(C_class.instanceof_());
                  return;
               }
            }

            if (var8) {
               var2.private_(1);
            }

            String var10 = var9 ? var2.extends_() : var3;
            C_extends var11 = ((List)C_class.instanceof_().Pj[1]).stream().filter(var1x -> var1x.protected_().equalsIgnoreCase(var10)).findFirst().orElse(null);
            if (var11 == null) {
               throw new W(var2.private_(), "валидная настройка");
            } else if (Pd_1.throws_(var11)) {
               throw new k_1(String.format("Настройка %s может быть использована только через api.", var11.protected_()));
            } else {
               if (!var9 && !var2.final_()) {
                  this.case_(String.format("Value of setting %s:", var11.protected_()));
                  this.case_(Pd_1.break_(var11));
               } else {
                  String var12 = Pd_1.break_(var11);
                  if (!var7) {
                     C_finally var13 = this.class_(var11);
                     if (var13 != null) {
                        String var14 = var2.final_() ? var2.extends_() : null;
                        this.class_(var11, var14, var8, var12, var3, var13);
                        return;
                     }
                  }

                  this.class_(var11, var2, var7, var8, var12, var3);
               }

               Pd_1.break_(C_class.instanceof_());
            }
         }
      }
   }

   private void class_(C_extends<?> var1, String var2, boolean var3, String var4, String var5, C_finally var6) {
      try {
         QY var7 = ((Ps_1)this.class_[throws_[7]]).throws_();
         mT_2 var8 = new mT_2(var7x -> {
            if (var7x) {
               this.class_(var1, var2, var3, var4, var5);
            } else {
               this.case_("Изменение настройки отменено");
            }

            var7.break_(null);
         }, new rgn_3(var6.class_()), new rgn_3(var6.break_()));
         var7.private_(() -> var7.break_(var8));
      } catch (Exception var9) {
         this.case_("Не удалось показать диалог подтверждения, применяем изменение...");
         this.class_(var1, var2, var3, var4, var5);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{80, -8, -88, 105, 112, -30, 64, -97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      if (var2.final_()) {
         String var3 = var2.extends_();
         if (var2.case_() && !Arrays.asList("s", "save").contains(var2.implements_().toLowerCase(Locale.US))) {
            if (var3.equalsIgnoreCase("reset")) {
               return new v_1().case_().class_("all").class_(var2.extends_()).protected_();
            }

            if (var3.equalsIgnoreCase("toggle")) {
               return new v_1().throws_().class_(var2.extends_()).protected_();
            }

            C_extends var4 = (C_extends)((Map)C_class.instanceof_().Pj[0]).get(var3.toLowerCase(Locale.US));
            if (var4 != null) {
               if (var4.throws_() == Boolean.class) {
                  v_1 var5 = new v_1();
                  if ((Boolean)var4.class_[0]) {
                     var5.break_("true", "false");
                  } else {
                     var5.break_("false", "true");
                  }

                  return var5.class_(var2.extends_()).protected_();
               }

               return Stream.of(Pd_1.break_(var4));
            }
         } else if (!var2.final_()) {
            return new v_1().byte_().break_().class_("list", "modified", "reset", "toggle", "save").class_(var3).protected_();
         }
      }

      return Stream.empty();
   }

   private static void throws_() {
      case_ = new byte[]{3, 2, 2, 3, 2, 3, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 5, 2, 3, 4, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2};
   }

   private static void finally_() {
      throws_ = new short[]{1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Используя команду set, вы можете управлять всеми настройками Celestial. Практически каждый аспект контролируется этими настройками - будьте уверены!",
         "",
         "Использование:",
         "> set - То же самое, что и `set list`.",
         "> set list [страница] - Просмотр всех настроек",
         "> set modified [страница] - Просмотр измененных настроек",
         "> set <настройка> - Просмотр текущего значения настройки",
         "> set <настройка> <значение> - Установите значение параметра",
         "> set reset all - Сбросить ВСЕ НАСТРОЙКИ на значения по умолчанию",
         "> set reset <настройка> - Сброс настройки на значение по умолчанию",
         "> set toggle <настройка> - Переключение настройки с true на false и наоборот",
         "> set save - Сохранить все настройки (это происходит автоматически)"
      );
   }

   private static void extends_() {
      catch_ = new boolean[]{
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
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Изменение настроек баритона";
   }

   private static void protected_() {
      break_ = new String[]{
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
