package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class HQ implements AutoCloseable {
   private final fk_3 break_;
   private final fN_2 byte_;
   private final rqO_2 protected_;
   private boolean throws_;
   private float case_;
   private final Hh_1 catch_;
   private final QY private_;
   private boolean implements_ = true;
   private boolean finally_ = false;
   private rje_3 extends_ = new rje_3();
   public static final int class_ = class_(15, 15);

   public void byte_() {
      if (this.implements_) {
         RenderSystem.activeTexture(33986);
         RenderSystem.matrixMode(5890);
         RenderSystem.loadIdentity();
         float var1 = 0.00390625F;
         RenderSystem.scalef(0.00390625F, 0.00390625F, 0.00390625F);
         RenderSystem.translatef(8.0F, 8.0F, 8.0F);
         RenderSystem.matrixMode(5888);
         this.private_.A().class_(this.protected_);
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
      this.catch_ = var1;
      this.private_ = var2;
      this.break_ = new fk_3(16, 16, false);
      this.protected_ = this.private_.A().class_("light_map", this.break_);
      this.byte_ = this.break_.break_();

      for (int var3 = 0; var3 < 16; var3++) {
         for (int var4 = 0; var4 < 16; var4++) {
            this.byte_.class_(var4, var3, -1);
         }
      }

      this.break_.class_();
   }

   private float class_(rYB var1, int var2) {
      return var1.default_().class_(var2);
   }

   private rje_3 class_(rje_3 var1) {
      this.extends_.break_(var1.class_(), var1.break_(), var1.byte_());
      return this.extends_;
   }

   public static int class_(int var0) {
      return (var0 & 65535) >> 4;
   }

   public void class_(boolean var1) {
      this.implements_ = var1;
   }

   private rje_3 class_(float var1, float var2, float var3) {
      this.extends_.break_(var1, var2, var3);
      return this.extends_;
   }

   public void class_() {
      this.case_ = (float)((double)this.case_ + (Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
      this.case_ = (float)((double)this.case_ * 0.9);
      this.throws_ = true;
   }

   public void class_(float var1) {
      if (this.throws_) {
         this.throws_ = false;
         gm_3 var2 = (gm_3)this.private_.class_[56];
         double var3 = ((Qw_1)this.private_.class_[20]).a;
         if (var2 != null) {
            this.finally_ = false;
            if (rrbb_3.K()) {
               boolean var5 = var3 == 100.0 || ((cb_3)this.private_.class_[57]).break_(rLD.int_) || ((cb_3)this.private_.class_[57]).break_(rLD.throw_);
               if (rrbN_2.class_(var2, this.case_, this.byte_, var5, var1)) {
                  this.break_.class_();
                  this.throws_ = false;
                  this.finally_ = true;
                  return;
               }
            }

            float var23 = var2.class_(1.0F);
            float var6;
            if (var2.super_() > 0) {
               var6 = 1.0F;
            } else {
               var6 = var23 * 0.95F + 0.05F;
            }

            float var7 = ((cb_3)this.private_.class_[57]).public_();
            float var8;
            if (var3 == 100.0) {
               var8 = 1.0F;
            } else if (((cb_3)this.private_.class_[57]).break_(rLD.int_)) {
               var8 = Hh_1.class_((cb_3)this.private_.class_[57], var1);
            } else if (var7 > 0.0F && ((cb_3)this.private_.class_[57]).break_(rLD.throw_)) {
               var8 = var7;
            } else {
               var8 = 0.0F;
            }

            rje_3 var9 = new rje_3(var23, var23, 1.0F);
            var9.class_(new rje_3(1.0F, 1.0F, 1.0F), 0.35F);
            float var10 = this.case_ + 1.5F;
            rje_3 var11 = new rje_3();

            for (int var12 = 0; var12 < 16; var12++) {
               for (int var13 = 0; var13 < 16; var13++) {
                  float var14 = this.class_(var2, var12) * var6;
                  float var15 = this.class_(var2, var13) * var10;
                  float var16 = var15 * ((var15 * 0.6F + 0.4F) * 0.6F + 0.4F);
                  float var17 = var15 * (var15 * var15 * 0.6F + 0.4F);
                  var11.break_(var15, var16, var17);
                  if (var2.break_().protected_()) {
                     var11.class_(this.class_(0.99F, 1.12F, 1.0F), 0.25F);
                  } else {
                     rje_3 var18 = this.class_(var9);
                     var18.class_(var14);
                     var11.class_(var18);
                     var11.class_(this.class_(0.75F, 0.75F, 0.75F), 0.04F);
                     if (this.catch_.break_(var1) > 0.0F) {
                        float var19 = this.catch_.break_(var1);
                        rje_3 var20 = this.class_(var11);
                        var20.class_(0.7F, 0.6F, 0.6F);
                        var11.class_(var20, var19);
                     }
                  }

                  var11.class_(0.0F, 1.0F);
                  if (var8 > 0.0F) {
                     float var24 = Math.max(var11.class_(), Math.max(var11.break_(), var11.byte_()));
                     if (var24 < 1.0F) {
                        float var26 = 1.0F / var24;
                        rje_3 var28 = this.class_(var11);
                        var28.class_(var26);
                        var11.class_(var28, var8);
                     }
                  }

                  float var25 = (float)var3;
                  if (var25 == 100.0F) {
                     var25 = 0.0F;
                  }

                  rje_3 var27 = this.class_(var11);
                  var27.class_(this::break_);
                  var11.class_(var27, var25);
                  var11.class_(this.class_(0.75F, 0.75F, 0.75F), 0.04F);
                  var11.class_(0.0F, 1.0F);
                  var11.class_(255.0F);
                  int var29 = (int)var11.class_();
                  int var21 = (int)var11.break_();
                  int var22 = (int)var11.byte_();
                  this.byte_.class_(var13, var12, 0xFF000000 | var22 << 16 | var21 << 8 | var29);
               }
            }

            this.break_.class_();
         }
      }
   }

   public static int class_(int var0, int var1) {
      return var0 << 4 | var1 << 20;
   }

   @Override
   public void close() {
      this.break_.close();
   }

   public void break_() {
      RenderSystem.activeTexture(33986);
      RenderSystem.disableTexture();
      RenderSystem.activeTexture(33984);
      if (rrbb_3.rs()) {
         rrdZ.n();
      }
   }

   private float break_(float var1) {
      float var2 = 1.0F - var1;
      return 1.0F - var2 * var2 * var2 * var2;
   }

   public static int break_(int var0) {
      return var0 >> 20 & 65535;
   }

   public boolean throws_() {
      return this.finally_;
   }

   public boolean protected_() {
      return this.implements_;
   }
}
