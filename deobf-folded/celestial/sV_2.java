package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sV_2 extends C_try {
   private static boolean[] id_break;
   private static short[] id_throws;
   private static String[] id_case;
   private static byte[] id_catch;

   public sV_2(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_break[1]] = id_case[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(1);
      ((C_case)this.id_class[id_throws[0]])
         .id_switch()
         .id_class()
         .id_byte()
         .forEach(
            var1x -> {
               if (!var1x.id_case()) {
                  String var2x = String.join(id_case[6], var1x.id_break());
                  String var3 = var1x.id_break().get(id_break[6]);
                  rgN_2 var4 = new rgN_2(" - " + var1x.id_implements());
                  var4.id_class(var4.id_class().id_class(rgF_2.GRAY));
                  rVe_1 var5 = rrfu_3.id_class((Object)var2x).id_break();
                  var5.id_class(var5.id_class().id_class(rgF_2.WHITE));
                  rgN_2 var6 = new rgN_2(id_case[7]);
                  var6.id_class(var6.id_class().id_class(rgF_2.GRAY));
                  var6.id_break(String.join(id_case[8], var1x.id_catch()));
                  rVe_1 var7 = rrfu_3.id_class((Object)var3).id_break();
                  var7.id_class(var7.id_class().id_class(rgF_2.GRAY));
                  var7.id_class(var4);
                  var7.id_class(var7.id_class().id_class(new rgy_3(rgp_3.id_class, var6)));
                  var7.id_class(
                     var7.id_class()
                        .id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_throws[2]] + var3 + " "))
                  );
                  rVi_1[] var10001 = new rVi_1[1];
                  var10001[id_break[8]] = var7;
                  this.id_class(var10001);
               }
            }
         );
      this.id_case("Изменить префикс команд: " + (String)C_class.id_instanceof().id_protected.id_class[id_throws[1]] + "prefix <новый префикс>");
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -918085630;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1541806790823489471L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, 66, 19, -93, -42, -55, -126, -46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   private static void id_throws() {
      id_catch = new byte[]{4, 2, 3};
   }

   private static void id_finally() {
      id_case = new String[]{
         new String("help"),
         new String("Просмотр всех команд"),
         new String("С помощью этой команды вы можете просмотреть подробную информацию о том, как использовать команды Celestial."),
         new String("Использование:"),
         new String("> help - Перечисляет все команды и их краткие описания."),
         new String("> help <команда> - Отображает информацию по определенной команде."),
         new String("/"),
         new String(""),
         new String("\n")
      };
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[4];
      var10000[id_break[3]] = id_case[2];
      var10000[1] = id_case[3];
      var10000[2] = id_case[4];
      var10000[3] = id_case[5];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_throws = new short[3];
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return id_case[1];
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, true, false, true, true, false, true, false};
   }
}
