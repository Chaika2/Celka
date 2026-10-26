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
   private final iJ_2 class_;
   private final Map<id_3, Set<ix_3>> break_ = Maps.newEnumMap(id_3.class);
   private final Map<UUID, ix_3> byte_ = new Object2ObjectArrayMap();
   private final Set<ix_3> protected_ = new ObjectArraySet();
   private double throws_;
   private boolean case_ = true;
   private double catch_;
   private final Consumer<ic_3> private_;

   public void byte_(ix_3 var1) {
      this.throws_(var1);
      this.protected_.add(var1);
   }

   public Set<ix_3> byte_() {
      return ImmutableSet.copyOf(this.byte_.values());
   }

   public boolean byte_(UUID var1) {
      ix_3 var2 = this.class_(var1);
      if (var2 != null && this.protected_.contains(var2)) {
         this.protected_(var2);
         return true;
      } else {
         return false;
      }
   }

   public ic_3(iJ_2 var1, Consumer<ic_3> var2) {
      this.class_ = var1;
      this.private_ = var2;
      this.throws_ = var1.class_();
   }

   public void class_(double var1) {
      if (var1 != this.throws_) {
         this.throws_ = var1;
         this.protected_();
      }
   }

   public iJ_2 class_() {
      return this.class_;
   }

   public void class_(ic_3 var1) {
      this.throws_ = var1.throws_;
      this.byte_.clear();
      this.byte_.putAll(var1.byte_);
      this.protected_.clear();
      this.protected_.addAll(var1.protected_);
      this.break_.clear();
      var1.break_.forEach((var1x, var2) -> this.class_(var1x).addAll(var2));
      this.protected_();
   }

   public void class_(rcd_3 var1) {
      this.throws_ = var1.extends_("Base");
      if (var1.byte_("Modifiers", 9)) {
         rcy_3 var2 = var1.protected_("Modifiers", 10);

         for (int var3 = 0; var3 < var2.size(); var3++) {
            ix_3 var4 = ix_3.class_(var2.class_(var3));
            if (var4 != null) {
               this.byte_.put(var4.class_(), var4);
               this.class_(var4.byte_()).add(var4);
               this.protected_.add(var4);
            }
         }
      }

      this.protected_();
   }

   public boolean class_(ix_3 var1) {
      return this.byte_.get(var1.class_()) != null;
   }

   public Set<ix_3> class_(id_3 var1) {
      return this.break_.computeIfAbsent(var1, var0 -> Sets.newHashSet());
   }

   public ix_3 class_(UUID var1) {
      return this.byte_.get(var1);
   }

   private Collection<ix_3> break_(id_3 var1) {
      return this.break_.getOrDefault(var1, Collections.emptySet());
   }

   public void break_(ix_3 var1) {
      this.throws_(var1);
   }

   public void break_(UUID var1) {
      ix_3 var2 = this.class_(var1);
      if (var2 != null) {
         this.protected_(var2);
      }
   }

   public double break_() {
      return this.throws_;
   }

   private void throws_(ix_3 var1) {
      ix_3 var2 = this.byte_.putIfAbsent(var1.class_(), var1);
      if (var2 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.class_(var1.byte_()).add(var1);
         this.protected_();
      }
   }

   public void throws_() {
      for (ix_3 var2 : this.byte_()) {
         this.protected_(var2);
      }
   }

   public rcd_3 catch_() {
      rcd_3 var1 = new rcd_3();
      var1.class_("Name", rVL.O.break_(this.class_).toString());
      var1.class_("Base", this.throws_);
      if (!this.protected_.isEmpty()) {
         rcy_3 var2 = new rcy_3();

         for (ix_3 var4 : this.protected_) {
            var2.add(var4.throws_());
         }

         var1.class_("Modifiers", var2);
      }

      return var1;
   }

   public double case_() {
      if (this.case_) {
         this.catch_ = this.private_();
         this.case_ = false;
      }

      return this.catch_;
   }

   public void protected_(ix_3 var1) {
      this.class_(var1.byte_()).remove(var1);
      this.byte_.remove(var1.class_());
      this.protected_.remove(var1);
      this.protected_();
   }

   protected void protected_() {
      this.case_ = true;
      this.private_.accept(this);
   }

   private double private_() {
      double var1 = this.break_();

      for (ix_3 var4 : this.break_(id_3.ADDITION)) {
         var1 += var4.protected_();
      }

      double var7 = var1;

      for (ix_3 var6 : this.break_(id_3.MULTIPLY_BASE)) {
         var7 += var1 * var6.protected_();
      }

      for (ix_3 var9 : this.break_(id_3.MULTIPLY_TOTAL)) {
         var7 *= 1.0 + var9.protected_();
      }

      return this.class_.class_(var7);
   }
}
