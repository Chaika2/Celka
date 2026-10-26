package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Arrays;

public class Fs_1 extends LF implements MinecraftAccessor {
   private static final String[] class_ = new String[]{
      "warp", "call", "tpa", "tp", "l", "login", "register", "reg", "cp", "changepass", "cpass", "changepassword"
   };
   private static final rgn_3 throws_ = new rgn_3("chat.streamerMode");

   public Fs_1(int var1, int var2, int var3, int var4, LA var5) {
      super(var1, var2, var3, var4, rgN_2.byte_, var0 -> ((Qw_1)import_.class_[20]).final_(), var5);
   }

   public boolean class_(Lu_1 var1) {
      return !((Qw_1)import_.class_[20]).O ? false : Arrays.stream(class_).anyMatch(var1x -> var1.private_().startsWith("/" + var1x + " "));
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      rgP_2 var5 = this.private_();
      boolean var6 = this.B_();
      int var7 = ((Qw_1)import_.class_[20]).class_(Integer.MIN_VALUE);
      int var8 = var6 ? 16777120 : 16777215;
      cm_3 var9 = (cm_3)import_.class_[15];
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.continue_);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      class_(var1, this.volatile_, this.final_, this.volatile_ + this.extends_, this.final_ + this.native_, var7);
      class_(var1, var9, var5, this.volatile_ + this.extends_ / 2, this.final_ + (this.native_ - 8) / 2, var8 | rfU_2.case_(this.continue_ * 255.0F) << 24);
      if (var6) {
         this.class_(var1, var2, var3);
      }
   }

   private rgP_2 private_() {
      return cN_2.class_(throws_, ((Qw_1)import_.class_[20]).O);
   }
}
