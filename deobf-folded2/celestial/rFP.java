package celestial;

import java.io.IOException;
import java.util.function.Supplier;

public class rFP implements ruS_2<At_1> {
   private rRJ id_class;
   private rqM_2<rYB> id_break;
   private long id_byte;
   private rRl_1 id_protected;
   private rRl_1 id_throws;
   private boolean id_case;
   private boolean id_catch;
   private boolean id_private;

   public rqM_2<rYB> id_byte() {
      return this.id_break;
   }

   public rFP() {
   }

   public rFP(rRJ var1, rqM_2<rYB> var2, long var3, rRl_1 var5, rRl_1 var6, boolean var7, boolean var8, boolean var9) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var5;
      this.id_throws = var6;
      this.id_case = var7;
      this.id_catch = var8;
      this.id_private = var9;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.<Supplier<rRJ>>id_class(rRJ.id_final).get();
      this.id_break = rqM_2.id_class(rVL.id_static, var1.id_volatile());
      this.id_byte = var1.readLong();
      this.id_protected = rRl_1.id_class(var1.readUnsignedByte());
      this.id_throws = rRl_1.id_class(var1.readUnsignedByte());
      this.id_case = var1.readBoolean();
      this.id_catch = var1.readBoolean();
      this.id_private = var1.readBoolean();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   public rRJ id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(rRJ.id_final, () -> this.id_class);
      var1.id_class(this.id_break.id_class());
      var1.writeLong(this.id_byte);
      var1.writeByte(this.id_protected.id_class());
      var1.writeByte(this.id_throws.id_class());
      var1.writeBoolean(this.id_case);
      var1.writeBoolean(this.id_catch);
      var1.writeBoolean(this.id_private);
   }

   public rRl_1 id_throws() {
      return this.id_protected;
   }

   public boolean id_catch() {
      return this.id_case;
   }

   public rRl_1 id_case() {
      return this.id_throws;
   }

   public boolean id_implements() {
      return this.id_private;
   }

   public long id_protected() {
      return this.id_byte;
   }

   public boolean id_private() {
      return this.id_catch;
   }
}
