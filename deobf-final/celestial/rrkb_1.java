package celestial;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class rrkb_1 {
   private String class_ = null;
   private Map<String, String> break_ = new LinkedHashMap<>();
   private Set<String> byte_ = new LinkedHashSet<>();

   public Collection<String> byte_() {
      return new LinkedHashSet<>(this.byte_);
   }

   public void byte_(String var1) {
      this.byte_.remove(var1);
   }

   public rrkb_1(String var1) {
      this.class_ = var1;
   }

   public void class_(Collection<String> var1) {
      this.byte_.addAll(var1);
   }

   public String class_(String var1) {
      return this.break_.get(var1);
   }

   public void class_(String var1, String var2) {
      this.break_.put(var1, var2);
   }

   public String class_() {
      return this.class_;
   }

   public void class_(rrdD[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         rrdD var3 = var1[var2];
         String var4 = var3.class_();
         String var5 = this.break_.get(var4);
         if (var5 != null) {
            var3.break_(var5);
         }
      }
   }

   public void class_(rrkb_1 var1) {
      if (var1 != null) {
         this.break_.putAll(var1.break_);
      }
   }

   public String[] break_() {
      Set var1 = this.break_.keySet();
      return var1.toArray(new String[var1.size()]);
   }

   public void break_(String var1) {
      this.byte_.add(var1);
   }

   public boolean protected_(String var1) {
      return this.byte_.contains(var1);
   }
}
