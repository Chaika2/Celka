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

   public Map<String, Vw_1> id_byte() {
      return this.loadedShaders;
   }

   private VI(String var3, String var4, int var5) {
      this.shaderName = var3;
      this.shaderExtension = var4;
      this.shaderMode = var5;
   }

   public String id_class() {
      return this.shaderName;
   }

   public String id_break() {
      return this.shaderExtension;
   }

   int id_protected() {
      return this.shaderMode;
   }
}
