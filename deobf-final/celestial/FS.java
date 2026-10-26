package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FS extends LF implements MinecraftAccessor {
   private final AnimValue case_ = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1], 0.4F, false);
   public float class_;
   public float throws_;

   public FS(int var1, int var2, int var3, int var4, LA var5) {
      super(var1, var2, var3, var4, rgN_2.byte_, var0 -> {
      }, var5);
      this.class_ = (float)var1;
      this.throws_ = (float)var2;
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      rgN_2 var5 = new rgN_2("Reset Draggables");
      boolean var6 = this.B_();
      int var7 = ((Qw_1)import_.class_[20]).class_(Integer.MIN_VALUE);
      int var8 = var6 ? 16777120 : 16777215;
      cm_3 var9 = (cm_3)import_.class_[15];
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.continue_);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      rrfD_2.protected_(var1, this.class_, this.throws_, (float)this.extends_, (float)this.native_, var7);
      class_(
         var1,
         var9,
         var5,
         this.class_ + (float)this.extends_ / 2.0F,
         this.throws_ + (float)(this.native_ - 8) / 2.0F,
         var8 | rfU_2.case_(this.continue_ * 255.0F) << 24
      );
      if (var6) {
         this.class_(var1, var2, var3);
      }
   }

   @Override
   public void catch_() {
      super.catch_();
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).class_().break_();
   }

   public AnimValue private_() {
      return this.case_;
   }
}
