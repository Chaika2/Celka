package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rruD implements C_double<Integer> {
   ;
   private static String[] stringsba29985e322c382da8479b6f59b746b0;
   private static byte[] bytesba29985e322c382da8479b6f59b746b0;
   private static boolean[] booleansba29985e322c382da8479b6f59b746b0;
   private static short[] shortsba29985e322c382da8479b6f59b746b0;
   public static Object[] staticFieldsba29985e322c382da8479b6f59b746b0;

   private static void byte_() {
      stringsba29985e322c382da8479b6f59b746b0 = new String[]{
         new String("#"), new String("Неверный цвет, возможно вы забыли добавить # перед hex кодом"), new String("INSTANCE")
      };
   }

   static {
      ntfClinit();
   }

   @Override
   public Stream<String> class_(C_for var1) throws x_1 {
      C_static var2 = var1.class_();
      String var3 = var2.extends_();
      return new v_1().break_(Stream.of(rruK.values()).map(rruK::class_)).class_(var3).protected_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 607923054687478740L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 634561852;
   }

   private static void class_() {
      booleansba29985e322c382da8479b6f59b746b0 = new boolean[]{true, false, true, false, false, false, true};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-73, -112, -19, 17, 61, -53, -40, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Integer break_(C_for var1) throws x_1 {
      String var2 = var1.class_().extends_().toLowerCase();
      if (var2.startsWith("#")) {
         int var7 = Integer.parseInt(var2.substring(1), 16);
         if (ColorHelper.throws_(var7) == 0) {
            var7 = ColorHelper.break_(var7, 255);
         }

         return var7;
      } else {
         for (rruK var6 : rruK.values()) {
            if (var6.class_().equals(var2)) {
               return var6.break_().get();
            }
         }

         throw new IllegalArgumentException("Неверный цвет, возможно вы забыли добавить # перед hex кодом");
      }
   }

   private static void throws_() {
      shortsba29985e322c382da8479b6f59b746b0 = new short[]{1, 255, 0};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rruD(), null};
      var0[1] = new rruD[]{(rruD)var0[0]};
      staticFieldsba29985e322c382da8479b6f59b746b0 = var0;
   }

   private static void protected_() {
      bytesba29985e322c382da8479b6f59b746b0 = new byte[]{16, 2};
   }
}
