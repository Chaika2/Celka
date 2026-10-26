package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.lang3.StringUtils;

public class Vw_1 {
   private final VI id_class;
   private final String id_break;
   private final int id_byte;
   private int id_protected;

   private Vw_1(VI var1, int var2, String var3) {
      this.id_class = var1;
      this.id_byte = var2;
      this.id_break = var3;
   }

   public static Vw_1 id_class(VI var0, String var1, InputStream var2, String var3) throws IOException {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      String var4 = fo_3.id_break(var2);
      if (var4 == null) {
         throw new IOException("Could not load program " + var0.id_class());
      } else {
         int var5 = MT.id_throws(var0.id_protected());
         MT.id_class(var5, var4);
         MT.id_case(var5);
         if (MT.id_throws(var5, 35713) == 0) {
            String var7 = StringUtils.trim(MT.id_implements(var5, 32768));
            throw new IOException("Couldn't compile " + var0.id_class() + " program (" + var3 + ", " + var1 + ") : " + var7);
         } else {
            Vw_1 var6 = new Vw_1(var0, var5, var1);
            var0.id_byte().put(var1, var6);
            return var6;
         }
      }
   }

   public void id_class() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.id_protected--;
      if (this.id_protected <= 0) {
         MT.id_protected(this.id_byte);
         this.id_class.id_byte().remove(this.id_break);
      }
   }

   public void id_class(VH var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.id_protected++;
      MT.id_protected(var1.id_class(), this.id_byte);
   }

   public String id_break() {
      return this.id_break;
   }
}
