package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrvP {
   public static Object[] staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5;
   private static String[] stringsf01ecca4eb60322eb4dd34fd4e806aa5;
   public Object[] fieldsf01ecca4eb60322eb4dd34fd4e806aa5;
   private static byte[] bytesf01ecca4eb60322eb4dd34fd4e806aa5;
   private static short[] shortsf01ecca4eb60322eb4dd34fd4e806aa5;
   private static int[] integersf01ecca4eb60322eb4dd34fd4e806aa5;
   private static boolean[] booleansf01ecca4eb60322eb4dd34fd4e806aa5;

   public String id_byte() {
      return (String)this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[6]];
   }

   private rrvP(String var3, int var4, int var5) {
      this.id_protected();
      this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[1]] = var3;
      Integer var11 = ColorHelper.id_break(var4, shortsf01ecca4eb60322eb4dd34fd4e806aa5[2]);
      this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[3]] = var11;
      Integer var12 = ColorHelper.id_break(var5, shortsf01ecca4eb60322eb4dd34fd4e806aa5[4]);
      this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[5]] = var12;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -156539689;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-41, 73, 5, -75, 63, -41, -4, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_class() {
      return (Integer)this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[7]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4589842105545834503L;
   }

   public int id_break() {
      return (Integer)this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[8]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[1], 5518335, 65535),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[3], 16515327, 56286),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[5], 13148872, 12139407),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[7], 704444, 16528716),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[9], 39415, 15800082),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[11], 12793700, 1910385),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[13], 2899536, 16610412),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[15], 9323501, 15789195),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[17], 16736109, 16761713),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[19], 5518335, 10878667),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[21], 8609987, 3063697),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[23], 16729344, 16753920),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[25], 16048856, 12211056),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[27], 10025880, 25600),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[29], 16758465, 16716947),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[31], 4511656, 25666),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[33], 65535, 13107),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[35], 14011626, 4792186),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[37], 4282576, 1381653),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[39], 16729344, 1969664),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[41], 11730971, 985103),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[43], 9175066, 16734003),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[45], 16752762, 16729344),
         new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[47], 16765184, 2105376),
         null
      };
      var0[24] = new rrvP[]{
         (rrvP)var0[0],
         (rrvP)var0[1],
         (rrvP)var0[2],
         (rrvP)var0[3],
         (rrvP)var0[4],
         (rrvP)var0[5],
         (rrvP)var0[6],
         (rrvP)var0[7],
         (rrvP)var0[8],
         (rrvP)var0[9],
         (rrvP)var0[10],
         (rrvP)var0[11],
         (rrvP)var0[12],
         (rrvP)var0[13],
         (rrvP)var0[14],
         (rrvP)var0[15],
         (rrvP)var0[16],
         (rrvP)var0[17],
         (rrvP)var0[18],
         (rrvP)var0[19],
         (rrvP)var0[20],
         (rrvP)var0[21],
         (rrvP)var0[22],
         (rrvP)var0[23]
      };
      staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5 = var0;
   }

   private static void id_finally() {
      stringsf01ecca4eb60322eb4dd34fd4e806aa5 = new String[]{
         new String("PURPLE_BLUE"),
         new String("Фиолетово-голубой"),
         new String("CANDY"),
         new String("Конфетный"),
         new String("LILAC"),
         new String("Сиреневый"),
         new String("MINT_RASPBERRY"),
         new String("Мятно-малиновый"),
         new String("SUPERMAN"),
         new String("Супермен"),
         new String("CELESTIAL"),
         new String("Космос"),
         new String("GALAXY"),
         new String("Галактика"),
         new String("AMETHYST_YELLOW"),
         new String("Аметисто-жёлтый"),
         new String("SUNRISE"),
         new String("Восход"),
         new String("LUNADA"),
         new String("Лунада"),
         new String("PURPLE_SEA"),
         new String("Пурпурно-морской"),
         new String("SUNSET"),
         new String("Солнечный закат"),
         new String("MOONLIGHT"),
         new String("Лунный свет"),
         new String("MINT_CHOCOLATE"),
         new String("Мятный шоколад"),
         new String("RASPBERRY_SMOOTHIE"),
         new String("Малиновый смузи"),
         new String("EUCALYPTUS"),
         new String("Эвкалиптовый"),
         new String("FROSTBITE"),
         new String("Обморожение"),
         new String("FROZEN_BERRY"),
         new String("Холодная ягода"),
         new String("STORMY_SEA"),
         new String("Грозовое море"),
         new String("SUNSET_GLOW"),
         new String("Закатное сияние"),
         new String("CRIMSON_DAWN"),
         new String("Багряный рассвет"),
         new String("CRIMSON_BEACH"),
         new String("Малиновый пляж"),
         new String("CORAL"),
         new String("Коралловый"),
         new String("GOLDEN_NIGHT"),
         new String("Золотая ночь")
      };
   }

   private static void id_extends() {
      booleansf01ecca4eb60322eb4dd34fd4e806aa5 = new boolean[]{false, true, false, false, true, true, true, false, false};
   }

   private static void id_case() {
      integersf01ecca4eb60322eb4dd34fd4e806aa5 = new int[]{
         5518335,
         65535,
         16515327,
         56286,
         13148872,
         12139407,
         704444,
         16528716,
         39415,
         15800082,
         12793700,
         1910385,
         2899536,
         16610412,
         9323501,
         15789195,
         16736109,
         16761713,
         5518335,
         10878667,
         8609987,
         3063697,
         16729344,
         16753920,
         16048856,
         12211056,
         10025880,
         16758465,
         16716947,
         4511656,
         65535,
         14011626,
         4792186,
         4282576,
         1381653,
         16729344,
         1969664,
         11730971,
         985103,
         9175066,
         16734003,
         16752762,
         16729344,
         16765184,
         2105376
      };
   }

   private static void id_implements() {
      shortsf01ecca4eb60322eb4dd34fd4e806aa5 = new short[]{
         24, 0, 255, 1, 255, 2, 0, 1, 2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 25600, 25666, 13107
      };
   }

   private void id_protected() {
      if (this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5 == null) {
         this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5 = new Object[bytesf01ecca4eb60322eb4dd34fd4e806aa5[68]];
         Object[] var1 = this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5;
         var1[booleansf01ecca4eb60322eb4dd34fd4e806aa5[6]] = Integer.valueOf(booleansf01ecca4eb60322eb4dd34fd4e806aa5[7]);
         var1[bytesf01ecca4eb60322eb4dd34fd4e806aa5[69]] = Integer.valueOf(booleansf01ecca4eb60322eb4dd34fd4e806aa5[8]);
      }
   }

   private static void id_private() {
      bytesf01ecca4eb60322eb4dd34fd4e806aa5 = new byte[]{
         24,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         23,
         2,
         2,
         3,
         3,
         4,
         4,
         5,
         5,
         6,
         6,
         7,
         7,
         8,
         8,
         9,
         9,
         10,
         10,
         11,
         11,
         12,
         12,
         13,
         13,
         14,
         14,
         15,
         15,
         16,
         16,
         17,
         17,
         18,
         18,
         19,
         19,
         20,
         20,
         21,
         21,
         22,
         22,
         23,
         23,
         24,
         3,
         2,
         25
      };
   }
}
