package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrug_1 extends C_try {
   private static boolean[] id_break;
   private static short[] id_throws;
   private static String[] id_case;
   private static byte[] id_catch;

   public rrug_1(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_break[1]] = id_case[0];
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
            if (var3.equals(id_case[3])) {
               var6 = 2;
            }
            break;
         case -934610812:
            if (var3.equals(id_case[2])) {
               var6 = 1;
            }
            break;
         case 96417:
            if (var3.equals(id_case[1])) {
               var6 = id_break[2];
            }
            break;
         case 3322014:
            if (var3.equals(id_case[5])) {
               var6 = 4;
            }
            break;
         case 94746189:
            if (var3.equals(id_case[4])) {
               var6 = 3;
            }
      }
      ((rruq_1)(switch (var6) {
         case 0 -> new rruR();
         case 1, 2 -> new rrue_1();
         case 3 -> new rruo_1();
         case 4 -> new rruU(this);
         default -> throw new W(var2.id_throws(), id_case[6]);
      })).id_class(var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6728146266041747726L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1451788778;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -102, 96, 58, 93, -38, 14, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         v_1 var10000 = new v_1();
         String[] var10001 = new String[4];
         var10001[id_break[4]] = id_case[7];
         var10001[1] = id_case[8];
         var10001[2] = id_case[9];
         var10001[3] = id_case[10];
         return var10000.id_break(var10001).id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         if (var3.equalsIgnoreCase(id_case[11])) {
            if (var2.id_case()) {
               return var2.id_class((rruY)rruY.staticFieldsa8884e3b339234dd911c10ea97845ed5[id_throws[0]]);
            }

            if (var2.id_case(2)) {
               var2.id_throws();
               if (var2.id_case()) {
                  return var2.id_class((rruD)rruD.staticFieldsba29985e322c382da8479b6f59b746b0[id_throws[1]]);
               }
            }
         } else if ((var3.equalsIgnoreCase(id_case[12]) || var3.equalsIgnoreCase(id_case[13])) && var2.id_case()) {
            return new v_1()
               .id_break(((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[id_throws[2]]).id_byte().stream().map(rrqU_2::id_byte))
               .id_break()
               .id_class(var2.id_extends())
               .id_protected();
         }

         return Stream.empty();
      }
   }

   private static void id_throws() {
      id_case = new String[]{
         new String("blockesp"),
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
         new String("add"),
         new String("remove"),
         new String("delete"),
         new String("> %s%s add <имя> <цвет> - добавить блок в список"),
         new String("> %s%s remove <имя> - удалить блок из списка"),
         new String("> %s%s clear - очистить список блоков"),
         new String("> %s%s list - просмотреть список блоков"),
         new String(""),
         new String("Пример: %s%s add diamond_ore cyan")
      };
   }

   private static void id_finally() {
      id_catch = new byte[]{-1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(id_break[6]);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[id_throws[4]];
      String var10000 = id_case[14];
      Object[] var10001 = new Object[2];
      var10001[id_break[7]] = var2;
      var10001[1] = var1;
      var10000 = var10000.formatted(var10001);
      String var4 = id_case[15];
      Object[] var10002 = new Object[2];
      var10002[id_break[9]] = var2;
      var10002[1] = var1;
      String var5 = var4.formatted(var10002);
      String var6 = id_case[16];
      Object[] var10003 = new Object[2];
      var10003[id_break[11]] = var2;
      var10003[1] = var1;
      String var7 = var6.formatted(var10003);
      String var8 = id_case[17];
      Object[] var10004 = new Object[2];
      var10004[id_break[13]] = var2;
      var10004[1] = var1;
      String var9 = var8.formatted(var10004);
      String var10 = id_case[18];
      String var10005 = id_case[19];
      Object[] var10006 = new Object[2];
      var10006[id_break[15]] = var2;
      var10006[1] = var1;
      return List.of(var10000, var5, var7, var9, var10, var10005.formatted(var10006));
   }

   private static void id_extends() {
      id_throws = new short[5];
   }

   @Override
   public String id_implements() {
      return "Команда для добавления кастомных блоков в \""
         + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[3]]).id_private().J().id_final()
         + "\"";
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true};
   }
}
