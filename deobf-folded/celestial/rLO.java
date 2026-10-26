package celestial;

import com.mojang.serialization.Codec;

public class rLO extends rLz_1<rLO> implements rLx_1 {
   private static final rLd_1<rLO> id_class = new rLh_1();
   private final Codec<rLO> id_break = Codec.unit(this::id_class);

   @Override
   public String id_byte() {
      return rVL.id_switch.id_break(this).toString();
   }

   protected rLO(boolean var1) {
      super(var1, id_class);
   }

   @Override
   public void id_class(ruu_3 var1) {
   }

   public rLO id_class() {
      return this;
   }

   @Override
   public Codec<rLO> id_break() {
      return this.id_break;
   }
}
