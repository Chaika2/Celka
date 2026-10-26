package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rruD implements C_double<Integer> {
   private static String[] stringsba29985e322c382da8479b6f59b746b0;
   private static byte[] bytesba29985e322c382da8479b6f59b746b0;
   private static boolean[] booleansba29985e322c382da8479b6f59b746b0;
   private static short[] shortsba29985e322c382da8479b6f59b746b0;
   public static Object[] staticFieldsba29985e322c382da8479b6f59b746b0;

   private static void id_byte() {
      stringsba29985e322c382da8479b6f59b746b0 = new String[]{
         new String("#"), new String("Неверный цвет, возможно вы забыли добавить # перед hex кодом"), new String("INSTANCE")
      };
   }

   static {
      ntfClinit();
   }

   @Override
   public Stream<String> id_class(C_for var1) throws x_1 {
      C_static var2 = var1.id_class();
      String var3 = var2.id_extends();
      return new v_1().id_break(Stream.of(rruK.values()).map(rruK::id_class)).id_class(var3).id_protected();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 607923054687478740L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 634561852;
   }

   private static void id_class() {
      booleansba29985e322c382da8479b6f59b746b0 = new boolean[]{true, false, true, false, false, false, true};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-73, -112, -19, 17, 61, -53, -40, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Integer id_break(C_for var1) throws x_1 {
      String var2 = var1.id_class().id_extends().toLowerCase();
      if (var2.startsWith(stringsba29985e322c382da8479b6f59b746b0[0])) {
         int var7 = Integer.parseInt(var2.substring(booleansba29985e322c382da8479b6f59b746b0[0]), bytesba29985e322c382da8479b6f59b746b0[0]);
         if (ColorHelper.id_throws(var7) == 0) {
            var7 = ColorHelper.id_break(var7, shortsba29985e322c382da8479b6f59b746b0[1]);
         }

         return var7;
      } else {
         rruK[] var3 = rruK.values();
         int var4 = var3.length;

         for (int var5 = booleansba29985e322c382da8479b6f59b746b0[1]; var5 < var4; var5++) {
            rruK var6 = var3[var5];
            if (var6.id_class().equals(var2)) {
               return var6.id_break().get();
            }
         }

         throw new IllegalArgumentException(stringsba29985e322c382da8479b6f59b746b0[1]);
      }
   }

   private static void id_throws() {
      shortsba29985e322c382da8479b6f59b746b0 = new short[]{1, 255, 0};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rruD(), null};
      var0[1] = new rruD[]{(rruD)var0[0]};
      staticFieldsba29985e322c382da8479b6f59b746b0 = var0;
   }

   private static void id_protected() {
      bytesba29985e322c382da8479b6f59b746b0 = new byte[]{16, 2};
   }
}
