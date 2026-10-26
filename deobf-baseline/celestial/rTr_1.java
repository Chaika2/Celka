package celestial;

import java.net.URL;

enum rTr_1 {
   @Override
   protected String[] id_break(URL var1) {
      return new String[]{"rundll32", "url.dll,FileProtocolHandler", var1.toString()};
   }
}
