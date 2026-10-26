package celestial;

import com.mojang.serialization.Codec;

public class rLk_1 implements rLx_1 {
   public static final rLd_1<rLk_1> id_class = new rLW();
   private final rLz_1<rLk_1> id_break;
   private final rdn_3 id_byte;

   @Override
   public String id_byte() {
      return rVL.id_switch.id_break(this.id_protected()) + " " + new RY(this.id_byte.id_break(), this.id_byte.id_package()).id_break();
   }

   public rLk_1(rLz_1<rLk_1> var1, rdn_3 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public rdn_3 id_class() {
      return this.id_byte;
   }

   public static Codec<rLk_1> id_class(rLz_1<rLk_1> var0) {
      return rdn_3.id_class.xmap(var1 -> new rLk_1(var0, var1), var0x -> var0x.id_byte);
   }

   @Override
   public void id_class(ruu_3 var1) {
      var1.id_class(this.id_byte);
   }

   @Override
   public rLz_1<rLk_1> id_protected() {
      return this.id_break;
   }
}
