package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bU_2 {
   private static float[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static double[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_case;
   private static int[] id_catch;

   private static void id_byte() {
      id_throws = new byte[]{-1, 9, 3};
   }

   public bU_2(cb_3 var1) {
      this.id_case();
      HashMap var9 = new HashMap();
      this.id_class[id_byte[0]] = var9;
      this.id_class[id_byte[1]] = var1;
      if ((Boolean)C_class.id_instanceof().ry.id_class[id_byte[2]]) {
         double var2 = this.id_break();
         Function var4 = var2x -> var2 * var2x;
         Function var11 = var4.compose(this::id_break);
         this.id_class[id_byte[3]] = var11;
      } else {
         Function var12 = this::id_break;
         this.id_class[id_byte[4]] = var12;
      }
   }

   static {
      ntfClinit();
   }

   public double id_class(xc_3 var1) {
      return (Double)((Map)this.id_class[id_byte[5]]).computeIfAbsent(var1.id_break(), (Function)this.id_class[id_byte[6]]);
   }

   public static double id_class(rdn_3 var0, xc_3 var1) {
      float var2;
      try {
         var2 = var1.id_private(null, null);
      } catch (NullPointerException var5) {
         return id_protected[2];
      }

      if (var2 < id_break[0]) {
         return id_protected[3];
      } else {
         float var3 = var0.id_class(var1);
         if (var3 > id_break[1]) {
            int var4 = eA_2.id_class(eY_2.id_this, var0);
            if (var4 > 0 && !var0.id_class()) {
               var3 += (float)(var4 * var4 + id_case[9]);
            }
         }

         var3 /= var2;
         return var1.id_new() && (var0.id_class() || !var0.id_break(var1)) ? (double)(var3 / id_break[3]) : (double)(var3 / id_break[2]);
      }
   }

   public int id_class(xd_3 var1, boolean var2, boolean var3) {
      if (!C_class.id_instanceof().id_protected() && var3) {
         return ((rhz_3)((cb_3)this.id_class[id_byte[7]]).id_implements[id_byte[8]]).id_protected;
      } else {
         int var4 = id_case[3];
         double var5 = id_protected[0];
         int var7 = id_catch[0];
         boolean var8 = id_case[4];
         xc_3 var9 = var1.id_continue();

         for (int var10 = id_case[5]; var10 < id_throws[1]; var10++) {
            rdn_3 var11 = ((rhz_3)((cb_3)this.id_class[id_byte[9]]).id_implements[id_byte[10]]).id_extends(var10);
            if (((Boolean)C_class.id_instanceof().rS.id_class[id_byte[11]] || !(var11.id_break() instanceof rkx_3))
               && (
                  !(Boolean)C_class.id_instanceof().Br.id_class[id_byte[12]]
                     || var11.id_catch() + (Integer)C_class.id_instanceof().V.id_class[id_byte[13]] < var11.id_private()
                     || var11.id_private() <= id_case[6]
               )) {
               double var12 = id_class(var11, var9);
               boolean var14 = this.id_class(var11);
               if (var12 > var5) {
                  var5 = var12;
                  var4 = var10;
                  var7 = this.id_break(var11);
                  var8 = var14;
               } else if (var12 == var5) {
                  int var15 = this.id_break(var11);
                  if (var15 < var7 && (var14 || !var8) || var2 && !var8 && var14) {
                     var5 = var12;
                     var4 = var10;
                     var7 = var15;
                     var8 = var14;
                  }
               }
            }
         }

         return var4;
      }
   }

   public boolean id_class(rdn_3 var1) {
      return eA_2.id_class(eY_2.id_else, var1) > 0 ? id_case[0] : id_case[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5877705170485491610L;
   }

   private static void id_class() {
      id_byte = new short[]{0, 2, 0, 1, 1, 0, 1, 2, 1, 2, 1, 0, 0, 0, 2, 1, 0, 0, 2, 2, 2, 2};
   }

   public int id_class(xd_3 var1, boolean var2) {
      return this.id_class(var1, var2, id_case[2]);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{0, 93, -125, 33, -4, -94, 49, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -688220717;
   }

   private double id_class(xd_3 var1) {
      return ((List)C_class.id_instanceof().p.id_class[id_byte[16]]).contains(var1)
         ? (Double)C_class.id_instanceof().rG.id_class[id_byte[17]]
         : id_protected[1];
   }

   private int id_break(rdn_3 var1) {
      if (var1.id_break() instanceof rkW_2) {
         rkW_2 var2 = (rkW_2)var1.id_break();
         return var2.id_private().id_protected();
      } else {
         return id_throws[0];
      }
   }

   private double id_break(xd_3 var1) {
      rdn_3 var2 = ((rhz_3)((cb_3)this.id_class[id_byte[14]]).id_implements[id_byte[15]]).id_extends(this.id_class(var1, id_case[7], id_case[8]));
      return id_class(var2, var1.id_continue()) * this.id_class(var1);
   }

   private double id_break() {
      double var1 = id_protected[4];
      if (((cb_3)this.id_class[id_byte[18]]).id_break(rLD.id_byte)) {
         var1 *= id_protected[5] + (double)(((cb_3)this.id_class[id_byte[19]]).id_byte(rLD.id_byte).id_byte() + id_case[10]) * id_protected[6];
      }

      if (((cb_3)this.id_class[id_byte[20]]).id_break(rLD.id_protected)) {
         switch (((cb_3)this.id_class[id_byte[21]]).id_byte(rLD.id_protected).id_byte()) {
            case 0:
               var1 *= id_protected[7];
               break;
            case 1:
               var1 *= id_protected[8];
               break;
            case 2:
               var1 *= id_protected[9];
               break;
            default:
               var1 *= id_protected[10];
         }
      }

      return var1;
   }

   private static void id_throws() {
      id_catch = new int[]{Integer.MIN_VALUE};
   }

   private static void id_catch() {
      id_protected = new double[]{Double.NEGATIVE_INFINITY, 1.0, -1.0, -1.0, 1.0, 1.0, 0.2, 0.3, 0.09, 0.0027, 8.1E-4};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[2]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_break = new float[]{0.0F, 1.0F, 30.0F, 100.0F};
   }

   private static void id_private() {
      id_case = new boolean[]{true, false, false, false, false, false, true, false, true, true, true};
   }
}
