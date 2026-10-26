package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rsp_3 {
   private static final int[] id_break = new int[]{0, 10, 70, 150, 250};
   public static final Codec<rsp_3> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rVL.X.fieldOf("type").orElseGet(() -> rhi_3.id_byte).forGetter(var0x -> var0x.id_byte),
               rVL.J.fieldOf("profession").orElseGet(() -> rsT_2.id_class).forGetter(var0x -> var0x.id_protected),
               Codec.INT.fieldOf("level").orElse(1).forGetter(var0x -> var0x.id_throws)
            )
            .apply(var0, rsp_3::new)
   );
   private final rhi_3 id_byte;
   private final rsT_2 id_protected;
   private final int id_throws;

   public int id_byte() {
      return this.id_throws;
   }

   public static int id_byte(int var0) {
      return id_protected(var0) ? id_break[var0] : 0;
   }

   public rsp_3(rhi_3 var1, rsT_2 var2, int var3) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = Math.max(1, var3);
   }

   public rhi_3 id_class() {
      return this.id_byte;
   }

   public rsp_3 id_class(rhi_3 var1) {
      return new rsp_3(var1, this.id_protected, this.id_throws);
   }

   public rsp_3 id_class(rsT_2 var1) {
      return new rsp_3(this.id_byte, var1, this.id_throws);
   }

   public rsp_3 id_class(int var1) {
      return new rsp_3(this.id_byte, this.id_protected, var1);
   }

   public rsT_2 id_break() {
      return this.id_protected;
   }

   public static int id_break(int var0) {
      return id_protected(var0) ? id_break[var0 - 1] : 0;
   }

   public static boolean id_protected(int var0) {
      return var0 >= 1 && var0 < 5;
   }
}
