package celestial;

import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public class Am_1 {
   private final List<AZ> class_ = Lists.newArrayList();
   private boolean break_;

   public synchronized List<AZ> byte_() {
      return Collections.unmodifiableList(this.class_);
   }

   public synchronized void class_(String var1, InetAddress var2) {
      String var3 = AJ.class_(var1);
      String var4 = AJ.break_(var1);
      if (var4 != null) {
         var4 = var2.getHostAddress() + ":" + var4;
         boolean var5 = false;

         for (AZ var7 : this.class_) {
            if (var7.break_().equals(var4)) {
               var7.byte_();
               var5 = true;
               break;
            }
         }

         if (!var5) {
            this.class_.add(new AZ(var3, var4));
            this.break_ = true;
         }
      }
   }

   public synchronized boolean class_() {
      return this.break_;
   }

   public synchronized void break_() {
      this.break_ = false;
   }
}
