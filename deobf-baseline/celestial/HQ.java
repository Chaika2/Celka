package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class HQ implements AutoCloseable {
   private final fk_3 id_break;
   private final fN_2 id_byte;
   private final rqO_2 id_protected;
   private boolean id_throws;
   private float id_case;
   private final Hh_1 id_catch;
   private final QY id_private;
   private boolean id_implements = true;
   private boolean id_finally = false;
   private rje_3 id_extends = new rje_3();
   public static final int id_class = id_class(15, 15);

   public void id_byte() {
      if (this.id_implements) {
         RenderSystem.activeTexture(33986);
         RenderSystem.matrixMode(5890);
         RenderSystem.loadIdentity();
         float var1 = 0.00390625F;
         RenderSystem.scalef(0.00390625F, 0.00390625F, 0.00390625F);
         RenderSystem.translatef(8.0F, 8.0F, 8.0F);
         RenderSystem.matrixMode(5888);
         this.id_private.A().id_class(this.id_protected);
         RenderSystem.texParameter(3553, 10241, 9729);
         RenderSystem.texParameter(3553, 10240, 9729);
         RenderSystem.texParameter(3553, 10242, 33071);
         RenderSystem.texParameter(3553, 10243, 33071);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableTexture();
         RenderSystem.activeTexture(33984);
         if (rrbb_3.rs()) {
            rrdZ.A();
         }
      }
   }

   public HQ(Hh_1 var1, QY var2) {
      this.id_catch = var1;
      this.id_private = var2;
      this.id_break = new fk_3(16, 16, false);
      this.id_protected = this.id_private.A().id_class("light_map", this.id_break);
      this.id_byte = this.id_break.id_break();

      for (int var3 = 0; var3 < 16; var3++) {
         for (int var4 = 0; var4 < 16; var4++) {
            this.id_byte.id_class(var4, var3, -1);
         }
      }

      this.id_break.id_class();
   }

   private float id_class(rYB var1, int var2) {
      return var1.id_default().id_class(var2);
   }

   private rje_3 id_class(rje_3 var1) {
      this.id_extends.id_break(var1.id_class(), var1.id_break(), var1.id_byte());
      return this.id_extends;
   }

   public static int id_class(int var0) {
      return (var0 & 65535) >> 4;
   }

   public void id_class(boolean var1) {
      this.id_implements = var1;
   }

   private rje_3 id_class(float var1, float var2, float var3) {
      this.id_extends.id_break(var1, var2, var3);
      return this.id_extends;
   }

   public void id_class() {
      this.id_case = (float)((double)this.id_case + (Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
      this.id_case = (float)((double)this.id_case * 0.9);
      this.id_throws = true;
   }

   public void id_class(float var1) {
      if (this.id_throws) {
         this.id_throws = false;
         gm_3 var2 = (gm_3)this.id_private.id_class[56];
         double var3 = ((Qw_1)this.id_private.id_class[20]).a;
         if (var2 != null) {
            this.id_finally = false;
            if (rrbb_3.K()) {
               boolean var5 = var3 == 100.0
                  || ((cb_3)this.id_private.id_class[57]).id_break(rLD.id_int)
                  || ((cb_3)this.id_private.id_class[57]).id_break(rLD.id_throw);
               if (rrbN_2.id_class(var2, this.id_case, this.id_byte, var5, var1)) {
                  this.id_break.id_class();
                  this.id_throws = false;
                  this.id_finally = true;
                  return;
               }
            }

            float var23 = var2.id_class(1.0F);
            float var6;
            if (var2.id_super() > 0) {
               var6 = 1.0F;
            } else {
               var6 = var23 * 0.95F + 0.05F;
            }

            float var7 = ((cb_3)this.id_private.id_class[57]).id_public();
            float var8;
            if (var3 == 100.0) {
               var8 = 1.0F;
            } else if (((cb_3)this.id_private.id_class[57]).id_break(rLD.id_int)) {
               var8 = Hh_1.id_class((cb_3)this.id_private.id_class[57], var1);
            } else if (var7 > 0.0F && ((cb_3)this.id_private.id_class[57]).id_break(rLD.id_throw)) {
               var8 = var7;
            } else {
               var8 = 0.0F;
            }

            rje_3 var9 = new rje_3(var23, var23, 1.0F);
            var9.id_class(new rje_3(1.0F, 1.0F, 1.0F), 0.35F);
            float var10 = this.id_case + 1.5F;
            rje_3 var11 = new rje_3();

            for (int var12 = 0; var12 < 16; var12++) {
               for (int var13 = 0; var13 < 16; var13++) {
                  float var14 = this.id_class(var2, var12) * var6;
                  float var15 = this.id_class(var2, var13) * var10;
                  float var16 = var15 * ((var15 * 0.6F + 0.4F) * 0.6F + 0.4F);
                  float var17 = var15 * (var15 * var15 * 0.6F + 0.4F);
                  var11.id_break(var15, var16, var17);
                  if (var2.id_break().id_protected()) {
                     var11.id_class(this.id_class(0.99F, 1.12F, 1.0F), 0.25F);
                  } else {
                     rje_3 var18 = this.id_class(var9);
                     var18.id_class(var14);
                     var11.id_class(var18);
                     var11.id_class(this.id_class(0.75F, 0.75F, 0.75F), 0.04F);
                     if (this.id_catch.id_break(var1) > 0.0F) {
                        float var19 = this.id_catch.id_break(var1);
                        rje_3 var20 = this.id_class(var11);
                        var20.id_class(0.7F, 0.6F, 0.6F);
                        var11.id_class(var20, var19);
                     }
                  }

                  var11.id_class(0.0F, 1.0F);
                  if (var8 > 0.0F) {
                     float var24 = Math.max(var11.id_class(), Math.max(var11.id_break(), var11.id_byte()));
                     if (var24 < 1.0F) {
                        float var26 = 1.0F / var24;
                        rje_3 var28 = this.id_class(var11);
                        var28.id_class(var26);
                        var11.id_class(var28, var8);
                     }
                  }

                  float var25 = (float)var3;
                  if (var25 == 100.0F) {
                     var25 = 0.0F;
                  }

                  rje_3 var27 = this.id_class(var11);
                  var27.id_class(this::id_break);
                  var11.id_class(var27, var25);
                  var11.id_class(this.id_class(0.75F, 0.75F, 0.75F), 0.04F);
                  var11.id_class(0.0F, 1.0F);
                  var11.id_class(255.0F);
                  int var29 = (int)var11.id_class();
                  int var21 = (int)var11.id_break();
                  int var22 = (int)var11.id_byte();
                  this.id_byte.id_class(var13, var12, 0xFF000000 | var22 << 16 | var21 << 8 | var29);
               }
            }

            this.id_break.id_class();
         }
      }
   }

   public static int id_class(int var0, int var1) {
      return var0 << 4 | var1 << 20;
   }

   @Override
   public void close() {
      this.id_break.close();
   }

   public void id_break() {
      RenderSystem.activeTexture(33986);
      RenderSystem.disableTexture();
      RenderSystem.activeTexture(33984);
      if (rrbb_3.rs()) {
         rrdZ.n();
      }
   }

   private float id_break(float var1) {
      float var2 = 1.0F - var1;
      return 1.0F - var2 * var2 * var2 * var2;
   }

   public static int id_break(int var0) {
      return var0 >> 20 & 65535;
   }

   public boolean id_throws() {
      return this.id_finally;
   }

   public boolean id_protected() {
      return this.id_implements;
   }
}
