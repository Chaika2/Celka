package celestial;

import java.io.IOException;
import java.nio.file.Path;

public class rnm_3 extends IOException {
   private rnm_3(Path var1, String var2) {
      super(var1.toAbsolutePath() + ": " + var2);
   }

   public static rnm_3 class_(Path var0) {
      return new rnm_3(var0, "already locked (possibly by other Minecraft instance?)");
   }
}
