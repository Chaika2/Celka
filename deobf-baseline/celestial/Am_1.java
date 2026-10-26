package celestial;

import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public class Am_1 {
   private final List<AZ> id_class = Lists.newArrayList();
   private boolean id_break;

   public synchronized List<AZ> id_byte() {
      return Collections.unmodifiableList(this.id_class);
   }

   public synchronized void id_class(String var1, InetAddress var2) {
      String var3 = AJ.id_class(var1);
      String var4 = AJ.id_break(var1);
      if (var4 != null) {
         var4 = var2.getHostAddress() + ":" + var4;
         boolean var5 = false;

         for (AZ var7 : this.id_class) {
            if (var7.id_break().equals(var4)) {
               var7.id_byte();
               var5 = true;
               break;
            }
         }

         if (!var5) {
            this.id_class.add(new AZ(var3, var4));
            this.id_break = true;
         }
      }
   }

   public synchronized boolean id_class() {
      return this.id_break;
   }

   public synchronized void id_break() {
      this.id_break = false;
   }
}
