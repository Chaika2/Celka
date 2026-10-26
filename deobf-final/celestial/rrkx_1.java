package celestial;

import java.io.File;
import java.io.IOException;
import java.net.URI;

public class rrkx_1 extends rrJM {
   protected vm_3 class_;
   private rrJX return_ = new rrJX(this, new rrJx_1());
   private int public_ = -1;
   private rrkW goto_;
   private boolean while_ = false;
   private static float[] try_ = new float[]{0.5F, 0.6F, 0.6666667F, 0.75F, 0.8333333F, 0.9F, 1.0F, 1.1666666F, 1.3333334F, 1.5F, 1.6666666F, 1.8F, 2.0F};
   private static String[] instanceof_ = new String[]{"0.5x", "0.6x", "0.66x", "0.75x", "0.83x", "0.9x", "1x", "1.16x", "1.33x", "1.5x", "1.66x", "1.8x", "2x"};
   private static float throw_ = 1.0F;
   private static float[] interface_ = new float[]{0.0625F, 0.125F, 0.25F};
   private static String[] char_ = new String[]{"0.5x", "1x", "2x"};
   private static float abstract_ = 0.125F;
   public static final int private_ = 0;
   public static final int implements_ = 1;
   public static final int finally_ = 2;
   public static final int else_ = 3;
   public static final int synchronized_ = 4;

   @Override
   protected void byte_(LZ var1) {
      this.class_(var1, true);
   }

   public static String byte_(boolean var0) {
      String var1 = rrba_3.break_();
      String var2 = rrba_3.byte_();
      return var0 ? var1 : var2;
   }

   public rrkx_1(vm_3 var1, Qw_1 var2) {
      super(new rgN_2(jI_2.class_("of.options.shadersTitle")));
      this.class_ = var1;
   }

   public static String class_(float var0, float[] var1, String[] var2) {
      int var3 = class_(var0, var1);
      return var2[var3];
   }

   public static String class_(float var0) {
      return class_(var0, try_, instanceof_);
   }

   public static int class_(float var0, float[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         float var3 = var1[var2];
         if (var3 >= var0) {
            return var2;
         }
      }

      return var1.length - 1;
   }

   private float class_(float var1, float[] var2, float var3, boolean var4, boolean var5) {
      if (var5) {
         return var3;
      } else {
         int var6 = class_(var1, var2);
         if (var4) {
            if (++var6 >= var2.length) {
               var6 = 0;
            }
         } else if (--var6 < 0) {
            var6 = var2.length - 1;
         }

         return var2[var6];
      }
   }

   public void class_(Ml_1 var1, String var2, int var3, int var4, int var5) {
      class_(var1, this.case_, var2, var3, var4, var5);
   }

