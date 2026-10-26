package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rch_3 extends rcK_2 {
   public static final rcv_3<rch_3> id_class = new rcX_2();
   public static final rch_3 id_break = id_class((byte)0);
   public static final rch_3 id_byte = id_class((byte)1);
   private final byte id_private;

   rch_3(byte var1) {
      this.id_private = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rch_3 && this.id_private == ((rch_3)var1).id_private;
   }

   @Override
   public String toString() {
      return this.id_private + "b";
   }

   @Override
   public int hashCode() {
      return this.id_private;
   }

   public static rch_3 id_class(byte var0) {
      return rcJ_2.id_class[128 + var0];
   }

   public static rch_3 id_class(boolean var0) {
      return var0 ? id_byte : id_break;
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      rVi_1 var3 = new rgN_2("b").id_class(id_catch);
      return new rgN_2(String.valueOf(this.id_private)).id_class(var3).id_class(id_case);
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      var1.writeByte(this.id_private);
   }

   @Override
   public byte id_class() {
      return 1;
   }

   @Override
   public rcv_3<rch_3> id_break() {
      return id_class;
   }

   @Override
   public long id_throws() {
      return (long)this.id_private;
   }

   @Override
   public float id_finally() {
      return (float)this.id_private;
   }

   @Override
   public short id_catch() {
      return (short)this.id_private;
   }

   @Override
   public Number id_extends() {
      return this.id_private;
   }

   @Override
   public int id_case() {
      return this.id_private;
   }

   @Override
   public double id_implements() {
      return (double)this.id_private;
   }

   public rch_3 id_protected() {
      return this;
   }

   @Override
   public byte id_private() {
      return this.id_private;
   }
}
