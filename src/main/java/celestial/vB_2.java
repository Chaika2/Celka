package celestial;

import com.google.common.util.concurrent.Runnables;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class vB_2 extends vm_3 {
   private static final Logger id_catch = LogManager.getLogger();
   public static final HA id_class = new HA(new rqO_2("textures/gui/title/background/panorama"));
   private static final rqO_2 id_private = new rqO_2("textures/gui/title/background/panorama_overlay.png");
   private static final rqO_2 id_implements = new rqO_2("textures/gui/accessibility.png");
   private String id_finally;
   private LF id_else;
   private static final rqO_2 id_synchronized = new rqO_2("textures/gui/title/minecraft.png");
   private static final rqO_2 id_return = new rqO_2("textures/gui/title/edition.png");
   private int id_public;
   private int id_goto;
   private final HL id_while = new HL(id_class);
   protected final boolean id_throws;
   protected long id_case;

   private void id_byte(boolean var1) {
      if (var1) {
         try {
            rrGk_1 var2 = this.id_volatile.M().id_byte("Demo_World");

            try {
               var2.id_catch();
            } catch (Throwable var6) {
               if (var2 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var5) {
                     var6.addSuppressed(var5);
                  }
               }

               throw var6;
            }

            if (var2 != null) {
               var2.close();
            }
         } catch (IOException var7) {
            id_catch.warn("Failed to delete demo world", var7);
         }
      }

      this.id_volatile.id_break(this);
   }

   public vB_2() {
      this(false);
   }

   public vB_2(boolean var1) {
      super(new rgn_3("narrator.screen.title"));
      this.id_throws = var1;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      if (this.id_case == 0L && this.id_throws) {
         this.id_case = rqR_2.id_break();
      }

      float var5 = this.id_throws ? (float)(rqR_2.id_break() - this.id_case) / 1000.0F : 1.0F;
      MT.id_native();
      id_class(var1, 0, 0, this.id_package, this.id_int, -1);
      this.id_while.id_class(var4, rfU_2.id_class(var5, 0.0F, 1.0F));
      int var6 = this.id_package / 2 - 137;
      this.id_volatile.A().id_class(id_private);
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.id_throws ? (float)rfU_2.id_case(rfU_2.id_class(var5, 0.0F, 1.0F)) : 1.0F);
      id_class(var1, 0, 0, this.id_package, this.id_int, 0.0F, 0.0F, 16, 128, 16, 128);
      float var7 = this.id_throws ? rfU_2.id_class(var5 - 1.0F, 0.0F, 1.0F) : 1.0F;
      int var8 = rfU_2.id_case(var7 * 255.0F) << 24;
      if ((var8 & -67108864) != 0) {
         this.id_volatile.A().id_class(id_synchronized);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, var7);
         this.id_class(var6, 30, (var2x, var3x) -> {
            this.id_break(var1, var2x, var3x, 0, 0, 155, 44);
            this.id_break(var1, var2x + 155, var3x, 0, 45, 155, 44);
         });
         this.id_volatile.A().id_class(id_return);
         id_class(var1, var6 + 88, 67, 0.0F, 0.0F, 98, 14, 128, 16);
         if (this.id_finally != null) {
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float)(this.id_package / 2 + 90), 70.0F, 0.0F);
            RenderSystem.rotatef(-20.0F, 0.0F, 0.0F, 1.0F);
            float var9 = 1.8F - rfU_2.id_throws(rfU_2.id_class((float)(rqR_2.id_break() % 1000L) / 1000.0F * (float) (Math.PI * 2)) * 0.1F);
            var9 = var9 * 100.0F / (float)(this.id_super.id_break(this.id_finally) + 32);
            RenderSystem.scalef(var9, var9, var9);
            id_class(var1, this.id_super, this.id_finally, 0, -8, 16776960 | var8);
            RenderSystem.popMatrix();
         }

         String var13 = "Minecraft " + rqu_3.id_class().getName();
         if (this.id_volatile.id_int()) {
            var13 = var13 + " Demo";
         } else {
            var13 = var13 + ("release".equalsIgnoreCase(this.id_volatile.Q()) ? "" : "/" + this.id_volatile.Q());
         }

         if (this.id_volatile.id_native()) {
            var13 = var13 + jI_2.id_class("menu.modded", new Object[0]);
         }

         id_byte(var1, this.id_super, var13, 2, this.id_int - 10, 16777215 | var8);
         id_byte(var1, this.id_super, "Copyright Mojang AB. Do not distribute!", this.id_goto, this.id_int - 10, 16777215 | var8);
         if (var2 > this.id_goto && var2 < this.id_goto + this.id_public && var3 > this.id_int - 10 && var3 < this.id_int) {
            id_class(var1, this.id_goto, this.id_int - 1, this.id_goto + this.id_public, this.id_int, 16777215 | var8);
         }

         for (LZ var11 : this.id_new) {
            var11.id_class(var7);
         }

         super.id_class(var1, var2, var3, var4);
      }
   }

   public static CompletableFuture<Void> id_class(fY_2 var0, Executor var1) {
      return CompletableFuture.allOf(
         var0.id_class(id_synchronized, var1), var0.id_class(id_return, var1), var0.id_class(id_private, var1), id_class.id_class(var0, var1)
      );
   }

   private void id_class(int var1, int var2) {
      this.id_class(new LF(this.id_package / 2 - 100, var1, 200, 20, new rgn_3("menu.singleplayer"), var1x -> this.id_volatile.id_break(new Fr_1(this))));
      boolean var3 = this.id_volatile.J();
      LA var4 = var3
         ? LF.id_private
         : (var1x, var2x, var3x, var4x) -> {
            if (!var1x.id_int) {
               this.id_break(
                  var2x,
                  ((cm_3)this.id_volatile.id_class[15]).id_break(new rgn_3("title.multiplayer.disabled"), Math.max(this.id_package / 2 - 43, 170)),
                  var3x,
                  var4x
               );
            }
         };
      this.id_class(
            new LF(this.id_package / 2 - 100, var1 + var2, 200, 20, new rgn_3("menu.multiplayer"), var1x -> this.id_volatile.id_break(new vG_2(this)), var4)
         )
         .id_int = var3;
   }

   private void id_break(int var1, int var2) {
      boolean var3 = this.id_finally();
      this.id_class(new LF(this.id_package / 2 - 100, var1, 200, 20, new rgn_3("menu.playdemo"), var2x -> {
         if (var3) {
            this.id_volatile.id_break("Demo_World");
         } else {
            rVv_1 var3x = rVm_1.id_break();
            this.id_volatile.id_class("Demo_World", rnW_2.id_break, var3x, rrSp_1.id_class(var3x));
         }
      }));
      this.id_else = this.id_class(
         new LF(
            this.id_package / 2 - 100,
            var1 + var2,
            200,
            20,
            new rgn_3("menu.resetdemo"),
            var1x -> {
               rrGd_1 var2x = this.id_volatile.M();

               try {
                  rrGk_1 var3x = var2x.id_byte("Demo_World");

                  try {
                     rrGm_1 var4 = var3x.id_protected();
                     if (var4 != null) {
                        this.id_volatile
                           .id_break(
                              new mT_2(
                                 this::id_byte,
                                 new rgn_3("selectWorld.deleteQuestion"),
                                 new rgn_3("selectWorld.deleteWarning", new Object[]{var4.id_break()}),
                                 new rgn_3("selectWorld.deleteButton"),
                                 cN_2.id_protected
                              )
                           );
                     }
                  } catch (Throwable var7) {
                     if (var3x != null) {
                        try {
                           var3x.close();
                        } catch (Throwable var6) {
                           var7.addSuppressed(var6);
                        }
                     }

                     throw var7;
                  }

                  if (var3x != null) {
                     var3x.close();
                  }
               } catch (IOException var8) {
                  id_catch.warn("Failed to access demo world", var8);
               }
            }
         )
      );
      this.id_else.id_int = var3;
   }

   public boolean id_break(double var1, double var3, int var5) {
      if (super.id_break(var1, var3, var5)) {
         return true;
      } else {
         if (var1 > (double)this.id_goto && var1 < (double)(this.id_goto + this.id_public) && var3 > (double)(this.id_int - 10) && var3 < (double)this.id_int) {
            this.id_volatile.id_break(new vg_3(false, Runnables.doNothing()));
         }

         return false;
      }
   }

   private boolean id_finally() {
      try {
         rrGk_1 var1 = this.id_volatile.M().id_byte("Demo_World");

         boolean var2;
         try {
            var2 = var1.id_protected() != null;
         } catch (Throwable var5) {
            if (var1 != null) {
               try {
                  var1.close();
               } catch (Throwable var4) {
                  var5.addSuppressed(var4);
               }
            }

            throw var5;
         }

         if (var1 != null) {
            var1.close();
         }

         return var2;
      } catch (IOException var6) {
         id_catch.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      if (this.id_finally == null) {
         this.id_finally = "Made by Smertnix with ❤";
      }

      this.id_public = this.id_super.id_break("Copyright Mojang AB. Do not distribute!");
      this.id_goto = this.id_package - this.id_public - 2;
      int var1 = this.id_int / 4 + 78;
      if (this.id_volatile.id_int()) {
         this.id_break(var1, 24);
      } else {
         this.id_class(var1, 25);
      }

      byte var2 = 63;
      this.id_class(
         new Ll_1(
            this.id_package / 2 - 124,
            var1 + var2 + 12,
            20,
            20,
            0,
            106,
            20,
            LF.id_finally,
            256,
            256,
            var1x -> this.id_volatile.id_break(new ZU(this, (Qw_1)this.id_volatile.id_class[20], this.id_volatile.u())),
            new rgn_3("narrator.button.language")
         )
      );
      this.id_class(
         new LF(
            this.id_package / 2 - 100,
            var1 + var2 + 12,
            98,
            20,
            new rgn_3("menu.options"),
            var1x -> this.id_volatile.id_break(new vM_2(this, (Qw_1)this.id_volatile.id_class[20]))
         )
      );
      this.id_class(new LF(this.id_package / 2 + 2, var1 + var2 + 12, 98, 20, new rgn_3("menu.quit"), var1x -> this.id_volatile.G()));
      this.id_class(
         new LF(this.id_package / 2 - 100, var1 + 50, 200, 20, new rgn_3("account.switcher.title"), var1x -> this.id_volatile.id_break(new rrQC(this)))
      );
      this.id_class(
         new Ll_1(
            this.id_package / 2 + 104,
            var1 + var2 + 12,
            20,
            20,
            0,
            0,
            20,
            id_implements,
            32,
            64,
            var1x -> this.id_volatile.id_break(new cJ_2(this, (Qw_1)this.id_volatile.id_class[20])),
            new rgn_3("narrator.button.accessibility")
         )
      );
   }

   @Override
   public boolean z_() {
      return false;
   }
}
