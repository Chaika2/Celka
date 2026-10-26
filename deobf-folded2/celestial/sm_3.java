package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sm_3 extends C_try {
   public Object[] id_break;
   private static boolean[] id_throws;
   private static short[] id_case;
   private static String[] id_catch;
   private static byte[] id_private;

   public sm_3(sN_2 var1, C_case var2, String[] var3, boolean... var4) {
      super(var2, var3);
      this.id_finally();
      this.id_break[0] = var4;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 896986854;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      this.id_finally();
      var2.id_class(0);
      ((C_case)this.id_class[0]).r().id_finally();
      if (!((boolean[])this.id_break[0])[0]) {
         throw new k_1("Не на паузе");
      } else {
         ((boolean[])this.id_break[0])[0] = false;
         this.id_case("Возобновлено");
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7502742272629854414L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{100, 105, 71, -42, 18, -53, -92, 91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void id_throws() {
      id_case = new short[4];
   }

   private void id_finally() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList(
         "Команда \"resume\" указывает Baritone возобновить все, что он делал, когда вы в последний раз использовали команду pause.",
         "",
         "Использование:",
         "> resume"
      );
   }

   private static void id_extends() {
      id_throws = new boolean[]{false, false, false, false, false, true, true, true};
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return "Восстанавливает баритон после паузы";
   }

   private static void id_protected() {
      id_private = new byte[]{4, 2, 3};
   }

   private static void id_native() {
      id_catch = new String[]{
         new String("Не на паузе"),
         new String("Возобновлено"),
         new String("Восстанавливает баритон после паузы"),
         new String("Команда \"resume\" указывает Baritone возобновить все, что он делал, когда вы в последний раз использовали команду pause."),
         new String(""),
         new String("Использование:"),
         new String("> resume")
      };
   }
}
