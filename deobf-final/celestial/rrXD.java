package celestial;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.ArrayList;

public class rrXD {
   public static rrXK[] class_(String var0) throws IOException, rrXo_1 {
      StringReader var1 = new StringReader(var0);
      PushbackReader var2 = new PushbackReader(var1);
      ArrayList var3 = new ArrayList();

      while (true) {
         int var4 = var2.read();
         if (var4 < 0) {
            return var3.toArray(new rrXK[var3.size()]);
         }

         char var5 = (char)var4;
         if (!Character.isWhitespace(var5)) {
            rrXU var6 = rrXU.class_(var5);
            if (var6 == null) {
               throw new rrXo_1("Invalid character: '" + var5 + "', in: " + var0);
            }

            rrXK var7 = class_(var5, var6, var2);
            var3.add(var7);
         }
      }
   }

   private static rrXK class_(char var0, rrXU var1, PushbackReader var2) throws IOException {
      StringBuffer var3 = new StringBuffer();
      var3.append(var0);

      while (true) {
         int var4 = var2.read();
         if (var4 < 0) {
            break;
         }

         char var5 = (char)var4;
         if (!var1.break_(var5)) {
            var2.unread(var5);
            break;
         }

         var3.append(var5);
      }

      return new rrXK(var1, var3.toString());
   }
}
