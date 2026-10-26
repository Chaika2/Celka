package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rcn_3 extends rcK_2 {
   public static final rcv_3<rcn_3> id_class = new rcC_2();
   private final int id_break;

   rcn_3(int var1) {
      this.id_break = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcn_3 && this.id_break == ((rcn_3)var1).id_break;
   }

   @Override
   public String toString() {
      return String.valueOf(this.id_break);
   }

   @Override
   public int hashCode() {
      return this.id_break;
   }

   public static rcn_3 id_class(int var0) {
      return var0 >= -128 && var0 <= 1024 ? rcl_3.id_class[var0 + 128] : new rcn_3(var0);
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      var1.writeInt(this.id_break);
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      return new rgN_2(String.valueOf(this.id_break)).id_class(id_case);
   }

   @Override
   public byte id_class() {
      return 3;
   }

   @Override
   public rcv_3<rcn_3> id_break() {
      return id_class;
   }

   @Override
   public long id_throws() {
      return (long)this.id_break;
   }

   @Override
   public float id_finally() {
      return (float)this.id_break;
   }

   @Override
   public short id_catch() {
      return (short)(this.id_break & 65535);
   }

   @Override
   public Number id_extends() {
      return this.id_break;
   }

   @Override
   public int id_case() {
      return this.id_break;
   }

   @Override
   public double id_implements() {
      return (double)this.id_break;
   }

   public rcn_3 id_protected() {
      return this;
   }

   @Override
   public byte id_private() {
      return (byte)(this.id_break & 0xFF);
   }
}
