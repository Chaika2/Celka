package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum P implements C_double<rdb_3> {
   ;
   private static short[] shortsee62191719013ce696dd0417ea84d4fd;
   private static boolean[] booleansee62191719013ce696dd0417ea84d4fd;
   public static Object[] staticFieldsee62191719013ce696dd0417ea84d4fd;
   private static byte[] bytesee62191719013ce696dd0417ea84d4fd;
   private static String[] stringsee62191719013ce696dd0417ea84d4fd;

   private static void byte_() {
      booleansee62191719013ce696dd0417ea84d4fd = new boolean[]{true, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   @Override
   public Stream<String> class_(C_for var1) throws x_1 {
      return new v_1().break_(rVL.for_.protected_().stream().map(rqO_2::toString)).break_(var1.class_().extends_()).break_().protected_();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, 106, 97, 125, -50, -97, 64, 38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 866863452;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3428660262256611130L;
   }

   private static void break_() {
      shortsee62191719013ce696dd0417ea84d4fd = new short[]{1, 0};
   }

   public rdb_3 break_(C_for var1) throws x_1 {
      rqO_2 var2 = new rqO_2(var1.class_().extends_());
      rdb_3 var3;
      if ((var3 = rVL.for_.break_(var2).orElse(null)) == null) {
         throw new IllegalArgumentException("Не найдено ни одного предмета по этому идентификатору");
      } else {
         return var3;
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new P(), null};
      var0[1] = new P[]{(P)var0[0]};
      staticFieldsee62191719013ce696dd0417ea84d4fd = var0;
   }

   private static void case_() {
      bytesee62191719013ce696dd0417ea84d4fd = new byte[]{2};
   }

   private static void protected_() {
      stringsee62191719013ce696dd0417ea84d4fd = new String[]{new String("Не найдено ни одного предмета по этому идентификатору"), new String("INSTANCE")};
   }
}
