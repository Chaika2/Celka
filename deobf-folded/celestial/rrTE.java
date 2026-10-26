package celestial;

import java.nio.charset.StandardCharsets;
import java.time.DayOfWeek;
import java.time.LocalTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTE {
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
      }
   }

   private rrTE(DayOfWeek var1, LocalTime var2) {
      this.id_byte();
      this.id_class[id_byte[0]] = var1;
      this.id_class[1] = var2;
   }

   private rrTE(LocalTime var1) {
      this(null, var1);
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, -4, -76, -51, -75, -28, 35, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6162464395707330069L;
   }

   public static rrTE id_class(LocalTime var0) {
      return new rrTE(var0);
   }

   public LocalTime id_class() {
      return (LocalTime)this.id_class[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1461973258;
   }

   public static rrTE id_class(DayOfWeek var0, LocalTime var1) {
      return new rrTE(var0, var1);
   }

   public DayOfWeek id_break() {
      return (DayOfWeek)this.id_class[id_byte[2]];
   }

   private static void id_throws() {
      id_break = new byte[]{2};
   }

   private static void id_protected() {
      id_byte = new short[]{0, 1, 0, 1};
   }
}
