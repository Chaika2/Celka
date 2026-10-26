package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrni_3 implements rrTf_1 {
   private static double[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   private static float[] id_throws;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   public rrni_3(rrna_3 var1) {
      this.id_byte();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7357703450379031034L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, -71, -12, 77, -35, 86, -17, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new double[]{-0.5, 0.5, -0.5, 0.5};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1436078237;
   }

   private static void id_break() {
      id_throws = new float[]{16.0F, 0.8F, 4.0F};
   }

   private static void id_throws() {
      id_byte = new short[]{0, 0, 1, 0, 0, 0, 57, 41, 57, 41};
   }

   private static void id_protected() {
      id_protected = new boolean[]{true};
   }

   @Override
   public PX processRandom(PX var1, PX var2) {
      float var3 = var2.id_throws();
      float var4 = var2.id_protected();
      if ((Boolean)((rrna_3)this.id_class[id_byte[1]]).id_byte[id_byte[2]]
         && !((rrna_3)this.id_class[id_byte[3]]).id_synchronized()
         && ((rrna_3)this.id_class[id_byte[4]]).id_continue().id_continue() != null) {
         Pr_1 var5 = ((rrna_3)this.id_class[id_byte[5]]).id_implements().id_protected();
         var3 += (float)rrfQ_2.id_class(var5, id_break[0], id_break[1]);
         var4 += (float)rrfQ_2.id_class(var5, id_break[2], id_break[3]);
         var3 += rfU_2.id_class((float)((Integer)((cb_3)MinecraftAccessor.id_import.id_class[id_byte[6]]).id_throws[id_byte[7]]).intValue()) * id_throws[0];
         var4 += rfU_2.id_class((float)((Integer)((cb_3)MinecraftAccessor.id_import.id_class[id_byte[8]]).id_throws[id_byte[9]]).intValue() * id_throws[1])
            * id_throws[2];
      }

      return new PX(var3, var4);
   }
}
