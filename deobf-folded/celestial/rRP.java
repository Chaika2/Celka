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
   private static final Supplier<Set<rRP>> id_goto = Suppliers.memoize(() -> rVL.J.id_case().map(rsT_2::id_class).collect(Collectors.toSet()));
   public static final Predicate<rRP> id_class = var0 -> id_goto.get().contains(var0);
   public static final Predicate<rRP> id_break = var0 -> true;
   private static final Set<xc_3> id_while = ImmutableList.of(
         xu_3.R, xu_3.Y, xu_3.j, xu_3.V, xu_3.I, xu_3.t, xu_3.g, xu_3.y, xu_3.w, xu_3.q, xu_3.H, xu_3.l, new xd_3[]{xu_3.T, xu_3.f, xu_3.C, xu_3.p}
      )
      .stream()
      .flatMap(var0 -> var0.id_new().id_class().stream())
      .filter(var0 -> var0.id_byte(xb_3.id_volatile) == rCp_1.HEAD)
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<xc_3, rRP> id_try = Maps.newHashMap();
   public static final rRP id_byte = id_class("unemployed", ImmutableSet.of(), 1, id_class, 1);
   public static final rRP id_protected = id_class("armorer", id_class(xu_3.Xr), 1, 1);
   public static final rRP id_throws = id_class("butcher", id_class(xu_3.hi), 1, 1);
   public static final rRP id_case = id_class("cartographer", id_class(xu_3.XP), 1, 1);
   public static final rRP id_catch = id_class("cleric", id_class(xu_3.SG), 1, 1);
   public static final rRP id_private = id_class("farmer", id_class(xu_3.JG), 1, 1);
   public static final rRP id_implements = id_class("fisherman", id_class(xu_3.ha), 1, 1);
   public static final rRP id_finally = id_class("fletcher", id_class(xu_3.XB), 1, 1);
   public static final rRP id_extends = id_class("leatherworker", id_class(xu_3.Sb), 1, 1);
   public static final rRP id_native = id_class("librarian", id_class(xu_3.Xs), 1, 1);
   public static final rRP id_volatile = id_class("mason", id_class(xu_3.XG), 1, 1);
   public static final rRP id_final = id_class("nitwit", ImmutableSet.of(), 1, 1);
   public static final rRP id_package = id_class("shepherd", id_class(xu_3.he), 1, 1);
   public static final rRP id_int = id_class("toolsmith", id_class(xu_3.XE), 1, 1);
   public static final rRP id_new = id_class("weaponsmith", id_class(xu_3.XS), 1, 1);
   public static final rRP id_continue = id_class("home", id_while, 1, 1);
   public static final rRP id_super = id_class("meeting", id_class(xu_3.Xb), 32, 6);
   public static final rRP id_this = id_class("beehive", id_class(xu_3.JO), 0, 1);
   public static final rRP id_else = id_class("bee_nest", id_class(xu_3.JM), 0, 1);
   public static final rRP id_synchronized = id_class("nether_portal", id_class(xu_3.Pi), 0, 1);
   public static final rRP id_return = id_class("lodestone", id_class(xu_3.Jc), 0, 1);
   protected static final Set<xc_3> id_public = new ObjectOpenHashSet(id_try.keySet());
   private final String id_instanceof;
   private final Set<xc_3> id_throw;
   private final int id_interface;
   private final Predicate<rRP> id_char;
   private final int id_abstract;

   public int id_byte() {
      return this.id_abstract;
   }

   private rRP(String var1, Set<xc_3> var2, int var3, int var4) {
      this.id_instanceof = var1;
      this.id_throw = ImmutableSet.copyOf(var2);
      this.id_interface = var3;
      this.id_char = var1x -> var1x == this;
      this.id_abstract = var4;
   }

   private rRP(String var1, Set<xc_3> var2, int var3, Predicate<rRP> var4, int var5) {
      this.id_instanceof = var1;
      this.id_throw = ImmutableSet.copyOf(var2);
      this.id_interface = var3;
      this.id_char = var4;
      this.id_abstract = var5;
   }

   @Override
   public String toString() {
      return this.id_instanceof;
   }

   private static rRP id_class(rRP var0) {
      var0.id_throw.forEach(var1 -> {
         rRP var2 = id_try.put(var1, var0);
         if (var2 != null) {
            throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException(String.format("%s is defined in too many tags", var1)));
         }
      });
      return var0;
   }

   public static Optional<rRP> id_class(xc_3 var0) {
      return Optional.ofNullable(id_try.get(var0));
   }

   private static Set<xc_3> id_class(xd_3 var0) {
      return ImmutableSet.copyOf(var0.id_new().id_class());
   }

   public int id_class() {
      return this.id_interface;
   }

   private static rRP id_class(String var0, Set<xc_3> var1, int var2, int var3) {
      return id_class(rVL.id_class(rVL.x, new rqO_2(var0), new rRP(var0, var1, var2, var3)));
   }

   private static rRP id_class(String var0, Set<xc_3> var1, int var2, Predicate<rRP> var3, int var4) {
      return id_class(rVL.id_class(rVL.x, new rqO_2(var0), new rRP(var0, var1, var2, var3, var4)));
   }

   public Predicate<rRP> id_break() {
      return this.id_char;
   }
}
