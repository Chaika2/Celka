package celestial;

import com.mojang.serialization.Codec;

public class rLX implements rLx_1 {
   public static final rLd_1<rLX> id_class = new rLJ();
   private final rLz_1<rLX> id_break;
   private final xc_3 id_byte;

   @Override
   public String id_byte() {
      return rVL.id_switch.id_break(this.id_protected()) + " " + Rk_1.id_class(this.id_byte);
   }

   public rLX(rLz_1<rLX> var1, xc_3 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public xc_3 id_class() {
      return this.id_byte;
   }

   public static Codec<rLX> id_class(rLz_1<rLX> var0) {
      return xc_3.id_break.xmap(var1 -> new rLX(var0, var1), var0x -> var0x.id_byte);
   }

   @Override
   public void id_class(ruu_3 var1) {
      var1.id_protected(xd_3.id_char.id_class(this.id_byte));
   }

   @Override
   public rLz_1<rLX> id_protected() {
      return this.id_break;
   }
}
