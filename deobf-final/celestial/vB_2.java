package celestial;

import com.google.common.util.concurrent.Runnables;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class vB_2 extends vm_3 {
   private static final Logger catch_ = LogManager.getLogger();
   public static final HA class_ = new HA(new rqO_2("textures/gui/title/background/panorama"));
   private static final rqO_2 private_ = new rqO_2("textures/gui/title/background/panorama_overlay.png");
   private static final rqO_2 implements_ = new rqO_2("textures/gui/accessibility.png");
   private String finally_;
   private LF else_;
   private static final rqO_2 synchronized_ = new rqO_2("textures/gui/title/minecraft.png");
   private static final rqO_2 return_ = new rqO_2("textures/gui/title/edition.png");
   private int public_;
   private int goto_;
   private final HL while_ = new HL(class_);
   protected final boolean throws_;
   protected long case_;

   private void byte_(boolean var1) {
      if (var1) {
         try (rrGk_1 var2 = this.volatile_.M().byte_("Demo_World")) {
            var2.catch_();
         } catch (IOException var7) {
            catch_.warn("Failed to delete demo world", var7);
         }
      }

      this.volatile_.break_(this);
   }

   public vB_2() {
      this(false);
   }

   public vB_2(boolean var1) {
      super(new rgn_3("narrator.screen.title"));
      this.throws_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      if (this.case_ == 0L && this.throws_) {
         this.case_ = rqR_2.break_();
      }

      float var5 = this.throws_ ? (float)(rqR_2.break_() - this.case_) / 1000.0F : 1.0F;
      MT.native_();
      class_(var1, 0, 0, this.package_, this.int_, -1);
      this.while_.class_(var4, rfU_2.class_(var5, 0.0F, 1.0F));
      int var6 = this.package_ / 2 - 137;
      this.volatile_.A().class_(private_);
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.throws_ ? (float)rfU_2.case_(rfU_2.class_(var5, 0.0F, 1.0F)) : 1.0F);
      class_(var1, 0, 0, this.package_, this.int_, 0.0F, 0.0F, 16, 128, 16, 128);
      float var7 = this.throws_ ? rfU_2.class_(var5 - 1.0F, 0.0F, 1.0F) : 1.0F;
      int var8 = rfU_2.case_(var7 * 255.0F) << 24;
      if ((var8 & -67108864) != 0) {
         this.volatile_.A().class_(synchronized_);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, var7);
         this.class_(var6, 30, (var2x, var3x) -> {
            this.break_(var1, var2x, var3x, 0, 0, 155, 44);
            this.break_(var1, var2x + 155, var3x, 0, 45, 155, 44);
         });
         this.volatile_.A().class_(return_);
         class_(var1, var6 + 88, 67, 0.0F, 0.0F, 98, 14, 128, 16);
         if (this.finally_ != null) {
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float)(this.package_ / 2 + 90), 70.0F, 0.0F);
            RenderSystem.rotatef(-20.0F, 0.0F, 0.0F, 1.0F);
            float var9 = 1.8F - rfU_2.throws_(rfU_2.class_((float)(rqR_2.break_() % 1000L) / 1000.0F * (float) (Math.PI * 2)) * 0.1F);
            var9 = var9 * 100.0F / (float)(this.super_.break_(this.finally_) + 32);
            RenderSystem.scalef(var9, var9, var9);
            class_(var1, this.super_, this.finally_, 0, -8, 16776960 | var8);
            RenderSystem.popMatrix();
         }

         String var13 = "Minecraft " + rqu_3.class_().getName();
         if (this.volatile_.int_()) {
            var13 = var13 + " Demo";
         } else {
            var13 = var13 + ("release".equalsIgnoreCase(this.volatile_.Q()) ? "" : "/" + this.volatile_.Q());
         }

         if (this.volatile_.native_()) {
            var13 = var13 + jI_2.class_("menu.modded");
         }

         byte_(var1, this.super_, var13, 2, this.int_ - 10, 16777215 | var8);
         byte_(var1, this.super_, "Copyright Mojang AB. Do not distribute!", this.goto_, this.int_ - 10, 16777215 | var8);
         if (var2 > this.goto_ && var2 < this.goto_ + this.public_ && var3 > this.int_ - 10 && var3 < this.int_) {
            class_(var1, this.goto_, this.int_ - 1, this.goto_ + this.public_, this.int_, 16777215 | var8);
         }

         for (LZ var11 : this.new_) {
            var11.class_(var7);
         }

         super.class_(var1, var2, var3, var4);
      }
   }

   public static CompletableFuture<Void> class_(fY_2 var0, Executor var1) {
      return CompletableFuture.allOf(var0.class_(synchronized_, var1), var0.class_(return_, var1), var0.class_(private_, var1), class_.class_(var0, var1));
   }

   private void class_(int var1, int var2) {
      this.class_(new LF(this.package_ / 2 - 100, var1, 200, 20, new rgn_3("menu.singleplayer"), var1x -> this.volatile_.break_(new Fr_1(this))));
      boolean var3 = this.volatile_.J();
      LA var4 = var3
         ? LF.private_
         : (var1x, var2x, var3x, var4x) -> {
            if (!var1x.int_) {
               this.break_(
                  var2x, ((cm_3)this.volatile_.class_[15]).break_(new rgn_3("title.multiplayer.disabled"), Math.max(this.package_ / 2 - 43, 170)), var3x, var4x
               );
            }
         };
      this.class_(new LF(this.package_ / 2 - 100, var1 + var2, 200, 20, new rgn_3("menu.multiplayer"), var1x -> this.volatile_.break_(new vG_2(this)), var4)).int_ = var3;
   }

   private void break_(int var1, int var2) {
      boolean var3 = this.finally_();
      this.class_(new LF(this.package_ / 2 - 100, var1, 200, 20, new rgn_3("menu.playdemo"), var2x -> {
         if (var3) {
            this.volatile_.break_("Demo_World");
         } else {
            rVv_1 var3x = rVm_1.break_();
            this.volatile_.class_("Demo_World", rnW_2.break_, var3x, rrSp_1.class_(var3x));
         }
      }));
      this.else_ = this.class_(
         new LF(
            this.package_ / 2 - 100,
            var1 + var2,
            200,
            20,
            new rgn_3("menu.resetdemo"),
            var1x -> {
               rrGd_1 var2x = this.volatile_.M();

               try (rrGk_1 var3x = var2x.byte_("Demo_World")) {
                  rrGm_1 var4 = var3x.protected_();
                  if (var4 != null) {
                     this.volatile_
                        .break_(
                           new mT_2(
                              this::byte_,
                              new rgn_3("selectWorld.deleteQuestion"),
                              new rgn_3("selectWorld.deleteWarning", var4.break_()),
                              new rgn_3("selectWorld.deleteButton"),
                              cN_2.protected_
                           )
                        );
                  }
               } catch (IOException var8) {
                  catch_.warn("Failed to access demo world", var8);
               }
            }
         )
      );
      this.else_.int_ = var3;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (super.break_(var1, var3, var5)) {
         return true;
      } else {
         if (var1 > (double)this.goto_ && var1 < (double)(this.goto_ + this.public_) && var3 > (double)(this.int_ - 10) && var3 < (double)this.int_) {
            this.volatile_.break_(new vg_3(false, Runnables.doNothing()));
         }

         return false;
      }
   }

   private boolean finally_() {
      try {
         boolean var2;
         try (rrGk_1 var1 = this.volatile_.M().byte_("Demo_World")) {
            var2 = var1.protected_() != null;
         }

         return var2;
      } catch (IOException var6) {
         catch_.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      if (this.finally_ == null) {
         this.finally_ = "Made by Smertnix with ❤";
      }

      this.public_ = this.super_.break_("Copyright Mojang AB. Do not distribute!");
      this.goto_ = this.package_ - this.public_ - 2;
      int var1 = this.int_ / 4 + 78;
      if (this.volatile_.int_()) {
         this.break_(var1, 24);
      } else {
         this.class_(var1, 25);
      }

      byte var2 = 63;
      this.class_(
         new Ll_1(
            this.package_ / 2 - 124,
            var1 + var2 + 12,
            20,
            20,
            0,
            106,
            20,
            LF.finally_,
            256,
            256,
            var1x -> this.volatile_.break_(new ZU(this, (Qw_1)this.volatile_.class_[20], this.volatile_.u())),
            new rgn_3("narrator.button.language")
         )
      );
      this.class_(
         new LF(
            this.package_ / 2 - 100,
            var1 + var2 + 12,
            98,
            20,
            new rgn_3("menu.options"),
            var1x -> this.volatile_.break_(new vM_2(this, (Qw_1)this.volatile_.class_[20]))
         )
      );
      this.class_(new LF(this.package_ / 2 + 2, var1 + var2 + 12, 98, 20, new rgn_3("menu.quit"), var1x -> this.volatile_.G()));
      this.class_(new LF(this.package_ / 2 - 100, var1 + 50, 200, 20, new rgn_3("account.switcher.title"), var1x -> this.volatile_.break_(new rrQC(this))));
      this.class_(
         new Ll_1(
            this.package_ / 2 + 104,
            var1 + var2 + 12,
            20,
            20,
            0,
            0,
            20,
            implements_,
            32,
            64,
            var1x -> this.volatile_.break_(new cJ_2(this, (Qw_1)this.volatile_.class_[20])),
            new rgn_3("narrator.button.accessibility")
         )
      );
   }

   @Override
   public boolean z_() {
      return false;
   }
}
