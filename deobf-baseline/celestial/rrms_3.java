package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrms_3 extends C_try {
   private static String[] id_break;
   private static short[] id_throws;
   private static boolean[] id_case;
   private static byte[] id_catch;

   public rrms_3(C_case var1) {
      String[] var10002 = new String[id_catch[0]];
      var10002[id_case[0]] = id_break[0];
      var10002[id_case[1]] = id_break[1];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -530749665;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();
      byte var6 = id_catch[1];
      switch (var3.hashCode()) {
         case -1335458389:
            if (var3.equals(id_break[4])) {
               var6 = id_catch[2];
            }
            break;
         case -934610812:
            if (var3.equals(id_break[3])) {
               var6 = id_case[3];
            }
            break;
         case 96417:
            if (var3.equals(id_break[2])) {
               var6 = id_case[2];
            }
            break;
         case 3322014:
            if (var3.equals(id_break[6])) {
               var6 = id_catch[4];
            }
            break;
         case 94746189:
            if (var3.equals(id_break[5])) {
               var6 = id_catch[3];
            }
      }
      ((rruq_1)(switch (var6) {
         case 0 -> new rrmE_2();
         case 1, 2 -> new rrmM_2();
         case 3 -> new rrmG_2();
         case 4 -> new rrmb_3(this);
         default -> throw new W(var2.id_throws(), id_break[7]);
      })).id_class(var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6246975200740797459L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         v_1 var10000 = new v_1();
         String[] var10001 = new String[id_catch[5]];
         var10001[id_case[4]] = id_break[8];
         var10001[id_case[5]] = id_break[9];
         var10001[id_catch[6]] = id_break[10];
         var10001[id_catch[7]] = id_break[11];
         return var10000.id_break(var10001).id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         return (var3.equalsIgnoreCase(id_break[12]) || var3.equalsIgnoreCase(id_break[13])) && var2.id_case()
            ? new v_1()
               .id_break(((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_throws[0]]).id_class().values().stream().map(rrZk_1::id_class))
               .id_class(var2.id_implements())
               .id_break()
               .id_protected()
            : Stream.empty();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, -11, -65, 44, 32, 68, -36, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new short[2];
   }

   private static void id_finally() {
      id_case = new boolean[]{false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(id_case[6]);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[id_throws[1]];
      String var10000 = id_break[15];
      Object[] var10001 = new Object[id_catch[8]];
      var10001[id_case[7]] = var2;
      var10001[id_case[8]] = var1;
      var10000 = var10000.formatted(var10001);
      String var4 = id_break[16];
      Object[] var10002 = new Object[id_catch[9]];
      var10002[id_case[9]] = var2;
      var10002[id_case[10]] = var1;
      String var5 = var4.formatted(var10002);
      String var6 = id_break[17];
      Object[] var10003 = new Object[id_catch[10]];
      var10003[id_case[11]] = var2;
      var10003[id_case[12]] = var1;
      String var7 = var6.formatted(var10003);
      String var8 = id_break[18];
      Object[] var10004 = new Object[id_catch[11]];
      var10004[id_case[13]] = var2;
      var10004[id_case[14]] = var1;
      String var9 = var8.formatted(var10004);
      String var10 = id_break[19];
      String var10005 = id_break[20];
      Object[] var10006 = new Object[id_catch[12]];
      var10006[id_case[15]] = var2;
      var10006[id_case[16]] = var1;
      return List.of(var10000, var5, var7, var9, var10, var10005.formatted(var10006));
   }

   private static void id_extends() {
      id_catch = new byte[]{2, -1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2};
   }

   @Override
   public String id_implements() {
      return id_break[14];
   }

   private static void id_protected() {
      id_break = new String[]{
         new String("friend"),
         new String("friends"),
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
         new String("Команда для добавления друзей"),
         new String("> %s%s add <имя> - добавить друга"),
         new String("> %s%s remove/delete <имя> - удалить друга"),
         new String("> %s%s clear - очистить список друзей"),
         new String("> %s%s list - посмотреть список друзей"),
         new String(""),
         new String("Пример: %s%s add Smertnix")
      };
   }
}
