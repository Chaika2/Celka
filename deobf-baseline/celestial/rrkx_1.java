package celestial;

import java.io.File;
import java.io.IOException;
import java.net.URI;

public class rrkx_1 extends rrJM {
   protected vm_3 id_class;
   private rrJX id_return = new rrJX(this, new rrJx_1());
   private int id_public = -1;
   private rrkW id_goto;
   private boolean id_while = false;
   private static float[] id_try = new float[]{0.5F, 0.6F, 0.6666667F, 0.75F, 0.8333333F, 0.9F, 1.0F, 1.1666666F, 1.3333334F, 1.5F, 1.6666666F, 1.8F, 2.0F};
   private static String[] id_instanceof = new String[]{
      "0.5x", "0.6x", "0.66x", "0.75x", "0.83x", "0.9x", "1x", "1.16x", "1.33x", "1.5x", "1.66x", "1.8x", "2x"
   };
   private static float id_throw = 1.0F;
   private static float[] id_interface = new float[]{0.0625F, 0.125F, 0.25F};
   private static String[] id_char = new String[]{"0.5x", "1x", "2x"};
   private static float id_abstract = 0.125F;
   public static final int id_private = 0;
   public static final int id_implements = 1;
   public static final int id_finally = 2;
   public static final int id_else = 3;
   public static final int id_synchronized = 4;

   @Override
   protected void id_byte(LZ var1) {
      this.id_class(var1, true);
   }

   public static String id_byte(boolean var0) {
      String var1 = rrba_3.id_break();
      String var2 = rrba_3.id_byte();
      return var0 ? var1 : var2;
   }

   public rrkx_1(vm_3 var1, Qw_1 var2) {
      super(new rgN_2(jI_2.id_class("of.options.shadersTitle")));
      this.id_class = var1;
   }

   public static String id_class(float var0, float[] var1, String[] var2) {
      int var3 = id_class(var0, var1);
      return var2[var3];
   }

   public static String id_class(float var0) {
      return id_class(var0, id_try, id_instanceof);
   }

   public static int id_class(float var0, float[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         float var3 = var1[var2];
         if (var3 >= var0) {
            return var2;
         }
      }

      return var1.length - 1;
   }

