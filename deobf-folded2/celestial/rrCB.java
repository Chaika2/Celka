package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCB implements rrTf_1 {
   private static short[] id_break;
   private static double[] id_byte;
   private static float[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_class;

   private static void id_byte() {
      id_protected = new float[]{0.1F, 0.1F};
   }

   public rrCB(rrCP var1) {
      this.id_throws();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5008574620239952111L;
   }

   private static void id_class() {
      id_byte = new double[]{-0.5, 0.5, -0.5, 0.5};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1717429766;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, 83, -97, -8, 42, -33, 104, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_throws = new boolean[]{true, true, true};
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   private static void id_protected() {
      id_break = new short[]{0, 0, 0, 0, 57, 16, 57, 16};
   }

   @Override
   public PX processRandom(PX var1, PX var2) {
      float var3 = var1.id_throws();
      float var4 = var1.id_protected();
      float var5 = var2.id_throws();
      float var6 = var2.id_protected();
      Pr_1 var7 = ((rrCP)this.id_class[0]).id_implements().id_protected();
      if (!(Boolean)((rrCP)this.id_class[0]).id_byte[0]) {
         if ((Integer)((cb_3)MinecraftAccessor.id_import.id_class[57]).id_private[16] == 1) {
            var5 = var3 + 0.1F;
            var6 = var4 + 0.1F;
         } else if ((Integer)((cb_3)MinecraftAccessor.id_import.id_class[57]).id_private[16] > 1) {
            var5 += (float)rrfQ_2.id_class(var7, -0.5, 0.5);
            var6 += (float)rrfQ_2.id_class(var7, -0.5, 0.5);
         }
      }

      return new PX(var5, var6);
   }
}
