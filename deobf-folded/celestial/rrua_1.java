package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrua_1 extends C_try {
   private static byte[] id_break;
   private static boolean[] id_throws;
   private static short[] id_case;
   private static String[] id_catch;

   public rrua_1(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_throws[1]] = id_catch[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2070474338504659207L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();
      byte var6 = -1;
      switch (var3.hashCode()) {
         case 1333012765:
            if (var3.equals(id_catch[1])) {
               var6 = id_throws[2];
            }
         default:
            switch (var6) {
               case 0:
                  String var7 = var2.id_extends();
                  byte var9 = -1;
                  switch (var7.hashCode()) {
                     case -1335458389:
                        if (var7.equals(id_catch[4])) {
                           var9 = 2;
                        }
                        break;
                     case -934610812:
                        if (var7.equals(id_catch[3])) {
                           var9 = 1;
                        }
                        break;
                     case 96417:
                        if (var7.equals(id_catch[2])) {
                           var9 = id_throws[3];
                        }
                        break;
                     case 3322014:
                        if (var7.equals(id_catch[7])) {
                           var9 = 5;
                        }
                        break;
                     case 3387378:
                        if (var7.equals(id_catch[5])) {
                           var9 = 3;
                        }
                        break;
                     case 94746189:
                        if (var7.equals(id_catch[6])) {
                           var9 = 4;
                        }
                  }
                  ((rruq_1)(switch (var9) {
                     case 0 -> new rrui_1();
                     case 1, 2 -> new rrmS_2();
                     case 3 -> new rrmB_2(this);
                     case 4 -> new rrmr_3();
                     case 5 -> new rrmP_2(this);
                     default -> throw new W(var2.id_throws(), id_catch[8]);
                  })).id_class(var2);
                  return;
               default:
                  throw new W(var2.id_throws(), id_catch[9]);
            }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1944617046;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, -116, 120, 24, -29, 64, -43, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         v_1 var5 = new v_1();
         String[] var6 = new String[1];
         var6[id_throws[6]] = id_catch[10];
         return var5.id_break(var6).id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         if (var3.equalsIgnoreCase(id_catch[11])) {
            if (var2.id_native()) {
               v_1 var10000 = new v_1();
               String[] var10001 = new String[5];
               var10001[id_throws[7]] = id_catch[12];
               var10001[1] = id_catch[13];
               var10001[2] = id_catch[14];
               var10001[3] = id_catch[15];
               var10001[4] = id_catch[16];
               return var10000.id_break(var10001).id_class(var2.id_extends()).id_protected();
            }

            String var4 = var2.id_extends();
            if ((var4.equalsIgnoreCase(id_catch[17]) || var4.equalsIgnoreCase(id_catch[18]) || var4.equalsIgnoreCase(id_catch[19])) && var2.id_case()) {
               return new v_1()
                  .id_break(((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_case[0]]).id_break().stream().map(rryk_1::id_break))
                  .id_class(var2.id_implements())
                  .id_break()
                  .id_protected();
            }
         }

         return Stream.empty();
      }
   }

   private static void id_throws() {
      id_throws = new boolean[]{
         true, false, false, false, true, true, false, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true
      };
   }

   private static void id_finally() {
      id_case = new short[3];
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(id_throws[9]);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[id_case[2]];
      String var10000 = id_catch[20];
      Object[] var10001 = new Object[2];
      var10001[id_throws[10]] = var2;
      var10001[1] = var1;
      var10000 = var10000.formatted(var10001);
      String var4 = id_catch[21];
      Object[] var10002 = new Object[2];
      var10002[id_throws[12]] = var2;
      var10002[1] = var1;
      String var5 = var4.formatted(var10002);
      String var6 = id_catch[22];
      Object[] var10003 = new Object[2];
      var10003[id_throws[14]] = var2;
      var10003[1] = var1;
      String var7 = var6.formatted(var10003);
      String var8 = id_catch[23];
      Object[] var10004 = new Object[2];
      var10004[id_throws[16]] = var2;
      var10004[1] = var1;
      String var9 = var8.formatted(var10004);
      String var10 = id_catch[24];
      Object[] var10005 = new Object[2];
      var10005[id_throws[18]] = var2;
      var10005[1] = var1;
      String var11 = var10.formatted(var10005);
      String var12 = id_catch[25];
      String var10006 = id_catch[26];
      Object[] var10007 = new Object[2];
      var10007[id_throws[20]] = var2;
      var10007[1] = var1;
      return List.of(var10000, var5, var7, var9, var11, var12, var10006.formatted(var10007));
   }

   private static void id_extends() {
      id_catch = new String[]{
         new String("duel"),
         new String("blacklist"),
         new String("add"),
         new String("remove"),
         new String("delete"),
         new String("note"),
         new String("clear"),
         new String("list"),
         new String("add, remove, clear, list"),
         new String("blacklist"),
         new String("blacklist"),
         new String("blacklist"),
         new String("add"),
         new String("remove"),
         new String("note"),
         new String("clear"),
         new String("list"),
         new String("remove"),
         new String("delete"),
         new String("note"),
         new String("> %s%s blacklist add <имя> <заметка> - добавить игрока в чёрный список"),
         new String("> %s%s blacklist remove/delete <имя> - удалить игрока из чёрного списка"),
         new String("> %s%s blacklist note <имя> - посмотреть заметку игрока в чёрном списке"),
         new String("> %s%s blacklist clear - очистить чёрный список"),
         new String("> %s%s blacklist list - посмотреть чёрный список"),
         new String(""),
         new String("Пример: %s%s blacklist add Smertnix Слишком сильный ;(")
      };
   }

   @Override
   public String id_implements() {
      return "Команда для управления функцией \""
         + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[1]]).id_private().id_implements().id_final()
         + "\"";
   }

   private static void id_protected() {
      id_break = new byte[]{-1, -1, 2, 3, 4, 5, 5, 2, 3, 4, 2, 2, 2, 2, 2, 2};
   }
}
