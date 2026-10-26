package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;

public class ic_3 {
   private final iJ_2 id_class;
   private final Map<id_3, Set<ix_3>> id_break = Maps.newEnumMap(id_3.class);
   private final Map<UUID, ix_3> id_byte = new Object2ObjectArrayMap();
   private final Set<ix_3> id_protected = new ObjectArraySet();
   private double id_throws;
   private boolean id_case = true;
   private double id_catch;
   private final Consumer<ic_3> id_private;

   public void id_byte(ix_3 var1) {
      this.id_throws(var1);
      this.id_protected.add(var1);
   }

   public Set<ix_3> id_byte() {
      return ImmutableSet.copyOf(this.id_byte.values());
   }

   public boolean id_byte(UUID var1) {
      ix_3 var2 = this.id_class(var1);
      if (var2 != null && this.id_protected.contains(var2)) {
         this.id_protected(var2);
         return true;
      } else {
         return false;
      }
   }

   public ic_3(iJ_2 var1, Consumer<ic_3> var2) {
      this.id_class = var1;
      this.id_private = var2;
      this.id_throws = var1.id_class();
   }

   public void id_class(double var1) {
      if (var1 != this.id_throws) {
         this.id_throws = var1;
         this.id_protected();
      }
   }

   public iJ_2 id_class() {
      return this.id_class;
   }

   public void id_class(ic_3 var1) {
      this.id_throws = var1.id_throws;
      this.id_byte.clear();
      this.id_byte.putAll(var1.id_byte);
      this.id_protected.clear();
      this.id_protected.addAll(var1.id_protected);
      this.id_break.clear();
      var1.id_break.forEach((var1x, var2) -> this.id_class(var1x).addAll(var2));
      this.id_protected();
   }

   public void id_class(rcd_3 var1) {
      this.id_throws = var1.id_extends("Base");
      if (var1.id_byte("Modifiers", 9)) {
         rcy_3 var2 = var1.id_protected("Modifiers", 10);

         for (int var3 = 0; var3 < var2.size(); var3++) {
            ix_3 var4 = ix_3.id_class(var2.id_class(var3));
            if (var4 != null) {
               this.id_byte.put(var4.id_class(), var4);
               this.id_class(var4.id_byte()).add(var4);
               this.id_protected.add(var4);
            }
         }
      }

      this.id_protected();
   }

   public boolean id_class(ix_3 var1) {
      return this.id_byte.get(var1.id_class()) != null;
   }

   public Set<ix_3> id_class(id_3 var1) {
      return this.id_break.computeIfAbsent(var1, var0 -> Sets.newHashSet());
   }

   public ix_3 id_class(UUID var1) {
      return this.id_byte.get(var1);
   }

   private Collection<ix_3> id_break(id_3 var1) {
      return this.id_break.getOrDefault(var1, Collections.emptySet());
   }

   public void id_break(ix_3 var1) {
      this.id_throws(var1);
   }

   public void id_break(UUID var1) {
      ix_3 var2 = this.id_class(var1);
      if (var2 != null) {
         this.id_protected(var2);
      }
   }

   public double id_break() {
      return this.id_throws;
   }

   private void id_throws(ix_3 var1) {
      ix_3 var2 = this.id_byte.putIfAbsent(var1.id_class(), var1);
      if (var2 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.id_class(var1.id_byte()).add(var1);
         this.id_protected();
      }
   }

   public void id_throws() {
      for (ix_3 var2 : this.id_byte()) {
         this.id_protected(var2);
      }
   }

   public rcd_3 id_catch() {
      rcd_3 var1 = new rcd_3();
      var1.id_class("Name", rVL.O.id_break(this.id_class).toString());
      var1.id_class("Base", this.id_throws);
      if (!this.id_protected.isEmpty()) {
         rcy_3 var2 = new rcy_3();

         for (ix_3 var4 : this.id_protected) {
            var2.add(var4.id_throws());
         }

         var1.id_class("Modifiers", var2);
      }

      return var1;
   }

   public double id_case() {
      if (this.id_case) {
         this.id_catch = this.id_private();
         this.id_case = false;
      }

      return this.id_catch;
   }

   public void id_protected(ix_3 var1) {
      this.id_class(var1.id_byte()).remove(var1);
      this.id_byte.remove(var1.id_class());
      this.id_protected.remove(var1);
      this.id_protected();
   }

   protected void id_protected() {
      this.id_case = true;
      this.id_private.accept(this);
   }

   private double id_private() {
      double var1 = this.id_break();

      for (ix_3 var4 : this.id_break(id_3.ADDITION)) {
         var1 += var4.id_protected();
      }

      double var7 = var1;

      for (ix_3 var6 : this.id_break(id_3.MULTIPLY_BASE)) {
         var7 += var1 * var6.id_protected();
      }

      for (ix_3 var9 : this.id_break(id_3.MULTIPLY_TOTAL)) {
         var7 *= 1.0 + var9.id_protected();
      }

      return this.id_class.id_class(var7);
   }
}
