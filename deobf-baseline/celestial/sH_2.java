package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sH_2 extends C_try {
   private static boolean[] id_break;
   private static String[] id_throws;
   private static byte[] id_case;
   private static short[] id_catch;

   public sH_2(C_case var1) {
      String[] var10002 = new String[id_break[0]];
      var10002[id_break[1]] = id_throws[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7944909622033105978L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(id_case[0]);
      int var3 = id_break[2];
      rU_2 var4 = null;
      if (var2.id_break(id_break[3])) {
         var3 = var2.id_catch(Integer.class);
      }

      if (var2.id_break(id_break[4])) {
         C_this[] var5 = var2.id_break((C_boolean)C_boolean.staticFields1efcd1a6ae203b428c7ab1f68db4b5b6[id_catch[0]]);
         C_this var6 = null;
         switch (var5.length) {
            case 0:
               throw new k_1(id_throws[1]);
            case 1:
               var6 = var5[id_break[5]];
               var4 = var6.id_class();
               break;
            default:
               throw new k_1(id_throws[2]);
         }
      }

      ((C_case)this.id_class[id_catch[1]]).id_throws().id_class(var3, var4);
      this.id_case(id_throws[3]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -64748905;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-118, -39, -80, 38, -88, 19, 57, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void id_throws() {
      id_case = new byte[]{2, 6, 2, 3, 4, 5};
   }

   private static void id_finally() {
      id_throws = new String[]{
         new String("farm"),
         new String("Не найдено ни одного вейпоинта"),
         new String("Найдено несколько вейпоинтов"),
         new String("Фармлюсь..."),
         new String("Фармит ближайший урожай"),
         new String("Команда \"farm\" начинает выращивать близлежащие растения. Она собирает зрелые культуры и сажает новые.."),
         new String(""),
         new String("Использование:"),
         new String("> farm - фармит весь урожай, который может найти."),
         new String("> farm <радиус> - фармит весь урожай в указанном радиусе."),
         new String("> farm <радиус> <вейпоинт> - фармит весь урожай в указанном радиусе от вейпоинта.")
      };
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[id_case[1]];
      var10000[id_break[6]] = id_throws[5];
      var10000[id_break[7]] = id_throws[6];
      var10000[id_case[2]] = id_throws[7];
      var10000[id_case[3]] = id_throws[8];
      var10000[id_case[4]] = id_throws[9];
      var10000[id_case[5]] = id_throws[10];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_break = new boolean[]{true, false, false, true, true, false, false, true, true};
   }

   @Override
   public boolean id_case() {
      return id_break[8];
   }

   @Override
   public String id_implements() {
      return id_throws[4];
   }

   private static void id_protected() {
      id_catch = new short[2];
   }
}
