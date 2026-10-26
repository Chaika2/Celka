package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class so_3 extends C_try {
   private static boolean[] id_break;
   private static String[] id_throws;
   private static short[] id_case;
   private static byte[] id_catch;

   public so_3(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_break[1]] = id_throws[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      rc_3 var3 = ((C_case)this.id_class[id_case[0]]).id_import();
      var2.id_class(id_break[2]);
      ((So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[id_case[1]]).id_class((Ps_1)this.id_class[1]);
      var3.id_implements();
      this.id_case(id_throws[1]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6576350284255742176L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1707134618;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{115, -46, 24, -23, 68, 96, -71, -48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   private static void id_throws() {
      id_throws = new String[]{
         new String("path"),
         new String("Прокладывание пути..."),
         new String("Двигаться к цели (Goal)"),
         new String("Команда \"path\" указывает Baritone направиться к текущей цели (Goal)."),
         new String(""),
         new String("Использование:"),
         new String("> path - Начать идти к цели.")
      };
   }

   private static void id_finally() {
      id_case = new short[]{0, 0, 1};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[4];
      var10000[id_break[3]] = id_throws[3];
      var10000[1] = id_throws[4];
      var10000[2] = id_throws[5];
      var10000[3] = id_throws[6];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_catch = new byte[]{4, 2, 3};
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
      id_break = new boolean[]{true, false, false, false, true, true};
   }
}
