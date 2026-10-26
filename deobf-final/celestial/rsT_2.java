package celestial;

import com.google.common.collect.ImmutableSet;

public class rsT_2 {
   public static final rsT_2 class_ = class_("none", rRP.byte_, (rqA_2)null);
   public static final rsT_2 break_ = class_("armorer", rRP.protected_, rqn_3.kE);
   public static final rsT_2 byte_ = class_("butcher", rRP.throws_, rqn_3.kG);
   public static final rsT_2 protected_ = class_("cartographer", rRP.case_, rqn_3.kb);
   public static final rsT_2 throws_ = class_("cleric", rRP.catch_, rqn_3.kM);
   public static final rsT_2 case_ = class_("farmer", rRP.private_, ImmutableSet.of(rdy_3.hB, rdy_3.hP, rdy_3.kJ, rdy_3.Xg), ImmutableSet.of(xu_3.PS), rqn_3.kO);
   public static final rsT_2 catch_ = class_("fisherman", rRP.implements_, rqn_3.kh);
   public static final rsT_2 private_ = class_("fletcher", rRP.finally_, rqn_3.kX);
   public static final rsT_2 implements_ = class_("leatherworker", rRP.extends_, rqn_3.kJ);
   public static final rsT_2 finally_ = class_("librarian", rRP.native_, rqn_3.kx);
   public static final rsT_2 extends_ = class_("mason", rRP.volatile_, rqn_3.kd);
   public static final rsT_2 native_ = class_("nitwit", rRP.final_, (rqA_2)null);
   public static final rsT_2 volatile_ = class_("shepherd", rRP.package_, rqn_3.kk);
   public static final rsT_2 final_ = class_("toolsmith", rRP.int_, rqn_3.kW);
   public static final rsT_2 package_ = class_("weaponsmith", rRP.new_, rqn_3.kz);
   private final String int_;
   private final rRP new_;
   private final ImmutableSet<rdb_3> continue_;
   private final ImmutableSet<xd_3> super_;
   private final rqA_2 this_;

   public ImmutableSet<xd_3> byte_() {
      return this.super_;
   }

   private rsT_2(String var1, rRP var2, ImmutableSet<rdb_3> var3, ImmutableSet<xd_3> var4, rqA_2 var5) {
      this.int_ = var1;
      this.new_ = var2;
      this.continue_ = var3;
      this.super_ = var4;
      this.this_ = var5;
   }

   @Override
   public String toString() {
      return this.int_;
   }

   static rsT_2 class_(String var0, rRP var1, ImmutableSet<rdb_3> var2, ImmutableSet<xd_3> var3, rqA_2 var4) {
      return rVL.class_(rVL.J, new rqO_2(var0), new rsT_2(var0, var1, var2, var3, var4));
   }

   static rsT_2 class_(String var0, rRP var1, rqA_2 var2) {
      return class_(var0, var1, ImmutableSet.of(), ImmutableSet.of(), var2);
   }

   public rRP class_() {
      return this.new_;
   }

   public ImmutableSet<rdb_3> break_() {
      return this.continue_;
   }

   public rqA_2 protected_() {
      return this.this_;
   }
}
