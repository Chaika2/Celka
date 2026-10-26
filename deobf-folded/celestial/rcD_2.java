package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rcD_2 extends rcK_2 {
   public static final rcv_3<rcD_2> id_class = new rcU_2();
   private final short id_break;

   rcD_2(short var1) {
      this.id_break = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcD_2 && this.id_break == ((rcD_2)var1).id_break;
   }

   @Override
   public String toString() {
      return this.id_break + "s";
   }

   @Override
   public int hashCode() {
      return this.id_break;
   }

   public static rcD_2 id_class(short var0) {
      return var0 >= -128 && var0 <= 1024 ? rce_3.id_class[var0 + 128] : new rcD_2(var0);
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      var1.writeShort(this.id_break);
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      rVi_1 var3 = new rgN_2("s").id_class(id_catch);
      return new rgN_2(String.valueOf(this.id_break)).id_class(var3).id_class(id_case);
   }

   @Override
   public byte id_class() {
      return 2;
   }

   @Override
   public rcv_3<rcD_2> id_break() {
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
      return this.id_break;
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

   public rcD_2 id_protected() {
      return this;
   }

   @Override
   public byte id_private() {
      return (byte)(this.id_break & 255);
   }
}
