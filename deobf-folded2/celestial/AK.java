package celestial;

public class AK extends lO_2 {
   private final float id_class;
   private final float id_break;

   @Override
   protected float id_byte() {
      return this.id_instanceof.id_class((double)(this.id_class / 4.0F * 16.0F));
   }

   AK(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, rdn_3 var14) {
      this(var1, var2, var4, var6, var14);
      this.id_finally *= 0.1F;
      this.id_extends *= 0.1F;
      this.id_native *= 0.1F;
      this.id_finally += var8;
      this.id_extends += var10;
      this.id_native += var12;
   }

   protected AK(gm_3 var1, double var2, double var4, double var6, rdn_3 var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.id_class(QY.id_instanceof().id_float().id_class(var8, var1, (iB_2)null).id_throws());
      this.id_else = 1.0F;
      this.id_throw /= 2.0F;
      this.id_class = this.id_continue.nextFloat() * 3.0F;
      this.id_break = this.id_continue.nextFloat() * 3.0F;
   }

   @Override
   public CJ id_class() {
      return CJ.id_class;
   }

   @Override
   protected float id_break() {
      return this.id_instanceof.id_class((double)((this.id_class + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   protected float id_throws() {
      return this.id_instanceof.id_break((double)((this.id_break + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   protected float id_protected() {
      return this.id_instanceof.id_break((double)(this.id_break / 4.0F * 16.0F));
   }
}
