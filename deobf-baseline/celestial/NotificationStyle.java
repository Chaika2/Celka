package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NotificationStyle {
   public Object[] id_class;
   private static boolean[] id_break;
   private static float[] id_byte;
   private static short[] id_protected;

   public NotificationStyle id_byte() {
      rrfu_3 var10000 = (rrfu_3)this.id_class[id_protected[21]];
      rVa_1 var5 = rVa_1.id_class(ColorHelper.id_class(id_byte[2]));
      var10000.id_break[id_protected[22]] = var5;
      var10000 = (rrfu_3)this.id_class[id_protected[23]];
      rVa_1 var6 = rVa_1.id_class(ColorHelper.id_class(id_byte[3]));
      var10000.id_break[id_protected[24]] = var6;
      return this;
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{48, 9, -104, -127, 111, 63, -69, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   NotificationStyle() {
      this.id_protected();
      rrfu_3 var5 = new rrfu_3();
      this.id_class[id_protected[0]] = var5;
   }

   static {
      ntfClinit();
   }

   public NotificationStyle id_class(rVa_1 var1, rVa_1 var2) {
      ((rrfu_3)this.id_class[id_protected[5]]).id_break[id_protected[6]] = var1;
      ((rrfu_3)this.id_class[id_protected[7]]).id_break[id_protected[8]] = var2;
      return this;
   }

   public NotificationStyle id_class(rVa_1 var1) {
      ((rrfu_3)this.id_class[id_protected[13]]).id_break[id_protected[14]] = var1;
      ((rrfu_3)this.id_class[id_protected[15]]).id_break[id_protected[16]] = var1;
      return this;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1686541788;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2269250902018343080L;
   }

   public NotificationStyle id_class() {
      rrfu_3 var10000 = (rrfu_3)this.id_class[id_protected[17]];
      rVa_1 var5 = rVa_1.id_class(ColorHelper.id_class(id_byte[0]));
      var10000.id_break[id_protected[18]] = var5;
      var10000 = (rrfu_3)this.id_class[id_protected[19]];
      rVa_1 var6 = rVa_1.id_class(ColorHelper.id_class(id_byte[1]));
      var10000.id_break[id_protected[20]] = var6;
      return this;
   }

   public NotificationStyle id_class(String var1) {
      ((rrfu_3)this.id_class[id_protected[3]]).id_break[id_protected[4]] = var1;
      return this;
   }

   public rVe_1 id_break() {
      return ((rrfu_3)this.id_class[id_protected[25]]).id_catch();
   }

   public NotificationStyle id_break(rVa_1 var1, rVa_1 var2) {
      ((rrfu_3)this.id_class[id_protected[9]]).id_break[id_protected[10]] = var1;
      ((rrfu_3)this.id_class[id_protected[11]]).id_break[id_protected[12]] = var2;
      return this;
   }

   public NotificationStyle id_break(String var1) {
      ((rrfu_3)this.id_class[id_protected[1]]).id_break[id_protected[2]] = var1;
      return this;
   }

   private static void id_throws() {
      id_byte = new float[]{0.0F, 270.0F, 0.0F, 270.0F};
   }

   private static void id_catch() {
      id_break = new boolean[]{true};
   }

   private static void id_case() {
      id_protected = new short[]{0, 0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 4, 0, 5, 0, 4, 0, 5, 0, 2, 0, 3, 0};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }
}
