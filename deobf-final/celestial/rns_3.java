package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class rns_3 {
   private final Map<String, rnP_2> class_ = Maps.newHashMap();
   private final Map<rAi_1, List<rnP_2>> break_ = Maps.newHashMap();
   private final Map<String, Map<rnP_2, rAa_1>> byte_ = Maps.newHashMap();
   private final rnP_2[] protected_ = new rnP_2[19];
   private final Map<String, rnB_2> throws_ = Maps.newHashMap();
   private final Map<String, rnB_2> case_ = Maps.newHashMap();
   private static String[] catch_;

   public Collection<String> byte_() {
      return Lists.newArrayList(this.byte_.keySet());
   }

   public rnP_2 byte_(String var1) {
      return this.class_.get(var1);
   }

   public void byte_(rnP_2 var1) {
      this.class_.remove(var1.break_());

      for (int var2 = 0; var2 < 19; var2++) {
         if (this.class_(var2) == var1) {
            this.class_(var2, (rnP_2)null);
         }
      }

      List var5 = this.break_.get(var1.byte_());
      if (var5 != null) {
         var5.remove(var1);
      }

      for (Map var4 : this.byte_.values()) {
         var4.remove(var1);
      }

      this.case_(var1);
   }

   public void byte_(rnB_2 var1) {
   }

   public void byte_(String var1, rnP_2 var2) {
      if (var2 == null) {
         Map var3 = this.byte_.remove(var1);
         if (var3 != null) {
            this.implements_(var1);
         }
      } else {
         Map var6 = this.byte_.get(var1);
         if (var6 != null) {
            rAa_1 var4 = (rAa_1)var6.remove(var2);
            if (var6.size() < 1) {
               Map var5 = this.byte_.remove(var1);
               if (var5 != null) {
                  this.implements_(var1);
               }
            } else if (var4 != null) {
               this.protected_(var1, var2);
            }
         }
      }
   }

   public boolean class_(String var1, rnB_2 var2) {
      if (var1.length() > 40) {
         throw new IllegalArgumentException("The player name '" + var1 + "' is too long!");
      } else {
         if (this.private_(var1) != null) {
            this.catch_(var1);
         }

         this.case_.put(var1, var2);
         return var2.case_().add(var1);
      }
   }

   public void class_(rnB_2 var1) {
      try {
         this.throws_.remove(var1.class_());

         for (String var3 : var1.case_()) {
            this.case_.remove(var3);
         }

         this.protected_(var1);
      } catch (Exception var4) {
      }
   }

   public void class_(int var1, rnP_2 var2) {
      this.protected_[var1] = var2;
   }

   public rnP_2 class_(int var1) {
      return this.protected_[var1];
   }

   protected void class_(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.class_(var2);
         rnP_2 var4 = this.break_(var3.native_("Objective"));
         String var5 = var3.native_("Name");
         if (var5.length() > 40) {
            var5 = var5.substring(0, 40);
         }

         rAa_1 var6 = this.break_(var5, var4);
         var6.break_(var3.private_("Score"));
         if (var3.throws_("Locked")) {
            var6.class_(var3.new_("Locked"));
         }
      }
   }

   public void class_(an_3 var1) {
      if (var1 != null && !(var1 instanceof rhd_3) && !var1.BM()) {
         String var2 = var1.rz();
         this.byte_(var2, (rnP_2)null);
         this.catch_(var2);
      }
   }

   public void class_(rAa_1 var1) {
   }

   public Collection<rnP_2> class_() {
      return this.class_.values();
   }

   public boolean class_(String var1, rnP_2 var2) {
      Map var3 = this.byte_.get(var1);
      if (var3 == null) {
         return false;
      } else {
         rAa_1 var4 = (rAa_1)var3.get(var2);
         return var4 != null;
      }
   }

   public Collection<rAa_1> class_(rnP_2 var1) {
      ArrayList var2 = Lists.newArrayList();

      for (Map var4 : this.byte_.values()) {
         rAa_1 var5 = (rAa_1)var4.get(var1);
         if (var5 != null) {
            var2.add(var5);
         }
      }

      var2.sort(rAa_1.class_);
      return var2;
   }

   public boolean class_(String var1) {
      return this.class_.containsKey(var1);
   }

   public final void class_(rAi_1 var1, String var2, Consumer<rAa_1> var3) {
      this.break_.getOrDefault(var1, Collections.emptyList()).forEach(var3x -> var3.accept(this.break_(var2, var3x)));
   }

   public rnP_2 class_(String var1, rAi_1 var2, rgP_2 var3, rnr_3 var4) {
      if (var1.length() > 16) {
         throw new IllegalArgumentException("The objective name '" + var1 + "' is too long!");
      } else if (this.class_.containsKey(var1)) {
         throw new IllegalArgumentException("An objective with the name '" + var1 + "' already exists!");
      } else {
         rnP_2 var5 = new rnP_2(this, var1, var2, var3, var4);
         this.break_.computeIfAbsent(var2, var0 -> Lists.newArrayList()).add(var5);
         this.class_.put(var1, var5);
         this.protected_(var5);
         return var5;
      }
   }

   public rAa_1 break_(String var1, rnP_2 var2) {
      if (var1.length() > 40) {
         throw new IllegalArgumentException("The player name '" + var1 + "' is too long!");
      } else {
         Map var3 = this.byte_.computeIfAbsent(var1, var0 -> Maps.newHashMap());
         return var3.computeIfAbsent(var2, var2x -> {
            rAa_1 var3x = new rAa_1(this, var2x, var1);
            var3x.break_(0);
            return var3x;
         });
      }
   }

   public static String break_(int var0) {
      switch (var0) {
         case 0:
            return "list";
         case 1:
            return "sidebar";
         case 2:
            return "belowName";
         default:
            if (var0 >= 3 && var0 <= 18) {
               rgF_2 var1 = rgF_2.class_(var0 - 3);
               if (var1 != null && var1 != rgF_2.RESET) {
                  return "sidebar.team." + var1.throws_();
               }
            }

            return null;
      }
   }

   public void break_(rnB_2 var1) {
   }

   public rnP_2 break_(String var1) {
      return this.class_.get(var1);
   }

   public void break_(String var1, rnB_2 var2) {
      if (this.private_(var1) == var2) {
         this.case_.remove(var1);
         var2.case_().remove(var1);
      }
   }

   public Collection<rAa_1> break_(rnP_2 var1) {
      ArrayList var2 = Lists.newArrayList();

      for (Map var4 : this.byte_.values()) {
         rAa_1 var5 = (rAa_1)var4.get(var1);
         if (var5 != null) {
            var2.add(var5);
         }
      }

      return var2;
   }

   public Collection<String> break_() {
      return this.class_.keySet();
   }

   public void throws_(rnP_2 var1) {
   }

   public Collection<rnB_2> throws_() {
      return this.throws_.values();
   }

   public rnB_2 throws_(String var1) {
      return this.throws_.get(var1);
   }

   public static int finally_(String var0) {
      if ("list".equalsIgnoreCase(var0)) {
         return 0;
      } else if ("sidebar".equalsIgnoreCase(var0)) {
         return 1;
      } else if ("belowName".equalsIgnoreCase(var0)) {
         return 2;
      } else {
         if (var0.startsWith("sidebar.team.")) {
            String var1 = var0.substring("sidebar.team.".length());
            rgF_2 var2 = rgF_2.break_(var1);
            if (var2 != null && var2.class_() >= 0) {
               return var2.class_() + 3;
            }
         }

         return -1;
      }
   }

   public static String[] catch_() {
      if (catch_ == null) {
         catch_ = new String[19];

         for (int var0 = 0; var0 < 19; var0++) {
            catch_[var0] = break_(var0);
         }
      }

      return catch_;
   }

   public boolean catch_(String var1) {
      rnB_2 var2 = this.private_(var1);
      if (var2 != null) {
         this.break_(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   public rnB_2 case_(String var1) {
      if (var1.length() > 16) {
         throw new IllegalArgumentException("The team name '" + var1 + "' is too long!");
      } else {
         rnB_2 var2 = this.throws_(var1);
         if (var2 != null) {
            throw new IllegalArgumentException("A team with the name '" + var1 + "' already exists!");
         } else {
            var2 = new rnB_2(this, var1);
            this.throws_.put(var1, var2);
            this.break_(var2);
            return var2;
         }
      }
   }

   public Map<String, rnB_2> case_() {
      return this.case_;
   }

   public void case_(rnP_2 var1) {
   }

   public void implements_(String var1) {
   }

   public Map<rnP_2, rAa_1> protected_(String var1) {
      Object var2 = this.byte_.get(var1);
      if (var2 == null) {
         var2 = Maps.newHashMap();
      }

      return (Map<rnP_2, rAa_1>)var2;
   }

   public Collection<String> protected_() {
      return this.throws_.keySet();
   }

   public void protected_(String var1, rnP_2 var2) {
   }

   public void protected_(rnB_2 var1) {
   }

   public void protected_(rnP_2 var1) {
   }

   protected rcy_3 private_() {
      rcy_3 var1 = new rcy_3();
      this.byte_.values().stream().map(Map::values).forEach(var1x -> var1x.stream().filter(var0x -> var0x.protected_() != null).forEach(var1xx -> {
            rcd_3 var2 = new rcd_3();
            var2.class_("Name", var1xx.throws_());
            var2.class_("Objective", var1xx.protected_().break_());
            var2.break_("Score", var1xx.break_());
            var2.class_("Locked", var1xx.catch_());
            var1.add(var2);
         }));
      return var1;
   }

   public rnB_2 private_(String var1) {
      return this.case_.get(var1);
   }
}
