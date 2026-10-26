package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sv_3 extends C_try {
   private static short[] id_throws;
   public Object[] id_break;
   private static byte[] id_case;
   private static boolean[] id_catch;
   private static String[] id_private;

   public sv_3(sN_2 var1, C_case var2, String[] var3, boolean... var4) {
      super(var2, var3);
      this.id_extends();
      this.id_break[0] = var4;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      this.id_extends();
      var2.id_class(0);
      if (((boolean[])this.id_break[0])[0]) {
         ((boolean[])this.id_break[0])[0] = false;
      }

      ((C_case)this.id_class[0]).id_this().id_break();
      this.id_case("Отменяем все процессы баритона");
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1172970469;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -92671664518403371L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{49, 99, 119, 53, -105, 61, 113, 7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void id_throws() {
      id_catch = new boolean[]{false, false, false, false, false, true, true, true};
   }

   private static void id_finally() {
      id_throws = new short[4];
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList("Команда \"cancel\" отменяет все активные процессы баритона", "", "Использование:", "> cancel");
   }

   private void id_extends() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return "Отменяет все активные процессы баритона";
   }

   private static void id_protected() {
      id_private = new String[]{
         new String("Отменяем все процессы баритона"),
         new String("Отменяет все активные процессы баритона"),
         new String("Команда \"cancel\" отменяет все активные процессы баритона"),
         new String(""),
         new String("Использование:"),
         new String("> cancel")
      };
   }

   private static void id_native() {
      id_case = new byte[]{4, 2, 3};
   }
}
