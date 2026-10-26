package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rlg_3 implements rll_3 {
   private static final Logger class_ = LogManager.getLogger();

   @Override
   public void class_(rle_3 var1) {
      if (var1.extends_()) {
         class_.error(var1.byte_() + " failed! " + rqR_2.protected_(var1.finally_()));
      } else {
         class_.warn("(optional) " + var1.byte_() + " failed. " + rqR_2.protected_(var1.finally_()));
      }
   }
}
