package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class su_3 extends C_try {
   private static short[] id_throws;
   private static boolean[] id_case;
   private static byte[] id_catch;
   private static String[] id_private;
   public Object[] id_break;

   public su_3(sN_2 var1, C_case var2, String[] var3, boolean... var4) {
      super(var2, var3);
      this.id_protected();
      this.id_break[id_throws[0]] = var4;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 747256742762927287L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1775049014;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      this.id_protected();
      var2.id_class(id_case[0]);
      if (((boolean[])this.id_break[id_throws[1]])[id_case[1]]) {
         throw new k_1(id_private[0]);
      } else {
         ((boolean[])this.id_break[id_throws[2]])[id_case[2]] = id_case[3];
         this.id_case(id_private[1]);
      }
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-106, 25, 48, -51, -128, -25, -16, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_catch = new byte[]{6, 2, 3, 4, 5};
   }

   private static void id_finally() {
      id_case = new boolean[]{false, false, false, true, false, true, true, true};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[id_catch[0]];
      var10000[id_case[4]] = id_private[3];
      var10000[id_case[5]] = id_private[4];
      var10000[id_catch[1]] = id_private[5];
      var10000[id_catch[2]] = id_private[6];
      var10000[id_catch[3]] = id_private[7];
      var10000[id_catch[4]] = id_private[8];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_throws = new short[3];
   }

   @Override
   public boolean id_case() {
      return id_case[6];
   }

   @Override
   public String id_implements() {
      return id_private[2];
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[id_case[7]];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_native() {
      id_private = new String[]{
         new String("Уже на паузе"),
         new String("Приостановлено"),
         new String("Приостанавливает баритон до тех пор, пока вы не воспользуетесь функцией возобновления"),
         new String("Команда \"pause\" устанавливает баритон на паузу."),
         new String(""),
         new String(
            "Это можно использовать для приостановки прокладки пути, строительства, следования, чего угодно. Однократное использование команды resume запустит его снова!"
         ),
         new String(""),
         new String("Использование:"),
         new String("> pause")
      };
   }
}
