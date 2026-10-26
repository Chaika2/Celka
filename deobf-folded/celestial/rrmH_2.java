package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmH_2 extends C_try {
   private static byte[] id_break;
   private static String[] id_throws;
   private static short[] id_case;
   private static boolean[] id_catch;

   public rrmH_2(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_catch[1]] = id_throws[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();
      byte var6 = -1;
      switch (var3.hashCode()) {
         case -1335458389:
            if (var3.equals(id_throws[3])) {
               var6 = 2;
            }
            break;
         case -934641255:
            if (var3.equals(id_throws[6])) {
               var6 = 5;
            }
            break;
         case -934610812:
            if (var3.equals(id_throws[2])) {
               var6 = 1;
            }
            break;
         case 96417:
            if (var3.equals(id_throws[1])) {
               var6 = id_catch[2];
            }
            break;
         case 3322014:
            if (var3.equals(id_throws[5])) {
               var6 = 4;
            }
            break;
         case 94746189:
            if (var3.equals(id_throws[4])) {
               var6 = 3;
            }
      }
      ((rruq_1)(switch (var6) {
         case 0 -> new rrmy_3();
         case 1, 2 -> new rrmt_3();
         case 3 -> new rrmp_3();
         case 4 -> new rrmq_3(this);
         case 5 -> new rrmT_2();
         default -> throw new W(var2.id_throws(), id_throws[7]);
      })).id_class(var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1567521990;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1860417350045007539L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         v_1 var10000 = new v_1();
         String[] var10001 = new String[5];
         var10001[id_catch[4]] = id_throws[8];
         var10001[1] = id_throws[9];
         var10001[2] = id_throws[10];
         var10001[3] = id_throws[11];
         var10001[4] = id_throws[12];
         return var10000.id_break(var10001).id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         return (var3.equalsIgnoreCase(id_throws[13]) || var3.equalsIgnoreCase(id_throws[14])) && var2.id_case()
            ? new v_1()
               .id_break(((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_case[0]]).id_class().stream())
               .id_class(var2.id_implements())
               .id_break()
               .id_protected()
            : Stream.empty();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-57, -121, -98, 127, 26, -38, 70, -45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_case = new short[2];
   }

   private static void id_finally() {
      id_throws = new String[]{
         new String("staffprefix"),
         new String("add"),
         new String("remove"),
         new String("delete"),
         new String("clear"),
         new String("list"),
         new String("reload"),
         new String("add, remove, clear, list, reload"),
         new String("add"),
         new String("remove"),
         new String("clear"),
         new String("list"),
         new String("reload"),
         new String("remove"),
         new String("delete"),
         new String("Команда для добавления уникальных префиксов персонала"),
         new String("> %s%s add <имя> - добавить префикс"),
         new String("> %s%s remove/delete <имя> - удалить префикс"),
         new String("> %s%s clear - очистить список префиксов"),
         new String("> %s%s list - посмотреть список префиксов"),
         new String("> %s%s reload - обновить список префиксов"),
         new String(""),
         new String("Пример: %s%s add Гл. Админ")
      };
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(id_catch[6]);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[id_case[1]];
      String var10000 = id_throws[16];
      Object[] var10001 = new Object[2];
      var10001[id_catch[7]] = var2;
      var10001[1] = var1;
      var10000 = var10000.formatted(var10001);
      String var4 = id_throws[17];
      Object[] var10002 = new Object[2];
      var10002[id_catch[9]] = var2;
      var10002[1] = var1;
      String var5 = var4.formatted(var10002);
      String var6 = id_throws[18];
      Object[] var10003 = new Object[2];
      var10003[id_catch[11]] = var2;
      var10003[1] = var1;
      String var7 = var6.formatted(var10003);
      String var8 = id_throws[19];
      Object[] var10004 = new Object[2];
      var10004[id_catch[13]] = var2;
      var10004[1] = var1;
      String var9 = var8.formatted(var10004);
      String var10 = id_throws[20];
      Object[] var10005 = new Object[2];
      var10005[id_catch[15]] = var2;
      var10005[1] = var1;
      String var11 = var10.formatted(var10005);
      String var12 = id_throws[21];
      String var10006 = id_throws[22];
      Object[] var10007 = new Object[2];
      var10007[id_catch[17]] = var2;
      var10007[1] = var1;
      return List.of(var10000, var5, var7, var9, var11, var12, var10006.formatted(var10007));
   }

   private static void id_extends() {
      id_catch = new boolean[]{true, false, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true};
   }

   @Override
   public String id_implements() {
      return id_throws[15];
   }

   private static void id_protected() {
      id_break = new byte[]{-1, 2, 3, 4, 5, 5, 2, 3, 4, 2, 2, 2, 2, 2, 2};
   }
}
