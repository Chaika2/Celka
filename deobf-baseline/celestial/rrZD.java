package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZD implements rrZp_1 {
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   private static float[] id_throws;

   private static void id_byte() {
      id_break = new short[]{0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 0};
   }

   @Override
   public void id_byte(rrIX var1) {
      ((rrZw_1)this.id_class[id_break[11]]).id_break(var1.id_class());
   }

   public rrZD(rrZw_1 var1, Supplier<Float> var2, Supplier<Float> var3, float var4, float var5) {
      this.id_throws();
      this.id_class[id_break[0]] = var1;
      this.id_class[id_break[1]] = var2;
      this.id_class[id_break[2]] = var3;
      Float var13 = var4;
      this.id_class[id_break[3]] = var13;
      Float var14 = var5;
      this.id_class[id_break[4]] = var14;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -415882283;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3341368454143812629L;
   }

   private static void id_class() {
      id_protected = new boolean[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{31, -116, -127, 95, -103, 122, -51, 14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_throws = new float[2];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
         var1[id_byte[1]] = id_throws[0];
         var1[id_byte[2]] = id_throws[1];
      }
   }

   @Override
   public void id_protected(rrIX var1) {
      rrZa_1 var2 = new rrZa_1(
         (rrZw_1)this.id_class[id_break[5]],
         var1,
         (Supplier<Float>)this.id_class[id_break[6]],
         (Supplier<Float>)this.id_class[id_break[7]],
         (Float)this.id_class[id_break[8]],
         (Float)this.id_class[id_break[9]]
      );
      ((rrZw_1)this.id_class[id_break[10]]).id_class(id_protected[0], var2);
   }

   private static void id_protected() {
      id_byte = new byte[]{5, 3, 4};
   }
}
