package celestial;

import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class gP_2 extends IOException {
   private final List<gB_2> id_class = Lists.newArrayList();
   private final String id_break;

   public gP_2(String var1) {
      this.id_class.add(new gB_2());
      this.id_break = var1;
   }

   public gP_2(String var1, Throwable var2) {
      super(var2);
      this.id_class.add(new gB_2());
      this.id_break = var1;
   }

   public static gP_2 id_class(Exception var0) {
      if (var0 instanceof gP_2) {
         return (gP_2)var0;
      } else {
         String var1 = var0.getMessage();
         if (var0 instanceof FileNotFoundException) {
            var1 = "File not found";
         }

         return new gP_2(var1, var0);
      }
   }

   public void id_class(String var1) {
      this.id_class.get(0).id_class(var1);
   }

   @Override
   public String getMessage() {
      return "Invalid " + this.id_class.get(this.id_class.size() - 1) + ": " + this.id_break;
   }

   public void id_break(String var1) {
      this.id_class.get(0).id_class = var1;
      this.id_class.add(0, new gB_2());
   }
}
