package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmf_3 extends C_try {
   private static short[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_case;
   private static String[] id_catch;

   public rrmf_3(C_case var1) {
      String[] var10002 = new String[id_case[0]];
      var10002[id_throws[0]] = id_catch[0];
      var10002[id_throws[1]] = id_catch[1];
      var10002[id_case[1]] = id_catch[2];
      var10002[id_case[2]] = id_catch[3];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4205368710298853079L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();
      byte var6 = id_case[3];
      switch (var3.hashCode()) {
         case -1335458389:
            if (var3.equals(id_catch[6])) {
               var6 = id_case[4];
            }
            break;
         case -934610812:
            if (var3.equals(id_catch[5])) {
               var6 = id_throws[3];
            }
            break;
         case 96417:
            if (var3.equals(id_catch[4])) {
               var6 = id_throws[2];
            }
            break;
         case 3322014:
            if (var3.equals(id_catch[8])) {
               var6 = id_case[6];
            }
            break;
         case 94746189:
            if (var3.equals(id_catch[7])) {
               var6 = id_case[5];
            }
      }
      ((rruq_1)(switch (var6) {
         case 0 -> new rrmj_3();
         case 1, 2 -> new rrmR_2();
         case 3 -> new rrmV_2();
         case 4 -> new rrmg_3(this);
         default -> throw new W(var2.id_throws(), id_catch[9]);
      })).id_class(var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -301820135;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, -88, -73, -2, -32, 46, -37, -119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         v_1 var10000 = new v_1();
         String[] var10001 = new String[id_case[7]];
         var10001[id_throws[4]] = id_catch[10];
         var10001[id_throws[5]] = id_catch[11];
         var10001[id_case[8]] = id_catch[12];
         var10001[id_case[9]] = id_catch[13];
         return var10000.id_break(var10001).id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         if (var3.equalsIgnoreCase(id_catch[14]) && var2.id_break(id_case[10])) {
            var2.id_throws();
            return var2.id_class((h_1)h_1.staticFieldse900d351c8b53997a0ceaa72eeab0b7d[id_break[0]]);
         } else {
            return (var3.equalsIgnoreCase(id_catch[15]) || var3.equalsIgnoreCase(id_catch[16])) && var2.id_case()
               ? new v_1()
                  .id_break(((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_break[1]]).id_byte().stream().map(rrjD_2::id_byte))
                  .id_class(var2.id_implements())
                  .id_break()
                  .id_protected()
               : Stream.empty();
         }
      }
   }

   private static void id_throws() {
      id_case = new byte[]{4, 2, 3, -1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2};
   }

   private static void id_finally() {
      id_throws = new boolean[]{
         false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true, false, true
      };
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(id_throws[6]);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[id_break[2]];
      String var10000 = id_catch[18];
      Object[] var10001 = new Object[id_case[11]];
      var10001[id_throws[7]] = var2;
      var10001[id_throws[8]] = var1;
      var10000 = var10000.formatted(var10001);
      String var4 = id_catch[19];
      Object[] var10002 = new Object[id_case[12]];
      var10002[id_throws[9]] = var2;
      var10002[id_throws[10]] = var1;
      String var5 = var4.formatted(var10002);
      String var6 = id_catch[20];
      Object[] var10003 = new Object[id_case[13]];
      var10003[id_throws[11]] = var2;
      var10003[id_throws[12]] = var1;
      String var7 = var6.formatted(var10003);
      String var8 = id_catch[21];
      Object[] var10004 = new Object[id_case[14]];
      var10004[id_throws[13]] = var2;
      var10004[id_throws[14]] = var1;
      String var9 = var8.formatted(var10004);
      String var10 = id_catch[22];
      Object[] var10005 = new Object[id_case[15]];
      var10005[id_throws[15]] = var2;
      var10005[id_throws[16]] = var1;
      String var11 = var10.formatted(var10005);
      String var12 = id_catch[23];
      Object[] var10006 = new Object[id_case[16]];
      var10006[id_throws[17]] = var2;
      var10006[id_throws[18]] = var1;
      String var13 = var12.formatted(var10006);
      String var14 = id_catch[24];
      String var10007 = id_catch[25];
      Object[] var10008 = new Object[id_case[17]];
      var10008[id_throws[19]] = var2;
      var10008[id_throws[20]] = var1;
      return List.of(var10000, var5, var7, var9, var11, var13, var14, var10007.formatted(var10008));
   }

   private static void id_extends() {
      id_catch = new String[]{
         new String("way"),
         new String("waypoint"),
         new String("waypoints"),
         new String("gps"),
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
         new String("Команда для добавления путей"),
         new String("> %s%s add <имя> - добавить вейпоинт на вашу позицию"),
         new String("> %s%s add <имя> <x y z> - добавить вейпоинт на указанную позицию"),
         new String("> %s%s add <x y z> - добавить вейпоинт на указанную позицию без имени"),
         new String("> %s%s remove <имя> - удалить вейпоинт"),
         new String("> %s%s clear - удалить все вейпоинты"),
         new String("> %s%s list - посмотреть список вейпоинтов"),
         new String(""),
         new String("Пример: %s%s add home 1000 70 -1000")
      };
   }

   @Override
   public String id_implements() {
      return id_catch[17];
   }

   private static void id_protected() {
      id_break = new short[3];
   }
}
