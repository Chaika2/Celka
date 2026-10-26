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
   private static final Joiner id_class = Joiner.on(",");
   private final List<String[]> id_break = Lists.newArrayList();
   private final Map<Character, Predicate<ryw_3>> id_byte = Maps.newHashMap();
   private int id_protected;
   private int id_throws;

   private Predicate<ryw_3>[][][] id_byte() {
      this.id_protected();
      Predicate[][][] var1 = (Predicate[][][])Array.newInstance(Predicate.class, this.id_break.size(), this.id_protected, this.id_throws);

      for (int var2 = 0; var2 < this.id_break.size(); var2++) {
         for (int var3 = 0; var3 < this.id_protected; var3++) {
            for (int var4 = 0; var4 < this.id_throws; var4++) {
               var1[var2][var3][var4] = this.id_byte.get(this.id_break.get(var2)[var3].charAt(var4));
            }
         }
      }

      return var1;
   }

   private Qx_1() {
      this.id_byte.put(' ', Predicates.alwaysTrue());
   }

   public Qx_1 id_class(String... var1) {
      if (!ArrayUtils.isEmpty(var1) && !StringUtils.isEmpty(var1[0])) {
         if (this.id_break.isEmpty()) {
            this.id_protected = var1.length;
            this.id_throws = var1[0].length();
         }

         if (var1.length != this.id_protected) {
            throw new IllegalArgumentException(
               "Expected aisle with height of " + this.id_protected + ", but was given one with a height of " + var1.length + ")"
            );
         } else {
            for (String var5 : var1) {
               if (var5.length() != this.id_throws) {
                  throw new IllegalArgumentException(
                     "Not all rows in the given aisle are the correct width (expected " + this.id_throws + ", found one with " + var5.length() + ")"
                  );
               }

               for (char var9 : var5.toCharArray()) {
                  if (!this.id_byte.containsKey(var9)) {
                     this.id_byte.put(var9, (Predicate<ryw_3>)null);
                  }
               }
            }

            this.id_break.add(var1);
            return this;
         }
      } else {
         throw new IllegalArgumentException("Empty pattern for aisle");
      }
   }

   public static Qx_1 id_class() {
      return new Qx_1();
   }

   public Qx_1 id_class(char var1, Predicate<ryw_3> var2) {
      this.id_byte.put(var1, var2);
      return this;
   }

   public Qh_1 id_break() {
      return new Qh_1(this.id_byte());
   }

   private void id_protected() {
      ArrayList var1 = Lists.newArrayList();

      for (Entry var3 : this.id_byte.entrySet()) {
         if (var3.getValue() == null) {
            var1.add((Character)var3.getKey());
         }
      }

      if (!var1.isEmpty()) {
         throw new IllegalStateException("Predicates for character(s) " + id_class.join(var1) + " are missing");
      }
   }
}
