package celestial;

enum rVX implements rVz_1 {
   BLACKLIST(
      xu_3.bK,
      xu_3.Pi,
      xu_3.MY,
      xu_3.Mo,
      xu_3.MK,
      xu_3.MD,
      xu_3.MU,
      xu_3.Me,
      xu_3.Ma,
      xu_3.Mi,
      xu_3.Or,
      xu_3.OP,
      xu_3.OB,
      xu_3.OS,
      xu_3.Os,
      xu_3.OE,
      xu_3.OG,
      xu_3.Ob,
      xu_3.sc,
      xu_3.su,
      xu_3.sm,
      xu_3.SX,
      xu_3.char_,
      xu_3.throw_,
      xu_3.interface_,
      xu_3.PE,
      xu_3.PG,
      xu_3.Pb,
      xu_3.PM,
      xu_3.PO,
      xu_3.Ph,
      xu_3.Pk,
      xu_3.PW,
      xu_3.Pz,
      xu_3.PQ,
      xu_3.PN,
      xu_3.Pc
   ),
   DEFAULT(),
   CHEST(xu_3.re, xu_3.sZ),
   LEAVES(true, xu_3.z, xu_3.k, xu_3.Q, xu_3.W, xu_3.x, xu_3.d),
   STEM_BLOCK(xu_3.BK, xu_3.Bo);

   public static final rpr_3[] field_208827_f = rpr_3.values();

   rVX(boolean var3, xd_3... var4) {
      for (xd_3 var8 : var4) {
         rVh_1.case_.put(var8, this);
      }

      if (var3) {
         rVh_1.catch_.add(this);
      }
   }

   rVX(xd_3... var3) {
      this(false, var3);
   }
}
