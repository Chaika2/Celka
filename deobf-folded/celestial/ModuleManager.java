package celestial;

import java.util.ArrayList;

public class ModuleManager extends ArrayList<Module> {
   public Module id_class(Class<? extends Module> var1) {
      for (Module var3 : this) {
         if (var3.getClass() == var1) {
            return var3;
         }
      }

      return null;
   }
}
