package celestial;

import java.util.Iterator;
import java.util.List;

public class rlV_2 {
   private final rle_3 id_class = null;
   private final List<rlD_2> id_break = null;
   private long id_byte;

   private void id_byte(long var1) {
      Iterator var3 = this.id_break.iterator();

      while (var3.hasNext()) {
         rlD_2 var4 = (rlD_2)var3.next();
         var4.id_break.run();
         var3.remove();
         long var5 = var1 - this.id_byte;
         long var7 = this.id_byte;
         this.id_byte = var1;
         if (var4.id_class != null && var4.id_class != var5) {
            this.id_class.id_class(new rlK_2("Succeeded in invalid tick: expected " + (var7 + var4.id_class) + ", but current tick is " + var1));
            break;
         }
      }
   }

   private rlV_2() {
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }

   public void id_class(long var1) {
      try {
         this.id_byte(var1);
      } catch (Exception var4) {
      }
   }

   public void id_break(long var1) {
      try {
         this.id_byte(var1);
      } catch (Exception var4) {
         this.id_class.id_class(var4);
      }
   }
}
