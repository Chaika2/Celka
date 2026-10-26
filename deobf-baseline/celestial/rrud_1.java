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
      float var1 = id_break[5];
      rrub_1 var2 = ((rrub_1)this.id_class[id_byte[20]]).id_byte().id_break((Float)this.id_class[id_byte[21]] * id_break[6]);
      rrub_1 var3 = new rrub_1(id_break[7], id_break[8], id_break[9]);

      for (rruk_1 var5 : (List)this.id_class[id_byte[22]]) {
         if (!(Boolean)var5.id_class[id_byte[23]]) {
            var3.id_byte((rrub_1)var5.id_class[id_byte[24]]);
            ((rrub_1)var5.id_class[id_byte[25]]).id_class(var2);
            ((rrub_1)var5.id_class[id_byte[26]]).id_byte(var3);
         }
      }
   }

   public rrud_1() {
      this.id_extends();
      ArrayList var5 = new ArrayList();
      this.id_class[id_byte[0]] = var5;
      ArrayList var6 = new ArrayList();
      this.id_class[id_byte[1]] = var6;
      rrub_1 var7 = new rrub_1(id_break[0], id_break[1], id_break[2]);
      this.id_class[id_byte[2]] = var7;
      Float var8 = (float)((Integer)((rruE)rruS.id_class[id_byte[3]]).id_class[id_byte[4]]).intValue();
      this.id_class[id_byte[5]] = var8;
      Integer var9 = Integer.valueOf(id_protected[0]);
      this.id_class[id_byte[6]] = var9;
      Float var10 = id_break[3];
      this.id_class[id_byte[7]] = var10;
      Boolean var11 = id_throws[0];
      this.id_class[id_byte[8]] = var11;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(int var1) {
      if (((List)this.id_class[id_byte[9]]).size() != var1) {
         ((List)this.id_class[id_byte[10]]).clear();
         ((List)this.id_class[id_byte[11]]).clear();

         for (int var2 = id_throws[1]; var2 < var1; var2++) {
            rruk_1 var3 = new rruk_1();
            rrub_1 var10000 = (rrub_1)var3.id_class[id_byte[12]];
            Float var8 = (float)(-var2);
            var10000.id_class[id_byte[13]] = var8;
            var10000 = (rrub_1)var3.id_class[id_byte[14]];
            Float var9 = (float)(-var2);
            var10000.id_class[id_byte[15]] = var9;
            Boolean var10 = var2 == 0 ? id_throws[2] : id_throws[3];
            var3.id_class[id_byte[16]] = var10;
            ((List)this.id_class[id_byte[17]]).add(var3);
            if (var2 > 0) {
               ((List)this.id_class[id_byte[18]]).add(new rruW((rruk_1)((List)this.id_class[id_byte[19]]).get(var2 - id_throws[4]), var3, id_break[4]));
            }
         }

         return id_throws[5];
      } else {
         return id_throws[6];
      }
   }

   @Override
   public void id_class(rrub_1 var1) {
      ((rrub_1)((rruk_1)((List)this.id_class[id_byte[135]]).get(id_throws[25])).id_class[id_byte[136]])
         .id_byte((rrub_1)((rruk_1)((List)this.id_class[id_byte[137]]).get(id_throws[26])).id_class[id_byte[138]]);
      ((rrub_1)((rruk_1)((List)this.id_class[id_byte[139]]).get(id_throws[27])).id_class[id_byte[140]]).id_class(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4755344464434380591L;
   }

   @Override
   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[id_byte[131]] = var6;
   }

   private rrub_1 id_class(rrub_1 var1, rrub_1 var2, double var3) {
      rrub_1 var5 = var1.id_byte().id_break(var2);
      var5.id_class((float)var3).id_class(var1);
      return var5;
   }

   @Override
   public float id_class() {
      return (Float)this.id_class[id_byte[130]];
   }

   @Override
   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[id_byte[133]] = var6;
   }

   private double id_class(rrub_1 var1, rrub_1 var2, rrub_1 var3) {
      float var4 = (Float)var2.id_class[id_byte[121]] - (Float)var1.id_class[id_byte[122]];
      float var5 = (Float)var2.id_class[id_byte[123]] - (Float)var1.id_class[id_byte[124]];
      float var6 = (Float)var2.id_class[id_byte[125]] - (Float)var3.id_class[id_byte[126]];
      float var7 = (Float)var2.id_class[id_byte[127]] - (Float)var3.id_class[id_byte[128]];
      float var8 = var4 * var6 + var5 * var7;
      float var9 = var4 * var7 - var5 * var6;
      double var10 = rfU_2.id_protected((double)var9, (double)var8);
      return var10 * id_case[1] / id_case[2];
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
      this.id_class[id_byte[129]] = var1;
   }

   @Override
   public boolean id_break() {
      return ((List)this.id_class[id_byte[134]]).isEmpty();
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 692486837;
   }

   @Override
   public boolean id_throws() {
      return (Boolean)this.id_class[id_byte[132]];
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
         this.id_class = new Object[id_protected[3]];
         Object[] var1 = this.id_class;
         var1[id_protected[4]] = id_break[20];
         var1[id_protected[5]] = Integer.valueOf(id_throws[28]);
         var1[id_protected[6]] = id_break[21];
         var1[id_protected[7]] = id_throws[29];
      }
   }

   private void id_case() {
      for (int var1 = id_throws[16]; var1 < ((List)this.id_class[id_byte[73]]).size() - id_protected[2]; var1++) {
         double var2 = this.id_class(
            (rrub_1)((rruk_1)((List)this.id_class[id_byte[74]]).get(var1)).id_class[id_byte[75]],
            (rrub_1)((rruk_1)((List)this.id_class[id_byte[76]]).get(var1 - id_throws[17])).id_class[id_byte[77]],
            (rrub_1)((rruk_1)((List)this.id_class[id_byte[78]]).get(var1 + id_throws[18])).id_class[id_byte[79]]
         );
         if (var2 < (double)(-(Float)this.id_class[id_byte[80]])) {
            rrub_1 var4 = this.id_class(
               (rrub_1)((rruk_1)((List)this.id_class[id_byte[81]]).get(var1)).id_class[id_byte[82]],
               (rrub_1)((rruk_1)((List)this.id_class[id_byte[83]]).get(var1 - id_throws[19])).id_class[id_byte[84]],
               (double)(-(Float)this.id_class[id_byte[85]] * id_break[16])
            );
            ((rruk_1)((List)this.id_class[id_byte[86]]).get(var1 + id_throws[20])).id_class[id_byte[87]] = var4;
         }

         if (var2 > (double)((Float)this.id_class[id_byte[88]]).floatValue()) {
            rrub_1 var11 = this.id_class(
               (rrub_1)((rruk_1)((List)this.id_class[id_byte[89]]).get(var1)).id_class[id_byte[90]],
               (rrub_1)((rruk_1)((List)this.id_class[id_byte[91]]).get(var1 - id_throws[21])).id_class[id_byte[92]],
               (double)((Float)this.id_class[id_byte[93]] * id_break[17])
            );
            ((rruk_1)((List)this.id_class[id_byte[94]]).get(var1 + id_throws[22])).id_class[id_byte[95]] = var11;
         }
      }
   }

   private void id_implements() {
      boolean var1 = id_throws[10];
      int var2 = id_throws[11];

      do {
         var1 = id_throws[12];

         for (int var3 = id_throws[13]; var3 < ((List)this.id_class[id_byte[61]]).size(); var3++) {
            for (int var4 = var3 + id_throws[14]; var4 < ((List)this.id_class[id_byte[62]]).size(); var4++) {
               rruk_1 var5 = (rruk_1)((List)this.id_class[id_byte[63]]).get(var3);
               rruk_1 var6 = (rruk_1)((List)this.id_class[id_byte[64]]).get(var4);
               rrub_1 var7 = ((rrub_1)var5.id_class[id_byte[65]]).id_byte().id_break((rrub_1)var6.id_class[id_byte[66]]);
               if ((double)var7.id_class() < id_case[0]) {
                  var1 = id_throws[15];
                  var2++;
                  var7.id_break();
                  rrub_1 var8 = ((rrub_1)var5.id_class[id_byte[67]]).id_byte().id_class((rrub_1)var6.id_class[id_byte[68]]).id_byte(id_break[13]);
                  if (!(Boolean)var5.id_class[id_byte[69]]) {
                     rrub_1 var13 = var8.id_byte().id_class(var7.id_byte().id_break(id_break[14]));
                     var5.id_class[id_byte[70]] = var13;
                  }

                  if (!(Boolean)var6.id_class[id_byte[71]]) {
                     rrub_1 var14 = var8.id_byte().id_break(var7.id_byte().id_break(id_break[15]));
                     var6.id_class[id_byte[72]] = var14;
                  }
               }
            }
         }
      } while (var1 && var2 < id_protected[1]);
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
      return (List<rruG>)this.id_class[id_byte[141]];
   }

   private void id_private() {
      rruk_1 var1 = (rruk_1)((List)this.id_class[id_byte[96]]).get(id_throws[23]);

      for (int var2 = id_throws[24]; var2 < ((List)this.id_class[id_byte[97]]).size(); var2++) {
         rruk_1 var3 = (rruk_1)((List)this.id_class[id_byte[98]]).get(var2);
         if ((Float)((rrub_1)var3.id_class[id_byte[99]]).id_class[id_byte[100]] - (Float)((rrub_1)var1.id_class[id_byte[101]]).id_class[id_byte[102]]
            > id_break[18]) {
            rrub_1 var10000 = (rrub_1)var3.id_class[id_byte[103]];
            Float var10 = (Float)((rrub_1)var1.id_class[id_byte[104]]).id_class[id_byte[105]];
            var10000.id_class[id_byte[106]] = var10;
         }

         float var4 = (float)var2
            / (float)((List)this.id_class[id_byte[107]]).size()
            * ((float)var2 / (float)((List)this.id_class[id_byte[108]]).size())
            * id_break[19];
         float var5 = (Float)((rrub_1)var1.id_class[id_byte[109]]).id_class[id_byte[110]] - (Float)((rrub_1)var3.id_class[id_byte[111]]).id_class[id_byte[112]];
         if (var5 > var4) {
            rrub_1 var13 = (rrub_1)var3.id_class[id_byte[113]];
            Float var11 = (Float)((rrub_1)var1.id_class[id_byte[114]]).id_class[id_byte[115]] - var4;
            var13.id_class[id_byte[116]] = var11;
         }

         if (var5 < -var4) {
            rrub_1 var14 = (rrub_1)var3.id_class[id_byte[117]];
            Float var12 = (Float)((rrub_1)var1.id_class[id_byte[118]]).id_class[id_byte[119]] + var4;
            var14.id_class[id_byte[120]] = var12;
         }
      }
   }

   private void id_final() {
      for (int var1 = id_throws[7]; var1 < this.id_class[id_byte[27]]; var1++) {
         for (int var2 = ((List)this.id_class[id_byte[28]]).size() - id_throws[8]; var2 >= 0; var2--) {
            rruW var3 = (rruW)((List)this.id_class[id_byte[29]]).get(var2);
            rrub_1 var4 = ((rrub_1)((rruk_1)var3.id_class[id_byte[30]]).id_class[id_byte[31]])
               .id_byte()
               .id_class((rrub_1)((rruk_1)var3.id_class[id_byte[32]]).id_class[id_byte[33]])
               .id_byte(id_break[10]);
            rrub_1 var5 = ((rrub_1)((rruk_1)var3.id_class[id_byte[34]]).id_class[id_byte[35]])
               .id_byte()
               .id_break((rrub_1)((rruk_1)var3.id_class[id_byte[36]]).id_class[id_byte[37]])
               .id_break();
            if (!(Boolean)((rruk_1)var3.id_class[id_byte[38]]).id_class[id_byte[39]]) {
               rruk_1 var10000 = (rruk_1)var3.id_class[id_byte[40]];
               rrub_1 var10 = var4.id_byte().id_class(var5.id_byte().id_break((Float)var3.id_class[id_byte[41]] / id_break[11]));
               var10000.id_class[id_byte[42]] = var10;
            }

            if (!(Boolean)((rruk_1)var3.id_class[id_byte[43]]).id_class[id_byte[44]]) {
               rruk_1 var12 = (rruk_1)var3.id_class[id_byte[45]];
               rrub_1 var11 = var4.id_byte().id_break(var5.id_byte().id_break((Float)var3.id_class[id_byte[46]] / id_break[12]));
               var12.id_class[id_byte[47]] = var11;
            }
         }
      }
   }

   private static void id_volatile() {
      id_case = new double[]{0.99, 180.0, Math.PI};
   }

   private void id_native() {
      for (int var1 = id_throws[9]; var1 < ((List)this.id_class[id_byte[48]]).size(); var1++) {
         rruW var2 = (rruW)((List)this.id_class[id_byte[49]]).get(var1);
         rrub_1 var3 = ((rrub_1)((rruk_1)var2.id_class[id_byte[50]]).id_class[id_byte[51]])
            .id_byte()
            .id_break((rrub_1)((rruk_1)var2.id_class[id_byte[52]]).id_class[id_byte[53]])
            .id_break();
         if (!(Boolean)((rruk_1)var2.id_class[id_byte[54]]).id_class[id_byte[55]]) {
            rruk_1 var10000 = (rruk_1)var2.id_class[id_byte[56]];
            rrub_1 var8 = ((rrub_1)((rruk_1)var2.id_class[id_byte[57]]).id_class[id_byte[58]])
               .id_byte()
               .id_break(var3.id_break((Float)var2.id_class[id_byte[59]]));
            var10000.id_class[id_byte[60]] = var8;
         }
      }
   }
}
