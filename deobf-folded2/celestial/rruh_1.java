package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruh_1 implements rruO {
   private static double[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static float[] id_throws;
   private static byte[] id_case;

   @Override
   public void id_byte() {
      float var1 = 0.05F;
      rrux_1 var2 = ((rrux_1)this.id_class[2]).id_break().id_break((Float)this.id_class[3] * 0.05F);
      rrux_1 var3 = new rrux_1(0.0F, 0.0F);

      for (rruX var5 : (List)this.id_class[0]) {
         if (!(Boolean)var5.id_class[2]) {
            var3.id_byte((rrux_1)var5.id_class[0]);
            ((rrux_1)var5.id_class[0]).id_class(var2);
            ((rrux_1)var5.id_class[1]).id_byte(var3);
         }
      }

      rruX var21 = (rruX)((List)this.id_class[0]).get(0);

      for (rruX var6 : (List)this.id_class[0]) {
         if (var6 != var21 && (Float)((rrux_1)var6.id_class[0]).id_class[0] - (Float)((rrux_1)var21.id_class[0]).id_class[0] > 0.0F) {
            rrux_1 var10000 = (rrux_1)var6.id_class[0];
            Float var15 = (Float)((rrux_1)var21.id_class[0]).id_class[0];
            var10000.id_class[0] = var15;
         }
      }

      for (int var23 = ((List)this.id_class[0]).size() - 2; var23 >= 1; var23--) {
         double var26 = this.id_class(
            (rrux_1)((rruX)((List)this.id_class[0]).get(var23)).id_class[0],
            (rrux_1)((rruX)((List)this.id_class[0]).get(var23 - 1)).id_class[0],
            (rrux_1)((rruX)((List)this.id_class[0]).get(var23 + 1)).id_class[0]
         );
         var26 *= 57.2958;
         if (var26 > 360.0) {
            var26 -= 360.0;
         }

         if (var26 < -360.0) {
            var26 += 360.0;
         }

         double var8 = Math.abs(var26);
         if (var8 < (double)(180.0F - (Float)this.id_class[5])) {
            rrux_1 var10 = this.id_class(
               (rrux_1)((rruX)((List)this.id_class[0]).get(var23)).id_class[0],
               (rrux_1)((rruX)((List)this.id_class[0]).get(var23 - 1)).id_class[0],
               var26,
               (double)(180.0F - (Float)this.id_class[5] + 1.0F)
            );
            ((rruX)((List)this.id_class[0]).get(var23 + 1)).id_class[0] = var10;
         }

         if (var8 > (double)(180.0F + (Float)this.id_class[5])) {
            rrux_1 var32 = this.id_class(
               (rrux_1)((rruX)((List)this.id_class[0]).get(var23)).id_class[0],
               (rrux_1)((rruX)((List)this.id_class[0]).get(var23 - 1)).id_class[0],
               var26,
               (double)(180.0F + (Float)this.id_class[5] - 1.0F)
            );
            ((rruX)((List)this.id_class[0]).get(var23 + 1)).id_class[0] = var32;
         }
      }

      for (int var24 = id_byte[15]; var24 < this.id_class[4]; var24++) {
         for (int var28 = ((List)this.id_class[1]).size() - 1; var28 >= 0; var28--) {
            rruJ var7 = (rruJ)((List)this.id_class[1]).get(var28);
            rrux_1 var31 = ((rrux_1)((rruX)var7.id_class[0]).id_class[0]).id_break().id_class((rrux_1)((rruX)var7.id_class[1]).id_class[0]).id_class(2.0F);
            rrux_1 var9 = ((rrux_1)((rruX)var7.id_class[0]).id_class[0]).id_break().id_break((rrux_1)((rruX)var7.id_class[1]).id_class[0]).id_class();
            if (!(Boolean)((rruX)var7.id_class[0]).id_class[2]) {
               rruX var33 = (rruX)var7.id_class[0];
               rrux_1 var18 = var31.id_break().id_class(var9.id_break().id_break((Float)var7.id_class[2] / 2.0F));
               var33.id_class[0] = var18;
            }

            if (!(Boolean)((rruX)var7.id_class[1]).id_class[2]) {
               rruX var34 = (rruX)var7.id_class[1];
               rrux_1 var19 = var31.id_break().id_break(var9.id_break().id_break((Float)var7.id_class[2] / 2.0F));
               var34.id_class[0] = var19;
            }
         }
      }

      for (int var25 = id_byte[17]; var25 < ((List)this.id_class[1]).size(); var25++) {
         rruJ var29 = (rruJ)((List)this.id_class[1]).get(var25);
         rrux_1 var30 = ((rrux_1)((rruX)var29.id_class[0]).id_class[0]).id_break().id_break((rrux_1)((rruX)var29.id_class[1]).id_class[0]).id_class();
         if (!(Boolean)((rruX)var29.id_class[1]).id_class[2]) {
            rruX var35 = (rruX)var29.id_class[1];
            rrux_1 var20 = ((rrux_1)((rruX)var29.id_class[0]).id_class[0]).id_break().id_break(var30.id_break((Float)var29.id_class[2]));
            var35.id_class[0] = var20;
         }
      }
   }

   public rruh_1() {
      this.id_case();
      ArrayList var5 = new ArrayList();
      this.id_class[0] = var5;
      ArrayList var6 = new ArrayList();
      this.id_class[1] = var6;
      rrux_1 var7 = new rrux_1(0.0F, -1.0F);
      this.id_class[2] = var7;
      Float var8 = (float)((Integer)((rruE)rruS.id_class[0]).id_class[4]).intValue();
      this.id_class[3] = var8;
      Integer var9 = 30;
      this.id_class[4] = var9;
      Float var10 = 5.0F;
      this.id_class[5] = var10;
      Boolean var11 = false;
      this.id_class[6] = var11;
   }

   static {
      ntfClinit();
   }

   private rrux_1 id_class(rrux_1 var1, rrux_1 var2, double var3, double var5) {
      double var7 = var5 / 57.2958;
      float var9 = (Float)var2.id_class[0] - (Float)var1.id_class[0];
      float var10 = (Float)var2.id_class[1] - (Float)var1.id_class[1];
      if (var3 < 0.0) {
         var7 *= -1.0;
      }

      double var11 = Math.cos(var7);
      double var13 = Math.sin(var7);
      return new rrux_1(
         (float)((double)var9 * var11 - (double)var10 * var13 + (double)((Float)var1.id_class[0]).floatValue()),
         (float)((double)var9 * var13 + (double)var10 * var11 + (double)((Float)var1.id_class[1]).floatValue())
      );
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6755143061304025565L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{39, 40, 54, 15, 40, -68, -121, 71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private double id_class(rrux_1 var1, rrux_1 var2, rrux_1 var3) {
      return Math.atan2((double)((Float)var3.id_class[1] - (Float)var1.id_class[1]), (double)((Float)var3.id_class[0] - (Float)var1.id_class[0]))
         - Math.atan2((double)((Float)var2.id_class[1] - (Float)var1.id_class[1]), (double)((Float)var2.id_class[0] - (Float)var1.id_class[0]));
   }

   @Override
   public void id_class(rrub_1 var1) {
      ((rrux_1)((rruX)((List)this.id_class[0]).get(0)).id_class[1]).id_byte((rrux_1)((rruX)((List)this.id_class[0]).get(0)).id_class[0]);
      ((rrux_1)((rruX)((List)this.id_class[0]).get(0)).id_class[0]).id_class(new rrux_1((Float)var1.id_class[0], (Float)var1.id_class[1]));
   }

   @Override
   public float id_class() {
      return (Float)this.id_class[3];
   }

   @Override
   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[3] = var6;
   }

   @Override
   public boolean id_class(int var1) {
      if (((List)this.id_class[0]).size() != var1) {
         ((List)this.id_class[0]).clear();
         ((List)this.id_class[1]).clear();

         for (int var2 = 0; var2 < var1; var2++) {
            rruX var3 = new rruX();
            rrux_1 var10000 = (rrux_1)var3.id_class[0];
            Float var8 = (float)(-var2);
            var10000.id_class[1] = var8;
            Boolean var9 = var2 == 0 ? true : id_byte[3];
            var3.id_class[2] = var9;
            ((List)this.id_class[0]).add(var3);
            if (var2 > 0) {
               ((List)this.id_class[1]).add(new rruJ((rruX)((List)this.id_class[0]).get(var2 - 1), var3, 1.0F));
            }
         }

         return id_byte[5];
      } else {
         return id_byte[6];
      }
   }

   @Override
   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[6] = var6;
   }

   @Override
   public boolean id_break() {
      return ((List)this.id_class[1]).isEmpty();
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1770446063;
   }

   @Override
   public void id_break(rrub_1 var1) {
      rrux_1 var10000 = (rrux_1)this.id_class[2];
      Float var6 = (Float)var1.id_class[0];
      var10000.id_class[0] = var6;
      var10000 = (rrux_1)this.id_class[2];
      Float var7 = (Float)var1.id_class[1];
      var10000.id_class[1] = var7;
   }

   @Override
   public boolean id_throws() {
      return (Boolean)this.id_class[6];
   }

   private static void id_finally() {
      id_break = new double[]{57.2958, 360.0, 360.0, -360.0, 360.0, 57.2958, 0.0, -1.0};
   }

   private static void id_catch() {
      id_throws = new float[]{
         0.0F, -1.0F, 5.0F, 1.0F, 0.05F, 0.05F, 0.0F, 0.0F, 0.0F, 180.0F, 180.0F, 1.0F, 180.0F, 180.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F
      };
   }

   private static void id_extends() {
      id_protected = new short[]{
         0,
         1,
         2,
         0,
         4,
         3,
         4,
         5,
         6,
         0,
         0,
         1,
         0,
         1,
         2,
         0,
         1,
         0,
         2,
         3,
         0,
         2,
         0,
         0,
         1,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         5,
         0,
         0,
         0,
         0,
         5,
         0,
         0,
         5,
         0,
         0,
         0,
         0,
         5,
         0,
         0,
         4,
         1,
         1,
         0,
         0,
         1,
         0,
         0,
         0,
         1,
         0,
         0,
         2,
         0,
         2,
         0,
         1,
         2,
         1,
         2,
         0,
         1,
         1,
         0,
         0,
         1,
         0,
         1,
         2,
         1,
         0,
         0,
         2,
         0,
         0,
         0,
         1,
         1,
         0,
         1,
         1,
         1,
         0,
         0,
         1,
         1,
         0,
         0,
         2,
         0,
         0,
         2,
         1,
         1,
         3,
         3,
         6,
         6,
         0,
         1,
         0,
         0,
         0,
         0,
         0,
         1,
         1,
         0
      };
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[7];
         Object[] var1 = this.id_class;
         var1[3] = 0.0F;
         var1[4] = 0;
         var1[5] = 0.0F;
         var1[6] = false;
      }
   }

   private static void id_implements() {
      id_byte = new boolean[]{
         false, false, true, false, true, true, false, false, true, true, true, true, true, true, true, false, true, false, false, false, false, false, false
      };
   }

   @Override
   public List<rruG> id_protected() {
      return (List<rruG>)this.id_class[0];
   }

   private static void id_private() {
      id_case = new byte[]{30, 2, 7, 3, 4, 5, 6};
   }
}
