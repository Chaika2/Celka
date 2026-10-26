package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rct_3 extends rcK_2 {
   public static final rcv_3<rct_3> id_class = new rcw_3();
   private final long id_break;

   rct_3(long var1) {
      this.id_break = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rct_3 && this.id_break == ((rct_3)var1).id_break;
   }

   @Override
   public String toString() {
      return this.id_break + "L";
   }

   @Override
   public int hashCode() {
      return (int)(this.id_break ^ this.id_break >>> 32);
   }

   public static rct_3 id_class(long var0) {
      return var0 >= -128L && var0 <= 1024L ? rcI_2.id_class[(int)var0 + 128] : new rct_3(var0);
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      var1.writeLong(this.id_break);
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      rVi_1 var3 = new rgN_2("L").id_class(id_catch);
      return new rgN_2(String.valueOf(this.id_break)).id_class(var3).id_class(id_case);
   }

   @Override
   public byte id_class() {
      return 4;
   }

   @Override
   public rcv_3<rct_3> id_break() {
      return id_class;
   }

   @Override
   public long id_throws() {
      return this.id_break;
   }

   @Override
   public float id_finally() {
      return (float)this.id_break;
   }

   @Override
   public short id_catch() {
      return (short)((int)(this.id_break & 65535L));
   }

   @Override
   public Number id_extends() {
      return this.id_break;
   }

   @Override
   public int id_case() {
      return (int)(this.id_break & -1L);
   }

   @Override
   public double id_implements() {
      return (double)this.id_break;
   }

   public rct_3 id_protected() {
      return this;
   }

   @Override
   public byte id_private() {
      return (byte)((int)(this.id_break & 255L));
   }
}