   private void class_(LZ var1, boolean var2) {
      if (var1.int_) {
         if (var1 instanceof rrkO var3) {
            switch (var3.private_()) {
               case ANTIALIASING:
                  rrdZ.class_(!var2);
                  if (synchronized_()) {
                     rrdZ.So = 0;
                  }

                  rrdZ.while_();
                  break;
               case NORMAL_MAP:
                  rrdZ.SV = !rrdZ.SV;
                  if (synchronized_()) {
                     rrdZ.SV = true;
                  }

                  rrdZ.while_();
                  this.volatile_.x();
                  break;
               case SPECULAR_MAP:
                  rrdZ.Sg = !rrdZ.Sg;
                  if (synchronized_()) {
                     rrdZ.Sg = true;
                  }

                  rrdZ.while_();
                  this.volatile_.x();
                  break;
               case RENDER_RES_MUL:
                  rrdZ.Sy = this.class_(rrdZ.Sy, try_, throw_, !var2, synchronized_());
                  rrdZ.while_();
                  rrdZ.try_();
                  break;
               case SHADOW_RES_MUL:
                  rrdZ.Sp = this.class_(rrdZ.Sp, try_, throw_, !var2, synchronized_());
                  rrdZ.while_();
                  rrdZ.instanceof_();
                  break;
               case HAND_DEPTH_MUL:
                  rrdZ.SH = this.class_(rrdZ.SH, interface_, abstract_, !var2, synchronized_());
                  rrdZ.while_();
                  break;
               case OLD_HAND_LIGHT:
                  rrdZ.SY.class_(!var2);
                  if (synchronized_()) {
                     rrdZ.SY.case_();
                  }

                  rrdZ.while_();
                  break;
               case OLD_LIGHTING:
                  rrdZ.SR.class_(!var2);
                  if (synchronized_()) {
                     rrdZ.SR.case_();
                  }

                  rrdZ.private_();
                  rrdZ.while_();
                  this.volatile_.x();
                  break;
               case TWEAK_BLOCK_DAMAGE:
                  rrdZ.SC = !rrdZ.SC;
                  break;
               case CLOUD_SHADOW:
                  rrdZ.Sl = !rrdZ.Sl;
                  break;
               case TEX_MIN_FIL_B:
                  rrdZ.Sq = (rrdZ.Sq + 1) % 3;
                  rrdZ.ST = rrdZ.St = rrdZ.Sq;
                  var3.class_("Tex Min: " + rrdZ.SU[rrdZ.Sq]);
                  rrdA.break_();
                  break;
               case TEX_MAG_FIL_N:
                  rrdZ.SI = (rrdZ.SI + 1) % 2;
                  var3.class_("Tex_n Mag: " + rrdZ.Se[rrdZ.SI]);
                  rrdA.break_();
                  break;
               case TEX_MAG_FIL_S:
                  rrdZ.Sf = (rrdZ.Sf + 1) % 2;
                  var3.class_("Tex_s Mag: " + rrdZ.Se[rrdZ.Sf]);
                  rrdA.break_();
                  break;
               case SHADOW_CLIP_FRUSTRUM:
                  rrdZ.Sj = !rrdZ.Sj;
                  var3.class_("ShadowClipFrustrum: " + byte_(rrdZ.Sj));
                  rrdA.break_();
            }

            var3.implements_();
         } else if (!var2 && var1 instanceof rrXi_1 var11) {
            switch (var11.class_) {
               case 201:
                  switch (final_()) {
                     case 1:
                        String var4 = String.format("cmd.exe /C start \"Open file\" \"%s\"", rrdZ.sG.getAbsolutePath());

                        try {
                           Runtime.getRuntime().exec(var4);
                           return;
                        } catch (IOException var10) {
                           var10.printStackTrace();
                           break;
                        }
                     case 2:
                        try {
                           Runtime.getRuntime().exec(new String[]{"/usr/bin/open", rrdZ.sG.getAbsolutePath()});
                           return;
                        } catch (IOException var9) {
                           var9.printStackTrace();
                        }
                  }

                  boolean var12 = false;

                  try {
                     URI var13 = new File((File)this.volatile_.class_[24], "shaderpacks").toURI();
                     rqR_2.implements_().class_(var13);
                  } catch (Throwable var8) {
                     var8.printStackTrace();
                     var12 = true;
                  }

                  if (var12) {
                     rrbb_3.byte_("Opening via system class!");
                     rqR_2.implements_().class_("file://" + rrdZ.sG.getAbsolutePath());
                  }
                  break;
               case 202:
                  rrdZ.break_();
                  this.while_ = true;
                  this.volatile_.break_(this.class_);
                  break;
               case 203:
                  rrkJ var5 = new rrkJ(this, rrbb_3.rE());
                  rrbb_3.X().break_(var5);
               case 204:
               case 205:
               case 206:
               case 207:
               case 208:
               case 209:
               default:
                  break;
               case 210:
                  try {
                     URI var6 = new URI("http://optifine.net/shaderPacks");
                     rqR_2.implements_().class_(var6);
                  } catch (Throwable var7) {
                     var7.printStackTrace();
                  }
            }
         }
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      this.goto_.class_(var1, var2, var3, var4);
      if (this.public_ <= 0) {
         this.goto_.new_();
         this.public_ += 20;
      }

      class_(var1, this.case_, this.extends_, this.package_ / 2, 15, 16777215);
      String var5 = "OpenGL: " + rrdZ.case_ + ", " + rrdZ.catch_ + ", " + rrdZ.private_;
      int var6 = this.case_.break_(var5);
      if (var6 < this.package_ - 5) {
         class_(var1, this.case_, var5, this.package_ / 2, this.int_ - 40, 8421504);
      } else {
         byte_(var1, this.case_, var5, 5, this.int_ - 40, 8421504);
      }

      super.class_(var1, var2, var3, var4);
      this.return_.class_(var1, var2, var3, this.throws_);
   }

   @Override
   protected void break_(LZ var1) {
      this.class_(var1, false);
   }

   public static String break_(float var0) {
      return class_(var0, interface_, char_);
   }

   public static String break_(int var0) {
      if (var0 == 2) {
         return "FXAA 2x";
      } else {
         return var0 == 4 ? "FXAA 4x" : rrba_3.byte_();
      }
   }

   public void finally_() {
      boolean var1 = rrbb_3.rs();

      for (LZ var3 : this.throws_) {
         if (var3 instanceof rrXi_1) {
            rrXi_1 var4 = (rrXi_1)var3;
            if (var4.class_ != 201 && var4.class_ != 202 && var4.class_ != 210 && var4.class_ != rrdy_1.ANTIALIASING.ordinal()) {
               var4.int_ = var1;
            }
         }
      }
   }

   @Override
   public void private_() {
      super.private_();
      this.public_--;
   }

   public static int final_() {
      String var0 = System.getProperty("os.name").toLowerCase();
      if (var0.contains("win")) {
         return 1;
      } else if (var0.contains("mac")) {
         return 2;
      } else if (var0.contains("solaris")) {
         return 3;
      } else if (var0.contains("sunos")) {
         return 3;
      } else if (var0.contains("linux")) {
         return 4;
      } else {
         return var0.contains("unix") ? 4 : 0;
      }
   }

   public QY native_() {
      return this.volatile_;
   }

   @Override
   public void v_() {
      if (rrdZ.Sm == null) {
         rrdZ.class_();
      }

      byte var1 = 120;
      byte var2 = 20;
      int var3 = this.package_ - var1 - 10;
      byte var4 = 30;
      byte var5 = 20;
      int var6 = this.package_ - var1 - 20;
      this.goto_ = new rrkW(this, var6, this.int_, var4, this.int_ - 50, 16);
      this.native_.add(this.goto_);
      this.class_(new rrkO(rrdy_1.ANTIALIASING, var3, 0 * var5 + var4, var1, var2));
      this.class_(new rrkO(rrdy_1.NORMAL_MAP, var3, 1 * var5 + var4, var1, var2));
      this.class_(new rrkO(rrdy_1.SPECULAR_MAP, var3, 2 * var5 + var4, var1, var2));
      this.class_(new rrkO(rrdy_1.RENDER_RES_MUL, var3, 3 * var5 + var4, var1, var2));
      this.class_(new rrkO(rrdy_1.SHADOW_RES_MUL, var3, 4 * var5 + var4, var1, var2));
      this.class_(new rrkO(rrdy_1.HAND_DEPTH_MUL, var3, 5 * var5 + var4, var1, var2));
      this.class_(new rrkO(rrdy_1.OLD_HAND_LIGHT, var3, 6 * var5 + var4, var1, var2));
      this.class_(new rrkO(rrdy_1.OLD_LIGHTING, var3, 7 * var5 + var4, var1, var2));
      int var7 = Math.min(150, var6 / 2 - 10);
      int var8 = var6 / 4 - var7 / 2;
      int var9 = this.int_ - 25;
      this.class_(new rrXi_1(201, var8, var9, var7 - 22 + 1, var2, rrba_3.class_("of.options.shaders.shadersFolder")));
      this.class_(new rrkM(210, var8 + var7 - 22 - 1, var9));
      this.class_(new rrXi_1(202, var6 / 4 * 3 - var7 / 2, this.int_ - 25, var7, var2, jI_2.class_("gui.done")));
      this.class_(new rrXi_1(203, var3, this.int_ - 25, var1, var2, rrba_3.class_("of.options.shaders.shaderOptions")));
      this.class_(this.goto_);
      this.finally_();
   }

   @Override
   public void w_() {
      super.w_();
      if (!this.while_) {
         rrdZ.break_();
         this.while_ = true;
      }
   }
}
