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
      return ((rq_3)this.id_byte[id_protected[13]])
            .id_class(
               var1 - (Integer)this.id_byte[id_protected[14]],
               var2 - (Integer)this.id_byte[id_protected[15]],
               var3 - (Integer)this.id_byte[id_protected[16]],
               var4
            )
         ? ((rq_3)this.id_byte[id_protected[17]])
            .id_class(
               var1 - (Integer)this.id_byte[id_protected[18]],
               var2 - (Integer)this.id_byte[id_protected[19]],
               var3 - (Integer)this.id_byte[id_protected[20]],
               var4,
               (List<xc_3>)((GW)this.id_byte[id_protected[21]]).id_break[id_protected[22]]
            )
         : null;
   }

   private static void id_byte() {
      id_catch = new byte[]{9, 6, 2, 3, 4};
   }

   public Gm_1(GW var1) {
      super(GW.id_class(var1), id_throws[0]);
      this.id_protected();
      this.id_byte[id_protected[0]] = var1;
      List var7 = var1.id_break(id_catch[0]);
      this.id_byte[id_protected[1]] = var7;
      rq_3 var8 = (rq_3)var1.id_break[id_protected[2]];
      this.id_byte[id_protected[3]] = var8;
      Integer var9 = ((rja_3)var1.id_break[id_protected[4]]).b_();
      this.id_byte[id_protected[5]] = var9;
      Integer var10 = ((rja_3)var1.id_break[id_protected[6]]).c_();
      this.id_byte[id_protected[7]] = var10;
      Integer var11 = ((rja_3)var1.id_break[id_protected[8]]).d_();
      this.id_byte[id_protected[9]] = var11;
      Double var12 = (Double)this.id_break[id_protected[10]] + id_case[0];
      this.id_break[id_protected[11]] = var12;
      Double var13 = id_case[1];
      this.id_break[id_protected[12]] = var13;
   }

   static {
      ntfClinit();
   }

   @Override
   public double id_class(int var1, int var2, int var3, xc_3 var4) {
      this.id_protected();
      if (!this.id_byte(var1, var2, var3) && ((ba_3)this.id_break[id_protected[23]]).id_class(var1, var3)) {
         xc_3 var5 = this.id_byte(var1, var2, var3, var4);
         if (var5 != null && !((List)C_class.id_instanceof().S.id_class[id_protected[24]]).contains(var5.id_break())) {
            if (var5.id_break() instanceof Ja_1) {
               return (Double)this.id_break[id_protected[25]] * (Double)C_class.id_instanceof().id_byte.id_class[id_protected[26]];
            } else if (((List)this.id_byte[id_protected[27]]).contains(var5)) {
               return id_case[3];
            } else {
               return !this.id_break[id_protected[28]]
                  ? id_case[4]
                  : (Double)this.id_break[id_protected[29]] * id_case[5] * (Double)C_class.id_instanceof().id_byte.id_class[id_protected[30]];
            }
         } else {
            return this.id_break[id_protected[31]] ? (Double)this.id_break[id_protected[32]] : id_case[6];
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
      if (((Boolean)this.id_break[id_protected[33]] || ((List)this.id_break[id_protected[34]]).contains(var4.id_break())) && !this.id_byte(var1, var2, var3)) {
         xc_3 var5 = this.id_byte(var1, var2, var3, var4);
         if (var5 == null || ((List)C_class.id_instanceof().S.id_class[id_protected[35]]).contains(var5.id_break())) {
            return id_case[10];
         } else if (var5.id_break() == xu_3.id_class) {
            return id_case[8];
         } else {
            return ((GW)this.id_byte[id_protected[36]]).id_class(((bw_3)this.id_break[id_protected[37]]).id_class(var1, var2, var3), var5, id_throws[1])
               ? (Double)C_class.id_instanceof().h.id_class[id_protected[38]]
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
         this.id_byte = new Object[id_catch[1]];
         Object[] var1 = this.id_byte;
         var1[id_catch[2]] = Integer.valueOf(id_throws[2]);
         var1[id_catch[3]] = Integer.valueOf(id_throws[3]);
         var1[id_catch[4]] = Integer.valueOf(id_throws[4]);
      }
   }
}
