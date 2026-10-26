package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmF_2 extends C_try {
   private static String[] id_break;
   private static short[] id_throws;
   private static boolean[] id_case;
   private static byte[] id_catch;

   public rrmF_2(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_case[1]] = id_break[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8827193524046009597L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1412327816;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();
      byte var6 = -1;
      switch (var3.hashCode()) {
         case -1335458389:
            if (var3.equals(id_break[3])) {
               var6 = 2;
            }
            break;
         case -934641255:
            if (var3.equals(id_break[6])) {
               var6 = 5;
            }
            break;
         case -934610812:
            if (var3.equals(id_break[2])) {
               var6 = 1;
            }
            break;
         case 96417:
            if (var3.equals(id_break[1])) {
               var6 = id_case[2];
            }
            break;
         case 3322014:
            if (var3.equals(id_break[5])) {
               var6 = 4;
            }
            break;
         case 94746189:
            if (var3.equals(id_break[4])) {
               var6 = 3;
            }
      }
      ((rruq_1)(switch (var6) {
         case 0 -> new rrmL_2();
         case 1, 2 -> new rrml_3();
         case 3 -> new rrmA_2();
         case 4 -> new rrmn_3(this);
         case 5 -> new rrmC_2();
         default -> throw new W(var2.id_throws(), id_break[7]);
      })).id_class(var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -45, -86, 48, 3, 78, 93, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         v_1 var10000 = new v_1();
         String[] var10001 = new String[5];
         var10001[id_case[4]] = id_break[8];
         var10001[1] = id_break[9];
         var10001[2] = id_break[10];
         var10001[3] = id_break[11];
         var10001[4] = id_break[12];
         return var10000.id_break(var10001).id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         return (var3.equalsIgnoreCase(id_break[13]) || var3.equalsIgnoreCase(id_break[14])) && var2.id_case()
            ? new v_1()
               .id_break(((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_throws[0]]).id_byte().stream())
               .id_class(var2.id_implements())
               .id_break()
               .id_protected()
            : Stream.empty();
      }
   }

   private static void id_throws() {
      id_break = new String[]{
         new String("staff"),
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
         new String("Команда для добавления уникального персонала"),
         new String("> %s%s add <имя> - добавить персонала"),
         new String("> %s%s remove/delete <имя> - удалить персонала"),
         new String("> %s%s clear - очистить список персонала"),
         new String("> %s%s list - посмотреть список персонала"),
         new String("> %s%s reload - обновить список персонала"),
         new String(""),
         new String("Пример: %s%s add Smertnix")
      };
   }

   private static void id_finally() {
      id_case = new boolean[]{true, false, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(id_case[6]);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[id_throws[1]];
      String var10000 = id_break[16];
      Object[] var10001 = new Object[2];
      var10001[id_case[7]] = var2;
      var10001[1] = var1;
      var10000 = var10000.formatted(var10001);
      String var4 = id_break[17];
      Object[] var10002 = new Object[2];
      var10002[id_case[9]] = var2;
      var10002[1] = var1;
      String var5 = var4.formatted(var10002);
      String var6 = id_break[18];
      Object[] var10003 = new Object[2];
      var10003[id_case[11]] = var2;
      var10003[1] = var1;
      String var7 = var6.formatted(var10003);
      String var8 = id_break[19];
      Object[] var10004 = new Object[2];
      var10004[id_case[13]] = var2;
      var10004[1] = var1;
      String var9 = var8.formatted(var10004);
      String var10 = id_break[20];
      Object[] var10005 = new Object[2];
      var10005[id_case[15]] = var2;
      var10005[1] = var1;
      String var11 = var10.formatted(var10005);
      String var12 = id_break[21];
      String var10006 = id_break[22];
      Object[] var10007 = new Object[2];
      var10007[id_case[17]] = var2;
      var10007[1] = var1;
      return List.of(var10000, var5, var7, var9, var11, var12, var10006.formatted(var10007));
   }

   private static void id_extends() {
      id_catch = new byte[]{-1, 2, 3, 4, 5, 5, 2, 3, 4, 2, 2, 2, 2, 2, 2};
   }

   @Override
   public String id_implements() {
      return id_break[15];
   }

   private static void id_protected() {
      id_throws = new short[2];
   }
}
