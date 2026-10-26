package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmX_2 extends C_try {
   private static boolean[] id_break;
   private static byte[] id_throws;
   private static String[] id_case;
   private static short[] id_catch;

   public rrmX_2(C_case var1) {
      String[] var10002 = new String[id_throws[0]];
      var10002[id_break[0]] = id_case[0];
      var10002[id_break[1]] = id_case[1];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();
      byte var6 = id_throws[1];
      switch (var3.hashCode()) {
         case -1335458389:
            if (var3.equals(id_case[4])) {
               var6 = id_throws[2];
            }
            break;
         case -934610812:
            if (var3.equals(id_case[3])) {
               var6 = id_break[3];
            }
            break;
         case 96417:
            if (var3.equals(id_case[2])) {
               var6 = id_break[2];
            }
            break;
         case 3322014:
            if (var3.equals(id_case[6])) {
               var6 = id_throws[4];
            }
            break;
         case 94746189:
            if (var3.equals(id_case[5])) {
               var6 = id_throws[3];
            }
      }
      ((rruq_1)(switch (var6) {
         case 0 -> new rrmJ_2();
         case 1, 2 -> new rrmk_3();
         case 3 -> new rrmx_3();
         case 4 -> new rrmd_3(this);
         default -> throw new W(var2.id_throws(), id_case[7]);
      })).id_class(var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1418360071;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3404341564998629113L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         v_1 var10000 = new v_1();
         String[] var10001 = new String[id_throws[5]];
         var10001[id_break[4]] = id_case[8];
         var10001[id_break[5]] = id_case[9];
         var10001[id_throws[6]] = id_case[10];
         var10001[id_throws[7]] = id_case[11];
         return var10000.id_break(var10001).id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         return !var3.equalsIgnoreCase(id_case[12]) && !var3.equalsIgnoreCase(id_case[13])
            ? Stream.empty()
            : new v_1()
               .id_break(((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_catch[0]]).id_byte().stream().map(rrvm_1::id_byte))
               .id_class(var2.id_implements())
               .id_break()
               .id_protected();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, 17, -120, 101, 108, -8, 108, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new byte[]{2, -1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2};
   }

   private static void id_finally() {
      id_break = new boolean[]{false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(id_break[6]);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[id_catch[1]];
      String var10000 = id_case[15];
      Object[] var10001 = new Object[id_throws[8]];
      var10001[id_break[7]] = var2;
      var10001[id_break[8]] = var1;
      var10000 = var10000.formatted(var10001);
      String var4 = id_case[16];
      Object[] var10002 = new Object[id_throws[9]];
      var10002[id_break[9]] = var2;
      var10002[id_break[10]] = var1;
      String var5 = var4.formatted(var10002);
      String var6 = id_case[17];
      Object[] var10003 = new Object[id_throws[10]];
      var10003[id_break[11]] = var2;
      var10003[id_break[12]] = var1;
      String var7 = var6.formatted(var10003);
      String var8 = id_case[18];
      Object[] var10004 = new Object[id_throws[11]];
      var10004[id_break[13]] = var2;
      var10004[id_break[14]] = var1;
      String var9 = var8.formatted(var10004);
      String var10 = id_case[19];
      String var10005 = id_case[20];
      Object[] var10006 = new Object[id_throws[12]];
      var10006[id_break[15]] = var2;
      var10006[id_break[16]] = var1;
      var10005 = var10005.formatted(var10006);
      String var12 = id_case[21];
      String var10007 = id_case[22];
      Object[] var10008 = new Object[id_throws[13]];
      var10008[id_break[17]] = var2;
      var10008[id_break[18]] = var1;
      return List.of(var10000, var5, var7, var9, var10, var10005, var12, var10007.formatted(var10008));
   }

   private static void id_extends() {
      id_catch = new short[2];
   }

   @Override
   public String id_implements() {
      return id_case[14];
   }

   private static void id_protected() {
      id_case = new String[]{
         new String("macro"),
         new String("macros"),
         new String("add"),
         new String("remove"),
         new String("delete"),
         new String("clear"),
         new String("list"),
         new String("add, remove, clear, list"),
         new String("add"),
         new String("remove"),
         new String("clear"),
         new String("list"),
         new String("remove"),
         new String("delete"),
         new String("Команда для добавления макросов"),
         new String("> %s%s add <имя> <команда> - добавить макрос"),
         new String("> %s%s remove/delete <имя> - удалить макрос"),
         new String("> %s%s clear - очистить список макросов"),
         new String("> %s%s list - посмотреть список макросов"),
         new String(""),
         new String("Пример: %s%s test /home home"),
         new String(""),
         new String("После ввода команды %s%s add, вам нужно будет нажать клавишу, на которую вы хотите привязать макрос")
      };
   }
}
