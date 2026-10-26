package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EO extends C_try {
   private static byte[] id_break;
   private static short[] id_throws;
   private static boolean[] id_case;
   private static String[] id_catch;

   public EO(C_case var1) {
      super(var1, "tunnel");
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(3);
      if (var2.id_case(3)) {
         boolean var3 = true;
         int var4 = Integer.parseInt(var2.id_byte().get(0).id_break());
         int var5 = Integer.parseInt(var2.id_byte().get(1).id_break());
         int var6 = Integer.parseInt(var2.id_byte().get(2).id_break());
         if (var5 < 1 || var4 < 2 || var6 < 1 || var4 > 255) {
            this.id_case("Ширина и глубина должны быть не менее 1 блока; высота должна быть не менее 2 блоков и не может превышать предела строительства.");
            var3 = false;
         }

         if (var3) {
            var4--;
            var5--;
            rpr_3 var9 = ((Ps_1)this.id_class[1]).id_catch().Pg();
            byte var10 = var5 % 2 == 0 ? 0 : id_case[9];
            rfH_2 var7;
            rfH_2 var8;
            switch (((int[])Eh_1.id_class[0])[var9.ordinal()]) {
               case 1:
                  var7 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[0],
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[1],
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[2] - var5 / 2
                  );
                  var8 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[0] + var6,
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[1] + var4,
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[2] + var5 / 2 + var10
                  );
                  break;
               case 2:
                  var7 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[0],
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[1],
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[2] + var5 / 2 + var10
                  );
                  var8 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[0] - var6,
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[1] + var4,
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[2] - var5 / 2
                  );
                  break;
               case 3:
                  var7 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[0] - var5 / 2,
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[1],
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[2]
                  );
                  var8 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[0] + var5 / 2 + var10,
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[1] + var4,
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[2] - var6
                  );
                  break;
               case 4:
                  var7 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[0] + var5 / 2 + var10,
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[1],
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[2]
                  );
                  var8 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[0] - var5 / 2,
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[1] + var4,
                     (Integer)((Ps_1)this.id_class[1]).id_volatile().id_break[2] + var6
                  );
                  break;
               default:
                  throw new IllegalStateException("Unexpected value: " + var9);
            }

            this.id_case(String.format("Создание туннеля высотой %s блока(ов), шириной %s блока(ов) и глубиной %s блока(ов)", var4 + 1, var5 + 1, var6));
            ((C_case)this.id_class[0]).r().id_class(var7, var8);
         }
      } else {
         rO_2 var11 = new rO_2(((Ps_1)this.id_class[1]).id_volatile(), ((Ps_1)this.id_class[1]).id_catch().Pg());
         ((C_case)this.id_class[0]).id_import().id_break(var11);
         this.id_case(String.format("Goal: %s", var11));
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -358120636;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3824929110561730950L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-46, 23, -79, -53, -40, -76, -42, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_case = new boolean[]{true, false, true, false, true, true, true, false, false, true, false, true, true, true, true, false, false, true, true};
   }

   private static void id_finally() {
      id_break = new byte[]{3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 2, 5, 2, 3, 4};
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList(
         "Команда \"tunnel\" копает туннель в вашем направлении",
         "",
         "Usage:",
         "> tunnel - Без аргументов, копаемся в радиусе 1х2.",
         "> tunnel <height> <width> <depth> - Туннели заданной вами высоты, ширины и глубины."
      );
   }

   private static void id_extends() {
      id_throws = new short[]{
         255,
         1,
         0,
         1,
         0,
         1,
         1,
         1,
         2,
         1,
         0,
         1,
         1,
         1,
         2,
         1,
         0,
         1,
         1,
         1,
         2,
         1,
         0,
         1,
         1,
         1,
         2,
         1,
         0,
         1,
         1,
         1,
         2,
         1,
         0,
         1,
         1,
         1,
         2,
         1,
         0,
         1,
         1,
         1,
         2,
         1,
         0,
         1,
         1,
         1,
         2,
         0,
         1,
         1,
         0
      };
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return "Копает туннель в вашем направлении.";
   }

   private static void id_protected() {
      id_catch = new String[]{
         new String("tunnel"),
         new String("Ширина и глубина должны быть не менее 1 блока; высота должна быть не менее 2 блоков и не может превышать предела строительства."),
         new String("Создание туннеля высотой %s блока(ов), шириной %s блока(ов) и глубиной %s блока(ов)"),
         new String("Goal: %s"),
         new String("Копает туннель в вашем направлении."),
         new String("Команда \"tunnel\" копает туннель в вашем направлении"),
         new String(""),
         new String("Usage:"),
         new String("> tunnel - Без аргументов, копаемся в радиусе 1х2."),
         new String("> tunnel <height> <width> <depth> - Туннели заданной вами высоты, ширины и глубины.")
      };
   }
}
