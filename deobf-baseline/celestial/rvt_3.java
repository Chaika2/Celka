package celestial;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class rvt_3 implements ruS_2<At_1> {
   private rqA_2 id_class;
   private rqL_2 id_break;
   private int id_byte;
   private int id_protected;
   private int id_throws;
   private float id_case;
   private float id_catch;

   public rqL_2 id_byte() {
      return this.id_break;
   }

   public rvt_3() {
   }

   public rvt_3(rqA_2 var1, rqL_2 var2, double var3, double var5, double var7, float var9, float var10) {
      Validate.notNull(var1, "sound", new Object[0]);
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = (int)(var3 * 8.0);
      this.id_protected = (int)(var5 * 8.0);
      this.id_throws = (int)(var7 * 8.0);
      this.id_case = var9;
      this.id_catch = var10;
   }

   public void id_class(rqA_2 var1) {
      this.id_class = var1;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = rVL.id_short.id_class(var1.id_case());
      this.id_break = var1.id_class(rqL_2.class);
      this.id_byte = var1.readInt();
      this.id_protected = var1.readInt();
      this.id_throws = var1.readInt();
      this.id_case = var1.readFloat();
      this.id_catch = var1.readFloat();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(rVL.id_short.id_class(this.id_class));
      var1.id_class(this.id_break);
      var1.writeInt(this.id_byte);
      var1.writeInt(this.id_protected);
      var1.writeInt(this.id_throws);
      var1.writeFloat(this.id_case);
      var1.writeFloat(this.id_catch);
   }

   public rqA_2 id_break() {
      return this.id_class;
   }

   public double id_throws() {
      return (double)((float)this.id_protected / 8.0F);
   }

   public float id_catch() {
      return this.id_case;
   }

   public double id_case() {
      return (double)((float)this.id_throws / 8.0F);
   }

   public double id_protected() {
      return (double)((float)this.id_byte / 8.0F);
   }

   public float id_private() {
      return this.id_catch;
   }
}
