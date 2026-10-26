package celestial;

import java.io.IOException;
import java.util.Collection;

public class rvF_2 implements ruS_2<At_1> {
   private int id_class;
   private byte id_break;
   private boolean id_byte;
   private boolean id_protected;
   private rrGO[] id_throws;
   private int id_case;
   private int id_catch;
   private int id_private;
   private int id_implements;
   private byte[] id_finally;

   public rvF_2() {
   }

   public rvF_2(int var1, byte var2, boolean var3, boolean var4, Collection<rrGO> var5, byte[] var6, int var7, int var8, int var9, int var10) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5.toArray(new rrGO[var5.size()]);
      this.id_case = var7;
      this.id_catch = var8;
      this.id_private = var9;
      this.id_implements = var10;
      this.id_finally = new byte[var9 * var10];

      for (int var11 = 0; var11 < var9; var11++) {
         for (int var12 = 0; var12 < var10; var12++) {
            this.id_finally[var11 + var12 * var9] = var6[var7 + var11 + (var8 + var12) * 128];
         }
      }
   }

   public void id_class(rrGb_1 var1) {
      var1.id_case = this.id_break;
      var1.id_protected = this.id_byte;
      var1.id_private = this.id_protected;
      var1.id_finally.clear();

      for (int var2 = 0; var2 < this.id_throws.length; var2++) {
         rrGO var3 = this.id_throws[var2];
         var1.id_finally.put("icon-" + var2, var3);
      }

      for (int var4 = 0; var4 < this.id_private; var4++) {
         for (int var5 = 0; var5 < this.id_implements; var5++) {
            var1.id_catch[this.id_case + var4 + (this.id_catch + var5) * 128] = this.id_finally[var4 + var5 * this.id_private];
         }
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.readByte();
      this.id_byte = var1.readBoolean();
      this.id_protected = var1.readBoolean();
      this.id_throws = new rrGO[var1.id_case()];

      for (int var2 = 0; var2 < this.id_throws.length; var2++) {
         rrGh_1 var3 = var1.id_class(rrGh_1.class);
         this.id_throws[var2] = new rrGO(var3, var1.readByte(), var1.readByte(), (byte)(var1.readByte() & 15), var1.readBoolean() ? var1.id_throws() : null);
      }

      this.id_private = var1.readUnsignedByte();
      if (this.id_private > 0) {
         this.id_implements = var1.readUnsignedByte();
         this.id_case = var1.readUnsignedByte();
         this.id_catch = var1.readUnsignedByte();
         this.id_finally = var1.id_class();
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.writeByte(this.id_break);
      var1.writeBoolean(this.id_byte);
      var1.writeBoolean(this.id_protected);
      var1.id_protected(this.id_throws.length);

      for (rrGO var5 : this.id_throws) {
         var1.id_class(var5.id_break());
         var1.writeByte(var5.id_byte());
         var1.writeByte(var5.id_protected());
         var1.writeByte(var5.id_throws() & 15);
         if (var5.id_catch() != null) {
            var1.writeBoolean(true);
            var1.id_class(var5.id_catch());
         } else {
            var1.writeBoolean(false);
         }
      }

      var1.writeByte(this.id_private);
      if (this.id_private > 0) {
         var1.writeByte(this.id_implements);
         var1.writeByte(this.id_case);
         var1.writeByte(this.id_catch);
         var1.id_class(this.id_finally);
      }
   }

   public int id_break() {
      return this.id_class;
   }
}
