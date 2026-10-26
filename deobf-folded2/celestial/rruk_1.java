package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruk_1 implements rruG {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static float[] id_protected;
   private static byte[] id_throws;

   private static void id_byte() {
      id_byte = new short[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 2, 0, 2};
   }

   @Override
   public float id_byte(float var1) {
      return rfU_2.id_catch(var1, (Float)((rrub_1)this.id_class[1]).id_class[2], (Float)((rrub_1)this.id_class[0]).id_class[2]);
   }

   public rruk_1() {
      this.id_protected();
      rrub_1 var5 = new rrub_1(0.0F, 0.0F, 0.0F);
      this.id_class[0] = var5;
      rrub_1 var6 = new rrub_1(0.0F, 0.0F, 0.0F);
      this.id_class[1] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public float id_class(float var1) {
      return rfU_2.id_catch(var1, (Float)((rrub_1)this.id_class[1]).id_class[0], (Float)((rrub_1)this.id_class[0]).id_class[0]);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{50, 116, 64, -127, 91, -105, -119, 15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1890006491;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8764329106784031506L;
   }

   private static void id_class() {
      id_throws = new byte[]{3, 2};
   }

   private static void id_break() {
      id_protected = new float[6];
   }

   private static void id_throws() {
      id_break = new boolean[1];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[2] = false;
      }
   }

   @Override
   public float id_protected(float var1) {
      return rfU_2.id_catch(var1, (Float)((rrub_1)this.id_class[1]).id_class[1], (Float)((rrub_1)this.id_class[0]).id_class[1]);
   }
}
