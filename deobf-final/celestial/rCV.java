package celestial;

public enum rCV implements rpH_2 {
   HARP("harp", rqn_3.MA),
   BASEDRUM("basedrum", rqn_3.Mu),
   SNARE("snare", rqn_3.Ml),
   HAT("hat", rqn_3.Mn),
   BASS("bass", rqn_3.Mm),
   FLUTE("flute", rqn_3.MF),
   BELL("bell", rqn_3.MZ),
   GUITAR("guitar", rqn_3.ML),
   CHIME("chime", rqn_3.Mv),
   XYLOPHONE("xylophone", rqn_3.MH),
   IRON_XYLOPHONE("iron_xylophone", rqn_3.My),
   COW_BELL("cow_bell", rqn_3.Mp),
   DIDGERIDOO("didgeridoo", rqn_3.Mq),
   BIT("bit", rqn_3.MT),
   BANJO("banjo", rqn_3.Mt),
   PLING("pling", rqn_3.MC);

   private final String name;
   private final rqA_2 sound;

   private rCV(String var3, rqA_2 var4) {
      this.name = var3;
      this.sound = var4;
   }

   @Override
   public String class_() {
      return this.name;
   }

   public static rCV class_(xc_3 var0) {
      if (var0.class_(xu_3.PI)) {
         return FLUTE;
      } else if (var0.class_(xu_3.rt)) {
         return BELL;
      } else if (var0.class_(rls_3.break_)) {
         return GUITAR;
      } else if (var0.class_(xu_3.Ei)) {
         return CHIME;
      } else if (var0.class_(xu_3.bY)) {
         return XYLOPHONE;
      } else if (var0.class_(xu_3.rw)) {
         return IRON_XYLOPHONE;
      } else if (var0.class_(xu_3.PY)) {
         return COW_BELL;
      } else if (var0.class_(xu_3.Pg)) {
         return DIDGERIDOO;
      } else if (var0.class_(xu_3.SN)) {
         return BIT;
      } else if (var0.class_(xu_3.Ey)) {
         return BANJO;
      } else if (var0.class_(xu_3.Pa)) {
         return PLING;
      } else {
         QP var1 = var0.byte_();
         if (var1 == QP.void_) {
            return BASEDRUM;
         } else if (var1 == QP.synchronized_) {
            return SNARE;
         } else if (var1 == QP.abstract_) {
            return HAT;
         } else {
            return var1 != QP.goto_ && var1 != QP.while_ ? HARP : BASS;
         }
      }
   }

   public rqA_2 break_() {
      return this.sound;
   }
}
