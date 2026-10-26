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
      String[] var10002 = new String[id_case[0]];
      var10002[id_case[1]] = id_catch[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(id_break[0]);
      if (var2.id_case(id_break[1])) {
         boolean var3 = id_case[2];
         int var4 = Integer.parseInt(var2.id_byte().get(id_case[3]).id_break());
         int var5 = Integer.parseInt(var2.id_byte().get(id_case[4]).id_break());
         int var6 = Integer.parseInt(var2.id_byte().get(id_break[2]).id_break());
         if (var5 < id_case[5] || var4 < id_break[3] || var6 < id_case[6] || var4 > id_throws[0]) {
            this.id_case(id_catch[1]);
            var3 = id_case[7];
         }

         if (var3) {
            var4--;
            var5--;
            rpr_3 var9 = ((Ps_1)this.id_class[id_throws[1]]).id_catch().Pg();
            byte var10 = var5 % id_break[4] == 0 ? id_case[8] : id_case[9];
            rfH_2 var7;
            rfH_2 var8;
            switch (((int[])Eh_1.id_class[id_throws[2]])[var9.ordinal()]) {
               case 1:
                  var7 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[id_throws[3]]).id_volatile().id_break[id_throws[4]],
                     (Integer)((Ps_1)this.id_class[id_throws[5]]).id_volatile().id_break[id_throws[6]],
                     (Integer)((Ps_1)this.id_class[id_throws[7]]).id_volatile().id_break[id_throws[8]] - var5 / id_break[5]
                  );
                  var8 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[id_throws[9]]).id_volatile().id_break[id_throws[10]] + var6,
                     (Integer)((Ps_1)this.id_class[id_throws[11]]).id_volatile().id_break[id_throws[12]] + var4,
                     (Integer)((Ps_1)this.id_class[id_throws[13]]).id_volatile().id_break[id_throws[14]] + var5 / id_break[6] + var10
                  );
                  break;
               case 2:
                  var7 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[id_throws[15]]).id_volatile().id_break[id_throws[16]],
                     (Integer)((Ps_1)this.id_class[id_throws[17]]).id_volatile().id_break[id_throws[18]],
                     (Integer)((Ps_1)this.id_class[id_throws[19]]).id_volatile().id_break[id_throws[20]] + var5 / id_break[7] + var10
                  );
                  var8 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[id_throws[21]]).id_volatile().id_break[id_throws[22]] - var6,
                     (Integer)((Ps_1)this.id_class[id_throws[23]]).id_volatile().id_break[id_throws[24]] + var4,
                     (Integer)((Ps_1)this.id_class[id_throws[25]]).id_volatile().id_break[id_throws[26]] - var5 / id_break[8]
                  );
                  break;
               case 3:
                  var7 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[id_throws[27]]).id_volatile().id_break[id_throws[28]] - var5 / id_break[9],
                     (Integer)((Ps_1)this.id_class[id_throws[29]]).id_volatile().id_break[id_throws[30]],
                     (Integer)((Ps_1)this.id_class[id_throws[31]]).id_volatile().id_break[id_throws[32]]
                  );
                  var8 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[id_throws[33]]).id_volatile().id_break[id_throws[34]] + var5 / id_break[10] + var10,
                     (Integer)((Ps_1)this.id_class[id_throws[35]]).id_volatile().id_break[id_throws[36]] + var4,
                     (Integer)((Ps_1)this.id_class[id_throws[37]]).id_volatile().id_break[id_throws[38]] - var6
                  );
                  break;
               case 4:
                  var7 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[id_throws[39]]).id_volatile().id_break[id_throws[40]] + var5 / id_break[11] + var10,
                     (Integer)((Ps_1)this.id_class[id_throws[41]]).id_volatile().id_break[id_throws[42]],
                     (Integer)((Ps_1)this.id_class[id_throws[43]]).id_volatile().id_break[id_throws[44]]
                  );
                  var8 = new rfH_2(
                     (Integer)((Ps_1)this.id_class[id_throws[45]]).id_volatile().id_break[id_throws[46]] - var5 / id_break[12],
                     (Integer)((Ps_1)this.id_class[id_throws[47]]).id_volatile().id_break[id_throws[48]] + var4,
                     (Integer)((Ps_1)this.id_class[id_throws[49]]).id_volatile().id_break[id_throws[50]] + var6
                  );
                  break;
               default:
                  throw new IllegalStateException("Unexpected value: " + var9);
            }

            String var10001 = id_catch[2];
            Object[] var10002 = new Object[id_break[13]];
            var10002[id_case[10]] = var4 + id_case[11];
            var10002[id_case[12]] = var5 + id_case[13];
            var10002[id_break[14]] = var6;
            this.id_case(String.format(var10001, var10002));
            ((C_case)this.id_class[id_throws[51]]).r().id_class(var7, var8);
         }
      } else {
         rO_2 var11 = new rO_2(((Ps_1)this.id_class[id_throws[52]]).id_volatile(), ((Ps_1)this.id_class[id_throws[53]]).id_catch().Pg());
         ((C_case)this.id_class[id_throws[54]]).id_import().id_break(var11);
         String var14 = id_catch[3];
         Object[] var15 = new Object[id_case[14]];
         var15[id_case[15]] = var11;
         this.id_case(String.format(var14, var15));
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
      String[] var10000 = new String[id_break[15]];
      var10000[id_case[16]] = id_catch[5];
      var10000[id_case[17]] = id_catch[6];
      var10000[id_break[16]] = id_catch[7];
      var10000[id_break[17]] = id_catch[8];
      var10000[id_break[18]] = id_catch[9];
      return Arrays.asList(var10000);
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
      return id_case[18];
   }

   @Override
   public String id_implements() {
      return id_catch[4];
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
