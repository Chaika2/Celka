package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public enum VI {
   VERTEX("vertex", ".vsh", 35633),
   FRAGMENT("fragment", ".fsh", 35632);

   private final String shaderName;
   private final String shaderExtension;
   private final int shaderMode;
   private final Map<String, Vw_1> loadedShaders = Maps.newHashMap();

   public Map<String, Vw_1> byte_() {
      return this.loadedShaders;
   }

   private VI(String var3, String var4, int var5) {
      this.shaderName = var3;
      this.shaderExtension = var4;
      this.shaderMode = var5;
   }

   public String class_() {
      return this.shaderName;
   }

   public String break_() {
      return this.shaderExtension;
   }

   int protected_() {
      return this.shaderMode;
   }
}
