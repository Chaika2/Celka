package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rsp_3 {
   private static final int[] break_ = new int[]{0, 10, 70, 150, 250};
   public static final Codec<rsp_3> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rVL.X.fieldOf("type").orElseGet(() -> rhi_3.byte_).forGetter(var0x -> var0x.byte_),
               rVL.J.fieldOf("profession").orElseGet(() -> rsT_2.class_).forGetter(var0x -> var0x.protected_),
               Codec.INT.fieldOf("level").orElse(1).forGetter(var0x -> var0x.throws_)
            )
            .apply(var0, rsp_3::new)
   );
   private final rhi_3 byte_;
   private final rsT_2 protected_;
   private final int throws_;

   public int byte_() {
      return this.throws_;
   }

   public static int byte_(int var0) {
      return protected_(var0) ? break_[var0] : 0;
   }

   public rsp_3(rhi_3 var1, rsT_2 var2, int var3) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = Math.max(1, var3);
   }

   public rhi_3 class_() {
      return this.byte_;
   }

   public rsp_3 class_(rhi_3 var1) {
      return new rsp_3(var1, this.protected_, this.throws_);
   }

   public rsp_3 class_(rsT_2 var1) {
      return new rsp_3(this.byte_, var1, this.throws_);
   }

   public rsp_3 class_(int var1) {
      return new rsp_3(this.byte_, this.protected_, var1);
   }

   public rsT_2 break_() {
      return this.protected_;
   }

   public static int break_(int var0) {
      return protected_(var0) ? break_[var0 - 1] : 0;
   }

   public static boolean protected_(int var0) {
      return var0 >= 1 && var0 < 5;
   }
}
