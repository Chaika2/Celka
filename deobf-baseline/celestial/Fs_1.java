package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Arrays;

public class Fs_1 extends LF implements MinecraftAccessor {
   private static final String[] id_class = new String[]{
      "warp", "call", "tpa", "tp", "l", "login", "register", "reg", "cp", "changepass", "cpass", "changepassword"
   };
   private static final rgn_3 id_throws = new rgn_3("chat.streamerMode");

   public Fs_1(int var1, int var2, int var3, int var4, LA var5) {
      super(var1, var2, var3, var4, rgN_2.id_byte, var0 -> ((Qw_1)id_import.id_class[20]).id_final(), var5);
   }

   public boolean id_class(Lu_1 var1) {
      return !((Qw_1)id_import.id_class[20]).O ? false : Arrays.stream(id_class).anyMatch(var1x -> var1.id_private().startsWith("/" + var1x + " "));
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      rgP_2 var5 = this.id_private();
      boolean var6 = this.B_();
      int var7 = ((Qw_1)id_import.id_class[20]).id_class(Integer.MIN_VALUE);
      int var8 = var6 ? 16777120 : 16777215;
      cm_3 var9 = (cm_3)id_import.id_class[15];
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.id_continue);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      id_class(var1, this.id_volatile, this.id_final, this.id_volatile + this.id_extends, this.id_final + this.id_native, var7);
      id_class(
         var1,
         var9,
         var5,
         this.id_volatile + this.id_extends / 2,
         this.id_final + (this.id_native - 8) / 2,
         var8 | rfU_2.id_case(this.id_continue * 255.0F) << 24
      );
      if (var6) {
         this.id_class(var1, var2, var3);
      }
   }

   private rgP_2 id_private() {
      return cN_2.id_class(id_throws, ((Qw_1)id_import.id_class[20]).O);
   }
}
