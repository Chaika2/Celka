package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class fj_3 implements AutoCloseable, rrGl_1 {
   private final fJ_2 id_int;
   final fV_2 id_new;
   final ji_3 id_continue;
   protected final fN_2[] id_class;
   final int[] id_super;
   final int[] id_this;
   private final fg_3 id_else;
   private final int id_synchronized;
   private final int id_return;
   private final float id_public;
   private final float id_goto;
   private final float id_while;
   private final float id_try;
   int id_instanceof;
   int id_throw;
   private int id_interface = -1;
   public float id_break;
   public float id_byte;
   public int id_protected;
   public int id_throws;
   public int id_case = -1;
   public fj_3 id_catch = null;
   public boolean id_private = false;
   public static final String id_implements = ".sprite_single";
   public int id_finally = 0;
   public fj_3 id_extends = null;
   public fj_3 id_native = null;
   public rrdn_1 id_volatile = null;
   public fj_3 id_final = null;
   public boolean id_package = false;
   private int id_char = -1;
   private boolean id_abstract = false;
   private boolean id_long = false;
   private boolean id_float;
   private boolean id_void;
   private boolean id_static;
   private rAL id_import;

   public float id_byte(float var1) {
      var1 -= this.id_break;
      float var2 = (float)this.id_protected / (float)this.id_protected();
      return var1 * var2;
   }

   public boolean id_int() {
      return this.id_continue.id_class() > 1;
   }

   public fj_3(rqO_2 var1) {
      this.id_int = null;
      this.id_new = new fV_2(var1, 0, 0, (ji_3)null);
      this.id_continue = null;
      this.id_class = null;
      this.id_super = new int[0];
      this.id_this = new int[0];
      this.id_else = null;
      this.id_synchronized = 0;
      this.id_return = 0;
      this.id_public = 0.0F;
      this.id_goto = 0.0F;
      this.id_while = 0.0F;
      this.id_try = 0.0F;
   }

   protected fj_3(fJ_2 var1, fV_2 var2, int var3, int var4, int var5, int var6, int var7, fN_2 var8, rrdn_1 var9) {
      this.id_int = var1;
      ji_3 var10 = var2.id_protected;
      int var11 = var2.id_break;
      int var12 = var2.id_byte;
      this.id_synchronized = var6;
      this.id_return = var7;
      this.id_public = (float)var6 / (float)var4;
      this.id_goto = (float)(var6 + var11) / (float)var4;
      this.id_while = (float)var7 / (float)var5;
      this.id_try = (float)(var7 + var12) / (float)var5;
      if (var2.id_throws > 1.0) {
         int var13 = (int)Math.round((double)var8.id_class() * var2.id_throws);
         fN_2 var14 = rrzJ_2.id_class(var8, var13);
         if (var14 != var8) {
            var8.close();
            var8 = var14;
         }
      }

      this.id_volatile = var9;
      rrko_1 var24 = this.id_int.id_class(this.id_volatile);
      if (this.id_volatile == null && !var2.id_class().id_break().endsWith("_leaves")) {
         this.id_class(var8);
      }

      fN_2 var25 = var8;
      int var15 = var8.id_class() / var10.id_break(var11);
      int var16 = var8.id_break() / var10.id_class(var12);
      if (var10.id_class() > 0) {
         int var17 = var10.id_protected().stream().max(Integer::compareTo).get() + 1;
         this.id_super = new int[var17];
         this.id_this = new int[var17];
         Arrays.fill(this.id_super, -1);
         Arrays.fill(this.id_this, -1);

         for (int var19 : var10.id_protected()) {
            if (var19 >= var15 * var16) {
               throw new RuntimeException("invalid frameindex " + var19);
            }

            int var20 = var19 / var15;
            int var21 = var19 % var15;
            this.id_super[var19] = var21;
            this.id_this[var19] = var20;
         }
      } else {
         ArrayList var26 = Lists.newArrayList();
         int var27 = var15 * var16;
         this.id_super = new int[var27];
         this.id_this = new int[var27];

         for (int var30 = 0; var30 < var16; var30++) {
            for (int var33 = 0; var33 < var15; var33++) {
               int var34 = var30 * var15 + var33;
               this.id_super[var34] = var33;
               this.id_this[var34] = var30;
               var26.add(new ja_3(var34, -1));
            }
         }

         var10 = new ji_3(var26, var11, var12, var10.id_break(), var10.id_byte());
      }

      this.id_new = new fV_2(var2.id_class, var11, var12, var10);
      this.id_continue = var10;

      try {
         try {
            this.id_class = fz_3.id_class(var8, var3, var24);
         } catch (Throwable var22) {
            KY var29 = KY.id_class(var22, "Generating mipmaps for frame");
            Ko_1 var32 = var29.id_class("Frame being iterated");
            var32.id_class("First frame", () -> {
               StringBuilder var1x = new StringBuilder();
               if (var1x.length() > 0) {
                  var1x.append(", ");
               }

               var1x.append(var25.id_class()).append("x").append(var25.id_break());
               return var1x.toString();
            });
            throw new KU(var29);
         }
      } catch (Throwable var23) {
         KY var28 = KY.id_class(var23, "Applying mipmap");
         Ko_1 var31 = var28.id_class("Sprite being mipmapped");
         var31.id_class("Sprite name", () -> this.id_finally().toString());
         var31.id_class("Sprite size", () -> this.id_protected() + " x " + this.id_throws());
         var31.id_class("Sprite frames", () -> this.id_native() + " frames");
         var31.id_class("Mipmap levels", var3);
         throw new KU(var28);
      }

      if (var10.id_byte()) {
         this.id_else = new fg_3(this, var2, var3);
      } else {
         this.id_else = null;
      }

      this.id_finally = var3;
      this.id_break = Math.min(this.id_public, this.id_goto);
      this.id_byte = Math.min(this.id_while, this.id_try);
      this.id_protected = var4;
      this.id_throws = var5;
   }

   private fj_3(fj_3 var1) {
      this.id_int = var1.id_int;
      fV_2 var2 = var1.id_new;
      rqO_2 var3 = var2.id_class();
      rqO_2 var4 = new rqO_2(var3.id_byte(), var3.id_break() + ".sprite_single");
      int var5 = var2.id_break();
      int var6 = var2.id_byte();
      ji_3 var7 = var2.id_protected();
      this.id_new = new fV_2(var4, var5, var6, var7);
      this.id_continue = var1.id_continue;
      this.id_long = true;
      this.id_class = var1.id_class;
      this.id_super = var1.id_super;
      this.id_this = var1.id_this;
      if (var1.id_else != null) {
         this.id_else = new fg_3(this, var1.id_else.id_break);
      } else {
         this.id_else = null;
      }

      this.id_synchronized = 0;
      this.id_return = 0;
      this.id_public = 0.0F;
      this.id_goto = 1.0F;
      this.id_while = 0.0F;
      this.id_try = 1.0F;
      this.id_instanceof = var1.id_instanceof;
      this.id_throw = var1.id_throw;
      this.id_interface = var1.id_interface;
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_throws;
      this.id_private = true;
      this.id_finally = var1.id_finally;
      this.id_char = var1.id_char;
      this.id_abstract = var1.id_abstract;
   }

   protected fj_3(fJ_2 var1, fV_2 var2, int var3, int var4, int var5, int var6, int var7, fN_2 var8) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, (rrdn_1)null);
   }

   @Override
   public String toString() {
      int var1 = this.id_super.length;
      return "TextureAtlasSprite{name='"
         + this.id_new.id_class
         + "', frameCount="
         + var1
         + ", x="
         + this.id_synchronized
         + ", y="
         + this.id_return
         + ", height="
         + this.id_new.id_byte
         + ", width="
         + this.id_new.id_break
         + ", u0="
         + this.id_public
         + ", u1="
         + this.id_goto
         + ", v0="
         + this.id_while
         + ", v1="
         + this.id_try
         + "}";
   }

   public void id_this() {
      if (this.id_case < 0) {
         this.id_case = fo_3.id_class();
         fo_3.id_class(this.id_case, this.id_finally, this.id_protected(), this.id_throws());
         boolean var1 = this.id_int.id_break(this.id_volatile);
         if (var1) {
            rrzJ_2.id_throws();
         } else {
            MT.id_class(3553, 34046, 1.0F);
            int var2 = this.id_finally > 0 ? 9984 : 9728;
            MT.id_break(3553, 10241, var2);
            MT.id_break(3553, 10240, 9728);
         }
      }

      rrzJ_2.id_protected(this.id_case);
   }

   private float id_class() {
      float var1 = (float)this.id_new.id_break / (this.id_goto - this.id_public);
      float var2 = (float)this.id_new.id_byte / (this.id_try - this.id_while);
      return Math.max(var2, var1);
   }

   public double id_class(float var1) {
      float var2 = this.id_goto - this.id_public;
      return (double)((var1 - this.id_public) / var2 * 16.0F);
   }

   public boolean id_class(int var1, int var2, int var3) {
      return (this.id_class[0].id_class(var2 + this.id_super[var1] * this.id_new.id_break, var3 + this.id_this[var1] * this.id_new.id_byte) >> 24 & 0xFF) == 0;
   }

   public Ok_1 id_class(Ok_1 var1) {
      if (this.id_finally() == rrzJ_2.id_goto) {
         Hd_1 var2 = var1.id_protected();
         if (var2 != null) {
            return var2.id_protected();
         }
      }

      return new yE_2(var1, this);
   }

   private void id_class(int[] var1) {
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

   private void id_class(fN_2 var1) {
      int[] var2 = new int[var1.id_class() * var1.id_break()];
      var1.id_private().get(var2);
      this.id_class(var2);
      var1.id_private().put(var2);
   }

   void id_class(int var1, int var2, fN_2[] var3) {
      boolean var4 = false;
      boolean var5 = this.id_private;

      for (int var6 = 0; var6 < var3.length && this.id_protected() >> var6 > 0 && this.id_throws() >> var6 > 0; var6++) {
         var3[var6]
            .id_class(
               var6,
               this.id_synchronized >> var6,
               this.id_return >> var6,
               var1 >> var6,
               var2 >> var6,
               this.id_new.id_break >> var6,
               this.id_new.id_byte >> var6,
               var4,
               var5,
               var3.length > 1,
               false
            );
      }
   }

   public void id_class(rAL var1) {
      this.id_import = var1;
      this.id_class(this.id_int.id_extends());
      this.id_class(this.id_int.id_finally());
   }

   public float id_class(double var1) {
      float var3 = this.id_goto - this.id_public;
      return this.id_public + var3 * (float)var1 / 16.0F;
   }

   private void id_class(boolean var1) {
      this.id_float = var1;
      this.id_static = false;
      this.id_void = false;
      if (this.id_catch != null) {
         this.id_else();
         this.id_catch = null;
      }

      if (this.id_extends != null) {
         if (this.id_extends.id_catch != null) {
            this.id_extends.id_else();
         }

         this.id_extends.close();
         this.id_extends = null;
      }

      if (this.id_native != null) {
         if (this.id_native.id_catch != null) {
            this.id_native.id_else();
         }

         this.id_native.close();
         this.id_native = null;
      }

      this.id_static = rrbb_3.w();
      this.id_void = rrbb_3.rs();
      if (this.id_float && this.id_static && !this.id_private) {
         this.id_catch = this.id_while();
      }

      if (this.id_void && !this.id_private) {
         if (this.id_extends == null && rrdZ.SV) {
            this.id_extends = this.id_class(rrdn_1.NORMAL, -8421377, this.id_continue);
         }

         if (this.id_native == null && rrdZ.Sg) {
            this.id_native = this.id_class(rrdn_1.SPECULAR, 0, this.id_continue);
         }
      }
   }

   private static boolean id_class(ji_3 var0, ji_3 var1) {
      if (var0 == var1) {
         return true;
      } else if (var0 != null && var1 != null) {
         if (var0.id_break() != var1.id_break()) {
            return false;
         } else if (var0.id_byte() != var1.id_byte()) {
            return false;
         } else if (var0.id_class() != var1.id_class()) {
            return false;
         } else {
            for (int var2 = 0; var2 < var0.id_class(); var2++) {
               if (var0.id_byte(var2) != var1.id_byte(var2)) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public void id_class(rrWd_1 var1) {
      if (this.id_interface < 0) {
         if (this.id_int != null) {
            fj_3 var2 = this.id_int.id_byte(this.id_finally());
            if (var2 != null) {
               this.id_interface = var2.id_new();
            }
         }

         if (this.id_interface < 0) {
            this.id_interface = var1.id_class();
         }
      }
   }

   public void id_class(int var1) {
      this.id_char = var1;
      if (this.id_catch != null) {
         this.id_catch.id_class(var1);
      }

      if (this.id_extends != null) {
         this.id_extends.id_class(var1);
      }

      if (this.id_native != null) {
         this.id_native.id_class(var1);
      }
   }

   public fj_3 id_class(rrdn_1 var1, int var2, ji_3 var3) {
      String var4 = var1.id_class();
      rqO_2 var5 = new rqO_2(this.id_finally().id_byte(), this.id_finally().id_break() + var4);
      rqO_2 var6 = this.id_int.id_class(var5);
      fj_3 var7 = null;
      if (this.id_import.id_break(var6)) {
         try (rAF var8 = this.id_import.id_class(var6)) {
            rAF var9 = this.id_import.id_class(var6);
            fF_2 var10 = new fF_2(var6.toString(), var9.id_break());
            ji_3 var11 = var8.id_class(ji_3.id_class);
            if (var11 == null) {
               var11 = ji_3.id_break;
            }

            Pair var12 = var11.id_class(var10.id_class, var10.id_break);
            fV_2 var13 = new fV_2(var5, (Integer)var12.getFirst(), (Integer)var12.getSecond(), var11);
            fN_2 var14 = fN_2.id_class(var8.id_break());
            if (var14.id_class() != this.id_protected()) {
               fN_2 var15 = rrzJ_2.id_class(var14, this.id_protected());
               if (var15 != var14) {
                  double var16 = 1.0 * (double)this.id_protected() / (double)var14.id_class();
                  var14.close();
                  var14 = var15;
                  var13 = new fV_2(
                     var5, (int)((double)((Integer)var12.getFirst()).intValue() * var16), (int)((double)((Integer)var12.getSecond()).intValue() * var16), var11
                  );
               }
            }

            var7 = new fj_3(this.id_int, var13, this.id_finally, this.id_protected, this.id_throws, this.id_synchronized, this.id_return, var14, var1);
         } catch (IOException var20) {
         }
      }

      if (var7 == null) {
         fN_2 var21 = new fN_2(this.id_protected(), this.id_throws(), false);
         int var22 = rrzJ_2.id_case(var2);
         var21.id_class(0, 0, var21.id_class(), var21.id_break(), var22);
         fV_2 var23 = new fV_2(var5, this.id_protected(), this.id_throws(), ji_3.id_break);
         var7 = new fj_3(this.id_int, var23, this.id_finally, this.id_protected, this.id_throws, this.id_synchronized, this.id_return, var21, var1);
      }

      if (this.id_float && this.id_static && !this.id_private) {
         var7.id_catch = var7.id_while();
      }

      var7.id_long = id_class(var7.id_continue, var3);
      return var7;
   }

   @Override
   public void close() {
      for (fN_2 var4 : this.id_class) {
         if (var4 != null) {
            var4.close();
         }
      }

      if (this.id_else != null) {
         this.id_else.close();
      }

      if (this.id_catch != null) {
      }

      if (this.id_extends != null) {
         this.id_extends.close();
      }

      if (this.id_native != null) {
         this.id_native.close();
      }
   }

   public double id_break(float var1) {
      float var2 = this.id_try - this.id_while;
      return (double)((var1 - this.id_while) / var2 * 16.0F);
   }

   public int id_break(int var1, int var2, int var3) {
      return this.id_class[0].id_class(var2 + this.id_super[var1] * this.id_protected(), var3 + this.id_this[var1] * this.id_throws());
   }

   public float id_break(double var1) {
      float var3 = this.id_try - this.id_while;
      return this.id_while + var3 * (float)var1 / 16.0F;
   }

   private void id_break(int var1) {
      int var2 = this.id_super[var1] * this.id_new.id_break;
      int var3 = this.id_this[var1] * this.id_new.id_byte;
      this.id_class(var2, var3, this.id_class);
   }

   public float id_throws(float var1) {
      float var2 = this.id_goto - this.id_public;
      return (var1 - this.id_public) / var2 * 16.0F;
   }

   public int id_throws() {
      return this.id_new.id_byte;
   }

   public rqO_2 id_finally() {
      return this.id_new.id_class;
   }

   public float id_catch() {
      return this.id_goto;
   }

   public fJ_2 id_extends() {
      return this.id_int;
   }

   public int id_goto() {
      return this.id_return;
   }

   public float id_case() {
      return this.id_public;
   }

   public float id_case(float var1) {
      float var2 = this.id_try - this.id_while;
      return (var1 - this.id_while) / var2 * 16.0F;
   }

   public int id_continue() {
      return this.id_char;
   }

   public void id_else() {
      if (this.id_case >= 0) {
         fo_3.id_class(this.id_case);
         this.id_case = -1;
      }
   }

   public float id_implements() {
      return this.id_try;
   }

   public int id_new() {
      return this.id_interface;
   }

   public void id_package() {
      if (this.id_continue != null) {
         this.id_abstract = rrMh_1.id_class() ? rrMh_1.id_break(this) : true;
         if (this.id_continue.id_class() <= 1) {
            this.id_abstract = false;
         }

         if (this.id_catch != null && this.id_catch.id_long) {
            this.id_catch.id_throw = this.id_throw;
            this.id_catch.id_instanceof = this.id_instanceof;
         }

         if (this.id_extends != null && this.id_extends.id_long) {
            this.id_extends.id_throw = this.id_throw;
            this.id_extends.id_instanceof = this.id_instanceof;
         }

         if (this.id_native != null && this.id_native.id_long) {
            this.id_native.id_throw = this.id_throw;
            this.id_native.id_instanceof = this.id_instanceof;
         }

         this.id_throw++;
         if (this.id_throw >= this.id_continue.id_byte(this.id_instanceof)) {
            int var1 = this.id_continue.id_protected(this.id_instanceof);
            int var2 = this.id_continue.id_class() == 0 ? this.id_native() : this.id_continue.id_class();
            this.id_instanceof = (this.id_instanceof + 1) % var2;
            this.id_throw = 0;
            int var3 = this.id_continue.id_protected(this.id_instanceof);
            if (!this.id_abstract) {
               return;
            }

            if (var1 != var3 && var3 >= 0 && var3 < this.id_native()) {
               this.id_break(var3);
            }
         } else if (this.id_else != null) {
            if (!this.id_abstract) {
               return;
            }

            if (!RenderSystem.isOnRenderThread()) {
               RenderSystem.recordRenderCall(() -> this.id_else.id_class());
            } else {
               this.id_else.id_class();
            }
         }
      }
   }

   public ji_3 id_return() {
      return this.id_continue;
   }

   public boolean id_super() {
      return this.id_abstract;
   }

   public boolean id_try() {
      return this.id_float;
   }

   public fj_3 id_while() {
      fj_3 var1 = new fj_3(this);
      var1.id_private = true;
      return var1;
   }

   public int id_public() {
      return this.id_synchronized;
   }

   public int id_protected() {
      return this.id_new.id_break;
   }

   public float id_protected(float var1) {
      var1 -= this.id_byte;
      float var2 = (float)this.id_throws / (float)this.id_throws();
      return var1 * var2;
   }

   public float id_private() {
      return this.id_while;
   }

   public float id_final() {
      return 4.0F / this.id_class();
   }

   public void id_volatile() {
      this.id_break(0);
   }

   public fN_2[] id_synchronized() {
      return this.id_class;
   }

   public int id_native() {
      return this.id_super.length;
   }
}
