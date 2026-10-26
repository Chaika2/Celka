package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrud_1 implements rruO {
   private static float[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   private static double[] id_case;

   @Override
   public void id_byte() {
      this.id_int();
      this.id_private();
      this.id_implements();
      this.id_final();
      this.id_implements();
      this.id_case();
      this.id_native();
   }

   private void id_int() {
      float var1 = 0.05F;
      rrub_1 var2 = ((rrub_1)this.id_class[2]).id_byte().id_break((Float)this.id_class[3] * 0.05F);
      rrub_1 var3 = new rrub_1(0.0F, 0.0F, 0.0F);

      for (rruk_1 var5 : (List)this.id_class[0]) {
         if (!(Boolean)var5.id_class[2]) {
            var3.id_byte((rrub_1)var5.id_class[0]);
            ((rrub_1)var5.id_class[0]).id_class(var2);
            ((rrub_1)var5.id_class[1]).id_byte(var3);
         }
      }
   }

   public rrud_1() {
      this.id_extends();
      ArrayList var5 = new ArrayList();
      this.id_class[0] = var5;
      ArrayList var6 = new ArrayList();
      this.id_class[1] = var6;
      rrub_1 var7 = new rrub_1(0.0F, -1.0F, 0.0F);
      this.id_class[2] = var7;
      Float var8 = (float)((Integer)((rruE)rruS.id_class[0]).id_class[4]).intValue();
      this.id_class[3] = var8;
      Integer var9 = 30;
      this.id_class[4] = var9;
      Float var10 = 20.0F;
      this.id_class[5] = var10;
      Boolean var11 = false;
      this.id_class[6] = var11;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(int var1) {
      if (((List)this.id_class[0]).size() != var1) {
         ((List)this.id_class[0]).clear();
         ((List)this.id_class[1]).clear();

         for (int var2 = 0; var2 < var1; var2++) {
            rruk_1 var3 = new rruk_1();
            rrub_1 var10000 = (rrub_1)var3.id_class[0];
            Float var8 = (float)(-var2);
            var10000.id_class[1] = var8;
            var10000 = (rrub_1)var3.id_class[0];
            Float var9 = (float)(-var2);
            var10000.id_class[0] = var9;
            Boolean var10 = var2 == 0 ? true : id_throws[3];
            var3.id_class[2] = var10;
            ((List)this.id_class[0]).add(var3);
            if (var2 > 0) {
               ((List)this.id_class[1]).add(new rruW((rruk_1)((List)this.id_class[0]).get(var2 - 1), var3, 1.0F));
            }
         }

         return id_throws[5];
      } else {
         return id_throws[6];
      }
   }

   @Override
   public void id_class(rrub_1 var1) {
      ((rrub_1)((rruk_1)((List)this.id_class[0]).get(0)).id_class[1]).id_byte((rrub_1)((rruk_1)((List)this.id_class[0]).get(0)).id_class[0]);
      ((rrub_1)((rruk_1)((List)this.id_class[0]).get(0)).id_class[0]).id_class(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4755344464434380591L;
   }

   @Override
   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[3] = var6;
   }

   private rrub_1 id_class(rrub_1 var1, rrub_1 var2, double var3) {
      rrub_1 var5 = var1.id_byte().id_break(var2);
      var5.id_class((float)var3).id_class(var1);
      return var5;
   }

   @Override
   public float id_class() {
      return (Float)this.id_class[3];
   }

   @Override
   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[6] = var6;
   }

   private double id_class(rrub_1 var1, rrub_1 var2, rrub_1 var3) {
      float var4 = (Float)var2.id_class[0] - (Float)var1.id_class[0];
      float var5 = (Float)var2.id_class[1] - (Float)var1.id_class[1];
      float var6 = (Float)var2.id_class[0] - (Float)var3.id_class[0];
      float var7 = (Float)var2.id_class[1] - (Float)var3.id_class[1];
      float var8 = var4 * var6 + var5 * var7;
      float var9 = var4 * var7 - var5 * var6;
      double var10 = rfU_2.id_protected((double)var9, (double)var8);
      return var10 * 180.0 / Math.PI;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, 121, 97, 66, -117, -98, -3, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(rrub_1 var1) {
      this.id_class[2] = var1;
   }

   @Override
   public boolean id_break() {
      return ((List)this.id_class[1]).isEmpty();
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 692486837;
   }

   @Override
   public boolean id_throws() {
      return (Boolean)this.id_class[6];
   }

   private static void id_finally() {
      id_break = new float[]{
         0.0F, -1.0F, 0.0F, 20.0F, 1.0F, 0.05F, 0.05F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.5F, 0.5F, 2.0F, 2.0F, 0.0F, 5.0F, 0.0F, 0.0F
      };
   }

   private static void id_catch() {
      id_throws = new boolean[]{
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[7];
         Object[] var1 = this.id_class;
         var1[3] = 0.0F;
         var1[4] = 0;
         var1[5] = 0.0F;
         var1[6] = false;
      }
   }

   private void id_case() {
      for (int var1 = 1; var1 < ((List)this.id_class[0]).size() - 2; var1++) {
         double var2 = this.id_class(
            (rrub_1)((rruk_1)((List)this.id_class[0]).get(var1)).id_class[0],
            (rrub_1)((rruk_1)((List)this.id_class[0]).get(var1 - 1)).id_class[0],
            (rrub_1)((rruk_1)((List)this.id_class[0]).get(var1 + 1)).id_class[0]
         );
         if (var2 < (double)(-(Float)this.id_class[5])) {
            rrub_1 var4 = this.id_class(
               (rrub_1)((rruk_1)((List)this.id_class[0]).get(var1)).id_class[0],
               (rrub_1)((rruk_1)((List)this.id_class[0]).get(var1 - 1)).id_class[0],
               (double)(-(Float)this.id_class[5] * 2.0F)
            );
            ((rruk_1)((List)this.id_class[0]).get(var1 + 1)).id_class[0] = var4;
         }

         if (var2 > (double)((Float)this.id_class[5]).floatValue()) {
            rrub_1 var11 = this.id_class(
               (rrub_1)((rruk_1)((List)this.id_class[0]).get(var1)).id_class[0],
               (rrub_1)((rruk_1)((List)this.id_class[0]).get(var1 - 1)).id_class[0],
               (double)((Float)this.id_class[5] * 2.0F)
            );
            ((rruk_1)((List)this.id_class[0]).get(var1 + 1)).id_class[0] = var11;
         }
      }
   }

   private void id_implements() {
      boolean var1 = false;
      int var2 = 0;

      do {
         var1 = id_throws[12];

         for (int var3 = 0; var3 < ((List)this.id_class[0]).size(); var3++) {
            for (int var4 = var3 + 1; var4 < ((List)this.id_class[0]).size(); var4++) {
               rruk_1 var5 = (rruk_1)((List)this.id_class[0]).get(var3);
               rruk_1 var6 = (rruk_1)((List)this.id_class[0]).get(var4);
               rrub_1 var7 = ((rrub_1)var5.id_class[0]).id_byte().id_break((rrub_1)var6.id_class[0]);
               if ((double)var7.id_class() < 0.99) {
                  var1 = true;
                  var2++;
                  var7.id_break();
                  rrub_1 var8 = ((rrub_1)var5.id_class[0]).id_byte().id_class((rrub_1)var6.id_class[0]).id_byte(2.0F);
                  if (!(Boolean)var5.id_class[2]) {
                     rrub_1 var13 = var8.id_byte().id_class(var7.id_byte().id_break(0.5F));
                     var5.id_class[0] = var13;
                  }

                  if (!(Boolean)var6.id_class[2]) {
                     rrub_1 var14 = var8.id_byte().id_break(var7.id_byte().id_break(0.5F));
                     var6.id_class[0] = var14;
                  }
               }
            }
         }
      } while (var1 && var2 < 32);
   }

   private static void id_new() {
      id_protected = new byte[]{30, 32, 2, 7, 3, 4, 5, 6};
   }

   private static void id_package() {
      id_byte = new short[]{
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
         0,
         0,
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
         0,
         0,
         0,
         0,
         0,
         0,
         2,
         0,
         2,
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
         2,
         0,
         2,
         0,
         0,
         2,
         2,
         0,
         0,
         2,
         2,
         0,
         0,
         1,
         1,
         0,
         0,
         1,
         1,
         2,
         3,
         3,
         6,
         6,
         1,
         0,
         1,
         0,
         0,
         0,
         0,
         0
      };
   }

   @Override
   public List<rruG> id_protected() {
      return (List<rruG>)this.id_class[0];
   }

   private void id_private() {
      rruk_1 var1 = (rruk_1)((List)this.id_class[0]).get(0);

      for (int var2 = 1; var2 < ((List)this.id_class[0]).size(); var2++) {
         rruk_1 var3 = (rruk_1)((List)this.id_class[0]).get(var2);
         if ((Float)((rrub_1)var3.id_class[0]).id_class[0] - (Float)((rrub_1)var1.id_class[0]).id_class[0] > 0.0F) {
            rrub_1 var10000 = (rrub_1)var3.id_class[0];
            Float var10 = (Float)((rrub_1)var1.id_class[0]).id_class[0];
            var10000.id_class[0] = var10;
         }

         float var4 = (float)var2 / (float)((List)this.id_class[0]).size() * ((float)var2 / (float)((List)this.id_class[0]).size()) * 5.0F;
         float var5 = (Float)((rrub_1)var1.id_class[0]).id_class[2] - (Float)((rrub_1)var3.id_class[0]).id_class[2];
         if (var5 > var4) {
            rrub_1 var13 = (rrub_1)var3.id_class[0];
            Float var11 = (Float)((rrub_1)var1.id_class[0]).id_class[2] - var4;
            var13.id_class[2] = var11;
         }

         if (var5 < -var4) {
            rrub_1 var14 = (rrub_1)var3.id_class[0];
            Float var12 = (Float)((rrub_1)var1.id_class[0]).id_class[2] + var4;
            var14.id_class[2] = var12;
         }
      }
   }

   private void id_final() {
      for (int var1 = 0; var1 < this.id_class[4]; var1++) {
         for (int var2 = ((List)this.id_class[1]).size() - 1; var2 >= 0; var2--) {
            rruW var3 = (rruW)((List)this.id_class[1]).get(var2);
            rrub_1 var4 = ((rrub_1)((rruk_1)var3.id_class[0]).id_class[0]).id_byte().id_class((rrub_1)((rruk_1)var3.id_class[1]).id_class[0]).id_byte(2.0F);
            rrub_1 var5 = ((rrub_1)((rruk_1)var3.id_class[0]).id_class[0]).id_byte().id_break((rrub_1)((rruk_1)var3.id_class[1]).id_class[0]).id_break();
            if (!(Boolean)((rruk_1)var3.id_class[0]).id_class[2]) {
               rruk_1 var10000 = (rruk_1)var3.id_class[0];
               rrub_1 var10 = var4.id_byte().id_class(var5.id_byte().id_break((Float)var3.id_class[2] / 2.0F));
               var10000.id_class[0] = var10;
            }

            if (!(Boolean)((rruk_1)var3.id_class[1]).id_class[2]) {
               rruk_1 var12 = (rruk_1)var3.id_class[1];
               rrub_1 var11 = var4.id_byte().id_break(var5.id_byte().id_break((Float)var3.id_class[2] / 2.0F));
               var12.id_class[0] = var11;
            }
         }
      }
   }

   private static void id_volatile() {
      id_case = new double[]{0.99, 180.0, Math.PI};
   }

   private void id_native() {
      for (int var1 = 0; var1 < ((List)this.id_class[1]).size(); var1++) {
         rruW var2 = (rruW)((List)this.id_class[1]).get(var1);
         rrub_1 var3 = ((rrub_1)((rruk_1)var2.id_class[0]).id_class[0]).id_byte().id_break((rrub_1)((rruk_1)var2.id_class[1]).id_class[0]).id_break();
         if (!(Boolean)((rruk_1)var2.id_class[1]).id_class[2]) {
            rruk_1 var10000 = (rruk_1)var2.id_class[1];
            rrub_1 var8 = ((rrub_1)((rruk_1)var2.id_class[0]).id_class[0]).id_byte().id_break(var3.id_break((Float)var2.id_class[2]));
            var10000.id_class[0] = var8;
         }
      }
   }
}
