package celestial;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class rZD implements ruS_2<At_1> {
   private int id_class;
   private int id_break;
   private int id_byte;
   private rcd_3 id_protected;
   private int[] id_throws;
   private byte[] id_case;
   private List<rcd_3> id_catch;
   private boolean id_private;
   private Map<String, Object> id_implements;

   public int id_byte() {
      return this.id_class;
   }

   public rZD() {
   }

   public rZD(roJ_2 var1, int var2) {
      rfj_3 var3 = var1.id_private();
      this.id_class = var3.id_break;
      this.id_break = var3.id_byte;
      this.id_private = var2 == 65535;
      this.id_protected = new rcd_3();

      for (Entry var5 : var1.id_native()) {
         if (((rKv_1)var5.getKey()).id_byte()) {
            this.id_protected.id_class(((rKv_1)var5.getKey()).id_break(), new rcq_3(((rKZ)var5.getValue()).id_class()));
         }
      }

      if (this.id_private) {
         this.id_throws = var1.id_implements().id_class();
      }

      this.id_case = new byte[this.id_class(var1, var2)];
      this.id_byte = this.id_class(new ruu_3(this.id_finally()), var1, var2);
      this.id_catch = Lists.newArrayList();

      for (Entry var12 : var1.id_volatile().entrySet()) {
         rfH_2 var6 = (rfH_2)var12.getKey();
         ryO_2 var7 = (ryO_2)var12.getValue();
         int var8 = var6.c_() >> 4;
         if (this.id_case() || (var2 & 1 << var8) != 0) {
            rcd_3 var9 = var7.Z_();
            this.id_catch.add(var9);
         }
      }

      this.id_implements = new HashMap<>();
      rrbB_2 var11 = rrbS_2.id_class(var1);
      this.id_implements.put("ChunkDataOF", var11);
   }

   @Override
   public String toString() {
      return "SChunkDataPacket{chunkX="
         + this.id_class
         + ", chunkZ="
         + this.id_break
         + ", availableSections="
         + this.id_byte
         + ", heightmapTags="
         + this.id_protected
         + ", biomes="
         + Arrays.toString(this.id_throws)
         + ", buffer="
         + Arrays.toString(this.id_case)
         + ", tileEntityTags="
         + this.id_catch
         + ", fullChunk="
         + this.id_private
         + ", customData="
         + this.id_implements
         + "}";
   }

   protected int id_class(roJ_2 var1, int var2) {
      int var3 = 0;
      roQ_2[] var4 = var1.id_byte();
      int var5 = 0;

      for (int var6 = var4.length; var5 < var6; var5++) {
         roQ_2 var7 = var4[var5];
         if (var7 != roJ_2.id_class && (!this.id_case() || !var7.id_byte()) && (var2 & 1 << var5) != 0) {
            var3 += var7.id_finally();
         }
      }

      return var3;
   }

   public int id_class(ruu_3 var1, roJ_2 var2, int var3) {
      int var4 = 0;
      roQ_2[] var5 = var2.id_byte();
      int var6 = 0;

      for (int var7 = var5.length; var6 < var7; var6++) {
         roQ_2 var8 = var5[var6];
         if (var8 != roJ_2.id_class && (!this.id_case() || !var8.id_byte()) && (var3 & 1 << var6) != 0) {
            var4 |= 1 << var6;
            var8.id_break(var1);
         }
      }

      return var4;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readInt();
      this.id_break = var1.readInt();
      this.id_private = var1.readBoolean();
      this.id_byte = var1.id_case();
      this.id_protected = var1.id_implements();
      if (this.id_private) {
         this.id_throws = var1.id_byte(rYZ.id_class);
      }

      int var2 = var1.id_case();
      if (var2 > 2097152) {
         throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
      } else {
         this.id_case = new byte[var2];
         var1.readBytes(this.id_case);
         int var3 = var1.id_case();
         this.id_catch = Lists.newArrayList();

         for (int var4 = 0; var4 < var3; var4++) {
            this.id_catch.add(var1.id_implements());
         }
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeInt(this.id_class);
      var1.writeInt(this.id_break);
      var1.writeBoolean(this.id_private);
      var1.id_protected(this.id_byte);
      var1.id_class(this.id_protected);
      if (this.id_throws != null) {
         var1.id_class(this.id_throws);
      }

      var1.id_protected(this.id_case.length);
      var1.writeBytes(this.id_case);
      var1.id_protected(this.id_catch.size());

      for (rcd_3 var3 : this.id_catch) {
         var1.id_class(var3);
      }
   }

   public ruu_3 id_break() {
      return new ruu_3(Unpooled.wrappedBuffer(this.id_case), this.id_implements);
   }

   public int id_throws() {
      return this.id_byte;
   }

   private ByteBuf id_finally() {
      ByteBuf var1 = Unpooled.wrappedBuffer(this.id_case);
      var1.writerIndex(0);
      return var1;
   }

   public rcd_3 id_catch() {
      return this.id_protected;
   }

   public boolean id_case() {
      return this.id_private;
   }

   public int[] id_implements() {
      return this.id_throws;
   }

   public int id_protected() {
      return this.id_break;
   }

   public List<rcd_3> id_private() {
      return this.id_catch;
   }
}
