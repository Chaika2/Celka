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
   private static final Logger class_ = LogManager.getLogger();
   private final rdb_3 break_;
   private final int byte_;
   private final List<String> protected_ = Lists.newArrayList();
   private final Map<Character, rkg_3> throws_ = Maps.newLinkedHashMap();
   private final Ot_1 case_ = Ot_1.class_();
   private String catch_;

   public UB(rpL_2 var1, int var2) {
      this.break_ = var1.case_();
      this.byte_ = var2;
   }

   public static UB class_(rpL_2 var0) {
      return class_(var0, 1);
   }

   public UB class_(String var1, hr_3 var2) {
      this.case_.class_(var1, var2);
      return this;
   }

   public void class_(Consumer<Dw_1> var1) {
      this.class_(var1, rVL.for_.break_(this.break_));
   }

   public void class_(Consumer<Dw_1> var1, String var2) {
      rqO_2 var3 = rVL.for_.break_(this.break_);
      if (new rqO_2(var2).equals(var3)) {
         throw new IllegalStateException("Shaped Recipe " + var2 + " should remove its 'save' argument");
      } else {
         this.class_(var1, new rqO_2(var2));
      }
   }

   public void class_(Consumer<Dw_1> var1, rqO_2 var2) {
      this.class_(var2);
      this.case_.class_(new rqO_2("recipes/root")).class_("has_the_recipe", XD.class_(var2)).class_(OR.class_(var2)).class_(hS_2.break_);
      var1.accept(
         new US(
            this,
            var2,
            (int)this.break_,
            this.byte_,
            this.catch_ == null ? "" : this.catch_,
            this.protected_,
            this.throws_,
            this.case_,
            new rqO_2(var2.byte_(), "recipes/" + this.break_.new_().break_() + "/" + var2.break_())
         )
      );
   }

   private void class_(rqO_2 var1) {
      if (this.protected_.isEmpty()) {
         throw new IllegalStateException("No pattern is defined for shaped recipe " + var1 + "!");
      } else {
         HashSet var2 = Sets.newHashSet(this.throws_.keySet());
         var2.remove(' ');

         for (String var4 : this.protected_) {
            for (int var5 = 0; var5 < var4.length(); var5++) {
               char var6 = var4.charAt(var5);
               if (!this.throws_.containsKey(var6) && var6 != ' ') {
                  throw new IllegalStateException("Pattern in recipe " + var1 + " uses undefined symbol '" + var6 + "'");
               }

               var2.remove(var6);
            }
         }

         if (!var2.isEmpty()) {
            throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + var1);
         } else if (this.protected_.size() == 1 && this.protected_.get(0).length() == 1) {
            throw new IllegalStateException("Shaped recipe " + var1 + " only takes in a single item - should it be a shapeless recipe instead?");
         } else if (this.case_.byte_().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + var1);
         }
      }
   }

   public static UB class_(rpL_2 var0, int var1) {
      return new UB(var0, var1);
   }

   public UB class_(Character var1, rlb_3<rdb_3> var2) {
      return this.class_(var1, rkg_3.class_(var2));
   }

   public UB class_(Character var1, rpL_2 var2) {
      return this.class_(var1, rkg_3.class_(var2));
   }

   public UB class_(Character var1, rkg_3 var2) {
      if (this.throws_.containsKey(var1)) {
         throw new IllegalArgumentException("Symbol '" + var1 + "' is already defined!");
      } else if (var1 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.throws_.put(var1, var2);
         return this;
      }
   }

   public UB class_(String var1) {
      if (!this.protected_.isEmpty() && var1.length() != this.protected_.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.protected_.add(var1);
         return this;
      }
   }

   public UB break_(String var1) {
      this.catch_ = var1;
      return this;
   }
}
