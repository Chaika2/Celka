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
   private static String[] id_throws;
   private static boolean[] id_case;
   private static short[] id_catch;
   private static byte[] id_private;
   public static Object[] id_break;

   public sO_2(C_case var1) {
      String[] var10002 = new String[id_case[0]];
      var10002[id_case[1]] = id_throws[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 416828859;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      File var3 = var2.id_break((E)E.staticFieldsa68f70fa3b203574ab28df4fae9f18d2[id_catch[0]], (File)id_break[id_catch[1]]).getAbsoluteFile();
      if (FilenameUtils.getExtension(var3.getAbsolutePath()).isEmpty()) {
         var3 = new File(var3.getAbsolutePath() + "." + (String)C_class.id_instanceof().PZ.id_class[id_catch[2]]);
      }

      rU_2 var4 = ((Ps_1)this.id_class[id_catch[3]]).id_volatile();
      rU_2 var5;
      if (var2.id_final()) {
         var2.id_class(id_private[0]);
         var5 = var2.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_catch[4]], var4);
      } else {
         var2.id_class(id_case[2]);
         var5 = var4;
      }

      boolean var6 = ((C_case)this.id_class[id_catch[5]]).r().id_class(var3.getName(), var3, var5);
      if (!var6) {
         throw new k_1(id_throws[1]);
      } else {
         String var10001 = id_throws[2];
         Object[] var10002 = new Object[id_case[3]];
         var10002[id_case[4]] = var5;
         this.id_case(String.format(var10001, var10002));
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4304782155787443083L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, -68, -5, -96, -69, -47, 58, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         return E.id_class(var2, (File)id_break[id_catch[6]]);
      } else if (var2.id_break(id_private[1])) {
         var2.id_throws();
         return var2.id_class((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_catch[7]]);
      } else {
         return Stream.empty();
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new File("C:\\Celestial\\Beta 1.16.5\\schematics")};
      id_break = var0;
   }

   private static void id_finally() {
      id_catch = new short[]{0, 0, 0, 1, 0, 0, 0, 0};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[id_private[2]];
      var10000[id_case[5]] = id_throws[4];
      var10000[id_case[6]] = id_throws[5];
      var10000[id_private[3]] = id_throws[6];
      var10000[id_private[4]] = id_throws[7];
      var10000[id_private[5]] = id_throws[8];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_case = new boolean[]{true, false, false, true, false, false, true, true, false, true};
   }

   @Override
   public boolean id_case() {
      return id_case[7];
   }

   @Override
   public String id_implements() {
      return id_throws[3];
   }

   private static void id_protected() {
      id_private = new byte[]{3, 2, 5, 2, 3, 4, 24};
   }

   private static void id_native() {
      id_throws = new String[]{
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
