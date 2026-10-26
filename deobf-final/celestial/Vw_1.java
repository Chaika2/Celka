package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.lang3.StringUtils;

public class Vw_1 {
   private final VI class_;
   private final String break_;
   private final int byte_;
   private int protected_;

   private Vw_1(VI var1, int var2, String var3) {
      this.class_ = var1;
      this.byte_ = var2;
      this.break_ = var3;
   }

   public static Vw_1 class_(VI var0, String var1, InputStream var2, String var3) throws IOException {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      String var4 = fo_3.break_(var2);
      if (var4 == null) {
         throw new IOException("Could not load program " + var0.class_());
      } else {
         int var5 = MT.throws_(var0.protected_());
         MT.class_(var5, var4);
         MT.case_(var5);
         if (MT.throws_(var5, 35713) == 0) {
            String var7 = StringUtils.trim(MT.implements_(var5, 32768));
            throw new IOException("Couldn't compile " + var0.class_() + " program (" + var3 + ", " + var1 + ") : " + var7);
         } else {
            Vw_1 var6 = new Vw_1(var0, var5, var1);
            var0.byte_().put(var1, var6);
            return var6;
         }
      }
   }

   public void class_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.protected_--;
      if (this.protected_ <= 0) {
         MT.protected_(this.byte_);
         this.class_.byte_().remove(this.break_);
      }
   }

   public void class_(VH var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.protected_++;
      MT.protected_(var1.class_(), this.byte_);
   }

   public String break_() {
      return this.break_;
   }
}
