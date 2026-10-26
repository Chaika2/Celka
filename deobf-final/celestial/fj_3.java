package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class fj_3 implements AutoCloseable, rrGl_1 {
   private final fJ_2 int_;
   final fV_2 new_;
   final ji_3 continue_;
   protected final fN_2[] class_;
   final int[] super_;
   final int[] this_;
   private final fg_3 else_;
   private final int synchronized_;
   private final int return_;
   private final float public_;
   private final float goto_;
   private final float while_;
   private final float try_;
   int instanceof_;
   int throw_;
   private int interface_ = -1;
   public float break_;
   public float byte_;
   public int protected_;
   public int throws_;
   public int case_ = -1;
   public fj_3 catch_ = null;
   public boolean private_ = false;
   public static final String implements_ = ".sprite_single";
   public int finally_ = 0;
   public fj_3 extends_ = null;
   public fj_3 native_ = null;
   public rrdn_1 volatile_ = null;
   public fj_3 final_ = null;
   public boolean package_ = false;
   private int char_ = -1;
   private boolean abstract_ = false;
   private boolean long_ = false;
   private boolean float_;
   private boolean void_;
   private boolean static_;
   private rAL import_;

   public float byte_(float var1) {
      var1 -= this.break_;
      float var2 = (float)this.protected_ / (float)this.protected_();
      return var1 * var2;
   }

   public boolean int_() {
      return this.continue_.class_() > 1;
   }

   public fj_3(rqO_2 var1) {
      this.int_ = null;
      this.new_ = new fV_2(var1, 0, 0, (ji_3)null);
      this.continue_ = null;
      this.class_ = null;
      this.super_ = new int[0];
      this.this_ = new int[0];
      this.else_ = null;
      this.synchronized_ = 0;
      this.return_ = 0;
      this.public_ = 0.0F;
      this.goto_ = 0.0F;
      this.while_ = 0.0F;
      this.try_ = 0.0F;
   }

   protected fj_3(fJ_2 var1, fV_2 var2, int var3, int var4, int var5, int var6, int var7, fN_2 var8, rrdn_1 var9) {
      this.int_ = var1;
      ji_3 var10 = var2.protected_;
      int var11 = var2.break_;
      int var12 = var2.byte_;
      this.synchronized_ = var6;
      this.return_ = var7;
      this.public_ = (float)var6 / (float)var4;
      this.goto_ = (float)(var6 + var11) / (float)var4;
      this.while_ = (float)var7 / (float)var5;
      this.try_ = (float)(var7 + var12) / (float)var5;
      if (var2.throws_ > 1.0) {
         int var13 = (int)Math.round((double)var8.class_() * var2.throws_);
         fN_2 var14 = rrzJ_2.class_(var8, var13);
         if (var14 != var8) {
            var8.close();
            var8 = var14;
         }
      }

      this.volatile_ = var9;
      rrko_1 var24 = this.int_.class_(this.volatile_);
      if (this.volatile_ == null && !var2.class_().break_().endsWith("_leaves")) {
         this.class_(var8);
      }

      fN_2 var25 = var8;
      int var15 = var8.class_() / var10.break_(var11);
      int var16 = var8.break_() / var10.class_(var12);
      if (var10.class_() > 0) {
         int var17 = var10.protected_().stream().max(Integer::compareTo).get() + 1;
         this.super_ = new int[var17];
         this.this_ = new int[var17];
         Arrays.fill(this.super_, -1);
         Arrays.fill(this.this_, -1);

         for (int var19 : var10.protected_()) {
            if (var19 >= var15 * var16) {
               throw new RuntimeException("invalid frameindex " + var19);
            }

            int var20 = var19 / var15;
            int var21 = var19 % var15;
            this.super_[var19] = var21;
            this.this_[var19] = var20;
         }
      } else {
         ArrayList var26 = Lists.newArrayList();
         int var27 = var15 * var16;
         this.super_ = new int[var27];
         this.this_ = new int[var27];

         for (int var30 = 0; var30 < var16; var30++) {
            for (int var33 = 0; var33 < var15; var33++) {
               int var34 = var30 * var15 + var33;
               this.super_[var34] = var33;
               this.this_[var34] = var30;
               var26.add(new ja_3(var34, -1));
            }
         }

         var10 = new ji_3(var26, var11, var12, var10.break_(), var10.byte_());
      }

      this.new_ = new fV_2(var2.class_, var11, var12, var10);
      this.continue_ = var10;

      try {
         try {
            this.class_ = fz_3.class_(var8, var3, var24);
         } catch (Throwable var22) {
            KY var29 = KY.class_(var22, "Generating mipmaps for frame");
            Ko_1 var32 = var29.class_("Frame being iterated");
            var32.class_("First frame", () -> {
               StringBuilder var1x = new StringBuilder();
               if (var1x.length() > 0) {
                  var1x.append(", ");
               }

               var1x.append(var25.class_()).append("x").append(var25.break_());
               return var1x.toString();
            });
            throw new KU(var29);
         }
      } catch (Throwable var23) {
         KY var28 = KY.class_(var23, "Applying mipmap");
         Ko_1 var31 = var28.class_("Sprite being mipmapped");
         var31.class_("Sprite name", () -> this.finally_().toString());
         var31.class_("Sprite size", () -> this.protected_() + " x " + this.throws_());
         var31.class_("Sprite frames", () -> this.native_() + " frames");
         var31.class_("Mipmap levels", var3);
         throw new KU(var28);
      }

      if (var10.byte_()) {
         this.else_ = new fg_3(this, var2, var3);
      } else {
         this.else_ = null;
      }

      this.finally_ = var3;
      this.break_ = Math.min(this.public_, this.goto_);
      this.byte_ = Math.min(this.while_, this.try_);
      this.protected_ = var4;
      this.throws_ = var5;
   }

   private fj_3(fj_3 var1) {
      this.int_ = var1.int_;
      fV_2 var2 = var1.new_;
      rqO_2 var3 = var2.class_();
      rqO_2 var4 = new rqO_2(var3.byte_(), var3.break_() + ".sprite_single");
      int var5 = var2.break_();
      int var6 = var2.byte_();
      ji_3 var7 = var2.protected_();
      this.new_ = new fV_2(var4, var5, var6, var7);
      this.continue_ = var1.continue_;
      this.long_ = true;
      this.class_ = var1.class_;
      this.super_ = var1.super_;
      this.this_ = var1.this_;
      if (var1.else_ != null) {
         this.else_ = new fg_3(this, var1.else_.break_);
      } else {
         this.else_ = null;
      }

      this.synchronized_ = 0;
      this.return_ = 0;
      this.public_ = 0.0F;
      this.goto_ = 1.0F;
      this.while_ = 0.0F;
      this.try_ = 1.0F;
      this.instanceof_ = var1.instanceof_;
      this.throw_ = var1.throw_;
      this.interface_ = var1.interface_;
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.throws_;
      this.private_ = true;
      this.finally_ = var1.finally_;
      this.char_ = var1.char_;
      this.abstract_ = var1.abstract_;
   }

   protected fj_3(fJ_2 var1, fV_2 var2, int var3, int var4, int var5, int var6, int var7, fN_2 var8) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, (rrdn_1)null);
   }

   @Override
   public String toString() {
      int var1 = this.super_.length;
      return "TextureAtlasSprite{name='"
         + this.new_.class_
         + "', frameCount="
         + var1
         + ", x="
         + this.synchronized_
         + ", y="
         + this.return_
         + ", height="
         + this.new_.byte_
         + ", width="
         + this.new_.break_
         + ", u0="
         + this.public_
         + ", u1="
         + this.goto_
         + ", v0="
         + this.while_
         + ", v1="
         + this.try_
         + "}";
   }

   public void this_() {
      if (this.case_ < 0) {
         this.case_ = fo_3.class_();
         fo_3.class_(this.case_, this.finally_, this.protected_(), this.throws_());
         boolean var1 = this.int_.break_(this.volatile_);
         if (var1) {
            rrzJ_2.throws_();
         } else {
            MT.class_(3553, 34046, 1.0F);
            int var2 = this.finally_ > 0 ? 9984 : 9728;
            MT.break_(3553, 10241, var2);
            MT.break_(3553, 10240, 9728);
         }
      }

      rrzJ_2.protected_(this.case_);
   }

   private float class_() {
      float var1 = (float)this.new_.break_ / (this.goto_ - this.public_);
      float var2 = (float)this.new_.byte_ / (this.try_ - this.while_);
      return Math.max(var2, var1);
   }

   public double class_(float var1) {
      float var2 = this.goto_ - this.public_;
      return (double)((var1 - this.public_) / var2 * 16.0F);
   }

   public boolean class_(int var1, int var2, int var3) {
      return (this.class_[0].class_(var2 + this.super_[var1] * this.new_.break_, var3 + this.this_[var1] * this.new_.byte_) >> 24 & 0xFF) == 0;
   }

   public Ok_1 class_(Ok_1 var1) {
      if (this.finally_() == rrzJ_2.goto_) {
         Hd_1 var2 = var1.protected_();
         if (var2 != null) {
            return var2.protected_();
         }
      }

      return new yE_2(var1, this);
   }

   private void class_(int[] var1) {
      if (var1 != null) {
         long var2 = 0L;
         long var4 = 0L;
         long var6 = 0L;
         long var8 = 0L;

         for (int var10 = 0; var10 < var1.length; var10++) {
            int var11 = var1[var10];
            int var12 = var11 >> 24 & 0xFF;
            if (var12 >= 16) {
               int var13 = var11 >> 16 & 0xFF;
               int var14 = var11 >> 8 & 0xFF;
               int var15 = var11 & 0xFF;
               var2 += (long)var13;
               var4 += (long)var14;
               var6 += (long)var15;
               var8++;
            }
         }

         if (var8 > 0L) {
            int var17 = (int)(var2 / var8);
            int var18 = (int)(var4 / var8);
            int var19 = (int)(var6 / var8);
            int var20 = var17 << 16 | var18 << 8 | var19;

            for (int var21 = 0; var21 < var1.length; var21++) {
               int var22 = var1[var21];
               int var16 = var22 >> 24 & 0xFF;
               if (var16 <= 16) {
                  var1[var21] = var20;
               }
            }
         }
      }
   }

   private void class_(fN_2 var1) {
      int[] var2 = new int[var1.class_() * var1.break_()];
      var1.private_().get(var2);
      this.class_(var2);
      var1.private_().put(var2);
   }

   void class_(int var1, int var2, fN_2[] var3) {
      boolean var4 = false;
      boolean var5 = this.private_;

      for (int var6 = 0; var6 < var3.length && this.protected_() >> var6 > 0 && this.throws_() >> var6 > 0; var6++) {
         var3[var6]
            .class_(
               var6,
               this.synchronized_ >> var6,
               this.return_ >> var6,
               var1 >> var6,
               var2 >> var6,
               this.new_.break_ >> var6,
               this.new_.byte_ >> var6,
               var4,
               var5,
               var3.length > 1,
               false
            );
      }
   }

   public void class_(rAL var1) {
      this.import_ = var1;
      this.class_(this.int_.extends_());
      this.class_(this.int_.finally_());
   }

   public float class_(double var1) {
      float var3 = this.goto_ - this.public_;
      return this.public_ + var3 * (float)var1 / 16.0F;
   }

   private void class_(boolean var1) {
      this.float_ = var1;
      this.static_ = false;
      this.void_ = false;
      if (this.catch_ != null) {
         this.else_();
         this.catch_ = null;
      }

      if (this.extends_ != null) {
         if (this.extends_.catch_ != null) {
            this.extends_.else_();
         }

         this.extends_.close();
         this.extends_ = null;
      }

      if (this.native_ != null) {
         if (this.native_.catch_ != null) {
            this.native_.else_();
         }

         this.native_.close();
         this.native_ = null;
      }

      this.static_ = rrbb_3.w();
      this.void_ = rrbb_3.rs();
      if (this.float_ && this.static_ && !this.private_) {
         this.catch_ = this.while_();
      }

      if (this.void_ && !this.private_) {
         if (this.extends_ == null && rrdZ.SV) {
            this.extends_ = this.class_(rrdn_1.NORMAL, -8421377, this.continue_);
         }

         if (this.native_ == null && rrdZ.Sg) {
            this.native_ = this.class_(rrdn_1.SPECULAR, 0, this.continue_);
         }
      }
   }

   private static boolean class_(ji_3 var0, ji_3 var1) {
      if (var0 == var1) {
         return true;
      } else if (var0 != null && var1 != null) {
         if (var0.break_() != var1.break_()) {
            return false;
         } else if (var0.byte_() != var1.byte_()) {
            return false;
         } else if (var0.class_() != var1.class_()) {
            return false;
         } else {
            for (int var2 = 0; var2 < var0.class_(); var2++) {
               if (var0.byte_(var2) != var1.byte_(var2)) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public void class_(rrWd_1 var1) {
      if (this.interface_ < 0) {
         if (this.int_ != null) {
            fj_3 var2 = this.int_.byte_(this.finally_());
            if (var2 != null) {
               this.interface_ = var2.new_();
            }
         }

         if (this.interface_ < 0) {
            this.interface_ = var1.class_();
         }
      }
   }

   public void class_(int var1) {
      this.char_ = var1;
      if (this.catch_ != null) {
         this.catch_.class_(var1);
      }

      if (this.extends_ != null) {
         this.extends_.class_(var1);
      }

      if (this.native_ != null) {
         this.native_.class_(var1);
      }
   }

   public fj_3 class_(rrdn_1 var1, int var2, ji_3 var3) {
      String var4 = var1.class_();
      rqO_2 var5 = new rqO_2(this.finally_().byte_(), this.finally_().break_() + var4);
      rqO_2 var6 = this.int_.class_(var5);
      fj_3 var7 = null;
      if (this.import_.break_(var6)) {
         try (rAF var8 = this.import_.class_(var6)) {
            rAF var9 = this.import_.class_(var6);
            fF_2 var10 = new fF_2(var6.toString(), var9.break_());
            ji_3 var11 = var8.class_(ji_3.class_);
            if (var11 == null) {
               var11 = ji_3.break_;
            }

            Pair var12 = var11.class_(var10.class_, var10.break_);
            fV_2 var13 = new fV_2(var5, (Integer)var12.getFirst(), (Integer)var12.getSecond(), var11);
            fN_2 var14 = fN_2.class_(var8.break_());
            if (var14.class_() != this.protected_()) {
               fN_2 var15 = rrzJ_2.class_(var14, this.protected_());
               if (var15 != var14) {
                  double var16 = 1.0 * (double)this.protected_() / (double)var14.class_();
                  var14.close();
                  var14 = var15;
                  var13 = new fV_2(
                     var5, (int)((double)((Integer)var12.getFirst()).intValue() * var16), (int)((double)((Integer)var12.getSecond()).intValue() * var16), var11
                  );
               }
            }

            var7 = new fj_3(this.int_, var13, this.finally_, this.protected_, this.throws_, this.synchronized_, this.return_, var14, var1);
         } catch (IOException var20) {
         }
      }

      if (var7 == null) {
         fN_2 var21 = new fN_2(this.protected_(), this.throws_(), false);
         int var22 = rrzJ_2.case_(var2);
         var21.class_(0, 0, var21.class_(), var21.break_(), var22);
         fV_2 var23 = new fV_2(var5, this.protected_(), this.throws_(), ji_3.break_);
         var7 = new fj_3(this.int_, var23, this.finally_, this.protected_, this.throws_, this.synchronized_, this.return_, var21, var1);
      }

      if (this.float_ && this.static_ && !this.private_) {
         var7.catch_ = var7.while_();
      }

      var7.long_ = class_(var7.continue_, var3);
      return var7;
   }

   @Override
   public void close() {
      for (fN_2 var4 : this.class_) {
         if (var4 != null) {
            var4.close();
         }
      }

      if (this.else_ != null) {
         this.else_.close();
      }

      if (this.catch_ != null) {
      }

      if (this.extends_ != null) {
         this.extends_.close();
      }

      if (this.native_ != null) {
         this.native_.close();
      }
   }

   public double break_(float var1) {
      float var2 = this.try_ - this.while_;
      return (double)((var1 - this.while_) / var2 * 16.0F);
   }

   public int break_(int var1, int var2, int var3) {
      return this.class_[0].class_(var2 + this.super_[var1] * this.protected_(), var3 + this.this_[var1] * this.throws_());
   }

   public float break_(double var1) {
      float var3 = this.try_ - this.while_;
      return this.while_ + var3 * (float)var1 / 16.0F;
   }

   private void break_(int var1) {
      int var2 = this.super_[var1] * this.new_.break_;
      int var3 = this.this_[var1] * this.new_.byte_;
      this.class_(var2, var3, this.class_);
   }

   public float throws_(float var1) {
      float var2 = this.goto_ - this.public_;
      return (var1 - this.public_) / var2 * 16.0F;
   }

   public int throws_() {
      return this.new_.byte_;
   }

   public rqO_2 finally_() {
      return this.new_.class_;
   }

   public float catch_() {
      return this.goto_;
   }

   public fJ_2 extends_() {
      return this.int_;
   }

   public int goto_() {
      return this.return_;
   }

   public float case_() {
      return this.public_;
   }

   public float case_(float var1) {
      float var2 = this.try_ - this.while_;
      return (var1 - this.while_) / var2 * 16.0F;
   }

   public int continue_() {
      return this.char_;
   }

   public void else_() {
      if (this.case_ >= 0) {
         fo_3.class_(this.case_);
         this.case_ = -1;
      }
   }

   public float implements_() {
      return this.try_;
   }

   public int new_() {
      return this.interface_;
   }

   public void package_() {
      if (this.continue_ != null) {
         this.abstract_ = rrMh_1.class_() ? rrMh_1.break_(this) : true;
         if (this.continue_.class_() <= 1) {
            this.abstract_ = false;
         }

         if (this.catch_ != null && this.catch_.long_) {
            this.catch_.throw_ = this.throw_;
            this.catch_.instanceof_ = this.instanceof_;
         }

         if (this.extends_ != null && this.extends_.long_) {
            this.extends_.throw_ = this.throw_;
            this.extends_.instanceof_ = this.instanceof_;
         }

         if (this.native_ != null && this.native_.long_) {
            this.native_.throw_ = this.throw_;
            this.native_.instanceof_ = this.instanceof_;
         }

         this.throw_++;
         if (this.throw_ >= this.continue_.byte_(this.instanceof_)) {
            int var1 = this.continue_.protected_(this.instanceof_);
            int var2 = this.continue_.class_() == 0 ? this.native_() : this.continue_.class_();
            this.instanceof_ = (this.instanceof_ + 1) % var2;
            this.throw_ = 0;
            int var3 = this.continue_.protected_(this.instanceof_);
            if (!this.abstract_) {
               return;
            }

            if (var1 != var3 && var3 >= 0 && var3 < this.native_()) {
               this.break_(var3);
            }
         } else if (this.else_ != null) {
            if (!this.abstract_) {
               return;
            }

            if (!RenderSystem.isOnRenderThread()) {
               RenderSystem.recordRenderCall(() -> this.else_.class_());
            } else {
               this.else_.class_();
            }
         }
      }
   }

   public ji_3 return_() {
      return this.continue_;
   }

   public boolean super_() {
      return this.abstract_;
   }

   public boolean try_() {
      return this.float_;
   }

   public fj_3 while_() {
      fj_3 var1 = new fj_3(this);
      var1.private_ = true;
      return var1;
   }

   public int public_() {
      return this.synchronized_;
   }

   public int protected_() {
      return this.new_.break_;
   }

   public float protected_(float var1) {
      var1 -= this.byte_;
      float var2 = (float)this.throws_ / (float)this.throws_();
      return var1 * var2;
   }

   public float private_() {
      return this.while_;
   }

   public float final_() {
      return 4.0F / this.class_();
   }

   public void volatile_() {
      this.break_(0);
   }

   public fN_2[] synchronized_() {
      return this.class_;
   }

   public int native_() {
      return this.super_.length;
   }
}
