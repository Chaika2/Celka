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
   private static final Logger class_ = LogManager.getLogger();
   private final rqO_2 break_;
   private final float byte_;
   private final float protected_;
   private final float throws_;
   private final float case_;
   private final String catch_;

   public uA_2(rqO_2 var1, float var2, float var3, float var4, float var5, String var6) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
   }

   public static uu_3 class_(JsonObject var0) {
      float var1 = 0.0F;
      float var2 = 0.0F;
      if (var0.has("shift")) {
         JsonArray var3 = var0.getAsJsonArray("shift");
         if (var3.size() != 2) {
            throw new JsonParseException("Expected 2 elements in 'shift', found " + var3.size());
         }

         var1 = rpY_2.protected_(var3.get(0), "shift[0]");
         var2 = rpY_2.protected_(var3.get(1), "shift[1]");
      }

      StringBuilder var7 = new StringBuilder();
      if (var0.has("skip")) {
         JsonElement var4 = var0.get("skip");
         if (var4.isJsonArray()) {
            JsonArray var5 = rpY_2.implements_(var4, "skip");

            for (int var6 = 0; var6 < var5.size(); var6++) {
               var7.append(rpY_2.class_(var5.get(var6), "skip[" + var6 + "]"));
            }
         } else {
            var7.append(rpY_2.class_(var4, "skip"));
         }
      }

      return new uA_2(
         new rqO_2(rpY_2.case_(var0, "file")), rpY_2.class_(var0, "size", 11.0F), rpY_2.class_(var0, "oversample", 1.0F), var1, var2, var7.toString()
      );
   }

   @Override
   public uc_3 class_(rAL var1) {
      STBTTFontinfo var2 = null;
      ByteBuffer var3 = null;

      try {
         uF_2 var5;
         try (rAF var4 = var1.class_(new rqO_2(this.break_.byte_(), "font/" + this.break_.break_()))) {
            class_.debug("Loading font {}", this.break_);
            var2 = STBTTFontinfo.malloc();
            var3 = fo_3.class_(var4.break_());
            ((Buffer)var3).flip();
            class_.debug("Reading font {}", this.break_);
            if (!STBTruetype.stbtt_InitFont(var2, var3)) {
               throw new IOException("Invalid ttf");
            }

            var5 = new uF_2(var3, var2, this.byte_, this.protected_, this.throws_, this.case_, this.catch_);
         }

         return var5;
      } catch (Exception var9) {
         class_.error("Couldn't load truetype font {}", this.break_, var9);
         if (var2 != null) {
            var2.free();
         }

         MemoryUtil.memFree(var3);
         return null;
      }
   }
}
