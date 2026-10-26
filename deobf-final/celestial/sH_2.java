package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sH_2 extends C_try {
   private static boolean[] break_;
   private static String[] throws_;
   private static byte[] case_;
   private static short[] catch_;

   public sH_2(C_case var1) {
      super(var1, "farm");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7944909622033105978L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(2);
      int var3 = 0;
      rU_2 var4 = null;
      if (var2.break_(1)) {
         var3 = var2.catch_(Integer.class);
      }

      if (var2.break_(1)) {
         C_this[] var5 = var2.break_((C_boolean)C_boolean.staticFields1efcd1a6ae203b428c7ab1f68db4b5b6[0]);
         C_this var6 = null;
         switch (var5.length) {
            case 0:
               throw new k_1("Не найдено ни одного вейпоинта");
            case 1:
               var6 = var5[0];
               var4 = var6.class_();
               break;
            default:
               throw new k_1("Найдено несколько вейпоинтов");
         }
      }

      ((C_case)this.class_[0]).throws_().class_(var3, var4);
      this.case_("Фармлюсь...");
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -64748905;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-118, -39, -80, 38, -88, 19, 57, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void throws_() {
      case_ = new byte[]{2, 6, 2, 3, 4, 5};
   }

   private static void finally_() {
      throws_ = new String[]{
         new String("farm"),
         new String("Не найдено ни одного вейпоинта"),
         new String("Найдено несколько вейпоинтов"),
         new String("Фармлюсь..."),
         new String("Фармит ближайший урожай"),
         new String("Команда \"farm\" начинает выращивать близлежащие растения. Она собирает зрелые культуры и сажает новые.."),
         new String(""),
         new String("Использование:"),
         new String("> farm - фармит весь урожай, который может найти."),
         new String("> farm <радиус> - фармит весь урожай в указанном радиусе."),
         new String("> farm <радиус> <вейпоинт> - фармит весь урожай в указанном радиусе от вейпоинта.")
      };
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Команда \"farm\" начинает выращивать близлежащие растения. Она собирает зрелые культуры и сажает новые..",
         "",
         "Использование:",
         "> farm - фармит весь урожай, который может найти.",
         "> farm <радиус> - фармит весь урожай в указанном радиусе.",
         "> farm <радиус> <вейпоинт> - фармит весь урожай в указанном радиусе от вейпоинта."
      );
   }

   private static void extends_() {
      break_ = new boolean[]{true, false, false, true, true, false, false, true, true};
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Фармит ближайший урожай";
   }

   private static void protected_() {
      catch_ = new short[2];
   }
}
