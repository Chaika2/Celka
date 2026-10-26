package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfz_3 {
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static float[] id_throws;
   public Object[] id_class;

   public float id_byte() {
      return (Float)this.id_class[id_byte[9]];
   }

   public void id_byte(float var1) {
      Float var6 = var1;
      this.id_class[id_byte[12]] = var6;
   }

   public rrfz_3(rrfk_3 var1, rrfx_3 var2, rrfJ_2 var3) {
      this.id_implements();
      this.id_class[id_byte[0]] = var1;
      this.id_class[id_byte[1]] = var2;
      this.id_class[id_byte[2]] = var3;
   }

   static {
      ntfClinit();
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[id_byte[13]] = var6;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-4, 47, -99, 3, 32, -113, 12, -32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1740188309;
   }

   public rrfx_3 id_class() {
      return (rrfx_3)this.id_class[id_byte[10]];
   }

   public boolean id_class(float var1, float var2) {
      return var1 >= this.id_throws() && var1 <= this.id_throws() + id_throws[0] && var2 >= this.id_break() && var2 <= this.id_break() + id_throws[1]
         ? id_protected[0]
         : id_protected[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3256675010353841910L;
   }

   public void id_break(float var1) {
      Float var6 = var1;
      this.id_class[id_byte[8]] = var6;
   }

   public float id_break() {
      return (Float)this.id_class[id_byte[4]] + (Float)this.id_class[id_byte[5]] + ((rrZH)((rrfk_3)this.id_class[id_byte[6]]).id_class[id_byte[7]]).id_case();
   }

   public float id_throws() {
      return (Float)this.id_class[id_byte[3]];
   }

   private static void id_finally() {
      id_throws = new float[]{15.0F, 15.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void id_catch() {
      id_protected = new boolean[]{true, false, false, true};
   }

   private static void id_case() {
      id_break = new byte[]{6, 2};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[0] = 0.0F;
         this.id_class[1] = 0.0F;
         this.id_class[2] = 0.0F;
      }
   }

   public rrfJ_2 id_protected() {
      return (rrfJ_2)this.id_class[id_byte[11]];
   }

   private static void id_private() {
      id_byte = new short[]{5, 3, 4, 0, 1, 2, 5, 1, 2, 2, 3, 4, 0, 1};
   }
}
