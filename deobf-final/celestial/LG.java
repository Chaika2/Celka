package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class LG implements LS {
   private final GameProfile class_;
   private final rqO_2 break_;
   private final rgN_2 byte_;

   @Override
   public rgP_2 byte_() {
      return this.byte_;
   }

   public LG(GameProfile var1) {
      this.class_ = var1;
      QY var2 = QY.instanceof_();
      Map var3 = var2.throws_().class_(var1);
      if (var3.containsKey(Type.SKIN)) {
         this.break_ = var2.throws_().class_((MinecraftProfileTexture)var3.get(Type.SKIN), Type.SKIN);
      } else {
         this.break_ = jH_2.class_(rhd_3.class_(var1));
      }

      this.byte_ = new rgN_2(var1.getName());
   }

   @Override
   public void class_(Lb_1 var1) {
      QY.instanceof_().void_().class_(new rZv_1(this.class_.getId()));
   }

   @Override
   public void class_(Ml_1 var1, float var2, int var3) {
      QY.instanceof_().A().class_(this.break_);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, (float)var3 / 255.0F);
      ch_3.class_(var1, 2, 2, 12, 12, 8.0F, 8.0F, 8, 8, 64, 64);
      ch_3.class_(var1, 2, 2, 12, 12, 40.0F, 8.0F, 8, 8, 64, 64);
   }

   @Override
   public boolean protected_() {
      return true;
   }
}
