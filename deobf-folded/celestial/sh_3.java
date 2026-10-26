package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sh_3 extends C_try {
   private static byte[] id_break;
   private static String[] id_throws;
   private static short[] id_case;
   private static boolean[] id_catch;

   public sh_3(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_catch[1]] = id_throws[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(id_catch[2]);
      ((C_case)this.id_class[id_case[0]]).id_float();
      this.id_case(id_throws[1]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1169788835;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1195758848365917372L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, 37, -20, -29, -70, -108, 104, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new String[]{
         new String("click"),
         new String("Выполняю!"),
         new String("Открывает меню с кликом"),
         new String("Команда \"click\" открывает меню где вы можете выбрать любую цель кликнув по ней."),
         new String(""),
         new String("Использование:"),
         new String("> click")
      };
   }

   private static void id_finally() {
      id_catch = new boolean[]{true, false, false, false, true, true};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[4];
      var10000[id_catch[3]] = id_throws[3];
      var10000[1] = id_throws[4];
      var10000[2] = id_throws[5];
      var10000[3] = id_throws[6];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_case = new short[1];
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return id_throws[2];
   }

   private static void id_protected() {
      id_break = new byte[]{4, 2, 3};
   }
}
