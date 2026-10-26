package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class LG implements LS {
   private final GameProfile id_class;
   private final rqO_2 id_break;
   private final rgN_2 id_byte;

   @Override
   public rgP_2 id_byte() {
      return this.id_byte;
   }

   public LG(GameProfile var1) {
      this.id_class = var1;
      QY var2 = QY.id_instanceof();
      Map var3 = var2.id_throws().id_class(var1);
      if (var3.containsKey(Type.SKIN)) {
         this.id_break = var2.id_throws().id_class((MinecraftProfileTexture)var3.get(Type.SKIN), Type.SKIN);
      } else {
         this.id_break = jH_2.id_class(rhd_3.id_class(var1));
      }

      this.id_byte = new rgN_2(var1.getName());
   }

   @Override
   public void id_class(Lb_1 var1) {
      QY.id_instanceof().id_void().id_class(new rZv_1(this.id_class.getId()));
   }

   @Override
   public void id_class(Ml_1 var1, float var2, int var3) {
      QY.id_instanceof().A().id_class(this.id_break);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, (float)var3 / 255.0F);
      ch_3.id_class(var1, 2, 2, 12, 12, 8.0F, 8.0F, 8, 8, 64, 64);
      ch_3.id_class(var1, 2, 2, 12, 12, 40.0F, 8.0F, 8, 8, 64, 64);
   }

   @Override
   public boolean id_protected() {
      return true;
   }
}
