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
   private int class_;
   private int break_;
   private int byte_;
   private rcd_3 protected_;
   private int[] throws_;
   private byte[] case_;
   private List<rcd_3> catch_;
   private boolean private_;
   private Map<String, Object> implements_;

   public int byte_() {
      return this.class_;
   }

   public rZD() {
   }

   public rZD(roJ_2 var1, int var2) {
      rfj_3 var3 = var1.private_();
      this.class_ = var3.break_;
      this.break_ = var3.byte_;
      this.private_ = var2 == 65535;
      this.protected_ = new rcd_3();

      for (Entry var5 : var1.native_()) {
         if (((rKv_1)var5.getKey()).byte_()) {
            this.protected_.class_(((rKv_1)var5.getKey()).break_(), new rcq_3(((rKZ)var5.getValue()).class_()));
         }
      }

      if (this.private_) {
         this.throws_ = var1.implements_().class_();
      }

      this.case_ = new byte[this.class_(var1, var2)];
      this.byte_ = this.class_(new ruu_3(this.finally_()), var1, var2);
      this.catch_ = Lists.newArrayList();

      for (Entry var12 : var1.volatile_().entrySet()) {
         rfH_2 var6 = (rfH_2)var12.getKey();
         ryO_2 var7 = (ryO_2)var12.getValue();
         int var8 = var6.c_() >> 4;
         if (this.case_() || (var2 & 1 << var8) != 0) {
            rcd_3 var9 = var7.Z_();
            this.catch_.add(var9);
         }
      }

      this.implements_ = new HashMap<>();
      rrbB_2 var11 = rrbS_2.class_(var1);
      this.implements_.put("ChunkDataOF", var11);
   }

   @Override
   public String toString() {
      return "SChunkDataPacket{chunkX="
         + this.class_
         + ", chunkZ="
         + this.break_
         + ", availableSections="
         + this.byte_
         + ", heightmapTags="
         + this.protected_
         + ", biomes="
         + Arrays.toString(this.throws_)
         + ", buffer="
         + Arrays.toString(this.case_)
         + ", tileEntityTags="
         + this.catch_
         + ", fullChunk="
         + this.private_
         + ", customData="
         + this.implements_
         + "}";
   }

   protected int class_(roJ_2 var1, int var2) {
      int var3 = 0;
      roQ_2[] var4 = var1.byte_();
      int var5 = 0;

      for (int var6 = var4.length; var5 < var6; var5++) {
         roQ_2 var7 = var4[var5];
         if (var7 != roJ_2.class_ && (!this.case_() || !var7.byte_()) && (var2 & 1 << var5) != 0) {
            var3 += var7.finally_();
         }
      }

      return var3;
   }

   public int class_(ruu_3 var1, roJ_2 var2, int var3) {
      int var4 = 0;
      roQ_2[] var5 = var2.byte_();
      int var6 = 0;

      for (int var7 = var5.length; var6 < var7; var6++) {
         roQ_2 var8 = var5[var6];
         if (var8 != roJ_2.class_ && (!this.case_() || !var8.byte_()) && (var3 & 1 << var6) != 0) {
            var4 |= 1 << var6;
            var8.break_(var1);
         }
      }

      return var4;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readInt();
      this.break_ = var1.readInt();
      this.private_ = var1.readBoolean();
      this.byte_ = var1.case_();
      this.protected_ = var1.implements_();
      if (this.private_) {
         this.throws_ = var1.byte_(rYZ.class_);
      }

      int var2 = var1.case_();
      if (var2 > 2097152) {
         throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
      } else {
         this.case_ = new byte[var2];
         var1.readBytes(this.case_);
         int var3 = var1.case_();
         this.catch_ = Lists.newArrayList();

         for (int var4 = 0; var4 < var3; var4++) {
            this.catch_.add(var1.implements_());
         }
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeInt(this.class_);
      var1.writeInt(this.break_);
      var1.writeBoolean(this.private_);
      var1.protected_(this.byte_);
      var1.class_(this.protected_);
      if (this.throws_ != null) {
         var1.class_(this.throws_);
      }

      var1.protected_(this.case_.length);
      var1.writeBytes(this.case_);
      var1.protected_(this.catch_.size());

      for (rcd_3 var3 : this.catch_) {
         var1.class_(var3);
      }
   }

   public ruu_3 break_() {
      return new ruu_3(Unpooled.wrappedBuffer(this.case_), this.implements_);
   }

   public int throws_() {
      return this.byte_;
   }

   private ByteBuf finally_() {
      ByteBuf var1 = Unpooled.wrappedBuffer(this.case_);
      var1.writerIndex(0);
      return var1;
   }

   public rcd_3 catch_() {
      return this.protected_;
   }

   public boolean case_() {
      return this.private_;
   }

   public int[] implements_() {
      return this.throws_;
   }

   public int protected_() {
      return this.break_;
   }

   public List<rcd_3> private_() {
      return this.catch_;
   }
}
