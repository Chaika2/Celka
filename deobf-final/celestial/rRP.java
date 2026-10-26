package celestial;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class rRP {
   private static final Supplier<Set<rRP>> goto_ = Suppliers.memoize(() -> rVL.J.case_().map(rsT_2::class_).collect(Collectors.toSet()));
   public static final Predicate<rRP> class_ = var0 -> goto_.get().contains(var0);
   public static final Predicate<rRP> break_ = var0 -> true;
   private static final Set<xc_3> while_ = ImmutableList.of(
         xu_3.R, xu_3.Y, xu_3.j, xu_3.V, xu_3.I, xu_3.t, xu_3.g, xu_3.y, xu_3.w, xu_3.q, xu_3.H, xu_3.l, new xd_3[]{xu_3.T, xu_3.f, xu_3.C, xu_3.p}
      )
      .stream()
      .flatMap(var0 -> var0.new_().class_().stream())
      .filter(var0 -> var0.byte_(xb_3.volatile_) == rCp_1.HEAD)
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<xc_3, rRP> try_ = Maps.newHashMap();
   public static final rRP byte_ = class_("unemployed", ImmutableSet.of(), 1, class_, 1);
   public static final rRP protected_ = class_("armorer", class_(xu_3.Xr), 1, 1);
   public static final rRP throws_ = class_("butcher", class_(xu_3.hi), 1, 1);
   public static final rRP case_ = class_("cartographer", class_(xu_3.XP), 1, 1);
   public static final rRP catch_ = class_("cleric", class_(xu_3.SG), 1, 1);
   public static final rRP private_ = class_("farmer", class_(xu_3.JG), 1, 1);
   public static final rRP implements_ = class_("fisherman", class_(xu_3.ha), 1, 1);
   public static final rRP finally_ = class_("fletcher", class_(xu_3.XB), 1, 1);
   public static final rRP extends_ = class_("leatherworker", class_(xu_3.Sb), 1, 1);
   public static final rRP native_ = class_("librarian", class_(xu_3.Xs), 1, 1);
   public static final rRP volatile_ = class_("mason", class_(xu_3.XG), 1, 1);
   public static final rRP final_ = class_("nitwit", ImmutableSet.of(), 1, 1);
   public static final rRP package_ = class_("shepherd", class_(xu_3.he), 1, 1);
   public static final rRP int_ = class_("toolsmith", class_(xu_3.XE), 1, 1);
   public static final rRP new_ = class_("weaponsmith", class_(xu_3.XS), 1, 1);
   public static final rRP continue_ = class_("home", while_, 1, 1);
   public static final rRP super_ = class_("meeting", class_(xu_3.Xb), 32, 6);
   public static final rRP this_ = class_("beehive", class_(xu_3.JO), 0, 1);
   public static final rRP else_ = class_("bee_nest", class_(xu_3.JM), 0, 1);
   public static final rRP synchronized_ = class_("nether_portal", class_(xu_3.Pi), 0, 1);
   public static final rRP return_ = class_("lodestone", class_(xu_3.Jc), 0, 1);
   protected static final Set<xc_3> public_ = new ObjectOpenHashSet(try_.keySet());
   private final String instanceof_;
   private final Set<xc_3> throw_;
   private final int interface_;
   private final Predicate<rRP> char_;
   private final int abstract_;

   public int byte_() {
      return this.abstract_;
   }

   private rRP(String var1, Set<xc_3> var2, int var3, int var4) {
      this.instanceof_ = var1;
      this.throw_ = ImmutableSet.copyOf(var2);
      this.interface_ = var3;
      this.char_ = var1x -> var1x == this;
      this.abstract_ = var4;
   }

   private rRP(String var1, Set<xc_3> var2, int var3, Predicate<rRP> var4, int var5) {
      this.instanceof_ = var1;
      this.throw_ = ImmutableSet.copyOf(var2);
      this.interface_ = var3;
      this.char_ = var4;
      this.abstract_ = var5;
   }

   @Override
   public String toString() {
      return this.instanceof_;
   }

   private static rRP class_(rRP var0) {
      var0.throw_.forEach(var1 -> {
         rRP var2 = try_.put(var1, var0);
         if (var2 != null) {
            throw (IllegalStateException)rqR_2.byte_(new IllegalStateException(String.format("%s is defined in too many tags", var1)));
         }
      });
      return var0;
   }

   public static Optional<rRP> class_(xc_3 var0) {
      return Optional.ofNullable(try_.get(var0));
   }

   private static Set<xc_3> class_(xd_3 var0) {
      return ImmutableSet.copyOf(var0.new_().class_());
   }

   public int class_() {
      return this.interface_;
   }

   private static rRP class_(String var0, Set<xc_3> var1, int var2, int var3) {
      return class_(rVL.class_(rVL.x, new rqO_2(var0), new rRP(var0, var1, var2, var3)));
   }

   private static rRP class_(String var0, Set<xc_3> var1, int var2, Predicate<rRP> var3, int var4) {
      return class_(rVL.class_(rVL.x, new rqO_2(var0), new rRP(var0, var1, var2, var3, var4)));
   }

   public Predicate<rRP> break_() {
      return this.char_;
   }
}
