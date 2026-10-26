package celestial;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import org.apache.commons.io.IOUtils;

public enum rqi_3 {
   LINUX,
   SOLARIS,
   WINDOWS,
   OSX,
   UNKNOWN;

   public void id_class(String var1) {
      try {
         this.id_class(new URI(var1).toURL());
      } catch (URISyntaxException | MalformedURLException | IllegalArgumentException var3) {
         rqR_2.id_catch.error("Couldn't open uri '{}'", var1, var3);
      }
   }

   public void id_class(File var1) {
      try {
         this.id_class(var1.toURI().toURL());
      } catch (MalformedURLException var3) {
         rqR_2.id_catch.error("Couldn't open file '{}'", var1, var3);
      }
   }

   public void id_class(URL var1) {
      try {
         Process var2 = AccessController.doPrivileged((PrivilegedExceptionAction<Process>)(() -> Runtime.getRuntime().exec(this.id_break(var1))));

         for (String var4 : IOUtils.readLines(var2.getErrorStream())) {
            rqR_2.id_catch.error(var4);
         }

         var2.getInputStream().close();
         var2.getErrorStream().close();
         var2.getOutputStream().close();
      } catch (IOException | SecurityException | PrivilegedActionException var5) {
         rqR_2.id_catch.error("Couldn't open url '{}'", var1, var5);
         rqR_2.id_private = var5;
      }
   }

   public void id_class(URI var1) {
      try {
         this.id_class(var1.toURL());
      } catch (MalformedURLException var3) {
         rqR_2.id_catch.error("Couldn't open uri '{}'", var1, var3);
      }
   }

   protected String[] id_break(URL var1) {
      String var2 = var1.toString();
      if ("file".equals(var1.getProtocol())) {
         var2 = var2.replace("file:", "file://");
      }

      return new String[]{"xdg-open", var2};
   }
}
