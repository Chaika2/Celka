package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sX_2 extends C_try {
   private static boolean[] id_break;
   private static short[] id_throws;
   private static String[] id_case;
   private static byte[] id_catch;

   public sX_2(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_break[1]] = id_case[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 228638204;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(id_break[2]);
      an_3 var3 = b_.id_catch();
      if (var3 == null) {
         throw new k_1(id_case[1]);
      } else {
         ((C_case)this.id_class[id_throws[0]]).id_import().id_break(new rS_2(var3.Bs()));
         this.id_case(id_case[2]);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1601531151851025193L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{0, 1, 14, 58, 113, 15, -16, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_case = new String[]{
         new String("come"),
         new String("Ваш игрок не найден"),
         new String("Идём"),
         new String("Указывает Baritone направиться к вашей камере"),
         new String("Указывает Baritone направиться к вашей камере"),
         new String(""),
         new String("Это может быть полезно в чит клиентах, где FreeCamera не перемещает позицию игрока"),
         new String(""),
         new String("Использование:"),
         new String("> come")
      };
   }

   private static void id_finally() {
      id_break = new boolean[]{true, false, false, false, true, true};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[6];
      var10000[id_break[3]] = id_case[4];
      var10000[1] = id_case[5];
      var10000[2] = id_case[6];
      var10000[3] = id_case[7];
      var10000[4] = id_case[8];
      var10000[5] = id_case[9];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_throws = new short[1];
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return id_case[3];
   }

   private static void id_protected() {
      id_catch = new byte[]{6, 2, 3, 4, 5};
   }
}
