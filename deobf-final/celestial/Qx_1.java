package celestial;

import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Qx_1 {
   private static final Joiner class_ = Joiner.on(",");
   private final List<String[]> break_ = Lists.newArrayList();
   private final Map<Character, Predicate<ryw_3>> byte_ = Maps.newHashMap();
   private int protected_;
   private int throws_;

   private Predicate<ryw_3>[][][] byte_() {
      this.protected_();
      Predicate[][][] var1 = (Predicate[][][])Array.newInstance(Predicate.class, this.break_.size(), this.protected_, this.throws_);

      for (int var2 = 0; var2 < this.break_.size(); var2++) {
         for (int var3 = 0; var3 < this.protected_; var3++) {
            for (int var4 = 0; var4 < this.throws_; var4++) {
               var1[var2][var3][var4] = this.byte_.get(this.break_.get(var2)[var3].charAt(var4));
            }
         }
      }

      return var1;
   }

   private Qx_1() {
      this.byte_.put(' ', Predicates.alwaysTrue());
   }

   public Qx_1 class_(String... var1) {
      if (!ArrayUtils.isEmpty(var1) && !StringUtils.isEmpty(var1[0])) {
         if (this.break_.isEmpty()) {
            this.protected_ = var1.length;
            this.throws_ = var1[0].length();
         }

         if (var1.length != this.protected_) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.protected_ + ", but was given one with a height of " + var1.length + ")");
         } else {
            for (String var5 : var1) {
               if (var5.length() != this.throws_) {
                  throw new IllegalArgumentException(
                     "Not all rows in the given aisle are the correct width (expected " + this.throws_ + ", found one with " + var5.length() + ")"
                  );
               }

               for (char var9 : var5.toCharArray()) {
                  if (!this.byte_.containsKey(var9)) {
                     this.byte_.put(var9, (Predicate<ryw_3>)null);
                  }
               }
            }

            this.break_.add(var1);
            return this;
         }
      } else {
         throw new IllegalArgumentException("Empty pattern for aisle");
      }
   }

   public static Qx_1 class_() {
      return new Qx_1();
   }

   public Qx_1 class_(char var1, Predicate<ryw_3> var2) {
      this.byte_.put(var1, var2);
      return this;
   }

   public Qh_1 break_() {
      return new Qh_1(this.byte_());
   }

   private void protected_() {
      ArrayList var1 = Lists.newArrayList();

      for (Entry var3 : this.byte_.entrySet()) {
         if (var3.getValue() == null) {
            var1.add((Character)var3.getKey());
         }
      }

      if (!var1.isEmpty()) {
         throw new IllegalStateException("Predicates for character(s) " + class_.join(var1) + " are missing");
      }
   }
}
