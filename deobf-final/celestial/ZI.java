package celestial;

import java.util.Optional;

enum ZI {
   CREATIVE(new rgn_3("gameMode.creative"), "/gamemode creative", new rdn_3(xu_3.implements_)),
   SURVIVAL(new rgn_3("gameMode.survival"), "/gamemode survival", new rdn_3(rdy_3.Oy)),
   ADVENTURE(new rgn_3("gameMode.adventure"), "/gamemode adventure", new rdn_3(rdy_3.dM)),
   SPECTATOR(new rgn_3("gameMode.spectator"), "/gamemode spectator", new rdn_3(rdy_3.JT));

   protected static final ZI[] field_238721_e_ = values();
   final rgP_2 field_238722_f_;
   final String field_238723_g_;
   final rdn_3 field_238724_h_;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   Optional<ZI> byte_() {
      switch (this) {
         case CREATIVE:
            return Optional.of(SURVIVAL);
         case SURVIVAL:
            return Optional.of(ADVENTURE);
         case ADVENTURE:
            return Optional.of(SPECTATOR);
         default:
            return Optional.of(CREATIVE);
      }
   }

   private ZI(rgP_2 var3, String var4, rdn_3 var5) {
      this.field_238722_f_ = var3;
      this.field_238723_g_ = var4;
      this.field_238724_h_ = var5;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static Optional<ZI> class_(rRl_1 var0) {
      switch (var0) {
         case SPECTATOR:
            return Optional.of(SPECTATOR);
         case SURVIVAL:
            return Optional.of(SURVIVAL);
         case CREATIVE:
            return Optional.of(CREATIVE);
         case ADVENTURE:
            return Optional.of(ADVENTURE);
         default:
            return Optional.empty();
      }
   }

   void class_(Hz_1 var1, int var2, int var3) {
      var1.class_(this.field_238724_h_, var2, var3);
   }

   rgP_2 class_() {
      return this.field_238722_f_;
   }

   String break_() {
      return this.field_238723_g_;
   }
}
