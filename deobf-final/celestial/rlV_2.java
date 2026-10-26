package celestial;

import java.util.Iterator;
import java.util.List;

public class rlV_2 {
   private final rle_3 class_ = null;
   private final List<rlD_2> break_ = null;
   private long byte_;

   private void byte_(long var1) {
      Iterator var3 = this.break_.iterator();

      while (var3.hasNext()) {
         rlD_2 var4 = (rlD_2)var3.next();
         var4.break_.run();
         var3.remove();
         long var5 = var1 - this.byte_;
         long var7 = this.byte_;
         this.byte_ = var1;
         if (var4.class_ != null && var4.class_ != var5) {
            this.class_.class_(new rlK_2("Succeeded in invalid tick: expected " + (var7 + var4.class_) + ", but current tick is " + var1));
            break;
         }
      }
   }

   private rlV_2() {
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }

   public void class_(long var1) {
      try {
         this.byte_(var1);
      } catch (Exception var4) {
      }
   }

   public void break_(long var1) {
      try {
         this.byte_(var1);
      } catch (Exception var4) {
         this.class_.class_(var4);
      }
   }
}
