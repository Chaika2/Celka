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
   private static final Map<String, Vu_1> class_ = Maps.newHashMap();
   private static final Map<Va_1, List<Vu_1>> break_ = Maps.newHashMap();
   private static final Set<String> byte_ = Sets.newHashSet();
   private static final Map<String, Integer> protected_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put("key.categories.movement", 1);
      var0.put("key.categories.gameplay", 2);
      var0.put("key.categories.inventory", 3);
      var0.put("key.categories.creative", 4);
      var0.put("key.categories.multiplayer", 5);
      var0.put("key.categories.ui", 6);
      var0.put("key.categories.misc", 7);
   });
   private final String throws_;
   private final Va_1 case_;
   private final String catch_;
   private List<Va_1> private_ = new ArrayList<>();
   private List<Va_1> implements_ = new ArrayList<>();
   private Va_1 finally_;
   private boolean extends_;
   private int native_;

   public boolean byte_(Vu_1 var1) {
      return this.finally_.equals(var1.finally_) && this.implements_.equals(var1.implements_);
   }

   public static void byte_() {
      break_.clear();

      for (Vu_1 var1 : class_.values()) {
         break_.computeIfAbsent(var1.finally_, var0 -> new ArrayList<>()).add(var1);
      }
   }

   public Va_1 int_() {
      return this.finally_;
   }

   public Vu_1(String var1, int var2, String var3, List<Va_1> var4) {
      this(var1, Vi_1.KEYSYM, var2, var3);
      this.implements_ = new ArrayList<>(var4);
      this.private_ = var4;
   }

   public Vu_1(String var1, int var2, String var3) {
      this(var1, Vi_1.KEYSYM, var2, var3);
   }

   public Vu_1(String var1, Vi_1 var2, int var3, String var4) {
      this.throws_ = var1;
      this.finally_ = var2.class_(var3);
      this.case_ = this.finally_;
      this.catch_ = var4;
      class_.put(var1, this);
      break_.computeIfAbsent(this.finally_, var0 -> new ArrayList<>()).add(this);
      byte_.add(var4);
   }

   public static Supplier<rgP_2> class_(String var0) {
      Vu_1 var1 = class_.get(var0);
      return var1 == null ? () -> new rgn_3(var0) : var1::native_;
   }

   public static void class_(Va_1 var0) {
      List var1 = break_.get(var0);
      if (var1 != null) {
         for (Vu_1 var3 : var1) {
            var3.native_++;
         }
      }
   }

   public void class_(Va_1 var1, Collection<Va_1> var2) {
      this.finally_ = var1;
      this.implements_.clear();
      if (!var2.isEmpty()) {
         for (Va_1 var4 : var2) {
            if (!var4.equals(this.finally_)) {
               this.implements_.add(var4);
            }
         }
      }
   }

   public void class_(boolean var1) {
      this.extends_ = var1;
   }

   public boolean class_(int var1) {
      return !class_(this) ? false : this.finally_.class_() == Vi_1.MOUSE && this.finally_.break_() == var1;
   }

   public boolean class_(int var1, int var2) {
      if (!class_(this)) {
         return false;
      } else {
         return var1 == Ve_1.class_.break_()
            ? this.finally_.class_() == Vi_1.SCANCODE && this.finally_.break_() == var2
            : this.finally_.class_() == Vi_1.KEYSYM && this.finally_.break_() == var1;
      }
   }

   public static void class_(Va_1 var0, boolean var1) {
      List var2 = break_.get(var0);
      if (var2 != null) {
         for (Vu_1 var4 : var2) {
            var4.class_(var1);
         }
      }
   }

   public static boolean class_(Vu_1 var0) {
      if (var0.implements_.isEmpty()) {
         return true;
      } else {
         for (Va_1 var2 : var0.implements_) {
            if (!rrfC_2.break_(var2.break_())) {
               return false;
            }
         }

         return true;
      }
   }

   public static void class_() {
      for (Vu_1 var1 : class_.values()) {
         if (var1.finally_.class_() == Vi_1.KEYSYM && var1.finally_.break_() != Ve_1.class_.break_()) {
            var1.class_(Ve_1.class_(QY.instanceof_().else_().implements_(), var1.finally_.break_()));
         }
      }
   }

   public int break_(Vu_1 var1) {
      return this.catch_.equals(var1.catch_)
         ? jI_2.class_(this.throws_).compareTo(jI_2.class_(var1.throws_))
         : protected_.get(this.catch_).compareTo(protected_.get(var1.catch_));
   }

   public static void break_() {
      for (Vu_1 var1 : class_.values()) {
         var1.new_();
      }
   }

   public void break_(Va_1 var1, boolean var2) {
      this.finally_ = var1;
      if (var2) {
         this.implements_.clear();
      }
   }

   public String throws_() {
      return this.catch_;
   }

   public List<Va_1> finally_() {
      return this.private_;
   }

   public String catch_() {
      return this.throws_;
   }

   public boolean extends_() {
      return this.finally_.equals(Ve_1.class_);
   }

   public boolean case_() {
      if (class_(this)) {
         if (this.native_ == 0) {
            return false;
         } else {
            this.native_--;
            return true;
         }
      } else {
         return false;
      }
   }

   public List<Va_1> implements_() {
      return this.implements_;
   }

   private void new_() {
      this.native_ = 0;
      this.class_(false);
   }

   public String package_() {
      return this.implements_.stream().map(Va_1::byte_).reduce((var0, var1) -> var0 + ":" + var1).orElse("");
   }

   public boolean protected_() {
      return class_(this) ? this.extends_ : false;
   }

   public Va_1 private_() {
      return this.case_;
   }

   public String final_() {
      return this.finally_.byte_();
   }

   public boolean volatile_() {
      return this.finally_.equals(this.case_) && this.implements_.equals(this.private_);
   }

   public rgP_2 native_() {
      rgN_2 var1 = new rgN_2("");

      for (Va_1 var3 : this.implements_) {
         var1.class_(var3.protected_());
         var1.break_(" + ");
      }

      var1.class_(this.finally_.protected_());
      return var1;
   }
}
