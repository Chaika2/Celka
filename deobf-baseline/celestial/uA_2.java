package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryUtil;

public class uA_2 implements uu_3 {
   private static final Logger id_class = LogManager.getLogger();
   private final rqO_2 id_break;
   private final float id_byte;
   private final float id_protected;
   private final float id_throws;
   private final float id_case;
   private final String id_catch;

   public uA_2(rqO_2 var1, float var2, float var3, float var4, float var5, String var6) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
   }

   public static uu_3 id_class(JsonObject var0) {
      float var1 = 0.0F;
      float var2 = 0.0F;
      if (var0.has("shift")) {
         JsonArray var3 = var0.getAsJsonArray("shift");
         if (var3.size() != 2) {
            throw new JsonParseException("Expected 2 elements in 'shift', found " + var3.size());
         }

         var1 = rpY_2.id_protected(var3.get(0), "shift[0]");
         var2 = rpY_2.id_protected(var3.get(1), "shift[1]");
      }

      StringBuilder var7 = new StringBuilder();
      if (var0.has("skip")) {
         JsonElement var4 = var0.get("skip");
         if (var4.isJsonArray()) {
            JsonArray var5 = rpY_2.id_implements(var4, "skip");

            for (int var6 = 0; var6 < var5.size(); var6++) {
               var7.append(rpY_2.id_class(var5.get(var6), "skip[" + var6 + "]"));
            }
         } else {
            var7.append(rpY_2.id_class(var4, "skip"));
         }
      }

      return new uA_2(
         new rqO_2(rpY_2.id_case(var0, "file")), rpY_2.id_class(var0, "size", 11.0F), rpY_2.id_class(var0, "oversample", 1.0F), var1, var2, var7.toString()
      );
   }

   @Override
   public uc_3 id_class(rAL var1) {
      STBTTFontinfo var2 = null;
      ByteBuffer var3 = null;

      try {
         uF_2 var5;
         try (rAF var4 = var1.id_class(new rqO_2(this.id_break.id_byte(), "font/" + this.id_break.id_break()))) {
            id_class.debug("Loading font {}", this.id_break);
            var2 = STBTTFontinfo.malloc();
            var3 = fo_3.id_class(var4.id_break());
            ((Buffer)var3).flip();
            id_class.debug("Reading font {}", this.id_break);
            if (!STBTruetype.stbtt_InitFont(var2, var3)) {
               throw new IOException("Invalid ttf");
            }

            var5 = new uF_2(var3, var2, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
         }

         return var5;
      } catch (Exception var9) {
         id_class.error("Couldn't load truetype font {}", this.id_break, var9);
         if (var2 != null) {
            var2.free();
         }

         MemoryUtil.memFree(var3);
         return null;
      }
   }
}
