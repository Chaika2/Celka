package celestial;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.FilenameUtils;

public class sO_2 extends C_try {
   private static String[] throws_;
   private static boolean[] case_;
   private static short[] catch_;
   private static byte[] private_;
   public static Object[] break_;

   public sO_2(C_case var1) {
      super(var1, "build");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 416828859;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      File var3 = var2.break_((E)E.staticFieldsa68f70fa3b203574ab28df4fae9f18d2[0], (File)break_[0]).getAbsoluteFile();
      if (FilenameUtils.getExtension(var3.getAbsolutePath()).isEmpty()) {
         var3 = new File(var3.getAbsolutePath() + "." + (String)C_class.instanceof_().PZ.class_[0]);
      }

      rU_2 var4 = ((Ps_1)this.class_[1]).volatile_();
      rU_2 var5;
      if (var2.final_()) {
         var2.class_(3);
         var5 = var2.break_((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[0], var4);
      } else {
         var2.class_(0);
         var5 = var4;
      }

      boolean var6 = ((C_case)this.class_[0]).r().class_(var3.getName(), var3, var5);
      if (!var6) {
         throw new k_1("Не удалось загрузить схему. Убедитесь, что вы используете полное имя файла, включая расширение (например, blah.schematic)");
      } else {
         this.case_(String.format("Успешно загружена схема для здания\nПроисхождение: %s", var5));
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4304782155787443083L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, -68, -5, -96, -69, -47, 58, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      if (var2.case_()) {
         return E.class_(var2, (File)break_[0]);
      } else if (var2.break_(2)) {
         var2.throws_();
         return var2.class_((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[0]);
      } else {
         return Stream.empty();
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new File("C:\\Celestial\\Beta 1.16.5\\schematics")};
      break_ = var0;
   }

   private static void finally_() {
      catch_ = new short[]{0, 0, 0, 1, 0, 0, 0, 0};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Построение схемы из файла",
         "",
         "Использование:",
         "> build <имя файла> - Загружает и строит '<имя файла>.schematic'",
         "> build <имя файла> <x> <y> <z> - Выборочная позиция"
      );
   }

   private static void extends_() {
      case_ = new boolean[]{true, false, false, true, false, false, true, true, false, true};
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Постройте схему";
   }

   private static void protected_() {
      private_ = new byte[]{3, 2, 5, 2, 3, 4, 24};
   }

   private static void native_() {
      throws_ = new String[]{
         new String("build"),
         new String("Не удалось загрузить схему. Убедитесь, что вы используете полное имя файла, включая расширение (например, blah.schematic)"),
         new String("Успешно загружена схема для здания\nПроисхождение: %s"),
         new String("Постройте схему"),
         new String("Построение схемы из файла"),
         new String(""),
         new String("Использование:"),
         new String("> build <имя файла> - Загружает и строит '<имя файла>.schematic'"),
         new String("> build <имя файла> <x> <y> <z> - Выборочная позиция"),
         new String("schematics")
      };
   }
}
