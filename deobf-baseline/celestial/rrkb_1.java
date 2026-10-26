package celestial;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class rrkb_1 {
   private String id_class = null;
   private Map<String, String> id_break = new LinkedHashMap<>();
   private Set<String> id_byte = new LinkedHashSet<>();

   public Collection<String> id_byte() {
      return new LinkedHashSet<>(this.id_byte);
   }

   public void id_byte(String var1) {
      this.id_byte.remove(var1);
   }

   public rrkb_1(String var1) {
      this.id_class = var1;
   }

   public void id_class(Collection<String> var1) {
      this.id_byte.addAll(var1);
   }

   public String id_class(String var1) {
      return this.id_break.get(var1);
   }

   public void id_class(String var1, String var2) {
      this.id_break.put(var1, var2);
   }

   public String id_class() {
      return this.id_class;
   }

   public void id_class(rrdD[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         rrdD var3 = var1[var2];
         String var4 = var3.id_class();
         String var5 = this.id_break.get(var4);
         if (var5 != null) {
            var3.id_break(var5);
         }
      }
   }

   public void id_class(rrkb_1 var1) {
      if (var1 != null) {
         this.id_break.putAll(var1.id_break);
      }
   }

   public String[] id_break() {
      Set var1 = this.id_break.keySet();
      return var1.toArray(new String[var1.size()]);
   }

   public void id_break(String var1) {
      this.id_byte.add(var1);
   }

   public boolean id_protected(String var1) {
      return this.id_byte.contains(var1);
   }
}
