package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sp_3 extends C_try {
   private static short[] id_break;
   private static byte[] id_throws;
   private static String[] id_case;
   private static boolean[] id_catch;

   public sp_3(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_catch[1]] = id_case[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1375122442;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5368074698062264005L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_private(1);
      ArrayList var5 = new ArrayList();
      ArrayList var6 = new ArrayList();
      sq_3 var3;
      if (var2.id_case()) {
         ((C_case)this.id_class[id_break[0]])
            .id_public()
            .id_break((Predicate<an_3>)(var3 = var2.id_implements(sq_3.class)).fields7c97b86bc96f32548c9e3133b384faa8[id_break[1]]);
      } else {
         var2.id_private(2);
         var3 = null;
         sT_2 var4 = var2.id_implements(sT_2.class);

         while (var2.id_final()) {
            Object var7 = var2.id_break((C_double)var4.fieldsd035b37d0ef43a14a807173dd90a9560[id_break[2]]);
            if (var7 instanceof aI_2) {
               var6.add((aI_2)var7);
            } else if (var7 != null) {
               var5.add((an_3)var7);
            }
         }

         ((C_case)this.id_class[id_break[3]])
            .id_public()
            .id_break(var6.isEmpty() ? var5::contains : var1x -> var6.stream().anyMatch(var1xx -> var1x.BC().equals(var1xx)));
      }

      if (var3 != null) {
         String var10001 = id_case[1];
         Object[] var10002 = new Object[1];
         var10002[id_catch[4]] = var3.name().toLowerCase(Locale.US);
         this.id_case(String.format(var10001, var10002));
      } else if (var6.isEmpty()) {
         if (var5.isEmpty()) {
            throw new st_3();
         }

         this.id_case(id_case[2]);
         var5.stream().map(an_3::toString).forEach(this::id_case);
      } else {
         this.id_case(id_case[3]);
         var6.stream().map(rVL.id_transient::id_break).map(Objects::requireNonNull).map(rqO_2::toString).forEach(this::id_case);
      }
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         return new v_1().id_break(sq_3.class).id_break(sT_2.class).id_class(var2.id_extends()).id_protected();
      } else {
         C_double var3;
         try {
            var3 = (C_double)var2.id_implements(sT_2.class).fieldsd035b37d0ef43a14a807173dd90a9560[id_break[4]];
         } catch (NullPointerException var5) {
            return Stream.empty();
         }

         while (var2.id_break(2)) {
            if (var2.id_byte(var3) == null) {
               return Stream.empty();
            }

            var2.id_throws();
         }

         return var2.id_class(var3);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, -78, -69, -108, -87, 75, -10, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_catch = new boolean[]{true, false, true, true, false, false, true, true};
   }

   private static void id_finally() {
      id_case = new String[]{
         new String("follow"),
         new String("Преследуем всех %s"),
         new String("Преследуем этих существ:"),
         new String("Приследуем этот тип существ:"),
         new String("Преследовать какое либо существо"),
         new String("Команда \"follow\" указывает Baritone следовать за определенными существами."),
         new String(""),
         new String("Использвание:"),
         new String("> follow entities - приследует всех сущевств."),
         new String("> follow entity <entity1> <entity2> <...> - Следовать определенным сущностям (например, \"скелет\", \"лошадь\" и т.д.)"),
         new String("> follow players - прислудет игроков"),
         new String("> follow player <username1> <username2> <...> - приследует опредленных игроков")
      };
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[7];
      var10000[id_catch[5]] = id_case[5];
      var10000[1] = id_case[6];
      var10000[2] = id_case[7];
      var10000[3] = id_case[8];
      var10000[4] = id_case[9];
      var10000[5] = id_case[10];
      var10000[6] = id_case[11];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_throws = new byte[]{2, 2, 7, 2, 3, 4, 5, 6};
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return id_case[4];
   }

   private static void id_protected() {
      id_break = new short[5];
   }
}
