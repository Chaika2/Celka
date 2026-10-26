package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIa_1 {
   private static float[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_protected = new boolean[]{true, false};
   }

   public rrIa_1() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{118, -52, -115, 73, -100, -71, 78, -111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1701101202;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6285369063558811322L;
   }

   public void id_class() {
      Float var5 = id_break[1];
      this.id_class[id_byte[2]] = var5;
   }

   public float id_class(float var1, float var2) {
      float var10003 = (Float)this.id_class[id_byte[0]] + var2;
      Float var7 = var10003;
      this.id_class[id_byte[1]] = var7;
      var1 *= Math.min(var10003, id_break[0]);
      return (float)Math.sin((double)var1);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         this.id_class[0] = 0.0F;
      }
   }

   private static void id_throws() {
      id_break = new float[]{1.0F, 0.0F, 0.0F};
   }

   private static void id_protected() {
      id_byte = new short[3];
   }
}
