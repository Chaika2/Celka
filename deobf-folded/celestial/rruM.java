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

      float var18 = 0.015625F;
      float var12 = 0.171875F;
      float var13 = id_protected[231];
      float var14 = 0.03125F;
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)id_break[id_byte[54]]).intValue();
      var14 = var13 + var16 * (float)(var9 + 1);
      var13 += var16 * (float)var9;
      var0.id_class(var2, var3, var7, var5)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.171875F, var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[238], 1.0F, id_protected[240])
         .id_class();
      var0.id_class(var2, var6, var7, var5)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.015625F, var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[246], 1.0F, id_protected[248])
         .id_class();
      var0.id_class(var1, var6, var4, var8)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.015625F, var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(id_protected[254], 1.0F, id_protected[256])
         .id_class();
      var0.id_class(var1, var3, var4, var8)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.171875F, var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, 1.0F, 1.0F)
         .id_class();
   }

   private void id_byte(Ml_1 var1, cG_2 var2, float var3, int var4) {
      rruO var5 = var2.id_throws();
      var1.id_class();
      rdn_3 var6 = var2.id_class(rXQ.CHEST);
      double var7 = !var6.id_class() ? 0.15 : 0.125;
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
         var15 += 25.0F;
         var1.id_class(id_case[4], 0.15F, id_case[6]);
      }

      float var16 = this.id_class(var4, var2.W());
      var1.id_class(rje_3.id_break.id_byte(6.0F + var15 + var16));
      var1.id_class(rje_3.id_case.id_byte(id_protected[38]));
      var1.id_class(rje_3.id_protected.id_byte(180.0F));
      var1.id_class(
         (double)(-var12 / (float)((Integer)id_break[id_byte[19]]).intValue()),
         (double)(var11 / (float)((Integer)id_break[id_byte[20]]).intValue()),
         (double)(var10 / (float)((Integer)id_break[id_byte[21]]).intValue())
      );
      var1.id_class(id_case[7], 0.03, -0.03);
      var1.id_class(id_case[10], (double)((float)var4 * 1.0F / (float)((Integer)id_break[id_byte[22]]).intValue()), id_case[11]);
      var1.id_class(rje_3.id_break.id_byte(-var14));
      var1.id_class(id_case[12], (double)((float)(-var4) * 1.0F / (float)((Integer)id_break[id_byte[23]]).intValue()), id_case[13]);
      var1.id_class(id_case[14], -0.03, 0.03);
   }

   public rruM(qE_2<cG_2, wh_3<cG_2>> var1) {
      super(var1);
      this.id_case();
      Iq_1[] var6 = new Iq_1[id_break[id_byte[0]]];
      this.id_class[id_byte[1]] = var6;
      Integer var7 = 16;
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
      var1.id_class(id_case[18], id_case[19], 0.125);
      double var5 = rfU_2.id_protected((double)var3, (Double)var2.id_implements[10], (Double)var2.id_implements[13])
         - rfU_2.id_protected((double)var3, (Double)var2.id_throws[8], var2.rx());
      double var7 = rfU_2.id_protected((double)var3, (Double)var2.id_implements[11], (Double)var2.id_implements[14])
         - rfU_2.id_protected((double)var3, (Double)var2.id_throws[9], var2.re());
      double var9 = rfU_2.id_protected((double)var3, (Double)var2.id_implements[12], (Double)var2.id_implements[15])
         - rfU_2.id_protected((double)var3, (Double)var2.id_throws[10], var2.BO());
      float var11 = (Float)var2.id_private[24] + (Float)var2.id_private[23] - (Float)var2.id_private[24];
      double var12 = (double)rfU_2.id_class(var11 * (float) (Math.PI / 180.0));
      double var14 = (double)(-rfU_2.id_break(var11 * (float) (Math.PI / 180.0)));
      float var16 = (float)var7 * 10.0F;
      var16 = rfU_2.id_class(var16, -6.0F, 32.0F);
      float var17 = (float)(var5 * var12 + var9 * var14) * id_class(1.0F / (float)((Integer)id_break[id_byte[39]]).intValue() * (float)var4) * 100.0F;
      var17 = rfU_2.id_class(var17, id_protected[49], 150.0F * id_class(1.0F / (float)((Integer)id_break[id_byte[40]]).intValue() * (float)var4));
      float var18 = (float)(var5 * var14 - var9 * var12) * 100.0F;
      var18 = rfU_2.id_class(var18, -20.0F, 20.0F);
      float var19 = rfU_2.id_catch(var3, (Float)var2.id_implements[7], (Float)var2.id_implements[8]);
      var16 += rfU_2.id_class(rfU_2.id_catch(var3, (Float)var2.id_throws[28], (Float)var2.id_throws[29]) * 6.0F) * 32.0F * var19;
      if (var2.x()) {
         var16 += 25.0F;
         var1.id_class(id_case[21], 0.15F, id_case[23]);
      }

      float var20 = this.id_class(var4, var2.W());
      var1.id_class(rje_3.id_break.id_byte(6.0F + var17 / 2.0F + var16 + var20));
      var1.id_class(rje_3.id_case.id_byte(var18 / 2.0F));
      var1.id_class(rje_3.id_protected.id_byte(180.0F - var18 / 2.0F));
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.id_super() && !var4.Pp() && var4.id_class(rhQ_2.CAPE) && var4.id_case() != null) {
         rdn_3 var11 = var4.id_class(rXQ.CHEST);
         if (var11.id_break() != rdy_3.kc) {
            var1.id_class();
            var1.id_class(id_case[27], id_case[28], 0.125);
            double var12 = rfU_2.id_protected((double)var7, (Double)var4.id_implements[10], (Double)var4.id_implements[13])
               - rfU_2.id_protected((double)var7, (Double)var4.id_throws[8], var4.rx());
            double var14 = rfU_2.id_protected((double)var7, (Double)var4.id_implements[11], (Double)var4.id_implements[14])
               - rfU_2.id_protected((double)var7, (Double)var4.id_throws[9], var4.re());
            double var16 = rfU_2.id_protected((double)var7, (Double)var4.id_implements[12], (Double)var4.id_implements[15])
               - rfU_2.id_protected((double)var7, (Double)var4.id_throws[10], var4.BO());
            float var18 = (Float)var4.id_private[24] + ((Float)var4.id_private[23] - (Float)var4.id_private[24]);
            double var19 = (double)rfU_2.id_class(var18 * (float) (Math.PI / 180.0));
            double var21 = (double)(-rfU_2.id_break(var18 * (float) (Math.PI / 180.0)));
            float var23 = (float)var14 * 10.0F;
            var23 = rfU_2.id_class(var23, -6.0F, 32.0F);
            float var24 = (float)(var12 * var19 + var16 * var21) * 100.0F;
            var24 = rfU_2.id_class(var24, id_protected[271], 150.0F);
            float var25 = (float)(var12 * var21 - var16 * var19) * 100.0F;
            var25 = rfU_2.id_class(var25, -20.0F, 20.0F);
            if (var24 < id_protected[276]) {
               var24 = id_protected[277];
            }

            if (var24 > 165.0F) {
               var24 = 165.0F;
            }

            if (var23 < -5.0F) {
               var23 = -5.0F;
            }

            float var26 = rfU_2.id_catch(var7, (Float)var4.id_implements[7], (Float)var4.id_implements[8]);
            var23 += rfU_2.id_class(rfU_2.id_catch(var7, (Float)var4.id_throws[28], (Float)var4.id_throws[29]) * 6.0F) * 32.0F * var26;
            if (var4.x()) {
               var23 += 25.0F;
            }

            float var27 = rrbb_3.rV() * 20.0F;
            var27 = rrbb_3.id_class(var27, 0.02F, 1.0F);
            Float var33 = rfU_2.id_catch(var27, (Float)var4.id_class[11], 6.0F + var24 / 2.0F + var23);
            var4.id_class[11] = var33;
            Float var34 = rfU_2.id_catch(var27, (Float)var4.id_class[13], var25 / 2.0F);
            var4.id_class[13] = var34;
            Float var35 = rfU_2.id_catch(var27, (Float)var4.id_class[12], 180.0F - var25 / 2.0F);
            var4.id_class[12] = var35;
            var1.id_class(rje_3.id_break.id_byte((Float)var4.id_class[11]));
            var1.id_class(rje_3.id_case.id_byte((Float)var4.id_class[13]));
            var1.id_class(rje_3.id_protected.id_byte((Float)var4.id_class[12]));
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
      return rfU_2.id_class((float)((double)var0 * Math.PI / 2.0));
   }

   private rrci_3 id_class(cG_2 var1, Hx_1 var2) {
      if (var1.id_super() && var1.id_class(rhQ_2.CAPE) && var1.id_case() != null) {
         rruB var10000 = (rruB)id_break[1];
         Ok_1 var7 = var2.getBuffer(HU.id_byte(var1.id_case()));
         var10000.id_class[id_byte[56]] = var7;
         return (rruB)id_break[1];
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

      float var20 = 0.015625F;
      float var21 = 0.171875F;
      float var14 = 0.03125F;
      float var15 = 0.53125F;
      float var16 = var15 - var14;
      float var17 = var16 / (float)((Integer)id_break[id_byte[49]]).intValue();
      var15 = var14 + var17 * (float)(var10 + 1);
      var14 += var17 * (float)var10;
      byte var18 = -1;
      var1.id_class(var3, var4, var8, var6)
         .id_class(var18)
         .id_class(0.171875F, var14)
         .id_byte(fZ_2.id_class)
         .id_break(var11)
         .id_class(1.0F, id_protected[71], id_protected[72])
         .id_class();
      var1.id_class(var3, var7, var8, var6)
         .id_class(var18)
         .id_class(0.015625F, var14)
         .id_byte(fZ_2.id_class)
         .id_break(var11)
         .id_class(1.0F, id_protected[75], id_protected[76])
         .id_class();
      var1.id_class(var2, var7, var5, var9)
         .id_class(var18)
         .id_class(0.015625F, var15)
         .id_byte(fZ_2.id_class)
         .id_break(var11)
         .id_class(1.0F, id_protected[79], id_protected[80])
         .id_class();
      var1.id_class(var2, var4, var5, var9)
         .id_class(var18)
         .id_class(0.171875F, var15)
         .id_byte(fZ_2.id_class)
         .id_break(var11)
         .id_class(1.0F, 1.0F, 1.0F)
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
      float var12 = 0.015625F;
      float var13 = 0.03125F;
      float var14 = 0.53125F;
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)id_break[id_byte[51]]).intValue();
      var14 = var13 + var16 * (float)(var9 + 1);
      var13 += var16 * (float)var9;
      var0.id_class(var1, var6, var4, var5)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(id_protected[129], var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[131], id_protected[132])
         .id_class();
      var0.id_class(var1, var6, var4, var8)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.015625F, var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[139], id_protected[140])
         .id_class();
      var0.id_class(var2, var6, var7, var8)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.015625F, var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[147], id_protected[148])
         .id_class();
      var0.id_class(var2, var6, var7, var5)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(id_protected[153], var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, 1.0F, 1.0F)
         .id_class();
   }

   private float id_class(float var1, int var2, rruO var3) {
      return var2 == id_break[id_byte[24]] - 1
         ? this.id_class(var1, var2 - 1, var3)
         : (float)this.id_class(var3.id_protected().get(var2).id_break(var1), var3.id_protected().get(var2 + 1).id_break(var1));
   }

   private static void id_class() {
      id_throws = new byte[]{16, 64, 32, 9, 3, -1, 2};
   }

   private double id_class(rrub_1 var1, rrub_1 var2) {
      rrub_1 var3 = var2.id_break(var1);
      return Math.toDegrees(Math.atan2((double)((Float)var3.id_class[id_byte[25]]).floatValue(), (double)((Float)var3.id_class[1]).floatValue())) + 180.0;
   }

   private void id_class(Ml_1 var1, Hx_1 var2, rrci_3 var3, cG_2 var4, float var5, int var6) {
      Ok_1 var7 = var3.id_class(var2, var4);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      rjV_2 var8 = null;
      float var9 = 0.96F / (float)((Integer)id_break[id_byte[13]]).intValue();

      for (int var10 = id_private[3]; var10 < id_break[id_byte[14]]; var10++) {
         this.id_break(var1, var4, var5, var10);
         rjV_2 var11 = var1.id_byte().id_class();
         if (var8 == null) {
            var8 = var11;
         }

         if (var10 == 0) {
            id_byte(var7, var11, var8, 0.3F, id_protected[7], id_protected[8], -0.3F, id_protected[10], -0.06F, var10, var6);
         }

         float var12 = (float)(var10 + 1) * var9;
         if (var10 == (Integer)id_break[id_byte[15]] - 1) {
            id_protected(var7, var11, var11, 0.3F, var12, id_protected[13], -0.3F, var12, -0.06F, var10, var6);
         }

         float var13 = (float)var10 * var9;
         id_class(var7, var11, var8, -0.3F, var12, id_protected[17], -0.3F, var13, -0.06F, var10, var6);
         id_throws(var7, var11, var8, 0.3F, var12, id_protected[21], 0.3F, var13, -0.06F, var10, var6);
         id_class(var4, var7, var11, var8, 0.3F, var12, -0.06F, -0.3F, var13, -0.06F, var10, var6);
         id_break(var7, var8, var11, 0.3F, var12, id_protected[29], -0.3F, var13, id_protected[31], var10, var6);
         var8 = var11.id_case();
         var1.id_break();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1161467695;
   }

   private float id_class(int var1, boolean var2) {
      long var3 = System.currentTimeMillis() / (long)(var2 ? 9 : 3) % 360L;
      float var5 = (float)(var1 + 1) / (float)((Integer)id_break[id_byte[45]]).intValue();
      return (rrus_1)((rruE)rruS.id_class[id_byte[46]]).id_class[1] == (rrus_1)rrus_1.staticFields671469053d923ac8912036fe43a40b51[1]
         ? (float)(Math.sin(Math.toRadians((double)(var5 * 360.0F - (float)var3))) * 3.0)
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
                  if ((rrur_1)((rruE)rruS.id_class[id_byte[8]]).id_class[2] == (rrur_1)rrur_1.staticFields11cf60dc087237409ab550ffa4a0389b[1]
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

      float var18 = 0.1875F;
      float var19 = 0.34375F;
      float var13 = 0.03125F;
      float var14 = 0.53125F;
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)id_break[id_byte[50]]).intValue();
      var14 = var13 + var16 * (float)(var9 + 1);
      var13 += var16 * (float)var9;
      var0.id_class(var2, var3, var4, var5)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.1875F, var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[95], id_protected[96])
         .id_class();
      var0.id_class(var2, var6, var4, var5)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.34375F, var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[103], id_protected[104])
         .id_class();
      var0.id_class(var1, var6, var7, var8)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.34375F, var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[111], id_protected[112])
         .id_class();
      var0.id_class(var1, var3, var7, var8)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.1875F, var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, 1.0F, 1.0F)
         .id_class();
   }

   private void id_break(Ml_1 var1, cG_2 var2, float var3, int var4) {
      if ((rrca_3)((rruE)rruS.id_class[id_byte[16]]).id_class[3] != (rrca_3)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[id_byte[18]]) {
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

      float var17 = 0.171875F;
      float var12 = 0.1875F;
      float var13 = 0.03125F;
      float var14 = 0.53125F;
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)id_break[id_byte[52]]).intValue();
      var14 = var13 + var16 * (float)(var9 + 1);
      var13 += var16 * (float)var9;
      var0.id_class(var1, var6, var4, var8)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.171875F, var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[167], id_protected[168])
         .id_class();
      var0.id_class(var1, var6, var4, var5)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.1875F, var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[175], id_protected[176])
         .id_class();
      var0.id_class(var2, var6, var7, var5)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.1875F, var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[183], id_protected[184])
         .id_class();
      var0.id_class(var2, var6, var7, var8)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.171875F, var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, 1.0F, 1.0F)
         .id_class();
   }

   private void id_throws() {
      this.id_case();
      Iq_1[] var7 = new Iq_1[id_break[id_byte[3]]];
      this.id_class[id_byte[4]] = var7;

      for (int var1 = id_private[0]; var1 < id_break[id_byte[5]]; var1++) {
         Iq_1 var2 = new Iq_1(64, 32, id_private[1], var1);
         ((Iq_1[])this.id_class[id_byte[6]])[var1] = var2.id_class(-5.0F, (float)var1, -1.0F, 10.0F, 1.0F, 1.0F);
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
         this.id_class = new Object[1];
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

      float var18 = 0.171875F;
      float var12 = 0.328125F;
      float var13 = id_protected[195];
      float var14 = 0.03125F;
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)id_break[id_byte[53]]).intValue();
      var14 = var13 + var16 * (float)(var9 + 1);
      var13 += var16 * (float)var9;
      var0.id_class(var2, var3, var7, var8)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.328125F, var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[203], id_protected[204])
         .id_class();
      var0.id_class(var2, var6, var7, var8)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.171875F, var13)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[211], id_protected[212])
         .id_class();
      var0.id_class(var1, var6, var4, var5)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.171875F, var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, id_protected[219], id_protected[220])
         .id_class();
      var0.id_class(var1, var3, var4, var5)
         .id_class(1.0F, 1.0F, 1.0F, 1.0F)
         .id_class(0.328125F, var14)
         .id_byte(fZ_2.id_class)
         .id_break(var10)
         .id_class(1.0F, 1.0F, 1.0F)
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
