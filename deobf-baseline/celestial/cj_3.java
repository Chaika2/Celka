package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Consumer;

public class cj_3 extends cT_2 {
   static final rqO_2 id_class = new rqO_2("textures/gui/title/mojangstudios.png");
   private static final int id_throws = ryj_3.id_class(255, 239, 50, 61);
   private static final int id_case = id_throws & 16777215;
   private final QY id_catch;
   private final rAN id_private;
   private final Consumer<Optional<Throwable>> id_implements;
   private final boolean id_finally;
   private float id_extends;
   private long id_native = -1L;
   private long id_volatile = -1L;
   private int id_final = id_case;
   private int id_package = id_case;
   private int id_int = 16777215;
   private int id_new = 16777215;
   private rrxz_3 id_continue = null;
   private boolean id_super = false;

   public cj_3(QY var1, rAN var2, Consumer<Optional<Throwable>> var3, boolean var4) {
      this.id_catch = var1;
      this.id_private = var2;
      this.id_implements = var3;
      this.id_finally = false;
   }

   private static int id_class(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();

         try {
            return Integer.parseInt(var0, 16) & 16777215;
         } catch (NumberFormatException var3) {
            return var1;
         }
      }
   }

   private static int id_class(Properties var0, String var1, int var2) {
      String var3 = var0.getProperty(var1);
      if (var3 == null) {
         return var2;
      } else {
         var3 = var3.trim();
         int var4 = id_class(var3, var2);
         if (var4 < 0) {
            rrbb_3.id_protected("Invalid color: " + var1 + " = " + var3);
            return var4;
         } else {
            rrbb_3.id_byte(var1 + " = " + var3);
            return var4;
         }
      }
   }

   public static void id_class(QY var0) {
      var0.A().id_class(id_class, new cV_2());
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      int var5 = this.id_catch.id_else().id_super();
      int var6 = this.id_catch.id_else().id_this();
      long var7 = rqR_2.id_break();
      if (this.id_finally && (this.id_private.id_byte() || (vm_3)this.id_catch.id_class[73] != null) && this.id_volatile == -1L) {
         this.id_volatile = var7;
      }

      float var9 = this.id_native > -1L ? (float)(var7 - this.id_native) / 1000.0F : -1.0F;
      float var10 = this.id_volatile > -1L ? (float)(var7 - this.id_volatile) / 500.0F : -1.0F;
      float var11;
      if (var9 >= 1.0F) {
         this.id_super = true;
         if ((vm_3)this.id_catch.id_class[73] != null) {
            ((vm_3)this.id_catch.id_class[73]).id_class(var1, 0, 0, var4);
         }

         int var12 = rfU_2.id_case((1.0F - rfU_2.id_class(var9 - 1.0F, 0.0F, 1.0F)) * 255.0F);
         id_class(var1, 0, 0, var5, var6, this.id_final | var12 << 24);
         var11 = 1.0F - rfU_2.id_class(var9 - 1.0F, 0.0F, 1.0F);
      } else if (this.id_finally) {
         if ((vm_3)this.id_catch.id_class[73] != null && var10 < 1.0F) {
            ((vm_3)this.id_catch.id_class[73]).id_class(var1, var2, var3, var4);
         }

         int var25 = rfU_2.id_throws(rfU_2.id_class((double)var10, 0.15, 1.0) * 255.0);
         id_class(var1, 0, 0, var5, var6, this.id_final | var25 << 24);
         var11 = rfU_2.id_class(var10, 0.0F, 1.0F);
      } else {
         id_class(var1, 0, 0, var5, var6, this.id_final | 0xFF000000);
         var11 = 1.0F;
      }

      int var26 = (int)((double)this.id_catch.id_else().id_super() * 0.5);
      int var13 = (int)((double)this.id_catch.id_else().id_this() * 0.5);
      double var14 = Math.min((double)this.id_catch.id_else().id_super() * 0.75, (double)this.id_catch.id_else().id_this()) * 0.25;
      int var16 = (int)(var14 * 0.5);
      double var17 = var14 * 4.0;
      int var19 = (int)(var17 * 0.5);
      this.id_catch.A().id_class(id_class);
      RenderSystem.enableBlend();
      RenderSystem.blendEquation(32774);
      RenderSystem.blendFunc(770, 1);
      RenderSystem.alphaFunc(516, 0.0F);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var11);
      boolean var20 = true;
      if (this.id_continue != null) {
         this.id_continue.id_implements();
         if (!this.id_continue.id_byte() && this.id_super) {
            var20 = false;
         }
      }

      if (var20) {
         id_class(var1, var26 - var19, var13 - var16, var19, (int)var14, -0.0625F, 0.0F, 120, 60, 120, 120);
         id_class(var1, var26, var13 - var16, var19, (int)var14, 0.0625F, 60.0F, 120, 60, 120, 120);
      }

      RenderSystem.defaultBlendFunc();
      RenderSystem.defaultAlphaFunc();
      RenderSystem.disableBlend();
      int var21 = (int)((double)this.id_catch.id_else().id_this() * 0.8325);
      float var22 = this.id_private.id_break();
      this.id_extends = rfU_2.id_class(this.id_extends * 0.95F + var22 * 0.050000012F, 0.0F, 1.0F);
      rrxr_3.id_extends.id_class();
      if (var9 < 1.0F) {
         this.id_class(var1, var5 / 2 - var19, var21 - 5, var5 / 2 + var19, var21 + 5, 1.0F - rfU_2.id_class(var9, 0.0F, 1.0F));
      }

      if (var9 >= 2.0F) {
         this.id_catch.id_class(null);
      }

      if (this.id_native == -1L && this.id_private.id_protected() && (!this.id_finally || var10 >= 2.0F)) {
         this.id_native = rqR_2.id_break();

         try {
            this.id_private.id_throws();
            this.id_implements.accept(Optional.empty());
         } catch (Throwable var24) {
            this.id_implements.accept(Optional.of(var24));
         }

         if ((vm_3)this.id_catch.id_class[73] != null) {
            ((vm_3)this.id_catch.id_class[73]).id_break(this.id_catch, this.id_catch.id_else().id_super(), this.id_catch.id_else().id_this());
         }
      }
   }

   private void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, float var6) {
      int var7 = rfU_2.id_case((float)(var4 - var2 - 2) * this.id_extends);
      int var8 = Math.round(var6 * 255.0F);
      if (this.id_package != this.id_final) {
         int var9 = this.id_package >> 16 & 0xFF;
         int var10 = this.id_package >> 8 & 0xFF;
         int var11 = this.id_package & 0xFF;
         int var12 = ryj_3.id_class(var8, var9, var10, var11);
         id_class(var1, var2, var3, var4, var5, var12);
      }

      int var16 = this.id_int >> 16 & 0xFF;
      int var17 = this.id_int >> 8 & 0xFF;
      int var18 = this.id_int & 0xFF;
      int var19 = ryj_3.id_class(var8, var16, var17, var18);
      id_class(var1, var2 + 1, var3, var4 - 1, var3 + 1, var19);
      id_class(var1, var2 + 1, var5, var4 - 1, var5 - 1, var19);
      id_class(var1, var2, var3, var2 + 1, var5, var19);
      id_class(var1, var4, var3, var4 - 1, var5, var19);
      int var13 = this.id_new >> 16 & 0xFF;
      int var14 = this.id_new >> 8 & 0xFF;
      int var15 = this.id_new & 0xFF;
      var19 = ryj_3.id_class(var8, var13, var14, var15);
      id_class(var1, var2 + 2, var3 + 2, var2 + var7, var5 - 2, var19);
   }

   @Override
   public boolean id_class() {
      return true;
   }

   public boolean id_throws() {
      return this.id_super;
   }

   public void id_protected() {
      this.id_final = id_case;
      this.id_package = id_case;
      this.id_int = 16777215;
      this.id_new = 16777215;
      if (rrbb_3.K()) {
         try {
            String var1 = "optifine/color.properties";
            rqO_2 var2 = new rqO_2(var1);
            if (!rrbb_3.id_byte(var2)) {
               return;
            }

            InputStream var3 = rrbb_3.id_class(var2);
            rrbb_3.id_byte("Loading " + var1);
            rrzE_2 var4 = new rrzE_2();
            var4.load(var3);
            var3.close();
            this.id_final = id_class(var4, "screen.loading", this.id_final);
            this.id_int = id_class(var4, "screen.loading.outline", this.id_int);
            this.id_package = id_class(var4, "screen.loading.bar", this.id_package);
            this.id_new = id_class(var4, "screen.loading.progress", this.id_new);
            this.id_continue = rrks_1.id_break(var4.getProperty("screen.loading.blend"));
         } catch (Exception var5) {
            rrbb_3.id_protected(var5.getClass().getName() + ": " + var5.getMessage());
         }
      }
   }
}
