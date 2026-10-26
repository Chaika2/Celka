package celestial;

import java.io.IOException;

public class rvJ_2 implements ruS_2<At_1> {
   protected int id_class;
   protected short id_break;
   protected short id_byte;
   protected short id_protected;
   protected byte id_throws;
   protected byte id_case;
   protected boolean id_catch;
   protected boolean id_private;
   protected boolean id_implements;

   public byte id_byte() {
      return this.id_case;
   }

   public rvJ_2() {
   }

   public rvJ_2(int var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return "Entity_" + super.toString();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   public an_3 id_class(rYB var1) {
      return var1.id_break(this.id_class);
   }

   public static long id_class(double var0) {
      return rfU_2.id_protected(var0 * 4096.0);
   }

   public rjU_2 id_class(rjU_2 var1) {
      double var2 = this.id_break == 0 ? var1.id_break : id_class(id_class(var1.id_break) + (long)this.id_break);
      double var4 = this.id_byte == 0 ? var1.id_byte : id_class(id_class(var1.id_byte) + (long)this.id_byte);
      double var6 = this.id_protected == 0 ? var1.id_protected : id_class(id_class(var1.id_protected) + (long)this.id_protected);
      return new rjU_2(var2, var4, var6);
   }

   public static rjU_2 id_class(long var0, long var2, long var4) {
      return new rjU_2((double)var0, (double)var2, (double)var4).id_class(2.4414062E-4F);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
   }

   public static double id_class(long var0) {
      return (double)var0 / 4096.0;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
   }

   public byte id_break() {
      return this.id_throws;
   }

   public boolean id_throws() {
      return this.id_implements;
   }

   public boolean id_case() {
      return this.id_catch;
   }

   public boolean id_protected() {
      return this.id_private;
   }
}
