package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruf_1 extends C_try {
   private static String[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_case;
   private static short[] id_catch;

   public rruf_1(C_case var1) {
      String[] var10002 = new String[id_throws[0]];
      var10002[id_throws[1]] = id_break[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7446882825252697563L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1431519803;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();
      byte var6 = id_case[0];
      switch (var3.hashCode()) {
         case -350345742:
            if (var3.equals(id_break[1])) {
               var6 = id_throws[2];
            }
            break;
         case 3322014:
            if (var3.equals(id_break[2])) {
               var6 = id_throws[3];
            }
      }
      ((rruq_1)(switch (var6) {
         case 0 -> new rruV();
         case 1 -> new rruj_1(this);
         default -> throw new W(var2.id_throws(), id_break[3]);
      })).id_class(var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{22, -98, 28, -42, -117, -81, 102, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         v_1 var10000 = new v_1();
         String[] var10001 = new String[id_case[1]];
         var10001[id_throws[4]] = id_break[4];
         var10001[id_throws[5]] = id_break[5];
         return var10000.id_break(var10001).id_class(var2.id_extends()).id_protected();
      } else {
         return Stream.empty();
      }
   }

   private static void id_throws() {
      id_catch = new short[1];
   }

   private static void id_finally() {
      id_throws = new boolean[]{true, false, false, true, false, true, false, false, true, false, true};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(id_throws[6]);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[id_catch[0]];
      String var10000 = id_break[7];
      Object[] var10001 = new Object[id_case[2]];
      var10001[id_throws[7]] = var2;
      var10001[id_throws[8]] = var1;
      var10000 = var10000.formatted(var10001);
      String var4 = id_break[8];
      Object[] var10002 = new Object[id_case[3]];
      var10002[id_throws[9]] = var2;
      var10002[id_throws[10]] = var1;
      return List.of(var10000, var4.formatted(var10002));
   }

   private static void id_extends() {
      id_break = new String[]{
         new String("bind"),
         new String("resetall"),
         new String("list"),
         new String("resetall, list"),
         new String("resetall"),
         new String("list"),
         new String("Команда для настройки биндов"),
         new String("> %s%s resetall - сбрасывает все бинды на дефолтные значения"),
         new String("> %s%s list - посмотреть список биндов")
      };
   }

   @Override
   public String id_implements() {
      return id_break[6];
   }

   private static void id_protected() {
      id_case = new byte[]{-1, 2, 2, 2};
   }
}
