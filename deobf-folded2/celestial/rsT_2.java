package celestial;

import com.google.common.collect.ImmutableSet;

public class rsT_2 {
   public static final rsT_2 id_class = id_class("none", rRP.id_byte, (rqA_2)null);
   public static final rsT_2 id_break = id_class("armorer", rRP.id_protected, rqn_3.kE);
   public static final rsT_2 id_byte = id_class("butcher", rRP.id_throws, rqn_3.kG);
   public static final rsT_2 id_protected = id_class("cartographer", rRP.id_case, rqn_3.kb);
   public static final rsT_2 id_throws = id_class("cleric", rRP.id_catch, rqn_3.kM);
   public static final rsT_2 id_case = id_class(
      "farmer", rRP.id_private, ImmutableSet.of(rdy_3.hB, rdy_3.hP, rdy_3.kJ, rdy_3.Xg), ImmutableSet.of(xu_3.PS), rqn_3.kO
   );
   public static final rsT_2 id_catch = id_class("fisherman", rRP.id_implements, rqn_3.kh);
   public static final rsT_2 id_private = id_class("fletcher", rRP.id_finally, rqn_3.kX);
   public static final rsT_2 id_implements = id_class("leatherworker", rRP.id_extends, rqn_3.kJ);
   public static final rsT_2 id_finally = id_class("librarian", rRP.id_native, rqn_3.kx);
   public static final rsT_2 id_extends = id_class("mason", rRP.id_volatile, rqn_3.kd);
   public static final rsT_2 id_native = id_class("nitwit", rRP.id_final, (rqA_2)null);
   public static final rsT_2 id_volatile = id_class("shepherd", rRP.id_package, rqn_3.kk);
   public static final rsT_2 id_final = id_class("toolsmith", rRP.id_int, rqn_3.kW);
   public static final rsT_2 id_package = id_class("weaponsmith", rRP.id_new, rqn_3.kz);
   private final String id_int;
   private final rRP id_new;
   private final ImmutableSet<rdb_3> id_continue;
   private final ImmutableSet<xd_3> id_super;
   private final rqA_2 id_this;

   public ImmutableSet<xd_3> id_byte() {
      return this.id_super;
   }

   private rsT_2(String var1, rRP var2, ImmutableSet<rdb_3> var3, ImmutableSet<xd_3> var4, rqA_2 var5) {
      this.id_int = var1;
      this.id_new = var2;
      this.id_continue = var3;
      this.id_super = var4;
      this.id_this = var5;
   }

   @Override
   public String toString() {
      return this.id_int;
   }

   static rsT_2 id_class(String var0, rRP var1, ImmutableSet<rdb_3> var2, ImmutableSet<xd_3> var3, rqA_2 var4) {
      return rVL.id_class(rVL.J, new rqO_2(var0), new rsT_2(var0, var1, var2, var3, var4));
   }

   static rsT_2 id_class(String var0, rRP var1, rqA_2 var2) {
      return id_class(var0, var1, ImmutableSet.of(), ImmutableSet.of(), var2);
   }

   public rRP id_class() {
      return this.id_new;
   }

   public ImmutableSet<rdb_3> id_break() {
      return this.id_continue;
   }

   public rqA_2 id_protected() {
      return this.id_this;
   }
}