   private float id_class(float var1, float[] var2, float var3, boolean var4, boolean var5) {
      if (var5) {
         return var3;
      } else {
         int var6 = id_class(var1, var2);
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

   public void id_class(Ml_1 var1, String var2, int var3, int var4, int var5) {
      id_class(var1, this.id_case, var2, var3, var4, var5);
   }

   private void id_class(LZ var1, boolean var2) {
      if (var1.id_int) {
         if (var1 instanceof rrkO var3) {
            switch (var3.id_private()) {
               case ANTIALIASING:
                  rrdZ.id_class(!var2);
                  if (id_synchronized()) {
                     rrdZ.So = 0;
                  }

                  rrdZ.id_while();
                  break;
               case NORMAL_MAP:
                  rrdZ.SV = !rrdZ.SV;
                  if (id_synchronized()) {
                     rrdZ.SV = true;
                  }

                  rrdZ.id_while();
                  this.id_volatile.x();
                  break;
               case SPECULAR_MAP:
                  rrdZ.Sg = !rrdZ.Sg;
                  if (id_synchronized()) {
                     rrdZ.Sg = true;
                  }

                  rrdZ.id_while();
                  this.id_volatile.x();
                  break;
               case RENDER_RES_MUL:
                  rrdZ.Sy = this.id_class(rrdZ.Sy, id_try, id_throw, !var2, id_synchronized());
                  rrdZ.id_while();
                  rrdZ.id_try();
                  break;
               case SHADOW_RES_MUL:
                  rrdZ.Sp = this.id_class(rrdZ.Sp, id_try, id_throw, !var2, id_synchronized());
                  rrdZ.id_while();
                  rrdZ.id_instanceof();
                  break;
               case HAND_DEPTH_MUL:
                  rrdZ.SH = this.id_class(rrdZ.SH, id_interface, id_abstract, !var2, id_synchronized());
                  rrdZ.id_while();
                  break;
               case OLD_HAND_LIGHT:
                  rrdZ.SY.id_class(!var2);
                  if (id_synchronized()) {
                     rrdZ.SY.id_case();
                  }

                  rrdZ.id_while();
                  break;
               case OLD_LIGHTING:
                  rrdZ.SR.id_class(!var2);
                  if (id_synchronized()) {
                     rrdZ.SR.id_case();
                  }

                  rrdZ.id_private();
                  rrdZ.id_while();
                  this.id_volatile.x();
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
                  var3.id_class("Tex Min: " + rrdZ.SU[rrdZ.Sq]);
                  rrdA.id_break();
                  break;
               case TEX_MAG_FIL_N:
                  rrdZ.SI = (rrdZ.SI + 1) % 2;
                  var3.id_class("Tex_n Mag: " + rrdZ.Se[rrdZ.SI]);
                  rrdA.id_break();
                  break;
               case TEX_MAG_FIL_S:
                  rrdZ.Sf = (rrdZ.Sf + 1) % 2;
                  var3.id_class("Tex_s Mag: " + rrdZ.Se[rrdZ.Sf]);
                  rrdA.id_break();
                  break;
               case SHADOW_CLIP_FRUSTRUM:
                  rrdZ.Sj = !rrdZ.Sj;
                  var3.id_class("ShadowClipFrustrum: " + id_byte(rrdZ.Sj));
                  rrdA.id_break();
            }

            var3.id_implements();
         } else if (!var2 && var1 instanceof rrXi_1 var11) {
            switch (var11.id_class) {
               case 201:
                  switch (id_final()) {
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
                     URI var13 = new File((File)this.id_volatile.id_class[24], "shaderpacks").toURI();
                     rqR_2.id_implements().id_class(var13);
                  } catch (Throwable var8) {
                     var8.printStackTrace();
                     var12 = true;
                  }

                  if (var12) {
                     rrbb_3.id_byte("Opening via system class!");
                     rqR_2.id_implements().id_class("file://" + rrdZ.sG.getAbsolutePath());
                  }
                  break;
               case 202:
                  rrdZ.id_break();
                  this.id_while = true;
                  this.id_volatile.id_break(this.id_class);
                  break;
               case 203:
                  rrkJ var5 = new rrkJ(this, rrbb_3.rE());
                  rrbb_3.X().id_break(var5);
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
                     rqR_2.id_implements().id_class(var6);
                  } catch (Throwable var7) {
                     var7.printStackTrace();
                  }
            }
         }
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      this.id_goto.id_class(var1, var2, var3, var4);
      if (this.id_public <= 0) {
         this.id_goto.id_new();
         this.id_public += 20;
      }

      id_class(var1, this.id_case, this.id_extends, this.id_package / 2, 15, 16777215);
      String var5 = "OpenGL: " + rrdZ.id_case + ", " + rrdZ.id_catch + ", " + rrdZ.id_private;
      int var6 = this.id_case.id_break(var5);
      if (var6 < this.id_package - 5) {
         id_class(var1, this.id_case, var5, this.id_package / 2, this.id_int - 40, 8421504);
      } else {
         id_byte(var1, this.id_case, var5, 5, this.id_int - 40, 8421504);
      }

      super.id_class(var1, var2, var3, var4);
      this.id_return.id_class(var1, var2, var3, this.id_throws);
   }

   @Override
   protected void id_break(LZ var1) {
      this.id_class(var1, false);
   }

   public static String id_break(float var0) {
      return id_class(var0, id_interface, id_char);
   }

   public static String id_break(int var0) {
      if (var0 == 2) {
         return "FXAA 2x";
      } else {
         return var0 == 4 ? "FXAA 4x" : rrba_3.id_byte();
      }
   }

   public void id_finally() {
      boolean var1 = rrbb_3.rs();

      for (LZ var3 : this.id_throws) {
         if (var3 instanceof rrXi_1) {
            rrXi_1 var4 = (rrXi_1)var3;
            if (var4.id_class != 201 && var4.id_class != 202 && var4.id_class != 210 && var4.id_class != rrdy_1.ANTIALIASING.ordinal()) {
               var4.id_int = var1;
            }
         }
      }
   }

   @Override
   public void id_private() {
      super.id_private();
      this.id_public--;
   }

   public static int id_final() {
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

   public QY id_native() {
      return this.id_volatile;
   }

   @Override
   public void v_() {
      if (rrdZ.Sm == null) {
         rrdZ.id_class();
      }

      byte var1 = 120;
      byte var2 = 20;
      int var3 = this.id_package - var1 - 10;
      byte var4 = 30;
      byte var5 = 20;
      int var6 = this.id_package - var1 - 20;
      this.id_goto = new rrkW(this, var6, this.id_int, var4, this.id_int - 50, 16);
      this.id_native.add(this.id_goto);
      this.id_class(new rrkO(rrdy_1.ANTIALIASING, var3, 0 * var5 + var4, var1, var2));
      this.id_class(new rrkO(rrdy_1.NORMAL_MAP, var3, 1 * var5 + var4, var1, var2));
      this.id_class(new rrkO(rrdy_1.SPECULAR_MAP, var3, 2 * var5 + var4, var1, var2));
      this.id_class(new rrkO(rrdy_1.RENDER_RES_MUL, var3, 3 * var5 + var4, var1, var2));
      this.id_class(new rrkO(rrdy_1.SHADOW_RES_MUL, var3, 4 * var5 + var4, var1, var2));
      this.id_class(new rrkO(rrdy_1.HAND_DEPTH_MUL, var3, 5 * var5 + var4, var1, var2));
      this.id_class(new rrkO(rrdy_1.OLD_HAND_LIGHT, var3, 6 * var5 + var4, var1, var2));
      this.id_class(new rrkO(rrdy_1.OLD_LIGHTING, var3, 7 * var5 + var4, var1, var2));
      int var7 = Math.min(150, var6 / 2 - 10);
      int var8 = var6 / 4 - var7 / 2;
      int var9 = this.id_int - 25;
      this.id_class(new rrXi_1(201, var8, var9, var7 - 22 + 1, var2, rrba_3.id_class("of.options.shaders.shadersFolder")));
      this.id_class(new rrkM(210, var8 + var7 - 22 - 1, var9));
      this.id_class(new rrXi_1(202, var6 / 4 * 3 - var7 / 2, this.id_int - 25, var7, var2, jI_2.id_class("gui.done")));
      this.id_class(new rrXi_1(203, var3, this.id_int - 25, var1, var2, rrba_3.id_class("of.options.shaders.shaderOptions")));
      this.id_class(this.id_goto);
      this.id_finally();
   }

   @Override
   public void w_() {
      super.w_();
      if (!this.id_while) {
         rrdZ.id_break();
         this.id_while = true;
      }
   }
}
