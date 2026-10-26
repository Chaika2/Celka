package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrut_1 extends C_try {
   private static byte[] id_break;
   private static boolean[] id_throws;
   private static short[] id_case;
   private static String[] id_catch;

   public rrut_1(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_throws[1]] = id_catch[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2904340654643968808L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();
      byte var6 = -1;
      switch (var3.hashCode()) {
         case -934641255:
            if (var3.equals(id_catch[2])) {
               var6 = 1;
            }
            break;
         case 3522941:
            if (var3.equals(id_catch[1])) {
               var6 = id_throws[2];
            }
      }
      ((rruq_1)(switch (var6) {
         case 0 -> new rruI();
         case 1 -> new rruw_1();
         default -> throw new W(var2.id_throws(), id_catch[3], id_catch[4]);
      })).id_class(var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 510550283;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         v_1 var10000 = new v_1();
         String[] var10001 = new String[2];
         var10001[id_throws[4]] = id_catch[5];
         var10001[1] = id_catch[6];
         return var10000.id_break(var10001).id_class(var2.id_extends()).id_protected();
      } else {
         return Stream.empty();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, 69, 117, 106, -87, 42, -6, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new boolean[]{true, false, false, true, false, true, false, false, true, false, true};
   }

   private static void id_finally() {
      id_catch = new String[]{
         new String("autobuy"),
         new String("save"),
         new String("reload"),
         new String("save"),
         new String("reload"),
         new String("save"),
         new String("reload"),
         new String("Команда для работы с авто. покупкой"),
         new String("> %s%s save - сохраняет настройку предметов авто. покупки"),
         new String("> %s%s reload - перезагружает настройку предметов для авто. покупки")
      };
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(id_throws[6]);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[id_case[0]];
      String var10000 = id_catch[8];
      Object[] var10001 = new Object[2];
      var10001[id_throws[7]] = var2;
      var10001[1] = var1;
      var10000 = var10000.formatted(var10001);
      String var4 = id_catch[9];
      Object[] var10002 = new Object[2];
      var10002[id_throws[9]] = var2;
      var10002[1] = var1;
      return List.of(var10000, var4.formatted(var10002));
   }

   private static void id_extends() {
      id_case = new short[1];
   }

   @Override
   public String id_implements() {
      return id_catch[7];
   }

   private static void id_protected() {
      id_break = new byte[]{-1, 2, 2, 2};
   }
}
