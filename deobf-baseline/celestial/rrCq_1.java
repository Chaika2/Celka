package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCq_1 {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;
   public Object[] id_class;
   public static Object[] id_break;
   private static double[] id_case;

   public Random id_byte() {
      return (Random)this.id_class[id_throws[12]];
   }

   public rrCq_1() {
      this.id_protected();
      Random var5 = new Random();
      this.id_class[id_throws[0]] = var5;
      Double var6 = id_case[0];
      this.id_class[id_throws[1]] = var6;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7105377690726990359L;
   }

   public rrTA id_class() {
      return (rrTA)this.id_class[id_throws[13]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{39, -69, -33, 121, 114, 120, -95, 22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrCp_1 var1, List<rrTA> var2) {
      this.id_class(id_case[1]);
      if ((rrTA)this.id_class[id_throws[2]] == null) {
         this.id_class(var2);
      }

      if ((rrTA)this.id_class[id_throws[3]] != null) {
         if (var1.id_class() == null) {
            var1.id_class(rfl_3.id_catch(id_case[2], id_case[3], id_case[4]).id_protected(((rrTA)this.id_class[id_throws[4]]).rr()));
         } else {
            rfl_3 var3 = var1.id_class();
            rjU_2 var4 = var3.id_case();
            rjU_2 var5 = ((rrTA)this.id_class[id_throws[5]]).rr();
            rjU_2 var6 = var5.id_protected(var4).id_protected();
            rjU_2 var7 = var6.id_class((Double)this.id_class[id_throws[6]]);
            rfl_3 var8 = var3.id_protected(var7.id_break, var7.id_byte, var7.id_protected);
            var1.id_class(var8);
            if (var4.id_case(var5) < (Double)this.id_class[id_throws[7]]) {
               this.id_class(var2);
            }
         }
      }
   }

   public void id_class(double var1) {
      Double var7 = var1;
      this.id_class[id_throws[11]] = var7;
   }

   private void id_class(List<rrTA> var1) {
      if (var1 != null && !var1.isEmpty()) {
         rrTA var7 = (rrTA)var1.get(((Random)this.id_class[id_throws[9]]).nextInt(var1.size()));
         this.id_class[id_throws[10]] = var7;
      } else {
         Object var6 = null;
         this.id_class[id_throws[8]] = var6;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2136475356;
   }

   public double id_break() {
      return (Double)this.id_class[id_throws[14]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{0.001};
      id_break = var0;
   }

   private static void id_catch() {
      id_case = new double[]{0.001, 0.01F, 0.1F, 0.1F, 0.1F, 0.0, 0.001};
   }

   private static void id_case() {
      id_throws = new short[]{0, 2, 1, 1, 1, 1, 2, 2, 1, 0, 1, 2, 0, 1, 2};
   }

   private static void id_implements() {
      id_protected = new boolean[]{true, false};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[2] = 0.0;
      }
   }

   private static void id_private() {
      id_byte = new byte[]{3, 2};
   }
}
