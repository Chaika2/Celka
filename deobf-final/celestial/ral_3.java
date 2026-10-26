package celestial;

import com.mojang.serialization.Codec;

public class ral_3 extends rrrZ<rrrI> {
   final int else_;
   final boolean synchronized_;
   final boolean return_;

   public ral_3(Codec<rrrI> var1, int var2, boolean var3, boolean var4) {
      super(var1);
      this.else_ = var2;
      this.synchronized_ = var3;
      this.return_ = var4;
   }

   @Override
   public rrrv_1<rrrI> class_() {
      return (var1, var2, var3, var4, var5, var6) -> new raH_2(this, var2, var3, var4, var5, var6);
   }
}
