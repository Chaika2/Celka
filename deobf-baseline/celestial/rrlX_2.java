package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlX_2 implements MinecraftAccessor {
   private static double[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;
   public Object[] id_class;
   private static float[] id_case;

   public double id_byte() {
      return (Double)this.id_class[id_throws[37]];
   }

   public rrlX_2(Strafe var1) {
      this.id_finally();
      this.id_class[id_throws[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public void id_class(int var1) {
      Integer var6 = var1;
      this.id_class[id_throws[43]] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7582180784691737228L;
   }

   public float id_class(rrLz_1 var1) {
      boolean var2 = ((cb_3)id_import.id_class[id_throws[7]]).BL();
      boolean var3 = var1.id_throws();
      boolean var4 = var1.id_catch().id_byte > id_break[0] ? id_byte[3] : id_byte[4];
      float var5 = this.id_class((cb_3)id_import.id_class[id_throws[8]]);
      float var6 = this.id_class((cb_3)id_import.id_class[id_throws[9]], var1);
      float var7 = id_case[0];
      if (var2) {
         var7 = var6;
      }

      float var8 = id_case[1] / (var7 * var7 * var7);
      float var9;
      if (var2) {
         var9 = var5 * var8;
         if (var4) {
            var9 += id_case[2];
         }
      } else {
         var9 = var1.id_throws() ? id_case[3] : id_case[4];
      }

      boolean var10 = id_byte[5];
      float var11 = (float)((Double)this.id_class[id_throws[10]] + (double)var9);
      if (((cb_3)id_import.id_class[id_throws[11]]).id_return() && !var4) {
         double var12 = (double)var9 * id_break[1] + id_break[2];
         double var14 = var1.id_catch().id_byte;
         if (var14 != id_break[3] && Math.abs(var14) < id_break[4]) {
            var12 += id_break[5];
         }

         if ((double)var11 > Math.max(id_break[6], var12)) {
            var10 = id_byte[6];
            Integer var20 = (Integer)this.id_class[id_throws[12]] + id_byte[7];
            this.id_class[id_throws[13]] = var20;
         } else {
            Integer var21 = Math.max((Integer)this.id_class[id_throws[14]] - id_byte[8], id_byte[9]);
            this.id_class[id_throws[15]] = var21;
         }
      } else {
         Integer var22 = Integer.valueOf(id_byte[10]);
         this.id_class[id_throws[16]] = var22;
      }

      if (((cb_3)id_import.id_class[id_throws[17]]).id_return()
         && !((rqr_3)((cb_3)id_import.id_class[id_throws[18]]).id_break[id_throws[19]]).id_private
         && var2) {
         float var26 = (id_case[5] - ((cb_3)id_import.id_class[id_throws[20]]).sB()) * id_case[6];
         var26 += id_case[7];
         if ((Float)((cb_3)id_import.id_class[id_throws[21]]).id_private[id_throws[22]] != id_case[8]
            || ((rqr_3)((cb_3)id_import.id_class[id_throws[23]]).id_break[id_throws[24]]).id_throws) {
            var26 *= id_case[9];
         }

         var11 *= var26;
      }

      if ((Integer)this.id_class[id_throws[25]] > id_protected[0]) {
         var11 -= id_case[10];
      } else if (!(Boolean)((cb_3)id_import.id_class[id_throws[26]]).id_throws[id_throws[27]]) {
         float var10000 = Math.max(var10 ? id_case[11] : id_case[12], var11);
         int var10003 = (Integer)this.id_class[id_throws[28]];
         Integer var23 = var10003 + id_byte[11];
         this.id_class[id_throws[29]] = var23;
         var11 = var10000 - (var10003 % id_protected[1] == 0 ? id_case[13] : id_case[14]);
      }

      Double var24 = (double)var7;
      this.id_class[id_throws[30]] = var24;
      if (!var3 && !var2) {
         Boolean var25 = id_byte[12];
         this.id_class[id_throws[31]] = var25;
         ((Strafe)this.id_class[id_throws[32]]).id_case(!((cb_3)id_import.id_class[id_throws[33]]).id_break[id_throws[34]] ? id_byte[13] : id_byte[14]);
      }

      if (var3 && var2) {
         ((Strafe)this.id_class[id_throws[35]]).id_case(id_byte[15]);
      }

      return var11;
   }

   public void id_class(double var1) {
      Double var7 = var1;
      this.id_class[id_throws[39]] = var7;
   }

   public void id_class(rrAo_1 var1) {
      if ((Boolean)this.id_class[id_throws[3]]) {
         var1.id_protected(!((cb_3)id_import.id_class[id_throws[4]]).id_break[id_throws[5]] ? id_byte[0] : id_byte[1]);
         Boolean var6 = id_byte[2];
         this.id_class[id_throws[6]] = var6;
      }
   }

   public void id_class(rrLW var1) {
      Double var6 = var1.id_class() * (Double)this.id_class[id_throws[1]];
      this.id_class[id_throws[2]] = var6;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -119, -25, 54, 99, -64, -28, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[id_throws[42]] = var6;
   }

   private float id_class(rhd_3 var1) {
      boolean var2 = var1.PF();
      var1.c_(id_byte[16]);
      float var3 = var1.sB() * id_case[15];
      var1.c_(var2);
      return var3;
   }

   public int id_class() {
      return (Integer)this.id_class[id_throws[44]];
   }

   private float id_class(rhd_3 var1, rrLz_1 var2) {
      rfw_3 var3 = new rfw_3(var2.id_break().id_break, var2.id_implements().id_break - id_break[7], var2.id_break().id_byte);
      return ((rYB)var1.id_throws[id_throws[36]]).id_byte(var3).id_break().id_final() * id_case[16];
   }

   public void id_break(double var1) {
      Double var7 = var1;
      this.id_class[id_throws[40]] = var7;
   }

   public boolean id_break() {
      return (Boolean)this.id_class[id_throws[41]];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 182717284;
   }

   private static void id_throws() {
      id_break = new double[]{0.0, 0.5, 0.005F, 0.0, 0.08, 0.055, 0.043, 1.0, 0.0, 0.0};
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[1] = 0.0;
         this.id_class[2] = 0.0;
         this.id_class[3] = false;
         this.id_class[4] = 0;
         this.id_class[5] = 0;
      }
   }

   private static void id_catch() {
      id_protected = new byte[]{3, 2, 6, 2, 3, 4, 5};
   }

   private static void id_case() {
      id_case = new float[]{0.91F, 0.16277136F, 0.2F, 0.0269F, 0.0255F, 1.0F, 0.9F, 0.02F, 0.0F, 0.9F, 0.019F, 0.0F, 0.05F, 0.001F, 0.002F, 1.3F, 0.91F};
   }

   private static void id_implements() {
      id_throws = new short[]{
         0,
         2,
         1,
         3,
         57,
         13,
         3,
         57,
         57,
         57,
         1,
         57,
         5,
         5,
         5,
         5,
         5,
         57,
         57,
         17,
         57,
         57,
         42,
         57,
         17,
         5,
         57,
         23,
         4,
         4,
         2,
         3,
         0,
         57,
         13,
         0,
         7,
         1,
         2,
         1,
         2,
         3,
         3,
         4,
         5
      };
   }

   public double id_protected() {
      return (Double)this.id_class[id_throws[38]];
   }

   private static void id_private() {
      id_byte = new boolean[]{
         true, false, false, true, false, false, true, true, true, false, false, true, true, true, false, false, false, true, false, false, false
      };
   }
}
