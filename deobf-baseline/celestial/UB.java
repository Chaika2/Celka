package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UB {
   private static final Logger id_class = LogManager.getLogger();
   private final rdb_3 id_break;
   private final int id_byte;
   private final List<String> id_protected = Lists.newArrayList();
   private final Map<Character, rkg_3> id_throws = Maps.newLinkedHashMap();
   private final Ot_1 id_case = Ot_1.id_class();
   private String id_catch;

   public UB(rpL_2 var1, int var2) {
      this.id_break = var1.id_case();
      this.id_byte = var2;
   }

   public static UB id_class(rpL_2 var0) {
      return id_class(var0, 1);
   }

   public UB id_class(String var1, hr_3 var2) {
      this.id_case.id_class(var1, var2);
      return this;
   }

   public void id_class(Consumer<Dw_1> var1) {
      this.id_class(var1, rVL.id_for.id_break(this.id_break));
   }

   public void id_class(Consumer<Dw_1> var1, String var2) {
      rqO_2 var3 = rVL.id_for.id_break(this.id_break);
      if (new rqO_2(var2).equals(var3)) {
         throw new IllegalStateException("Shaped Recipe " + var2 + " should remove its 'save' argument");
      } else {
         this.id_class(var1, new rqO_2(var2));
      }
   }

   public void id_class(Consumer<Dw_1> var1, rqO_2 var2) {
      this.id_class(var2);
      this.id_case.id_class(new rqO_2("recipes/root")).id_class("has_the_recipe", XD.id_class(var2)).id_class(OR.id_class(var2)).id_class(hS_2.id_break);
      var1.accept(
         new US(
            this,
            var2,
            (int)this.id_break,
            this.id_byte,
            this.id_catch == null ? "" : this.id_catch,
            this.id_protected,
            this.id_throws,
            this.id_case,
            new rqO_2(var2.id_byte(), "recipes/" + this.id_break.id_new().id_break() + "/" + var2.id_break())
         )
      );
   }

   private void id_class(rqO_2 var1) {
      if (this.id_protected.isEmpty()) {
         throw new IllegalStateException("No pattern is defined for shaped recipe " + var1 + "!");
      } else {
         HashSet var2 = Sets.newHashSet(this.id_throws.keySet());
         var2.remove(' ');

         for (String var4 : this.id_protected) {
            for (int var5 = 0; var5 < var4.length(); var5++) {
               char var6 = var4.charAt(var5);
               if (!this.id_throws.containsKey(var6) && var6 != ' ') {
                  throw new IllegalStateException("Pattern in recipe " + var1 + " uses undefined symbol '" + var6 + "'");
               }

               var2.remove(var6);
            }
         }

         if (!var2.isEmpty()) {
            throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + var1);
         } else if (this.id_protected.size() == 1 && this.id_protected.get(0).length() == 1) {
            throw new IllegalStateException("Shaped recipe " + var1 + " only takes in a single item - should it be a shapeless recipe instead?");
         } else if (this.id_case.id_byte().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + var1);
         }
      }
   }

   public static UB id_class(rpL_2 var0, int var1) {
      return new UB(var0, var1);
   }

   public UB id_class(Character var1, rlb_3<rdb_3> var2) {
      return this.id_class(var1, rkg_3.id_class(var2));
   }

   public UB id_class(Character var1, rpL_2 var2) {
      return this.id_class(var1, rkg_3.id_class(var2));
   }

   public UB id_class(Character var1, rkg_3 var2) {
      if (this.id_throws.containsKey(var1)) {
         throw new IllegalArgumentException("Symbol '" + var1 + "' is already defined!");
      } else if (var1 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.id_throws.put(var1, var2);
         return this;
      }
   }

   public UB id_class(String var1) {
      if (!this.id_protected.isEmpty() && var1.length() != this.id_protected.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.id_protected.add(var1);
         return this;
      }
   }

   public UB id_break(String var1) {
      this.id_catch = var1;
      return this;
   }
}
