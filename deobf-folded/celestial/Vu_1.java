package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class Vu_1 implements Comparable<Vu_1> {
   private static final Map<String, Vu_1> id_class = Maps.newHashMap();
   private static final Map<Va_1, List<Vu_1>> id_break = Maps.newHashMap();
   private static final Set<String> id_byte = Sets.newHashSet();
   private static final Map<String, Integer> id_protected = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      var0.put("key.categories.movement", 1);
      var0.put("key.categories.gameplay", 2);
      var0.put("key.categories.inventory", 3);
      var0.put("key.categories.creative", 4);
      var0.put("key.categories.multiplayer", 5);
      var0.put("key.categories.ui", 6);
      var0.put("key.categories.misc", 7);
   });
   private final String id_throws;
   private final Va_1 id_case;
   private final String id_catch;
   private List<Va_1> id_private = new ArrayList<>();
   private List<Va_1> id_implements = new ArrayList<>();
   private Va_1 id_finally;
   private boolean id_extends;
   private int id_native;

   public boolean id_byte(Vu_1 var1) {
      return this.id_finally.equals(var1.id_finally) && this.id_implements.equals(var1.id_implements);
   }

   public static void id_byte() {
      id_break.clear();

      for (Vu_1 var1 : id_class.values()) {
         id_break.computeIfAbsent(var1.id_finally, var0 -> new ArrayList<>()).add(var1);
      }
   }

   public Va_1 id_int() {
      return this.id_finally;
   }

   public Vu_1(String var1, int var2, String var3, List<Va_1> var4) {
      this(var1, Vi_1.KEYSYM, var2, var3);
      this.id_implements = new ArrayList<>(var4);
      this.id_private = var4;
   }

   public Vu_1(String var1, int var2, String var3) {
      this(var1, Vi_1.KEYSYM, var2, var3);
   }

   public Vu_1(String var1, Vi_1 var2, int var3, String var4) {
      this.id_throws = var1;
      this.id_finally = var2.id_class(var3);
      this.id_case = this.id_finally;
      this.id_catch = var4;
      id_class.put(var1, this);
      id_break.computeIfAbsent(this.id_finally, var0 -> new ArrayList<>()).add(this);
      id_byte.add(var4);
   }

   public static Supplier<rgP_2> id_class(String var0) {
      Vu_1 var1 = id_class.get(var0);
      return var1 == null ? () -> new rgn_3(var0) : var1::id_native;
   }

   public static void id_class(Va_1 var0) {
      List var1 = id_break.get(var0);
      if (var1 != null) {
         for (Vu_1 var3 : var1) {
            var3.id_native++;
         }
      }
   }

   public void id_class(Va_1 var1, Collection<Va_1> var2) {
      this.id_finally = var1;
      this.id_implements.clear();
      if (!var2.isEmpty()) {
         for (Va_1 var4 : var2) {
            if (!var4.equals(this.id_finally)) {
               this.id_implements.add(var4);
            }
         }
      }
   }

   public void id_class(boolean var1) {
      this.id_extends = var1;
   }

   public boolean id_class(int var1) {
      return !id_class(this) ? false : this.id_finally.id_class() == Vi_1.MOUSE && this.id_finally.id_break() == var1;
   }

   public boolean id_class(int var1, int var2) {
      if (!id_class(this)) {
         return false;
      } else {
         return var1 == Ve_1.id_class.id_break()
            ? this.id_finally.id_class() == Vi_1.SCANCODE && this.id_finally.id_break() == var2
            : this.id_finally.id_class() == Vi_1.KEYSYM && this.id_finally.id_break() == var1;
      }
   }

   public static void id_class(Va_1 var0, boolean var1) {
      List var2 = id_break.get(var0);
      if (var2 != null) {
         for (Vu_1 var4 : var2) {
            var4.id_class(var1);
         }
      }
   }

   public static boolean id_class(Vu_1 var0) {
      if (var0.id_implements.isEmpty()) {
         return true;
      } else {
         for (Va_1 var2 : var0.id_implements) {
            if (!rrfC_2.id_break(var2.id_break())) {
               return false;
            }
         }

         return true;
      }
   }

   public static void id_class() {
      for (Vu_1 var1 : id_class.values()) {
         if (var1.id_finally.id_class() == Vi_1.KEYSYM && var1.id_finally.id_break() != Ve_1.id_class.id_break()) {
            var1.id_class(Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), var1.id_finally.id_break()));
         }
      }
   }

   public int id_break(Vu_1 var1) {
      return this.id_catch.equals(var1.id_catch)
         ? jI_2.id_class(this.id_throws).compareTo(jI_2.id_class(var1.id_throws))
         : id_protected.get(this.id_catch).compareTo(id_protected.get(var1.id_catch));
   }

   public static void id_break() {
      for (Vu_1 var1 : id_class.values()) {
         var1.id_new();
      }
   }

   public void id_break(Va_1 var1, boolean var2) {
      this.id_finally = var1;
      if (var2) {
         this.id_implements.clear();
      }
   }

   public String id_throws() {
      return this.id_catch;
   }

   public List<Va_1> id_finally() {
      return this.id_private;
   }

   public String id_catch() {
      return this.id_throws;
   }

   public boolean id_extends() {
      return this.id_finally.equals(Ve_1.id_class);
   }

   public boolean id_case() {
      if (id_class(this)) {
         if (this.id_native == 0) {
            return false;
         } else {
            this.id_native--;
            return true;
         }
      } else {
         return false;
      }
   }

   public List<Va_1> id_implements() {
      return this.id_implements;
   }

   private void id_new() {
      this.id_native = 0;
      this.id_class(false);
   }

   public String id_package() {
      return this.id_implements.stream().map(Va_1::id_byte).reduce((var0, var1) -> var0 + ":" + var1).orElse("");
   }

   public boolean id_protected() {
      return id_class(this) ? this.id_extends : false;
   }

   public Va_1 id_private() {
      return this.id_case;
   }

   public String id_final() {
      return this.id_finally.id_byte();
   }

   public boolean id_volatile() {
      return this.id_finally.equals(this.id_case) && this.id_implements.equals(this.id_private);
   }

   public rgP_2 id_native() {
      rgN_2 var1 = new rgN_2("");

      for (Va_1 var3 : this.id_implements) {
         var1.id_class(var3.id_protected());
         var1.id_break(" + ");
      }

      var1.id_class(this.id_finally.id_protected());
      return var1;
   }
}
