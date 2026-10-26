package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum P implements C_double<rdb_3> {
   private static short[] shortsee62191719013ce696dd0417ea84d4fd;
   private static boolean[] booleansee62191719013ce696dd0417ea84d4fd;
   public static Object[] staticFieldsee62191719013ce696dd0417ea84d4fd;
   private static byte[] bytesee62191719013ce696dd0417ea84d4fd;
   private static String[] stringsee62191719013ce696dd0417ea84d4fd;

   private static void id_byte() {
      booleansee62191719013ce696dd0417ea84d4fd = new boolean[]{true, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   @Override
   public Stream<String> id_class(C_for var1) throws x_1 {
      return new v_1().id_break(rVL.id_for.id_protected().stream().map(rqO_2::toString)).id_break(var1.id_class().id_extends()).id_break().id_protected();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, 106, 97, 125, -50, -97, 64, 38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 866863452;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3428660262256611130L;
   }

   private static void id_break() {
      shortsee62191719013ce696dd0417ea84d4fd = new short[]{1, 0};
   }

   public rdb_3 id_break(C_for var1) throws x_1 {
      rqO_2 var2 = new rqO_2(var1.id_class().id_extends());
      rdb_3 var3;
      if ((var3 = rVL.id_for.id_break(var2).orElse(null)) == null) {
         throw new IllegalArgumentException(stringsee62191719013ce696dd0417ea84d4fd[0]);
      } else {
         return var3;
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new P(), null};
      var0[1] = new P[]{(P)var0[0]};
      staticFieldsee62191719013ce696dd0417ea84d4fd = var0;
   }

   private static void id_case() {
      bytesee62191719013ce696dd0417ea84d4fd = new byte[]{2};
   }

   private static void id_protected() {
      stringsee62191719013ce696dd0417ea84d4fd = new String[]{new String("Не найдено ни одного предмета по этому идентификатору"), new String("INSTANCE")};
   }
}
