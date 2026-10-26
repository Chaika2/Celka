package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruM extends Tf_1<cG_2, wh_3<cG_2>> {
   private static short[] byte_;
   private static float[] protected_;
   private static byte[] throws_;
   public Object[] class_;
   private static double[] case_;
   private static long[] catch_;
   public static Object[] break_;
   private static boolean[] private_;

   private static void byte_(Ok_1 var0, rjV_2 var1, rjV_2 var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
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

      float var18 = protected_[229];
      float var12 = 0.171875F;
      float var13 = 0.0F;
      float var14 = 0.03125F;
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)break_[0]).intValue();
      var14 = var13 + var16 * (float)(var9 + 1);
      var13 += var16 * (float)var9;
      var0.class_(var2, var3, var7, var5)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.171875F, var14)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(0.0F, 1.0F, 0.0F)
         .class_();
      var0.class_(var2, var6, var7, var5)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.015625F, var14)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(0.0F, 1.0F, 0.0F)
         .class_();
      var0.class_(var1, var6, var4, var8)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.015625F, var13)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(0.0F, 1.0F, 0.0F)
         .class_();
      var0.class_(var1, var3, var4, var8)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.171875F, var13)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 1.0F, 1.0F)
         .class_();
   }

   private void byte_(Ml_1 var1, cG_2 var2, float var3, int var4) {
      rruO var5 = var2.throws_();
      var1.class_();
      rdn_3 var6 = var2.class_(rXQ.CHEST);
      double var7 = !var6.class_() ? 0.15 : case_[1];
      var1.class_(0.0, 0.0, var7);
      rruG var9 = var5.protected_().get(0);
      float var10 = var5.protected_().get(var4).class_(var3) - var9.class_(var3);
      if (var10 > 0.0F) {
         var10 = 0.0F;
      }

      float var11 = var9.protected_(var3) - (float)var4 - var5.protected_().get(var4).protected_(var3);
      float var12 = var9.byte_(var3) - var5.protected_().get(var4).byte_(var3);
      float var13 = 0.0F;
      float var14 = this.class_(var3, var4, var5);
      float var15 = 0.0F;
      if (var2.x()) {
         var15 += 25.0F;
         var1.class_(0.0, 0.15F, 0.0);
      }

      float var16 = this.class_(var4, var2.W());
      var1.class_(rje_3.break_.byte_(6.0F + var15 + var16));
      var1.class_(rje_3.case_.byte_(0.0F));
      var1.class_(rje_3.protected_.byte_(180.0F));
      var1.class_(
         (double)(-var12 / (float)((Integer)break_[0]).intValue()),
         (double)(var11 / (float)((Integer)break_[0]).intValue()),
         (double)(var10 / (float)((Integer)break_[0]).intValue())
      );
      var1.class_(0.0, 0.03, -0.03);
      var1.class_(0.0, (double)((float)var4 * 1.0F / (float)((Integer)break_[0]).intValue()), 0.0);
      var1.class_(rje_3.break_.byte_(-var14));
      var1.class_(0.0, (double)((float)(-var4) * 1.0F / (float)((Integer)break_[0]).intValue()), 0.0);
      var1.class_(0.0, -0.03, 0.03);
   }

   public rruM(qE_2<cG_2, wh_3<cG_2>> var1) {
      super(var1);
      this.case_();
      Iq_1[] var6 = new Iq_1[break_[0]];
      this.class_[0] = var6;
      Integer var7 = 16;
      break_[0] = var7;
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, -19, -77, 113, -102, 118, 71, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void class_(Ml_1 var1, cG_2 var2, float var3, int var4) {
      var1.class_();
      var1.class_(0.0, 0.0, 0.125);
      double var5 = rfU_2.protected_((double)var3, (Double)var2.implements_[10], (Double)var2.implements_[13])
         - rfU_2.protected_((double)var3, (Double)var2.throws_[8], var2.rx());
      double var7 = rfU_2.protected_((double)var3, (Double)var2.implements_[11], (Double)var2.implements_[14])
         - rfU_2.protected_((double)var3, (Double)var2.throws_[9], var2.re());
      double var9 = rfU_2.protected_((double)var3, (Double)var2.implements_[12], (Double)var2.implements_[15])
         - rfU_2.protected_((double)var3, (Double)var2.throws_[10], var2.BO());
      float var11 = (Float)var2.private_[24] + (Float)var2.private_[23] - (Float)var2.private_[24];
      double var12 = (double)rfU_2.class_(var11 * (float) (Math.PI / 180.0));
      double var14 = (double)(-rfU_2.break_(var11 * (float) (Math.PI / 180.0)));
      float var16 = (float)var7 * 10.0F;
      var16 = rfU_2.class_(var16, -6.0F, 32.0F);
      float var17 = (float)(var5 * var12 + var9 * var14) * class_(1.0F / (float)((Integer)break_[0]).intValue() * (float)var4) * 100.0F;
      var17 = rfU_2.class_(var17, 0.0F, 150.0F * class_(1.0F / (float)((Integer)break_[0]).intValue() * (float)var4));
      float var18 = (float)(var5 * var14 - var9 * var12) * 100.0F;
      var18 = rfU_2.class_(var18, -20.0F, 20.0F);
      float var19 = rfU_2.catch_(var3, (Float)var2.implements_[7], (Float)var2.implements_[8]);
      var16 += rfU_2.class_(rfU_2.catch_(var3, (Float)var2.throws_[28], (Float)var2.throws_[29]) * 6.0F) * 32.0F * var19;
      if (var2.x()) {
         var16 += 25.0F;
         var1.class_(0.0, 0.15F, 0.0);
      }

      float var20 = this.class_(var4, var2.W());
      var1.class_(rje_3.break_.byte_(6.0F + var17 / 2.0F + var16 + var20));
      var1.class_(rje_3.case_.byte_(var18 / 2.0F));
      var1.class_(rje_3.protected_.byte_(180.0F - var18 / 2.0F));
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.super_() && !var4.Pp() && var4.class_(rhQ_2.CAPE) && var4.case_() != null) {
         rdn_3 var11 = var4.class_(rXQ.CHEST);
         if (var11.break_() != rdy_3.kc) {
            var1.class_();
            var1.class_(0.0, 0.0, 0.125);
            double var12 = rfU_2.protected_((double)var7, (Double)var4.implements_[10], (Double)var4.implements_[13])
               - rfU_2.protected_((double)var7, (Double)var4.throws_[8], var4.rx());
            double var14 = rfU_2.protected_((double)var7, (Double)var4.implements_[11], (Double)var4.implements_[14])
               - rfU_2.protected_((double)var7, (Double)var4.throws_[9], var4.re());
            double var16 = rfU_2.protected_((double)var7, (Double)var4.implements_[12], (Double)var4.implements_[15])
               - rfU_2.protected_((double)var7, (Double)var4.throws_[10], var4.BO());
            float var18 = (Float)var4.private_[24] + ((Float)var4.private_[23] - (Float)var4.private_[24]);
            double var19 = (double)rfU_2.class_(var18 * (float) (Math.PI / 180.0));
            double var21 = (double)(-rfU_2.break_(var18 * (float) (Math.PI / 180.0)));
            float var23 = (float)var14 * 10.0F;
            var23 = rfU_2.class_(var23, -6.0F, 32.0F);
            float var24 = (float)(var12 * var19 + var16 * var21) * 100.0F;
            var24 = rfU_2.class_(var24, 0.0F, 150.0F);
            float var25 = (float)(var12 * var21 - var16 * var19) * 100.0F;
            var25 = rfU_2.class_(var25, -20.0F, 20.0F);
            if (var24 < 0.0F) {
               var24 = 0.0F;
            }

            if (var24 > 165.0F) {
               var24 = 165.0F;
            }

            if (var23 < -5.0F) {
               var23 = -5.0F;
            }

            float var26 = rfU_2.catch_(var7, (Float)var4.implements_[7], (Float)var4.implements_[8]);
            var23 += rfU_2.class_(rfU_2.catch_(var7, (Float)var4.throws_[28], (Float)var4.throws_[29]) * 6.0F) * 32.0F * var26;
            if (var4.x()) {
               var23 += 25.0F;
            }

            float var27 = rrbb_3.rV() * 20.0F;
            var27 = rrbb_3.class_(var27, 0.02F, 1.0F);
            Float var33 = rfU_2.catch_(var27, (Float)var4.class_[11], 6.0F + var24 / 2.0F + var23);
            var4.class_[11] = var33;
            Float var34 = rfU_2.catch_(var27, (Float)var4.class_[13], var25 / 2.0F);
            var4.class_[13] = var34;
            Float var35 = rfU_2.catch_(var27, (Float)var4.class_[12], 180.0F - var25 / 2.0F);
            var4.class_[12] = var35;
            var1.class_(rje_3.break_.byte_((Float)var4.class_[11]));
            var1.class_(rje_3.case_.byte_((Float)var4.class_[13]));
            var1.class_(rje_3.protected_.byte_((Float)var4.class_[12]));
            Ok_1 var28 = var2.getBuffer(HU.break_(var4.case_()));
            this.byte_().break_(var1, var28, var3, fZ_2.class_);
            var1.break_();
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6198417313134540206L;
   }

   private static float class_(float var0) {
      return rfU_2.class_((float)((double)var0 * Math.PI / 2.0));
   }

   private rrci_3 class_(cG_2 var1, Hx_1 var2) {
      if (var1.super_() && var1.class_(rhQ_2.CAPE) && var1.case_() != null) {
         rruB var10000 = (rruB)break_[1];
         Ok_1 var7 = var2.getBuffer(HU.byte_(var1.case_()));
         var10000.class_[0] = var7;
         return (rruB)break_[1];
      } else {
         return null;
      }
   }

   private static void class_(
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

      float var20 = protected_[65];
      float var21 = 0.171875F;
      float var14 = 0.03125F;
      float var15 = 0.53125F;
      float var16 = var15 - var14;
      float var17 = var16 / (float)((Integer)break_[0]).intValue();
      var15 = var14 + var17 * (float)(var10 + 1);
      var14 += var17 * (float)var10;
      byte var18 = -1;
      var1.class_(var3, var4, var8, var6).class_(var18).class_(0.171875F, var14).byte_(fZ_2.class_).break_(var11).class_(1.0F, 0.0F, 0.0F).class_();
      var1.class_(var3, var7, var8, var6).class_(var18).class_(0.015625F, var14).byte_(fZ_2.class_).break_(var11).class_(1.0F, 0.0F, 0.0F).class_();
      var1.class_(var2, var7, var5, var9).class_(var18).class_(0.015625F, var15).byte_(fZ_2.class_).break_(var11).class_(1.0F, 0.0F, 0.0F).class_();
      var1.class_(var2, var4, var5, var9).class_(var18).class_(0.171875F, var15).byte_(fZ_2.class_).break_(var11).class_(1.0F, 1.0F, 1.0F).class_();
   }

   private static void class_(Ok_1 var0, rjV_2 var1, rjV_2 var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      if (var3 < var6) {
         var6 = var3;
      }

      if (var4 < var7) {
         float var11 = var4;
         var4 = var7;
         var7 = var11;
      }

      float var17 = protected_[121];
      float var12 = 0.015625F;
      float var13 = 0.03125F;
      float var14 = 0.53125F;
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)break_[0]).intValue();
      var14 = var13 + var16 * (float)(var9 + 1);
      var13 += var16 * (float)var9;
      var0.class_(var1, var6, var4, var5).class_(1.0F, 1.0F, 1.0F, 1.0F).class_(0.0F, var14).byte_(fZ_2.class_).break_(var10).class_(1.0F, 0.0F, 0.0F).class_();
      var0.class_(var1, var6, var4, var8)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.015625F, var14)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 0.0F, 0.0F)
         .class_();
      var0.class_(var2, var6, var7, var8)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.015625F, var13)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 0.0F, 0.0F)
         .class_();
      var0.class_(var2, var6, var7, var5).class_(1.0F, 1.0F, 1.0F, 1.0F).class_(0.0F, var13).byte_(fZ_2.class_).break_(var10).class_(1.0F, 1.0F, 1.0F).class_();
   }

   private float class_(float var1, int var2, rruO var3) {
      return var2 == break_[0] - 1
         ? this.class_(var1, var2 - 1, var3)
         : (float)this.class_(var3.protected_().get(var2).break_(var1), var3.protected_().get(var2 + 1).break_(var1));
   }

   private static void class_() {
      throws_ = new byte[]{16, 64, 32, 9, 3, -1, 2};
   }

   private double class_(rrub_1 var1, rrub_1 var2) {
      rrub_1 var3 = var2.break_(var1);
      return Math.toDegrees(Math.atan2((double)((Float)var3.class_[0]).floatValue(), (double)((Float)var3.class_[1]).floatValue())) + 180.0;
   }

   private void class_(Ml_1 var1, Hx_1 var2, rrci_3 var3, cG_2 var4, float var5, int var6) {
      Ok_1 var7 = var3.class_(var2, var4);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      rjV_2 var8 = null;
      float var9 = 0.96F / (float)((Integer)break_[0]).intValue();

      for (int var10 = 0; var10 < break_[0]; var10++) {
         this.break_(var1, var4, var5, var10);
         rjV_2 var11 = var1.byte_().class_();
         if (var8 == null) {
            var8 = var11;
         }

         if (var10 == 0) {
            byte_(var7, var11, var8, 0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.06F, var10, var6);
         }

         float var12 = (float)(var10 + 1) * var9;
         if (var10 == (Integer)break_[0] - 1) {
            protected_(var7, var11, var11, 0.3F, var12, 0.0F, -0.3F, var12, -0.06F, var10, var6);
         }

         float var13 = (float)var10 * var9;
         class_(var7, var11, var8, -0.3F, var12, 0.0F, -0.3F, var13, -0.06F, var10, var6);
         throws_(var7, var11, var8, 0.3F, var12, 0.0F, 0.3F, var13, -0.06F, var10, var6);
         class_(var4, var7, var11, var8, 0.3F, var12, -0.06F, -0.3F, var13, -0.06F, var10, var6);
         break_(var7, var8, var11, 0.3F, var12, 0.0F, -0.3F, var13, 0.0F, var10, var6);
         var8 = var11.case_();
         var1.break_();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1161467695;
   }

   private float class_(int var1, boolean var2) {
      long var3 = System.currentTimeMillis() / (long)(var2 ? 9 : throws_[4]) % 360L;
      float var5 = (float)(var1 + 1) / (float)((Integer)break_[0]).intValue();
      return (rrus_1)((rruE)rruS.class_[0]).class_[1] == (rrus_1)rrus_1.staticFields671469053d923ac8912036fe43a40b51[1]
         ? (float)(Math.sin(Math.toRadians((double)(var5 * 360.0F - (float)var3))) * 3.0)
         : protected_[64];
   }

   public void break_(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.case_();
      rrci_3 var11 = this.class_(var4, var2);
      if (var11 != null) {
         rdn_3 var12 = var4.class_(rXQ.CHEST);
         if (var12.break_() != rdy_3.kc) {
            if (!(this.byte_() instanceof rruP) || this.byte_().protected_().finally_) {
               if (var4.catch_()) {
                  var4.class_(var4, (Integer)break_[0]);
                  if ((rrur_1)((rruE)rruS.class_[0]).class_[2] == (rrur_1)rrur_1.staticFields11cf60dc087237409ab550ffa4a0389b[1] && var11.class_()) {
                     this.class_(var1, var2, var11, var4, var7, var3);
                  } else {
                     Iq_1[] var13 = (Iq_1[])this.class_[0];

                     for (int var14 = 0; var14 < break_[0]; var14++) {
                        Iq_1 var15 = var13[var14];
                        this.break_(var1, var4, var7, var14);
                        var11.class_(var4, var14, var15, var1, var2, var3, fZ_2.class_);
                        var1.break_();
                     }
                  }
               } else {
                  this.class_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
               }
            }
         }
      }
   }

   private static void break_(Ok_1 var0, rjV_2 var1, rjV_2 var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
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

      float var18 = protected_[85];
      float var19 = 0.34375F;
      float var13 = 0.03125F;
      float var14 = 0.53125F;
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)break_[0]).intValue();
      var14 = var13 + var16 * (float)(var9 + 1);
      var13 += var16 * (float)var9;
      var0.class_(var2, var3, var4, var5)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.1875F, var14)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 0.0F, 0.0F)
         .class_();
      var0.class_(var2, var6, var4, var5)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.34375F, var14)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 0.0F, 0.0F)
         .class_();
      var0.class_(var1, var6, var7, var8)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.34375F, var13)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 0.0F, 0.0F)
         .class_();
      var0.class_(var1, var3, var7, var8)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.1875F, var13)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 1.0F, 1.0F)
         .class_();
   }

   private void break_(Ml_1 var1, cG_2 var2, float var3, int var4) {
      if ((rrca_3)((rruE)rruS.class_[0]).class_[3] != (rrca_3)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[0]) {
         this.byte_(var1, var2, var3, var4);
      } else {
         this.class_(var1, var2, var3, var4);
      }
   }

   private static void break_() {
      byte_ = new short[]{
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

   private static void throws_(Ok_1 var0, rjV_2 var1, rjV_2 var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      if (var3 < var6) {
         var6 = var3;
      }

      if (var4 < var7) {
         float var11 = var4;
         var4 = var7;
         var7 = var11;
      }

      float var17 = protected_[157];
      float var12 = 0.1875F;
      float var13 = 0.03125F;
      float var14 = 0.53125F;
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)break_[0]).intValue();
      var14 = var13 + var16 * (float)(var9 + 1);
      var13 += var16 * (float)var9;
      var0.class_(var1, var6, var4, var8)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.171875F, var14)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 0.0F, 0.0F)
         .class_();
      var0.class_(var1, var6, var4, var5)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.1875F, var14)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 0.0F, 0.0F)
         .class_();
      var0.class_(var2, var6, var7, var5)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.1875F, var13)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 0.0F, 0.0F)
         .class_();
      var0.class_(var2, var6, var7, var8)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.171875F, var13)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 1.0F, 1.0F)
         .class_();
   }

   private void throws_() {
      this.case_();
      Iq_1[] var7 = new Iq_1[break_[0]];
      this.class_[0] = var7;

      for (int var1 = 0; var1 < break_[0]; var1++) {
         Iq_1 var2 = new Iq_1(64, 32, 0, var1);
         ((Iq_1[])this.class_[0])[var1] = var2.class_(-5.0F, (float)var1, -1.0F, 10.0F, 1.0F, 1.0F);
      }
   }

   private static void finally_() {
      protected_ = new float[]{
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

   private static void catch_() {
      Object[] var0 = new Object[]{0, new rruB()};
      break_ = var0;
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void implements_() {
      case_ = new double[]{
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

   private static void protected_(
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

      float var18 = protected_[193];
      float var12 = 0.328125F;
      float var13 = 0.0F;
      float var14 = 0.03125F;
      float var15 = var14 - var13;
      float var16 = var15 / (float)((Integer)break_[0]).intValue();
      var14 = var13 + var16 * (float)(var9 + 1);
      var13 += var16 * (float)var9;
      var0.class_(var2, var3, var7, var8)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.328125F, var13)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 0.0F, 0.0F)
         .class_();
      var0.class_(var2, var6, var7, var8)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.171875F, var13)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 0.0F, 0.0F)
         .class_();
      var0.class_(var1, var6, var4, var5)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.171875F, var14)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 0.0F, 0.0F)
         .class_();
      var0.class_(var1, var3, var4, var5)
         .class_(1.0F, 1.0F, 1.0F, 1.0F)
         .class_(0.328125F, var14)
         .byte_(fZ_2.class_)
         .break_(var10)
         .class_(1.0F, 1.0F, 1.0F)
         .class_();
   }

   private static void protected_() {
      catch_ = new long[]{360L};
   }

   private static void private_() {
      private_ = new boolean[]{
         false, false, false, false, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, false, false
      };
   }
}
