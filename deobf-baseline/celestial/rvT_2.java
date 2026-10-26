package celestial;

import java.io.IOException;

public class rvT_2 implements ruS_2<At_1> {
   private int id_class;
   private byte id_break;
   private byte id_byte;
   private int id_protected;
   private byte id_throws;

   public int id_byte() {
      return this.id_class;
   }

   public rvT_2() {
   }

   public rvT_2(int var1, rLY var2) {
      this.id_class = var1;
      this.id_break = (byte)(rLR.id_class(var2.id_class()) & 0xFF);
      this.id_byte = (byte)(var2.id_byte() & 0xFF);
      if (var2.id_break() > 32767) {
         this.id_protected = 32767;
      } else {
         this.id_protected = var2.id_break();
      }

      this.id_throws = 0;
      if (var2.id_protected()) {
         this.id_throws = (byte)(this.id_throws | 1);
      }

      if (var2.id_throws()) {
         this.id_throws = (byte)(this.id_throws | 2);
      }

      if (var2.id_case()) {
         this.id_throws = (byte)(this.id_throws | 4);
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.readByte();
      this.id_byte = var1.readByte();
      this.id_protected = var1.id_case();
      this.id_throws = var1.readByte();
   }

   public boolean id_break() {
      return this.id_protected == 32767;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.writeByte(this.id_break);
      var1.writeByte(this.id_byte);
      var1.id_protected(this.id_protected);
      var1.writeByte(this.id_throws);
   }

   public byte id_throws() {
      return this.id_byte;
   }

   public boolean id_catch() {
      return (this.id_throws & 2) == 2;
   }

   public int id_case() {
      return this.id_protected;
   }

   public boolean id_implements() {
      return (this.id_throws & 4) == 4;
   }

   public byte id_protected() {
      return this.id_break;
   }

   public boolean id_private() {
      return (this.id_throws & 1) == 1;
   }
}
