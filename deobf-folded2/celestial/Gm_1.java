package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gm_1 extends EZ {
   public Object[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;
   private static double[] id_case;
   private static byte[] id_catch;

   xc_3 id_byte(int var1, int var2, int var3, xc_3 var4) {
      this.id_protected();
      return ((rq_3)this.id_byte[1]).id_class(var1 - (Integer)this.id_byte[2], var2 - (Integer)this.id_byte[3], var3 - (Integer)this.id_byte[4], var4)
         ? ((rq_3)this.id_byte[1])
            .id_class(
               var1 - (Integer)this.id_byte[2],
               var2 - (Integer)this.id_byte[3],
               var3 - (Integer)this.id_byte[4],
               var4,
               (List<xc_3>)((GW)this.id_byte[5]).id_break[10]
            )
         : null;
   }

   private static void id_byte() {
      id_catch = new byte[]{9, 6, 2, 3, 4};
   }

   public Gm_1(GW var1) {
      super(GW.id_class(var1), true);
      this.id_protected();
      this.id_byte[5] = var1;
      List var7 = var1.id_break(9);
      this.id_byte[0] = var7;
      rq_3 var8 = (rq_3)var1.id_break[4];
      this.id_byte[1] = var8;
      Integer var9 = ((rja_3)var1.id_break[5]).b_();
      this.id_byte[2] = var9;
      Integer var10 = ((rja_3)var1.id_break[5]).c_();
      this.id_byte[3] = var10;
      Integer var11 = ((rja_3)var1.id_break[5]).d_();
      this.id_byte[4] = var11;
      Double var12 = (Double)this.id_break[26] + 10.0;
      this.id_break[26] = var12;
      Double var13 = 1.0;
      this.id_break[25] = var13;
   }

   static {
      ntfClinit();
   }

   @Override
   public double id_class(int var1, int var2, int var3, xc_3 var4) {
      this.id_protected();
      if (!this.id_byte(var1, var2, var3) && ((ba_3)this.id_break[28]).id_class(var1, var3)) {
         xc_3 var5 = this.id_byte(var1, var2, var3, var4);
         if (var5 != null && !((List)C_class.id_instanceof().S.id_class[0]).contains(var5.id_break())) {
            if (var5.id_break() instanceof Ja_1) {
               return (Double)this.id_break[9] * (Double)C_class.id_instanceof().id_byte.id_class[0];
            } else if (((List)this.id_byte[0]).contains(var5)) {
               return 0.0;
            } else {
               return !this.id_break[7] ? 1000000.0 : (Double)this.id_break[9] * 1.5 * (Double)C_class.id_instanceof().id_byte.id_class[0];
            }
         } else {
            return this.id_break[7] ? (Double)this.id_break[9] : id_case[6];
         }
      } else {
         return id_case[2];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8539032751228539965L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 760628513;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, -43, 80, 63, 5, -17, 84, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public double id_break(int var1, int var2, int var3, xc_3 var4) {
      this.id_protected();
      if (((Boolean)this.id_break[10] || ((List)this.id_break[11]).contains(var4.id_break())) && !this.id_byte(var1, var2, var3)) {
         xc_3 var5 = this.id_byte(var1, var2, var3, var4);
         if (var5 == null || ((List)C_class.id_instanceof().S.id_class[0]).contains(var5.id_break())) {
            return id_case[10];
         } else if (var5.id_break() == xu_3.id_class) {
            return 1.0;
         } else {
            return ((GW)this.id_byte[5]).id_class(((bw_3)this.id_break[4]).id_class(var1, var2, var3), var5, false)
               ? (Double)C_class.id_instanceof().h.id_class[0]
               : id_case[9];
         }
      } else {
         return id_case[7];
      }
   }

   private static void id_throws() {
      id_protected = new short[]{5, 0, 4, 1, 5, 2, 5, 3, 5, 4, 26, 26, 25, 1, 2, 3, 4, 1, 2, 3, 4, 5, 10, 28, 0, 9, 0, 0, 7, 9, 0, 7, 9, 10, 11, 0, 5, 4, 0};
   }

   private static void id_catch() {
      id_case = new double[]{10.0, 1.0, 1000000.0, 0.0, 1000000.0, 1.5, 1000000.0, 1000000.0, 1.0, 1.0, 1.0};
   }

   private static void id_case() {
      id_throws = new boolean[]{true, false, false, false, false};
   }

   private void id_protected() {
      if (this.id_byte == null) {
         this.id_byte = new Object[6];
         Object[] var1 = this.id_byte;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0;
      }
   }
}
