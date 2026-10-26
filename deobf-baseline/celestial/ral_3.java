package celestial;

import com.mojang.serialization.Codec;

public class ral_3 extends rrrZ<rrrI> {
   final int id_else;
   final boolean id_synchronized;
   final boolean id_return;

   public ral_3(Codec<rrrI> var1, int var2, boolean var3, boolean var4) {
      super(var1);
      this.id_else = var2;
      this.id_synchronized = var3;
      this.id_return = var4;
   }

   @Override
   public rrrv_1<rrrI> id_class() {
      return (var1, var2, var3, var4, var5, var6) -> new raH_2(this, var2, var3, var4, var5, var6);
   }
}
