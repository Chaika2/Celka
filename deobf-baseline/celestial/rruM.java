package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruM extends Tf_1<cG_2, wh_3<cG_2>> {
   private static short[] id_byte;
   private static float[] id_protected;
   private static byte[] id_throws;
   public Object[] id_class;
   private static double[] id_case;
   private static long[] id_catch;
   public static Object[] id_break;
   private static boolean[] id_private;

   private static void id_byte(Ok_1 var0, rjV_2 var1, rjV_2 var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      if (var3 < var6) {
         float var11 = var3;
         var3 = var6;
         var6 = var11;
      }

      if (var4 < var7) {
         float var17 = var4;
         var4 = var7;
         var7 = var17;
      }

      float var18 = id_protected[229];
      float var12 = id_protected[230];
      float var13 = id_protected[231];
      float var14 = id_protected[232];
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)id_break[id_byte[54]]).intValue();
      var14 = var13 + var16 * (float)(var9 + id_private[16]);
      var13 += var16 * (float)var9;
      var0.id_class(var2, var3, var7, var5)
         .id_class(id_protected[233], id_protected[234], id_protected[235], id_protected[236])
         .id_class(id_protected[237], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[238], id_protected[239], id_protected[240])
         .id_class();
      var0.id_class(var2, var6, var7, var5)
         .id_class(id_protected[241], id_protected[242], id_protected[243], id_protected[244])
         .id_class(id_protected[245], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[246], id_protected[247], id_protected[248])
         .id_class();
      var0.id_class(var1, var6, var4, var8)
         .id_class(id_protected[249], id_protected[250], id_protected[251], id_protected[252])
         .id_class(id_protected[253], var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[254], id_protected[255], id_protected[256])
         .id_class();
      var0.id_class(var1, var3, var4, var8)
         .id_class(id_protected[257], id_protected[258], id_protected[259], id_protected[260])
         .id_class(id_protected[261], var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[262], id_protected[263], id_protected[264])
         .id_class();
   }

   private void id_byte(Ml_1 var1, cG_2 var2, float var3, int var4) {
      rruO var5 = var2.id_throws();
      var1.id_class();
      rdn_3 var6 = var2.id_class(rXQ.CHEST);
      double var7 = !var6.id_class() ? id_case[0] : id_case[1];
      var1.id_class(id_case[2], id_case[3], var7);
      rruG var9 = var5.id_protected().get(id_private[6]);
      float var10 = var5.id_protected().get(var4).id_class(var3) - var9.id_class(var3);
      if (var10 > id_protected[32]) {
         var10 = id_protected[33];
      }

      float var11 = var9.id_protected(var3) - (float)var4 - var5.id_protected().get(var4).id_protected(var3);
      float var12 = var9.id_byte(var3) - var5.id_protected().get(var4).id_byte(var3);
      float var13 = id_protected[34];
      float var14 = this.id_class(var3, var4, var5);
      float var15 = id_protected[35];
      if (var2.x()) {
         var15 += id_protected[36];
         var1.id_class(id_case[4], id_case[5], id_case[6]);
      }

      float var16 = this.id_class(var4, var2.W());
      var1.id_class(rje_3.id_break.id_byte(id_protected[37] + var15 + var16));
      var1.id_class(rje_3.id_case.id_byte(id_protected[38]));
      var1.id_class(rje_3.id_protected.id_byte(id_protected[39]));
      var1.id_class(
         (double)(-var12 / (float)((Integer)id_break[id_byte[19]]).intValue()),
         (double)(var11 / (float)((Integer)id_break[id_byte[20]]).intValue()),
         (double)(var10 / (float)((Integer)id_break[id_byte[21]]).intValue())
      );
      var1.id_class(id_case[7], id_case[8], id_case[9]);
      var1.id_class(id_case[10], (double)((float)var4 * id_protected[40] / (float)((Integer)id_break[id_byte[22]]).intValue()), id_case[11]);
      var1.id_class(rje_3.id_break.id_byte(-var14));
      var1.id_class(id_case[12], (double)((float)(-var4) * id_protected[41] / (float)((Integer)id_break[id_byte[23]]).intValue()), id_case[13]);
      var1.id_class(id_case[14], id_case[15], id_case[16]);
   }

   public rruM(qE_2<cG_2, wh_3<cG_2>> var1) {
      super(var1);
      this.id_case();
      Iq_1[] var6 = new Iq_1[id_break[id_byte[0]]];
      this.id_class[id_byte[1]] = var6;
      Integer var7 = Integer.valueOf(id_throws[0]);
      id_break[id_byte[2]] = var7;
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, -19, -77, 113, -102, 118, 71, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_class(Ml_1 var1, cG_2 var2, float var3, int var4) {
      var1.id_class();
      var1.id_class(id_case[18], id_case[19], id_case[20]);
      double var5 = rfU_2.id_protected((double)var3, (Double)var2.id_implements[id_byte[27]], (Double)var2.id_implements[id_byte[28]])
         - rfU_2.id_protected((double)var3, (Double)var2.id_throws[id_byte[29]], var2.rx());
      double var7 = rfU_2.id_protected((double)var3, (Double)var2.id_implements[id_byte[30]], (Double)var2.id_implements[id_byte[31]])
         - rfU_2.id_protected((double)var3, (Double)var2.id_throws[id_byte[32]], var2.re());
      double var9 = rfU_2.id_protected((double)var3, (Double)var2.id_implements[id_byte[33]], (Double)var2.id_implements[id_byte[34]])
         - rfU_2.id_protected((double)var3, (Double)var2.id_throws[id_byte[35]], var2.BO());
      float var11 = (Float)var2.id_private[id_byte[36]] + (Float)var2.id_private[id_byte[37]] - (Float)var2.id_private[id_byte[38]];
      double var12 = (double)rfU_2.id_class(var11 * id_protected[42]);
      double var14 = (double)(-rfU_2.id_break(var11 * id_protected[43]));
      float var16 = (float)var7 * id_protected[44];
      var16 = rfU_2.id_class(var16, id_protected[45], id_protected[46]);
      float var17 = (float)(var5 * var12 + var9 * var14)
         * id_class(id_protected[47] / (float)((Integer)id_break[id_byte[39]]).intValue() * (float)var4)
         * id_protected[48];
      var17 = rfU_2.id_class(
         var17, id_protected[49], id_protected[50] * id_class(id_protected[51] / (float)((Integer)id_break[id_byte[40]]).intValue() * (float)var4)
      );
      float var18 = (float)(var5 * var14 - var9 * var12) * id_protected[52];
      var18 = rfU_2.id_class(var18, id_protected[53], id_protected[54]);
      float var19 = rfU_2.id_catch(var3, (Float)var2.id_implements[id_byte[41]], (Float)var2.id_implements[id_byte[42]]);
      var16 += rfU_2.id_class(rfU_2.id_catch(var3, (Float)var2.id_throws[id_byte[43]], (Float)var2.id_throws[id_byte[44]]) * id_protected[55])
         * id_protected[56]
         * var19;
      if (var2.x()) {
         var16 += id_protected[57];
         var1.id_class(id_case[21], id_case[22], id_case[23]);
      }

      float var20 = this.id_class(var4, var2.W());
      var1.id_class(rje_3.id_break.id_byte(id_protected[58] + var17 / id_protected[59] + var16 + var20));
      var1.id_class(rje_3.id_case.id_byte(var18 / id_protected[60]));
      var1.id_class(rje_3.id_protected.id_byte(id_protected[61] - var18 / id_protected[62]));
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.id_super() && !var4.Pp() && var4.id_class(rhQ_2.CAPE) && var4.id_case() != null) {
         rdn_3 var11 = var4.id_class(rXQ.CHEST);
         if (var11.id_break() != rdy_3.kc) {
            var1.id_class();
            var1.id_class(id_case[27], id_case[28], id_case[29]);
            double var12 = rfU_2.id_protected((double)var7, (Double)var4.id_implements[id_byte[58]], (Double)var4.id_implements[id_byte[59]])
               - rfU_2.id_protected((double)var7, (Double)var4.id_throws[id_byte[60]], var4.rx());
            double var14 = rfU_2.id_protected((double)var7, (Double)var4.id_implements[id_byte[61]], (Double)var4.id_implements[id_byte[62]])
               - rfU_2.id_protected((double)var7, (Double)var4.id_throws[id_byte[63]], var4.re());
            double var16 = rfU_2.id_protected((double)var7, (Double)var4.id_implements[id_byte[64]], (Double)var4.id_implements[id_byte[65]])
               - rfU_2.id_protected((double)var7, (Double)var4.id_throws[id_byte[66]], var4.BO());
            float var18 = (Float)var4.id_private[id_byte[67]] + ((Float)var4.id_private[id_byte[68]] - (Float)var4.id_private[id_byte[69]]);
            double var19 = (double)rfU_2.id_class(var18 * id_protected[265]);
            double var21 = (double)(-rfU_2.id_break(var18 * id_protected[266]));
            float var23 = (float)var14 * id_protected[267];
            var23 = rfU_2.id_class(var23, id_protected[268], id_protected[269]);
            float var24 = (float)(var12 * var19 + var16 * var21) * id_protected[270];
            var24 = rfU_2.id_class(var24, id_protected[271], id_protected[272]);
            float var25 = (float)(var12 * var21 - var16 * var19) * id_protected[273];
            var25 = rfU_2.id_class(var25, id_protected[274], id_protected[275]);
            if (var24 < id_protected[276]) {
               var24 = id_protected[277];
            }

            if (var24 > id_protected[278]) {
               var24 = id_protected[279];
            }

            if (var23 < id_protected[280]) {
               var23 = id_protected[281];
            }

            float var26 = rfU_2.id_catch(var7, (Float)var4.id_implements[id_byte[70]], (Float)var4.id_implements[id_byte[71]]);
            var23 += rfU_2.id_class(rfU_2.id_catch(var7, (Float)var4.id_throws[id_byte[72]], (Float)var4.id_throws[id_byte[73]]) * id_protected[282])
               * id_protected[283]
               * var26;
            if (var4.x()) {
               var23 += id_protected[284];
            }

            float var27 = rrbb_3.rV() * id_protected[285];
            var27 = rrbb_3.id_class(var27, id_protected[286], id_protected[287]);
            Float var33 = rfU_2.id_catch(var27, (Float)var4.id_class[id_byte[74]], id_protected[288] + var24 / id_protected[289] + var23);
            var4.id_class[id_byte[75]] = var33;
            Float var34 = rfU_2.id_catch(var27, (Float)var4.id_class[id_byte[76]], var25 / id_protected[290]);
            var4.id_class[id_byte[77]] = var34;
            Float var35 = rfU_2.id_catch(var27, (Float)var4.id_class[id_byte[78]], id_protected[291] - var25 / id_protected[292]);
            var4.id_class[id_byte[79]] = var35;
            var1.id_class(rje_3.id_break.id_byte((Float)var4.id_class[id_byte[80]]));
            var1.id_class(rje_3.id_case.id_byte((Float)var4.id_class[id_byte[81]]));
            var1.id_class(rje_3.id_protected.id_byte((Float)var4.id_class[id_byte[82]]));
            Ok_1 var28 = var2.getBuffer(HU.id_break(var4.id_case()));
            this.id_byte().id_break(var1, var28, var3, fZ_2.id_class);
            var1.id_break();
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6198417313134540206L;
   }

   private static float id_class(float var0) {
      return rfU_2.id_class((float)((double)var0 * id_case[25] / id_case[26]));
   }

   private rrci_3 id_class(cG_2 var1, Hx_1 var2) {
      if (var1.id_super() && var1.id_class(rhQ_2.CAPE) && var1.id_case() != null) {
         rruB var10000 = (rruB)id_break[id_byte[55]];
         Ok_1 var7 = var2.getBuffer(HU.id_byte(var1.id_case()));
         var10000.id_class[id_byte[56]] = var7;
         return (rruB)id_break[id_byte[57]];
      } else {
         return null;
      }
   }

   private static void id_class(
      cG_2 var0, Ok_1 var1, rjV_2 var2, rjV_2 var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11
   ) {
      if (var4 < var7) {
         float var12 = var4;
         var4 = var7;
         var7 = var12;
      }

      if (var5 < var8) {
         float var19 = var5;
         var5 = var8;
         var8 = var19;
         rjV_2 var13 = var2;
         var2 = var3;
         var3 = var13;
      }

      float var20 = id_protected[65];
      float var21 = id_protected[66];
      float var14 = id_protected[67];
      float var15 = id_protected[68];
      float var16 = var15 - var14;
      float var17 = var16 / (float)((Integer)id_break[id_byte[49]]).intValue();
      var15 = var14 + var17 * (float)(var10 + id_private[11]);
      var14 += var17 * (float)var10;
      byte var18 = id_throws[5];
      var1.id_class(var3, var4, var8, var6)
         .id_class(var18)
         .id_class(id_protected[69], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var11)
         .id_class(id_protected[70], id_protected[71], id_protected[72])
         .id_class();
      var1.id_class(var3, var7, var8, var6)
         .id_class(var18)
         .id_class(id_protected[73], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var11)
         .id_class(id_protected[74], id_protected[75], id_protected[76])
         .id_class();
      var1.id_class(var2, var7, var5, var9)
         .id_class(var18)
         .id_class(id_protected[77], var15)
         .id_byte(fZ_2.id_class)
         .id_break(var11)
         .id_class(id_protected[78], id_protected[79], id_protected[80])
         .id_class();
      var1.id_class(var2, var4, var5, var9)
         .id_class(var18)
         .id_class(id_protected[81], var15)
         .id_byte(fZ_2.id_class)
         .id_break(var11)
         .id_class(id_protected[82], id_protected[83], id_protected[84])
         .id_class();
   }

   private static void id_class(Ok_1 var0, rjV_2 var1, rjV_2 var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      if (var3 < var6) {
         var6 = var3;
      }

      if (var4 < var7) {
         float var11 = var4;
         var4 = var7;
         var7 = var11;
      }

      float var17 = id_protected[121];
      float var12 = id_protected[122];
      float var13 = id_protected[123];
      float var14 = id_protected[124];
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)id_break[id_byte[51]]).intValue();
      var14 = var13 + var16 * (float)(var9 + id_private[13]);
      var13 += var16 * (float)var9;
      var0.id_class(var1, var6, var4, var5)
         .id_class(id_protected[125], id_protected[126], id_protected[127], id_protected[128])
         .id_class(id_protected[129], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[130], id_protected[131], id_protected[132])
         .id_class();
      var0.id_class(var1, var6, var4, var8)
         .id_class(id_protected[133], id_protected[134], id_protected[135], id_protected[136])
         .id_class(id_protected[137], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[138], id_protected[139], id_protected[140])
         .id_class();
      var0.id_class(var2, var6, var7, var8)
         .id_class(id_protected[141], id_protected[142], id_protected[143], id_protected[144])
         .id_class(id_protected[145], var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[146], id_protected[147], id_protected[148])
         .id_class();
      var0.id_class(var2, var6, var7, var5)
         .id_class(id_protected[149], id_protected[150], id_protected[151], id_protected[152])
         .id_class(id_protected[153], var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[154], id_protected[155], id_protected[156])
         .id_class();
   }

   private float id_class(float var1, int var2, rruO var3) {
      return var2 == id_break[id_byte[24]] - id_private[7]
         ? this.id_class(var1, var2 - id_private[8], var3)
         : (float)this.id_class(var3.id_protected().get(var2).id_break(var1), var3.id_protected().get(var2 + id_private[9]).id_break(var1));
   }

   private static void id_class() {
      id_throws = new byte[]{16, 64, 32, 9, 3, -1, 2};
   }

   private double id_class(rrub_1 var1, rrub_1 var2) {
      rrub_1 var3 = var2.id_break(var1);
      return Math.toDegrees(Math.atan2((double)((Float)var3.id_class[id_byte[25]]).floatValue(), (double)((Float)var3.id_class[id_byte[26]]).floatValue()))
         + id_case[17];
   }

   private void id_class(Ml_1 var1, Hx_1 var2, rrci_3 var3, cG_2 var4, float var5, int var6) {
      Ok_1 var7 = var3.id_class(var2, var4);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      rjV_2 var8 = null;
      float var9 = id_protected[5] / (float)((Integer)id_break[id_byte[13]]).intValue();

      for (int var10 = id_private[3]; var10 < id_break[id_byte[14]]; var10++) {
         this.id_break(var1, var4, var5, var10);
         rjV_2 var11 = var1.id_byte().id_class();
         if (var8 == null) {
            var8 = var11;
         }

         if (var10 == 0) {
            id_byte(var7, var11, var8, id_protected[6], id_protected[7], id_protected[8], id_protected[9], id_protected[10], id_protected[11], var10, var6);
         }

         float var12 = (float)(var10 + id_private[4]) * var9;
         if (var10 == (Integer)id_break[id_byte[15]] - id_private[5]) {
            id_protected(var7, var11, var11, id_protected[12], var12, id_protected[13], id_protected[14], var12, id_protected[15], var10, var6);
         }

         float var13 = (float)var10 * var9;
         id_class(var7, var11, var8, id_protected[16], var12, id_protected[17], id_protected[18], var13, id_protected[19], var10, var6);
         id_throws(var7, var11, var8, id_protected[20], var12, id_protected[21], id_protected[22], var13, id_protected[23], var10, var6);
         id_class(var4, var7, var11, var8, id_protected[24], var12, id_protected[25], id_protected[26], var13, id_protected[27], var10, var6);
         id_break(var7, var8, var11, id_protected[28], var12, id_protected[29], id_protected[30], var13, id_protected[31], var10, var6);
         var8 = var11.id_case();
         var1.id_break();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1161467695;
   }

   private float id_class(int var1, boolean var2) {
      long var3 = System.currentTimeMillis() / (long)(var2 ? id_throws[3] : id_throws[4]) % id_catch[0];
      float var5 = (float)(var1 + id_private[10]) / (float)((Integer)id_break[id_byte[45]]).intValue();
      return (rrus_1)((rruE)rruS.id_class[id_byte[46]]).id_class[id_byte[47]] == (rrus_1)rrus_1.staticFields671469053d923ac8912036fe43a40b51[id_byte[48]]
         ? (float)(Math.sin(Math.toRadians((double)(var5 * id_protected[63] - (float)var3))) * id_case[24])
         : id_protected[64];
   }

   public void id_break(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.id_case();
      rrci_3 var11 = this.id_class(var4, var2);
      if (var11 != null) {
         rdn_3 var12 = var4.id_class(rXQ.CHEST);
         if (var12.id_break() != rdy_3.kc) {
            if (!(this.id_byte() instanceof rruP) || this.id_byte().id_protected().id_finally) {
               if (var4.id_catch()) {
                  var4.id_class(var4, (Integer)id_break[id_byte[7]]);
                  if ((rrur_1)((rruE)rruS.id_class[id_byte[8]]).id_class[id_byte[9]]
                        == (rrur_1)rrur_1.staticFields11cf60dc087237409ab550ffa4a0389b[id_byte[10]]
                     && var11.id_class()) {
                     this.id_class(var1, var2, var11, var4, var7, var3);
                  } else {
                     Iq_1[] var13 = (Iq_1[])this.id_class[id_byte[11]];

                     for (int var14 = id_private[2]; var14 < id_break[id_byte[12]]; var14++) {
                        Iq_1 var15 = var13[var14];
                        this.id_break(var1, var4, var7, var14);
                        var11.id_class(var4, var14, var15, var1, var2, var3, fZ_2.id_class);
                        var1.id_break();
                     }
                  }
               } else {
                  this.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
               }
            }
         }
      }
   }

   private static void id_break(Ok_1 var0, rjV_2 var1, rjV_2 var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      if (var3 < var6) {
         float var11 = var3;
         var3 = var6;
         var6 = var11;
      }

      if (var4 < var7) {
         float var17 = var4;
         var4 = var7;
         var7 = var17;
         rjV_2 var12 = var1;
         var1 = var2;
         var2 = var12;
      }

      float var18 = id_protected[85];
      float var19 = id_protected[86];
      float var13 = id_protected[87];
      float var14 = id_protected[88];
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)id_break[id_byte[50]]).intValue();
      var14 = var13 + var16 * (float)(var9 + id_private[12]);
      var13 += var16 * (float)var9;
      var0.id_class(var2, var3, var4, var5)
         .id_class(id_protected[89], id_protected[90], id_protected[91], id_protected[92])
         .id_class(id_protected[93], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[94], id_protected[95], id_protected[96])
         .id_class();
      var0.id_class(var2, var6, var4, var5)
         .id_class(id_protected[97], id_protected[98], id_protected[99], id_protected[100])
         .id_class(id_protected[101], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[102], id_protected[103], id_protected[104])
         .id_class();
      var0.id_class(var1, var6, var7, var8)
         .id_class(id_protected[105], id_protected[106], id_protected[107], id_protected[108])
         .id_class(id_protected[109], var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[110], id_protected[111], id_protected[112])
         .id_class();
      var0.id_class(var1, var3, var7, var8)
         .id_class(id_protected[113], id_protected[114], id_protected[115], id_protected[116])
         .id_class(id_protected[117], var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[118], id_protected[119], id_protected[120])
         .id_class();
   }

   private void id_break(Ml_1 var1, cG_2 var2, float var3, int var4) {
      if ((rrca_3)((rruE)rruS.id_class[id_byte[16]]).id_class[id_byte[17]] != (rrca_3)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[id_byte[18]]) {
         this.id_byte(var1, var2, var3, var4);
      } else {
         this.id_class(var1, var2, var3, var4);
      }
   }

   private static void id_break() {
      id_byte = new short[]{
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
         1,
         0,
         0,
         0,
         0,
         0,
         0,
         3,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         1,
         10,
         13,
         8,
         11,
         14,
         9,
         12,
         15,
         10,
         24,
         23,
         24,
         0,
         0,
         7,
         8,
         28,
         29,
         0,
         0,
         1,
         1,
         0,
         0,
         0,
         0,
         0,
         0,
         1,
         0,
         1,
         10,
         13,
         8,
         11,
         14,
         9,
         12,
         15,
         10,
         24,
         23,
         24,
         7,
         8,
         28,
         29,
         11,
         11,
         13,
         13,
         12,
         12,
         11,
         13,
         12
      };
   }

   private static void id_throws(Ok_1 var0, rjV_2 var1, rjV_2 var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      if (var3 < var6) {
         var6 = var3;
      }

      if (var4 < var7) {
         float var11 = var4;
         var4 = var7;
         var7 = var11;
      }

      float var17 = id_protected[157];
      float var12 = id_protected[158];
      float var13 = id_protected[159];
      float var14 = id_protected[160];
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)id_break[id_byte[52]]).intValue();
      var14 = var13 + var16 * (float)(var9 + id_private[14]);
      var13 += var16 * (float)var9;
      var0.id_class(var1, var6, var4, var8)
         .id_class(id_protected[161], id_protected[162], id_protected[163], id_protected[164])
         .id_class(id_protected[165], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[166], id_protected[167], id_protected[168])
         .id_class();
      var0.id_class(var1, var6, var4, var5)
         .id_class(id_protected[169], id_protected[170], id_protected[171], id_protected[172])
         .id_class(id_protected[173], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[174], id_protected[175], id_protected[176])
         .id_class();
      var0.id_class(var2, var6, var7, var5)
         .id_class(id_protected[177], id_protected[178], id_protected[179], id_protected[180])
         .id_class(id_protected[181], var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[182], id_protected[183], id_protected[184])
         .id_class();
      var0.id_class(var2, var6, var7, var8)
         .id_class(id_protected[185], id_protected[186], id_protected[187], id_protected[188])
         .id_class(id_protected[189], var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[190], id_protected[191], id_protected[192])
         .id_class();
   }

   private void id_throws() {
      this.id_case();
      Iq_1[] var7 = new Iq_1[id_break[id_byte[3]]];
      this.id_class[id_byte[4]] = var7;

      for (int var1 = id_private[0]; var1 < id_break[id_byte[5]]; var1++) {
         Iq_1 var2 = new Iq_1(id_throws[1], id_throws[2], id_private[1], var1);
         ((Iq_1[])this.id_class[id_byte[6]])[var1] = var2.id_class(
            id_protected[0], (float)var1, id_protected[1], id_protected[2], id_protected[3], id_protected[4]
         );
      }
   }

   private static void id_finally() {
      id_protected = new float[]{
         -5.0F,
         -1.0F,
         10.0F,
         1.0F,
         1.0F,
         0.96F,
         0.3F,
         0.0F,
         0.0F,
         -0.3F,
         0.0F,
         -0.06F,
         0.3F,
         0.0F,
         -0.3F,
         -0.06F,
         -0.3F,
         0.0F,
         -0.3F,
         -0.06F,
         0.3F,
         0.0F,
         0.3F,
         -0.06F,
         0.3F,
         -0.06F,
         -0.3F,
         -0.06F,
         0.3F,
         0.0F,
         -0.3F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         25.0F,
         6.0F,
         0.0F,
         180.0F,
         1.0F,
         1.0F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         10.0F,
         -6.0F,
         32.0F,
         1.0F,
         100.0F,
         0.0F,
         150.0F,
         1.0F,
         100.0F,
         -20.0F,
         20.0F,
         6.0F,
         32.0F,
         25.0F,
         6.0F,
         2.0F,
         2.0F,
         180.0F,
         2.0F,
         360.0F,
         0.0F,
         0.015625F,
         0.171875F,
         0.03125F,
         0.53125F,
         0.171875F,
         1.0F,
         0.0F,
         0.0F,
         0.015625F,
         1.0F,
         0.0F,
         0.0F,
         0.015625F,
         1.0F,
         0.0F,
         0.0F,
         0.171875F,
         1.0F,
         1.0F,
         1.0F,
         0.1875F,
         0.34375F,
         0.03125F,
         0.53125F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.1875F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.34375F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.34375F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.1875F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         0.015625F,
         0.03125F,
         0.53125F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.015625F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.015625F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         0.171875F,
         0.1875F,
         0.03125F,
         0.53125F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.171875F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.1875F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.1875F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.171875F,
         1.0F,
         1.0F,
         1.0F,
         0.171875F,
         0.328125F,
         0.0F,
         0.03125F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.328125F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.171875F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.171875F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.328125F,
         1.0F,
         1.0F,
         1.0F,
         0.015625F,
         0.171875F,
         0.0F,
         0.03125F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.171875F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.015625F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.015625F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.171875F,
         1.0F,
         1.0F,
         1.0F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         10.0F,
         -6.0F,
         32.0F,
         100.0F,
         0.0F,
         150.0F,
         100.0F,
         -20.0F,
         20.0F,
         0.0F,
         0.0F,
         165.0F,
         165.0F,
         -5.0F,
         -5.0F,
         6.0F,
         32.0F,
         25.0F,
         20.0F,
         0.02F,
         1.0F,
         6.0F,
         2.0F,
         2.0F,
         180.0F,
         2.0F
      };
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{0, new rruB()};
      id_break = var0;
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_private[18]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_implements() {
      id_case = new double[]{
         0.15,
         0.125,
         0.0,
         0.0,
         0.0,
         0.15F,
         0.0,
         0.0,
         0.03,
         -0.03,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         -0.03,
         0.03,
         180.0,
         0.0,
         0.0,
         0.125,
         0.0,
         0.15F,
         0.0,
         3.0,
         Math.PI,
         2.0,
         0.0,
         0.0,
         0.125
      };
   }

   private static void id_protected(
      Ok_1 var0, rjV_2 var1, rjV_2 var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10
   ) {
      if (var3 < var6) {
         float var11 = var3;
         var3 = var6;
         var6 = var11;
      }

      if (var4 < var7) {
         float var17 = var4;
         var4 = var7;
         var7 = var17;
      }

      float var18 = id_protected[193];
      float var12 = id_protected[194];
      float var13 = id_protected[195];
      float var14 = id_protected[196];
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)id_break[id_byte[53]]).intValue();
      var14 = var13 + var16 * (float)(var9 + id_private[15]);
      var13 += var16 * (float)var9;
      var0.id_class(var2, var3, var7, var8)
         .id_class(id_protected[197], id_protected[198], id_protected[199], id_protected[200])
         .id_class(id_protected[201], var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[202], id_protected[203], id_protected[204])
         .id_class();
      var0.id_class(var2, var6, var7, var8)
         .id_class(id_protected[205], id_protected[206], id_protected[207], id_protected[208])
         .id_class(id_protected[209], var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[210], id_protected[211], id_protected[212])
         .id_class();
      var0.id_class(var1, var6, var4, var5)
         .id_class(id_protected[213], id_protected[214], id_protected[215], id_protected[216])
         .id_class(id_protected[217], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[218], id_protected[219], id_protected[220])
         .id_class();
      var0.id_class(var1, var3, var4, var5)
         .id_class(id_protected[221], id_protected[222], id_protected[223], id_protected[224])
         .id_class(id_protected[225], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[226], id_protected[227], id_protected[228])
         .id_class();
   }

   private static void id_protected() {
      id_catch = new long[]{360L};
   }

   private static void id_private() {
      id_private = new boolean[]{
         false, false, false, false, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, false, false
      };
   }
}
