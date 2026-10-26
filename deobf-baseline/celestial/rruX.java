package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruX implements rruG {
   private static boolean[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;
   private static float[] id_protected;
   private static short[] id_throws;

   @Override
   public float id_byte(float var1) {
      return id_protected[4];
   }

   private static void id_byte() {
      id_protected = new float[5];
   }

   public rruX() {
      this.id_class();
      rrux_1 var5 = new rrux_1(id_protected[0], id_protected[1]);
      this.id_class[id_throws[0]] = var5;
      rrux_1 var6 = new rrux_1(id_protected[2], id_protected[3]);
      this.id_class[id_throws[1]] = var6;
   }

   static {
      ntfClinit();
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
         var1[id_byte[1]] = id_break[0];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, -100, -106, 17, -85, -100, -11, 109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 428376189;
   }

   @Override
   public float id_class(float var1) {
      return rfU_2.id_catch(
         var1, (Float)((rrux_1)this.id_class[id_throws[2]]).id_class[id_throws[3]], (Float)((rrux_1)this.id_class[id_throws[4]]).id_class[id_throws[5]]
      );
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8509282840081093143L;
   }

   private static void id_break() {
      id_throws = new short[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1};
   }

   private static void id_throws() {
      id_byte = new byte[]{3, 2};
   }

   private static void id_protected() {
      id_break = new boolean[1];
   }

   @Override
   public float id_protected(float var1) {
      return rfU_2.id_catch(
         var1, (Float)((rrux_1)this.id_class[id_throws[6]]).id_class[id_throws[7]], (Float)((rrux_1)this.id_class[id_throws[8]]).id_class[id_throws[9]]
      );
   }
}
