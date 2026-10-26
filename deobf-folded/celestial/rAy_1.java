package celestial;

import java.io.File;
import java.io.FileNotFoundException;

public class rAy_1 extends FileNotFoundException {
   public rAy_1(File var1, String var2) {
      super(String.format("'%s' in ResourcePack '%s'", var2, var1));
   }
}
