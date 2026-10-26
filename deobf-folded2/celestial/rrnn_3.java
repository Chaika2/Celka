package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnn_3 implements rrTf_1 {
   public Object[] id_class;
   private static short[] id_break;
   private static float[] id_byte;
   private static boolean[] id_protected;
   private static double[] id_throws;

   private static void id_byte() {
      id_protected = new boolean[]{true, true, true};
   }

   public rrnn_3(AutoExplosion var1) {
      this.id_class();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 107, 9, -112, -73, -67, -25, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3974957009043968563L;
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 27166978;
   }

   private static void id_break() {
      id_throws = new double[]{-0.2F, 0.2F, -0.2F, 0.2F};
   }

   private static void id_throws() {
      id_byte = new float[]{5.0F, 5.0F};
   }

   private static void id_protected() {
      id_break = new short[]{0, 0, 8, 57, 16, 57, 16};
   }

   @Override
   public PX processRandom(PX var1, PX var2) {
      float var3 = var1.id_throws();
      float var4 = var1.id_protected();
      float var5 = var2.id_throws();
      float var6 = var2.id_protected();
      Pr_1 var7 = ((rrTT)((AutoExplosion)this.id_class[0]).id_break[8]).id_protected().id_protected();
      if ((Integer)((cb_3)MinecraftAccessor.id_import.id_class[57]).id_private[16] == 1) {
         var5 = var3 + 5.0F;
         var6 = var4 + 5.0F;
      } else if ((Integer)((cb_3)MinecraftAccessor.id_import.id_class[57]).id_private[16] > 1) {
         var5 += (float)rrfQ_2.id_class(var7, -0.2F, 0.2F);
         var6 += (float)rrfQ_2.id_class(var7, -0.2F, 0.2F);
      }

      return new PX(var5, var6);
   }
}
