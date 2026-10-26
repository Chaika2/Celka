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
   private final Map<String, rnP_2> id_class = Maps.newHashMap();
   private final Map<rAi_1, List<rnP_2>> id_break = Maps.newHashMap();
   private final Map<String, Map<rnP_2, rAa_1>> id_byte = Maps.newHashMap();
   private final rnP_2[] id_protected = new rnP_2[19];
   private final Map<String, rnB_2> id_throws = Maps.newHashMap();
   private final Map<String, rnB_2> id_case = Maps.newHashMap();
   private static String[] id_catch;

   public Collection<String> id_byte() {
      return Lists.newArrayList(this.id_byte.keySet());
   }

   public rnP_2 id_byte(String var1) {
      return this.id_class.get(var1);
   }

   public void id_byte(rnP_2 var1) {
      this.id_class.remove(var1.id_break());

      for (int var2 = 0; var2 < 19; var2++) {
         if (this.id_class(var2) == var1) {
            this.id_class(var2, (rnP_2)null);
         }
      }

      List var5 = this.id_break.get(var1.id_byte());
      if (var5 != null) {
         var5.remove(var1);
      }

      for (Map var4 : this.id_byte.values()) {
         var4.remove(var1);
      }

      this.id_case(var1);
   }

   public void id_byte(rnB_2 var1) {
   }

   public void id_byte(String var1, rnP_2 var2) {
      if (var2 == null) {
         Map var3 = this.id_byte.remove(var1);
         if (var3 != null) {
            this.id_implements(var1);
         }
      } else {
         Map var6 = this.id_byte.get(var1);
         if (var6 != null) {
            rAa_1 var4 = (rAa_1)var6.remove(var2);
            if (var6.size() < 1) {
               Map var5 = this.id_byte.remove(var1);
               if (var5 != null) {
                  this.id_implements(var1);
               }
            } else if (var4 != null) {
               this.id_protected(var1, var2);
            }
         }
      }
   }

   public boolean id_class(String var1, rnB_2 var2) {
      if (var1.length() > 40) {
         throw new IllegalArgumentException("The player name '" + var1 + "' is too long!");
      } else {
         if (this.id_private(var1) != null) {
            this.id_catch(var1);
         }

         this.id_case.put(var1, var2);
         return var2.id_case().add(var1);
      }
   }

   public void id_class(rnB_2 var1) {
      try {
         this.id_throws.remove(var1.id_class());

         for (String var3 : var1.id_case()) {
            this.id_case.remove(var3);
         }

         this.id_protected(var1);
      } catch (Exception var4) {
      }
   }

   public void id_class(int var1, rnP_2 var2) {
      this.id_protected[var1] = var2;
   }

   public rnP_2 id_class(int var1) {
      return this.id_protected[var1];
   }

   protected void id_class(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.id_class(var2);
         rnP_2 var4 = this.id_break(var3.id_native("Objective"));
         String var5 = var3.id_native("Name");
         if (var5.length() > 40) {
            var5 = var5.substring(0, 40);
         }

         rAa_1 var6 = this.id_break(var5, var4);
         var6.id_break(var3.id_private("Score"));
         if (var3.id_throws("Locked")) {
            var6.id_class(var3.id_new("Locked"));
         }
      }
   }

   public void id_class(an_3 var1) {
      if (var1 != null && !(var1 instanceof rhd_3) && !var1.BM()) {
         String var2 = var1.rz();
         this.id_byte(var2, (rnP_2)null);
         this.id_catch(var2);
      }
   }

   public void id_class(rAa_1 var1) {
   }

   public Collection<rnP_2> id_class() {
      return this.id_class.values();
   }

   public boolean id_class(String var1, rnP_2 var2) {
      Map var3 = this.id_byte.get(var1);
      if (var3 == null) {
         return false;
      } else {
         rAa_1 var4 = (rAa_1)var3.get(var2);
         return var4 != null;
      }
   }

   public Collection<rAa_1> id_class(rnP_2 var1) {
      ArrayList var2 = Lists.newArrayList();

      for (Map var4 : this.id_byte.values()) {
         rAa_1 var5 = (rAa_1)var4.get(var1);
         if (var5 != null) {
            var2.add(var5);
         }
      }

      var2.sort(rAa_1.id_class);
      return var2;
   }

   public boolean id_class(String var1) {
      return this.id_class.containsKey(var1);
   }

   public final void id_class(rAi_1 var1, String var2, Consumer<rAa_1> var3) {
      this.id_break.getOrDefault(var1, Collections.emptyList()).forEach(var3x -> var3.accept(this.id_break(var2, var3x)));
   }

   public rnP_2 id_class(String var1, rAi_1 var2, rgP_2 var3, rnr_3 var4) {
      if (var1.length() > 16) {
         throw new IllegalArgumentException("The objective name '" + var1 + "' is too long!");
      } else if (this.id_class.containsKey(var1)) {
         throw new IllegalArgumentException("An objective with the name '" + var1 + "' already exists!");
      } else {
         rnP_2 var5 = new rnP_2(this, var1, var2, var3, var4);
         this.id_break.computeIfAbsent(var2, var0 -> Lists.newArrayList()).add(var5);
         this.id_class.put(var1, var5);
         this.id_protected(var5);
         return var5;
      }
   }

   public rAa_1 id_break(String var1, rnP_2 var2) {
      if (var1.length() > 40) {
         throw new IllegalArgumentException("The player name '" + var1 + "' is too long!");
      } else {
         Map var3 = this.id_byte.computeIfAbsent(var1, var0 -> Maps.newHashMap());
         return var3.computeIfAbsent(var2, var2x -> {
            rAa_1 var3x = new rAa_1(this, var2x, var1);
            var3x.id_break(0);
            return var3x;
         });
      }
   }

   public static String id_break(int var0) {
      switch (var0) {
         case 0:
            return "list";
         case 1:
            return "sidebar";
         case 2:
            return "belowName";
         default:
            if (var0 >= 3 && var0 <= 18) {
               rgF_2 var1 = rgF_2.id_class(var0 - 3);
               if (var1 != null && var1 != rgF_2.RESET) {
                  return "sidebar.team." + var1.id_throws();
               }
            }

            return null;
      }
   }

   public void id_break(rnB_2 var1) {
   }

   public rnP_2 id_break(String var1) {
      return this.id_class.get(var1);
   }

   public void id_break(String var1, rnB_2 var2) {
      if (this.id_private(var1) == var2) {
         this.id_case.remove(var1);
         var2.id_case().remove(var1);
      }
   }

   public Collection<rAa_1> id_break(rnP_2 var1) {
      ArrayList var2 = Lists.newArrayList();

      for (Map var4 : this.id_byte.values()) {
         rAa_1 var5 = (rAa_1)var4.get(var1);
         if (var5 != null) {
            var2.add(var5);
         }
      }

      return var2;
   }

   public Collection<String> id_break() {
      return this.id_class.keySet();
   }

   public void id_throws(rnP_2 var1) {
   }

   public Collection<rnB_2> id_throws() {
      return this.id_throws.values();
   }

   public rnB_2 id_throws(String var1) {
      return this.id_throws.get(var1);
   }

   public static int id_finally(String var0) {
      if ("list".equalsIgnoreCase(var0)) {
         return 0;
      } else if ("sidebar".equalsIgnoreCase(var0)) {
         return 1;
      } else if ("belowName".equalsIgnoreCase(var0)) {
         return 2;
      } else {
         if (var0.startsWith("sidebar.team.")) {
            String var1 = var0.substring("sidebar.team.".length());
            rgF_2 var2 = rgF_2.id_break(var1);
            if (var2 != null && var2.id_class() >= 0) {
               return var2.id_class() + 3;
            }
         }

         return -1;
      }
   }

   public static String[] id_catch() {
      if (id_catch == null) {
         id_catch = new String[19];

         for (int var0 = 0; var0 < 19; var0++) {
            id_catch[var0] = id_break(var0);
         }
      }

      return id_catch;
   }

   public boolean id_catch(String var1) {
      rnB_2 var2 = this.id_private(var1);
      if (var2 != null) {
         this.id_break(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   public rnB_2 id_case(String var1) {
      if (var1.length() > 16) {
         throw new IllegalArgumentException("The team name '" + var1 + "' is too long!");
      } else {
         rnB_2 var2 = this.id_throws(var1);
         if (var2 != null) {
            throw new IllegalArgumentException("A team with the name '" + var1 + "' already exists!");
         } else {
            var2 = new rnB_2(this, var1);
            this.id_throws.put(var1, var2);
            this.id_break(var2);
            return var2;
         }
      }
   }

   public Map<String, rnB_2> id_case() {
      return this.id_case;
   }

   public void id_case(rnP_2 var1) {
   }

   public void id_implements(String var1) {
   }

   public Map<rnP_2, rAa_1> id_protected(String var1) {
      Object var2 = this.id_byte.get(var1);
      if (var2 == null) {
         var2 = Maps.newHashMap();
      }

      return (Map<rnP_2, rAa_1>)var2;
   }

   public Collection<String> id_protected() {
      return this.id_throws.keySet();
   }

   public void id_protected(String var1, rnP_2 var2) {
   }

   public void id_protected(rnB_2 var1) {
   }

   public void id_protected(rnP_2 var1) {
   }

   protected rcy_3 id_private() {
      rcy_3 var1 = new rcy_3();
      this.id_byte.values().stream().map(Map::values).forEach(var1x -> var1x.stream().filter(var0x -> var0x.id_protected() != null).forEach(var1xx -> {
            rcd_3 var2 = new rcd_3();
            var2.id_class("Name", var1xx.id_throws());
            var2.id_class("Objective", var1xx.id_protected().id_break());
            var2.id_break("Score", var1xx.id_break());
            var2.id_class("Locked", var1xx.id_catch());
            var1.add(var2);
         }));
      return var1;
   }

   public rnB_2 id_private(String var1) {
      return this.id_case.get(var1);
   }
}
